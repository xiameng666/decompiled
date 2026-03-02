public abstract class czth extends czlg {
    public czth(String s, boolean z) {
        super(s, (z ? 3 : 2), 1, -1, 0);
    }

    public czth(String s, boolean z, int v) {
        super(s, (z ? 3 : 2), 1, -1, v);
    }

    @Override  // czlg
    public final int a() {
        return 4;
    }

    public abstract String k();

    public abstract String l();

    public abstract void m(String arg1);

    public abstract void n(byte[] arg1);

    public abstract byte[] o();

    public int p() {
        return (int)hvog.i();
    }

    public final boolean q() {
        int v = this.f;
        if(v != 0) {
            return v == 3;
        }
        throw null;
    }
}

