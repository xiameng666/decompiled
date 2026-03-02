import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.Arrays;

public final class bnms implements Runnable {
    public final bnmu a;
    public final byte[] b;

    public bnms(bnmu bnmu0, byte[] arr_b) {
        this.a = bnmu0;
        this.b = arr_b;
    }

    @Override
    public final void run() {
        ffsr ffsr0 = this.a.b;
        if(ffsr0.f == null) {
            Log.e("GRIL-L", "sendPrecomputedKeys: GRil service is not ready");
            return;
        }
        Arrays.toString(this.b);
        try {
            ffte ffte0 = ffsr0.f;
            Parcel parcel0 = ffte0.jo();
            parcel0.writeByteArray(this.b);
            Parcel parcel1 = ffte0.hM(51, parcel0);
            parcel1.readInt();
            parcel1.recycle();
        }
        catch(RemoteException remoteException0) {
            Log.e("GRIL-L", "sendPrecomputedKeys exception ", remoteException0);
        }
    }
}

