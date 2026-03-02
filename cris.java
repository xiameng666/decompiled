import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class cris extends baqp {
    public cris(Context context0, Looper looper0, baqf baqf0, baqg baqg0) {
        super(context0, looper0, 93, baqf0, baqg0);
    }

    @Override  // baqp
    public final int a() {
        return 12451000;
    }

    @Override  // baqp
    public final IInterface c(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return (iInterface0 instanceof crii) ? ((crii)iInterface0) : new crig(iBinder0);
    }

    @Override  // baqp
    protected final String d() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override  // baqp
    protected final String e() {
        return "com.google.android.gms.measurement.START";
    }
}

