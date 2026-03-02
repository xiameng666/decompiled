import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ks extends lz implements my {
    public final na a;
    public ly b;
    final kt c;
    private final Context f;
    private WeakReference g;

    public ks(kt kt0, Context context0, ly ly0) {
        this.c = kt0;
        super();
        this.f = context0;
        this.b = ly0;
        na na0 = new na(context0);
        na0.F();
        this.a = na0;
        na0.b = this;
    }

    @Override  // my
    public final void Q(na na0) {
        if(this.b == null) {
            return;
        }
        this.g();
        this.c.d.o();
    }

    @Override  // my
    public final boolean U(na na0, MenuItem menuItem0) {
        return this.b == null ? false : this.b.b(this, menuItem0);
    }

    @Override  // lz
    public final Menu a() {
        return this.a;
    }

    @Override  // lz
    public final MenuInflater b() {
        return new mg(this.f);
    }

    @Override  // lz
    public final View c() {
        return this.g == null ? null : ((View)this.g.get());
    }

    @Override  // lz
    public final CharSequence d() {
        return this.c.d.h;
    }

    @Override  // lz
    public final CharSequence e() {
        return this.c.d.g;
    }

    @Override  // lz
    public final void f() {
        kt kt0 = this.c;
        if(kt0.f != this) {
            return;
        }
        if(kt.R(kt0.k, kt0.l, false)) {
            this.b.a(this);
        }
        else {
            kt0.g = this;
            kt0.h = this.b;
        }
        this.b = null;
        kt0.P(false);
        ActionBarContextView actionBarContextView0 = kt0.d;
        if(actionBarContextView0.i == null) {
            actionBarContextView0.i();
        }
        kt0.b.l(kt0.n);
        kt0.f = null;
    }

    @Override  // lz
    public final void g() {
        if(this.c.f != this) {
            return;
        }
        this.a.u();
        try {
            this.b.d(this, this.a);
        }
        finally {
            this.a.t();
        }
    }

    @Override  // lz
    public final void h(View view0) {
        this.c.d.j(view0);
        this.g = new WeakReference(view0);
    }

    @Override  // lz
    public final void i(int v) {
        this.j(this.c.a.getResources().getString(v));
    }

    @Override  // lz
    public final void j(CharSequence charSequence0) {
        this.c.d.k(charSequence0);
    }

    @Override  // lz
    public final void k(int v) {
        this.l(this.c.a.getResources().getString(v));
    }

    @Override  // lz
    public final void l(CharSequence charSequence0) {
        this.c.d.l(charSequence0);
    }

    @Override  // lz
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override  // lz
    public final boolean n() {
        return this.c.d.j;
    }
}

