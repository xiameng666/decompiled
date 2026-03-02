import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ehse implements Function {
    public final ActivityRecognitionResult a;

    public ehse(ActivityRecognitionResult activityRecognitionResult0) {
        this.a = activityRecognitionResult0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        DetectedActivity detectedActivity0 = (DetectedActivity)object0;
        ehug ehug0 = new ehug();
        ehug0.e(detectedActivity0.a());
        ehug0.c(((float)detectedActivity0.e));
        ehug0.d(this.a.c);
        ehug0.b(this.a.b);
        return ehug0.a();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

