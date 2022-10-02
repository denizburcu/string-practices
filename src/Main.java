public class Main {
    public static void main(String[] args) {
        String str = "airplane";
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(str.length() - 1));

        String str1 = "book";
        System.out.println(str1.concat(" outhor"));

        String str2 = "library";
        System.out.println(str2 + " card");
        String str3 = "United";
        str3 += " States";
        System.out.println(str3);

        String str4 = "Exit";
        System.out.println(str4.equalsIgnoreCase("Exit"));
        System.out.println(str4.equalsIgnoreCase("tixe"));

        String str5 = "01234567";
        System.out.println(str5.length());
        System.out.println(str5.substring(5));
        System.out.println(str5.substring(3, 7));

        String str6 = "oxoxoxox";
        System.out.println(str6.replace("x", "X"));

        String str7 = "A New Java Book";
        System.out.println(str7.toLowerCase());
        System.out.println(str7.toUpperCase());

        String str8 = " hi ";
        System.out.println(str8 + "str8");
        System.out.println(str8.trim() + "str8");

        String str9 = "Java";
        char [] arrayChar = str9.toCharArray();
        System.out.println(arrayChar.length);

        String str10 = "Java is string programming language";
        System.out.println(str10.contains("Java"));
        System.out.println(str10.contains("int"));







    }


}