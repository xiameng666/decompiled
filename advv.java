import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import java.util.List;

public final class advv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        List list0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v1, IdToken.CREATOR);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 10: {
                    s5 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Credential(s, s1, uri0, list0, s2, s3, s4, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Credential[v];
    }
}

