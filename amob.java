import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.data.PaymentCard;
import j..time.YearMonth;

public final class amob implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        amoi amoi0;
        YearMonth yearMonth0;
        String s = parcel0.readString();
        String s1 = parcel0.readString();
        String s2 = parcel0.readString();
        if(parcel0.readInt() == 1) {
            int v = parcel0.readInt();
            yearMonth0 = YearMonth.of(parcel0.readInt(), v);
        }
        else {
            yearMonth0 = null;
        }
        if(parcel0.readInt() == 1) {
            try {
                byte[] arr_b = parcel0.createByteArray();
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)amoi.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                amoi0 = (amoi)hftv0;
            }
            catch(hfur hfur0) {
                throw new BadParcelableException(hfur0);
            }
        }
        else {
            amoi0 = null;
        }
        int v1 = parcel0.readInt();
        amon amon0 = new amon(s);
        return s1 == null ? new PaymentCard(amon0, null, s2, yearMonth0, amoi0, v1) : new PaymentCard(amon0, new amon(s1), s2, yearMonth0, amoi0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaymentCard[v];
    }
}

