public abstract class ghdb extends ghcc {
    @Override  // ghcc
    public final int a() {
        return 1;
    }

    @Override  // ghcc
    public final ghdb b(int v) {
        return this;
    }

    public abstract int c(int arg1);

    public abstract int d();

    public abstract int e();

    public abstract boolean f();
}

