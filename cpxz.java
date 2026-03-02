import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class cpxz implements glzn {
    public final cpyc a;
    public final AtomicReference b;
    public final List c;
    public final AtomicReference d;

    public cpxz(cpyc cpyc0, AtomicReference atomicReference0, List list0, AtomicReference atomicReference1) {
        this.a = cpyc0;
        this.b = atomicReference0;
        this.c = list0;
        this.d = atomicReference1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v;
        boolean z = ((gfsx)object0).i();
        cpyc cpyc0 = this.a;
        AtomicReference atomicReference0 = this.b;
        List list0 = this.c;
        AtomicReference atomicReference1 = this.d;
        if(z) {
            atomicReference0.set(glsl.b);
            v = ((fjbs)((gfsx)object0).d()).f;
        }
        else {
            atomicReference0.set(glsl.d);
            v = 0;
        }
        try {
            FileGroupResponse fileGroupResponse0 = new FileGroupResponse(cpyc0.b.a, cpyc0.b.b, v, list0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.cM);
            cpyc0.h.a(Status.b, fileGroupResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during GetFileGroupOperation.", new Object[0]);
            atomicReference0.set(glsl.o);
        }
        finally {
            cpyc0.b(((glsl)atomicReference0.get()), ((fjbs)atomicReference1.get()));
        }
        return gmbx.a;
    }
}

