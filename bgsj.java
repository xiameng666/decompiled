import j..util.Objects;
import j..util.Optional;

public final class bgsj implements Runnable {
    public final bgsq a;

    public bgsj(bgsq bgsq0) {
        this.a = bgsq0;
    }

    @Override
    public final void run() {
        bgsq bgsq0 = this.a;
        synchronized(bgsq0) {
            bgsq0.b = Optional.empty();
        }
        if(!bgsq0.a || bgsq0.c != fxob.a && !Objects.equals(bgsq0.c.b.a.getProvider(), "cache")) {
            return;
        }
        bgsq0.d();
    }
}

