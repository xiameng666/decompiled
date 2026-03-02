import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class erqf {
    public static int a(Exception exception0) {
        return erqf.c(exception0).i;
    }

    public static Status b(evql evql0) {
        try {
            evrg.n(evql0);
            return Status.b;
        }
        catch(ExecutionException | InterruptedException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            return erqf.c(evql0.i());
        }
    }

    public static Status c(Exception exception0) {
        if((exception0 instanceof aztb)) {
            return erqf.d(((aztb)exception0));
        }
        if((exception0 instanceof ExecutionException)) {
            Throwable throwable0 = exception0.getCause();
            return (throwable0 instanceof aztb) ? erqf.d(((aztb)throwable0)) : Status.d;
        }
        return Status.d;
    }

    private static Status d(aztb aztb0) {
        return new Status(aztb0.b());
    }
}

