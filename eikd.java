import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.personalsafety.detection.FinderTagInfo;
import com.google.android.gms.personalsafety.storage.LocationScan;
import com.google.android.gms.personalsafety.storage.ScannedDeviceInfo;
import com.google.android.gms.personalsafety.storage.TagDeviceData;
import java.util.List;

public final class eikd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LatLng latLng0 = null;
        TagDeviceData tagDeviceData0 = null;
        LatLng latLng1 = null;
        List list0 = null;
        FinderTagInfo finderTagInfo0 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 2: {
                    latLng0 = (LatLng)baua.m(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 3: {
                    tagDeviceData0 = (TagDeviceData)baua.m(parcel0, v2, TagDeviceData.CREATOR);
                    break;
                }
                case 4: {
                    latLng1 = (LatLng)baua.m(parcel0, v2, LatLng.CREATOR);
                    break;
                }
                case 5: {
                    list0 = baua.y(parcel0, v2, LocationScan.CREATOR);
                    break;
                }
                case 6: {
                    finderTagInfo0 = (FinderTagInfo)baua.m(parcel0, v2, FinderTagInfo.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ScannedDeviceInfo(v1, latLng0, tagDeviceData0, latLng1, list0, finderTagInfo0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ScannedDeviceInfo[v];
    }
}

