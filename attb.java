import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;

public final class attb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        long v1 = 0L;
        long v2 = 0L;
        MediaInfo mediaInfo0 = null;
        MediaQueueData mediaQueueData0 = null;
        Boolean boolean0 = null;
        long[] arr_v = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        double f = 0.0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    mediaInfo0 = (MediaInfo)baua.m(parcel0, v3, MediaInfo.CREATOR);
                    break;
                }
                case 3: {
                    mediaQueueData0 = (MediaQueueData)baua.m(parcel0, v3, MediaQueueData.CREATOR);
                    break;
                }
                case 4: {
                    boolean0 = baua.n(parcel0, v3);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 6: {
                    f = baua.b(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_v = baua.I(parcel0, v3);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 10: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 11: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 12: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                case 13: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaLoadRequestData(mediaInfo0, mediaQueueData0, boolean0, v1, f, arr_v, aurf.o(s), s1, s2, s3, s4, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaLoadRequestData[v];
    }
}

