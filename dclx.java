import java.util.concurrent.ExecutionException;

public final class dclx implements Runnable {
    public final evqp a;
    public final gmcd b;

    public dclx(evqp evqp0, gmcd gmcd0) {
        this.a = evqp0;
        this.b = gmcd0;
    }

    @Override
    public final void run() {
        evqp evqp0;
        try {
            evqp0 = this.a;
            evqp0.b(((Boolean)((glyq)this.b).u()));
        }
        catch(ExecutionException | InterruptedException exception0) {
            evqp0.a(exception0);
        }
    }
}

