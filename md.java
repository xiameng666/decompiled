import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class md extends ActionMode {
    final Context a;
    final lz b;

    public md(Context context0, lz lz0) {
        this.a = context0;
        this.b = lz0;
    }

    @Override  // android.view.ActionMode
    public final void finish() {
        this.b.f();
    }

    @Override  // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    @Override  // android.view.ActionMode
    public final Menu getMenu() {
        Menu menu0 = this.b.a();
        return new nq(this.a, ((jyb)menu0));
    }

    @Override  // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.b();
    }

    @Override  // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.d();
    }

    @Override  // android.view.ActionMode
    public final Object getTag() {
        return this.b.d;
    }

    @Override  // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.e();
    }

    @Override  // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.e;
    }

    @Override  // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override  // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.n();
    }

    @Override  // android.view.ActionMode
    public final void setCustomView(View view0) {
        this.b.h(view0);
    }

    @Override  // android.view.ActionMode
    public final void setSubtitle(int v) {
        this.b.i(v);
    }

    @Override  // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence0) {
        this.b.j(charSequence0);
    }

    @Override  // android.view.ActionMode
    public final void setTag(Object object0) {
        this.b.d = object0;
    }

    @Override  // android.view.ActionMode
    public final void setTitle(int v) {
        this.b.k(v);
    }

    @Override  // android.view.ActionMode
    public final void setTitle(CharSequence charSequence0) {
        this.b.l(charSequence0);
    }

    @Override  // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.m(z);
    }
}

