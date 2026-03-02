public final class hmob extends hmny {
    public hmob() {
        this.c.f = 1;
    }

    @Override  // hmnz
    public final int g() {
        return this.c.f;
    }

    @Override  // hmnz
    public final void m(boolean z, hmno hmno0) {
        if(z) {
            System.arraycopy(this.a, 0, this.c.a, 0, this.c.a.length);
            return;
        }
        System.arraycopy(this.c.a, 0, this.a, 0, this.a.length);
    }
}

