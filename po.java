import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class po extends RatingBar {
    private final pm a;

    public po(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0, 0x7F040A2A);  // attr:ratingBarStyle
        wd.d(this, this.getContext());
        pm pm0 = new pm(this);
        this.a = pm0;
        pm0.b(attributeSet0, 0x7F040A2A);  // attr:ratingBarStyle
    }

    @Override  // android.widget.RatingBar
    protected final void onMeasure(int v, int v1) {
        synchronized(this) {
            super.onMeasure(v, v1);
            Bitmap bitmap0 = this.a.a;
            if(bitmap0 != null) {
                this.setMeasuredDimension(View.resolveSizeAndState(bitmap0.getWidth() * this.getNumStars(), v, 0), this.getMeasuredHeight());
            }
        }
    }
}

