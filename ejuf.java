import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.reminders.model.CustomizedSnoozePresetEntity;
import com.google.android.gms.reminders.model.TimeEntity;

public final class ejuf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        TimeEntity timeEntity0 = null;
        TimeEntity timeEntity1 = null;
        TimeEntity timeEntity2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    timeEntity0 = (TimeEntity)baua.m(parcel0, v1, TimeEntity.CREATOR);
                    break;
                }
                case 3: {
                    timeEntity1 = (TimeEntity)baua.m(parcel0, v1, TimeEntity.CREATOR);
                    break;
                }
                case 4: {
                    timeEntity2 = (TimeEntity)baua.m(parcel0, v1, TimeEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CustomizedSnoozePresetEntity(timeEntity0, timeEntity1, timeEntity2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CustomizedSnoozePresetEntity[v];
    }
}

