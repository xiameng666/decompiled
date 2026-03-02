import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenBroadcaster.Params;

public final class acpx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = -1;
        byte[] arr_b = null;
        int v2 = 0;
        Encoding[] arr_encoding = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_encoding = (Encoding[])baua.J(parcel0, v3, Encoding.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new TokenBroadcaster.Params(arr_b, v2, arr_encoding, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenBroadcaster.Params[v];
    }
}

