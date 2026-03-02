import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class bwbz extends ClickableSpan {
    final bwca a;
    final ibth b;
    final RelativeLayout c;
    final ibth d;
    final TextView e;

    public bwbz(bwca bwca0, ibth ibth0, RelativeLayout relativeLayout0, ibth ibth1, TextView textView0) {
        this.a = bwca0;
        this.b = ibth0;
        this.c = relativeLayout0;
        this.d = ibth1;
        this.e = textView0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        ibuq.f(view0, "textView");
        fhvv fhvv0 = (fhvv)this.b.a();
        this.a.b.a(fhvv0, this.c);
        this.d.a();
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        ibuq.f(textPaint0, "textPaint");
        super.updateDrawState(textPaint0);
        textPaint0.setColor(this.e.getContext().getColor(0x7F0612B5));  // color:uiflow_hyperlink_color
        textPaint0.setUnderlineText(this.e.getTag(bwbl.a) == null || this.e.getLineCount() != 1);
    }
}

