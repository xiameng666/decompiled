import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;

public final class soj implements Runnable {
    final String[] a;
    final dcqm b;
    final sod c;

    public soj(sod sod0, String[] arr_s, dcqm dcqm0) {
        this.a = arr_s;
        this.b = dcqm0;
        Objects.requireNonNull(sod0);
        this.c = sod0;
        super();
    }

    @Override
    public final void run() {
        sob sob0;
        try {
            soa soa0 = this.c.e;
            Parcel parcel0 = soa0.jo();
            parcel0.writeStringArray(this.a);
            Parcel parcel1 = soa0.hM(9, parcel0);
            Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
            parcel1.recycle();
            sob0 = sob.a(bundle0);
        }
        catch(RemoteException remoteException0) {
            Log.e("P2pClient.Impl", "Evaluation exception occurred.", remoteException0);
            sob0 = sob.b();
        }
        soi soi0 = new soi(this, this.b, this.a, sob0);
        this.c.d(soi0);
    }
}

