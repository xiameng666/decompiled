import android.accounts.Account;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatusChange;
import com.google.android.gms.auth.proximity.FeatureEnabledStateReconcilerIntentOperation;
import com.google.android.gms.auth.proximity.FeatureReconcilerGmsTaskBoundService;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akws {
    public static final bboh a;
    public final alvr b;
    public final alvr c;
    public final Context d;
    private final alvr e;
    private final ajes f;
    private final akwh g;

    static {
        akws.a = alis.a("FeatureEnabledController");
    }

    public akws(Context context0, ajes ajes0, akwh akwh0) {
        this.b = new alvr(context0, "com.google.android.gms.auth.proximity.FeatureEnabled");
        this.c = new alvr(context0, "com.google.android.gms.auth.proximity.FeaturePendingDisable");
        this.e = new alvr(context0, "com.google.android.gms.auth.proximity.FeaturePendingEnable");
        this.d = context0;
        this.f = ajes0;
        this.g = akwh0;
    }

    public final void a(Account account0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = gged_interceptors.i(this.b.b(account0, arrayList0));
        boolean z = false;
        for(Object object0: list0) {
            gqus gqus0 = (gqus)object0;
            if(!gged0.contains(gqus0)) {
                alvr alvr0 = this.c;
                if(alvr0.g(account0, gqus0)) {
                    alvr0.h(account0, gqus0);
                }
                else {
                    this.b(account0, gqus0, false);
                }
            }
            else if(this.c.g(account0, gqus0)) {
                z = true;
            }
        }
        if(hpzt.f()) {
            alvr alvr1 = this.e;
            for(Object object1: alvr1.b(account0, new ArrayList())) {
                gqus gqus1 = (gqus)object1;
                if(gged0.contains(gqus1)) {
                    alvr1.h(account0, gqus1);
                }
                else {
                    z = true;
                }
            }
        }
        if(z) {
            Intent intent0 = FeatureEnabledStateReconcilerIntentOperation.a(this.d, account0);
            this.d.startService(intent0);
        }
    }

    public final void b(Account account0, gqus gqus0, boolean z) {
        Intent intent0 = new Intent("com.google.android.gms.auth.proximity.ACTION_FEATURE_ENABLED_CHANGE");
        intent0.setPackage("com.google.android.gms");
        intent0.putExtra("EXTRA_ACCOUNT_NAME", account0.name);
        intent0.putExtra("EXTRA_FEATURE_NAME", gqus0.name());
        intent0.putExtra("EXTRA_ENABLED", z);
        Context context0 = this.d;
        context0.sendBroadcast(intent0);
        Intent intent1 = new Intent("com.google.android.gms.auth.proximity.DEVICE_SYNC_FINISHED").setPackage("com.google.android.gms");
        intent1.putExtra("account_id", account0.name);
        context0.sendBroadcast(intent1);
        if(z) {
            if(gqus0 == gqus.b) {
                String s = account0.name;
                context0.getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", 0).edit().putLong("LATEST_SETUP_COMPLETE_TIMESTAMP_" + s, System.currentTimeMillis()).apply();
            }
            gqus gqus1 = gqus.l;
            if(gqus0 == gqus1) {
                String s1 = account0.name;
                if(hpzt.e() && hpzt.f()) {
                    long v = hpzt.a.b().b();
                    if((System.currentTimeMillis() - context0.getSharedPreferences("com.google.android.gms.auth.proximity.UNIFIED_SETUP", 0).getLong("LATEST_SETUP_COMPLETE_TIMESTAMP_" + s1, 0L)) / 1000L >= v) {
                        ArrayList arrayList0 = new ArrayList();
                        if(!this.e.b(account0, arrayList0).contains(gqus1)) {
                            bayn bayn0 = bayn.f(context0);
                            Resources resources0 = context0.getResources();
                            aljb.a(bayn0, resources0);
                            juo juo0 = new juo(context0, "better-together-notification-channel-id");
                            juo0.s(avyq.a(context0, 0x7F080CFA));
                            juo0.D = resources0.getColor(0x7F060E76);  // color:quantum_googblue
                            juo0.m = 0;
                            juo0.D("Wi-Fi Sync is enabled");
                            juo0.k("Networks will be shared between your phone and Chromebook");
                            juk juk0 = new juk();
                            juk0.e("Networks will be shared between your phone and Chromebook");
                            juo0.v(juk0);
                            juo0.h = fqaw.a(context0, 0, allr.a(context0).putExtra("FROM_BETTER_TOGETHER_NOTIFICATION", true), 0xC000000);
                            juo0.h(true);
                            Bundle bundle0 = new Bundle();
                            bundle0.putString("android.substName", "System");
                            juo0.e(bundle0);
                            if(hpzt.d()) {
                                Notification notification0 = juo0.a();
                                bayn0.y("better-together-wifi-sync-enabled-tag", 2, evuh.cE, notification0);
                            }
                            else {
                                bayn0.x("better-together-wifi-sync-enabled-tag", 2, juo0.a());
                            }
                            aliu aliu0 = new aliu();
                            aliu0.b("wifisync_enabled_notification_shown_count");
                            aliu0.c();
                        }
                    }
                }
            }
        }
    }

    public final void c(Account account0, SyncedCryptauthDevice syncedCryptauthDevice0) {
        ArrayList arrayList0 = new ArrayList();
        gged_interceptors gged0 = gged_interceptors.i(this.b.b(account0, arrayList0));
        ((ggtj)akws.a.h()).R("Updating previously enabled features (%s) and with enabled features synced from Cryptauth (%s)", gged0, syncedCryptauthDevice0.m);
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: syncedCryptauthDevice0.m) {
            String s = (String)object0;
            try {
                arrayList1.add(gqus.b(s));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                a.e(akws.a.j(), "Failed to parse SyncedCryptauthDevice enabled feature (%s) to FeatureName", s, illegalArgumentException0);
            }
        }
        this.b.c(account0, arrayList1);
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gqus gqus0 = (gqus)arrayList1.get(v1);
            if(!gged0.contains(gqus0)) {
                this.b(account0, gqus0, true);
            }
        }
        this.a(account0, gged0);
    }

    public final boolean d(Account account0, gqus gqus0) {
        return this.b.g(account0, gqus0) && !this.c.g(account0, gqus0);
    }

    public final boolean e(Account account0, gqus gqus0) {
        return this.e.g(account0, gqus0) ? true : this.b.g(account0, gqus0) && !this.c.g(account0, gqus0);
    }

    public final boolean f(Account account0) {
        if(hpzt.f()) {
            return this.g(account0);
        }
        ArrayList arrayList0 = new ArrayList();
        List list0 = this.c.b(account0, arrayList0);
        if(list0.isEmpty()) {
            ((ggtj)akws.a.h()).x("No pending feature states to disable");
            return false;
        }
        ((ggtj)akws.a.h()).B("Reconciling local feature states with feature states from Cryptauth by disabling pending features %s", list0);
        aliu aliu0 = new aliu();
        if(hpyz.j()) {
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: list0) {
                arrayList1.add(new DeviceFeatureStatusChange(new DeviceFeatureStatus(((gqus)object0).name(), false), false));
            }
            evql evql0 = this.f.l(account0, arrayList1);
            try {
                evrg.o(evql0, hpyz.c(), TimeUnit.SECONDS);
                aliu0.J(5);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                if((exception0 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                    aliu0.J(7);
                }
                else if((exception0 instanceof ExecutionException)) {
                    aliu0.J(6);
                }
                else {
                    aliu0.J(8);
                }
                a.ae(akws.a.j(), "Failed to reconcile v2 feature statuses", exception0);
            }
        }
        if(!hpyz.g()) {
            for(Object object1: list0) {
                gqus gqus0 = (gqus)object1;
                try {
                    String s = hpyq.a.b().b();
                    bbey bbey0 = new bbey(this.d, s, "cryptauth/v1/", false, null, null, 0x6301);
                    batl.s(this.d);
                    alhg alhg0 = new alhg(bbey0);
                    alaf.a(account0.name, gqus0, false, alae.a(gqus0.name()), alhg0, this.d);
                }
                catch(acse | VolleyError exception1) {
                    if((exception1 instanceof acse)) {
                        aliu0.J(2);
                    }
                    else {
                        aliu0.J(3);
                    }
                }
                aliu0.J(0);
            }
        }
        return true;
    }

    public final boolean g(Account account0) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = this.c.b(account0, arrayList0);
        ArrayList arrayList1 = new ArrayList();
        List list1 = this.e.b(account0, arrayList1);
        boolean z = list0.isEmpty();
        boolean z1 = list1.isEmpty();
        if(z && z1) {
            ((ggtj)akws.a.h()).x("No pending feature states to enable or disable");
            return false;
        }
        if(!z) {
            ((ggtj)akws.a.h()).B("Reconciling local feature states with feature states from Cryptauth by disabling pending features %s", list0);
        }
        if(!z1) {
            ((ggtj)akws.a.h()).B("Reconciling local feature states with feature states from Cryptauth by enabling pending features %s", list1);
        }
        aliu aliu0 = new aliu();
        if(hpyz.j()) {
            ArrayList arrayList2 = new ArrayList();
            for(Object object0: list0) {
                arrayList2.add(new DeviceFeatureStatusChange(new DeviceFeatureStatus(((gqus)object0).name(), false), false));
            }
            for(Object object1: list1) {
                arrayList2.add(new DeviceFeatureStatusChange(new DeviceFeatureStatus(((gqus)object1).name(), true), alae.a(((gqus)object1).name())));
            }
            evql evql0 = this.f.l(account0, arrayList2);
            try {
                evrg.o(evql0, hpyz.c(), TimeUnit.SECONDS);
                aliu0.J(5);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                if((exception0 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                    aliu0.J(7);
                }
                else if((exception0 instanceof ExecutionException)) {
                    aliu0.J(6);
                }
                else {
                    aliu0.J(8);
                }
                a.ae(akws.a.j(), "Failed to reconcile v2 feature statuses", exception0);
            }
        }
        if(!hpyz.g()) {
            for(Object object2: list0) {
                this.j(account0, ((gqus)object2), false, aliu0);
            }
            for(Object object3: list1) {
                this.j(account0, ((gqus)object3), true, aliu0);
            }
        }
        return true;
    }

    public final boolean h(Account account0, List list0, boolean z, aliu aliu0) {
        boolean z1 = hpzt.f();
        if(hpyz.j()) {
            ((ggtj)akws.a.h()).B("Making v2 BatchSetFeatureStatusesRequest with %s", list0);
            evql evql0 = this.f.l(account0, list0);
            try {
                evrg.o(evql0, hpyz.c(), TimeUnit.SECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                if((exception0 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                    aliu0.q(7);
                }
                else if((exception0 instanceof ExecutionException)) {
                    aliu0.q(6);
                }
                else {
                    aliu0.q(8);
                }
                a.ae(akws.a.j(), "Failed to set v2 feature statuses", exception0);
                if(z1 && z) {
                    FeatureReconcilerGmsTaskBoundService.d(this.d, account0);
                }
                return false;
            }
            aliu0.q(5);
            try {
                this.g.a(this.d, account0, 9);
            }
            catch(akwg akwg0) {
                a.ae(akws.a.j(), "Failed to do a v2 sync after setting feature statuses", akwg0);
            }
            return true;
        }
        return true;
    }

    public final boolean i(Account account0, gqus gqus0, boolean z, boolean z1, aliu aliu0) {
        boolean z2;
        try {
            z2 = this.b.d(account0, gqus0);
        }
        catch(IOException iOException0) {
            a.ae(akws.a.j(), "Couldn\'t determine if feature was enabled", iOException0);
            z2 = z ^ 1;
        }
        alvr alvr0 = this.c;
        boolean z3 = alvr0.g(account0, gqus0);
        boolean z4 = hpzt.f();
        boolean z5 = z4 && this.e.g(account0, gqus0);
        ((ggtj)akws.a.h()).Z("Marking feature %s as %s. Local feature state: %s. Was pending disable: %s. Was pending enable %s", gqus0.name(), (1 == z ? "enabled" : "disabled"), (z2 ? "enabled" : "disabled"), Boolean.valueOf(z3), Boolean.valueOf(z5));
        if(z2 == z && !z3 && !z5) {
            aliu0.q(4);
            return false;
        }
        if(z4) {
            if(z == 0 && z5) {
                this.e.h(account0, gqus0);
            }
            if(z != 0 && z1 && !z5) {
                this.e.e(account0, gqus0);
            }
        }
        if(z == 0 && !z3) {
            alvr0.e(account0, gqus0);
            this.b(account0, gqus0, false);
            return true;
        }
        if(z != 0 && z3) {
            alvr0.h(account0, gqus0);
            this.b(account0, gqus0, true);
        }
        return true;
    }

    private final void j(Account account0, gqus gqus0, boolean z, aliu aliu0) {
        try {
            String s = hpyq.a.b().b();
            bbey bbey0 = new bbey(this.d, s, "cryptauth/v1/", false, null, null, 0x6301);
            batl.s(this.d);
            alhg alhg0 = new alhg(bbey0);
            alaf.a(account0.name, gqus0, z, alae.a(gqus0.name()), alhg0, this.d);
        }
        catch(acse | VolleyError exception0) {
            if((exception0 instanceof acse)) {
                aliu0.J(2);
            }
            else {
                aliu0.J(3);
            }
        }
        aliu0.J(0);
    }
}

