import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class cqbv {
    // Detected as a lambda impl.
    public static Exception a(Exception exception0) {
        if((exception0 instanceof ExecutionException)) {
            cqbu cqbu0 = new cqbu();
            Throwable throwable0 = ((ExecutionException)exception0).getCause();
            gftb.z(throwable0, "Execution exceptions must have a cause!");
            return (throwable0 instanceof Exception) ? ((Exception)cqbu0.apply(((Exception)throwable0))) : ((ExecutionException)exception0);
        }
        if((exception0 instanceof iapn)) {
            switch(((iapn)exception0).a.t.ordinal()) {
                case 9: {
                    return new cqgq(exception0);
                }
                case 1: 
                case 4: 
                case 8: 
                case 10: 
                case 14: {
                    return new cqgp(exception0);
                }
                case 16: {
                    return new cqgl(exception0);
                }
                default: {
                    return new cqgm(exception0);
                }
            }
        }
        return (exception0 instanceof IOException) ? new cqgm(exception0) : exception0;
    }
}

