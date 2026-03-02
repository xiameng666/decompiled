import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.CalendarEventParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.ContactInfoParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.DriverLicenseParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.EmailParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.GeoPointParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.PhoneParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.SmsParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.UrlBookmarkParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.WiFiParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;

public final class hbru implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        Point[] arr_point = null;
        BarcodeParcel.EmailParcel barcodeParcel$EmailParcel0 = null;
        BarcodeParcel.PhoneParcel barcodeParcel$PhoneParcel0 = null;
        BarcodeParcel.SmsParcel barcodeParcel$SmsParcel0 = null;
        BarcodeParcel.WiFiParcel barcodeParcel$WiFiParcel0 = null;
        BarcodeParcel.UrlBookmarkParcel barcodeParcel$UrlBookmarkParcel0 = null;
        BarcodeParcel.GeoPointParcel barcodeParcel$GeoPointParcel0 = null;
        BarcodeParcel.CalendarEventParcel barcodeParcel$CalendarEventParcel0 = null;
        BarcodeParcel.ContactInfoParcel barcodeParcel$ContactInfoParcel0 = null;
        BarcodeParcel.DriverLicenseParcel barcodeParcel$DriverLicenseParcel0 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_point = (Point[])baua.J(parcel0, v3, Point.CREATOR);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    barcodeParcel$EmailParcel0 = (BarcodeParcel.EmailParcel)baua.m(parcel0, v3, BarcodeParcel.EmailParcel.CREATOR);
                    break;
                }
                case 8: {
                    barcodeParcel$PhoneParcel0 = (BarcodeParcel.PhoneParcel)baua.m(parcel0, v3, BarcodeParcel.PhoneParcel.CREATOR);
                    break;
                }
                case 9: {
                    barcodeParcel$SmsParcel0 = (BarcodeParcel.SmsParcel)baua.m(parcel0, v3, BarcodeParcel.SmsParcel.CREATOR);
                    break;
                }
                case 10: {
                    barcodeParcel$WiFiParcel0 = (BarcodeParcel.WiFiParcel)baua.m(parcel0, v3, BarcodeParcel.WiFiParcel.CREATOR);
                    break;
                }
                case 11: {
                    barcodeParcel$UrlBookmarkParcel0 = (BarcodeParcel.UrlBookmarkParcel)baua.m(parcel0, v3, BarcodeParcel.UrlBookmarkParcel.CREATOR);
                    break;
                }
                case 12: {
                    barcodeParcel$GeoPointParcel0 = (BarcodeParcel.GeoPointParcel)baua.m(parcel0, v3, BarcodeParcel.GeoPointParcel.CREATOR);
                    break;
                }
                case 13: {
                    barcodeParcel$CalendarEventParcel0 = (BarcodeParcel.CalendarEventParcel)baua.m(parcel0, v3, BarcodeParcel.CalendarEventParcel.CREATOR);
                    break;
                }
                case 14: {
                    barcodeParcel$ContactInfoParcel0 = (BarcodeParcel.ContactInfoParcel)baua.m(parcel0, v3, BarcodeParcel.ContactInfoParcel.CREATOR);
                    break;
                }
                case 15: {
                    barcodeParcel$DriverLicenseParcel0 = (BarcodeParcel.DriverLicenseParcel)baua.m(parcel0, v3, BarcodeParcel.DriverLicenseParcel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new BarcodeParcel(v1, s, s1, arr_b, arr_point, v2, barcodeParcel$EmailParcel0, barcodeParcel$PhoneParcel0, barcodeParcel$SmsParcel0, barcodeParcel$WiFiParcel0, barcodeParcel$UrlBookmarkParcel0, barcodeParcel$GeoPointParcel0, barcodeParcel$CalendarEventParcel0, barcodeParcel$ContactInfoParcel0, barcodeParcel$DriverLicenseParcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BarcodeParcel[v];
    }
}

