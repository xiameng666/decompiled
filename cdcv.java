import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.libs.gmscorelogger.LogBatch;
import com.google.android.gms.libs.gmscorelogger.LogEvent;
import java.util.List;

public final class cdcv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        int v1 = 0;
        int v2 = 0;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v3, LogEvent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new LogBatch(v1, v2, arr_b, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LogBatch[v];
    }
}

