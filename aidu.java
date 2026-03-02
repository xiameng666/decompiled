import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class aidu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Uri uri0 = null;
        String s4 = null;
        String s5 = null;
        List list0 = null;
        String s6 = null;
        String s7 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 9: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    list0 = baua.y(parcel0, v2, Scope.CREATOR);
                    break;
                }
                case 11: {
                    s6 = baua.s(parcel0, v2);
                    break;
                }
                case 12: {
                    s7 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleSignInAccount(s, s1, s2, s3, uri0, s4, v1, s5, list0, s6, s7);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleSignInAccount[v];
    }
}

