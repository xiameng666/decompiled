import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class sae extends wby implements saf {
    final ibts a;
    final ibts b;

    public sae() {
        super("com.android.onboarding.tasks.service.IUnitCallback");
    }

    public sae(ibts ibts0, ibts ibts1) {
        this.a = ibts0;
        this.b = ibts1;
        super("com.android.onboarding.tasks.service.IUnitCallback");
    }

    @Override  // saf
    public final void a(rzz rzz0) {
        this.a.a(rzz0);
    }

    @Override  // saf
    public final void b() {
        this.b.a(ibom.a);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        rzz rzz0;
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                parcel1.writeInt(1);
                return true;
            }
            case 2: {
                this.b();
                return true;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    rzz0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.onboarding.tasks.service.IPersistableBundleStream");
                    rzz0 = (iInterface0 instanceof rzz) ? ((rzz)iInterface0) : new rzx(iBinder0);
                }
                sae.gr(parcel0);
                this.a(rzz0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

