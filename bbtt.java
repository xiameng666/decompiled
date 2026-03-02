import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.config.internal.AnalyticsUserProperty;
import com.google.android.gms.config.internal.FetchConfigIpcRequest;
import java.util.List;

public final class bbtt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        String s = null;
        DataHolder dataHolder0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        List list0 = null;
        List list1 = null;
        long v4 = 0L;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 4: {
                    dataHolder0 = (DataHolder)baua.m(parcel0, v5, DataHolder.CREATOR);
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 7: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 8: {
                    list0 = baua.x(parcel0, v5);
                    break;
                }
                case 9: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 10: {
                    list1 = baua.y(parcel0, v5, AnalyticsUserProperty.CREATOR);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 12: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new FetchConfigIpcRequest(s, v4, dataHolder0, s1, s2, s3, list0, v1, list1, v2, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FetchConfigIpcRequest[v];
    }
}

