import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.BatchedLogEventParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.List;

public final class ayty implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                list0 = baua.y(parcel0, v1, LogEventParcelable.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new BatchedLogEventParcelable(list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BatchedLogEventParcelable[v];
    }
}

