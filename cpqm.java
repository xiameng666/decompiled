import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import j..util.Objects;

public final class cpqm extends wby implements IInterface {
    final cpnt a;

    public cpqm() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    public cpqm(cpnr cpnr0, cpnt cpnt0) {
        this.a = cpnt0;
        Objects.requireNonNull(cpnr0);
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        cppo cppo0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                cppo0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                cppo0 = (iInterface0 instanceof cppo) ? ((cppo)iInterface0) : new cppm(iBinder0);
            }
            cpqm.gr(parcel0);
            cpnp cpnp0 = new cpnp(cppo0);
            this.a.a(cpnp0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

