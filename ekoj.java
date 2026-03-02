import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

public final class ekoj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        HarmfulAppsData[] arr_harmfulAppsData = null;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    arr_harmfulAppsData = (HarmfulAppsData[])baua.J(parcel0, v3, HarmfulAppsData.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new HarmfulAppsInfo(v2, arr_harmfulAppsData, v1, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HarmfulAppsInfo[v];
    }
}

