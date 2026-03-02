import j..util.Objects;

final class erlj extends ali {
    final erlr a;

    public erlj(erlr erlr0) {
        Objects.requireNonNull(erlr0);
        this.a = erlr0;
        super();
    }

    @Override  // ali
    public final void a(int v, CharSequence charSequence0) {
        erlr.a.f("onAuthenticationError(%d, %s)", new Object[]{v, String.valueOf(charSequence0)});
        this.a.b.C();
    }

    @Override  // ali
    public final void c(alj alj0) {
        int v = alj0.b;
        erlr.a.d("onAuthenticationSucceeded(result type = %d)", new Object[]{v});
        erlr erlr0 = this.a;
        erlp erlp0 = erlr0.c;
        if(erlp0 != null) {
            erlp0.F(erlr.B(v));
            return;
        }
        erlr0.b.E();
    }
}

