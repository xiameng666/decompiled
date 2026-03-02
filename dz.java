import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

final class dz extends eh implements abf, acx, fq, jvs, jvt, jwj, jwk, kdt, lsq, orl {
    final ea a;

    public dz(ea ea0) {
        this.a = ea0;
        super(ea0, ea0, new Handler());
    }

    @Override  // eh
    public final View a(int v) {
        return this.a.findViewById(v);
    }

    @Override  // kdt
    public final void addMenuProvider(kdz kdz0) {
        this.a.addMenuProvider(kdz0);
    }

    @Override  // jwj
    public final void addOnConfigurationChangedListener(kar kar0) {
        this.a.addOnConfigurationChangedListener(kar0);
    }

    @Override  // jvs
    public final void addOnMultiWindowModeChangedListener(kar kar0) {
        this.a.addOnMultiWindowModeChangedListener(kar0);
    }

    @Override  // jvt
    public final void addOnPictureInPictureModeChangedListener(kar kar0) {
        this.a.addOnPictureInPictureModeChangedListener(kar0);
    }

    @Override  // jwk
    public final void addOnTrimMemoryListener(kar kar0) {
        this.a.addOnTrimMemoryListener(kar0);
    }

    @Override  // eh
    public final boolean b() {
        Window window0 = this.a.getWindow();
        return window0 != null && window0.peekDecorView() != null;
    }

    @Override  // eh
    public final LayoutInflater c() {
        return this.a.getLayoutInflater().cloneInContext(this.a);
    }

    @Override  // eh
    public final Object d() {
        return this.a;
    }

    @Override  // eh
    public final void e() {
        this.a.invalidateOptionsMenu();
    }

    @Override  // eh
    public final boolean f(String s) {
        return jwe.f(this.a, s);
    }

    @Override  // acx
    public final acw getActivityResultRegistry() {
        return this.a.h;
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.a.b;
    }

    @Override  // abf
    public final abc getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }

    @Override  // orl
    public final orh getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override  // lsq
    public final lsp getViewModelStore() {
        return this.a.getViewModelStore();
    }

    @Override  // eh
    public final void h(PrintWriter printWriter0, String[] arr_s) {
        this.a.dump("  ", null, printWriter0, arr_s);
    }

    @Override  // fq
    public final void jR(du du0) {
    }

    @Override  // kdt
    public final void removeMenuProvider(kdz kdz0) {
        this.a.removeMenuProvider(kdz0);
    }

    @Override  // jwj
    public final void removeOnConfigurationChangedListener(kar kar0) {
        this.a.removeOnConfigurationChangedListener(kar0);
    }

    @Override  // jvs
    public final void removeOnMultiWindowModeChangedListener(kar kar0) {
        this.a.removeOnMultiWindowModeChangedListener(kar0);
    }

    @Override  // jvt
    public final void removeOnPictureInPictureModeChangedListener(kar kar0) {
        this.a.removeOnPictureInPictureModeChangedListener(kar0);
    }

    @Override  // jwk
    public final void removeOnTrimMemoryListener(kar kar0) {
        this.a.removeOnTrimMemoryListener(kar0);
    }
}

