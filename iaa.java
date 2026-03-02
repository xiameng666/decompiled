import java.util.Map;

public final class iaa implements iav {
    final iag a;
    final int b;
    final iav c;
    private final iav d;

    public iaa(iav iav0, iag iag0, int v, iav iav1) {
        this.a = iag0;
        this.b = v;
        this.c = iav1;
        super();
        this.d = iav0;
    }

    @Override  // iav
    public final int a() {
        return this.d.a();
    }

    @Override  // iav
    public final int b() {
        return this.d.b();
    }

    @Override  // iav
    public final Map e() {
        return this.d.e();
    }

    @Override  // iav
    public final ibts f() {
        return this.d.f();
    }

    @Override  // iav
    public final void g() {
        iag iag0 = this.a;
        iag0.d = this.b;
        this.c.g();
        if(iag0.a.i == null) {
            iag0.i(iag0.d);
        }
    }
}

