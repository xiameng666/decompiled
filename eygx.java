import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

final class eygx extends ibuo implements ibts {
    public eygx(Object object0) {
        super(1, object0, eygy.class, "mapExceptionToExecutionResult", "mapExceptionToExecutionResult(Ljava/lang/Throwable;)Lcom/google/android/gms/libs/providence/ExecutionResult;", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0;
        eygy eygy0 = (eygy)this.e;
        if(((Throwable)object0) == null) {
            return new cjuf(Status.b);
        }
        if((((Throwable)object0) instanceof RemoteException)) {
            return new cjuf(Status.h);
        }
        if((((Throwable)object0) instanceof cjuh)) {
            status0 = ((cjuh)(((Throwable)object0))).a_OperationException;
        }
        else if((((Throwable)object0) instanceof ExecutionException)) {
            Throwable throwable0 = ((ExecutionException)(((Throwable)object0))).getCause();
            if(throwable0 == null) {
                throwable0 = (Throwable)object0;
            }
            status0 = new Status(Status.d.i, throwable0.getMessage(), null);
        }
        else {
            status0 = new Status(Status.d.i, ((Throwable)object0).getMessage(), null);
        }
        ((ggtj)((ggtj)eygy0.a.j()).s(((Throwable)object0))).P("operation=%s, opStatusCode=%s", eygy0.q(), status0.i);
        try {
            ibuq.c(status0);
            eygy0.j(status0);
        }
        catch(RemoteException unused_ex) {
        }
        return new cjuf(status0);
    }
}

