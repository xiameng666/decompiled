import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorTransferInfo;
import java.util.HashSet;

public final class adua implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        int v1 = 0;
        AuthenticatorTransferInfo authenticatorTransferInfo0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    authenticatorTransferInfo0 = (AuthenticatorTransferInfo)baua.m(parcel0, v2, AuthenticatorTransferInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new AuthenticatorAnnotatedData(hashSet0, v1, authenticatorTransferInfo0, s, s1, s2);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthenticatorAnnotatedData[v];
    }
}

