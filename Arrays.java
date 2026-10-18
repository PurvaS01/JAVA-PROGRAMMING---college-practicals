class Arrays {
    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 13;
        a[1] = 12;
        a[2] = 14;
        a[3] = 15;
        a[4] = 16;

        System.out.println("Third element = " + a[2]);
        System.out.println("Array length = " + a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int value : a) {
            System.out.println(value);
        }
    }
}
