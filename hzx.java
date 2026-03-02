import java.util.Map;

public final class hzx implements iav {
    final int a;
    final int b;
    final Map c;
    final ibts d;
    final hzy e;
    final iag f;
    final ibts g;

    public hzx(int v, int v1, Map map0, ibts ibts0, hzy hzy0, iag iag0, ibts ibts1) {
        this.a = v;
        this.b = v1;
        this.c = map0;
        this.d = ibts0;
        this.e = hzy0;
        this.f = iag0;
        this.g = ibts1;
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
        if(this.e.ep()) {
            igm igm0 = ((ife)this.f.a.r()).g;
            if(igm0 != null) {
                this.g.a(igm0.m);
                return;
            }
        }
        this.g.a(this.f.a.r().m);
    }
}

