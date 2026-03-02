public final class fcrg implements gftc {
    public final String a;

    public fcrg(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        fcrl.a.n("Failed operation: %s, retrying.", ((Exception)object0), new Object[]{this.a});
        return true;
    }
}

