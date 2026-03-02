import android.media.session.MediaController;
import java.util.List;

public final class auec implements ibts {
    public final List a;

    public auec(List list0) {
        this.a = list0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        MediaController mediaController0 = (MediaController)object0;
        ibuq.f(mediaController0, "it");
        String s = mediaController0.getPackageName();
        return Boolean.valueOf(((boolean)(this.a.contains(s) ^ 1)));
    }
}

