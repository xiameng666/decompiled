import android.content.Context;
import j..util.Objects;

final class auap implements Runnable {
    final auaq a;
    private final Context b;

    public auap(auaq auaq0, Context context0) {
        Objects.requireNonNull(auaq0);
        this.a = auaq0;
        super();
        this.b = context0;
    }

    @Override
    public final void run() {
        try {
            this.a.b.m("**** selector loop thread starting");
            this.a.e.countDown();
            this.a.c(this.b);
        }
        catch(Throwable throwable0) {
            this.a.b.e(throwable0, "Unexpected throwable in selector loop", new Object[0]);
            this.a.d = throwable0;
            this.a.c = true;
        }
        finally {
            this.a.b.m("**** selector loop thread exiting");
            auaq.g(this.a);
            this.a.b();
        }
    }
}

