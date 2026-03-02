import android.app.PendingIntent;
import android.content.Context;
import android.widget.inline.InlinePresentationSpec;

public final class aqcm implements gfsi {
    public final Context a;

    public aqcm(Context context0) {
        this.a = context0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        aqcg aqcg0 = aomk.e(this.a);
        CharSequence charSequence0 = aqcg0.d(0x7F15044F);  // string:autofill_sms_prompt "Autofill code"
        CharSequence charSequence1 = aqcg0.d(0x7F150450);  // string:autofill_sms_subtext "from messages"
        amnv amnv0 = amnv.c("com.google.android.gms", 0x7F080BC9, charSequence0);
        gfsx gfsx0 = gfsx.m(new amnl("sms_otp_code", ""));
        PendingIntent pendingIntent0 = aphp.b(this.a, gfsx0);
        return aomk.f(this.a, charSequence0, charSequence1, amnv0, pendingIntent0, ((InlinePresentationSpec)object0));
    }
}

