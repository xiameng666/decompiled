import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.secard.model.SePrepaidCardModel;
import j..util.Optional;

public final class dyut implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Optional optional0;
        try {
            byte[] arr_b = parcel0.createByteArray();
            batl.s(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dylc.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            byte[] arr_b1 = parcel0.createByteArray();
            if(arr_b1 == null) {
                optional0 = Optional.empty();
            }
            else {
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dylb.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                optional0 = Optional.of(((dylb)hftv1));
            }
            Optional optional1 = Optional.ofNullable(parcel0.createByteArray()).map(new dyus());
            byte[] arr_b2 = parcel0.createByteArray();
            batl.s(arr_b2);
            hftc hftc2 = hftc.a();
            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gumi.a), arr_b2, 0, arr_b2.length, hftc2);
            ProtoLiteMessage.P_makeImmutable(hftv2);
            byte[] arr_b3 = parcel0.createByteArray();
            if(arr_b3 == null) {
                return new SePrepaidCardModel(((dylc)hftv0), optional0, optional1, ((gumi)hftv2), Optional.empty());
            }
            hftc hftc3 = hftc.a();
            ProtoLiteMessage hftv3 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)dyib.a), arr_b3, 0, arr_b3.length, hftc3);
            ProtoLiteMessage.P_makeImmutable(hftv3);
            return new SePrepaidCardModel(((dylc)hftv0), optional0, optional1, ((gumi)hftv2), Optional.of(((dyib)hftv3)));
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Failed to parse SePrepaidCardModel proto bytes.", hfur0);
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SePrepaidCardModel[v];
    }
}

