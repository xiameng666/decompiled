import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.gencode.server.api.DeviceClassifierEntity;
import com.google.android.gms.auth.proximity.gencode.server.api.ToggleEasyUnlockRequestEntity;
import java.util.HashSet;

public final class alhl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        boolean z = false;
        DeviceClassifierEntity deviceClassifierEntity0 = null;
        String s = null;
        String s1 = null;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    z = baua.D(parcel0, v1);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    deviceClassifierEntity0 = (DeviceClassifierEntity)baua.m(parcel0, v1, DeviceClassifierEntity.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v1);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    z2 = baua.D(parcel0, v1);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new ToggleEasyUnlockRequestEntity(hashSet0, z, deviceClassifierEntity0, z1, s, z2, s1);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ToggleEasyUnlockRequestEntity[v];
    }
}

