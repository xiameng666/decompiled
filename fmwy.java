public final class fmwy implements gfsi {
    public final fmxb a;

    public fmwy(fmxb fmxb0) {
        this.a = fmxb0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((fmga)object0).k.a().ordinal();
        fmxb fmxb0 = this.a;
        switch(v) {
            case 0: {
                if(fmxb.b(((fmga)object0)) && (!fmxb0.a.containsKey(fmxd.c) || !((fmwu)fmxb0.a.get(fmxd.c)).f(((fmga)object0)))) {
                    fmfm fmfm0 = new fmfm(((fmga)object0));
                    fmfm0.s(((String)((fmga)object0).e.f("")));
                    fmfm0.c(0xC0);
                    return fmfm0.a();
                }
                break;
            }
            case 1: {
                if(!fmxb0.a.containsKey(fmxd.d) || !((fmwu)fmxb0.a.get(fmxd.d)).f(((fmga)object0))) {
                    fmfm fmfm1 = new fmfm(((fmga)object0));
                    fmfm1.s(((String)((fmga)object0).e.f("")));
                    fmfm1.p();
                    fmfm1.c(0xC0);
                    return fmfm1.a();
                }
                break;
            }
            default: {
                return (fmga)object0;
            }
        }
        return (fmga)object0;
    }
}

