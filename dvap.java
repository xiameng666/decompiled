import android.view.View.OnClickListener;
import android.view.View;

public final class dvap implements View.OnClickListener {
    public final dvat a;
    public final ftjg b;

    public dvap(dvat dvat0, ftjg ftjg0) {
        this.a = dvat0;
        this.b = ftjg0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvar dvar0 = this.a.g;
        if(dvar0 != null) {
            dvar0.a(this.b);
        }
    }
}

