import com.android.location.provider.ActivityChangedEvent;
import com.android.location.provider.ActivityRecognitionEvent;
import j..util.Objects;
import java.util.List;

final class fwug implements Runnable {
    final ActivityChangedEvent a;
    final fwuh b;

    public fwug(fwuh fwuh0, ActivityChangedEvent activityChangedEvent0) {
        this.a = activityChangedEvent0;
        Objects.requireNonNull(fwuh0);
        this.b = fwuh0;
        super();
    }

    @Override
    public final void run() {
        fwuh fwuh0 = this.b;
        List list0 = fwuh0.a;
        if(!list0.isEmpty()) {
            for(Object object0: this.a.getActivityRecognitionEvents()) {
                ActivityRecognitionEvent activityRecognitionEvent0 = (ActivityRecognitionEvent)object0;
                if(activityRecognitionEvent0.getEventType() == 0) {
                    for(Object object1: list0) {
                        ((fwyn)object1).l();
                    }
                }
                else {
                    if(!"android.activity_recognition.tilting".equals(activityRecognitionEvent0.getActivity())) {
                        if(activityRecognitionEvent0.getTimestampNs() < fwuh0.b) {
                            continue;
                        }
                        fwuh0.b = activityRecognitionEvent0.getTimestampNs();
                    }
                    fwuh0.a(activityRecognitionEvent0);
                }
            }
        }
    }
}

