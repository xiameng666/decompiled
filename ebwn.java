import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import dagger.Lazy;

public final class ebwn {
    public final Context a;
    private final edse b;
    private final Lazy c;

    public ebwn(Context context0, edse edse0, Lazy lazy0) {
        ibuq.f(lazy0, "walletNotificationDelegateStarterLazy");
        super();
        this.a = context0;
        this.b = edse0;
        this.c = lazy0;
    }

    public final juo a() {
        juo juo0 = new juo(this.a, fsdw.d.r);
        juo0.s(avyq.a(this.a, 0x7F080C5D));  // drawable:quantum_gm_ic_wallet_vd_theme_24
        juo0.m = 0;
        juo0.E(-1);
        juo0.B = "msg";
        Bundle bundle0 = new Bundle();
        bundle0.putString("android.substName", "Google Wallet");
        juo0.e(bundle0);
        return juo0;
    }

    public final void b(Notification notification0, hkoy hkoy0) {
        fsdx fsdx0 = hwnj.v() ? new fsdx(notification0, null) : new fsdx(notification0, gfny.c);
        ((cjlv)this.c.get()).i("pending_se_provisioning_notification_tag", 0x20C5E6A2, fsdx0, hkoy0);
    }

    public final void c(String s, String s1) {
        ibuq.f(s, "title");
        juo juo0 = this.a();
        juo0.D(s);
        hkoy hkoy0 = hkoy.i;
        juo0.h = this.f(hkoy0);
        juo0.h(true);
        if(s1 != null) {
            juo0.k(s1);
        }
        Notification notification0 = juo0.a();
        ibuq.e(notification0, "build(...)");
        this.b(notification0, hkoy0);
    }

    public final void d() {
        juo juo0 = this.a();
        juo0.D("Your transit card was added to Wallet");
        juo0.k("Tap to view details");
        juo0.h = this.f(hkoy.h);
        juo0.h(true);
        Notification notification0 = juo0.a();
        ibuq.e(notification0, "build(...)");
        this.b(notification0, hkoy.h);
    }

    public static void e(ebwn ebwn0, String s) {
        ebwn0.c(s, null);
    }

    private final PendingIntent f(hkoy hkoy0) {
        Intent intent0;
        Context context0 = this.a;
        if(ebss.b(context0)) {
            intent0 = dlng.a(context0);
            if(intent0 == null) {
                intent0 = null;
            }
            else {
                intent0.putExtra("FROM_EMONEY_SUW_NOTIFICATION", true);
                intent0.addFlags(0x10008000);
            }
        }
        else {
            intent0 = this.b.a("SE_SUW_NOTIFICATION");
        }
        if(intent0 == null) {
            intent0 = null;
        }
        else {
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0);
            if(resolveInfo0 != null && resolveInfo0.activityInfo != null && resolveInfo0.activityInfo.exported) {
                intent0.setComponent(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
            }
            else {
                intent0 = null;
            }
        }
        if(intent0 == null) {
            return null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjdg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.d = hkoy0.a();
        gjdg0.c = 5;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjdg)hftv0).b |= 4;
        ((gjdg)hftv0).i = "pending_se_provisioning_notification_tag";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg1 = (gjdg)hftp0.b_message;
        gjdg1.b |= 2;
        gjdg1.h = 0x20C5E6A2;
        String s = fsdw.d.r;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg2 = (gjdg)hftp0.b_message;
        s.getClass();
        gjdg2.b |= 1;
        gjdg2.g = s;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        fsdz.a(intent0, 0, ((gjdg)hftv1), new fsef(fsee.a));
        return fqaw.a(context0, 0, intent0, 0xC000000);
    }
}

