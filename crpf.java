import j..util.Objects;
import java.util.ArrayList;

final class crpf implements Runnable {
    final crqq a;
    final Runnable b;

    public crpf(crph crph0, crqq crqq0, Runnable runnable0) {
        this.a = crqq0;
        this.b = runnable0;
        Objects.requireNonNull(crph0);
        super();
    }

    @Override
    public final void run() {
        crqq crqq0 = this.a;
        crqq0.F();
        crqq0.E();
        if(crqq0.l == null) {
            crqq0.l = new ArrayList();
        }
        crqq0.l.add(this.b);
        crqq0.ai();
    }
}

