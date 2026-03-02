import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.TokenReceiver.Params;

public final class acpz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Encoding[] arr_encoding = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                arr_encoding = (Encoding[])baua.J(parcel0, v1, Encoding.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new TokenReceiver.Params(arr_encoding);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenReceiver.Params[v];
    }
}

