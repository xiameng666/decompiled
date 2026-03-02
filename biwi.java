import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.TokenWrapper;
import com.google.android.gms.dtdi.core.internal.SendPayloadParams;

public final class biwi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TokenWrapper tokenWrapper0 = null;
        byte[] arr_b = null;
        IBinder iBinder0 = null;
        String s = null;
        ChannelInfo channelInfo0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    tokenWrapper0 = (TokenWrapper)baua.m(parcel0, v1, TokenWrapper.CREATOR);
                    break;
                }
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    channelInfo0 = (ChannelInfo)baua.m(parcel0, v1, ChannelInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SendPayloadParams(tokenWrapper0, arr_b, iBinder0, s, channelInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SendPayloadParams[v];
    }
}

