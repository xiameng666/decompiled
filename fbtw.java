import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.wallet.service.orchestration.FetchPaySeCardsResponse;

public final class fbtw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        SecureElementStoredValue[] arr_secureElementStoredValue = new SecureElementStoredValue[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_secureElementStoredValue[v1] = (SecureElementStoredValue)SecureElementStoredValue.CREATOR.createFromParcel(parcel0);
        }
        return new FetchPaySeCardsResponse(arr_secureElementStoredValue);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FetchPaySeCardsResponse[v];
    }
}

