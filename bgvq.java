import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.crisisalerts.settings.debug.CrisisAlertsGoogleInternalSettingChimeraActivity;
import j..time.Instant;
import j..time.ZoneId;
import j..time.ZonedDateTime;
import j..util.function.Consumer.-CC;
import java.util.Locale;
import java.util.function.Consumer;

public final class bgvq implements Consumer {
    public final CrisisAlertsGoogleInternalSettingChimeraActivity a;
    public final LinearLayout b;

    public bgvq(CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity0, LinearLayout linearLayout0) {
        this.a = crisisAlertsGoogleInternalSettingChimeraActivity0;
        this.b = linearLayout0;
    }

    @Override
    public final void accept(Object object0) {
        if(((gxoi)object0) == null) {
            return;
        }
        TextView textView0 = new TextView(this.a);
        textView0.setPadding(1, 1, 2, 2);
        textView0.setTextIsSelectable(true);
        Locale locale0 = Locale.US;
        hgtu hgtu0 = ((gxoi)object0).c;
        if(hgtu0 == null) {
            hgtu0 = hgtu.a;
        }
        String s = hgtu0.c;
        hgtu hgtu1 = ((gxoi)object0).c;
        if(hgtu1 == null) {
            hgtu1 = hgtu.a;
        }
        Long long0 = hfyn.b((hgtu1.d == null ? hfwn.a : hgtu1.d));
        hgtu hgtu2 = ((gxoi)object0).c;
        if(hgtu2 == null) {
            hgtu2 = hgtu.a;
        }
        Instant instant0 = hfyg.d((hgtu2.d == null ? hfwn.a : hgtu2.d));
        hgtu hgtu3 = ((gxoi)object0).c;
        if(hgtu3 == null) {
            hgtu3 = hgtu.a;
        }
        ZonedDateTime zonedDateTime0 = hfyg.d((hgtu3.d == null ? hfwn.a : hgtu3.d)).atZone(ZoneId.systemDefault());
        String s1 = ((gxoi)object0).g;
        Integer integer0 = (int)((gxoi)object0).d;
        hfwn hfwn0 = ((gxoi)object0).e;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        Instant instant1 = hfyg.d(hfwn0);
        hfwn hfwn1 = ((gxoi)object0).e;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        textView0.setText(Html.fromHtml(String.format(locale0, "<i>id:</i> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>rsn:</i> <b>%d</b><br><i>r1st ej:</i> %s[%s]<br><hr>", s, long0, instant0, zonedDateTime0, s1, integer0, instant1, hfyg.d(hfwn1).atZone(ZoneId.systemDefault())), 0x3F));
        this.b.addView(textView0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

