package com.google.android.gms.chimera.debug;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import avzk;
import awjj;
import awjl;
import awjm;
import awjn;
import awjo;
import awjp;
import bbmu;
import bzs;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleSetInfo;
import com.google.android.chimera.config.ModuleManager;
import hfrj;
import hftc;
import hfuo;
import hfur;
import hfvv;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class ModuleSetJournalUpdate.ModuleSetJournalIntentOperation extends IntentOperation {
    private static final Comparator a;

    static {
        ModuleSetJournalUpdate.ModuleSetJournalIntentOperation.a = new awjo();
    }

    static void a(Context context0, byte[] arr_b, boolean z) {
        if(arr_b != null) {
            try {
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)awjj.a), arr_b, 0, arr_b.length, hftc.a);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                awjj awjj0 = (awjj)hftv0;
            }
            catch(hfur unused_ex) {
                Log.w("ModuleSetJournalOp", "Failed to parse module set journal.");
                return;
            }
            avzk avzk0 = avzk.d(context0);
            awjj awjj1 = avzk0.f();
            bzs bzs0 = new bzs();
            if(awjj1 != null) {
                for(Object object0: awjj1.b) {
                    bzs0.put(awjp.b(((awjn)object0)), ((awjn)object0));
                }
            }
            bzs bzs1 = z ? new bzs() : bzs0;
            for(Object object1: awjj0.b) {
                awjn awjn0 = (awjn)object1;
                String s = awjp.b(awjn0);
                awjn awjn1 = (awjn)bzs0.get(s);
                if(awjn1 != null) {
                    hfuo hfuo0 = awjn0.e;
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)awjn0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)awjn0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfvv hfvv0 = hfvv.a;
                    ((awjn)hftp0.b_message).e = hfvv0;
                    hftp0.dh(hfuo0);
                    hftp0.dh(awjn1.e);
                    if(((awjn)hftp0.b_message).e.size() >= 2) {
                        ArrayList arrayList0 = new ArrayList();
                        awjm awjm0 = awjm.a;
                        for(Object object2: DesugarCollections.unmodifiableList(((awjn)hftp0.b_message).e)) {
                            awjm awjm1 = (awjm)object2;
                            int v1 = awjl.a(awjm1.c);
                            int v2 = 1;
                            if(v1 == 0) {
                                v1 = 1;
                            }
                            int v3 = awjl.a(awjm0.c);
                            if(v3 != 0) {
                                v2 = v3;
                            }
                            if(v1 != v2) {
                                arrayList0.add(awjm1);
                                awjm0 = awjm1;
                            }
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((awjn)hftp0.b_message).e = hfvv0;
                        hftp0.dh(arrayList0);
                    }
                    awjp.k(hftp0);
                    awjn0 = (awjn)hftp0.N_build();
                }
                bzs1.put(s, awjn0);
            }
            ArrayList arrayList1 = new ArrayList(bzs1.d_num);
            for(int v = 0; v < bzs1.d_num; ++v) {
                arrayList1.add(((awjn)bzs1.i(v)));
            }
            Collections.sort(arrayList1, ModuleSetJournalUpdate.ModuleSetJournalIntentOperation.a);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)awjj.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            awjj awjj2 = (awjj)hftp1.b_message;
            awjj2.b();
            hfrj.E(arrayList1, awjj2.b);
            awjj awjj3 = (awjj)hftp1.N_build();
            if(avzk0.h()) {
                String s1 = bbmu.a(awjj3.toBytesArray());
                avzk0.a.edit().putString("Chimera.moduleSetJournal", s1).commit();
            }
            return;
        }
        Log.w("ModuleSetJournalOp", "Ignoring null module set journal bytes.");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getAction();
        boolean z = false;
        if("com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION".equals(s)) {
            byte[] arr_b = intent0.getByteArrayExtra("entries");
            if(intent0.getIntExtra("isComprehensive", 0) != 0) {
                z = true;
            }
            ModuleSetJournalUpdate.ModuleSetJournalIntentOperation.a(this, arr_b, z);
            return;
        }
        if("com.google.android.chimera.MODULE_CONFIGURATION_CHANGED".equals(s)) {
            ModuleManager moduleManager0 = ModuleManager.get(this);
            try {
                awjp awjp0 = new awjp();
                for(Object object0: moduleManager0.getCurrentConfig().moduleSets) {
                    awjp0.i(((ModuleManager.ModuleSetInfo)object0).moduleSetId, ((ModuleManager.ModuleSetInfo)object0).moduleSetVersion, 2, ((ModuleManager.ModuleSetInfo)object0).enabledFeatures);
                }
                ModuleSetJournalUpdate.ModuleSetJournalIntentOperation.a(this, awjp0.d(), false);
            }
            catch(InvalidConfigException invalidConfigException0) {
                Log.w("ModuleSetJournalOp", "Chimera module config error: " + invalidConfigException0.toString());
            }
        }
    }
}

