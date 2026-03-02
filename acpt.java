import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;

public final class acpt implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DsssEncoding dsssEncoding0 = null;
        int v1 = 0;
        DtmfEncoding dtmfEncoding0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    dsssEncoding0 = (DsssEncoding)baua.m(parcel0, v2, DsssEncoding.CREATOR);
                    break;
                }
                case 4: {
                    dtmfEncoding0 = (DtmfEncoding)baua.m(parcel0, v2, DtmfEncoding.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Encoding(v1, dsssEncoding0, dtmfEncoding0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Encoding[v];
    }
}

