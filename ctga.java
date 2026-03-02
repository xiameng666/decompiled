import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ctga {
    public static final bboh a;
    public final Context b;
    public final csyu c;
    public final csvh d;
    public final icnj e;
    public String f;
    public final Map g;
    public final icnl h;
    private final icck i;

    static {
        ctga.a = cume.a(new ibuk(ctga.class));
    }

    public ctga(icck icck0, Context context0, csyu csyu0, csvh csvh0) {
        ibuq.f(icck0, "scope");
        ibuq.f(csyu0, "settingsRepository");
        super();
        this.i = icck0;
        this.b = context0;
        this.c = csyu0;
        this.d = csvh0;
        icnl icnl0 = icnm.a(ibps.a);
        this.h = icnl0;
        this.e = new icmp(icnl0);
        this.f = "";
        this.g = new LinkedHashMap();
        icbb.b(icck0, null, null, new ctfy(this, null), 3);
    }

    public final Intent a() {
        Intent intent0 = bbmq.j(new Intent());
        intent0.setAction("ACTION_INVITATION_RECEIVED");
        intent0.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.multidevice.ui.enrollment.MultideviceInvitationReceivedActivity"));
        intent0.putStringArrayListExtra("EXTRA_ACCOUNT_ID_LIST", new ArrayList(this.g.keySet()));
        intent0.putExtra("EXTRA_SENDER_DEVICE_NAME", this.f);
        intent0.addFlags(0x34000000);
        ibuq.e(intent0, "apply(...)");
        return intent0;
    }

    public final List b() {
        Map map0 = this.g;
        return map0.isEmpty() ? ibps.a : ibpo.r(map0.values());
    }

    public final List c() {
        return ibpo.ar(this.g.keySet());
    }

    public final void d(String s, String s1) {
        ibuq.f(s, "accountEmail");
        ibuq.f(s1, "senderDeviceName");
        cumf.a(ctga.a).R("Pending invite queued for %s from %s", s, s1);
        Map map0 = this.g;
        Object object0 = map0.get(s);
        if(object0 == null) {
            object0 = new LinkedHashSet();
            map0.put(s, object0);
        }
        ((Set)object0).add(new ctfz(s, s1));
        this.f = s1;
        this.f(((ctef)this.c.n().b()));
        icnl icnl0 = this.h;
        do {
            Object object1 = icnl0.b();
            List list0 = (List)object1;
        }
        while(!icnl0.h(object1, this.b()));
    }

    public final void e(String s) {
        ibuq.f(s, "accountEmail");
        cumf.a(ctga.a).B("Removed pending invites for %s", s);
        this.g.remove(s);
        List list0 = this.b();
        if(list0.isEmpty()) {
            this.f = "";
        }
        else {
            HashSet hashSet0 = new HashSet();
            for(Object object0: list0) {
                hashSet0.add(((ctfz)object0).a);
            }
            if(!hashSet0.contains(this.f)) {
                this.f = (String)ibpo.V(hashSet0);
            }
        }
        this.f(((ctef)this.c.n().b()));
        icnl icnl0 = this.h;
        do {
            Object object1 = icnl0.b();
            List list1 = (List)object1;
        }
        while(!icnl0.h(object1, list0));
    }

    public final void f(ctef ctef0) {
        for(Object object0: this.c()) {
            String s = (String)object0;
            ctee ctee0 = (ctee)DesugarCollections.unmodifiableMap(new hfun(ctef0.c, ctef.g)).get(s);
            if(ctee0 == null) {
                cumf.a(ctga.a).B("Account multidevice status not found for %s.", s);
            }
            else {
                if(!csyn.c(ctee0)) {
                    continue;
                }
                ctec ctec0 = ctec.b(ctef0.b) == null ? ctec.f : ctec.b(ctef0.b);
                ibuq.e(ctec0, "getSettingStatus(...)");
                if(!csyn.b(ctec0)) {
                    continue;
                }
                cumf.a(ctga.a).B("Account already enabled: Removing notification for %s.", s);
                this.e(s);
            }
        }
        if(this.g.isEmpty()) {
            ((ggtj)ctga.a.h()).x("No pending invites detected. Removing invite notification.");
            this.d.b();
        }
    }
}

