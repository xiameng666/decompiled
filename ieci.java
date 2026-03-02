public abstract class ieci implements iect {
    @Override  // iect
    public final int f() {
        return this.a();
    }

    @Override  // iect
    public final int g(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2) {
        int v3 = this.a();
        int v4 = v1 * v3;
        if(arr_b == arr_b1 && iftq.h(v, v4, v2, v4)) {
            arr_b = new byte[v4];
            System.arraycopy(arr_b1, v, arr_b, 0, v4);
            v = 0;
        }
        int v6 = 0;
        for(int v5 = 0; v5 != v1; ++v5) {
            v6 += this.b(arr_b, v, arr_b1, v2 + v6);
            v += v3;
        }
        return v6;
    }
}

