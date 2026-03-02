import android.util.Log;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.List;

public final class fuxv {
    private int a;

    public fuxv() {
        this.a = -1;
    }

    public final int a(ActivityTransitionResult activityTransitionResult0, int v) {
        synchronized(this) {
            if(humy.h() && humy.a.b().L()) {
                return this.b(v);
            }
            List list0 = activityTransitionResult0.a;
            if(!list0.isEmpty()) {
                if(list0.size() > 1) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    for(Object object0: list0) {
                        stringBuilder0.append(((ActivityTransitionEvent)object0));
                    }
                    Log.w("TransitionAHandler", String.format("TransitionApiHandler received >1 (%d) transition results: %s", list0.size(), stringBuilder0.toString()));
                }
                ActivityTransitionEvent activityTransitionEvent0 = (ActivityTransitionEvent)list0.get(list0.size() - 1);
                int v3 = activityTransitionEvent0.a;
                switch(v3) {
                    case 7: {
                        v3 = 7;
                        break;
                    }
                    case 8: {
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
                if(activityTransitionEvent0.b != 0) {
                label_22:
                    int v4 = this.b(v);
                    if(v4 == 1) {
                        if(v3 != 0 && v3 != 16) {
                            Log.w("TransitionAHandler", String.format("Insignificant non vehicle related transition result = %s", activityTransitionResult0));
                            return 1;
                        }
                        switch(activityTransitionEvent0.b) {
                            case 0: {
                                if(this.a != 0) {
                                    this.a = 0;
                                    return 2;
                                }
                                break;
                            }
                            case 1: {
                                if(this.a != 1) {
                                    this.a = 1;
                                    return 3;
                                }
                            }
                        }
                        return 1;
                    }
                    return v4;
                }
                Log.w("TransitionAHandler", String.format("Received walking/running entry transition. Exiting in vehicle %s", activityTransitionResult0));
                this.a = 1;
                return 3;
            }
            Log.w("TransitionAHandler", "Transition result is empty!");
        }
        return 1;
    }

    private final int b(int v) {
        switch(v) {
            case 0: {
                Log.w("TransitionAHandler", "Received car fusion result. Entering Vehicle");
                this.a = 0;
                return 2;
            }
            case 1: {
                if(humy.a.b().I() && this.a == 0) {
                    Log.w("TransitionAHandler", "Received other fusion result. Exiting Vehicle");
                    this.a = 1;
                    return 3;
                }
                return 1;
            }
            default: {
                return 1;
            }
        }
    }
}

