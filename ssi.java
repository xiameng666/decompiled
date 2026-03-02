public class ssi {
    public final byte[] a;

    public ssi(byte[] arr_b) {
        this.a = stm.a(arr_b);
    }

    public byte[] g() {
        return stm.a(this.a);
    }

    public final int j() {
        return this.a.length;
    }

    public final boolean k() {
        return stn.e(this.a[0], ((byte)2));
    }

    public final boolean l(int v) {
        return ssi.m(this.a, v);
    }

    static boolean m(byte[] arr_b, int v) {
        return stn.e(arr_b[0], ((byte)4)) && stn.e(arr_b[1], v);
    }

    public final int n() {
        return ssi.o(this.a);
    }

    public static int o(byte[] arr_b) {
        if(stn.e(arr_b[0], ((byte)0))) {
            return 1;
        }
        if(ssi.m(arr_b, 1)) {
            return 3;
        }
        return ssi.m(arr_b, 5) ? 4 : 2;
    }

    public final void p() {
        int v = this.a[0];
    }
}

