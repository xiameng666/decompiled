import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class bmqz extends tk {
    public List a;
    public final bmri e;

    public bmqz(bmri bmri0) {
        this.e = bmri0;
        this.a = ggna.a;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return new bmqy(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E03A4, viewGroup0, false));  // layout:fido_selected_account_fragment
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        foec foec0 = (foec)this.a.get(v);
        fntm fntm0 = fnto.c(foec0);
        ((bmqy)uq0).v.l(fntm0);
        TextView textView0 = ((bmqy)uq0).t;
        String s = foec0.c;
        textView0.setText(s);
        TextView textView1 = ((bmqy)uq0).u;
        String s1 = foec0.a;
        textView1.setText(s1);
        if(gfta.c(s)) {
            textView0.setText(s1);
            textView1.setVisibility(8);
        }
        else {
            textView0.setText(s);
            textView1.setVisibility(0);
            textView1.setText(s1);
        }
        bmqx bmqx0 = new bmqx(this, v);
        ((bmqy)uq0).w.setOnClickListener(bmqx0);
        ((bmqy)uq0).w.setTag(Integer.valueOf(v));
    }
}

