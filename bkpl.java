import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.family.v2.model.ContactPerson.ContactMethod;
import com.google.android.gms.family.v2.model.ContactPerson;
import com.google.android.gms.people.model.AvatarReference;
import java.util.List;

public final class bkpl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Long long0 = null;
        AvatarReference avatarReference0 = null;
        List list0 = null;
        Uri uri0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 3: {
                    avatarReference0 = (AvatarReference)baua.m(parcel0, v1, AvatarReference.CREATOR);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v1, ContactPerson.ContactMethod.CREATOR);
                    break;
                }
                case 5: {
                    uri0 = (Uri)baua.m(parcel0, v1, Uri.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ContactPerson(s, long0, avatarReference0, list0, uri0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ContactPerson[v];
    }
}

