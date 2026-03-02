import android.view.Window.Callback;

final class jn implements nm {
    final ka a;

    public jn(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override  // nm
    public final void a(na na0, boolean z) {
        this.a.L(na0);
    }

    @Override  // nm
    public final boolean b(na na0) {
        Window.Callback window$Callback0 = this.a.H();
        if(window$Callback0 != null) {
            window$Callback0.onMenuOpened(108, na0);
        }
        return true;
    }
}

