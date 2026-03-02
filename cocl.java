import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.Counterpart;
import com.google.android.gms.locationsharingreporter.Lifecycle;
import com.google.android.gms.locationsharingreporter.NoticeState;
import com.google.android.gms.locationsharingreporter.StartLocationSharingRequest;

public final class cocl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        NoticeState noticeState0 = null;
        Counterpart counterpart0 = null;
        Lifecycle lifecycle0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    noticeState0 = (NoticeState)baua.m(parcel0, v1, NoticeState.CREATOR);
                    break;
                }
                case 2: {
                    counterpart0 = (Counterpart)baua.m(parcel0, v1, Counterpart.CREATOR);
                    break;
                }
                case 3: {
                    lifecycle0 = (Lifecycle)baua.m(parcel0, v1, Lifecycle.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartLocationSharingRequest(noticeState0, counterpart0, lifecycle0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartLocationSharingRequest[v];
    }
}

