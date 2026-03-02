import j..util.Objects;

final class gari extends ali {
    final garj a;

    public gari(garj garj0) {
        Objects.requireNonNull(garj0);
        this.a = garj0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        garj garj0 = this.a;
        if(garj0.ap) {
            garj0.K(new ganp(ganp.d(v)));
        }
        garj0.ap = false;
    }

    @Override  // ali
    public final void c(alj alj0) {
        ganp ganp0 = new ganp(ganp.e(0));
        this.a.K(ganp0);
        this.a.ap = false;
    }
}

