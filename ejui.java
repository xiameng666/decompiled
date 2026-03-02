import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.TimeEntity;

public final class ejui implements Parcelable.Creator {
    public static void a(DateTimeEntity dateTimeEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.F(parcel0, 2, dateTimeEntity0.a);
        baub.F(parcel0, 3, dateTimeEntity0.b);
        baub.F(parcel0, 4, dateTimeEntity0.c);
        baub.t(parcel0, 5, dateTimeEntity0.d, v, false);
        baub.F(parcel0, 6, dateTimeEntity0.e);
        baub.F(parcel0, 7, dateTimeEntity0.f);
        baub.I(parcel0, 8, dateTimeEntity0.g);
        baub.z(parcel0, 9, dateTimeEntity0.h);
        baub.z(parcel0, 10, dateTimeEntity0.i);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Integer integer0 = null;
        Integer integer1 = null;
        Integer integer2 = null;
        TimeEntity timeEntity0 = null;
        Integer integer3 = null;
        Integer integer4 = null;
        Long long0 = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 3: {
                    integer1 = baua.q(parcel0, v1);
                    break;
                }
                case 4: {
                    integer2 = baua.q(parcel0, v1);
                    break;
                }
                case 5: {
                    timeEntity0 = (TimeEntity)baua.m(parcel0, v1, TimeEntity.CREATOR);
                    break;
                }
                case 6: {
                    integer3 = baua.q(parcel0, v1);
                    break;
                }
                case 7: {
                    integer4 = baua.q(parcel0, v1);
                    break;
                }
                case 8: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 9: {
                    boolean0 = baua.n(parcel0, v1);
                    break;
                }
                case 10: {
                    boolean1 = baua.n(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DateTimeEntity(integer0, integer1, integer2, timeEntity0, integer3, integer4, long0, boolean0, boolean1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DateTimeEntity[v];
    }
}

