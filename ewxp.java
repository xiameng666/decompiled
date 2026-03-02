import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.dto.ParcelableInstant;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;
import com.google.android.gms.time.trustedtime.dto.ParcelableTicks;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.List;

public final class ewxp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ParcelableDuration parcelableDuration0 = null;
        ParcelableInstant parcelableInstant0 = null;
        ParcelableTicks parcelableTicks0 = null;
        List list0 = null;
        List list1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    parcelableDuration0 = (ParcelableDuration)baua.m(parcel0, v1, ParcelableDuration.CREATOR);
                    break;
                }
                case 2: {
                    parcelableInstant0 = (ParcelableInstant)baua.m(parcel0, v1, ParcelableInstant.CREATOR);
                    break;
                }
                case 3: {
                    parcelableTicks0 = (ParcelableTicks)baua.m(parcel0, v1, ParcelableTicks.CREATOR);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v1, ParcelableClockAdjustmentPeriod.CREATOR);
                    break;
                }
                case 5: {
                    list1 = baua.y(parcel0, v1, ParcelableClockAdjustmentPeriod.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TimeSignalResult(parcelableDuration0, parcelableInstant0, parcelableTicks0, list0, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TimeSignalResult[v];
    }
}

