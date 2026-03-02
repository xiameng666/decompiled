import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

final class bglh extends ArrayAdapter {
    private final LayoutInflater a;

    public bglh(xob xob0) {
        super(xob0, 0);
        this.a = xob0.getLayoutInflater();
    }

    @Override  // android.widget.BaseAdapter
    public final boolean areAllItemsEnabled() {
        return true;
    }

    @Override  // android.widget.ArrayAdapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.a.inflate(0x7F0E0840, viewGroup0, false);  // layout:pwm_appchooser_list_item
            view0.setTag(new bglm(view0));
        }
        bgli bgli0 = (bgli)this.getItem(v);
        gftb.check(bgli0);
        bglm bglm0 = (bglm)view0.getTag();
        gftb.check(bglm0);
        bglm0.a.setImageDrawable(bgli0.c);
        bglm0.a.setContentDescription(bgli0.b);
        bglm0.b.setText(bgli0.b);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final boolean isEnabled(int v) {
        return true;
    }
}

