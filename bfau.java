import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class bfau extends tk {
    private final List a;

    public bfau(List list0) {
        ibuq.f(list0, "passwords");
        super();
        this.a = list0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0862, viewGroup0, false);  // layout:pwm_import_password_list_item
        ibuq.c(view0);
        return new bfat(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        ibuq.f(((bfat)uq0), "viewHolder");
        bewh bewh0 = (bewh)this.a.get(v);
        String s = bewh0.b;
        ((bfat)uq0).t.setVisibility((v == 0 ? 4 : 0));
        ((bfat)uq0).u.setText(bewh0.a.toString());
        TextView textView0 = ((bfat)uq0).v;
        if(s != null && s.length() != 0) {
            textView0.setVisibility(0);
            textView0.setText(s);
            return;
        }
        textView0.setVisibility(8);
    }
}

