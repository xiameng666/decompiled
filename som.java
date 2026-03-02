import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.android.vending.p2p.client.InstallResultReceiver;
import j..util.Objects;
import java.util.Arrays;

public final class som implements Runnable {
    final String[] a;
    final dcqn b;
    final sod c;

    public som(sod sod0, String[] arr_s, dcqn dcqn0) {
        this.a = arr_s;
        this.b = dcqn0;
        Objects.requireNonNull(sod0);
        this.c = sod0;
        super();
    }

    @Override
    public final void run() {
        try {
            soa soa0 = this.c.e;
            Arrays.toString(this.a);
            InstallResultReceiver installResultReceiver0 = new InstallResultReceiver(this.c.a, this.b);
            Parcel parcel0 = soa0.jo();
            parcel0.writeStringArray(this.a);
            wbz.f(parcel0, installResultReceiver0);
            soa0.jp(10, parcel0);
        }
        catch(RemoteException remoteException0) {
            Log.e("P2pClient.Impl", "Install exception occurred.", remoteException0);
            Arrays.toString(this.a);
            this.c.i(this.b);
        }
    }
}

