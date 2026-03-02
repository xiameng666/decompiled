import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

final class fuzm extends ArrayList {
    @Override
    public final boolean add(Object object0) {
        if(!super.add(((ActivityTransitionEvent)object0))) {
            return false;
        }
        return DetectedActivity.c(((ActivityTransitionEvent)object0).a) ? super.add(new ActivityTransitionEvent(0, ((ActivityTransitionEvent)object0).b, ((ActivityTransitionEvent)object0).c)) : true;
    }
}

