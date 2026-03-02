import android.os.Parcel;
import com.google.android.gms.multidevice.XdFeatureStatusUpdate;

public final class ctcj extends wby implements ctck {
    final azyf a;

    public ctcj() {
        super("com.google.android.gms.multidevice.internal.IXdFeatureStatusListener");
    }

    public ctcj(azyf azyf0) {
        this.a = azyf0;
        super("com.google.android.gms.multidevice.internal.IXdFeatureStatusListener");
    }

    @Override  // ctck
    public final void a(XdFeatureStatusUpdate xdFeatureStatusUpdate0) {
        ibuq.f(xdFeatureStatusUpdate0, "updates");
        ctcp ctcp0 = new ctcp(xdFeatureStatusUpdate0);
        this.a.b(ctcp0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            XdFeatureStatusUpdate xdFeatureStatusUpdate0 = (XdFeatureStatusUpdate)wbz.a(parcel0, XdFeatureStatusUpdate.CREATOR);
            ctcj.gr(parcel0);
            this.a(xdFeatureStatusUpdate0);
            return true;
        }
        return false;
    }
}

