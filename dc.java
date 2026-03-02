import android.view.View;
import java.util.Objects;

final class dc implements lqj {
    final de a;

    public dc(de de0) {
        this.a = de0;
        super();
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((lps)object0) != null) {
            de de0 = this.a;
            if(de0.b) {
                View view0 = de0.requireView();
                if(view0.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if(de0.c != null) {
                    if(fm.ar(3)) {
                        Objects.toString(de0.c);
                    }
                    de0.c.setContentView(view0);
                }
            }
        }
    }
}

