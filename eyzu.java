import android.app.ActionBar;
import android.content.Context;
import android.widget.Toolbar;

public final class eyzu implements sid {
    final eyzv a;

    public eyzu(eyzv eyzv0) {
        this.a = eyzv0;
        super();
    }

    @Override  // sid
    public final ActionBar a(Toolbar toolbar0) {
        ibuq.f(toolbar0, "toolbar");
        this.a.A(toolbar0);
        Context context0 = this.a.getContext();
        ibuq.d(context0, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.FragmentActivity");
        return ((xob)context0).getActionBar();
    }

    @Override  // sid
    public final void b(CharSequence charSequence0) {
        ibuq.f(charSequence0, "title");
    }
}

