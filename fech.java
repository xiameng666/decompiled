import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.node.accountmatching.ui.GoogleAccountInfo;
import java.util.List;

public final class fech extends tk {
    public List a;
    private final AppTheme e;
    private final fecq f;

    public fech(fecq fecq0, AppTheme appTheme0) {
        this.f = fecq0;
        this.e = appTheme0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        return fczo.i(this.e) ? new fecj(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0EB7, viewGroup0, false), this.e) : new fecj(LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0E0EA8, viewGroup0, false), this.e);  // layout:wearable_expressive_account_matching_item
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        GoogleAccountInfo googleAccountInfo0 = (GoogleAccountInfo)this.a.get(v);
        String s = googleAccountInfo0.a();
        ((fecj)uq0).t.setText(s);
        TextView textView0 = ((fecj)uq0).u;
        CharSequence charSequence0 = textView0.getContentDescription();
        View view0 = ((fecj)uq0).a;
        view0.setOnClickListener(new feci(this.f, googleAccountInfo0));
        if(googleAccountInfo0.b()) {
            textView0.setVisibility(8);
            TextView textView1 = ((fecj)uq0).v;
            textView1.setVisibility(0);
            view0.setClickable(false);
            if(((fecj)uq0).w) {
                ((fecj)uq0).x.setVisibility(8);
                ((fecj)uq0).y.setVisibility(0);
            }
            charSequence0 = textView1.getContentDescription();
        }
        view0.setContentDescription(googleAccountInfo0.a() + " " + charSequence0);
    }
}

