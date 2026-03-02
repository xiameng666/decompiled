import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.multidevice.XdFeatureListenerOptions;

public final class csrk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_b = baua.E(parcel0, v1);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        ibuq.f(arr_b, "protoBytes");
        Object object0 = ((Parser)((ProtoLiteMessage)cteo.a).jf(7, null)).parseFrom(arr_b);
        ibuq.e(object0, "parseFrom(...)");
        return new XdFeatureListenerOptions(((cteo)object0));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new XdFeatureListenerOptions[v];
    }
}

