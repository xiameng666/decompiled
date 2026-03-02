import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.LatencyTracker;

public final class ajpo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        LatencyTracker latencyTracker0 = null;
        long v1 = 0L;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 4: {
                    latencyTracker0 = (LatencyTracker)baua.m(parcel0, v3, LatencyTracker.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new LatencyTracker(v2, s, v1, latencyTracker0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LatencyTracker[v];
    }
}

