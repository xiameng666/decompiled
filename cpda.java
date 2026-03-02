import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.magictether.host.ApDisablingIntentOperation;

public final class cpda {
    public static void a(Context context0, boolean z) {
        cphn cphn0 = new cphn(context0);
        if((cpbr.c(hvbr.k()) ? cphn0.c() : aihs.b(context0))) {
            cpho cpho0 = new cpho(cphn0);
            if(cpbr.c(hvbr.k())) {
                cpdp cpdp0 = cpdp.a(context0);
                if(cpdp0 != null) {
                    cpdp0.c(z);
                }
                cpht.d().l();
                cpho0.a();
            }
            else {
                cpho0.a();
                cpch.a(context0).c(z);
                cpht.d().j();
            }
            cpcg.f();
        }
    }

    public static void b() {
        gged_interceptors gged0;
        String s1;
        Context context0 = AppContextProvider.a();
        cpdp cpdp0 = cpdp.a(context0);
        if(cpdp0 != null && (cpbr.c(hvbr.k()) ? new cpho(new cphn(context0)).b() : true)) {
            cpht cpht0 = cpht.d();
            int v = cpdv.a(context0);
            synchronized(cpdp0.b) {
                gged0 = gged_interceptors.i(cpdp0.b.values());
            }
            PendingIntent pendingIntent0 = ApDisablingIntentOperation.a(context0);
            gftb.q(cpbr.a(hvbr.z()));
            Context context1 = cpht0.b;
            juf juf0 = new juf(avyq.a(context1, cpht0.a()), "Disconnect", pendingIntent0);
            String s = ris.a("{NETWORK_TYPE, select, MOBILE {Providing mobile data} other {Providing internet connection} }", new Object[]{"NETWORK_TYPE", cpht.q(v)});
            if(!gged0.isEmpty()) {
                switch(gged0.size()) {
                    case 1: {
                        s1 = context1.getString(0x7F1517E4, new Object[]{kaj.a().c(((String)gged0.get(0)))});  // string:magictether_host_hotspot_active_message_one "To %s"
                        break;
                    }
                    case 2: {
                        s1 = context1.getString(0x7F1517E5, new Object[]{kaj.a().c(((String)gged0.get(0))), kaj.a().c(((String)gged0.get(1)))});  // string:magictether_host_hotspot_active_message_two "To %1$s and %2$s"
                        break;
                    }
                    default: {
                        s1 = context1.getResources().getQuantityString(0x7F13002D, gged0.size(), new Object[]{gged0.size()});  // plurals:magictether_host_hotspot_active_message_more
                    }
                }
                juo juo0 = cpht0.c(cpht0.a(), s, s1);
                juo0.K(true);
                juo0.y(juf0.a());
                Notification notification0 = juo0.a();
                cpht0.m(cpht0.c, notification0, 7);
            }
        }
    }

    public static void c(Context context0) {
        cphn cphn0 = new cphn(context0);
        cpho cpho0 = new cpho(cphn0);
        if(cphn0.d() && cpho0.b()) {
            if(cpbr.c(hvbr.k())) {
                cpdp cpdp0 = cpdp.a(context0);
                if(cpdp0 != null && !cpdp0.e()) {
                    cpda.b();
                    return;
                }
                cpht cpht0 = cpht.d();
                int v = cpdv.a(context0);
                PendingIntent pendingIntent0 = ApDisablingIntentOperation.a(context0);
                gftb.q(cpbr.a(hvbr.z()));
                int v1 = cpht0.a();
                juf juf0 = new juf(avyq.a(cpht0.b, v1), "Turn off hotspot", pendingIntent0);
                juo juo0 = cpht0.c(cpht0.a(), ris.a("{NETWORK_TYPE, select, MOBILE {Providing mobile data} other {Providing internet connection} }", new Object[]{"NETWORK_TYPE", cpht.q(v)}), "Your hotspot is on");
                juo0.K(true);
                juo0.y(juf0.a());
                Notification notification0 = juo0.a();
                cpht0.m(cpht0.c, notification0, 7);
                return;
            }
            cpch.a(context0).c(false);
            cpht.d().g(ApDisablingIntentOperation.a(context0));
            return;
        }
        cpda.a(context0, false);
    }
}

