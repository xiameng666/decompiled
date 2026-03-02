import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public final class cprq {
    private final cpsw a;

    public cprq(cpsw cpsw0) {
        batl.s(cpsw0);
        this.a = cpsw0;
    }

    public final void a() {
        try {
            this.a.b();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    public final void b(LatLng latLng0) {
        try {
            batl.t(latLng0, "center must not be null.");
            this.a.c(latLng0);
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    public final void c(boolean z) {
        try {
            this.a.d(z);
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof cprq)) {
            return false;
        }
        try {
            return this.a.e(((cprq)object0).a);
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    @Override
    public final int hashCode() {
        try {
            return this.a.a();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }
}

