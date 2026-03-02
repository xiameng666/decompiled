import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.TapEvent;
import com.google.android.gms.tapandpay.internal.firstparty.SendTapEventRequest;

public final class etgr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TapEvent tapEvent0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                tapEvent0 = (TapEvent)baua.m(parcel0, v1, TapEvent.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SendTapEventRequest(tapEvent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendTapEventRequest[v];
    }
}

