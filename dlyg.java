public final class dlyg implements dmba {
    private static final bboh a;
    private final dmcu b;
    private final dlmc c;
    private ftgg d;

    static {
        dlyg.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyg(dmcu dmcu0, dlmc dlmc0) {
        this.b = dmcu0;
        this.c = dlmc0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 15, "cannot evaluate: does not have gmail imported count filter");
        if(!this.b()) {
            hjtn hjtn0 = hjwe0.b == 15 ? ((hjtn)hjwe0.c) : hjtn.a;
            gfsx gfsx0 = this.b.a();
            if(gfsx0.i()) {
                if((hjtn0.b & 2) != 0 && ((int)(((Integer)gfsx0.d()))) > (hjtn0.d == null ? hftw.a : hjtn0.d).b) {
                    return false;
                }
                return (hjtn0.b & 1) == 0 ? true : ((int)(((Integer)gfsx0.d()))) >= (hjtn0.c == null ? hftw.a : hjtn0.c).b;
            }
            ((ggtj)dlyg.a.h()).x("Unable to retrieve gmail imported valuables count, not showing the bulletin");
            return false;
        }
        ((ggtj)dlyg.a.h()).B("Gmail Import setting disabled in legacy app, skipping %s", hjrn0.e);
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

