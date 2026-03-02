import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;

public final class atth implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        MediaInfo mediaInfo0 = null;
        long[] arr_v = null;
        String s = null;
        double f = 0.0;
        double f1 = 0.0;
        double f2 = 0.0;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    mediaInfo0 = (MediaInfo)baua.m(parcel0, v2, MediaInfo.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    f = baua.b(parcel0, v2);
                    break;
                }
                case 6: {
                    f1 = baua.b(parcel0, v2);
                    break;
                }
                case 7: {
                    f2 = baua.b(parcel0, v2);
                    break;
                }
                case 8: {
                    arr_v = baua.I(parcel0, v2);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaQueueItem(mediaInfo0, v1, z, f, f1, f2, arr_v, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaQueueItem[v];
    }
}

