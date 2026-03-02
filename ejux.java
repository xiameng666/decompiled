import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.TimeEntity;

public final class ejux implements Parcelable.Creator {
    public static void a(TimeEntity timeEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.F(parcel0, 2, timeEntity0.a);
        baub.F(parcel0, 3, timeEntity0.b);
        baub.F(parcel0, 4, timeEntity0.c);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Integer integer0 = null;
        Integer integer1 = null;
        Integer integer2 = null;
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
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TimeEntity(integer0, integer1, integer2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TimeEntity[v];
    }
}

