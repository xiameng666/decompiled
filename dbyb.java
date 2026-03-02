import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.ContactInfo;

public final class dbyb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        String s = null;
        String s1 = null;
        Uri uri0 = null;
        ContactInfo contactInfo0 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    contactInfo0 = (ContactInfo)baua.m(parcel0, v2, ContactInfo.CREATOR);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Contact(v1, s, s1, uri0, z, contactInfo0, z1, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Contact[v];
    }
}

