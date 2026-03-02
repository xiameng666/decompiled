import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;

final class fvwm extends ClickableSpan {
    final String a;
    final Context b;
    final EAlertUxArgs c;

    public fvwm(String s, Context context0, EAlertUxArgs eAlertUxArgs0) {
        this.a = s;
        this.b = context0;
        this.c = eAlertUxArgs0;
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(this.a));
        this.b.startActivity(intent0);
        fxmt.b().a(this.c.h, this.c.i, this.c.k, 12);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(false);
        textPaint0.setColor(this.b.getColor(0x7F060266));  // color:eew_link_blue
    }
}

