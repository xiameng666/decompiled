import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import java.util.HashSet;

public final class eque implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        byte[] arr_b = null;
        HandshakeData handshakeData0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    arr_b = baua.E(parcel0, v1);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    handshakeData0 = (HandshakeData)baua.m(parcel0, v1, HandshakeData.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new PostSetupAuthData(hashSet0, arr_b, handshakeData0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PostSetupAuthData[v];
    }
}

