import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings.System;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.crisisalerts.handler.presenters.EventLoggerIntentOperation;
import j..time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class bgqc implements bgpx {
    protected final Context a;
    private static final bboh b;
    private static final AtomicInteger c;
    private static final AtomicInteger d;
    private final bayn e;
    private final Duration f;
    private final Duration g;
    private final esaa h;

    static {
        bgqc.b = bgrz.a("PhNotPr");
        bgqc.c = new AtomicInteger(0);
        bgqc.d = new AtomicInteger(0);
    }

    protected bgqc(Context context0, bayn bayn0, Duration duration0, Duration duration1) {
        this.a = context0;
        this.e = bayn0;
        this.f = duration0;
        this.g = duration1;
        this.h = new esaa(context0, 0x1000001A, "CrisisAlert");
    }

    @Override  // bgpx
    public final void a(hguc hguc0, hgug hgug0) {
        Context context0 = this.a;
        juo juo0 = new juo(context0, hgug0.k);
        String s = this.e(hgug0);
        if(hgtv.a(hguc0.d) == 4) {
            s = "[TEST] " + s;
        }
        String s1 = this.d(hgug0);
        juo0.B = "alarm";
        juo0.D(s);
        juo0.k(s1);
        juk juk0 = new juk();
        juk0.f(s);
        juk0.e(s1);
        juo0.v(juk0);
        Bundle bundle0 = new Bundle();
        bundle0.putString("android.substName", "Google");
        juo0.C = bundle0;
        juo0.s(avyq.a(context0, 0x7F080537));  // drawable:gs_crisis_alert_vd_theme_24
        juo0.D = context0.getColor(0x7F060D66);  // color:notification_icon_red
        Duration duration0 = (Duration)ggbb.a(Duration.between(hfyg.d((hgug0.h == null ? hfwn.a : hgug0.h)), hfyg.d((hguc0.f == null ? hfwn.a : hguc0.f))), this.f);
        juo0.N = ((Duration)ggbb.b(this.g, duration0)).toMillis();
        juo0.h = bgqc.f(context0, "com.google.android.gms.crisisalerts.handler.presenters.EVENT_CLICK", hguc0, hgug0);
        juo0.l(bgqc.f(context0, "com.google.android.gms.crisisalerts.handler.presenters.EVENT_DISMISS", hguc0, hgug0));
        boolean z = true;
        juo0.E = 1;
        juo0.h(true);
        juo0.m = 1;
        Uri uri0 = null;
        juo0.x(((hguc0.l == null ? hguf.a : hguc0.l).b ? new long[]{1000L} : null));
        if((hguc0.l == null ? hguf.a : hguc0.l).c) {
            uri0 = Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        juo0.P(uri0);
        hguf hguf0 = hguc0.l;
        if((hguf0 == null ? hguf.a : hguf0).b) {
            z = false;
        }
        else {
            if(hguf0 == null) {
                hguf0 = hguf.a;
            }
            if(hguf0.c) {
                z = false;
            }
        }
        juo0.S = z;
        Notification notification0 = juo0.a();
        try {
            long v = hsbn.a.e().i();
            this.h.c(v);
        }
        catch(SecurityException securityException0) {
            a.ae(bgqc.b.i(), "Failed to acquire wakelock", securityException0);
        }
        String s2 = this.c();
        int v1 = bgqc.d.getAndIncrement();
        evuh evuh0 = this.b();
        this.e.y(s2, v1, evuh0, notification0);
    }

    protected abstract evuh b();

    protected abstract String c();

    protected abstract String d(hgug arg1);

    protected abstract String e(hgug arg1);

    private static final PendingIntent f(Context context0, String s, hguc hguc0, hgug hgug0) {
        Intent intent0 = IntentOperation.getStartIntent(context0, EventLoggerIntentOperation.class, s);
        if(intent0 == null) {
            return null;
        }
        intent0.setIdentifier((hguc0.h == null ? hgtw.a : hguc0.h).b + ":" + (hguc0.c == null ? hgtu.a : hguc0.c).c);
        hfxk.k(intent0, "ex_al", ((MessageLite)hguc0));
        hfxk.k(intent0, "ex_rd", ((MessageLite)hgug0));
        return fqaw.f(context0, bgqc.c.getAndIncrement(), intent0, 0x44000000);
    }
}

