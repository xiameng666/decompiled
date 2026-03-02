import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.data.SecondDeviceAuthPayload;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import java.util.ArrayList;
import java.util.HashSet;

public final class eqhd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        HashSet hashSet0 = new HashSet();
        byte[] arr_b = null;
        String s = null;
        String s1 = null;
        ArrayList arrayList0 = null;
        int v1 = 0;
        boolean z = false;
        ArrayList arrayList1 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    arrayList1 = baua.y(parcel0, v2, StartSessionResponse.CREATOR);
                    hashSet0.add(Integer.valueOf(2));
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    hashSet0.add(Integer.valueOf(3));
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v2);
                    hashSet0.add(Integer.valueOf(4));
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(5));
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v2);
                    hashSet0.add(Integer.valueOf(6));
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v2);
                    hashSet0.add(Integer.valueOf(7));
                    break;
                }
                case 8: {
                    arrayList0 = baua.y(parcel0, v2, BootstrapAccount.CREATOR);
                    hashSet0.add(Integer.valueOf(8));
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        if(parcel0.dataPosition() == v) {
            return new SecondDeviceAuthPayload(hashSet0, arrayList1, v1, arr_b, s, s1, z, arrayList0);
        }
        throw new batz("Overread allowed size end=" + v, parcel0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SecondDeviceAuthPayload[v];
    }
}

