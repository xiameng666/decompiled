import android.accounts.Account;
import j..util.Objects;

public final class alkg implements gmbg {
    final alkk a;
    final alkl b;

    public alkg(alkl alkl0, alkk alkk0) {
        this.a = alkk0;
        Objects.requireNonNull(alkl0);
        this.b = alkl0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        a.ae(alkl.a.j(), "Could not determine initial account to display for Better Together settings.", throwable0);
        this.b.c = null;
    }

    @Override  // gmbg
    public final void b(Object object0) {
        this.a.c(((Account)object0));
        this.b.c = null;
    }
}

