import com.google.android.libraries.commerce.hce.common.SmartTapStatusWord;

public final class dvog {
    static final ggeo a;
    public final fgxr b;
    public final dvnv c;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(fgyv.b, haoz.b);
        ggek0.i(fgyv.e, haoz.b);
        ggek0.i(fgyv.c, haoz.n);
        ggek0.i(fgyv.g, haoz.k);
        ggek0.i(fgyv.d, haoz.m);
        ggek0.i(fgyv.f, haoz.l);
        ggek0.i(fgyv.a, haoz.a);
        dvog.a = ggek0.b();
    }

    public dvog(fgxr fgxr0, dvnv dvnv0) {
        this.b = fgxr0;
        this.c = dvnv0;
    }

    public final dvob a(haoz haoz0, fgzl fgzl0) {
        gfsx gfsx0 = this.b.b;
        gfsx gfsx1 = this.b.c;
        gfsx gfsx2 = this.b.d;
        dvob dvob0 = new dvob(haoz0, null, null, dvob.a, fgyf.a(fgzl0, ((Short)gfsx0.f(Short.valueOf(((short)0)))).shortValue()), gfsx1, gfsx0, gfsx2, false, false);
        switch(new SmartTapStatusWord(fgzl0).b()[0] & 0xFF) {
            case 0x92: 
            case 0x94: {
                break;
            }
            default: {
                this.b();
            }
        }
        return dvob0;
    }

    public final void b() {
        this.b.a();
    }
}

