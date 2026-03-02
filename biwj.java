import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.IntermediateAccountInfo;
import com.google.android.gms.dtdi.core.internal.SetAccountInfosParams;

public final class biwj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IntermediateAccountInfo[] arr_intermediateAccountInfo = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_intermediateAccountInfo = (IntermediateAccountInfo[])baua.J(parcel0, v1, IntermediateAccountInfo.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetAccountInfosParams(arr_intermediateAccountInfo, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetAccountInfosParams[v];
    }
}

