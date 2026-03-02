import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.firstparty.RichCardArtAttributesParcelable;
import com.google.android.gms.tapandpay.firstparty.SeInfo;

public final class esmk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        RichCardArtAttributesParcelable richCardArtAttributesParcelable0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    richCardArtAttributesParcelable0 = (RichCardArtAttributesParcelable)baua.m(parcel0, v2, RichCardArtAttributesParcelable.CREATOR);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SeInfo(v1, s, s1, richCardArtAttributesParcelable0, s2, s3, s4, s5);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SeInfo[v];
    }
}

