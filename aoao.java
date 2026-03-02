import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.metrics.MetricsContextImpl.FillContextImpl;
import com.google.android.gms.autofill.metrics.MetricsContextImpl;
import java.util.ArrayList;

public final class aoao implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        aomj aomj1;
        aomj aomj0;
        aohp aohp1;
        int v = parcel0.readInt();
        aohp aohp0 = aohp.a;
        try {
            byte[] arr_b = parcel0.createByteArray();
            if(arr_b == null) {
                aohp1 = aohp0;
            }
            else {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aohp0), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                aohp1 = (aohp)hftv0;
            }
        }
        catch(hfur unused_ex) {
            aohp1 = aohp0;
        }
        try {
            aomj0 = aomj.a;
            byte[] arr_b1 = parcel0.createByteArray();
            if(arr_b1 == null) {
                aomj1 = aomj0;
            }
            else {
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aomj0), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                aomj1 = (aomj)hftv1;
            }
        }
        catch(hfur unused_ex) {
            aomj1 = aomj0;
        }
        int v2 = parcel0.readInt();
        int v3 = parcel0.readInt();
        int v4 = parcel0.readInt();
        Object object0 = new MetricsContextImpl(v, aohp1, aomj1, v2, ggnf.a);
        object0.c = v3;
        for(int v1 = 0; v1 < v4; ++v1) {
            AutofillId autofillId0 = (AutofillId)parcel0.readTypedObject(AutofillId.CREATOR);
            Integer integer0 = parcel0.readInt();
            object0.a.put(autofillId0, integer0);
        }
        ArrayList arrayList0 = new ArrayList();
        parcel0.readTypedList(arrayList0, MetricsContextImpl.FillContextImpl.CREATOR);
        object0.b.k(arrayList0);
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MetricsContextImpl[v];
    }
}

