import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import j..util.Objects;

public final class fohj extends GestureDetector.SimpleOnGestureListener {
    final ExpandableDialogView a;

    public fohj(ExpandableDialogView expandableDialogView0) {
        Objects.requireNonNull(expandableDialogView0);
        this.a = expandableDialogView0;
        super();
    }

    private final boolean a(MotionEvent motionEvent0) {
        int v = Math.round(motionEvent0.getX());
        int v1 = Math.round(motionEvent0.getY());
        return !this.a.a.contains(v, v1);
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return this.a(motionEvent0);
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent0) {
        boolean z = this.a(motionEvent0);
        if(z) {
            Runnable runnable0 = this.a.j;
            if(runnable0 != null) {
                runnable0.run();
                return true;
            }
        }
        return z;
    }
}

