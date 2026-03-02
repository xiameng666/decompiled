import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class aqia extends wby implements aqib {
    public aqia() {
        super("com.google.android.gms.backup.apps.internal.IBackupStateService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aqic aqic0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.apps.internal.IBackupStateServiceCallback");
                    aqic0 = (iInterface0 instanceof aqic) ? ((aqic)iInterface0) : new aqic(iBinder0);
                }
                aqia.gr(parcel0);
                this.c(aqic0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.backup.apps.internal.IBackupStateServiceCallback");
                    aqic0 = (iInterface1 instanceof aqic) ? ((aqic)iInterface1) : new aqic(iBinder1);
                }
                aqia.gr(parcel0);
                this.a(aqic0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

