import android.view.View;
import android.widget.LinearLayout;

public final class egrm implements lqj {
    public final egrw a;

    public egrm(egrw egrw0) {
        this.a = egrw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        egrw egrw0 = this.a;
        View view0 = egrw0.ao;
        int v = 0;
        if(view0 != null) {
            view0.setVisibility((z ? 8 : 0));
        }
        LinearLayout linearLayout0 = egrw0.an;
        if(linearLayout0 != null) {
            if(!z) {
                v = 8;
            }
            linearLayout0.setVisibility(v);
        }
    }
}

