import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;

public final class abwl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        Feature[] arr_feature = null;
        String s3 = null;
        ScoringConfig scoringConfig0 = null;
        boolean z = false;
        boolean z1 = false;
        int v1 = 1;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    arr_feature = (Feature[])baua.J(parcel0, v2, Feature.CREATOR);
                    break;
                }
                case 11: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 12: {
                    scoringConfig0 = (ScoringConfig)baua.m(parcel0, v2, ScoringConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisterSectionInfo(s, s1, z, v1, z1, s2, arr_feature, s3, scoringConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisterSectionInfo[v];
    }
}

