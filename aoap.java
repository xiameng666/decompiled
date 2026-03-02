import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.metrics.MetricsContextImpl.FillContextImpl;

public final class aoap implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        aolw aolw0;
        aolo aolo0 = null;
        if(parcel0.readInt() == 1) {
            try {
                byte[] arr_b = parcel0.createByteArray();
                gftb.check(arr_b);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aolw.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                aolw0 = (aolw)hftv0;
            }
            catch(hfur | NullPointerException exception0) {
                throw new BadParcelableException(exception0);
            }
        }
        else {
            aolw0 = null;
        }
        ggdy ggdy0 = new ggdy();
        int v = parcel0.readInt();
        for(int v1 = 0; v1 < v; ++v1) {
            try {
                byte[] arr_b1 = parcel0.createByteArray();
                gftb.check(arr_b1);
                hftc hftc1 = hftc.a();
                ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aolq.a), arr_b1, 0, arr_b1.length, hftc1);
                ProtoLiteMessage.P_makeImmutable(hftv1);
                ggdy0.i(((aolq)hftv1));
            }
            catch(hfur | NullPointerException exception1) {
                throw new BadParcelableException(exception1);
            }
        }
        if(parcel0.readInt() == 1) {
            aolo0 = aolo.b(parcel0.readInt());
        }
        boolean z = parcel0.readInt() == 1;
        boolean z1 = parcel0.readInt() == 1;
        return parcel0.readInt() == 1 ? new MetricsContextImpl.FillContextImpl(aolw0, ggdy0.h(), aolo0, z, z1, true) : new MetricsContextImpl.FillContextImpl(aolw0, ggdy0.h(), aolo0, z, z1, false);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MetricsContextImpl.FillContextImpl[v];
    }
}

