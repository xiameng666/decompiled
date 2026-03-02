import android.os.IBinder;
import android.os.IInterface;

public final class dote implements Runnable {
    public final IBinder a;

    public dote(IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override
    public final void run() {
        Object object0;
        IBinder iBinder0 = this.a;
        if(iBinder0 == null) {
            object0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.pay.jpeg2k.aidl.IJpeg2kConversionService");
            object0 = (iInterface0 instanceof dotc) ? ((dotc)iInterface0) : new dotc(iBinder0);
        }
        ibuq.e(object0, "asInterface(...)");
        ((ggtj)dotf.a.j()).x("Service connected after disconnected.");
    }
}

