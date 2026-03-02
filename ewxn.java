import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.time.dto.ParcelableDuration;
import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;

public final class ewxn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ParcelableDuration parcelableDuration0 = null;
        ParcelableDuration parcelableDuration1 = null;
        ParcelableDuration parcelableDuration2 = null;
        ParcelableDuration parcelableDuration3 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    parcelableDuration0 = (ParcelableDuration)baua.m(parcel0, v1, ParcelableDuration.CREATOR);
                    break;
                }
                case 2: {
                    parcelableDuration1 = (ParcelableDuration)baua.m(parcel0, v1, ParcelableDuration.CREATOR);
                    break;
                }
                case 3: {
                    parcelableDuration2 = (ParcelableDuration)baua.m(parcel0, v1, ParcelableDuration.CREATOR);
                    break;
                }
                case 4: {
                    parcelableDuration3 = (ParcelableDuration)baua.m(parcel0, v1, ParcelableDuration.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ParcelableClockAdjustmentPeriod(parcelableDuration0, parcelableDuration1, parcelableDuration2, parcelableDuration3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ParcelableClockAdjustmentPeriod[v];
    }
}

