import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

public final class fdft implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        ChannelImpl channelImpl0 = null;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    channelImpl0 = (ChannelImpl)baua.m(parcel0, v4, ChannelImpl.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ChannelEventParcelable(channelImpl0, v1, v3, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ChannelEventParcelable[v];
    }
}

