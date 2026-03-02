import android.view.View.OnClickListener;
import android.view.View;

public final class fmvy implements View.OnClickListener {
    public final fmvx a;

    public fmvy(fmvx fmvx0) {
        this.a = fmvx0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        fmvx fmvx0 = this.a;
        if(fmvx0.a != null && fmvx0.a.a.i()) {
            fmxu fmxu0 = fmvx0.d;
            if(fmxu0 != null) {
                Object object0 = fmvx0.a.a.d();
                fmtu fmtu0 = fmxu0.a.B;
                if(fmtu0 != null) {
                    fmtu0.a.o(((fmga)object0));
                }
            }
            if(!((fmga)fmvx0.a.a.d()).g.equals(fmft.g)) {
                int v = fmvx0.b.c.getVisibility() == 0 ? 8 : 0;
                fmvx0.b.c.setVisibility(v);
            }
        }
    }
}

