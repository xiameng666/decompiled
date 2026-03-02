public abstract class iatt implements ibdc {
    protected final void a(int v) {
        if(this.f() >= v) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override  // ibdc
    public void b() {
    }

    @Override  // ibdc
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override  // ibdc
    public void close() {
    }

    @Override  // ibdc
    public boolean d() {
        return false;
    }
}

