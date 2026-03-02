import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

final class acon extends bcqh {
    final acor a;

    public acon(acor acor0, Handler handler0) {
        Objects.requireNonNull(acor0);
        this.a = acor0;
        super(handler0);
    }

    @Override  // bcqh
    public final void c(bcrc bcrc0) {
        acor.a.g("Verification exception:", bcrc0, new Object[0]);
        acor acor0 = this.a;
        acor0.e.j(acor0.f, gmfz.ba, gmfx.aV, bcrc0.getMessage());
        try {
            if(hrcv.h() && bcrc0.a.equals(gmfx.j)) {
                Status status0 = new Status(34506);
                SetAsterismConsentResponse setAsterismConsentResponse0 = new SetAsterismConsentResponse(acor0.g, "", "");
                ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
                acor0.b.c(status0, setAsterismConsentResponse0, apiMetadata0);
                return;
            }
            Status status1 = new Status(34504);
            SetAsterismConsentResponse setAsterismConsentResponse1 = new SetAsterismConsentResponse(acor0.g, "", "");
            ApiMetadata apiMetadata1 = cckf.d(bbdp.aK);
            acor0.b.c(status1, setAsterismConsentResponse1, apiMetadata1);
        }
        catch(RemoteException remoteException0) {
            acor.a.n("Remote exception:", remoteException0, new Object[0]);
        }
    }

    @Override  // bcqh
    public final void d(boolean z, Map map0) {
        long v;
        acor acor0 = this.a;
        acor0.e.o(acor0.f, gmfz.ba, gmgd.e);
        switch(acor0.h) {
            case 2: {
                v = hrei.a.c().d();
                break;
            }
            case 1: 
            case 3: {
                v = hrei.a.c().a();
                break;
            }
            default: {
                v = hrei.b();
            }
        }
        try {
            bcqf bcqf0 = bcqg.a(acor0.d, Long.valueOf(v));
            this.g(bcqf0.b, bcqf0.a);
        }
        catch(IOException iOException0) {
            acor.a.n("IID Token generation failure:", iOException0, new Object[0]);
            this.a.e.j(this.a.f, gmfz.ba, gmfx.aX, iOException0.getMessage());
            this.g("", "");
        }
        bbvl.h();
        UUID uUID0 = UUID.randomUUID();
        bblf bblf0 = new bblf(new bblg(10));
        Objects.requireNonNull(this);
        bcqh bcqh0 = new bcqh(bblf0);
        bbvl.g(this.a.d, uUID0, 11, bcqh0);
    }

    private final void g(String s, String s1) {
        try {
            SetAsterismConsentResponse setAsterismConsentResponse0 = new SetAsterismConsentResponse(this.a.g, s, s1);
            ApiMetadata apiMetadata0 = cckf.d(bbdp.aK);
            this.a.b.c(Status.b, setAsterismConsentResponse0, apiMetadata0);
        }
        catch(RemoteException remoteException0) {
            acor.a.n("Remote exception:", remoteException0, new Object[0]);
        }
    }
}

