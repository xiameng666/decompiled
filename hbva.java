import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.document.detect.DocumentDetector;

public final class hbva extends MobileVisionBase implements DocumentDetector {
    public static final int a;

    public hbva(hawd hawd0, hbuw hbuw0) {
        hbvg hbvg0 = (hbvg)((hbvb)hawd0.e(hbvb.class)).b(hbuw0);
        hbqy hbqy0 = hbri.b("play-services-mlkit-document-scanning");
        super(hbvg0, ((havx)hawd0.e(havx.class)).a());
        ggdy ggdy0 = new ggdy();
        int[] arr_v = hbuw0.a;
        for(int v = 0; v < arr_v.length; ++v) {
            ggdy0.i(hbiy.b(arr_v[v]));
        }
        hbqy0.c(new hbuz(ggdy0), hbko.dp);
    }

    @Override  // azty
    public final Feature[] gm() {
        return new Feature[]{hawq.q};
    }
}

