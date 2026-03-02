import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import java.util.List;

public final class attj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        MediaInfo mediaInfo0 = null;
        long[] arr_v = null;
        String s = null;
        List list0 = null;
        AdBreakStatus adBreakStatus0 = null;
        VideoInfo videoInfo0 = null;
        MediaLiveSeekableRange mediaLiveSeekableRange0 = null;
        MediaQueueData mediaQueueData0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        boolean z1 = false;
        double f = 0.0;
        double f1 = 0.0;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        while(parcel0.dataPosition() < v) {
            int v10 = parcel0.readInt();
            switch(((char)v10)) {
                case 2: {
                    mediaInfo0 = (MediaInfo)baua.m(parcel0, v10, MediaInfo.CREATOR);
                    break;
                }
                case 3: {
                    v7 = baua.i(parcel0, v10);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v10);
                    break;
                }
                case 5: {
                    f = baua.b(parcel0, v10);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v10);
                    break;
                }
                case 7: {
                    v3 = baua.f(parcel0, v10);
                    break;
                }
                case 8: {
                    v8 = baua.i(parcel0, v10);
                    break;
                }
                case 9: {
                    v9 = baua.i(parcel0, v10);
                    break;
                }
                case 10: {
                    f1 = baua.b(parcel0, v10);
                    break;
                }
                case 11: {
                    z = baua.D(parcel0, v10);
                    break;
                }
                case 12: {
                    arr_v = baua.I(parcel0, v10);
                    break;
                }
                case 13: {
                    v4 = baua.f(parcel0, v10);
                    break;
                }
                case 14: {
                    v5 = baua.f(parcel0, v10);
                    break;
                }
                case 15: {
                    s = baua.s(parcel0, v10);
                    break;
                }
                case 16: {
                    v6 = baua.f(parcel0, v10);
                    break;
                }
                case 17: {
                    list0 = baua.y(parcel0, v10, MediaQueueItem.CREATOR);
                    break;
                }
                case 18: {
                    z1 = baua.D(parcel0, v10);
                    break;
                }
                case 19: {
                    adBreakStatus0 = (AdBreakStatus)baua.m(parcel0, v10, AdBreakStatus.CREATOR);
                    break;
                }
                case 20: {
                    videoInfo0 = (VideoInfo)baua.m(parcel0, v10, VideoInfo.CREATOR);
                    break;
                }
                case 21: {
                    mediaLiveSeekableRange0 = (MediaLiveSeekableRange)baua.m(parcel0, v10, MediaLiveSeekableRange.CREATOR);
                    break;
                }
                case 22: {
                    mediaQueueData0 = (MediaQueueData)baua.m(parcel0, v10, MediaQueueData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v10);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaStatus(mediaInfo0, v7, v1, f, v2, v3, v8, v9, f1, z, arr_v, v4, v5, s, v6, list0, z1, adBreakStatus0, videoInfo0, mediaLiveSeekableRange0, mediaQueueData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaStatus[v];
    }
}

