import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.InAppTrainerOptions;
import j..util.Objects;
import java.io.IOException;

final class ccgt implements gmbg {
    final ccgo a;
    final InAppTrainerOptions b;
    final fmzu c;
    final ccgu d;

    public ccgt(ccgu ccgu0, ccgo ccgo0, InAppTrainerOptions inAppTrainerOptions0, fmzu fmzu0) {
        this.a = ccgo0;
        this.b = inAppTrainerOptions0;
        this.c = fmzu0;
        Objects.requireNonNull(ccgu0);
        this.d = ccgu0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        gkdj gkdj0 = gkdj.a;
        if((throwable0 instanceof ccgm)) {
            gkdj0 = gkdj.b;
        }
        else if((throwable0 instanceof IOException)) {
            gkdj0 = gkdj.d;
        }
        else if((throwable0 instanceof RuntimeException)) {
            gkdj0 = gkdj.e;
        }
        gfsx gfsx0 = gfsx.m(gkdj0);
        gfsx gfsx1 = gfsx.m(this.b);
        this.a.t(gfsx0, gfsx1);
        this.c.close();
        try {
            this.d.b.a(new Status(8, throwable0.getMessage()));
        }
        catch(RemoteException remoteException0) {
            ccgu.a.f(remoteException0, "RemoteException in onFailure");
        }
    }

    @Override  // gmbg
    public final void b(Object object0) {
        Void void0 = (Void)object0;
        gfsx gfsx0 = gfsx.m(this.b);
        this.a.t(gfqx.a, gfsx0);
        this.c.close();
        try {
            this.d.b.a(Status.b);
        }
        catch(RemoteException remoteException0) {
            ccgu.a.f(remoteException0, "RemoteException in onSuccess");
        }
    }
}

