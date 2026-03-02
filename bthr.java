import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;

public final class bthr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GoogleHelp googleHelp0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    googleHelp0 = (GoogleHelp)baua.m(parcel0, v1, GoogleHelp.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SupportRequestHelp(googleHelp0, s, s1, s2, s3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SupportRequestHelp[v];
    }
}

