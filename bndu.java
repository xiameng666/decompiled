import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;

public final class bndu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        KeyHandle keyHandle0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    keyHandle0 = (KeyHandle)baua.m(parcel0, v1, KeyHandle.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisteredKey(keyHandle0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisteredKey[v];
    }
}

