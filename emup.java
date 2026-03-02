import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocationhistory.Persona.LocationAffinity;

public final class emup implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        long v1 = 0L;
        PlaceCandidate.Identifier placeCandidate$Identifier0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    placeCandidate$Identifier0 = (PlaceCandidate.Identifier)baua.m(parcel0, v2, PlaceCandidate.Identifier.CREATOR);
                    break;
                }
                case 2: {
                    f = baua.c(parcel0, v2);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 4: {
                    f1 = baua.c(parcel0, v2);
                    break;
                }
                case 5: {
                    f2 = baua.c(parcel0, v2);
                    break;
                }
                case 6: {
                    f3 = baua.c(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Persona.LocationAffinity(placeCandidate$Identifier0, f, v1, f1, f2, f3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Persona.LocationAffinity[v];
    }
}

