import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class azct extends wby implements azcu, cjug {
    private final Context a;

    public azct() {
        super("com.google.android.gms.clearcut.internal.IBootCountService");
    }

    public azct(Context context0) {
        super("com.google.android.gms.clearcut.internal.IBootCountService");
        this.a = context0;
    }

    @Override  // azcu
    public final void a(azcr azcr0) {
        try {
            Integer integer0 = aywn.a(this.a);
            if(integer0 == null) {
                azcr0.a(Status.d, -1);
                return;
            }
            azcr0.a(Status.b, integer0.intValue());
        }
        catch(RemoteException remoteException0) {
            Log.e("CCTBootCountService", "Could not send a status back in the callback", remoteException0);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azcr azcr0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                azcr0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
                azcr0 = (iInterface0 instanceof azcr) ? ((azcr)iInterface0) : new azcp(iBinder0);
            }
            azct.gr(parcel0);
            this.a(azcr0);
            return true;
        }
        return false;
    }
}

