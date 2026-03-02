import java.util.concurrent.Executor;

final class ibaj implements Executor {
    private final ibcd a;
    private Executor b;

    public ibaj(ibcd ibcd0) {
        this.a = ibcd0;
    }

    final Executor a() {
        synchronized(this) {
            if(this.b == null) {
                Object object0 = this.a.a();
                gftb.B(object0, "%s.getObject()", this.b);
                this.b = object0;
            }
        }
        return this.b;
    }

    final void b() {
        synchronized(this) {
            Executor executor0 = this.b;
            if(executor0 != null) {
                this.a.b(executor0);
                this.b = null;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a().execute(runnable0);
    }
}

