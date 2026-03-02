final class lb extends lm {
    final ld a;

    public lb(ld ld0) {
        this.a = ld0;
        super();
    }

    @Override  // lm
    public final int a() {
        return this.a.b.size();
    }

    @Override  // lm
    public final int b() {
        return this.a.a.size();
    }

    @Override  // lm
    public final Object c(int v, int v1) {
        ld ld0 = this.a;
        Object object0 = ld0.a.get(v);
        Object object1 = ld0.b.get(v1);
        if(object0 != null && object1 != null) {
            return ld0.d.b.b.a(object0, object1);
        }
        throw new AssertionError();
    }

    @Override  // lm
    public final boolean d(int v, int v1) {
        ld ld0 = this.a;
        Object object0 = ld0.a.get(v);
        Object object1 = ld0.b.get(v1);
        if(object0 != null && object1 != null) {
            return ld0.d.b.b.b(object0, object1);
        }
        if(object0 == null && object1 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override  // lm
    public final boolean e(int v, int v1) {
        Object object0 = this.a.a.get(v);
        Object object1 = this.a.b.get(v1);
        return object0 == null || object1 == null ? object0 == null && object1 == null : this.a.d.b.b.c(object0, object1);
    }
}

