import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentFilter;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.Arrays;

public final class azpm extends azpn {
    public static final azpm a;
    public static final int b;
    private static final Object e;

    static {
        azpm.e = new Object();
        azpm.a = new azpm();
        azpm.b = azpn.c;
    }

    public final Dialog a(Activity activity0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.i(activity0, v, new baqz(this.k(activity0, v, "d"), activity0, v1), dialogInterface$OnCancelListener0);
    }

    public final azxp b(Context context0, azxo azxo0) {
        IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter0.addDataScheme("package");
        azxp azxp0 = new azxp(azxo0);
        jwe.b(context0, azxp0, intentFilter0, 2);
        azxp0.a = context0;
        if(!azqk.i(context0, "com.google.android.gms")) {
            azxo0.a();
            azxp0.a();
            return null;
        }
        return azxp0;
    }

    public final evql c(aztx aztx0, aztx[] arr_aztx) {
        azxm azxm0;
        batl.t(aztx0, "Requested API must not be null.");
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(aztx0);
        arrayList0.addAll(Arrays.asList(arr_aztx));
        synchronized(azxm.c) {
            batl.t(azxm.d, "Must guarantee manager is non-null before using getInstance");
            azxm0 = azxm.d;
        }
        azva azva0 = new azva(arrayList0);
        Message message0 = azxm0.n.obtainMessage(2, azva0);
        azxm0.n.sendMessage(message0);
        azpk azpk0 = new azpk();
        return azva0.b.a.g(azpk0);
    }

    public final void d(Activity activity0, Dialog dialog0, String s, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        if((activity0 instanceof ea)) {
            azrd.y(dialog0, dialogInterface$OnCancelListener0).show(((ea)activity0).getSupportFragmentManager(), s);
            return;
        }
        FragmentManager fragmentManager0 = activity0.getFragmentManager();
        azpe azpe0 = new azpe();
        batl.t(dialog0, "Cannot display null dialog");
        dialog0.setOnCancelListener(null);
        dialog0.setOnDismissListener(null);
        azpe0.a = dialog0;
        azpe0.b = dialogInterface$OnCancelListener0;
        azpe0.show(fragmentManager0, s);
    }

    public final void e(Context context0, int v) {
        this.f(context0, v, null);
    }

    public final void f(Context context0, int v, String s) {
        this.g(context0, v, s, this.l(context0, v, "n"));
    }

    public final void g(Context context0, int v, String s, PendingIntent pendingIntent0) {
        int v2;
        int v1;
        String s1;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", v, s), new IllegalArgumentException());
        if(v == 18) {
            this.h(context0);
            return;
        }
        if(pendingIntent0 == null) {
            if(v == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
            return;
        }
        if(v == 6) {
            s1 = baqw.f(context0, "common_google_play_services_resolution_required_title");
            v1 = 6;
        }
        else {
            v1 = v;
            s1 = baqw.d(context0, v);
        }
        if(s1 == null) {
            s1 = "Google Play services error";
        }
        String s2 = v1 == 6 || v1 == 19 ? baqw.e(context0, "common_google_play_services_resolution_required_text", baqw.a(context0)) : baqw.c(context0, v1);
        context0.getResources();
        Object object0 = context0.getSystemService("notification");
        batl.s(object0);
        juo juo0 = new juo(context0);
        juo0.y = true;
        juo0.h(true);
        juo0.D(s1);
        juk juk0 = new juk();
        juk0.e(s2);
        juo0.v(juk0);
        juo0.s(0x108008A);
        juo0.S("Google Play services error");
        juo0.V(System.currentTimeMillis());
        juo0.h = pendingIntent0;
        juo0.k(s2);
        NotificationChannel notificationChannel0 = ((NotificationManager)object0).getNotificationChannel("com.google.android.gms.availability");
        if(notificationChannel0 == null) {
            ((NotificationManager)object0).createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", "Google Play services availability", 4));
        }
        else if(!"Google Play services availability".contentEquals(notificationChannel0.getName())) {
            notificationChannel0.setName("Google Play services availability");
            ((NotificationManager)object0).createNotificationChannel(notificationChannel0);
        }
        juo0.J = "com.google.android.gms.availability";
        Notification notification0 = juo0.a();
        if(v1 != 1 && v1 != 2 && v1 != 3) {
            v2 = 0x9B6D;
        }
        else {
            azqk.c.set(false);
            v2 = 10436;
        }
        if(s == null) {
            ((NotificationManager)object0).notify(v2, notification0);
            return;
        }
        ((NotificationManager)object0).notify(s, v2, notification0);
    }

    public final void h(Context context0) {
        new azpl(this, context0).sendEmptyMessageDelayed(1, 120000L);
    }

    public final Dialog i(Context context0, int v, barb barb0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        AlertDialog.Builder alertDialog$Builder0 = null;
        if(v == 0) {
            return null;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(0x1010309, typedValue0, true);
        if("Theme.Dialog.Alert".equals(context0.getResources().getResourceEntryName(typedValue0.resourceId))) {
            alertDialog$Builder0 = new AlertDialog.Builder(context0, 5);
        }
        if(alertDialog$Builder0 == null) {
            alertDialog$Builder0 = new AlertDialog.Builder(context0);
        }
        alertDialog$Builder0.setMessage(baqw.c(context0, v));
        if(dialogInterface$OnCancelListener0 != null) {
            alertDialog$Builder0.setOnCancelListener(dialogInterface$OnCancelListener0);
        }
        String s = baqw.b(context0, v);
        if(s != null) {
            alertDialog$Builder0.setPositiveButton(s, barb0);
        }
        String s1 = baqw.d(context0, v);
        if(s1 != null) {
            alertDialog$Builder0.setTitle(s1);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", v), new IllegalArgumentException());
        return alertDialog$Builder0.create();
    }

    public final void j(Activity activity0, int v, int v1, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        Dialog dialog0 = this.a(activity0, v, v1, dialogInterface$OnCancelListener0);
        if(dialog0 == null) {
            return;
        }
        this.d(activity0, dialog0, "GooglePlayServicesErrorDialog", dialogInterface$OnCancelListener0);
    }
}

