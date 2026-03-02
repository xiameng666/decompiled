import android.view.View;

final class dl extends ee {
    final du a;

    public dl(du du0) {
        this.a = du0;
        super();
    }

    @Override  // ee
    public final View a(int v) {
        du du0 = this.a;
        View view0 = du0.P;
        if(view0 != null) {
            return view0.findViewById(v);
        }
        throw new IllegalStateException(a.i(du0, "Fragment ", " does not have a view"));
    }

    @Override  // ee
    public final boolean b() {
        return this.a.P != null;
    }
}

