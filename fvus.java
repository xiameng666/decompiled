import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Collections;
import java.util.List;

public final class fvus implements fvsr {
    private final List c;

    public fvus(ActivityRecognitionResult activityRecognitionResult0) {
        this.c = Collections.singletonList(activityRecognitionResult0);
    }

    @Override  // fvsr
    public final long a() {
        return ((ActivityRecognitionResult)this.c.get(0)).c;
    }

    @Override  // fvsr
    public final List b(long v, long v1, fvsq fvsq0) {
        return v >= ((ActivityRecognitionResult)this.c.get(0)).c ? Collections.EMPTY_LIST : this.d(fvsq0);
    }

    @Override  // fvsr
    public final List c() {
        return this.d(fvsr.a);
    }

    @Override  // fvsr
    public final List d(fvsq fvsq0) {
        List list0 = this.c;
        ActivityRecognitionResult activityRecognitionResult0 = fvsq0.a(((ActivityRecognitionResult)list0.get(0)));
        if(activityRecognitionResult0 == null) {
            return Collections.EMPTY_LIST;
        }
        return activityRecognitionResult0.equals(list0.get(0)) ? list0 : Collections.singletonList(activityRecognitionResult0);
    }

    @Override  // fvsr
    public final boolean e() {
        return true;
    }

    @Override  // fvsr
    public final List f(long v) {
        return this.b(v, 60000L, fvsr.a);
    }
}

