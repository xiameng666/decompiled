import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.AutofillConsentChimeraActivity;
import j..util.Objects;

public final class aibl extends ClickableSpan {
    public aibl(AutofillConsentChimeraActivity autofillConsentChimeraActivity0) {
        Objects.requireNonNull(autofillConsentChimeraActivity0);
        super();
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(View view0) {
        Intent intent0 = new Intent();
        intent0.setAction("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS");
        intent0.setPackage("com.google.android.gms");
        view0.getContext().startActivity(intent0);
    }

    @Override  // android.text.style.ClickableSpan
    public final void updateDrawState(TextPaint textPaint0) {
        super.updateDrawState(textPaint0);
        textPaint0.setUnderlineText(true);
    }
}

