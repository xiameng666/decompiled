import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.data.StartServicePayload;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import java.util.HashSet;

public final class eqhf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        String s = null;
        Bundle bundle0 = null;
        StartServiceResponse startServiceResponse0 = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(1));
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v1);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    startServiceResponse0 = (StartServiceResponse)baua.m(parcel0, v1, StartServiceResponse.CREATOR);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s1 = baua.s(parcel0, v1);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new StartServicePayload(hashSet0, s, bundle0, startServiceResponse0, s1);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartServicePayload[v];
    }
}

