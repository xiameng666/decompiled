import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class cpyf implements glzn {
    public final cpyh a;

    public cpyf(cpyh cpyh0) {
        this.a = cpyh0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        fkbp.f(throwable0, "SetFileGroupActivationOperation failed.");
        cpyh cpyh0 = this.a;
        try {
            cpyh0.h.a(((throwable0 instanceof cjuh) ? ((cjuh)throwable0).a_OperationException : Status.d));
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
        finally {
            cpyh0.b(glsl.j, null);
        }
        return gmbu.h(throwable0);
    }
}

