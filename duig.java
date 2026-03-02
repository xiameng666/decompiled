import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class duig implements View.OnClickListener {
    public final BottomSheetBehavior a;
    public final ViewGroup b;

    public duig(BottomSheetBehavior bottomSheetBehavior0, ViewGroup viewGroup0) {
        this.a = bottomSheetBehavior0;
        this.b = viewGroup0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BottomSheetBehavior bottomSheetBehavior0 = this.a;
        if(bottomSheetBehavior0.A != 3) {
            bottomSheetBehavior0.K(3);
            return;
        }
        duit.j(this.b);
    }
}

