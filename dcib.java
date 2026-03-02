import java.util.concurrent.ExecutionException;

public final class dcib {
    public static final Object a(evql evql0) {
        try {
            return evrg.n(evql0);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if((throwable0 instanceof aztb)) {
                return ((aztb)throwable0).a.i == 35500 ? null : ibnx.a(executionException0);
            }
            return ibnx.a(executionException0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            return ibnx.a(interruptedException0);
        }
    }
}

