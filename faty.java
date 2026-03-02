import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.vision.barcode.Barcode.CalendarDateTime;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;

public final class faty implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        Barcode.CalendarDateTime barcode$CalendarDateTime0 = null;
        Barcode.CalendarDateTime barcode$CalendarDateTime1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    barcode$CalendarDateTime0 = (Barcode.CalendarDateTime)baua.m(parcel0, v1, Barcode.CalendarDateTime.CREATOR);
                    break;
                }
                case 8: {
                    barcode$CalendarDateTime1 = (Barcode.CalendarDateTime)baua.m(parcel0, v1, Barcode.CalendarDateTime.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Barcode.CalendarEvent(s, s1, s2, s3, s4, barcode$CalendarDateTime0, barcode$CalendarDateTime1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Barcode.CalendarEvent[v];
    }
}

