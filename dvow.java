import android.content.Context;
import android.view.View;
import android.widget.TextView;

public final class dvow implements ibts {
    public final dvpa a;

    public dvow(dvpa dvpa0) {
        this.a = dvpa0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "v");
        boolean z = ((View)object0).canScrollVertically(1);
        dvpa dvpa0 = this.a;
        TextView textView0 = null;
        if(z) {
            TextView textView1 = dvpa0.ag;
            if(textView1 == null) {
                ibuq.j("disclaimer");
            }
            else {
                textView0 = textView1;
            }
            Context context0 = ((View)object0).getContext();
            textView0.setBackgroundColor(fipw.c.a(context0));
            return ibom.a;
        }
        TextView textView2 = dvpa0.ag;
        if(textView2 == null) {
            ibuq.j("disclaimer");
        }
        else {
            textView0 = textView2;
        }
        Context context1 = ((View)object0).getContext();
        textView0.setBackgroundColor(fipw.a.a(context1));
        return ibom.a;
    }
}

