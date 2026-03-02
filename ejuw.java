import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.TaskIdEntity;

public final class ejuw implements Parcelable.Creator {
    public static void a(TaskIdEntity taskIdEntity0, Parcel parcel0) {
        int v = baub.a(parcel0);
        baub.v(parcel0, 3, taskIdEntity0.a, false);
        baub.v(parcel0, 4, taskIdEntity0.b, false);
        baub.c(parcel0, v);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TaskIdEntity(s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TaskIdEntity[v];
    }
}

