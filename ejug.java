import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.TimeEntity;

public final class ejug implements Parcelable.Creator {
    public static void a(DailyPatternEntity dailyPatternEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, dailyPatternEntity0.a, v, false);
        baub.F(parcel0, 3, dailyPatternEntity0.b);
        baub.z(parcel0, 4, dailyPatternEntity0.c);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TimeEntity timeEntity0 = null;
        Integer integer0 = null;
        Boolean boolean0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    timeEntity0 = (TimeEntity)baua.m(parcel0, v1, TimeEntity.CREATOR);
                    break;
                }
                case 3: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 4: {
                    boolean0 = baua.n(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DailyPatternEntity(timeEntity0, integer0, boolean0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DailyPatternEntity[v];
    }
}

