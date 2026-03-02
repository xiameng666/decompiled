import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.gencode.server.api.ExternalDeviceInfoEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesResponseEntity;
import java.util.ArrayList;
import java.util.HashSet;

public final class alhk implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        ArrayList arrayList0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                arrayList0 = baua.y(parcel0, v1, ExternalDeviceInfoEntity.CREATOR);
                hashSet0.add(Integer.valueOf(2));
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        if(parcel0.dataPosition() == v) {
            return new GetMyDevicesResponseEntity(hashSet0, arrayList0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetMyDevicesResponseEntity[v];
    }
}

