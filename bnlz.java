import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.BidiFormatter;

public final class bnlz implements glzn {
    public final bnmb a;

    public bnlz(bnmb bnmb0) {
        this.a = bnmb0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(!((gfsx)object0).i()) {
            return gmbx.a;
        }
        gtaa gtaa0 = ((gszo)((gfsx)object0).d()).d;
        if(gtaa0 == null) {
            gtaa0 = gtaa.a;
        }
        if((gszv.b(gtaa0.g) == null ? gszv.h : gszv.b(gtaa0.g)) != gszv.a) {
            gtaa gtaa1 = ((gszo)((gfsx)object0).d()).d;
            gtaa gtaa2 = gtaa1 == null ? gtaa.a : gtaa1;
            if((gszv.b(gtaa2.g) == null ? gszv.h : gszv.b(gtaa2.g)) != gszv.b) {
                return gmbx.a;
            }
            if(gtaa1 == null) {
                gtaa1 = gtaa.a;
            }
            int v = gszy.b(gtaa1.e) == 0 ? 1 : gszy.b(gtaa1.e);
            if(v == 4 || v == 6 || v == 28) {
                return gmbx.a;
            }
        }
        gtaa gtaa3 = ((gszo)((gfsx)object0).d()).d;
        if(gtaa3 == null) {
            gtaa3 = gtaa.a;
        }
        bnmb bnmb0 = this.a;
        bayn bayn0 = bnmb0.g;
        String s = gtaa3.d;
        gftb.check(bayn0);
        Context context0 = bnmb0.b;
        juo juo0 = bpyb.a(context0, "finder-alerts");
        int v1 = bnmb0.h;
        juo0.D(context0.getString((v1 == 4 ? 0x7F150508 : 0x7F15050A)));  // string:battery_level_changed_to_critical_notification_title "Device with very low 
                                                                          // battery"
        juo0.k(context0.getString((v1 == 4 ? 0x7F150507 : 0x7F150509), new Object[]{BidiFormatter.getInstance().unicodeWrap(s)}));  // string:battery_level_changed_to_critical_notification_text "Battery for %1$s needs 
                                                                                                                                    // to be charged or replaced now"
        juo0.m = 0;
        juo0.E = 1;
        String s1 = hsxv.a.y().ax();
        if(!gfta.c(s1)) {
            juo0.h = fqaw.c(context0, 0, new Intent("android.intent.action.VIEW").setData(Uri.parse(s1)), 0x4000000);
            juo0.h(true);
        }
        String s2 = bnmb0.f.b.substring(0, 8);
        Notification notification0 = juo0.a();
        bayn0.y("BATTERY_LEVEL_CHANGED_" + s2, 0x1CA4E9FB, evuh.z, notification0);
        long v2 = bnmb0.d.d().toEpochMilli();
        return bnmb0.c.t(bnmb0.f, v1, v2);
    }
}

