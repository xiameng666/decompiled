import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.Map;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

public final class hbtv implements Callable {
    public final MobileVisionBase a;
    public final hbtp b;

    public hbtv(MobileVisionBase mobileVisionBase0, hbtp hbtp0) {
        this.a = mobileVisionBase0;
        this.b = hbtp0;
    }

    @Override
    public final Object call() {
        Object object0;
        hbqn hbqn0;
        hbrm.a();
        hbrm.a();
        MobileVisionBase mobileVisionBase0 = this.a;
        hbtp hbtp0 = this.b;
        if(Boolean.parseBoolean("")) {
            Map map0 = hbqn.b;
            if(map0.get("detectorTaskWithResource#run") == null) {
                map0.put("detectorTaskWithResource#run", new hbqn());
            }
            hbqn0 = (hbqn)map0.get("detectorTaskWithResource#run");
        }
        else {
            hbqn0 = hbqm.a;
        }
        hbqn0.c();
        try {
            object0 = mobileVisionBase0.c.a(hbtp0);
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(hbqn0, throwable0);
            throw throwable0;
        }
        hbqn0.close();
        return object0;
    }
}

