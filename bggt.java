import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

abstract class bggt extends cjtm {
    protected bggt(String s, azug azug0) {
        super(0xC4, s, azug0);
    }

    protected abstract void b(Context arg1);

    private static final cjuh c(Exception exception0) {
        return (exception0 instanceof bebz) ? new cjuh(((bebz)exception0).a, exception0.getMessage(), ((bebz)exception0).b, exception0) : new cjuh(8, exception0.getMessage(), null, exception0);
    }

    @Override  // cjtm
    public final void f(Context context0) {
        try {
            this.b(context0);
        }
        catch(RemoteException remoteException0) {
            throw bggt.c(new bebz(19, "Remote exception", null, remoteException0));
        }
        catch(ExecutionException executionException0) {
            throw (executionException0.getCause() instanceof Exception) ? bggt.c(((Exception)executionException0.getCause())) : bggt.c(executionException0);
        }
        catch(CancellationException cancellationException0) {
            throw bggt.c(new bebz(16, "Cancellation exception", null, cancellationException0));
        }
        catch(InterruptedException interruptedException0) {
            throw bggt.c(new bebz(14, "Interrupted exception", null, interruptedException0));
        }
        catch(bebz bebz0) {
            throw bggt.c(bebz0);
        }
        catch(RuntimeException runtimeException0) {
            throw bggt.c(new bebz(8, "Unexpected error.", null, runtimeException0));
        }
    }
}

