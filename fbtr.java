import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.orchestration.BuyflowSubmitRequest;

public final class fbtr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        byte[] arr_b = parcel0.createByteArray();
        gers gers0 = (gers)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gers.b).jf(7, null)));
        hfyv hfyv0 = (hfyv)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)hfyv.a).jf(7, null)));
        return new BuyflowSubmitRequest(((Account)Account.CREATOR.createFromParcel(parcel0)), parcel0.createByteArray(), arr_b, gers0, hfyv0, parcel0.createStringArrayList());
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BuyflowSubmitRequest[v];
    }
}

