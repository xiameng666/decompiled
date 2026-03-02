final class dmaw implements dmba {
    private static final bboh a;
    private final dmcu b;

    static {
        dmaw.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmaw(dmcu dmcu0) {
        this.b = dmcu0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 19, "cannot evaluate: does not have valuable count filter");
        hjwa hjwa0 = hjwe0.b == 19 ? ((hjwa)hjwe0.c) : hjwa.a;
        gfsx gfsx0 = this.b.c();
        if(gfsx0.i()) {
            if((hjwa0.b & 2) != 0 && ((int)(((Integer)gfsx0.d()))) > (hjwa0.d == null ? hftw.a : hjwa0.d).b) {
                return false;
            }
            return (hjwa0.b & 1) == 0 ? true : ((int)(((Integer)gfsx0.d()))) >= (hjwa0.c == null ? hftw.a : hjwa0.c).b;
        }
        ((ggtj)dmaw.a.h()).x("Unable to retrieve valuables count, not showing the bulletin");
        return false;
    }
}

