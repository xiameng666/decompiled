import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.internal.GetSeCardsResponse;

public final class efnq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SecureElementStoredValue[] arr_secureElementStoredValue = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_secureElementStoredValue = (SecureElementStoredValue[])baua.J(parcel0, v1, SecureElementStoredValue.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetSeCardsResponse(arr_secureElementStoredValue);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetSeCardsResponse[v];
    }
}

