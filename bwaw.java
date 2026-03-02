import android.view.View;
import android.widget.ScrollView;

public final class bwaw implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "it");
        return Boolean.valueOf(((boolean)(view0 instanceof ScrollView ^ 1)));
    }
}

