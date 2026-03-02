import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.threadnetwork.GetPreferredCredentialsRequest;
import com.google.android.gms.threadnetwork.ThreadNetworkClientOptions;

public final class evwa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ThreadNetworkClientOptions threadNetworkClientOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                threadNetworkClientOptions0 = (ThreadNetworkClientOptions)baua.m(parcel0, v1, ThreadNetworkClientOptions.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetPreferredCredentialsRequest(threadNetworkClientOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPreferredCredentialsRequest[v];
    }
}

