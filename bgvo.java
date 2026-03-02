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

public final class bgvo implements Consumer {
    public final CrisisAlertsGoogleInternalSettingChimeraActivity a;
    public final LinearLayout b;

    public bgvo(CrisisAlertsGoogleInternalSettingChimeraActivity crisisAlertsGoogleInternalSettingChimeraActivity0, LinearLayout linearLayout0) {
        this.a = crisisAlertsGoogleInternalSettingChimeraActivity0;
        this.b = linearLayout0;
    }

    @Override
    public final void accept(Object object0) {
        if(((gxog)object0) == null) {
            return;
        }
        TextView textView0 = new TextView(this.a);
        textView0.setPadding(1, 1, 2, 2);
        textView0.setTextIsSelectable(true);
        Locale locale0 = Locale.US;
        hguc hguc0 = ((gxog)object0).c;
        if(hguc0 == null) {
            hguc0 = hguc.a;
        }
        String s = (hguc0.c == null ? hgtu.a : hguc0.c).c;
        hguc hguc1 = ((gxog)object0).c;
        if(hguc1 == null) {
            hguc1 = hguc.a;
        }
        hgtu hgtu0 = hguc1.c == null ? hgtu.a : hguc1.c;
        Long long0 = hfyn.b((hgtu0.d == null ? hfwn.a : hgtu0.d));
        hguc hguc2 = ((gxog)object0).c;
        if(hguc2 == null) {
            hguc2 = hguc.a;
        }
        hgtu hgtu1 = hguc2.c == null ? hgtu.a : hguc2.c;
        Instant instant0 = hfyg.d((hgtu1.d == null ? hfwn.a : hgtu1.d));
        hguc hguc3 = ((gxog)object0).c;
        if(hguc3 == null) {
            hguc3 = hguc.a;
        }
        hgtu hgtu2 = hguc3.c == null ? hgtu.a : hguc3.c;
        ZonedDateTime zonedDateTime0 = hfyg.d((hgtu2.d == null ? hfwn.a : hgtu2.d)).atZone(ZoneId.systemDefault());
        String s1 = ((gxog)object0).f;
        hfwn hfwn0 = ((gxog)object0).d;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        Instant instant1 = hfyg.d(hfwn0);
        hfwn hfwn1 = ((gxog)object0).d;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        ZonedDateTime zonedDateTime1 = hfyg.d(hfwn1).atZone(ZoneId.systemDefault());
        hguc hguc4 = ((gxog)object0).c;
        if(hguc4 == null) {
            hguc4 = hguc.a;
        }
        String s2 = (hguc4.h == null ? hgtw.a : hguc4.h).b;
        hguc hguc5 = ((gxog)object0).c;
        if(hguc5 == null) {
            hguc5 = hguc.a;
        }
        hgtw hgtw0 = hguc5.h == null ? hgtw.a : hguc5.h;
        textView0.setText(Html.fromHtml(String.format(locale0, "<i>id:<i/> {<b>%s</b>, %d[%s | %s]}<br>%s<br><i>shown:</i> %s[%s]<br><i>throttling:</i> {<b>%s</b>, %ds}<br><hr>", s, long0, instant0, zonedDateTime0, s1, instant1, zonedDateTime1, s2, hfyf.g((hgtw0.c == null ? hfst.a : hgtw0.c))), 0x3F));
        this.b.addView(textView0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

