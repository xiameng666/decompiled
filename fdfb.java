import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import com.google.android.gms.wearable.internal.WebIconParcelable;

public final class fdfb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        WebIconParcelable webIconParcelable0 = null;
        String s2 = null;
        String s3 = null;
        Float float0 = null;
        AppWearDetailsParcelable appWearDetailsParcelable0 = null;
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
                    webIconParcelable0 = (WebIconParcelable)baua.m(parcel0, v1, WebIconParcelable.CREATOR);
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
                case 6: {
                    float0 = baua.p(parcel0, v1);
                    break;
                }
                case 7: {
                    appWearDetailsParcelable0 = (AppWearDetailsParcelable)baua.m(parcel0, v1, AppWearDetailsParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AppParcelable(s, s1, webIconParcelable0, s2, s3, float0, appWearDetailsParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppParcelable[v];
    }
}

