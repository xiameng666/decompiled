public final class dvbx implements evqc {
    public final dvcl a;

    public dvbx(dvcl dvcl0) {
        this.a = dvcl0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(dvcl.a.j(), "Failed to update activity history user setting", exception0);
        if(!hwev.c()) {
            this.a.aw.g();
        }
    }
}

