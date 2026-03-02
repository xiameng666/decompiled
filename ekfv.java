import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.romanesco.protomodel.DeviceVersionEntity;
import com.google.android.gms.romanesco.protomodel.SourceStatsEntity;
import java.util.List;

public final class ekfv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        Long long0 = null;
        List list0 = null;
        String s1 = null;
        Long long1 = null;
        Long long2 = null;
        DeviceVersionEntity deviceVersionEntity0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    list0 = baua.y(parcel0, v1, SourceStatsEntity.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                case 6: {
                    long2 = baua.r(parcel0, v1);
                    break;
                }
                case 7: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 8: {
                    deviceVersionEntity0 = (DeviceVersionEntity)baua.m(parcel0, v1, DeviceVersionEntity.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new BackedUpContactsPerDeviceEntity(s, long0, list0, s1, long1, long2, deviceVersionEntity0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new BackedUpContactsPerDeviceEntity[v];
    }
}

