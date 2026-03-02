import java.util.List;

public abstract class lh extends tk {
    final lf a;
    private final lg e;

    protected lh(la la0) {
        lg lg0 = new lg(this);
        this.e = lg0;
        lf lf0 = new lf(new lj(this), la0);
        this.a = lf0;
        lf0.b(lg0);
    }

    protected lh(lp lp0) {
        lg lg0 = new lg(this);
        this.e = lg0;
        lf lf0 = new lf(new lj(this), new kz(lp0).a());
        this.a = lf0;
        lf0.b(lg0);
    }

    @Override  // tk
    public int b() {
        return this.a.e.size();
    }

    public Object c(int v) {
        return this.a.e.get(v);
    }

    public final List d() {
        return this.a.e;
    }

    public void e(List list0, List list1) {
    }

    public void jQ(List list0) {
        this.a.a(list0);
    }
}

