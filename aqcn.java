import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import android.widget.RemoteViews;
import com.google.android.gms.autofill.fill.IFillField;
import com.google.android.gms.autofill.fill.IFillForm;
import java.io.Serializable;

public final class aqcn {
    public static final int a;
    private static final ggfp b;

    static {
        aqcn.b = ggfp.K(ando.L, ando.M);
    }

    public static amlq a(Context context0, IFillForm iFillForm0, gfsx gfsx0, gfsx gfsx1) {
        if(!hqfp.a.c().d()) {
            gfsx1 = gfqx.a;
        }
        amli amli0 = new amli();
        aqcg aqcg0 = aoml.h(context0);
        CharSequence charSequence0 = aqcg0.d(0x7F15044F);  // string:autofill_sms_prompt "Autofill code"
        RemoteViews remoteViews0 = aoml.k(context0, charSequence0, aqcg0.d(0x7F150450), amnv.c("com.google.android.gms", 0x7F080BC9, charSequence0), false, 1, gfqx.a);  // string:autofill_sms_subtext "from messages"
        gfsx gfsx2 = gfsx1.b(new aqcm(context0));
        PendingIntent pendingIntent0 = aphp.C(context0, aphp.F(0x20).putExtra("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL", aqca.a(iFillForm0)).putExtra("com.google.android.gms.autofill.extra.METRICS_CONTEXT", ((Serializable)gfsx0.g())).putExtra("com.google.android.gms.autofill.extra.INLINE_PRESENTATION_SPEC", (gfsx1.i() ? aqca.a(((Parcelable)gfsx1.d())) : null)));
        if(pendingIntent0 != null) {
            amli0.b(pendingIntent0.getIntentSender());
        }
        if(aqcf.h()) {
            aqbe.b(amli0, null, remoteViews0, gfsx2, null, iFillForm0.l(aqcn.b));
            return amli0.a();
        }
        ggqj ggqj0 = iFillForm0.l(aqcn.b).om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            AutofillId autofillId0 = ((IFillField)object0).e();
            if(autofillId0 != null) {
                amli0.g(autofillId0, null, remoteViews0, gfsx2);
            }
        }
        return amli0.a();
    }
}

