import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.threadnetwork.GetAllActiveCredentialsRequest;
import com.google.android.gms.threadnetwork.ThreadNetworkClientOptions;

public final class evvy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Long long0 = null;
        long v1 = 0L;
        ThreadNetworkClientOptions threadNetworkClientOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    long0 = baua.r(parcel0, v2);
                    break;
                }
                case 3: {
                    threadNetworkClientOptions0 = (ThreadNetworkClientOptions)baua.m(parcel0, v2, ThreadNetworkClientOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetAllActiveCredentialsRequest(v1, long0, threadNetworkClientOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetAllActiveCredentialsRequest[v];
    }
}

