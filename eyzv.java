import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public abstract class eyzv extends du {
    private final Integer a;
    private final int b;
    private sie c;
    private final eyzu d;

    public eyzv(Integer integer0, int v) {
        this.a = integer0;
        this.b = v;
        this.d = new eyzu(this);
    }

    public final void A(Toolbar toolbar0) {
        Context context0 = this.getContext();
        ibuq.d(context0, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
        ((xob)context0).setActionBar(toolbar0);
    }

    @Override  // du
    public void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        this.c = new sie(this.d);
    }

    @Override  // du
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        sie sie0 = this.c;
        sie sie1 = null;
        if(sie0 == null) {
            ibuq.j("toolbarDelegate");
            sie0 = null;
        }
        View view0 = sie0.a(layoutInflater0, viewGroup0);
        Integer integer0 = this.a;
        if(integer0 != null) {
            int v = (int)integer0;
            sie sie2 = this.c;
            if(sie2 == null) {
                ibuq.j("toolbarDelegate");
                sie2 = null;
            }
            layoutInflater0.inflate(v, sie2.e);
        }
        sie sie3 = this.c;
        if(sie3 == null) {
            ibuq.j("toolbarDelegate");
            sie3 = null;
        }
        CollapsingToolbarLayout collapsingToolbarLayout0 = sie3.a;
        ibuq.c(collapsingToolbarLayout0);
        collapsingToolbarLayout0.j(this.getString(this.b));
        sie sie4 = this.c;
        if(sie4 == null) {
            ibuq.j("toolbarDelegate");
        }
        else {
            sie1 = sie4;
        }
        sie1.c.setNavigationOnClickListener((/* MISSING LAMBDA PARAMETER */) -> ;);
        return view0;
    }

    @Override  // du
    public final void onDetach() {
        this.A(null);
        super.onDetach();
    }

    // Detected as a lambda impl.
    protected abstract void z();
}

