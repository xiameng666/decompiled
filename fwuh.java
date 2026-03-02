import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import com.android.location.provider.ActivityRecognitionProvider.Sink;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class fwuh implements ActivityRecognitionProvider.Sink {
    public final List a;
    public long b;
    final fwui c;

    public fwuh(fwui fwui0) {
        Objects.requireNonNull(fwui0);
        this.c = fwui0;
        super();
        this.a = new ArrayList();
        this.b = 0L;
    }

    public final void a(ActivityRecognitionEvent activityRecognitionEvent0) {
        long v = activityRecognitionEvent0.getTimestampNs();
        String s = activityRecognitionEvent0.getActivity();
        int v1 = (int)(((Integer)fwui.a.get(s)));
        Integer integer0 = activityRecognitionEvent0.getEventType();
        fwyq fwyq0 = new fwyq(v, v1, ((int)(((Integer)fwui.b.get(integer0)))));
        for(Object object0: this.a) {
            ((fwyn)object0).k(fuxl.D.am);
            ((fwyn)object0).n(Collections.singletonList(fwyq0));
        }
    }

    public final void onActivityChanged(ActivityChangedEvent activityChangedEvent0) {
        for(Object object0: activityChangedEvent0.getActivityRecognitionEvents()) {
            switch(((ActivityRecognitionEvent)object0).getEventType()) {
                default: {
                    ((ActivityRecognitionEvent)object0).getActivity();
                    ((ActivityRecognitionEvent)object0).getTimestampNs();
                }
            }
        }
        fwug fwug0 = new fwug(this, activityChangedEvent0);
        this.c.c.m(fwug0);
    }
}

