import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetPassesResponse;
import com.google.android.gms.pay.PassInstance;

public final class dleg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PassInstance[] arr_passInstance = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_passInstance = (PassInstance[])baua.J(parcel0, v1, PassInstance.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetPassesResponse(arr_passInstance);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPassesResponse[v];
    }
}

