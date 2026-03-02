import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class ehef {
    public static ehee a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    private static final ggeo e;

    static {
        ehef.e = ggeo.p(Integer.valueOf(0x7F15253F), "people_progress_title_portal", Integer.valueOf(0x7F152513), "people_photos_progress_title_in_portal", Integer.valueOf(0x7F130050), "people_succeed_title_portal", Integer.valueOf(0x7F130046), "people_contacts_failure_title_portal", Integer.valueOf(0x7F130047), "people_photos_failure_title_portal");  // string:people_contacts_sync_progress_title_in_portal "Syncing with Google Contacts"
    }

    public static int a(Context context0, int v) {
        ggeo ggeo0 = ehef.e;
        Integer integer0 = v;
        if(!ggeo0.containsKey(integer0)) {
            return v;
        }
        try {
            ComponentName componentName0 = new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService");
            return context0.getPackageManager().getServiceInfo(componentName0, 0x80).metaData.getInt(((String)ggeo0.get(integer0)));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            egig.k("FSA2_PortalRegistrationUtils", "getRewrittenResId NameNotFoundException for resId=" + v);
            return v;
        }
    }

    public static ehee b(Context context0, String s, int v) {
        synchronized(ehef.class) {
            if(ehef.a != null && ehef.a.b != null) {
                egig.e("FSA2_PortalRegistrationUtils", "Reuse the previous portal connection.");
                return ehef.a;
            }
            if(hxcv.a.c().k()) {
                egig.e("FSA2_PortalRegistrationUtils", "Connecting to Portal V1.1 API.");
                ehee ehee0 = new ehee(1.1);
                ehed ehed0 = new ehed(ehee0, v, s, context0);
                if(!bbic.a().d(context0, new Intent("com.google.android.setupcompat.portal.SetupNotificationService.BIND_EXTENSION_V_1_1").setPackage("com.google.android.setupwizard"), ehed0, 1)) {
                    egig.k("FSA2_PortalRegistrationUtils", "Failed to bind Portal service.");
                }
                ehee0.b = ehed0;
                ehef.a = ehee0;
            }
            else {
                egig.e("FSA2_PortalRegistrationUtils", "Connecting to Portal V1.0 API.");
                ehef.l(context0, s, true, v);
            }
        }
        return ehef.a;
    }

    public static String c(String s) {
        return "FsaPortal_" + s.hashCode();
    }

    public static void d(Context context0) {
        Class class0 = ehef.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        egig.e("FSA2_PortalRegistrationUtils", "Deregister protal connection.");
        try {
            if(ehef.a != null && ehef.a.b != null) {
                bbic.a().b(context0, ehef.a.b);
            }
            ehef.a = null;
            FIN.finallyExec$NT(v);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            egig.c("FSA2_PortalRegistrationUtils", "failed when unbindService from Portal", illegalArgumentException0);
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public static void e(Context context0, String s) {
        synchronized(ehef.class) {
            if(ehef.a != null && ehef.a.d != null) {
                egig.e("FSA2_PortalRegistrationUtils", "Reuse previous connection to remove the progress item.");
                ehee ehee0 = ehef.a;
                double f = ehee0.a;
                if(f == 1.0) {
                    ehef.j(((gaek)ehee0.d), s);
                }
                else if(f == 1.1) {
                    ehef.k(((gaew)ehee0.d), s);
                }
                ehef.a = null;
                return;
            }
            ehef.l(context0, s, false, 0);
        }
    }

    public static boolean f(Context context0) {
        synchronized(ehef.class) {
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            ehdz ehdz0 = new ehdz(countDownLatch0);
            if(!gaeq.c(context0, new gaem(ehdz0, context0))) {
                gaeq.a.b("Failed to bind SetupNotificationService. Do you have permission \"com.google.android.setupwizard.SETUP_PROGRESS_SERVICE\"");
                ehdz0.a(false);
            }
            try {
                countDownLatch0.await(hxcv.b(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException unused_ex) {
                egig.k("FSA2_PortalRegistrationUtils", "Error in isPortalAvailable");
            }
        }
        return ehef.b;
    }

    public static boolean g(Context context0) {
        synchronized(ehef.class) {
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            ehea ehea0 = new ehea(countDownLatch0);
            if(!gaeq.c(context0, new gaen(ehea0, context0))) {
                gaeq.a.b("Failed to bind SetupNotificationService. Do you have permission \"com.google.android.setupwizard.SETUP_PROGRESS_SERVICE\"");
                ehea0.a(false);
            }
            try {
                countDownLatch0.await(hxcv.b(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException unused_ex) {
                egig.k("FSA2_PortalRegistrationUtils", "Error in isPortalReady");
            }
        }
        return ehef.c;
    }

    public static boolean h(Context context0, String s, int v) {
        synchronized(ehef.class) {
            CountDownLatch countDownLatch0 = new CountDownLatch(1);
            eheb eheb0 = new eheb(countDownLatch0);
            gadd.d(context0, "Context cannot be null");
            if(!gaeq.c(context0, new gaeo(eheb0, gaes.a("com.google.android.gms", ehef.c(s), false, true, 0L, v, 0x7F080CE5, new Intent(), ehdn.c(context0, s)), context0))) {
                gaeq.a.b("Failed to bind SetupNotificationService. Do you have permission \"com.google.android.setupwizard.SETUP_PROGRESS_SERVICE\"");
                eheb0.a(false);
            }
            try {
                countDownLatch0.await(hxcv.b(), TimeUnit.MILLISECONDS);
            }
            catch(InterruptedException unused_ex) {
                egig.k("FSA2_PortalRegistrationUtils", "Error in isProgressServiceAlive");
            }
        }
        return ehef.d;
    }

    static void i() {
        ehef.a = null;
    }

    public static void j(gaek gaek0, String s) {
        try {
            Parcel parcel0 = gaek0.jo();
            parcel0.writeString("com.google.android.gms");
            parcel0.writeString(ehef.c(s));
            Parcel parcel1 = gaek0.hM(3, parcel0);
            boolean z = wbz.i(parcel1);
            parcel1.recycle();
            egig.g("FSA2_PortalRegistrationUtils", "%s progress item from Portal", (z ? "Removed" : "Not removed"));
        }
        catch(RemoteException unused_ex) {
            egig.b("FSA2_PortalRegistrationUtils", "RemoteException when removing Portal progress item.");
        }
    }

    public static void k(gaew gaew0, String s) {
        try {
            Parcel parcel0 = gaew0.jo();
            parcel0.writeString("com.google.android.gms");
            parcel0.writeString(ehef.c(s));
            Parcel parcel1 = gaew0.hM(3, parcel0);
            boolean z = wbz.i(parcel1);
            parcel1.recycle();
            egig.g("FSA2_PortalRegistrationUtils", "%s progress item from Portal", (z ? "Removed" : "Not removed"));
        }
        catch(RemoteException unused_ex) {
            egig.b("FSA2_PortalRegistrationUtils", "RemoteException when removing Portal progress item.");
        }
    }

    private static void l(Context context0, String s, boolean z, int v) {
        ehee ehee0 = new ehee(1.0);
        ehec ehec0 = new ehec(ehee0, z, v, s, context0);
        if(!bbic.a().d(context0, new Intent("com.google.android.setupcompat.portal.SetupNotificationService.BIND_EXTENSION").setPackage("com.google.android.setupwizard"), ehec0, 1)) {
            egig.k("FSA2_PortalRegistrationUtils", "Failed to bind Portal service.");
        }
        ehee0.b = ehec0;
        ehef.a = ehee0;
    }
}

