import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import j..util.Objects;

final class egsp extends ClickableSpan {
    final egsq a;

    public egsp(egsq egsq0) {
        Objects.requireNonNull(egsq0);
        this.a = egsq0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        String s = hwyp.d();
        this.a.N(s);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        textPaint0.setUnderlineText(false);
        textPaint0.setColor(this.a.au);
    }
}

