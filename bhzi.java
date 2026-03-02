import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.AnalyticsInfo;
import com.google.android.gms.dtdi.core.GetDevicesResult;
import com.google.android.gms.dtdi.core.SelectedDevice;
import java.util.List;

public final class bhzi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        AnalyticsInfo analyticsInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, SelectedDevice.CREATOR);
                    break;
                }
                case 2: {
                    analyticsInfo0 = (AnalyticsInfo)baua.m(parcel0, v1, AnalyticsInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetDevicesResult(list0, analyticsInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetDevicesResult[v];
    }
}

