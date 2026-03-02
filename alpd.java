import android.content.Context;
import android.os.Process;
import android.service.notification.NotificationListenerService.Ranking;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.auth.proximity.phonehub.ParcelableRanking;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

public final class alpd implements alrd {
    public static final baun a;
    public final alnh b;
    private static alpd c;
    private final alnb d;
    private final bbpj e;
    private final Context f;

    static {
        alpd.a = new baun("ProximityAuth", new String[]{"NotificationListenerMediator"});
    }

    private alpd(Context context0) {
        alnb alnb0 = alna.b(context0);
        bbpj bbpj0 = bbpj.a(context0);
        super();
        this.f = context0.getApplicationContext();
        this.d = alnb0;
        this.b = new alnh(alnb0);
        this.e = bbpj0;
    }

    public final NotificationListenerService.RankingMap a() {
        if(this.o()) {
            try {
                this.l();
                alpd.a.h("Calling getCurrentRanking() on personal profile.", new Object[0]);
                return this.b.a().a();
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("getCurrentRanking(): not calling into personal profile.", new Object[0]);
        return null;
    }

    public final StatusBarNotification b(int v) {
        if(this.o()) {
            try {
                this.l();
                StatusBarNotification statusBarNotification0 = this.b.a().b(v);
                if(!this.q(statusBarNotification0)) {
                    alpd.a.h("notification will not be handled, returning null.", new Object[0]);
                    return null;
                }
                return statusBarNotification0;
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("getNotification(): not calling into personal profile.", new Object[0]);
        return null;
    }

    public static alpd c(Context context0) {
        Class class0 = alpd.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(!alrn.a()) {
            if(alpd.c == null) {
                alpd.c = new alpd(context0);
            }
            FIN.finallyCodeBegin$NT(v);
            return alpd.c;
        }
        throw new IllegalArgumentException("simplifiedNotificationInfra bad call");
    }

    @Override  // alrd
    public final void d(int v) {
        alpw alpw0;
        try {
            this.l();
            Iterator iterator0 = this.b.c().a.values().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    alpd.a.h("called onInterruptionFilterChanged() on both profiles", new Object[0]);
                    return;
                }
                Object object0 = iterator0.next();
                alpw0 = (alpw)object0;
                break;
            }
        }
        catch(ywm ywm0) {
            alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            return;
        }
        try {
            alpw0.f(v);
        }
        catch(ywm unused_ex) {
        }
        goto label_2;
    }

    @Override  // alrd
    public final void e() {
        alpw alpw0;
        try {
            this.l();
            Iterator iterator0 = this.b.c().a.values().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    alpd.a.h("called onListenerConnected() on both profiles", new Object[0]);
                    return;
                }
                Object object0 = iterator0.next();
                alpw0 = (alpw)object0;
                break;
            }
        }
        catch(ywm ywm0) {
            alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            return;
        }
        try {
            alpw0.g();
        }
        catch(ywm unused_ex) {
        }
        goto label_2;
    }

    @Override  // alrd
    public final void f() {
        alpw alpw0;
        try {
            this.l();
            Iterator iterator0 = this.b.c().a.values().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object0 = iterator0.next();
                alpw0 = (alpw)object0;
                break;
            }
        }
        catch(ywm ywm0) {
            alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            return;
        }
        try {
            alpw0.h();
        }
        catch(ywm unused_ex) {
        }
        goto label_2;
    }

    public final List g() {
        if(this.o()) {
            try {
                this.l();
                List list0 = this.b.a().c();
                if(hpzm.x()) {
                    ggdy ggdy0 = new ggdy();
                    alnj alnj0 = new alnj(this.f);
                    for(Object object0: list0) {
                        StatusBarNotification statusBarNotification0 = (StatusBarNotification)object0;
                        if(alnj0.b(statusBarNotification0.getUser())) {
                            ggdy0.i(statusBarNotification0);
                        }
                    }
                    return ggdy0.h();
                }
                if(!hpzm.A() && this.e.h()) {
                    ggdy ggdy1 = new ggdy();
                    for(Object object1: list0) {
                        StatusBarNotification statusBarNotification1 = (StatusBarNotification)object1;
                        if(statusBarNotification1.getUser().equals(Process.myUserHandle())) {
                            ggdy1.i(statusBarNotification1);
                        }
                    }
                    return ggdy1.h();
                }
                return list0;
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("getCurrentNotifications(): not calling into personal profile.", new Object[0]);
        return ggna.a;
    }

    @Override  // alrd
    public final void h(StatusBarNotification statusBarNotification0, NotificationListenerService.Ranking notificationListenerService$Ranking0) {
    }

    @Override  // alrd
    public final void i(StatusBarNotification statusBarNotification0, ParcelableRanking parcelableRanking0) {
        alpw alpw0;
        try {
            this.l();
            Iterator iterator0 = this.b.c().a.values().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    alpd.a.d("called onNotificationPosted() on both profiles", new Object[0]);
                    return;
                }
                Object object0 = iterator0.next();
                alpw0 = (alpw)object0;
                break;
            }
        }
        catch(ywm ywm0) {
            alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            return;
        }
        try {
            alpw0.i(statusBarNotification0, parcelableRanking0);
        }
        catch(ywm unused_ex) {
        }
        goto label_2;
    }

    @Override  // alrd
    public final void j(int v, StatusBarNotification statusBarNotification0) {
        alpw alpw0;
        try {
            this.l();
            Iterator iterator0 = this.b.c().a.values().iterator();
            while(true) {
            label_2:
                if(!iterator0.hasNext()) {
                    alpd.a.h("called onNotificationRemoved() on both profiles", new Object[0]);
                    return;
                }
                Object object0 = iterator0.next();
                alpw0 = (alpw)object0;
                break;
            }
        }
        catch(ywm ywm0) {
            alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            return;
        }
        try {
            alpw0.j(v, statusBarNotification0);
        }
        catch(ywm unused_ex) {
        }
        goto label_2;
    }

    public final void k(StatusBarNotification statusBarNotification0) {
        if(this.o()) {
            try {
                this.l();
                if(!this.q(statusBarNotification0)) {
                    alpd.a.h("notification will not be handled, returning.", new Object[0]);
                    return;
                }
                this.b.a().d(statusBarNotification0.getKey());
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("cancelNotification(): not calling into personal profile.", new Object[0]);
    }

    public final void l() {
        batl.j();
        alnb alnb0 = this.d;
        if(alnb0.j()) {
            alpd.a.h("Cross profile connector already connected", new Object[0]);
            return;
        }
        if(!alnb0.i()) {
            alpd.a.d("Cross profile connector unavailable", new Object[0]);
            return;
        }
        alnb0.c();
    }

    public final boolean m() {
        if(this.o()) {
            try {
                this.l();
                alpd.a.h("Calling isAccessGranted() on personal profile.", new Object[0]);
                return this.b.a().k();
            }
            catch(ywm ywm0) {
                alpd.a.i("Profile unavailable", ywm0, new Object[0]);
            }
        }
        alpd.a.h("isAccessGranted(): not calling into personal profile.", new Object[0]);
        return false;
    }

    public final boolean n() {
        if(this.o()) {
            try {
                this.l();
                alpd.a.h("Calling isConnected() on personal profile.", new Object[0]);
                return this.b.a().l();
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("isConnected(): not calling into personal profile.", new Object[0]);
        return false;
    }

    public final boolean o() {
        if(!hpzm.E() && this.e.h()) {
            alpd.a.h("Managed -> Personal profile calling is flagged off and/or user is not managed profile.", new Object[0]);
            return false;
        }
        alpd.a.h("Managed -> Personal profile calling is flagged on and/or user is a managed profile.", new Object[0]);
        return true;
    }

    public final StatusBarNotification[] p() {
        if(this.o()) {
            try {
                this.l();
                StatusBarNotification[] arr_statusBarNotification = this.b.a().m();
                if(hpzm.x()) {
                    ArrayList arrayList0 = new ArrayList();
                    alnj alnj0 = new alnj(this.f);
                    for(int v = 0; v < arr_statusBarNotification.length; ++v) {
                        StatusBarNotification statusBarNotification0 = arr_statusBarNotification[v];
                        if(alnj0.b(statusBarNotification0.getUser())) {
                            arrayList0.add(statusBarNotification0);
                        }
                    }
                    return (StatusBarNotification[])arrayList0.toArray(new StatusBarNotification[0]);
                }
                if(!hpzm.A() && this.e.h()) {
                    ArrayList arrayList1 = new ArrayList();
                    for(int v1 = 0; v1 < arr_statusBarNotification.length; ++v1) {
                        StatusBarNotification statusBarNotification1 = arr_statusBarNotification[v1];
                        if(statusBarNotification1.getUser().equals(Process.myUserHandle())) {
                            arrayList1.add(statusBarNotification1);
                        }
                    }
                    return (StatusBarNotification[])arrayList1.toArray(new StatusBarNotification[0]);
                }
                return arr_statusBarNotification;
            }
            catch(ywm ywm0) {
                alpd.a.g("Profile unavailable", ywm0, new Object[0]);
            }
            catch(InterruptedException | TimeoutException exception0) {
                alpd.a.g("Unable to bind to listener service", exception0, new Object[0]);
            }
        }
        alpd.a.h("getActiveNotifications(): not calling into personal profile.", new Object[0]);
        return new StatusBarNotification[0];
    }

    private final boolean q(StatusBarNotification statusBarNotification0) {
        if(statusBarNotification0 == null) {
            alpd.a.h("shouldHandleNotification notification is null", new Object[0]);
            return false;
        }
        if(hpzm.x()) {
            alpd.a.h("checking if enterprise policy allows notification streaming.", new Object[0]);
            return new alnj(this.f).b(statusBarNotification0.getUser());
        }
        return hpzm.A() || !this.e.h() || statusBarNotification0.getUser().equals(Process.myUserHandle());
    }
}

