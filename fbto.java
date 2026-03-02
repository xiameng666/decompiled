import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.orchestration.BuyflowInitializeRequest;

public final class fbto implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        hfyv hfyv0 = (hfyv)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)hfyv.a).jf(7, null)));
        return new BuyflowInitializeRequest(((Account)Account.CREATOR.createFromParcel(parcel0)), parcel0.createByteArray(), hfyv0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BuyflowInitializeRequest[v];
    }
}

