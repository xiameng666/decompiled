import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

final class ashi extends ClickableSpan {
    private final CharSequence a;
    private final CharSequence b;
    private final Context c;
    private final ProtoLiteBuilder d;

    public ashi(Context context0, CharSequence charSequence0, CharSequence charSequence1, ProtoLiteBuilder hftp0) {
        this.a = charSequence0;
        this.b = charSequence1;
        this.d = hftp0;
        this.c = context0;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        ProtoLiteBuilder hftp0 = this.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje0 = (grje)hftp0.b_message;
        grje0.b |= 1;
        grje0.c = true;
        ((TextView)aqxt.a(this.c).setMessage(this.a).setNegativeButton(this.b, null).show().findViewById(0x102000B)).setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(false);
    }
}

