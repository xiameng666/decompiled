import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Comparator;

final class fwyv implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = Long.compare(((ActivityRecognitionResult)object0).c, ((ActivityRecognitionResult)object1).c);
        if(v == 0) {
            return 0;
        }
        return v < 0 ? -1 : 1;
    }
}

