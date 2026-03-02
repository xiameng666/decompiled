import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.paymentbundle.api.CryptoParameters;

public final class etpt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        gtht gtht0;
        int v = parcel0.readInt();
        byte[] arr_b = new byte[v];
        parcel0.readByteArray(arr_b);
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtht.a), arr_b, 0, v, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            gtht0 = (gtht)hftv0;
        }
        catch(hfur unused_ex) {
            return null;
        }
        byte[] arr_b1 = new byte[parcel0.readInt()];
        parcel0.readByteArray(arr_b1);
        return new CryptoParameters(gtht0, arr_b1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CryptoParameters[v];
    }
}

