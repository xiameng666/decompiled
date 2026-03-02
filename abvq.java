import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class abvq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        List list0 = null;
        String[] arr_s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    list0 = baua.y(parcel0, v1, UsageInfo.CREATOR);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetRecentContextCall.Response(status0, list0, arr_s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetRecentContextCall.Response[v];
    }
}

