public final class bnpw implements gftc {
    public final String a;

    public bnpw(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return !((String)object0).equals(this.a);
    }
}

