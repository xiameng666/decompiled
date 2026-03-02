import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.WeeklyPatternEntity;
import java.util.List;

public final class ejuy implements Parcelable.Creator {
    public static void a(WeeklyPatternEntity weeklyPatternEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.E(parcel0, 2, weeklyPatternEntity0.a);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                list0 = baua.v(parcel0, v1);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new WeeklyPatternEntity(list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new WeeklyPatternEntity[v];
    }
}

