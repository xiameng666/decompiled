import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import com.google.android.gms.reminders.model.YearlyPatternEntity;
import java.util.List;

public final class ejuz implements Parcelable.Creator {
    public static void a(YearlyPatternEntity yearlyPatternEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, yearlyPatternEntity0.a, v, false);
        baub.E(parcel0, 3, yearlyPatternEntity0.b);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        MonthlyPatternEntity monthlyPatternEntity0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    monthlyPatternEntity0 = (MonthlyPatternEntity)baua.m(parcel0, v1, MonthlyPatternEntity.CREATOR);
                    break;
                }
                case 3: {
                    list0 = baua.v(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new YearlyPatternEntity(monthlyPatternEntity0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new YearlyPatternEntity[v];
    }
}

