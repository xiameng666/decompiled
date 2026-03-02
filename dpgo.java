import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dpgo {
    private final frli a;

    public dpgo(frli frli0) {
        this.a = frli0;
    }

    public final dpeb a() {
        return this.d(new dpgn());
    }

    public final dpeb b() {
        return (dpeb)dpgo.g(this.a.a());
    }

    public final dpeb c(bboe bboe0) {
        dpgk dpgk0 = new dpgk(bboe0);
        dpgo.g(this.a.b(dpgk0, gmap.a));
        return this.b();
    }

    public final dpeb d(bboe bboe0) {
        return this.c(new dpgl(bboe0));
    }

    public final void e() {
        this.f(dpeb.b);
    }

    public final void f(dpeb dpeb0) {
        dpgm dpgm0 = new dpgm(dpeb0);
        dpgo.g(this.a.b(dpgm0, gmap.a));
    }

    private static Object g(gmcd gmcd0) {
        try {
            return gmcd0.get(10L, TimeUnit.SECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new IllegalStateException(exception0);
        }
    }
}

