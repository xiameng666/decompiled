package com.google.android.gms.people.sync.focus;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import adqe;
import aet;
import afz;
import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.provider.ContactsContract.Groups;
import batl;
import bayn;
import cchj;
import com.google.android.chimera.IntentOperation;
import efpr;
import efur;
import egcb;
import egig;
import egiv;
import egym;
import egyo;
import egzl;
import ehba;
import ehbg;
import ehbk;
import ehbp;
import ehdo;
import ehdx;
import ehef;
import eheh;
import ehej;
import ehfh;
import ehjp;
import evuh;
import gfqz;
import gfsx;
import ggfp;
import gioz;
import hwyi;
import hwzc;
import hwzm;
import hxal;
import hxba;
import hxcv;
import j..util.Objects;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public class ContactsSyncIntentOperation extends IntentOperation {
    private final eheh a;

    public ContactsSyncIntentOperation() {
        egiv.R();
        this.a = eheh.a();
    }

    private static boolean a(Intent intent0) {
        return "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent0.getAction()) && intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        long v3;
        int v1;
        Context context0 = this.getApplicationContext();
        efur efur0 = efur.i(context0);
        if(hxba.a.e().Y() && ContactsSyncIntentOperation.a(intent0)) {
            egyo.d(context0).j();
        }
        if(ContactsSyncIntentOperation.a(intent0)) {
            if(hwyi.p() && hwyi.a.e().q()) {
                try {
                    aet aet0 = (aet)egcb.a(context0).get();
                    try {
                        afz afz0 = new afz();
                        afz0.g(new String[]{"cpg:GroupContactOrder"});
                        afz0.f(new String[]{"group_contact_order"});
                        Map map0 = egcb.d(aet0.b("", afz0.a()));
                        HashSet hashSet0 = new HashSet();
                        hashSet0.addAll(map0.keySet());
                        Cursor cursor0 = context0.getContentResolver().query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id", "account_name", "account_type"}, "deleted = 0", null, null);
                        while(true) {
                            try {
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                                String s = cursor0.getString(1);
                                String s1 = cursor0.getString(2);
                                Account[] arr_account = cchj.b(context0).o();
                                for(int v = 0; v < arr_account.length; ++v) {
                                    Account account0 = arr_account[v];
                                    if(Objects.equals(s, account0.name) && Objects.equals(s1, account0.type)) {
                                        hashSet0.remove(cursor0.getString(0));
                                        break;
                                    }
                                }
                            }
                            catch(Throwable throwable1) {
                                TWR.safeClose$NT(cursor0, throwable1);
                                throw throwable1;
                            }
                        }
                        cursor0.close();
                        boolean z = egcb.g(aet0, hashSet0);
                        egig.e("FSA2_ContactsSyncIntentOp", "Removed group contact orders from AppSearch: " + z);
                        v1 = z ? hashSet0.size() : 0;
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(aet0, throwable0);
                        throw throwable0;
                    }
                    aet0.close();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                    v1 = -1;
                }
                egig.f("FSA2_ContactsSyncIntentOp", "Removed %d group contact orders from AppSearch: ", v1);
            }
            for(Object object0: adqe.c(intent0)) {
                Account account1 = (Account)object0;
                if(!hxal.a.b().b() || "com.google".equals(account1.type)) {
                    egig.e("FSA2_ContactsSyncIntentOp", "Cleared progress notification for non-existing account.");
                    bayn.f(context0).o(ehdo.b(account1.name, false), 2, evuh.bz);
                    bayn.f(context0).o(ehdo.b(account1.name, true), 2, evuh.bz);
                    bayn.f(context0).o(ehdo.b(account1.name, false), 3, evuh.bz);
                    bayn.f(context0).o(ehdo.b(account1.name, true), 3, evuh.bz);
                    if(account1.name.equals(efur0.j())) {
                        efur0.s(null);
                        egig.e("FSA2_ContactsSyncIntentOp", "Cleared Portal info saved in Prefs.");
                        if(hxcv.a.c().h() && ehej.h(context0)) {
                            this.a.e(context0, account1.name);
                        }
                        else {
                            ehef.e(context0, account1.name);
                        }
                        egig.e("FSA2_ContactsSyncIntentOp", "Cleared progress item shown in Portal");
                    }
                    egig.e("FSA2_ContactsSyncIntentOp", "Clearing FSA2 sync status preference for removed account");
                    String s2 = account1.name;
                    batl.k(null);
                    batl.q(s2);
                    String s3 = ("_" + s2).toLowerCase(Locale.getDefault());
                    SharedPreferences.Editor sharedPreferences$Editor0 = efur0.a.edit();
                    for(Object object1: efur0.a.getAll().keySet()) {
                        String s4 = (String)object1;
                        if(!s4.toLowerCase(Locale.getDefault()).endsWith(s3)) {
                            new String("_com.android.contacts");
                            if(!gfqz.c(s4).endsWith(s3 + "_com.android.contacts")) {
                                continue;
                            }
                        }
                        sharedPreferences$Editor0.remove(s4);
                    }
                    sharedPreferences$Editor0.commit();
                }
            }
            return;
        }
        if(!ehdx.a(context0)) {
            egig.b("FSA2_ContactsSyncIntentOp", "Gms doesn\'t have contacts permission.");
            return;
        }
        if("android.intent.action.ACTION_POWER_CONNECTED".equals(intent0.getAction())) {
            boolean z1 = hwzc.a.c().aY();
            Boolean.valueOf(z1).getClass();
            if(z1) {
                egym egym0 = egym.a();
                ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
                NetworkCapabilities networkCapabilities0 = connectivityManager0 == null ? null : connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                int v2 = egym.b(networkCapabilities0);
                hwzm hwzm0 = hwzm.a;
                if(hwzm0.b().e() && (networkCapabilities0 == null || !networkCapabilities0.hasTransport(1))) {
                    egym.c(4, egym.b(networkCapabilities0), null);
                    return;
                }
                efur efur1 = efur.i(context0);
                ggfp ggfp0 = egym0.b.d(context0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gioz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gioz)hftp0.b_message).e = v2 - 1;
                ((gioz)hftp0.b_message).b |= 4;
                for(Object object2: ggfp0) {
                    Account account2 = (Account)object2;
                    if(hwzm0.b().d()) {
                        try {
                            v3 = new ehbg(new ehbk(new ehbp(context0.getContentResolver(), account2, gfsx.m(egzl.b)), account2)).a();
                        }
                        catch(ehfh ehfh0) {
                            egig.c("FSA2_ContactsSyncOnChargingOp", "Exception thrown when getting last full sync timestamp", ehfh0);
                            v3 = 0L;
                        }
                        long v4 = hwzm.a.b().a();
                        if(System.currentTimeMillis() - v3 < TimeUnit.SECONDS.toMillis(v4)) {
                            TimeUnit.SECONDS.toDays(v4);
                            egym.c(3, v2, account2.name);
                            continue;
                        }
                    }
                    SharedPreferences sharedPreferences0 = efur1.a;
                    long v5 = System.currentTimeMillis() - sharedPreferences0.getLong("focus_sync_timestamp_on_charging_" + account2.name, 0L);
                    long v6 = hwzm.a.b().b();
                    if(v5 < TimeUnit.SECONDS.toMillis(v6)) {
                        TimeUnit.SECONDS.toHours(v6);
                        egym.c(2, v2, account2.name);
                    }
                    else {
                        Bundle bundle0 = new Bundle();
                        bundle0.putBoolean("expedited", true);
                        bundle0.putBoolean("TRIGGERED_BY_CHARGING", true);
                        ContentResolver.requestSync(account2, "com.android.contacts", bundle0);
                        String s5 = account2.name;
                        sharedPreferences0.edit().putLong("focus_sync_timestamp_on_charging_" + s5, System.currentTimeMillis()).apply();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gioz)hftp0.b_message).c = 2;
                        ((gioz)hftp0.b_message).b |= 1;
                        efpr.a().d(((gioz)hftp0.N_build()), account2.name);
                    }
                }
            }
            return;
        }
        try {
            if(ehjp.a(context0.getPackageManager(), new ComponentName("com.google.android.gms", "com.google.android.gms.people.sync.focus.ContactsSyncAdapterService"), 2) == 2) {
                ehba.a.b(context0);
                return;
            }
            egig.e("FSA2_ContactsSyncIntentOp", "Sync is disabled. Skip prepareToSync");
        }
        catch(Exception exception0) {
            egig.c("FSA2_ContactsSyncIntentOp", "Failed to prepare for Contacts sync", exception0);
        }
    }
}

