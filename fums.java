import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

@ibni
public final class fums extends fuml {
    public final ImageView h;
    public final TextView k;

    public fums(Context context0) {
        ibuq.f(context0, "context");
        super(context0, null, 0);
        View view0 = this.findViewById(0x7F0B0823);  // id:StartIcon
        ibuq.e(view0, "findViewById(...)");
        this.h = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B039F);  // id:EndText
        ibuq.e(view1, "findViewById(...)");
        this.k = (TextView)view1;
        this.setClipToPadding(false);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((TextView)view1).getLayoutParams();
        ibuq.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((jsr)viewGroup$LayoutParams0).l = 0;
        ((TextView)view1).requestLayout();
        Drawable drawable0 = context0.getTheme().obtainStyledAttributes(null, fumr.a, 0, 0).getDrawable(0);
        if(drawable0 != null) {
            this.q(drawable0);
        }
    }

    public final fscz g() {
        return new fsda(this.h);
    }

    public final void q(Drawable drawable0) {
        ibuq.f(drawable0, "icon");
        this.h.setImageDrawable(drawable0);
        this.h.setVisibility(0);
    }
}

