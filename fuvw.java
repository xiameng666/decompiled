public final class fuvw {
    public static final ggfp a;
    public final fvto b;
    public int c;
    public int d;
    public int e;

    static {
        fuvw.a = ggfp.O(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(8), Integer.valueOf(17), new Integer[0]);
    }

    public fuvw(fvto fvto0) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.b = fvto0;
    }

    public final boolean a() {
        for(Object object0: this.b.a().values()) {
            fuvx fuvx0 = (fuvx)object0;
            if(fuvx0.b) {
                return Math.min(Math.max(fuvx0.a, 50), 100) > 50;
            }
        }
        return false;
    }
}

