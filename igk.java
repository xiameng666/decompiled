import java.util.Map;

public final class igk implements iav {
    final int a;
    final int b;
    final Map c;
    final ibts d;
    final ibts e;
    final igl f;

    public igk(int v, int v1, Map map0, ibts ibts0, ibts ibts1, igl igl0) {
        this.a = v;
        this.b = v1;
        this.c = map0;
        this.d = ibts0;
        this.e = ibts1;
        this.f = igl0;
        super();
    }

    @Override  // iav
    public final int a() {
        return this.b;
    }

    @Override  // iav
    public final int b() {
        return this.a;
    }

    @Override  // iav
    public final Map e() {
        return this.c;
    }

    @Override  // iav
    public final ibts f() {
        return this.d;
    }

    @Override  // iav
    public final void g() {
        this.e.a(this.f.m);
    }
}

