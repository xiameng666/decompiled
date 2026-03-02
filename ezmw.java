import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest.SettingChange;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

public final class ezmw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        UdcWriteLocalSettingsRequest.SettingChange[] arr_udcWriteLocalSettingsRequest$SettingChange = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 2) {
                arr_udcWriteLocalSettingsRequest$SettingChange = (UdcWriteLocalSettingsRequest.SettingChange[])baua.J(parcel0, v1, UdcWriteLocalSettingsRequest.SettingChange.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new UdcWriteLocalSettingsRequest(arr_udcWriteLocalSettingsRequest$SettingChange);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UdcWriteLocalSettingsRequest[v];
    }
}

