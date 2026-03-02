import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlesettings.session.lifecycle.service.SessionLifecycleRequest;

public abstract class bvaf extends wby implements bvag {
    public bvaf() {
        super("com.google.android.gms.googlesettings.session.lifecycle.service.ISessionLifecycleService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bvad bvad0;
        if(v == 1) {
            SessionLifecycleRequest sessionLifecycleRequest0 = (SessionLifecycleRequest)wbz.a(parcel0, SessionLifecycleRequest.CREATOR);
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bvad0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.googlesettings.session.lifecycle.service.ISessionLifecycleCallbacks");
                bvad0 = (iInterface0 instanceof bvad) ? ((bvad)iInterface0) : new bvab(iBinder0);
            }
            bvaf.gr(parcel0);
            this.c(sessionLifecycleRequest0, bvad0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

