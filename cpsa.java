import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public final class cpsa {
    protected final cptf a;

    public cpsa(cptf cptf0) {
        batl.s(cptf0);
        this.a = cptf0;
    }

    public final String a() {
        try {
            return this.a.b();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    public final void b() {
        try {
            this.a.c();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    public final void c(LatLng latLng0) {
        if(latLng0 != null) {
            try {
                this.a.d(latLng0);
                return;
            }
            catch(RemoteException remoteException0) {
                throw new cpsi(remoteException0);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public final void d(boolean z) {
        try {
            this.a.e(z);
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    public final void e() {
        try {
            this.a.f();
        }
        catch(RemoteException remoteException0) {
            throw new cpsi(remoteException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof cpsa)) {
            return false;
        }
        try {
            return this.a.g(((cpsa)object0).a);
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

