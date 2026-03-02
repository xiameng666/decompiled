import j..util.Objects;

final class dovp implements lom {
    final fnjf a;
    final dovr b;

    public dovp(dovr dovr0, fnjf fnjf0) {
        this.a = fnjf0;
        Objects.requireNonNull(dovr0);
        this.b = dovr0;
        super();
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        this.b.d.b.d(this.a);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }
}

