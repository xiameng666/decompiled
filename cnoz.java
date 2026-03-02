import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.HierarchicalPlaceLikelihoodEntity;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.List;

public final class cnoz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PlaceEntity placeEntity0 = null;
        List list0 = null;
        int v1 = 0;
        float f = 0.0f;
        float f1 = 0.0f;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    placeEntity0 = (PlaceEntity)baua.m(parcel0, v2, PlaceEntity.CREATOR);
                    break;
                }
                case 2: {
                    f = baua.c(parcel0, v2);
                    break;
                }
                case 3: {
                    f1 = baua.c(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 5: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new HierarchicalPlaceLikelihoodEntity(placeEntity0, f, f1, v1, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HierarchicalPlaceLikelihoodEntity[v];
    }
}

