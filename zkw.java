import java.util.List;

public final class zkw implements zkl {
    public final omn a;
    public final oko b;

    public zkw(omn omn0) {
        this.a = omn0;
        this.b = new zkt(this);
        new zku(this);
        new zkv(this);
    }

    @Override  // zkl
    public final zkx a(String s, String s1, grxw grxw0, boolean z, String s2, int v) {
        zko zko0 = new zko(s, s1, grxw0, z, s2, v);
        return (zkx)oqj.b(this.a, true, false, zko0);
    }

    @Override  // zkl
    public final List b() {
        zkr zkr0 = new zkr();
        return (List)oqj.b(this.a, true, false, zkr0);
    }

    @Override  // zkl
    public final void c() {
        zkq zkq0 = new zkq();
        oqj.b(this.a, false, true, zkq0);
    }

    @Override  // zkl
    public final void d(String s, grxw grxw0) {
        zkn zkn0 = new zkn(s, grxw0);
        oqj.b(this.a, false, true, zkn0);
    }

    @Override  // zkl
    public final void e(List list0) {
        zkm zkm0 = new zkm(this, list0);
        oqj.b(this.a, false, true, zkm0);
    }
}

