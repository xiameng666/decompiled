import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocation.PlaceCandidate.Identifier;
import com.google.android.gms.semanticlocation.PlaceCandidate.Point;
import com.google.android.gms.semanticlocationhistory.FrequentPlace.FrequentPlaceMetadata;
import com.google.android.gms.semanticlocationhistory.FrequentPlace;
import java.util.ArrayList;
import java.util.List;

public final class emui implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        PlaceCandidate.Identifier placeCandidate$Identifier0 = null;
        PlaceCandidate.Point placeCandidate$Point0 = null;
        FrequentPlace.FrequentPlaceMetadata frequentPlace$FrequentPlaceMetadata0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    placeCandidate$Identifier0 = (PlaceCandidate.Identifier)baua.m(parcel0, v3, PlaceCandidate.Identifier.CREATOR);
                    break;
                }
                case 2: {
                    placeCandidate$Point0 = (PlaceCandidate.Point)baua.m(parcel0, v3, PlaceCandidate.Point.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    frequentPlace$FrequentPlaceMetadata0 = (FrequentPlace.FrequentPlaceMetadata)baua.m(parcel0, v3, FrequentPlace.FrequentPlaceMetadata.CREATOR);
                    break;
                }
                case 5: {
                    baua.v(parcel0, v3);
                    break;
                }
                case 6: {
                    int v4 = baua.g(parcel0, v3);
                    int v5 = parcel0.dataPosition();
                    if(v4 == 0) {
                        list0 = null;
                        continue;
                    }
                    else {
                        ArrayList arrayList0 = new ArrayList();
                        int v6 = parcel0.readInt();
                        for(int v7 = 0; v7 < v6; ++v7) {
                            arrayList0.add(Float.valueOf(parcel0.readFloat()));
                        }
                        parcel0.setDataPosition(v5 + v4);
                        list0 = arrayList0;
                        break;
                    }
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new FrequentPlace(placeCandidate$Identifier0, placeCandidate$Point0, v1, frequentPlace$FrequentPlaceMetadata0, list0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FrequentPlace[v];
    }
}

