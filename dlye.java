public final class dlye implements dmba {
    private static final bboh a;
    private final dmcu b;
    private final dlmc c;
    private ftgg d;

    static {
        dlye.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlye(dmcu dmcu0, dlmc dlmc0) {
        this.b = dmcu0;
        this.c = dlmc0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 46, "cannot evaluate: does not have gmail imported count filter");
        if(!this.b()) {
            hjtm hjtm0 = hjwe0.b == 46 ? ((hjtm)hjwe0.c) : hjtm.a;
            gfsx gfsx0 = this.b.b();
            if(gfsx0.i()) {
                if((hjtm0.b & 2) != 0 && ((int)(((Integer)gfsx0.d()))) > (hjtm0.d == null ? hftw.a : hjtm0.d).b) {
                    return false;
                }
                return (hjtm0.b & 1) == 0 ? true : ((int)(((Integer)gfsx0.d()))) >= (hjtm0.c == null ? hftw.a : hjtm0.c).b;
            }
            ((ggtj)dlye.a.h()).x("Unable to retrieve gmail imported valuables count, not showing the bulletin");
            return false;
        }
        ((ggtj)dlye.a.h()).B("Gmail Import setting disabled in legacy app, skipping %s", hjrn0.e);
        return false;
    }

    private final boolean b() {
        boolean z;
        synchronized(this) {
            if(this.d == null) {
                this.d = this.c.b();
            }
            ftgg ftgg0 = this.d;
            int v1 = ftgg0.k;
            ftgf ftgf0 = ftgf.d;
            z = true;
            if((ftgf.b(v1) == null ? ftgf.e : ftgf.b(v1)) != ftgf0) {
                if((ftgf.b(v1) == null ? ftgf.e : ftgf.b(v1)) == ftgf.c) {
                    z = false;
                }
                else if((ftgf.b(ftgg0.f) == null ? ftgf.e : ftgf.b(ftgg0.f)) != ftgf0) {
                    return false;
                }
            }
        }
        return z;
    }
}

