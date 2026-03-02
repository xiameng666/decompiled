import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DailyPatternEntity;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import com.google.android.gms.reminders.model.YearlyPatternEntity;

public final class ejup implements Parcelable.Creator {
    public static void a(RecurrenceEntity recurrenceEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.F(parcel0, 2, recurrenceEntity0.a);
        baub.F(parcel0, 3, recurrenceEntity0.b);
        baub.t(parcel0, 4, recurrenceEntity0.c, v, false);
        baub.t(parcel0, 5, recurrenceEntity0.d, v, false);
        baub.t(parcel0, 6, recurrenceEntity0.e, v, false);
        baub.t(parcel0, 7, recurrenceEntity0.f, v, false);
        baub.t(parcel0, 8, recurrenceEntity0.g, v, false);
        baub.t(parcel0, 9, recurrenceEntity0.h, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Integer integer0 = null;
        Integer integer1 = null;
        RecurrenceStartEntity recurrenceStartEntity0 = null;
        RecurrenceEndEntity recurrenceEndEntity0 = null;
        DailyPatternEntity dailyPatternEntity0 = null;
        WeeklyPatternEntity weeklyPatternEntity0 = null;
        MonthlyPatternEntity monthlyPatternEntity0 = null;
        YearlyPatternEntity yearlyPatternEntity0 = null;
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
                    recurrenceStartEntity0 = (RecurrenceStartEntity)baua.m(parcel0, v1, RecurrenceStartEntity.CREATOR);
                    break;
                }
                case 5: {
                    recurrenceEndEntity0 = (RecurrenceEndEntity)baua.m(parcel0, v1, RecurrenceEndEntity.CREATOR);
                    break;
                }
                case 6: {
                    dailyPatternEntity0 = (DailyPatternEntity)baua.m(parcel0, v1, DailyPatternEntity.CREATOR);
                    break;
                }
                case 7: {
                    weeklyPatternEntity0 = (WeeklyPatternEntity)baua.m(parcel0, v1, WeeklyPatternEntity.CREATOR);
                    break;
                }
                case 8: {
                    monthlyPatternEntity0 = (MonthlyPatternEntity)baua.m(parcel0, v1, MonthlyPatternEntity.CREATOR);
                    break;
                }
                case 9: {
                    yearlyPatternEntity0 = (YearlyPatternEntity)baua.m(parcel0, v1, YearlyPatternEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RecurrenceEntity(integer0, integer1, recurrenceStartEntity0, recurrenceEndEntity0, dailyPatternEntity0, weeklyPatternEntity0, monthlyPatternEntity0, yearlyPatternEntity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RecurrenceEntity[v];
    }
}

