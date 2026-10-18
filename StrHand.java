class StrHand{
    public static void main(String[] args) {
        String s = "SYIT";

        System.out.println("Length = " + s.length());
        System.out.println("To check empty = " + s.isEmpty());
        System.out.println("To display specific character = " + s.charAt(1));
        System.out.println("To check equal ignoring case = "
                + s.equalsIgnoreCase("syit"));
        System.out.println("To check equal = " + s.equals("SYIT"));
        System.out.println("SYIT contains IT = " + s.contains("IT"));
        System.out.println("First occurrence of S = " + s.indexOf("S"));
        System.out.println("Last occurrence of S = " + s.lastIndexOf("S"));
        System.out.println("String starts with S = " + s.startsWith("S"));
        System.out.println("String ends with T = " + s.endsWith("T"));
        System.out.println("String uppercase = " + s.toUpperCase());
        System.out.println("String lowercase = " + s.toLowerCase());
        System.out.println("Change SYIT to TYIT = " + s.replace("S", "T"));
        System.out.println("To add = " + s.concat(" New"));
    }
}
