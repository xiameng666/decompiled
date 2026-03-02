public final class gpvs {
    public static final byte a;
    public final int[] b;
    public final double[] c;
    public final byte[] d;
    public final gpvr e;

    static {
        gpvs.a = glxj.a(0xFFL);
    }

    public gpvs(int[] arr_v, double[] arr_f, byte[] arr_b, gpvr gpvr0) {
        this.b = arr_v;
        this.c = arr_f;
        this.d = arr_b;
        this.e = gpvr0;
    }

    public static boolean a(byte[] arr_b) {
        if(arr_b != null && arr_b.length != 0) {
            for(int v = 0; v < arr_b.length; ++v) {
                if(gpvs.b(arr_b[v] & 0xFF)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(int v) {
        return v >= 0 && v < 180;
    }
}

