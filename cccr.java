import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class cccr {
    private final gfuv a;
    private final long b;
    private final ccdb c;
    private final ccda d;

    public cccr(ccdb ccdb0, ccda ccda0, gfuv gfuv0) {
        this.c = ccdb0;
        this.d = ccda0;
        this.a = gfuv0;
        this.b = gfuv0.a();
    }

    public final void a(String s) {
        Status status0 = new Status(8, s);
        long v = this.a.a();
        try {
            Parcel parcel0 = this.d.jo();
            wbz.f(parcel0, status0);
            parcel0.writeLong(v - this.b);
            this.d.jp(3, parcel0);
        }
        catch(RemoteException remoteException0) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", remoteException0);
            this.c.a();
        }
    }

    public final void b(byte[] arr_b, byte[] arr_b1) {
        long v = this.a.a() - this.b;
        try {
            ccda ccda0 = this.d;
            ObjectWrapper objectWrapper0 = null;
            ObjectWrapper objectWrapper1 = arr_b == null ? null : new ObjectWrapper(arr_b);
            if(arr_b1 != null) {
                objectWrapper0 = new ObjectWrapper(arr_b1);
            }
            Parcel parcel0 = ccda0.jo();
            wbz.h(parcel0, objectWrapper1);
            wbz.h(parcel0, objectWrapper0);
            parcel0.writeLong(v);
            ccda0.jp(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", remoteException0);
            this.c.a();
        }
    }
}

