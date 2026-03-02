import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ParcelByteArray;
import com.google.android.gms.nearby.internal.connection.ParcelableOneWayMessage;

public final class czhj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ParcelByteArray parcelByteArray0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    parcelByteArray0 = (ParcelByteArray)baua.m(parcel0, v1, ParcelByteArray.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ParcelableOneWayMessage(s, parcelByteArray0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelableOneWayMessage[v];
    }
}

