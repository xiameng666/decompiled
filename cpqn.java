import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class cpqn extends wby implements IInterface {
    final cpno a;

    public cpqn() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    public cpqn(cpnp cpnp0, cpno cpno0) {
        this.a = cpno0;
        Objects.requireNonNull(cpnp0);
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cptf cptf0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                cptf0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                cptf0 = (iInterface0 instanceof cptf) ? ((cptf)iInterface0) : new cptd(iBinder0);
            }
            cpqn.gr(parcel0);
            cpsa cpsa0 = new cpsa(cptf0);
            this.a.b(cpsa0);
            parcel1.writeNoException();
            parcel1.writeInt(1);
            return true;
        }
        return false;
    }
}

