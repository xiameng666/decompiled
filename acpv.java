import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.Snoop.Params;

public final class acpv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        boolean z = false;
        boolean z1 = false;
        Encoding[] arr_encoding = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    arr_encoding = (Encoding[])baua.J(parcel0, v2, Encoding.CREATOR);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Snoop.Params(arr_encoding, z, z1, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Snoop.Params[v];
    }
}

