import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

public final class cpxy implements glzn {
    public final cpyc a;
    public final AtomicReference b;
    public final AtomicReference c;

    public cpxy(cpyc cpyc0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
        this.a = cpyc0;
        this.b = atomicReference0;
        this.c = atomicReference1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        fkbp.f(throwable0, "GetFileGroupOperation failed.");
        cpyc cpyc0 = this.a;
        AtomicReference atomicReference0 = this.b;
        AtomicReference atomicReference1 = this.c;
        try {
            cpyc0.j(((throwable0 instanceof cjuh) ? ((cjuh)throwable0).a_OperationException : Status.d));
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during GetFileGroupOperation.", new Object[0]);
        }
        finally {
            glsl glsl0 = (glsl)atomicReference0.get();
            if(glsl0 == glsl.a) {
                glsl0 = glsl.n;
            }
            cpyc0.b(glsl0, ((fjbs)atomicReference1.get()));
        }
        return gmbu.h(throwable0);
    }
}

