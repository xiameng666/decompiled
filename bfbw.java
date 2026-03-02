import j..util.Objects;

public final class bfbw extends bgls {
    final bfbx a;

    public bfbw(bfbx bfbx0) {
        Objects.requireNonNull(bfbx0);
        this.a = bfbx0;
        super();
    }

    @Override  // bgls
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        this.a.c.l(charSequence0.toString().trim());
        this.a.a();
    }
}

