import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable;
import com.google.android.gms.clearcut.internal.LogErrorParcelable;
import java.util.List;

public final class azca implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                list0 = baua.y(parcel0, v1, LogErrorParcelable.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new BatchedLogErrorParcelable(list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BatchedLogErrorParcelable[v];
    }
}

