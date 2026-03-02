import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import java.util.List;

public final class attf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        long v4 = 0L;
        String s = null;
        String s1 = null;
        String s2 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    mediaQueueContainerMetadata0 = (MediaQueueContainerMetadata)baua.m(parcel0, v5, MediaQueueContainerMetadata.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    list0 = baua.y(parcel0, v5, MediaQueueItem.CREATOR);
                    break;
                }
                case 9: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 10: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 11: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaQueueData(s, s1, v1, s2, mediaQueueContainerMetadata0, v2, list0, v3, v4, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaQueueData[v];
    }
}

