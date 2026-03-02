import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import java.util.List;

public final class atsz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        MediaMetadata mediaMetadata0 = null;
        List list0 = null;
        TextTrackStyle textTrackStyle0 = null;
        String s2 = null;
        List list1 = null;
        List list2 = null;
        String s3 = null;
        VastAdsRequest vastAdsRequest0 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    mediaMetadata0 = (MediaMetadata)baua.m(parcel0, v4, MediaMetadata.CREATOR);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 7: {
                    list0 = baua.y(parcel0, v4, MediaTrack.CREATOR);
                    break;
                }
                case 8: {
                    textTrackStyle0 = (TextTrackStyle)baua.m(parcel0, v4, TextTrackStyle.CREATOR);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 10: {
                    list1 = baua.y(parcel0, v4, AdBreakInfo.CREATOR);
                    break;
                }
                case 11: {
                    list2 = baua.y(parcel0, v4, AdBreakClipInfo.CREATOR);
                    break;
                }
                case 12: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 13: {
                    vastAdsRequest0 = (VastAdsRequest)baua.m(parcel0, v4, VastAdsRequest.CREATOR);
                    break;
                }
                case 14: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 15: {
                    s4 = baua.s(parcel0, v4);
                    break;
                }
                case 16: {
                    s5 = baua.s(parcel0, v4);
                    break;
                }
                case 17: {
                    s6 = baua.s(parcel0, v4);
                    break;
                }
                case 18: {
                    s7 = baua.s(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new MediaInfo(s, v3, s1, mediaMetadata0, v1, list0, textTrackStyle0, s2, list1, list2, s3, vastAdsRequest0, v2, s4, s5, s6, s7);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MediaInfo[v];
    }
}

