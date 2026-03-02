import j..util.Objects;

public final class akuo implements akup {
    final akup a;
    final akus b;

    public akuo(akus akus0, akup akup0) {
        this.a = akup0;
        Objects.requireNonNull(akus0);
        this.b = akus0;
        super();
    }

    @Override  // akup
    public final void a(String s) {
        akus.a.m("Advertisement restart failed: %s", new Object[]{String.valueOf(s)});
        if(hpzm.g()) {
            this.b.f(6, 3);
        }
        this.b.b();
        this.a.a(s);
    }

    @Override  // akup
    public final void b() {
        if(hpzm.g()) {
            this.b.f(6, 2);
        }
        this.a.b();
    }
}

