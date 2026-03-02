public abstract class ggtc {
    public static final ggtc c;
    public static final ggtc d;

    static {
        ggtc.c = new ggsy();
        ggtc.d = new ggsy();
    }

    protected abstract void a();

    static ggtc b(ggtc ggtc0, ggtc ggtc1) {
        if(ggtc0 != null) {
            if(ggtc1 == null) {
                return ggtc0;
            }
            ggtc ggtc2 = ggtc.c;
            if(ggtc0 == ggtc2) {
                return ggtc0;
            }
            ggtc ggtc3 = ggtc.d;
            if(ggtc1 == ggtc3) {
                return ggtc0;
            }
            if(ggtc1 != ggtc2 && ggtc0 != ggtc3) {
                return new ggsz(ggtc0, ggtc1);
            }
        }
        return ggtc1;
    }
}

