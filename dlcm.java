import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.DataChangeListenerResponse;
import com.google.android.gms.pay.DataChangeListenerType;
import com.google.android.gms.pay.EmoneyCardFinishSetupStatusData;
import com.google.android.gms.pay.SmartTapTransmissionData;

public final class dlcm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DataChangeListenerType dataChangeListenerType0 = null;
        SmartTapTransmissionData smartTapTransmissionData0 = null;
        EmoneyCardFinishSetupStatusData emoneyCardFinishSetupStatusData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    dataChangeListenerType0 = (DataChangeListenerType)baua.m(parcel0, v1, DataChangeListenerType.CREATOR);
                    break;
                }
                case 2: {
                    smartTapTransmissionData0 = (SmartTapTransmissionData)baua.m(parcel0, v1, SmartTapTransmissionData.CREATOR);
                    break;
                }
                case 4: {
                    emoneyCardFinishSetupStatusData0 = (EmoneyCardFinishSetupStatusData)baua.m(parcel0, v1, EmoneyCardFinishSetupStatusData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DataChangeListenerResponse(dataChangeListenerType0, smartTapTransmissionData0, emoneyCardFinishSetupStatusData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DataChangeListenerResponse[v];
    }
}

