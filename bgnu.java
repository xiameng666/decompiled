import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bgnu extends tk {
    public final lf a;

    public bgnu() {
        this.a = new lf(this, new bgnt());
    }

    @Override  // tk
    public final int b() {
        return this.a.e.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E086D, viewGroup0, false);  // layout:pwm_list_header_item
        ibuq.e(view0, "inflate(...)");
        return new bgns(view0);
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        bgns bgns0 = (bgns)uq0;
        ibuq.f(bgns0, "viewHolder");
        String s = ((bgnr)this.a.e.get(v)).a;
        ibuq.f(s, "headerText");
        bgns0.t.setText(s);
    }
}

