import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.CategoryInfoEntity;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.LocationGroupEntity;

public final class ejum implements Parcelable.Creator {
    public static void a(LocationGroupEntity locationGroupEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, locationGroupEntity0.a, false);
        baub.F(parcel0, 3, locationGroupEntity0.b);
        baub.t(parcel0, 5, locationGroupEntity0.c, v, false);
        baub.t(parcel0, 6, locationGroupEntity0.d, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Integer integer0 = null;
        ChainInfoEntity chainInfoEntity0 = null;
        CategoryInfoEntity categoryInfoEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 5: {
                    chainInfoEntity0 = (ChainInfoEntity)baua.m(parcel0, v1, ChainInfoEntity.CREATOR);
                    break;
                }
                case 6: {
                    categoryInfoEntity0 = (CategoryInfoEntity)baua.m(parcel0, v1, CategoryInfoEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationGroupEntity(s, integer0, chainInfoEntity0, categoryInfoEntity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationGroupEntity[v];
    }
}

