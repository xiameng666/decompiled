public final class aubr implements Runnable {
    public final aucd a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public aubr(aucd aucd0, String s, String s1, String s2, long v) {
        this.a = aucd0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = v;
    }

    @Override
    public final void run() {
        aucd aucd0 = this.a;
        String s = this.b;
        String s1 = this.c;
        long v = this.e;
        if(!aucd0.T.h(s, s1, this.d, v)) {
            aubj aubj0 = aucd0.O;
            if(aubj0 != null) {
                aubj0.e.m(s1, v, 2007);
            }
            aucd0.X(gkfu.d, gehk.a, s.length());
        }
        aucd0.H();
    }
}

