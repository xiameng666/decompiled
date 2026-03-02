import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.ui.tapandpay.TapAndPayConsumerVerificationResponse;

public final class gdfv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        return new TapAndPayConsumerVerificationResponse(((hcbr)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)hcbr.a).jf(7, null)))), parcel0.readInt());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TapAndPayConsumerVerificationResponse[v];
    }
}

