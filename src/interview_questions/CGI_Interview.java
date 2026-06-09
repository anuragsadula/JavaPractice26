package interview_questions;

public class CGI_Interview {

    public static void main(String[] args){

        String str = "Java is a programming language";

        String reversed = str.chars()
        .mapToObj(c->(char)c)
        .reduce("", (s,c)->c+s,(s1,s2)->s2+s1);

        System.out.println(reversed);
    }
}
