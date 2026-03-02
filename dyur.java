import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.secard.model.SeCommuterPassModel;

public final class dyur implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        try {
            byte[] arr_b = parcel0.createByteArray();
            batl.s(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dylc.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = parcel0.createByteArray();
            gfsx gfsx0 = arr_b1 == null ? gfqx.a : gfsx.m(((GooglePaymentMethodId)bauc.a(arr_b1, GooglePaymentMethodId.CREATOR)));
            byte[] arr_b2 = parcel0.createByteArray();
            batl.s(arr_b2);
            hftc hftc1 = hftc.a();
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gutc.a), arr_b2, 0, arr_b2.length, hftc1);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            byte[] arr_b3 = parcel0.createByteArray();
            batl.s(arr_b3);
            hftc hftc2 = hftc.a();
            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gumi.a), arr_b3, 0, arr_b3.length, hftc2);
            ProtoLiteMessage.P_makeImmutable(hftv2);
            return new SeCommuterPassModel(((dylc)hftv0), gfsx0, ((gutc)hftv1), ((gumi)hftv2));
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Failed to parse SeCommuterPassModel proto bytes.", hfur0);
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SeCommuterPassModel[v];
    }
}

