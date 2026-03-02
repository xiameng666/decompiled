import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googleone.smui.selection.ItemCell;

public final class buse implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        hiwq hiwq0;
        ibuq.f(parcel0, "parcel");
        ibuq.f(parcel0, "parcel");
        byte[] arr_b = parcel0.createByteArray();
        hiwu hiwu0 = null;
        if(arr_b == null) {
            hiwq0 = null;
        }
        else {
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hiwq.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            hiwq0 = (hiwq)hftv0;
        }
        ibuq.f(parcel0, "parcel");
        byte[] arr_b1 = parcel0.createByteArray();
        if(arr_b1 != null) {
            ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hiwu.a), arr_b1, 0, arr_b1.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv1);
            hiwu0 = (hiwu)hftv1;
        }
        return new ItemCell(hiwq0, hiwu0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ItemCell[v];
    }
}

