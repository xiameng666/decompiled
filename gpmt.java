import android.os.Parcelable;
import java.util.List;

public final class gpmt {
    public static final Parcelable a(hfrh hfrh0, gpmr gpmr0) {
        iaof_metadata iaof1;
        ibuq.f(hfrh0, "<this>");
        ibuq.f(gpmr0, "keys");
        ibuq.f(hfrh0, "<this>");
        ibuq.f(gpmr0, "keys");
        gpms gpms0 = new gpms();
        iapk iapk0 = hfrh0.a;
        if(!iapk0.h()) {
            iaof_metadata iaof0 = hfrh0.c;
            if(iaof0 == null) {
                iaof1 = new iaof_metadata();
            }
            else {
                synchronized(iaof0) {
                    iaof1 = new iaof_metadata();
                    iaof1.h(iaof0);
                }
            }
            throw new iapn(iapk0, iaof1);
        }
        Object object0 = gpms0.a(hfrh0, gpmr0.a);
        Parcelable parcelable0 = (Parcelable)ibpo.T(((List)object0));
        if(parcelable0 != null) {
            return parcelable0;
        }
        throw new gpmp(gpmr0, ((gged_interceptors)object0));
    }
}

