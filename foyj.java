public final class foyj implements glzm {
    public final foyn a;
    public final String b;
    public final String c;
    public final int d;

    public foyj(foyn foyn0, int v, String s, String s1) {
        this.a = foyn0;
        this.d = v;
        this.b = s;
        this.c = s1;
    }

    @Override  // glzm
    public final gmcd a() {
        long v1;
        foyn foyn0 = this.a;
        foxy foxy0 = (foxy)foyn0.b.get();
        int v = this.d;
        String s = this.b;
        if(v == 1) {
            v1 = foyn0.c.a(s);
        }
        else if(!foxy0.b()) {
            v1 = -1L;
        }
        else {
            v1 = 1000L;
        }
        if(v1 == -1L) {
            return gmbx.a;
        }
        gmbt gmbt0 = gmbt.h(gmbu.i(null));
        foyl foyl0 = new foyl();
        return glzd.g(glyi.f(gmbt0, RuntimeException.class, foyl0, foyn0.a), new foym(foyn0, s, v1, v, this.c), foyn0.a);
    }
}

