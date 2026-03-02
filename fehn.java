public final class fehn implements glzn {
    public final fesc a;

    public fehn(fesc fesc0) {
        this.a = fesc0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v = (int)(((Integer)object0));
        ffmn.a("OffloadSetupServerMgr", "Sending the OffloadConnectionSetupRequest", new Object[0]);
        fesc fesc0 = this.a;
        feqm feqm0 = (feqm)fesc0.d;
        feow feow0 = (feow)feqm0.k.get();
        if(feow0 != null) {
            return glzd.g(glzd.f(gmbt.h(gmbu.i(feow0)), new fesa(fesc0, v), uqg.b), new fesb(fesc0, v), uqg.b);
        }
        feqm0.b();
        fepv fepv0 = new fepv(feqm0);
        return glzd.g(glzd.f(gmbt.h(feqm0.h.a(fepv0)), new fesa(fesc0, v), uqg.b), new fesb(fesc0, v), uqg.b);
    }
}

