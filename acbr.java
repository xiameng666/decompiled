import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.people.model.AvatarReference;

public final class acbr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        int v1 = 0;
        AvatarReference avatarReference0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    avatarReference0 = (AvatarReference)baua.m(parcel0, v2, AvatarReference.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContactPerson.ContactMethod(v1, s, avatarReference0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContactPerson.ContactMethod[v];
    }
}

