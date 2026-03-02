import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.RecurrenceEndEntity;

public final class ejuq implements Parcelable.Creator {
    public static void a(RecurrenceEndEntity recurrenceEndEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, recurrenceEndEntity0.a, v, false);
        baub.F(parcel0, 4, recurrenceEndEntity0.b);
        baub.z(parcel0, 5, recurrenceEndEntity0.c);
        baub.t(parcel0, 6, recurrenceEndEntity0.d, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DateTimeEntity dateTimeEntity0 = null;
        Integer integer0 = null;
        Boolean boolean0 = null;
        DateTimeEntity dateTimeEntity1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    dateTimeEntity0 = (DateTimeEntity)baua.m(parcel0, v1, DateTimeEntity.CREATOR);
                    break;
                }
                case 4: {
                    integer0 = baua.q(parcel0, v1);
                    break;
                }
                case 5: {
                    boolean0 = baua.n(parcel0, v1);
                    break;
                }
                case 6: {
                    dateTimeEntity1 = (DateTimeEntity)baua.m(parcel0, v1, DateTimeEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RecurrenceEndEntity(dateTimeEntity0, integer0, boolean0, dateTimeEntity1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RecurrenceEndEntity[v];
    }
}

