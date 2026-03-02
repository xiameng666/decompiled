import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

public final class cccs {
    private final gfuv a;
    private final long b;
    private final ccdc c;

    public cccs(ccdc ccdc0) {
        this.c = ccdc0;
        this.a = gfqs.a;
        this.b = gfqs.a.a();
    }

    public final void a(int v, String s) {
        Status status0 = new Status(v, s);
        long v1 = this.a.a();
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, status0);
            parcel0.writeLong(v1 - this.b);
            this.c.jp(3, parcel0);
        }
        catch(RemoteException remoteException0) {
            Log.w("brella.ExampleStoreSvc", "onStartQueryFailure AIDL call failed, ignoring", remoteException0);
        }
    }

    public final void b(cbyy cbyy0) {
        long v = this.a.a();
        ccdb ccdb0 = new ccdb(cbyy0, this.a);
        try {
            Parcel parcel0 = this.c.jo();
            wbz.h(parcel0, ccdb0);
            parcel0.writeLong(v - this.b);
            this.c.jp(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            Log.w("brella.ExampleStoreSvc", "onStartQuerySuccess AIDL call failed, closing iterator", remoteException0);
            ccdb0.a();
        }
    }
}

