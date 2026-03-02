import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.semanticlocationhistory.FrequentPlace;
import com.google.android.gms.semanticlocationhistory.FrequentTrip;
import com.google.android.gms.semanticlocationhistory.Persona;
import com.google.android.gms.semanticlocationhistory.UserLocationProfile;
import java.util.List;

public final class emvh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        List list0 = null;
        List list1 = null;
        Persona persona0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, FrequentPlace.CREATOR);
                    break;
                }
                case 2: {
                    list1 = baua.y(parcel0, v2, FrequentTrip.CREATOR);
                    break;
                }
                case 3: {
                    persona0 = (Persona)baua.m(parcel0, v2, Persona.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserLocationProfile(list0, list1, persona0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserLocationProfile[v];
    }
}

