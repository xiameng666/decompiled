public final class abtb implements evqc {
    public final abtd a;

    public abtb(abtd abtd0) {
        this.a = abtd0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        a.ae(abtd.a.j(), "Could not get number of local passwords", exception0);
        this.a.e.l(Boolean.valueOf(false));
        this.a.h.l("Any locally saved Chrome password will be deleted");
        Boolean boolean0 = Boolean.valueOf(true);
        this.a.g.l(boolean0);
        this.a.i.l("All your data will be deleted including settings, accounts, databases, and\n<b>any locally saved Chrome passwords</b>");
        this.a.j.l(boolean0);
        this.a.k.l("All your data will be deleted including settings, accounts, databases, and\n<b>any locally saved Chrome passwords</b>");
    }
}

