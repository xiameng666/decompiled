import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetTransitPassRequest;
import com.google.android.gms.pay.TransitPassIssuer;

public final class dlfd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TransitPassIssuer[] arr_transitPassIssuer = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_transitPassIssuer = (TransitPassIssuer[])baua.J(parcel0, v1, TransitPassIssuer.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetTransitPassRequest(arr_transitPassIssuer);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTransitPassRequest[v];
    }
}

