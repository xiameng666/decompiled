import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;

public final class efyj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus0 = null;
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus0 = null;
        ContactsConsentsConfig contactsConsentsConfig0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    contactsConsentsCoarseStatus0 = (ContactsConsentsCoarseStatus)baua.m(parcel0, v1, ContactsConsentsCoarseStatus.CREATOR);
                    break;
                }
                case 2: {
                    contactsConsentsDetailedStatus0 = (ContactsConsentsDetailedStatus)baua.m(parcel0, v1, ContactsConsentsDetailedStatus.CREATOR);
                    break;
                }
                case 3: {
                    contactsConsentsConfig0 = (ContactsConsentsConfig)baua.m(parcel0, v1, ContactsConsentsConfig.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContactsConsentsStatus(contactsConsentsCoarseStatus0, contactsConsentsDetailedStatus0, contactsConsentsConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContactsConsentsStatus[v];
    }
}

