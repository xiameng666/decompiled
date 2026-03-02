import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class arqm implements arrf {
    public final arqn a;

    public arqm(arqn arqn0) {
        this.a = arqn0;
    }

    @Override  // arrf
    public final InputStream a() {
        InputStream inputStream0;
        arqn arqn0;
        try {
            arqn0 = this.a;
            synchronized(arqn0) {
                inputStream0 = arqn0.b.b();
            }
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            arqn.a.n("Interrupted while waiting for contacts.", interruptedException0, new Object[0]);
            throw new arrg("Unable to fetch contacts", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            arqn.a.g("Unable to fetch Contacts.", executionException0.getCause(), new Object[0]);
            throw new arrg("Unable to fetch contacts", executionException0.getCause());
        }
        finally {
            arqn0.b.c();
        }
        return inputStream0;
    }
}

