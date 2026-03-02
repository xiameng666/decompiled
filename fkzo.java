import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class fkzo {
    public final flae a;

    public fkzo(flae flae0) {
        this.a = flae0;
    }

    public static Object a(gmcd gmcd0) {
        try {
            return gmcd0.get();
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            gftb.check(throwable0);
            gfut.d(throwable0, IOException.class);
            throw new IllegalStateException(executionException0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new IOException(interruptedException0);
        }
    }
}

