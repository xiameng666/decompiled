import java.util.Map;

public final class ifm implements iav {
    private final iav a;
    private final int b;
    private final int c;

    public ifm(iav iav0, ifn ifn0) {
        this.a = iav0;
        igm igm0 = ifn0.h;
        ibuq.c(igm0);
        this.b = igm0.a;
        igm igm1 = ifn0.h;
        ibuq.c(igm1);
        this.c = igm1.b;
    }

    @Override  // iav
    public final int a() {
        return this.c;
    }

    @Override  // iav
    public final int b() {
        return this.b;
    }

    @Override  // iav
    public final Map e() {
        return this.a.e();
    }

    @Override  // iav
    public final ibts f() {
        return this.a.f();
    }

    @Override  // iav
    public final void g() {
        this.a.g();
    }
}

