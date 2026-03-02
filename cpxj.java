import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class cpxj implements gmbg {
    final gmcd a;
    final Context b;
    final cpxl c;

    public cpxj(cpxl cpxl0, gmcd gmcd0, Context context0) {
        this.a = gmcd0;
        this.b = context0;
        Objects.requireNonNull(cpxl0);
        this.c = cpxl0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        fkbp.g(throwable0, "%s: Failed DownloadPendingGroupsOperation", new Object[]{"Service"});
        try {
            this.c.d.a(Status.d);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        try {
            this.c.d.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            fkbp.k(remoteException0, "Client died during DownloadPendingGroupsOperation", new Object[0]);
        }
        if(huck.a.b().f()) {
            try {
                List list0 = (List)gmbu.r(this.a);
                ggfn ggfn0 = new ggfn();
                for(Object object1: list0) {
                    fjcl fjcl0 = ((fjxp)object1).a;
                    if(!fjcl0.f) {
                        ggfn0.i(fjcl0);
                    }
                }
                ggfp ggfp0 = ggfn0.h();
                gmbu.t(glzd.f(this.c.a.i(), new cpxi(this.c, ggfp0, this.b), gmap.a), new cpxk(this.c), gmap.a);
            }
            catch(ExecutionException executionException0) {
                fkbp.g(executionException0, "%s: predownloadFreshGroupsFuture has not finished", new Object[]{"Service"});
            }
        }
    }
}

