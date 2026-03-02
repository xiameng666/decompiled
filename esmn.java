import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.SendTransmissionEventRequest;
import com.google.android.gms.tapandpay.firstparty.TransmissionEvent;

public final class esmn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TransmissionEvent transmissionEvent0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                transmissionEvent0 = (TransmissionEvent)baua.m(parcel0, v1, TransmissionEvent.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new SendTransmissionEventRequest(transmissionEvent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendTransmissionEventRequest[v];
    }
}

