package com.google.android.gms.update.reminder;

import ProtoLiteMessage;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemProperties;
import android.text.TextUtils;
import baun;
import cjmf;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.ota.base.AppContextProvider;
import com.google.android.gms.update.SystemUpdateStatus;
import ezwa;
import ezwd;
import ezwg;
import ezwj;
import ezwk;
import ezwo;
import ezwr;
import ezwu;
import ezwv;
import ezww;
import ezwx;
import ezxa;
import ezxs;
import ezyd;
import faaa;
import fabk;
import fagh;
import fagp;
import fagt;
import gfta;
import gfud;
import hlnn;
import hvxj;
import hvzk;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ris;

public class UpdateReminderDialogIntentOperation extends IntentOperation {
    private static final baun a;
    private static final fagp b;

    static {
        UpdateReminderDialogIntentOperation.a = fabk.d("UpdateReminderDialogControl");
        UpdateReminderDialogIntentOperation.b = new fagp("control.popupdialog.last_aggresive_dialog_displayed_at", ((long)0L));
    }

    private static void a() {
        ezww ezww1;
        long v6;
        ezww ezww0;
        Context context0 = AppContextProvider.a();
        if(!ezwj.r().isEmpty() && (!hvzk.a.b().b() || ezwu.b(context0))) {
            SystemUpdateStatus systemUpdateStatus0 = ((ezxs)ezxs.l.b()).b();
            if(systemUpdateStatus0.c == 0) {
                UpdateReminderDialogIntentOperation.a.d("No pending update.", new Object[0]);
            }
            else {
                if(systemUpdateStatus0.r.a) {
                    goto label_101;
                }
                if(gfta.c(ezwg.d())) {
                    ezww0 = ezww.b;
                }
                else {
                    try {
                        ezww0 = ezww.d(ezwg.d());
                    }
                    catch(ezwa unused_ex) {
                        Object[] arr_object = {ezwg.d()};
                        UpdateReminderDialogIntentOperation.a.f("Unable to parse display time window: %s.", arr_object);
                        ezww0 = ezww.b;
                    }
                }
                long v = System.currentTimeMillis();
                long v1 = v - systemUpdateStatus0.n;
                long v2 = TimeUnit.MILLISECONDS.toDays(v1);
                int v3 = ezwx.b(v1);
                fagt fagt0 = (fagt)fagt.a.b();
                long v4 = (long)(((Long)fagt0.b(UpdateReminderDialogIntentOperation.b)));
                int v5 = ezwx.b(v1);
                String s = (String)ezwo.a(hvxj.b, String.class);
                if(gfta.c(s)) {
                    v6 = 31104000000L;
                }
                else {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: gfud.e(',').l(s)) {
                        String s1 = (String)object0;
                        try {
                            arrayList0.add(Long.valueOf(Long.parseLong(s1.trim())));
                        }
                        catch(NumberFormatException unused_ex) {
                            ezwx.a.d("Malformed retry delayed period string: %s.", new Object[]{s1});
                            break;
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        v6 = 31104000000L;
                    }
                    else {
                        v6 = arrayList0.size() <= v5 ? ((long)(((Long)arrayList0.get(arrayList0.size() - 1)))) : ((long)(((Long)arrayList0.get(v5))));
                    }
                }
                long v7 = v4 + v6;
                if(v3 > 0 && v >= v7 && ezww0.g(v)) {
                    if(systemUpdateStatus0.D.a && systemUpdateStatus0.z) {
                        UpdateReminderDialogIntentOperation.a.d("Suppressing reminder dialog because device in expedited urgency update mode.", new Object[0]);
                        return;
                    }
                    if(ezwx.d(systemUpdateStatus0)) {
                        if(systemUpdateStatus0.o != 0L) {
                            if(ezwv.a(context0, systemUpdateStatus0.n).a == 0) {
                                try {
                                    ezww1 = ezww.d(ezwk.e());
                                }
                                catch(ezwa unused_ex) {
                                    Object[] arr_object1 = {ezwk.e()};
                                    UpdateReminderDialogIntentOperation.a.f("Unable to parse restart time window: %s.", arr_object1);
                                    ezww1 = ezww.a;
                                }
                                boolean z = true;
                                fagt0.e(new fagh[]{new fagh(UpdateReminderDialogIntentOperation.b, v)});
                                long v8 = systemUpdateStatus0.D.b;
                                String s2 = null;
                                if(Long.compare(v8, 0L) >= 0) {
                                    int v9 = (int)TimeUnit.MILLISECONDS.toDays(v8);
                                    if(ezwd.f(systemUpdateStatus0)) {
                                        s2 = ris.a("{remaining_delay_days, plural, =0 {Your device will automatically download and install the update, and then schedule a restart.} =1 {In # day, your device will automatically download and install the update, and then schedule a restart.} other {In # days, your device will automatically download and install the update, and then schedule a restart.} }", new Object[]{"remaining_delay_days", v9});
                                    }
                                    else {
                                        int v10 = systemUpdateStatus0.c;
                                        if((v10 & 0x1F) == 19) {
                                            s2 = ris.a("{remaining_delay_days, plural, =0 {Your device will automatically install the update and schedule a restart.} =1 {In # day, your device will automatically install the update and schedule a restart.} other {In # days, your device will automatically install the update and schedule a restart.} }", new Object[]{"remaining_delay_days", v9});
                                        }
                                        else if(ezxs.F(v10)) {
                                            s2 = ris.a("{remaining_delay_days, plural, =0 {Your device will automatically schedule a restart to finish the update.} =1 {In # day, your device will automatically schedule a restart to finish the update.} other {In # days, your device will automatically schedule a restart to finish the update.} }", new Object[]{"remaining_delay_days", v9});
                                        }
                                    }
                                }
                                if(s2 == null) {
                                    s2 = TextUtils.expandTemplate(context0.getText(0x7F1530A0), new CharSequence[]{String.valueOf(v2)}).toString();  // string:system_update_update_available_aggressive_message_text "Your system is ^1 
                                                                                                                                                     // days out of date."
                                }
                                if(ezwd.f(systemUpdateStatus0) && !ezwg.a().booleanValue()) {
                                    s2 = s2 + "\n\n" + TextUtils.expandTemplate(context0.getText(0x7F15305E), new CharSequence[0]) + "\n\n" + TextUtils.expandTemplate(context0.getText(0x7F153093), new CharSequence[0]) + " " + systemUpdateStatus0.x.c;  // string:system_update_mobile_data_warning_dialog_message "Downloading updates over 
                                                                                                                                                                                                                                                            // a cellular network, metered Wi-Fi, or while roaming may cause additional charges."
                                }
                                String s3 = SystemProperties.get("setupwizard.theme");
                                switch(s3.hashCode()) {
                                    case 0x8120D070: {
                                        if(!s3.equals("glif_v2_light")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    case 0xB6070BB1: {
                                        if(!s3.equals("glif_v3_light")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    case 0x3074C2: {
                                        if(!s3.equals("glif")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    case 0x6E4AF19: {
                                        if(!s3.equals("glif_v2")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    case 115650330: {
                                        if(!s3.equals("glif_v3")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    case 0x2DC1F359: {
                                        if(!s3.equals("glif_light")) {
                                            z = false;
                                        }
                                        break;
                                    }
                                    default: {
                                        z = false;
                                    }
                                }
                                context0.startActivity((!ezww1.h() || !systemUpdateStatus0.y ? ezxa.d(systemUpdateStatus0, s2, ezwg.c(), v3, z) : ezxa.d(systemUpdateStatus0, s2, ezwg.c(), v3, z).putExtra("restart_window_start_time", ezww1.e(context0, System.currentTimeMillis()))));
                                return;
                            }
                            UpdateReminderDialogIntentOperation.a.d("Suppressing reminder dialog for system update policy", new Object[0]);
                            return;
                        }
                        UpdateReminderDialogIntentOperation.a.d("Suppressing reminder dialog during setup", new Object[0]);
                        return;
                    }
                    UpdateReminderDialogIntentOperation.a.d("Suppressing reminder dialog for update status 0x%03X", new Object[]{((int)systemUpdateStatus0.c)});
                    return;
                }
                if(ezyd.c()) {
                    UpdateReminderDialogIntentOperation.a.h("Dialog phase: %d, Next re-show time: %d, Time window: %s", new Object[]{v3, v7, ezwg.d()});
                    return;
                label_101:
                    UpdateReminderDialogIntentOperation.a.d("SystemUpdate activity already foregrounded.", new Object[0]);
                }
            }
        }
    }

    private static final void b() {
        Iterator iterator0;
        if(ezyd.c()) {
            SystemUpdateStatus systemUpdateStatus0 = ((ezxs)ezxs.l.b()).b();
            if(ezwx.d(systemUpdateStatus0)) {
                Context context0 = AppContextProvider.a();
                ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                Object object0 = null;
                if(activityManager0 != null) {
                    if(((Boolean)ezwo.a(hvxj.j, Boolean.class)).booleanValue() && cjmf.b(context0, "android.permission.REAL_GET_TASKS") == 0) {
                        List list0 = activityManager0.getRunningTasks(1);
                        if(list0 != null && !list0.isEmpty()) {
                            ActivityManager.RunningTaskInfo activityManager$RunningTaskInfo0 = (ActivityManager.RunningTaskInfo)list0.get(0);
                            if(activityManager$RunningTaskInfo0 != null && activityManager$RunningTaskInfo0.topActivity != null) {
                                object0 = activityManager$RunningTaskInfo0.topActivity.getPackageName();
                            }
                            else {
                                iterator0 = activityManager0.getRunningAppProcesses().iterator();
                                goto label_19;
                            }
                        }
                        else {
                            iterator0 = activityManager0.getRunningAppProcesses().iterator();
                            goto label_19;
                        }
                    }
                    else {
                        iterator0 = activityManager0.getRunningAppProcesses().iterator();
                    label_19:
                        while(iterator0.hasNext()) {
                            Object object1 = iterator0.next();
                            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object1;
                            if(activityManager$RunningAppProcessInfo0.importance != 100) {
                                continue;
                            }
                            String s = activityManager$RunningAppProcessInfo0.processName;
                            if(s == null) {
                                s = null;
                            }
                            else {
                                int v = s.indexOf(58);
                                if(v >= 0) {
                                    s = v == 0 ? null : s.substring(0, v);
                                }
                            }
                            if(gfta.c(s)) {
                                continue;
                            }
                            object0 = s;
                            goto label_44;
                        }
                        if(cjmf.b(context0, "android.permission.REAL_GET_TASKS") == 0) {
                            List list1 = activityManager0.getRecentTasks(0, 3);
                            if(list1 != null && !list1.isEmpty()) {
                                ActivityManager.RecentTaskInfo activityManager$RecentTaskInfo0 = (ActivityManager.RecentTaskInfo)list1.get(0);
                                if(activityManager$RecentTaskInfo0 != null) {
                                    ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(activityManager$RecentTaskInfo0.baseIntent, 0);
                                    if(resolveInfo0 != null && resolveInfo0.activityInfo != null && !gfta.c(resolveInfo0.activityInfo.packageName)) {
                                        object0 = resolveInfo0.activityInfo.packageName;
                                    }
                                }
                            }
                        }
                    }
                }
            label_44:
                String s1 = (String)ezwo.a(hvxj.h, String.class);
                if(!gfta.c(s1)) {
                    if(!s1.startsWith("allow:") && !s1.startsWith("block:")) {
                        ezwx.a.m("Ignoring invalid reminder dialog foreground package filter: %s", new Object[]{s1});
                    }
                    else {
                        boolean z = s1.startsWith("allow:");
                        for(Object object2: gfud.e(',').i().d().l(s1.substring(6))) {
                            if(!((String)object2).equals(object0)) {
                                continue;
                            }
                            if(!z) {
                                UpdateReminderDialogIntentOperation.a.h("Not showing update reminder dialog over foreground package: %s", new Object[]{object0});
                                return;
                            }
                            UpdateReminderDialogIntentOperation.a.j("Showing update reminder dialog over foreground package: %s", new Object[]{object0});
                            UpdateReminderDialogIntentOperation.a();
                            return;
                        }
                        if(z) {
                            UpdateReminderDialogIntentOperation.a.h("Not showing update reminder dialog over foreground package: %s", new Object[]{object0});
                            return;
                        }
                    }
                }
                UpdateReminderDialogIntentOperation.a.j("Showing update reminder dialog over foreground package: %s", new Object[]{object0});
                UpdateReminderDialogIntentOperation.a();
                return;
            }
            if(ezyd.c()) {
                UpdateReminderDialogIntentOperation.a.h("Not showing dialog for status 0x%03X", new Object[]{((int)systemUpdateStatus0.c)});
            }
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!ezwu.b(this)) {
            UpdateReminderDialogIntentOperation.a.h("System update management not enabled in this context. Ignoring intent: %s", new Object[]{intent0});
            return;
        }
        String s = gfta.b(intent0.getAction());
        baun baun0 = UpdateReminderDialogIntentOperation.a;
        baun0.j("Received action: %s", new Object[]{s});
        if("android.intent.action.ACTION_POWER_CONNECTED".equals(s)) {
            if(((Boolean)ezwo.a(hvxj.e, Boolean.class)).booleanValue()) {
                UpdateReminderDialogIntentOperation.a();
            }
        }
        else if(!"android.intent.action.USER_PRESENT".equals(s)) {
            if("com.google.android.gms.update.SCREEN_ON".equals(s)) {
                if(ezyd.c()) {
                    baun0.h("Received action: %s", new Object[]{s});
                }
                UpdateReminderDialogIntentOperation.b();
                return;
            }
            if(Objects.equals(s, "android.intent.action.BOOT_COMPLETED")) {
                if(ezyd.c()) {
                    baun0.h("Received action: %s", new Object[]{s});
                }
                if(ezyd.c()) {
                    hlnn hlnn0 = faaa.c();
                    if(((ProtoLiteMessage)hlnn0).equals(hlnn.a) || !ezwr.h(hlnn0)) {
                        UpdateReminderDialogIntentOperation.b();
                    }
                }
            }
        }
        else if(!gfta.c(ezwg.d())) {
            UpdateReminderDialogIntentOperation.a();
        }
    }
}

