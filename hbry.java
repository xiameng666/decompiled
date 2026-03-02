import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.CalendarDateTimeParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.CalendarEventParcel;

public final class hbry implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        BarcodeParcel.CalendarDateTimeParcel barcodeParcel$CalendarDateTimeParcel0 = null;
        BarcodeParcel.CalendarDateTimeParcel barcodeParcel$CalendarDateTimeParcel1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    s4 = baua.s(parcel0, v1);
                    break;
                }
                case 6: {
                    barcodeParcel$CalendarDateTimeParcel0 = (BarcodeParcel.CalendarDateTimeParcel)baua.m(parcel0, v1, BarcodeParcel.CalendarDateTimeParcel.CREATOR);
                    break;
                }
                case 7: {
                    barcodeParcel$CalendarDateTimeParcel1 = (BarcodeParcel.CalendarDateTimeParcel)baua.m(parcel0, v1, BarcodeParcel.CalendarDateTimeParcel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BarcodeParcel.CalendarEventParcel(s, s1, s2, s3, s4, barcodeParcel$CalendarDateTimeParcel0, barcodeParcel$CalendarDateTimeParcel1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BarcodeParcel.CalendarEventParcel[v];
    }
}

