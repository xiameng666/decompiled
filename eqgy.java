import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.data.FolsomDataPayload;
import com.google.android.gms.smartdevice.d2d.data.FolsomSecurityDomainAndKeys;
import java.util.ArrayList;
import java.util.HashSet;

public final class eqgy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    arrayList0 = baua.y(parcel0, v1, FolsomSecurityDomainAndKeys.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new FolsomDataPayload(hashSet0, s, arrayList0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FolsomDataPayload[v];
    }
}

