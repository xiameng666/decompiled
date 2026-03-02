import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import j..util.Objects;

final class aibo extends ClickableSpan {
    final aibp a;

    public aibo(aibp aibp0) {
        Objects.requireNonNull(aibp0);
        this.a = aibp0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        this.a.d.k(this.a.ag, aicr.b(this.a.ah));
        Intent intent0 = new Intent("android.settings.REQUEST_SET_AUTOFILL_SERVICE");
        intent0.setData(Uri.parse("package:com.google.android.gms.auth.api.phone"));
        view0.getContext().startActivity(intent0);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(false);
    }
}

