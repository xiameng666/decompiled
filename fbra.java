import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.service.ib.IbMerchantParameters;

public final class fbra implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readInt();
        String s = parcel0.readString();
        int v1 = parcel0.readByte();
        gkmh gkmh0 = (gkmh)gciq.f(parcel0, ((Parser)((ProtoLiteMessage)gkmh.a).jf(7, null)));
        return v1 == 0 ? new IbMerchantParameters(v, s, false, gkmh0) : new IbMerchantParameters(v, s, true, gkmh0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new IbMerchantParameters[v];
    }
}

