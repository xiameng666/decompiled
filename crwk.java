import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportChannel;
import com.google.android.gms.mobiledataplan.carriersupport.CarrierSupportInfo;

public final class crwk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        CarrierSupportChannel[] arr_carrierSupportChannel = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    arr_carrierSupportChannel = (CarrierSupportChannel[])baua.J(parcel0, v1, CarrierSupportChannel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CarrierSupportInfo(s, s1, arr_carrierSupportChannel);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CarrierSupportInfo[v];
    }
}

