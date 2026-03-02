import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.DateTimeEntity;
import com.google.android.gms.reminders.model.RecurrenceStartEntity;

public final class ejus implements Parcelable.Creator {
    public static void a(RecurrenceStartEntity recurrenceStartEntity0, Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, recurrenceStartEntity0.a, v, false);
        baub.c(parcel0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        DateTimeEntity dateTimeEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                dateTimeEntity0 = (DateTimeEntity)baua.m(parcel0, v1, DateTimeEntity.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new RecurrenceStartEntity(dateTimeEntity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RecurrenceStartEntity[v];
    }
}

