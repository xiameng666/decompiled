import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

public final class bvef implements clzh {
    private final String a;
    private final ibth b;
    private final ibtw c;
    private final ibth d;
    private final ibtw e;

    public bvef(String s, String s1, SelectedAccountDisc selectedAccountDisc0) {
        this.a = s;
        this.b = new bveb(s1);
        this.c = new gze(0xC5BFEDD5, true, new bvee(selectedAccountDisc0));
        this.d = new bvec(selectedAccountDisc0);
        this.e = bvca.a;
    }

    @Override  // eotn
    public final String a() {
        return this.a;
    }

    @Override  // eotn
    public final ibth b() {
        return new eotl();
    }

    @Override  // eotn
    public final ibth c() {
        return this.d;
    }

    @Override  // eotn
    public final ibth d() {
        return this.b;
    }

    @Override  // eotn
    public final ibtw e() {
        return this.c;
    }

    @Override  // eotn
    public final ibtw f() {
        return this.e;
    }

    @Override  // clzh
    public final void g() {
    }
}

