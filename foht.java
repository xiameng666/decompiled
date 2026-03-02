import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import j..util.Objects;

public final class foht implements Runnable {
    public final foil a;
    public final View b;
    public final Bundle c;

    public foht(foil foil0, View view0, Bundle bundle0) {
        this.a = foil0;
        this.b = view0;
        this.c = bundle0;
    }

    @Override
    public final void run() {
        View view0 = this.b.findViewById(0x7F0B1AF0);  // id:og_header_close_button
        foil foil0 = this.a;
        view0.setOnClickListener(new fohr(foil0));
        View view1 = this.b.findViewById(0x7F0B1AE3);  // id:og_container_scroll_view
        foil0.ai = new fohq(foil0.am, fohq.a, view1);
        foil0.ai.b();
        if(this.c == null) {
            ExpandableDialogView expandableDialogView0 = (ExpandableDialogView)Objects.requireNonNull(foil0.am);
            expandableDialogView0.setAlpha(0.0f);
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(expandableDialogView0, foil.ag, new float[]{0.0f, 1.0f});
            objectAnimator0.setDuration(83L);
            objectAnimator0.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.8f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.8f, 1.0f})});
            objectAnimator1.setDuration(200L);
            objectAnimator1.setInterpolator(new lnu());
            expandableDialogView0.getViewTreeObserver().addOnPreDrawListener(new fohx(foil0, expandableDialogView0));
            if(foil0.getDialog() != null && foil0.getDialog().getWindow() != null) {
                int v = foil0.requireContext().getColor(0x7F0607F3);  // color:google_scrim
                View view2 = foil0.getDialog().getWindow().getDecorView();
                fycr fycr0 = new fycr();
                Integer[] arr_integer = {jxm.g(v, 0), v};
                ObjectAnimator objectAnimator2 = ObjectAnimator.ofObject(view2, foil.ah, fycr0, arr_integer);
                objectAnimator2.setInterpolator(new LinearInterpolator());
                objectAnimator2.setDuration(200L);
                objectAnimator2.start();
            }
            objectAnimator0.start();
            objectAnimator1.start();
        }
    }
}

