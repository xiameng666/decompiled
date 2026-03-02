import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.RecurrenceEntity;
import com.google.android.gms.reminders.model.RecurrenceInfoEntity;

public final class ejur implements Parcelable.Creator {
    public static void a(RecurrenceInfoEntity recurrenceInfoEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, recurrenceInfoEntity0.a, v, false);
        baub.v(parcel0, 3, recurrenceInfoEntity0.b, false);
        baub.z(parcel0, 4, recurrenceInfoEntity0.c);
        baub.z(parcel0, 5, recurrenceInfoEntity0.d);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        RecurrenceEntity recurrenceEntity0 = null;
        String s = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    recurrenceEntity0 = (RecurrenceEntity)baua.m(parcel0, v1, RecurrenceEntity.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    boolean0 = baua.n(parcel0, v1);
                    break;
                }
                case 5: {
                    boolean1 = baua.n(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RecurrenceInfoEntity(recurrenceEntity0, s, boolean0, boolean1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RecurrenceInfoEntity[v];
    }
}

