import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window.Callback;

final class wu implements View.OnClickListener {
    final mk a;
    final ww b;

    public wu(ww ww0) {
        this.b = ww0;
        super();
        this.a = new mk(ww0.a.getContext(), ww0.d);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        Window.Callback window$Callback0 = this.b.e;
        if(window$Callback0 != null && this.b.f) {
            window$Callback0.onMenuItemSelected(0, this.a);
        }
    }
}

