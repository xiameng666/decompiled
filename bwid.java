import com.google.android.chimera.config.ModuleManager.FeatureRequestListener;
import j..util.Map.-EL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class bwid extends ModuleManager.FeatureRequestListener {
    final bwib a;
    final String b;
    final bwif c;

    public bwid(bwib bwib0, String s, bwif bwif0) {
        this.a = bwib0;
        this.b = s;
        this.c = bwif0;
        super();
    }

    @Override  // com.google.android.chimera.config.ModuleManager$FeatureRequestProgressListener
    public final void onRequestComplete(int v) {
        long v2;
        this.detach();
        bwib bwib0 = this.a;
        bwib0.onRequestComplete(v);
        switch(v) {
            case 0: {
                ((ggtj)bwif.a.h()).B("%s module request returned FEATURE_REQUEST_RESULT_SUCCESS", this.b);
                break;
            }
            case 1: {
                ((ggtj)bwif.a.j()).B("%s module request returned FEATURE_REQUEST_RESULT_FAILURE", this.b);
                break;
            }
            default: {
                if(v == 2) {
                    ((ggtj)bwif.a.j()).B("%s module request returned FEATURE_REQUEST_RESULT_FAILURE_NO_RETRY", this.b);
                }
                else {
                    ((ggtj)bwif.a.j()).P("%s module request returned unknown code %d", this.b, v);
                }
            }
        }
        if(v == 1) {
            bwif bwif0 = this.c;
            String s = this.b;
            Map map0 = bwif0.e;
            int v1 = ((Number)Map.-EL.getOrDefault(map0, s, Integer.valueOf(0))).intValue();
            htyb htyb0 = htyb.a;
            if(Long.compare(v1, htyb0.d().c()) >= 0) {
                ((ggtj)bwif.a.h()).B("Max retry count reached for module %s", s);
                v2 = 0L;
            }
            else {
                map0.put(s, Integer.valueOf(v1 + 1));
                v2 = htyb0.d().a() * ((long)Math.pow(2.0, v1));
            }
            if(v2 > 0L) {
                ((ggtj)bwif.a.h()).Q("Scheduling retry for module %s in %d seconds.", s, v2);
                bbku bbku0 = bwif0.d;
                if(bbku0 == null) {
                    ibuq.j("scheduler");
                    bbku0 = null;
                }
                bbku0.g(new bwic(bwif0, s, bwib0), v2, TimeUnit.SECONDS);
            }
            return;
        }
        this.c.e.remove(this.b);
    }
}

