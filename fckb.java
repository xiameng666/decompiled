public final class fckb implements gftc {
    public final String a;

    public fckb(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        fckl.a.n("Failed operation: %s, retrying.", ((Exception)object0), new Object[]{this.a});
        return true;
    }
}

