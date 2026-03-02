import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.AddressEntity;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;
import com.google.android.gms.reminders.model.LocationEntity;

public final class ejul implements Parcelable.Creator {
    public static void a(LocationEntity locationEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.B(parcel0, 2, locationEntity0.a);
        baub.B(parcel0, 3, locationEntity0.b);
        baub.v(parcel0, 4, locationEntity0.c, false);
        baub.F(parcel0, 5, locationEntity0.d);
        baub.F(parcel0, 6, locationEntity0.e);
        baub.t(parcel0, 7, locationEntity0.f, v, false);
        baub.v(parcel0, 8, locationEntity0.g, false);
        baub.v(parcel0, 9, locationEntity0.i, false);
        baub.t(parcel0, 10, locationEntity0.h, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Double double0 = null;
        Double double1 = null;
        String s = null;
        Integer integer0 = null;
        Integer integer1 = null;
        FeatureIdProtoEntity featureIdProtoEntity0 = null;
        String s1 = null;
        AddressEntity addressEntity0 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    double0 = baua.o(parcel0, v1);
                    break;
                }
                case 3: {
                    double1 = baua.o(parcel0, v1);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 6: {
                    integer1 = baua.q(parcel0, v1);
                    break;
                }
                case 7: {
                    featureIdProtoEntity0 = (FeatureIdProtoEntity)baua.m(parcel0, v1, FeatureIdProtoEntity.CREATOR);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 10: {
                    addressEntity0 = (AddressEntity)baua.m(parcel0, v1, AddressEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationEntity(double0, double1, s, integer0, integer1, featureIdProtoEntity0, s1, addressEntity0, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationEntity[v];
    }
}

