import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;

public final class cnpp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        float f = 0.0f;
        PlaceEntity placeEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    placeEntity0 = (PlaceEntity)baua.m(parcel0, v1, PlaceEntity.CREATOR);
                    break;
                }
                case 2: {
                    f = baua.c(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlaceLikelihoodEntity(placeEntity0, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlaceLikelihoodEntity[v];
    }
}

