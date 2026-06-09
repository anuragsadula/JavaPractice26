package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class ConsecutiveCharacterFrequencyJava8 {

    // Approach 1: use regex to split into consecutive-character groups, then stream the groups
    public static List<String> consecutiveFrequencyWithRegex(String s) {
        if (s == null || s.isEmpty()) return new ArrayList<>();
        Pattern p = Pattern.compile("(.)\\1*");
        Matcher m = p.matcher(s);
        List<String> groups = new ArrayList<>();
        while (m.find()) {
            String match = m.group();
            groups.add(match.charAt(0) + String.valueOf(match.length()));
        }
        return groups;
    }

    // Approach 2: a Java 8 Stream collector that groups consecutive equal characters
    public static List<String> consecutiveFrequencyWithStream(String s) {
        if (s == null || s.isEmpty()) return new ArrayList<>();

        Collector<Character, Acc, List<String>> collector = Collector.of(
                Acc::new,
                Acc::accept,
                Acc::combine,
                Acc::finish
        );

        return IntStream.range(0, s.length())
                .mapToObj(s::charAt)
                .collect(collector);
    }

    private static class Acc {
        private final List<String> out = new ArrayList<>();
        private char last = 0;
        private int count = 0;

        void accept(Character c) {
            if (count == 0) {
                last = c;
                count = 1;
            } else if (c == last) {
                count++;
            } else {
                out.add(last + String.valueOf(count));
                last = c;
                count = 1;
            }
        }

        Acc combine(Acc o) {
            if (o == null) return this;
            if (this.count == 0) return o;
            if (o.count == 0) return this;

            // this.out contains groups completed before this.last, o.out contains groups completed before o.last
            if (this.last == o.last) {
                // merge the trailing groups
                this.count += o.count;
                this.out.addAll(o.out);
            } else {
                // finalize this trailing group, then append o's finished groups
                this.out.add(this.last + String.valueOf(this.count));
                this.out.addAll(o.out);
                this.last = o.last;
                this.count = o.count;
            }
            return this;
        }

        List<String> finish() {
            if (count > 0) out.add(last + String.valueOf(count));
            return out;
        }
    }

    public static void main(String[] args) {
        String s = "aabbbccdd";

        List<String> r1 = consecutiveFrequencyWithRegex(s);
        List<String> r2 = consecutiveFrequencyWithStream(s);

        System.out.println("Input: " + s);
        System.out.println("Regex approach: " + String.join("", r1));
        System.out.println("Stream approach: " + String.join("", r2));

        // sanity check
        if (!Objects.equals(r1, r2)) {
            System.err.println("Results differ!");
            System.err.println("Regex list: " + r1);
            System.err.println("Stream list: " + r2);
            System.exit(2);
        } else {
            System.out.println("Both approaches agree: " + String.join("", r1));
        }

        // Extra examples
        System.out.println("Example: \"aaabbcaa\" -> " + String.join("", consecutiveFrequencyWithStream("aaabbcaa")));
        System.out.println("Edge cases (empty/null): " + consecutiveFrequencyWithStream(""));
    }
}

