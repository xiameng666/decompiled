import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class efks extends fyfl {
    @Override  // fyfl
    public final void a(View view0, float f) {
    }

    @Override  // fyfl
    public final void b(View view0, int v) {
        Context context0 = view0.getContext();
        ibuq.e(context0, "getContext(...)");
        Drawable drawable0 = view0.getBackground();
        ibuq.e(drawable0, "getBackground(...)");
        fyuj fyuj0 = new fyuj(new fyut(fyut.h(context0, 0, 0x7F160295)));  // style:BottomSheetRoundedCorners
        ibuq.d(drawable0, "null cannot be cast to non-null type com.google.android.material.shape.MaterialShapeDrawable");
        fyuj fyuj1 = (fyuj)drawable0;
        fyuj0.W(context0);
        fyuj0.aa(ColorStateList.valueOf(fipw.d.a(context0)));
        fyuj0.setTintList(fyuj1.D.g);
        fyuj0.Z(fyuj1.F());
        fyuj0.al(fyuj1.D.l);
        fyuj0.aj(fyuj1.D.e);
        view0.setBackground(fyuj0);
    }
}

