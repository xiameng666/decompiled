import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

public final class aifo {
    public static aztb a(Throwable throwable0) {
        if(!(throwable0 instanceof ExecutionException) && !(throwable0 instanceof gmdd)) {
            return (throwable0 instanceof aztb) ? ((aztb)throwable0) : new aztb(Status.d);
        }
        Throwable throwable1 = throwable0.getCause();
        return throwable1 == null ? new aztb(Status.d) : aifo.a(throwable1);
    }

    public static Status b(aztb aztb0) {
        return (aztb0 instanceof azuh) ? new Status(aztb0.b(), aztb0.getMessage(), ((azuh)aztb0).c()) : new Status(aztb0.b(), aztb0.getMessage());
    }
}

