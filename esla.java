import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.AvailableOtherPaymentMethodsWithInfo;
import com.google.android.gms.tapandpay.firstparty.GetAvailableOtherPaymentMethodsResponse;

public final class esla implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int[] arr_v = null;
        AvailableOtherPaymentMethodsWithInfo[] arr_availableOtherPaymentMethodsWithInfo = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_v = baua.H(parcel0, v1);
                    break;
                }
                case 2: {
                    arr_availableOtherPaymentMethodsWithInfo = (AvailableOtherPaymentMethodsWithInfo[])baua.J(parcel0, v1, AvailableOtherPaymentMethodsWithInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAvailableOtherPaymentMethodsResponse(arr_v, arr_availableOtherPaymentMethodsWithInfo);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAvailableOtherPaymentMethodsResponse[v];
    }
}

