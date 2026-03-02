import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.AppSetIdRequestParams;
import com.google.android.gms.common.api.Status;

public final class acmg extends wby implements acmh, cjug {
    private final boolean a;
    private final cjts b;
    private final acku c;

    public acmg() {
        super("com.google.android.gms.appset.internal.IAppSetService");
    }

    public acmg(boolean z, cjts cjts0, acku acku0) {
        super("com.google.android.gms.appset.internal.IAppSetService");
        this.a = z;
        this.b = cjts0;
        this.c = acku0;
    }

    @Override  // acmh
    public final void a(AppSetIdRequestParams appSetIdRequestParams0, acme acme0) {
        ccmq.a().a(bbdg.sK);
        if(this.a) {
            int v = Binder.getCallingUid();
            acna acna0 = new acna(this.c, acme0, appSetIdRequestParams0, v);
            this.b.b(acna0);
            return;
        }
        acme0.a(new Status(43002), null);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        acme acme0;
        if(v == 1) {
            AppSetIdRequestParams appSetIdRequestParams0 = (AppSetIdRequestParams)wbz.a(parcel0, AppSetIdRequestParams.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                acme0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetIdCallback");
                acme0 = (iInterface0 instanceof acme) ? ((acme)iInterface0) : new acmc(iBinder0);
            }
            acmg.gr(parcel0);
            this.a(appSetIdRequestParams0, acme0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

