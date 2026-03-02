public final class bnpx implements gftc {
    public final String a;

    public bnpx(String s) {
        this.a = s;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return !((String)object0).equals(this.a);
    }
}

