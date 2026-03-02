import android.util.Range;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class bdn {
    public final List a;
    public final Range b;
    public final List c;
    public Executor d;

    public bdn(List list0, List list1) {
        ibuq.e(bmi.a, "FRAME_RATE_RANGE_UNSPECIFIED");
        this(list0, list1, bmi.a);
    }

    public bdn(List list0, List list1, Range range0) {
        ibuq.f(range0, "frameRateRange");
        super();
        this.a = list1;
        this.b = range0;
        List list2 = ibpo.ae(list0);
        this.c = list2;
        ScheduledExecutorService scheduledExecutorService0 = bow.a();
        ibuq.e(scheduledExecutorService0, "mainThreadExecutor(...)");
        this.d = scheduledExecutorService0;
        if(!ibuq.m(range0, bmi.a)) {
            for(Object object0: list2) {
                if(((ben)object0).g.t()) {
                    throw new IllegalArgumentException("Can\'t set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                }
            }
        }
    }
}

