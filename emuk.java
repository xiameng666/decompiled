import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocationhistory.FrequentTrip.Metadata;
import com.google.android.gms.semanticlocationhistory.FrequentTrip.ModeDistribution;
import com.google.android.gms.semanticlocationhistory.FrequentTrip;
import java.util.List;

public final class emuk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        float f = 0.0f;
        List list0 = null;
        FrequentTrip.Metadata frequentTrip$Metadata0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    list0 = baua.y(parcel0, v5, PlaceCandidate.Identifier.CREATOR);
                    break;
                }
                case 2: {
                    frequentTrip$Metadata0 = (FrequentTrip.Metadata)baua.m(parcel0, v5, FrequentTrip.Metadata.CREATOR);
                    break;
                }
                case 3: {
                    list1 = baua.y(parcel0, v5, FrequentTrip.ModeDistribution.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 7: {
                    f = baua.c(parcel0, v5);
                    break;
                }
                case 8: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new FrequentTrip(list0, frequentTrip$Metadata0, list1, v1, v2, v3, f, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FrequentTrip[v];
    }
}

