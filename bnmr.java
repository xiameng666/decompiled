import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public final class bnmr implements Runnable {
    public final bnmu a;
    public final Boolean b;

    public bnmr(bnmu bnmu0, Boolean boolean0) {
        this.a = bnmu0;
        this.b = boolean0;
    }

    @Override
    public final void run() {
        boolean z = this.b.booleanValue();
        ffte ffte0 = this.a.b.f;
        if(ffte0 != null) {
            try {
                Parcel parcel0 = ffte0.jo();
                parcel0.writeInt(((int)z));
                Parcel parcel1 = ffte0.hM(52, parcel0);
                parcel1.readInt();
                parcel1.recycle();
            }
            catch(RemoteException remoteException0) {
                Log.e("GRIL-L", "setPoweredOffMode exception ", remoteException0);
            }
            return;
        }
        Log.e("GRIL-L", "setPoweredOffMode: GRil service is not ready");
    }
}

