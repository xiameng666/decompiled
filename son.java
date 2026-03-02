import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.p2p.client.InstallResultReceiver;
import j..util.Objects;
import java.io.IOException;
import java.util.Arrays;

public final class son implements Runnable {
    final String[] a;
    final dcqn b;
    final sod c;

    public son(sod sod0, String[] arr_s, dcqn dcqn0) {
        this.a = arr_s;
        this.b = dcqn0;
        Objects.requireNonNull(sod0);
        this.c = sod0;
        super();
    }

    @Override
    public final void run() {
        try {
            sot sot0 = this.c.a(this.a);
            soa soa0 = this.c.e;
            byte[] arr_b = sot0.toBytesArray();
            Arrays.toString(this.a);
            InstallResultReceiver installResultReceiver0 = new InstallResultReceiver(this.c.a, this.b);
            Parcel parcel0 = soa0.jo();
            parcel0.writeByteArray(arr_b);
            wbz.f(parcel0, installResultReceiver0);
            soa0.jp(13, parcel0);
        }
        catch(IOException | RemoteException exception0) {
            Log.e("P2pClient.Impl", "Install exception occurred.", exception0);
            Arrays.toString(this.a);
            this.c.i(this.b);
        }
    }
}

