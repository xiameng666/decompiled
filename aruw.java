import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class aruw implements View.OnClickListener {
    public final xob a;
    public final List b;

    public aruw(xob xob0, List list0) {
        this.a = xob0;
        this.b = list0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        arva arva0 = (arva)this.a;
        ggdy ggdy0 = new ggdy();
        for(Object object0: this.b) {
            arvd arvd0 = (arvd)object0;
            if(arvd0.h) {
                ggdy0.i(arvd0.a);
            }
        }
        arva0.f(ggdy0.h());
    }
}

