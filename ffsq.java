import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;

final class ffsq implements ServiceConnection {
    final ffsr a;

    public ffsq(ffsr ffsr0) {
        Objects.requireNonNull(ffsr0);
        this.a = ffsr0;
        super();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        ffte ffte0;
        if(iBinder0 == null) {
            ffte0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.grilservice.IGRilInterface");
            ffte0 = (iInterface0 instanceof ffte) ? ((ffte)iInterface0) : new ffte(iBinder0);
        }
        ffsr ffsr0 = this.a;
        ffsr0.f = ffte0;
        ffte ffte1 = ffsr0.f;
        if(ffte1 == null) {
            Log.e("GRIL-L", "GRilService binding failed");
            synchronized(this.a.c) {
                this.a.c.notifyAll();
            }
            bnmt bnmt0 = this.a.e;
            if(bnmt0 != null) {
                bnmt0.a();
            }
        }
        else {
            if(ffsr0.b == null) {
                try {
                    Parcel parcel0 = ffte1.hM(0x2F, ffte1.jo());
                    boolean z = wbz.i(parcel0);
                    parcel0.recycle();
                    ffsr0.b = Boolean.valueOf(z);
                }
                catch(RemoteException | NullPointerException exception0) {
                    Log.e("GRIL-L", "deviceHasRadio exception ", exception0);
                }
            }
            bnmt bnmt1 = this.a.e;
            if(bnmt1 != null) {
                bnmt1.b.a = true;
                bnmt1.a.run();
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.a.f = null;
        synchronized(this.a.c) {
            this.a.c.notifyAll();
        }
        bnmt bnmt0 = this.a.e;
        if(bnmt0 != null) {
            bnmt0.a();
        }
    }
}

