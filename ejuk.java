import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;

public final class ejuk implements Parcelable.Creator {
    public static void a(FeatureIdProtoEntity featureIdProtoEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.I(parcel0, 2, featureIdProtoEntity0.a);
        baub.I(parcel0, 3, featureIdProtoEntity0.b);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Long long0 = null;
        Long long1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 3: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new FeatureIdProtoEntity(long0, long1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FeatureIdProtoEntity[v];
    }
}

