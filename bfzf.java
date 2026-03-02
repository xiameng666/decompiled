import j..util.Objects;

final class bfzf extends fnjf {
    final bfzg a;

    public bfzf(bfzg bfzg0) {
        Objects.requireNonNull(bfzg0);
        this.a = bfzg0;
        super();
    }

    @Override  // fnjf
    public final void b(Object object0) {
        this.a.A().runOnUiThread(new bfze(this, ((fntm)object0)));
    }
}

