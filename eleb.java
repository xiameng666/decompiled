import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall.Response;

public final class eleb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Status status0 = null;
        NativeApiInfo nativeApiInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    status0 = (Status)baua.m(parcel0, v1, Status.CREATOR);
                    break;
                }
                case 2: {
                    nativeApiInfo0 = (NativeApiInfo)baua.m(parcel0, v1, NativeApiInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetNativeApiInfoCall.Response(status0, nativeApiInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetNativeApiInfoCall.Response[v];
    }
}

