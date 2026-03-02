import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.UserHandle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.gcm.OneoffTask;
import com.google.android.gms.gcm.PeriodicTask;
import com.google.android.gms.gcm.Task;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class ekru implements Runnable {
    private final Context a;
    private final Intent b;
    private final UserHandle c;

    public ekru(Context context0, Intent intent0, UserHandle userHandle0) {
        this.a = context0;
        this.b = intent0;
        this.c = userHandle0;
    }

    private static boolean a(Intent intent0) {
        if(intent0 == null) {
            return false;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            return true;
        }
        try {
            Set set0 = bundle0.keySet();
        }
        catch(BadParcelableException unused_ex) {
            Log.e("NetworkScheduler", "Failed to unmarshall extras.");
            return false;
        }
        for(Object object0: set0) {
            String s = (String)object0;
            try {
                bundle0.get(s);
            }
            catch(BadParcelableException unused_ex) {
                Log.e("NetworkScheduler", "Intent contains extra with bad key: " + s);
                return false;
            }
        }
        return true;
    }

    private static final cllc b() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("retry_policy", 0);
        bundle0.putInt("initial_backoff_seconds", 30);
        bundle0.putInt("maximum_backoff_seconds", 3600);
        cllc cllc0 = cllc.a(bundle0);
        batl.s(cllc0);
        return cllc0;
    }

    @Override
    public final void run() {
        String s4;
        ComponentName componentName0;
        String s1;
        int v3;
        Intent intent0 = this.b;
        if(!ekru.a(intent0)) {
            Log.e("NetworkScheduler", "Received task with invalid intent. Ignoring task.");
            return;
        }
        Context context0 = this.a;
        ekqd.e(context0);
        UserHandle userHandle0 = this.c;
        clkr clkr0 = null;
        if(userHandle0 == null) {
            int v = ekqd.b();
            if(v != 0) {
                Context context1 = this.a;
                Intent intent1 = this.b;
                Intent intent2 = new Intent(intent1);
                intent2.putExtra("user_serial", v);
                intent2.setClassName(context1, "com.google.android.gms.gcm.nts.SchedulerReceiver");
                if(!"com.google.android.gms.gcm.ACTION_SCHEDULE".equals(intent1.getAction()) && !"com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(intent1.getAction())) {
                    if("android.intent.action.USER_REMOVED".equals(intent1.getAction())) {
                        intent2 = null;
                    }
                    else if("com.google.android.gms.gcm.ACTION_TRIGGER_TASK".equals(intent1.getAction())) {
                        intent2.putExtra("debug_user_serial", v);
                    }
                    else {
                        intent2 = null;
                    }
                }
                if(intent2 == null) {
                    return;
                }
                ekqd.i(context1, 0, intent2, null, null);
                return;
            }
        }
        else {
            UserManager userManager0 = (UserManager)context0.getSystemService("user");
            if(userManager0 == null) {
                Log.e("NetworkScheduler", "Could not process the request because UserManager is null.");
                return;
            }
            intent0.putExtra("user_serial", ((int)userManager0.getSerialNumberForUser(userHandle0)));
        }
        ekqw ekqw0 = ekrs.b().d;
        String s = intent0.getAction();
        if(ekqw0 == null) {
            if(!"com.google.android.gms.gcm.ACTION_SCHEDULE".equals(s)) {
                return;
            }
            List list0 = ekrs.b().h;
            synchronized(list0) {
                if(((long)list0.size()) <= hrvh.a.i().k()) {
                    list0.add(this);
                }
            }
            return;
        }
        Intent intent3 = this.b;
        int v2 = intent3.getIntExtra("user_serial", 0);
        if("com.google.android.gms.gcm.ACTION_TRIGGER_TASK".equals(s)) {
            Context context2 = this.a;
            hrvo hrvo0 = hrvo.a;
            if(hrvo0.b().c()) {
                v3 = intent3.getIntExtra("service_kind", 0);
                s1 = intent3.getStringExtra("service");
            }
            else {
                s1 = "";
                v3 = 0;
            }
            if(v3 == 1) {
                if(TextUtils.isEmpty(s1)) {
                    Log.e("NetworkScheduler", "Error triggering debug task - no service name provided for bound service. Did you use the correct key (\'service\')?");
                    return;
                }
                componentName0 = new ComponentName("com.google.android.gms", s1);
            }
            else {
                String s2 = intent3.getStringExtra("component");
                if(TextUtils.isEmpty(s2)) {
                    Log.e("NetworkScheduler", "Error triggering debug task - no component name provided. Did you use the correct key (\'component\')?");
                    return;
                }
                componentName0 = ComponentName.unflattenFromString(s2);
            }
            if(componentName0 == null) {
                Log.e("NetworkScheduler", "Error triggering debug task - Component name could not be resolved.");
                return;
            }
            String s3 = intent3.getStringExtra("tag");
            if(!TextUtils.isEmpty(s3)) {
                int v4 = !hrvo0.b().a() || !componentName0.getPackageName().equals("com.google.android.gms") ? 0 : intent3.getIntExtra("debug_user_serial", 0);
                if(hrvo0.b().b() && componentName0.getPackageName().equals("com.google.android.gms") && !azqk.e(context2)) {
                    Log.e("NetworkScheduler", "Error triggering debug task - Triggering a GMS Core task on a non-userdebug build is not allowed.");
                    return;
                }
                ekqw ekqw1 = ekrs.b().d;
                if(ekqw1 == null) {
                    Log.e("NetworkScheduler", "Error triggering debug task - network scheduler unavailable.Are you running as u0?");
                    return;
                }
                Bundle bundle0 = (Bundle)intent3.getParcelableExtra("extras");
                try {
                    clkn clkn0 = new clkn();
                    clkn0.t(s3);
                    clkn0.j = componentName0.getClassName();
                    clkn0.s(v3, cllj.a);
                    clkn0.e(0L, 1L);
                    clkn0.v(1);
                    clkn0.y(2, 2);
                    clkn0.u = bundle0;
                    eksc eksc0 = eksc.h(clkn0.a(), componentName0, SystemClock.elapsedRealtime(), v4, ekqa.a());
                    eksc0.k = v3 == 1 ? ekum.a(16, 0) : ekum.a(1, 0);
                    ekqw1.d(eksc0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    Log.e("NetworkScheduler", "Failed to schedule Task: " + illegalArgumentException0.toString());
                }
                return;
            }
            Log.e("NetworkScheduler", "Error triggering debug task - no tag provided. Did you use the correct key (\'tag\')?");
            return;
        }
        if("android.intent.action.USER_REMOVED".equals(s)) {
            int v5 = this.b.getIntExtra("android.intent.extra.user_handle", -1);
            if(v5 == -1) {
                return;
            }
            ekrs.b().f.e(ekqd.c(v5));
            return;
        }
        if("android.intent.action.ACTION_POWER_CONNECTED".equals(s)) {
            ekrs.b().f.a(1);
            return;
        }
        if(!"com.google.android.gms.gcm.ACTION_SCHEDULE".equals(s) && !"com.google.android.gms.gcm.nts.ACTION_SCHEDULE".equals(s)) {
            Log.e("NetworkScheduler", "Unrecognised action provided: " + s);
            return;
        }
        Parcelable parcelable0 = this.b.getParcelableExtra("app");
        if((parcelable0 instanceof PendingIntent)) {
            s4 = ((PendingIntent)parcelable0).getCreatorPackage();
            if(s4 == null || TextUtils.isEmpty(s4)) {
                s4 = null;
            }
            else if(!hrjg.c() || !s4.equals("com.google.android.gms")) {
                eksg eksg0 = new eksg(s4, v2);
                try {
                    eksg0.a(ekrs.b().e).getPackageInfo(eksg0.a, 0);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    Log.e("NetworkScheduler", "Provided package not found: " + eksg0.toString());
                    s4 = null;
                }
            }
        }
        else {
            Log.e("NetworkScheduler", "Invalid parameter app");
            s4 = null;
        }
        if(TextUtils.isEmpty(s4)) {
            Log.e("NetworkScheduler", "Invalid package name : Perhaps you didn\'t include a PendingIntent in the extras?");
            return;
        }
        Intent intent4 = this.b;
        String s5 = intent4.getStringExtra("scheduler_action");
        if(TextUtils.isEmpty(s5)) {
            Log.e("NetworkScheduler", "Broadcast provided with no action to the scheduler in Intent.");
            return;
        }
        if(s5.equals("SCHEDULE_TASK")) {
            try {
                Bundle bundle1 = intent4.getBundleExtra("task_wrapper");
                if(bundle1 == null) {
                    bundle1 = intent4.getExtras();
                }
                if(bundle1 != null) {
                    Parcelable parcelable1 = bundle1.getParcelable("task");
                    if(parcelable1 != null) {
                        try {
                            if(!(parcelable1 instanceof Task)) {
                                throw new IllegalArgumentException("Invalid task class");
                            }
                            if((((Task)parcelable1) instanceof PeriodicTask)) {
                                clkq clkq0 = new clkq();
                                clkq0.j = ((PeriodicTask)(((Task)parcelable1))).c;
                                clkq0.b = ((PeriodicTask)(((Task)parcelable1))).b;
                                clkq0.a = ((PeriodicTask)(((Task)parcelable1))).a;
                                clkq0.g(0);
                                clkq0.t(((PeriodicTask)(((Task)parcelable1))).d);
                                clkq0.p = ((PeriodicTask)(((Task)parcelable1))).f;
                                clkq0.u(((PeriodicTask)(((Task)parcelable1))).e);
                                clkq0.t = ekru.b();
                                clkr0 = clkq0.a();
                            }
                            else if((((Task)parcelable1) instanceof OneoffTask)) {
                                clkn clkn1 = new clkn();
                                clkn1.j = ((OneoffTask)(((Task)parcelable1))).c;
                                clkn1.e(((OneoffTask)(((Task)parcelable1))).a, ((OneoffTask)(((Task)parcelable1))).b);
                                clkn1.y(2, 2);
                                clkn1.t(((OneoffTask)(((Task)parcelable1))).d);
                                clkn1.p = ((OneoffTask)(((Task)parcelable1))).f;
                                clkn1.u(((OneoffTask)(((Task)parcelable1))).e);
                                clkn1.t = ekru.b();
                                clkr0 = clkn1.a();
                            }
                        }
                        catch(IllegalArgumentException illegalArgumentException2) {
                            Log.e("NetworkScheduler", "Failed to extract Task from schedule request: " + illegalArgumentException2.toString());
                        }
                    }
                    else if(bundle1.getLong("period", -1L) != -1L) {
                        clkr0 = new clkr(bundle1);
                    }
                    else if(bundle1.getLong("window_start", -1L) != -1L) {
                        clkr0 = new clko(bundle1);
                    }
                    else if(bundle1.getInt("cadence", -1) == -1) {
                        Parcelable[] arr_parcelable = bundle1.getParcelableArray("content_uri_array");
                        int[] arr_v = bundle1.getIntArray("content_uri_flags_array");
                        if(arr_parcelable != null && arr_v != null && arr_parcelable.length > 0 && arr_parcelable.length == arr_v.length && !Arrays.asList(arr_parcelable).contains(null)) {
                            clkr0 = new cljb(bundle1);
                        }
                        else {
                            Log.e("GmsTaskScheduler", "Invalid bundle provided to #fromBundle: " + bundle1.toString());
                        }
                    }
                    else {
                        clkr0 = new clki(bundle1);
                    }
                }
            }
            catch(IllegalArgumentException illegalArgumentException1) {
                Log.e("NetworkScheduler", "Exception unpacking task: " + illegalArgumentException1.toString());
                return;
            }
            if(clkr0 == null) {
                Log.e("NetworkScheduler", "Empty task parameter for schedule request");
                return;
            }
            ComponentName componentName1 = new ComponentName(s4, clkr0.g);
            try {
                ekqa ekqa0 = ekqa.b(componentName1, clkr0);
                eksc eksc1 = eksc.h(clkr0, componentName1, SystemClock.elapsedRealtime(), v2, ekqa0);
                eksc1.k = ekum.a(intent4.getIntExtra("source", 4), intent4.getIntExtra("source_version", 0));
                ekqw0.d(eksc1);
            }
            catch(IllegalArgumentException illegalArgumentException3) {
                Log.e("NetworkScheduler", illegalArgumentException3.toString());
            }
            return;
        }
        String s6 = intent4.getStringExtra("tag");
        ComponentName componentName2 = (ComponentName)intent4.getParcelableExtra("component");
        if(componentName2 == null) {
            Log.e("NetworkScheduler", "Invalid component specified.");
            return;
        }
        ComponentName componentName3 = new ComponentName(s4, componentName2.getClassName());
        if(!s5.equals("ACTION_SCHEDULE")) {
            if(!s5.equals("SCHEDULE_RECURRING") && !s5.equals("NTS_SCHEDULE_RECURRING")) {
                if(!s5.equals("CANCEL_TASK") && !s5.equals("NTS_CANCEL_TASK")) {
                    if(s5.equals("CANCEL_ALL") || s5.equals("NTS_CANCEL_ALL")) {
                        ekqw0.a(clms.b(v2, componentName3));
                        return;
                    }
                    return;
                }
                clmr clmr0 = new clmr();
                clmr0.d(v2);
                clmr0.c(s6);
                clmr0.b(componentName3.getPackageName());
                clmr0.a(componentName3.getClassName());
                clms clms0 = new clms(clmr0);
                ekqu ekqu0 = new ekqu(3, ekqw0.d, btar.a, null, clms0, null, null, -1);
                ekqw0.c.execute(ekqu0);
                return;
            }
            long v6 = intent4.getLongExtra("period", 0L);
            long v7 = intent4.getLongExtra("period_flex", ((long)(((float)v6) * 0.1f)));
            if(s6 == null) {
                s6 = "";
            }
            try {
                clkq clkq1 = new clkq();
                clkq1.t(s6);
                clkq1.j = componentName3.getClassName();
                clkq1.a = v6;
                clkq1.b = v7;
                clkq1.v(0);
                clkq1.g(0);
                clkr clkr1 = clkq1.a();
                ekqa ekqa1 = ekqa.b(componentName3, clkr1);
                eksc eksc2 = eksc.h(clkr1, componentName3, SystemClock.elapsedRealtime(), v2, ekqa1);
                eksc2.k = ekum.a(2, intent4.getIntExtra("source_version", 5000000));
                ekqw0.d(eksc2);
            }
            catch(IllegalArgumentException illegalArgumentException4) {
                Log.e("NetworkScheduler", "Failed to schedule Task: " + illegalArgumentException4.toString());
            }
            return;
        }
        long v8 = intent4.getLongExtra("window_start", 0L);
        if(v8 < 0L) {
            Log.e("NetworkScheduler", a.D(v8, "Cannot specify a start time in the past: ", ", aborting"));
        }
        long v9 = intent4.getLongExtra("window_end", 0L);
        if(v9 < 0L) {
            Log.e("NetworkScheduler", a.D(v9, "Cannot specify an end time in the past: ", ", aborting"));
        }
        boolean z = intent4.getBooleanExtra("update_current", true);
        if(s6 == null) {
            s6 = "";
        }
        try {
            clkn clkn2 = new clkn();
            clkn2.t(s6);
            clkn2.j = componentName3.getClassName();
            clkn2.e(v8, v9);
            clkn2.u(z);
            eksc eksc3 = eksc.h(clkn2.a(), componentName3, SystemClock.elapsedRealtime(), v2, ekqa.a());
            eksc3.k = ekum.a(2, intent4.getIntExtra("source_version", 5000000));
            ekqw0.d(eksc3);
        }
        catch(IllegalArgumentException illegalArgumentException5) {
            Log.e("NetworkScheduler", "Failed to schedule Task: " + illegalArgumentException5.toString());
        }
    }
}

