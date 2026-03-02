import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.orchestration.BuyflowResponse;
import com.google.android.gms.wallet.shared.service.ServerResponse;

public final class fbtq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        hfyv hfyv0 = (hfyv)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)hfyv.a).jf(7, null)));
        ServerResponse serverResponse0 = (ServerResponse)ServerResponse.CREATOR.createFromParcel(parcel0);
        int v = hccg.a(parcel0.readInt());
        if(v == 0) {
            v = 1;
        }
        Object object0 = new BuyflowResponse(serverResponse0, hfyv0);
        object0.c = v;
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BuyflowResponse[v];
    }
}

