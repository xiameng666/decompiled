import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;

final class acok extends bcqh {
    final acol a;

    public acok(acol acol0, Handler handler0) {
        Objects.requireNonNull(acol0);
        this.a = acol0;
        super(handler0);
    }

    @Override  // bcqh
    public final void a(acoe acoe0) {
        String s1;
        String s = "";
        this.a.e.o(this.a.f, gmfz.bb, gmgd.f);
        int v = acoe0.a.ordinal() == 1 || acoe0.a.ordinal() == 2 ? 1 : 0;
        int v1 = this.a.d;
        int v2 = hodq.a(acoe0.b);
        try {
            Long long0 = hrei.b();
            s1 = "";
            bcqf bcqf0 = bcqg.a(this.a.b, long0);
            s1 = bcqf0.a;
            s = bcqf0.b;
        }
        catch(IOException iOException0) {
            acol.a.n("IID Token generation failure:", iOException0, new Object[0]);
            this.a.e.j(this.a.f, gmfz.bb, gmfx.aX, iOException0.getMessage());
        }
        try {
            GetAsterismConsentResponse getAsterismConsentResponse0 = acod.a(v1, v, s, s1, v2);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
            this.a.c.a(Status.b, getAsterismConsentResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            acol.a.n("Remote exception:", remoteException0, new Object[0]);
        }
    }

    @Override  // bcqh
    public final void b(hodo hodo0) {
        String s1;
        int v1;
        String s = "";
        this.a.e.o(this.a.f, gmfz.bb, gmgd.f);
        int v = hodo0.ordinal() == 1 || hodo0.ordinal() == 2 ? 1 : 0;
        try {
            v1 = this.a.d;
            Long long0 = hrei.b();
            s1 = "";
            bcqf bcqf0 = bcqg.a(this.a.b, long0);
            s1 = bcqf0.a;
            s = bcqf0.b;
        }
        catch(IOException iOException0) {
            acol.a.n("IID Token generation failure:", iOException0, new Object[0]);
            this.a.e.j(this.a.f, gmfz.bb, gmfx.aX, iOException0.getMessage());
        }
        try {
            GetAsterismConsentResponse getAsterismConsentResponse0 = acod.a(v1, v, s, s1, 0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
            this.a.c.a(Status.b, getAsterismConsentResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            acol.a.n("Remote exception:", remoteException0, new Object[0]);
        }
    }

    @Override  // bcqh
    public final void c(bcrc bcrc0) {
        this.a.e.j(this.a.f, gmfz.bb, gmfx.aW, bcrc0.getMessage());
        try {
            GetAsterismConsentResponse getAsterismConsentResponse0 = acod.a(this.a.d, 0, "", "", 0);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
            this.a.c.a(Status.d, getAsterismConsentResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            acol.a.n("Remote exception:", remoteException0, new Object[0]);
        }
    }
}

