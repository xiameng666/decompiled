import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.vision.barcode.Barcode.CalendarEvent;
import com.google.android.gms.vision.barcode.Barcode.ContactInfo;
import com.google.android.gms.vision.barcode.Barcode.DriverLicense;
import com.google.android.gms.vision.barcode.Barcode.Email;
import com.google.android.gms.vision.barcode.Barcode.GeoPoint;
import com.google.android.gms.vision.barcode.Barcode.Phone;
import com.google.android.gms.vision.barcode.Barcode.Sms;
import com.google.android.gms.vision.barcode.Barcode.UrlBookmark;
import com.google.android.gms.vision.barcode.Barcode.WiFi;
import com.google.android.gms.vision.barcode.Barcode;

public final class fatw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        double f = 0.0;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        String s = null;
        String s1 = null;
        Point[] arr_point = null;
        Barcode.Email barcode$Email0 = null;
        Barcode.Phone barcode$Phone0 = null;
        Barcode.Sms barcode$Sms0 = null;
        Barcode.WiFi barcode$WiFi0 = null;
        Barcode.UrlBookmark barcode$UrlBookmark0 = null;
        Barcode.GeoPoint barcode$GeoPoint0 = null;
        Barcode.CalendarEvent barcode$CalendarEvent0 = null;
        Barcode.ContactInfo barcode$ContactInfo0 = null;
        Barcode.DriverLicense barcode$DriverLicense0 = null;
        byte[] arr_b = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 6: {
                    arr_point = (Point[])baua.J(parcel0, v3, Point.CREATOR);
                    break;
                }
                case 7: {
                    barcode$Email0 = (Barcode.Email)baua.m(parcel0, v3, Barcode.Email.CREATOR);
                    break;
                }
                case 8: {
                    barcode$Phone0 = (Barcode.Phone)baua.m(parcel0, v3, Barcode.Phone.CREATOR);
                    break;
                }
                case 9: {
                    barcode$Sms0 = (Barcode.Sms)baua.m(parcel0, v3, Barcode.Sms.CREATOR);
                    break;
                }
                case 10: {
                    barcode$WiFi0 = (Barcode.WiFi)baua.m(parcel0, v3, Barcode.WiFi.CREATOR);
                    break;
                }
                case 11: {
                    barcode$UrlBookmark0 = (Barcode.UrlBookmark)baua.m(parcel0, v3, Barcode.UrlBookmark.CREATOR);
                    break;
                }
                case 12: {
                    barcode$GeoPoint0 = (Barcode.GeoPoint)baua.m(parcel0, v3, Barcode.GeoPoint.CREATOR);
                    break;
                }
                case 13: {
                    barcode$CalendarEvent0 = (Barcode.CalendarEvent)baua.m(parcel0, v3, Barcode.CalendarEvent.CREATOR);
                    break;
                }
                case 14: {
                    barcode$ContactInfo0 = (Barcode.ContactInfo)baua.m(parcel0, v3, Barcode.ContactInfo.CREATOR);
                    break;
                }
                case 15: {
                    barcode$DriverLicense0 = (Barcode.DriverLicense)baua.m(parcel0, v3, Barcode.DriverLicense.CREATOR);
                    break;
                }
                case 16: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 17: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 18: {
                    f = baua.b(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new Barcode(v1, s, s1, v2, arr_point, barcode$Email0, barcode$Phone0, barcode$Sms0, barcode$WiFi0, barcode$UrlBookmark0, barcode$GeoPoint0, barcode$CalendarEvent0, barcode$ContactInfo0, barcode$DriverLicense0, arr_b, z, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Barcode[v];
    }
}

