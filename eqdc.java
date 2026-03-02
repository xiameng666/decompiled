import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.HashSet;

public final class eqdc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        SourceDevice sourceDevice0 = null;
        boolean z = false;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    sourceDevice0 = (SourceDevice)baua.m(parcel0, v5, SourceDevice.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v5);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v5);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v5);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    v3 = baua.f(parcel0, v5);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    v4 = baua.f(parcel0, v5);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new TargetConnectionArgs(hashSet0, sourceDevice0, z, v1, v2, v3, v4);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TargetConnectionArgs[v];
    }
}

