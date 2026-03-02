public final class dvbp implements evqc {
    public final gfsx a;

    public dvbp(gfsx gfsx0) {
        this.a = gfsx0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dvcl.a.j(), "Failed to toggle activity history switch off", exception0);
        gfsx gfsx0 = this.a;
        if(gfsx0.i()) {
            ((fshh)gfsx0.d()).g();
        }
    }
}

