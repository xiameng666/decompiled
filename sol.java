import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.io.IOException;

public final class sol implements Runnable {
    final String[] a;
    final dcqm b;
    final sod c;

    public sol(sod sod0, String[] arr_s, dcqm dcqm0) {
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
            sot sot0 = this.c.a(this.a);
            soa soa0 = this.c.e;
            byte[] arr_b = sot0.toBytesArray();
            Parcel parcel0 = soa0.jo();
            parcel0.writeByteArray(arr_b);
            Parcel parcel1 = soa0.hM(12, parcel0);
            Bundle bundle0 = (Bundle)wbz.a(parcel1, Bundle.CREATOR);
            parcel1.recycle();
            sob0 = sob.a(bundle0);
        }
        catch(IOException | RemoteException exception0) {
            Log.e("P2pClient.Impl", "Evaluation exception occurred.", exception0);
            sob0 = sob.b();
        }
        sok sok0 = new sok(this, this.b, this.a, sob0);
        this.c.d(sok0);
    }
}

