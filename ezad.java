import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.GlifLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class ezad extends du {
    private final int a;
    private final boolean b;
    private final ibnn c;
    private final ibnn d;

    public ezad(int v, int v1, boolean z) {
        super(v);
        this.a = v1;
        this.b = z;
        this.c = new ibnz(() -> ;);
        this.d = new ibnz(() -> ;);
    }

    public ezad(int v, int v1, boolean z, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, ((boolean)(((int)z) & ((v2 & 4) == 0 ? 1 : 0))));
    }

    // Detected as a lambda impl.
    public abstract gafh A();

    private final GlifLayout B(View view0) {
        return (GlifLayout)view0.findViewById(this.a);
    }

    public final gafh I() {
        return (gafh)this.c.a();
    }

    public final gafh J() {
        return (gafh)this.d.a();
    }

    @Override  // du
    public void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(!homc.a.j().J() || !gajp.d(context0)) {
            context0.setTheme(0x7F16001F);  // style:ActiveUnlockSudTheme
            if(gaec.y(context0)) {
                int v = gajp.a(context0);
                if(v != 0) {
                    context0.setTheme(v);
                }
            }
        }
    }

    @Override  // du
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = super.onCreateView(layoutInflater0, viewGroup0, bundle0);
        ibuq.c(view0);
        gaff gaff0 = (gaff)this.B(view0).t(gaff.class);
        gafh gafh0 = this.J();
        if(gafh0 != null) {
            gaff0.d(gafh0);
        }
        gafh gafh1 = this.I();
        if(gafh1 != null) {
            gaff0.c(gafh1);
            if(this.b) {
                ((gaiw)this.B(view0).t(gaiw.class)).d(this.requireContext(), gafh1, 0x7F15088C, this.y());  // string:common_more "More"
                return view0;
            }
            gafh1.f = this.y();
        }
        return view0;
    }

    @Override  // du
    public final void onDetach() {
        this.requireContext().setTheme(this.requireContext().getApplicationInfo().theme);
        super.onDetach();
    }

    protected abstract View.OnClickListener y();

    // Detected as a lambda impl.
    public abstract gafh z();
}

