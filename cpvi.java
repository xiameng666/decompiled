import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

public final class cpvi implements bbmv {
    public final cpvn a;
    public final FileGroupRequest b;

    public cpvi(cpvn cpvn0, FileGroupRequest fileGroupRequest0) {
        this.a = cpvn0;
        this.b = fileGroupRequest0;
    }

    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        cpvp cpvp0 = (cpvp)object0;
        cpvl cpvl0 = new cpvl(this.a, ((evqp)object1));
        try {
            cpur cpur0 = (cpur)cpvp0.H();
            ApiMetadata apiMetadata0 = cclr.a(cpvp0.r);
            cpur0.a(cpvl0, this.b, apiMetadata0);
        }
        catch(RemoteException unused_ex) {
            azzf.a(Status.d, ((evqp)object1));
        }
    }
}

