import android.view.View;
import java.util.Collection;
import java.util.Map.Entry;

public final class ce implements ibts {
    public final Collection a;

    public ce(Collection collection0) {
        this.a = collection0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Map.Entry map$Entry0 = (Map.Entry)object0;
        ibuq.f(map$Entry0, "entry");
        String s = ((View)map$Entry0.getValue()).getTransitionName();
        return Boolean.valueOf(ibpo.aB(this.a, s));
    }
}

