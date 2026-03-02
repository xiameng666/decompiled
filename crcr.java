import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

public final class crcr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        UserAttributeParcel userAttributeParcel0 = null;
        String s2 = null;
        EventParcel eventParcel0 = null;
        EventParcel eventParcel1 = null;
        EventParcel eventParcel2 = null;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 4: {
                    userAttributeParcel0 = (UserAttributeParcel)baua.m(parcel0, v4, UserAttributeParcel.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 6: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 8: {
                    eventParcel0 = (EventParcel)baua.m(parcel0, v4, EventParcel.CREATOR);
                    break;
                }
                case 9: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 10: {
                    eventParcel1 = (EventParcel)baua.m(parcel0, v4, EventParcel.CREATOR);
                    break;
                }
                case 11: {
                    v3 = baua.i(parcel0, v4);
                    break;
                }
                case 12: {
                    eventParcel2 = (EventParcel)baua.m(parcel0, v4, EventParcel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConditionalUserPropertyParcel(s, s1, userAttributeParcel0, v1, z, s2, eventParcel0, v2, eventParcel1, v3, eventParcel2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConditionalUserPropertyParcel[v];
    }
}

