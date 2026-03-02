import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class cpyg implements glzn {
    public final cpyh a;

    public cpyg(cpyh cpyh0) {
        this.a = cpyh0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        glsl glsl0;
        cpyh cpyh0 = this.a;
        Boolean boolean0 = (Boolean)object0;
        try {
            if(boolean0.booleanValue()) {
                glsl0 = glsl.b;
                cpyh0.h.a(Status.b);
            }
            else {
                glsl0 = glsl.j;
                Status status0 = new Status(8, "SetFileGroupActivationOperation : Failed to set activation status", null);
                cpyh0.h.a(status0);
            }
        }
        catch(RemoteException remoteException0) {
            glsl0 = glsl.o;
            fkbp.k(remoteException0, "Client died during SetFileGroupActivationOperation.", new Object[0]);
        }
        finally {
            cpyh0.b(glsl0, null);
        }
        return gmbx.a;
    }
}

