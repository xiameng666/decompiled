import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;

public final class duin implements DialogInterface.OnShowListener {
    public final ViewGroup a;
    public final ViewTreeObserver.OnPreDrawListener b;

    public duin(ViewGroup viewGroup0, ViewTreeObserver.OnPreDrawListener viewTreeObserver$OnPreDrawListener0) {
        this.a = viewGroup0;
        this.b = viewTreeObserver$OnPreDrawListener0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        this.a.getViewTreeObserver().addOnPreDrawListener(this.b);
    }
}

