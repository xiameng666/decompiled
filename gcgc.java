import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.clientlog.LogContext;

public final class gcgc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Object object0 = new LogContext(parcel0);
        gcge gcge0 = gcge.a();
        Object object1 = (LogContext)gcge0.a.get(object0.e);
        if(object1 == null) {
            gcge0.b(((LogContext)object0).a().a, ((LogContext)object0));
            if(!object0.f) {
                LogContext logContext0 = object0.b;
                if(logContext0 != null) {
                    logContext0.c.add(object0);
                }
            }
            return object0;
        }
        return object1;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LogContext[v];
    }
}

