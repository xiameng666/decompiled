import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public final class acbs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        String s = null;
        String s1 = null;
        Long long0 = null;
        AvatarReference avatarReference0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    long0 = baua.r(parcel0, v2);
                    break;
                }
                case 5: {
                    avatarReference0 = (AvatarReference)baua.m(parcel0, v2, AvatarReference.CREATOR);
                    break;
                }
                case 6: {
                    list0 = baua.y(parcel0, v2, ContactPerson.ContactMethod.CREATOR);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContactPerson(s, s1, long0, avatarReference0, list0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContactPerson[v];
    }
}

