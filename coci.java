import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.Counterpart;
import com.google.android.gms.locationsharingreporter.OutgoingShareDetails;
import com.google.android.gms.locationsharingreporter.Share;

public final class coci implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        OutgoingShareDetails outgoingShareDetails0 = null;
        int v1 = 0;
        Counterpart counterpart0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    counterpart0 = (Counterpart)baua.m(parcel0, v2, Counterpart.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    outgoingShareDetails0 = (OutgoingShareDetails)baua.m(parcel0, v2, OutgoingShareDetails.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Share(s, counterpart0, v1, outgoingShareDetails0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Share[v];
    }
}

