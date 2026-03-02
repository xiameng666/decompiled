import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.AddressParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.ContactInfoParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.EmailParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.PersonNameParcel;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel.PhoneParcel;

public final class hbrz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        BarcodeParcel.PersonNameParcel barcodeParcel$PersonNameParcel0 = null;
        String s = null;
        String s1 = null;
        BarcodeParcel.PhoneParcel[] arr_barcodeParcel$PhoneParcel = null;
        BarcodeParcel.EmailParcel[] arr_barcodeParcel$EmailParcel = null;
        String[] arr_s = null;
        BarcodeParcel.AddressParcel[] arr_barcodeParcel$AddressParcel = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    barcodeParcel$PersonNameParcel0 = (BarcodeParcel.PersonNameParcel)baua.m(parcel0, v1, BarcodeParcel.PersonNameParcel.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    arr_barcodeParcel$PhoneParcel = (BarcodeParcel.PhoneParcel[])baua.J(parcel0, v1, BarcodeParcel.PhoneParcel.CREATOR);
                    break;
                }
                case 5: {
                    arr_barcodeParcel$EmailParcel = (BarcodeParcel.EmailParcel[])baua.J(parcel0, v1, BarcodeParcel.EmailParcel.CREATOR);
                    break;
                }
                case 6: {
                    arr_s = baua.K(parcel0, v1);
                    break;
                }
                case 7: {
                    arr_barcodeParcel$AddressParcel = (BarcodeParcel.AddressParcel[])baua.J(parcel0, v1, BarcodeParcel.AddressParcel.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BarcodeParcel.ContactInfoParcel(barcodeParcel$PersonNameParcel0, s, s1, arr_barcodeParcel$PhoneParcel, arr_barcodeParcel$EmailParcel, arr_s, arr_barcodeParcel$AddressParcel);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BarcodeParcel.ContactInfoParcel[v];
    }
}

