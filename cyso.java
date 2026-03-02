public final class cyso implements gftc {
    public final int a;

    public cyso(int v) {
        this.a = v;
    }

    @Override  // gftc
    public final boolean a(Object object0) {
        return ((cyxd)object0).g.contains(Integer.valueOf(this.a));
    }
}

