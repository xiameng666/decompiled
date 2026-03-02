import android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint;
import android.media.MediaCodecInfo.VideoCapabilities;
import java.util.List;

final class moq {
    public static int a(boolean z) {
        try {
            lwg lwg0 = new lwg();
            lwg0.c("video/avc");
            lwh lwh0 = new lwh(lwg0);
            if(lwh0.o != null) {
                List list0 = mpf.h(lwh0, z, false);
                for(int v = 0; v < ((ggna)list0).c; ++v) {
                    if(((mop)list0.get(v)).d != null) {
                        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = ((mop)list0.get(v)).d.getVideoCapabilities();
                        if(mediaCodecInfo$VideoCapabilities0 != null) {
                            List list1 = mediaCodecInfo$VideoCapabilities0.getSupportedPerformancePoints();
                            if(list1 != null && !list1.isEmpty()) {
                                return moq.b(list1, new MediaCodecInfo.VideoCapabilities.PerformancePoint(0x500, 720, 60));
                            }
                        }
                    }
                }
            }
        }
        catch(mpc unused_ex) {
        }
        return 0;
    }

    public static int b(List list0, MediaCodecInfo.VideoCapabilities.PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint0) {
        for(int v = 0; v < list0.size(); ++v) {
            if(((MediaCodecInfo.VideoCapabilities.PerformancePoint)list0.get(v)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint0)) {
                return 2;
            }
        }
        return 1;
    }
}

