import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.locationsharingreporter.Lifecycle;
import com.google.android.gms.locationsharingreporter.OutgoingShareDetails;
import com.google.android.gms.locationsharingreporter.OutgoingShareState;

public final class coce implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Lifecycle lifecycle0 = null;
        OutgoingShareState outgoingShareState0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    lifecycle0 = (Lifecycle)baua.m(parcel0, v1, Lifecycle.CREATOR);
                    break;
                }
                case 3: {
                    outgoingShareState0 = (OutgoingShareState)baua.m(parcel0, v1, OutgoingShareState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new OutgoingShareDetails(s, lifecycle0, outgoingShareState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new OutgoingShareDetails[v];
    }
}

