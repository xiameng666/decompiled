import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.data.SourceDeviceInfo;
import com.google.android.gms.smartdevice.d2d.data.TargetDeviceInfo;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakeOptionFlags;
import com.google.android.gms.smartdevice.quickstart.QuickStartHandshakePayload;
import com.google.android.gms.smartdevice.quickstart.RestoreAnytimeContext;
import java.util.HashSet;

public final class eqxn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        long v1 = 0L;
        TargetDeviceInfo targetDeviceInfo0 = null;
        SourceDeviceInfo sourceDeviceInfo0 = null;
        RestoreAnytimeContext restoreAnytimeContext0 = null;
        QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 2: {
                    TargetDeviceInfo targetDeviceInfo1 = (TargetDeviceInfo)baua.m(parcel0, v2, TargetDeviceInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    targetDeviceInfo0 = targetDeviceInfo1;
                    break;
                }
                case 3: {
                    SourceDeviceInfo sourceDeviceInfo1 = (SourceDeviceInfo)baua.m(parcel0, v2, SourceDeviceInfo.CREATOR);
                    hashSet0.add(Integer.valueOf(3));
                    sourceDeviceInfo0 = sourceDeviceInfo1;
                    break;
                }
                case 4: {
                    RestoreAnytimeContext restoreAnytimeContext1 = (RestoreAnytimeContext)baua.m(parcel0, v2, RestoreAnytimeContext.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    restoreAnytimeContext0 = restoreAnytimeContext1;
                    break;
                }
                case 5: {
                    QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags1 = (QuickStartHandshakeOptionFlags)baua.m(parcel0, v2, QuickStartHandshakeOptionFlags.CREATOR);
                    hashSet0.add(Integer.valueOf(5));
                    quickStartHandshakeOptionFlags0 = quickStartHandshakeOptionFlags1;
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new QuickStartHandshakePayload(hashSet0, v1, targetDeviceInfo0, sourceDeviceInfo0, restoreAnytimeContext0, quickStartHandshakeOptionFlags0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new QuickStartHandshakePayload[v];
    }
}

