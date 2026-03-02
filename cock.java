import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.LocationShare;
import com.google.android.gms.locationsharingreporter.NoticeAckedUpdateRequest;
import com.google.android.gms.locationsharingreporter.StartLocationReportingRequest;

public final class cock implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LocationShare locationShare0 = null;
        NoticeAckedUpdateRequest noticeAckedUpdateRequest0 = null;
        long v1 = 0L;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 2: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    locationShare0 = (LocationShare)baua.m(parcel0, v4, LocationShare.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    noticeAckedUpdateRequest0 = (NoticeAckedUpdateRequest)baua.m(parcel0, v4, NoticeAckedUpdateRequest.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartLocationReportingRequest(v2, v3, locationShare0, v1, noticeAckedUpdateRequest0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartLocationReportingRequest[v];
    }
}

