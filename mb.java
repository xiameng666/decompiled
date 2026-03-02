import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class mb extends lz implements my {
    public final na a;
    private final Context b;
    private final ActionBarContextView c;
    private final ly f;
    private WeakReference g;
    private boolean h;

    public mb(Context context0, ActionBarContextView actionBarContextView0, ly ly0) {
        this.b = context0;
        this.c = actionBarContextView0;
        this.f = ly0;
        na na0 = new na(actionBarContextView0.getContext());
        na0.F();
        this.a = na0;
        na0.b = this;
    }

    @Override  // my
    public final void Q(na na0) {
        this.g();
        this.c.o();
    }

    @Override  // my
    public final boolean U(na na0, MenuItem menuItem0) {
        return this.f.b(this, menuItem0);
    }

    @Override  // lz
    public final Menu a() {
        return this.a;
    }

    @Override  // lz
    public final MenuInflater b() {
        return new mg(this.c.getContext());
    }

    @Override  // lz
    public final View c() {
        return this.g == null ? null : ((View)this.g.get());
    }

    @Override  // lz
    public final CharSequence d() {
        return this.c.h;
    }

    @Override  // lz
    public final CharSequence e() {
        return this.c.g;
    }

    @Override  // lz
    public final void f() {
        if(this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override  // lz
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override  // lz
    public final void h(View view0) {
        this.c.j(view0);
        this.g = view0 == null ? null : new WeakReference(view0);
    }

    @Override  // lz
    public final void i(int v) {
        this.j(this.b.getString(v));
    }

    @Override  // lz
    public final void j(CharSequence charSequence0) {
        this.c.k(charSequence0);
    }

    @Override  // lz
    public final void k(int v) {
        this.l(this.b.getString(v));
    }

    @Override  // lz
    public final void l(CharSequence charSequence0) {
        this.c.l(charSequence0);
    }

    @Override  // lz
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override  // lz
    public final boolean n() {
        return this.c.j;
    }
}

