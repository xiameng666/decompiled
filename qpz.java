import java.util.List;

public final class qpz implements qqh {
    public final List a;

    public qpz(List list0) {
        this.a = list0;
    }

    @Override  // qqh
    public final qmq a() {
        List list0 = this.a;
        return ((qtz)list0.get(0)).f() ? new qnb(list0) : new qna(list0);
    }

    @Override  // qqh
    public final List b() {
        return this.a;
    }

    @Override  // qqh
    public final boolean c() {
        return this.a.size() == 1 && ((qtz)this.a.get(0)).f();
    }
}

