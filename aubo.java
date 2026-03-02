public final class aubo implements Runnable {
    public final aucd a;
    public final byte[] b;
    public final String c;
    public final String d;
    public final long e;

    public aubo(aucd aucd0, byte[] arr_b, String s, String s1, long v) {
        this.a = aucd0;
        this.b = arr_b;
        this.c = s;
        this.d = s1;
        this.e = v;
    }

    @Override
    public final void run() {
        aucd aucd0 = this.a;
        byte[] arr_b = this.b;
        String s = this.c;
        long v = this.e;
        if(!aucd0.T.g(arr_b, s, this.d, v)) {
            aubj aubj0 = aucd0.O;
            if(aubj0 != null) {
                aubj0.e.m(s, v, 2007);
            }
            aucd0.X(gkfu.d, gehk.a, arr_b.length);
        }
        aucd0.H();
    }
}

