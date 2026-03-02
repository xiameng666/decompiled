import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.FeatureIdProtoEntity;

public final class ejue implements Parcelable.Creator {
    public static void a(ChainInfoEntity chainInfoEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 3, chainInfoEntity0.a, false);
        baub.t(parcel0, 4, chainInfoEntity0.b, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        FeatureIdProtoEntity featureIdProtoEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    featureIdProtoEntity0 = (FeatureIdProtoEntity)baua.m(parcel0, v1, FeatureIdProtoEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ChainInfoEntity(s, featureIdProtoEntity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ChainInfoEntity[v];
    }
}

