import j..util.Objects;
import java.io.IOException;
import java.util.concurrent.Executor;

final class akzz implements gelg {
    public final gelg a;
    private final Executor b;

    public akzz(Executor executor0, gelg gelg0) {
        this.b = executor0;
        this.a = gelg0;
    }

    @Override  // gelg
    public final void h() {
        Objects.requireNonNull(this.a);
        akzv akzv0 = new akzv();
        this.b.execute(akzv0);
    }

    @Override  // gelg
    public final void i() {
        Objects.requireNonNull(this.a);
        akzx akzx0 = new akzx(this.a);
        this.b.execute(akzx0);
    }

    @Override  // gelg
    public final void j(IOException iOException0) {
        akzy akzy0 = new akzy(this, iOException0);
        this.b.execute(akzy0);
    }

    @Override  // gelg
    public final void k(byte[] arr_b) {
        akzw akzw0 = new akzw(this, arr_b);
        this.b.execute(akzw0);
    }
}

