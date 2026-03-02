import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.data.CredentialForIme;
import com.google.android.gms.autofill.data.SensitiveStringForIme;

public final class amni implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        SensitiveStringForIme sensitiveStringForIme0 = null;
        String s1 = null;
        String s2 = null;
        Icon icon0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    sensitiveStringForIme0 = (SensitiveStringForIme)baua.m(parcel0, v1, SensitiveStringForIme.CREATOR);
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
                    icon0 = (Icon)baua.m(parcel0, v1, Icon.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CredentialForIme(s, sensitiveStringForIme0, s1, s2, icon0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CredentialForIme[v];
    }
}

