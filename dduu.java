import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;

public final class dduu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Contact[] arr_contact = null;
        Contact[] arr_contact1 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    arr_contact = (Contact[])baua.J(parcel0, v1, Contact.CREATOR);
                    break;
                }
                case 2: {
                    arr_contact1 = (Contact[])baua.J(parcel0, v1, Contact.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateSelectedContactsParams(arr_contact, arr_contact1, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateSelectedContactsParams[v];
    }
}

