import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j..util.Objects;
import java.util.List;

final class aaie extends pch {
    private final LayoutInflater a;
    private final List b;

    public aaie(aaif aaif0, Context context0) {
        Objects.requireNonNull(aaif0);
        super();
        LayoutInflater layoutInflater0 = (LayoutInflater)context0.getSystemService("layout_inflater");
        gftb.check(layoutInflater0);
        this.a = layoutInflater0;
        List list0 = aabu.r(aaif0.requireContext()) ? ggia.g(aaif0.c.d) : aaif0.c.d;
        this.b = list0;
    }

    @Override  // pch
    public final Object c(ViewGroup viewGroup0, int v) {
        Object object0 = this.a.inflate(0x7F0E00DA, viewGroup0, false);  // layout:as_onboarding_step
        grwz grwz0 = (grwz)this.b.get(v);
        if(!grwz0.b.isEmpty()) {
            TextView textView0 = (TextView)((View)object0).findViewById(0x7F0B1B2C);  // id:onboarding_step_title
            textView0.setVisibility(0);
            textView0.setText(grwz0.b);
        }
        if(!grwz0.c.isEmpty()) {
            TextView textView1 = (TextView)((View)object0).findViewById(0x7F0B1B2B);  // id:onboarding_step_message
            textView1.setVisibility(0);
            textView1.setText(grwz0.c);
            textView1.setMovementMethod(new ScrollingMovementMethod());
        }
        viewGroup0.addView(((View)object0));
        return object0;
    }

    @Override  // pch
    public final void d(ViewGroup viewGroup0, int v, Object object0) {
        viewGroup0.removeView(((View)object0));
    }

    @Override  // pch
    public final boolean h(View view0, Object object0) {
        return view0 == object0;
    }

    @Override  // pch
    public final int j() {
        return this.b.size();
    }
}

