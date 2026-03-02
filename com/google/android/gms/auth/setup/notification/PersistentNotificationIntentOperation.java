package com.google.android.gms.auth.setup.notification;

import alwt;
import alwu;
import android.content.Context;
import android.content.Intent;
import bayn;
import bbcu;
import bbib;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import ggtj;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Map;

@Deprecated
public class PersistentNotificationIntentOperation extends IntentOperation {
    public static final int a = 0;
    private static final String b = "PersistentNotificationIntentOperation";
    private static final bboh c;

    static {
        PersistentNotificationIntentOperation.c = bboh.b("PersistentNotificationIntentOperation", bbcu.cf);
    }

    private static alwt a(Context context0) {
        return new alwt(bayn.f(context0), new bbib(context0));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        switch(s.hashCode()) {
            case 0x2F94F923: {
                if(s.equals("android.intent.action.BOOT_COMPLETED")) {
                    alwt alwt0 = PersistentNotificationIntentOperation.a(this);
                    Map map0 = alwt.a().getAll();
                    if(!map0.isEmpty()) {
                        LinkedList linkedList0 = new LinkedList();
                        for(Object object0: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            String[] arr_s = ((String)map$Entry0.getKey()).split(":", 2);
                            int v = (int)Integer.valueOf(arr_s[0]);
                            String s1 = arr_s[1];
                            alwu alwu0 = alwu.c(AppContextProvider.a(), ((String)map$Entry0.getValue()));
                            long v1 = System.currentTimeMillis();
                            long v2 = v1 - alwu0.b();
                            if(v2 > alwu0.a()) {
                                ((ggtj)alwt.a.h()).B("Not showing expired notification with tag: %s", s1);
                                linkedList0.add(((String)map$Entry0.getKey()));
                            }
                            else {
                                alwu0.l(v1);
                                alwu0.k(alwu0.a() - v2);
                                alwt0.c(s1, v, alwu0);
                            }
                        }
                        for(Object object1: linkedList0) {
                            String[] arr_s1 = ((String)object1).split(":", 2);
                            int v3 = (int)Integer.valueOf(arr_s1[0]);
                            alwt0.b(arr_s1[1], v3);
                        }
                        return;
                    }
                }
                break;
            }
            case 0x32FB846E: {
                if(s.equals("com.google.android.gms.auth.setup.notification.CANCEL")) {
                    if(!intent0.hasExtra("tag") && !intent0.hasExtra("id")) {
                        ((ggtj)PersistentNotificationIntentOperation.c.j()).x("ACTION_CANCEL_NOTIFICATION intent found without tag or id.");
                        return;
                    }
                    PersistentNotificationIntentOperation.a(this).b(intent0.getStringExtra("tag"), intent0.getIntExtra("id", 0));
                    return;
                }
                break;
            }
        }
    }
}

