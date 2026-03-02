import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.MonthlyPatternEntity;
import java.util.List;

public final class ejun implements Parcelable.Creator {
    public static void a(MonthlyPatternEntity monthlyPatternEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.E(parcel0, 2, monthlyPatternEntity0.a);
        baub.F(parcel0, 4, monthlyPatternEntity0.b);
        baub.F(parcel0, 5, monthlyPatternEntity0.c);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        Integer integer0 = null;
        Integer integer1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    list0 = baua.v(parcel0, v1);
                    break;
                }
                case 4: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 5: {
                    integer1 = baua.q(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new MonthlyPatternEntity(list0, integer0, integer1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MonthlyPatternEntity[v];
    }
}

