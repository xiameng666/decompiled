import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.auth.api.model.CreateAuthUriResponse;
import com.google.firebase.auth.api.model.StringList;
import java.util.List;

public final class goxq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        StringList stringList0 = null;
        List list0 = null;
        boolean z = false;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 6: {
                    stringList0 = (StringList)baua.m(parcel0, v1, StringList.CREATOR);
                    break;
                }
                case 7: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CreateAuthUriResponse(s, z, s1, z1, stringList0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CreateAuthUriResponse[v];
    }
}

