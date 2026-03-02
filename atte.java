import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

public final class atte implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        double f = 0.0;
        String s = null;
        List list0 = null;
        List list1 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    list0 = baua.y(parcel0, v2, MediaMetadata.CREATOR);
                    break;
                }
                case 5: {
                    list1 = baua.y(parcel0, v2, WebImage.CREATOR);
                    break;
                }
                case 6: {
                    f = baua.b(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaQueueContainerMetadata(v1, s, list0, list1, f);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaQueueContainerMetadata[v];
    }
}

