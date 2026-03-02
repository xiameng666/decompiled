import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.threadnetwork.GetCredentialsByExtendedPanIdRequest;
import com.google.android.gms.threadnetwork.ThreadNetworkClientOptions;

public final class evvz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        byte[] arr_b = null;
        ThreadNetworkClientOptions threadNetworkClientOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 2: {
                    threadNetworkClientOptions0 = (ThreadNetworkClientOptions)baua.m(parcel0, v1, ThreadNetworkClientOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetCredentialsByExtendedPanIdRequest(arr_b, threadNetworkClientOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetCredentialsByExtendedPanIdRequest[v];
    }
}

