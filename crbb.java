import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;

public final class crbb extends wby implements IInterface {
    public final AtomicReference a;
    public boolean b;

    public crbb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public crbb(byte[] arr_b) {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.a = new AtomicReference();
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        int v2;
        if(v == 1) {
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            crbb.gr(parcel0);
            __monitor_enter(this.a);
            try {
                v2 = FIN.finallyOpen$NT();
                this.a.set(bundle0);
                this.b = true;
            }
            finally {
                this.a.notify();
            }
            FIN.finallyCodeBegin$NT(v2);
            __monitor_exit(this.a);
            FIN.finallyCodeEnd$NT(v2);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

