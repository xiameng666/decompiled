import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class eqxc extends wby implements eqxd {
    final eqvw a;
    final equj b;

    public eqxc() {
        super("com.google.android.gms.smartdevice.quickstart.ITargetStartRestoreCallbacks");
    }

    public eqxc(equj equj0, eqvw eqvw0) {
        this.a = eqvw0;
        Objects.requireNonNull(equj0);
        this.b = equj0;
        super("com.google.android.gms.smartdevice.quickstart.ITargetStartRestoreCallbacks");
    }

    @Override  // eqxd
    public final void a(int v) {
        equm.a.d("returnStartRestoreResponse", new Object[0]);
        Status status0 = new Status(v);
        equm.a.d("OnStartRestore called", new Object[0]);
        try {
            this.a.g(status0);
        }
        catch(RemoteException remoteException0) {
            equm.a.l(remoteException0);
        }
        bbic.a().b(this.b.b.e, this.b.b.f);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            int v1 = parcel0.readInt();
            eqxc.gr(parcel0);
            this.a(v1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

