import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.GetMyDevicesRequestEntity;
import java.util.HashSet;

public final class alhj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        DeviceClassifierEntity deviceClassifierEntity0 = null;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    z1 = baua.D(parcel0, v3);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    deviceClassifierEntity0 = (DeviceClassifierEntity)baua.m(parcel0, v3, DeviceClassifierEntity.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    v1 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new GetMyDevicesRequestEntity(hashSet0, z1, z, deviceClassifierEntity0, v1, v2);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetMyDevicesRequestEntity[v];
    }
}

