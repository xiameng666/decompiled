import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class bdea extends tk {
    public final ibtw a;
    public final lf e;

    public bdea(ibtw ibtw0) {
        this.a = ibtw0;
        this.e = new lf(this, new bddz());
    }

    @Override  // tk
    public final int b() {
        return this.e.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0884, viewGroup0, false);  // layout:pwm_password_selection_list_item
        ibuq.c(view0);
        return new bddy(view0);
    }

    private static final void f(TextView textView0, String s) {
        if(s.length() == 0) {
            textView0.setVisibility(8);
            return;
        }
        textView0.setVisibility(0);
        textView0.setText(s);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(((bddy)uq0), "viewHolder");
        bddj bddj0 = (bddj)this.e.e.get(v);
        boolean z = bddj0.d;
        boolean z1 = bddj0.e;
        ((bddy)uq0).t.getContext();
        ((bddy)uq0).t.a(((bddg)bddj0.a).a);
        bdea.f(((bddy)uq0).u, bddj0.b.a);
        ((bddy)uq0).u.setEllipsize(bddj0.b.b);
        bdea.f(((bddy)uq0).v, bddj0.c);
        if(z1) {
            bddw bddw0 = new bddw(this, v);
            ((bddy)uq0).w.setOnCheckedChangeListener(bddw0);
            ((bddy)uq0).a.setOnClickListener(new bddx(((bddy)uq0)));
        }
        else {
            ((bddy)uq0).w.setOnCheckedChangeListener(null);
            ((bddy)uq0).a.setOnClickListener(null);
        }
        ((bddy)uq0).w.setChecked(z);
        ((bddy)uq0).w.setClickable(z1);
        ((bddy)uq0).a.setClickable(z1);
    }
}

