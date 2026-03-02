import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.vision.barcode.Barcode.Address;
import com.google.android.gms.vision.barcode.Barcode.ContactInfo;
import com.google.android.gms.vision.barcode.Barcode.Email;
import com.google.android.gms.vision.barcode.Barcode.PersonName;
import com.google.android.gms.vision.barcode.Barcode.Phone;

public final class fatz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Barcode.PersonName barcode$PersonName0 = null;
        String s = null;
        String s1 = null;
        Barcode.Phone[] arr_barcode$Phone = null;
        Barcode.Email[] arr_barcode$Email = null;
        String[] arr_s = null;
        Barcode.Address[] arr_barcode$Address = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    barcode$PersonName0 = (Barcode.PersonName)baua.m(parcel0, v1, Barcode.PersonName.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_barcode$Phone = (Barcode.Phone[])baua.J(parcel0, v1, Barcode.Phone.CREATOR);
                    break;
                }
                case 6: {
                    arr_barcode$Email = (Barcode.Email[])baua.J(parcel0, v1, Barcode.Email.CREATOR);
                    break;
                }
                case 7: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 8: {
                    arr_barcode$Address = (Barcode.Address[])baua.J(parcel0, v1, Barcode.Address.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new Barcode.ContactInfo(barcode$PersonName0, s, s1, arr_barcode$Phone, arr_barcode$Email, arr_s, arr_barcode$Address);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Barcode.ContactInfo[v];
    }
}

