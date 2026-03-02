abstract class ggbp extends ggem {
    private final int a;

    public ggbp(int v) {
        this.a = v;
    }

    public abstract ggeo a();

    public abstract Object b(int arg1);

    @Override  // ggem
    public final ggfp d() {
        int v = ((ggnf)this.a()).d;
        return this.a == v ? this.a().w() : new gges(this);
    }

    @Override  // ggem
    public final ggqj e() {
        return new ggbo(this);
    }

    @Override  // ggeo
    public final Object get(Object object0) {
        Integer integer0 = (Integer)this.a().get(object0);
        return integer0 == null ? null : this.b(integer0.intValue());
    }

    @Override
    public final int size() {
        return this.a;
    }

    @Override  // ggem
    public Object writeReplace() {
        return super.writeReplace();
    }
}

