import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class acnm implements avyj {
    private final acnl a;

    public acnm(acnl acnl0) {
        this.a = acnl0;
    }

    @Override  // avyj
    public final void a(avyo avyo0) {
        acnk acnk0;
        Object object0;
        String s1;
        baqr baqr1;
        String s2;
        String s;
        int v1;
        acnl acnl0;
        AppStateIntentChimeraService appStateIntentChimeraService0 = (AppStateIntentChimeraService)avyo0;
        try {
            SystemClock.elapsedRealtime();
            acnl0 = this.a;
            int v = 0;
            if(azqk.g(appStateIntentChimeraService0)) {
                Intent intent0 = new Intent("android.intent.action.VIEW").setClassName(appStateIntentChimeraService0, "com.google.android.gms.common.ui.ErrorDialogActivity").setPackage("com.google.android.gms");
                intent0.addFlags(0x24000000);
                intent0.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
                intent0.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE", 0x7F150842);  // string:common_google_play_services_error_dialog_title "Error"
                intent0.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR", baqw.c(appStateIntentChimeraService0, 20));
                intent0.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", 0);
                ((acnn)acnl0).b(appStateIntentChimeraService0, 6, intent0);
            }
            else {
                v1 = ((acnn)acnl0).c;
                s = bbmq.r(appStateIntentChimeraService0, ((acnn)acnl0).d, "com.google.android.gms.appstate.APP_ID");
                if(s == null) {
                    s = "";
                }
                else {
                    try {
                        Long.parseLong(s);
                    }
                    catch(NumberFormatException unused_ex) {
                        ((ggtj)acnn.a.i()).B("Application ID (%s) must be a numeric value. Please verify that your manifest refers to the correct project ID.", s);
                        ((acnn)acnl0).b(appStateIntentChimeraService0, 10, null);
                        goto label_129;
                    }
                }
                if(TextUtils.isEmpty(s)) {
                    int v2 = Process.myUid();
                    if(((acnn)acnl0).c != v2) {
                        ((ggtj)acnn.a.i()).R("Missing metadata tag with the name \"%s\" in the application tag of the manifest for %s", "com.google.android.gms.appstate.APP_ID", ((acnn)acnl0).d);
                        ((acnn)acnl0).b(appStateIntentChimeraService0, 10, null);
                        goto label_129;
                    }
                    goto label_29;
                }
                else {
                label_29:
                    if(((acnn)acnl0).h) {
                        s1 = ((acnn)acnl0).f.name;
                    label_53:
                        s2 = ((acnn)acnl0).d;
                        batl.q(s1);
                        baqr baqr0 = baqr.b(appStateIntentChimeraService0, v1, baqr.a(s1), s2);
                        if(baqr0 != null) {
                            while(true) {
                                String[] arr_s = ((acnn)acnl0).g;
                                if(v >= arr_s.length) {
                                    baqr1 = baqr0;
                                    goto label_65;
                                }
                                if(!baqr0.j(arr_s[v])) {
                                    break;
                                }
                                ++v;
                            }
                            baqr1 = null;
                            goto label_65;
                        }
                        baqr1 = baqr0;
                        goto label_65;
                    }
                    else {
                        s1 = ((acnn)acnl0).e.name;
                        if(Objects.equals(s1, "<<default account>>")) {
                            Account account0 = bbmn.c(appStateIntentChimeraService0, ((acnn)acnl0).d);
                            s1 = account0 == null ? null : account0.name;
                            goto label_39;
                        }
                        else if(s1 == null || bbmn.p(appStateIntentChimeraService0, s1, ((acnn)acnl0).d)) {
                        label_39:
                            List list0 = bbmn.h(appStateIntentChimeraService0, ((acnn)acnl0).d);
                            if(s1 == null) {
                                s1 = list0.size() == 1 ? ((Account)list0.get(0)).name : null;
                            }
                        }
                        else {
                            s1 = null;
                        }
                        if(s1 == null) {
                            Intent intent1 = azou.b(null, null, new String[]{"com.google"}, true, true, 0);
                            intent1.addFlags(0x20000000);
                            ((acnn)acnl0).b(appStateIntentChimeraService0, 4, intent1);
                        }
                        else {
                            goto label_53;
                        }
                    }
                }
            }
            goto label_129;
        }
        catch(acse acse0) {
            goto label_132;
        }
    label_65:
        if(baqr1 == null) {
            try {
                baqr baqr2 = new baqr(v1, s1, s1, s2, s2);
                baqr2.n(((acnn)acnl0).g);
                new bbfz(baqr2, null).b(appStateIntentChimeraService0);
                baqr1 = baqr2;
                baqr2.g(appStateIntentChimeraService0);
                baqr1 = baqr2;
                goto label_82;
            }
            catch(acse acse1) {
            }
            catch(IOException unused_ex) {
                goto label_80;
            }
            try {
                baqr1.f(appStateIntentChimeraService0);
                if((acse1 instanceof UserRecoverableAuthException)) {
                    ((acnn)acnl0).b(appStateIntentChimeraService0, 4, ((UserRecoverableAuthException)acse1).a());
                }
                else {
                    ((acnn)acnl0).b(appStateIntentChimeraService0, 8, null);
                    goto label_129;
                label_80:
                    ((acnn)acnl0).b(appStateIntentChimeraService0, 7, null);
                    goto label_129;
                label_82:
                    object0 = AppStateAndroidChimeraService.b;
                    __monitor_enter(object0);
                    goto label_87;
                }
                goto label_129;
            }
            catch(acse acse0) {
                goto label_132;
            }
            try {
                goto label_87;
            }
            catch(Throwable throwable0) {
                goto label_114;
            }
        }
        else {
            try {
                object0 = AppStateAndroidChimeraService.b;
                __monitor_enter(object0);
            }
            catch(acse acse0) {
                goto label_132;
            }
            try {
            label_87:
                HashMap hashMap0 = AppStateAndroidChimeraService.a;
                WeakReference weakReference0 = (WeakReference)hashMap0.get(baqr1);
                if(weakReference0 == null) {
                    goto label_110;
                }
                else {
                    if(hashMap0.containsKey(baqr1)) {
                        for(Object object1: hashMap0.keySet()) {
                            if(!bata.b(object1, baqr1)) {
                                continue;
                            }
                            goto label_97;
                        }
                    }
                    object1 = null;
                label_97:
                    if(((baqr)object1).equals(baqr1) && new HashSet(baqr1.f).equals(new HashSet(((baqr)object1).f))) {
                        Set set0 = baqr1.g.keySet();
                        if(set0.equals(((baqr)object1).g.keySet())) {
                            for(Object object2: set0) {
                                if(bata.b(baqr1.g.get(((String)object2)), ((baqr)object1).g.get(((String)object2)))) {
                                    continue;
                                }
                                goto label_108;
                            }
                            acnk0 = (acnk)weakReference0.get();
                            goto label_106;
                        }
                    }
                    goto label_108;
                }
                acnk0 = null;
                goto label_116;
            }
            catch(Throwable throwable0) {
                goto label_114;
            }
            try {
            label_106:
                __monitor_exit(object0);
                goto label_116;
            label_108:
                __monitor_exit(object0);
                acnk0 = null;
                goto label_116;
            label_110:
                __monitor_exit(object0);
            }
            catch(acse acse0) {
                goto label_132;
            }
            try {
                acnk0 = null;
                goto label_116;
            }
            catch(Throwable throwable0) {
                try {
                label_114:
                    __monitor_exit(object0);
                    throw throwable0;
                label_116:
                    if(acnk0 == null || !s.equals(acnk0.a)) {
                        acnk0 = new acnk(appStateIntentChimeraService0.getApplicationContext(), baqr1, s);
                        synchronized(AppStateAndroidChimeraService.b) {
                            WeakReference weakReference1 = new WeakReference(acnk0);
                            AppStateAndroidChimeraService.a.put(baqr1, weakReference1);
                        }
                    }
                    if(!((acnn)acnl0).h && "<<default account>>".equals((baqr1.c == null ? null : baqr1.c.name))) {
                        bbmn.k(appStateIntentChimeraService0, baqr1.d, baqr1.b);
                    }
                    Bundle bundle0 = acnn.a(appStateIntentChimeraService0, null);
                    ((acnn)acnl0).b.d(acnk0, bundle0);
                label_129:
                    SystemClock.elapsedRealtime();
                    return;
                }
                catch(acse acse0) {
                    goto label_132;
                }
            }
        }
        goto label_129;
    label_132:
        a.ae(AppStateIntentChimeraService.a.i(), "Auth error executing an operation: ", acse0);
    }

    @Override  // avyj
    public final void b(Status status0) {
    }
}

