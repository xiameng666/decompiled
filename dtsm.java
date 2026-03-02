import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.pass.idcard.model.MdocDetailsModel;

public final class dtsm implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        String s = parcel0.readString();
        gftb.check(s);
        try {
            byte[] arr_b = parcel0.createByteArray();
            gftb.check(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtxx.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = parcel0.createByteArray();
            gftb.check(arr_b1);
            hftc hftc1 = hftc.a();
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gumi.a), arr_b1, 0, arr_b1.length, hftc1);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            return new MdocDetailsModel(s, ((gtxx)hftv0), ((gumi)hftv1));
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Failed to parse MdocDetailsModel proto bytes.", hfur0);
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdocDetailsModel[v];
    }
}

