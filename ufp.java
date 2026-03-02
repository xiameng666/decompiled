public final class ufp {
    private final uql a;
    private final kav b;

    public ufp() {
        this.a = new uql(1000L);
        this.b = uqy.a(10, new ufn(this));
    }

    public final String a(uay uay0) {
        String s;
        synchronized(this.a) {
            s = (String)this.a.g(uay0);
        }
        if(s == null) {
            ufo ufo0 = (ufo)this.b.a();
            uqo.f(ufo0);
            try {
                uay0.a(ufo0.a);
                byte[] arr_b = ufo0.a.digest();
                char[] arr_c = uqq.b;
                synchronized(arr_c) {
                    for(int v3 = 0; v3 < arr_b.length; ++v3) {
                        int v4 = arr_b[v3];
                        int v5 = v3 + v3;
                        arr_c[v5] = uqq.a[(v4 & 0xFF) >>> 4];
                        arr_c[v5 + 1] = uqq.a[v4 & 15];
                    }
                    s = new String(arr_c);
                }
            }
            finally {
                this.b.b(ufo0);
            }
        }
        synchronized(this.a) {
            this.a.h(uay0, s);
        }
        return s;
    }
}

