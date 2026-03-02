public final class bcsl {
    public static final int[] a;

    static {
        bcsl.a = new int[]{1, 2, 3, 6, 7, 8, 9, 10, 14, 15, 17, 18, 20, 24, 25, 26, 27, 0x1F, 55, 36, 43, 45, 46, 0x30, 52, 57, 59, 60, 10000, 10001, 10002, 10003, 10004, 10005, 10007, 39, 37, 38, 67, 74};
    }

    public static hete a(int v) {
        hete hete0 = hete.b(v);
        return hete0 == null ? hete.a : hete0;
    }

    public static boolean b(int v) {
        int[] arr_v = bcsl.a;
        for(int v1 = 0; v1 < 40; ++v1) {
            if(v == arr_v[v1]) {
                return true;
            }
        }
        return false;
    }
}

