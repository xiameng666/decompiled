package com.google.android.gms.intrusiondetection.service;

import a;
import android.accounts.Account;
import android.app.admin.ConnectEvent;
import android.app.admin.DnsEvent;
import android.app.admin.SecurityLog.SecurityEvent;
import android.content.Context;
import android.provider.Settings.Global;
import android.security.intrusiondetection.IntrusionDetectionEvent;
import au;
import bbcu;
import bbmq;
import bboh;
import cacc;
import cade;
import cadg;
import cadh;
import cadj;
import cadk;
import cadl;
import cadn;
import cadu;
import cadv;
import caed;
import caei;
import caej;
import caek;
import caem;
import caiz;
import caje;
import cclw;
import ccsb;
import cllr;
import com.google.android.gms.auth.folsom.ProductKey;
import ggdx;
import gged_interceptors;
import ggtj;
import gmcd;
import gmmg;
import gmnr;
import gmpb;
import gmpk;
import gmpl;
import gnpz;
import gnsl;
import ibnx;
import ibpg;
import ibpo;
import ibrl;
import ibrx;
import ibuk;
import ibuq;
import icck;
import iccl;
import icpu;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import oqj;
import org.json.JSONArray;
import org.json.JSONObject;

public final class BackupService extends Pommel_BackupService {
    public static final String a;
    public static final bboh b;
    public Context c;
    public cacc d;
    public caed e;
    public caje f;
    private final icck g;

    static {
        BackupService.a = new ibuk(BackupService.class).b();
        BackupService.b = bboh.b("IntrusionDetectionBackupService", bbcu.a);
    }

    public BackupService() {
        this.g = iccl.b(cclw.d);
    }

    public final Context d() {
        Context context0 = this.c;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("context");
        return null;
    }

    public final caed f() {
        caed caed0 = this.e;
        if(caed0 != null) {
            return caed0;
        }
        ibuq.j("dataRepository");
        return null;
    }

    public final Object i(ibrl ibrl0) {
        gged_interceptors gged1;
        cacc cacc1;
        gmmg gmmg0;
        File file2;
        Account account0;
        String s;
        cadu cadu0;
        BackupService backupService0 = this;
        if((ibrl0 instanceof cadu)) {
            cadu0 = (cadu)ibrl0;
            int v = cadu0.e;
            if((v & 0x80000000) == 0) {
                cadu0 = new cadu(backupService0, ibrl0);
            }
            else {
                cadu0.e = v - 0x80000000;
            }
        }
        else {
            cadu0 = new cadu(backupService0, ibrl0);
        }
        cadu cadu1 = cadu0;
        Object object0 = cadu1.c;
        ibrx ibrx0 = ibrx.a;
        switch(cadu1.e) {
            case 0: {
                ibnx.b(object0);
                bboh bboh0 = BackupService.b;
                ((ggtj)bboh0.j()).x("backup is triggered...");
                s = backupService0.f().a();
                if(s == null) {
                    ((ggtj)bboh0.i()).x("accountName is null");
                    return new Integer(2);
                }
                for(Object object1: caiz.a(backupService0.d())) {
                    if(!ibuq.m(((Account)object1).name, s)) {
                        continue;
                    }
                    goto label_28;
                }
                object1 = null;
            label_28:
                if(((Account)object1) == null) {
                    ((ggtj)bboh0.i()).x("account is null");
                    return new Integer(2);
                }
                gmcd gmcd0 = backupService0.j().a(s);
                cadu1.a = s;
                cadu1.b = (Account)object1;
                cadu1.e = 1;
                object0 = icpu.c(gmcd0, cadu1);
                if(object0 == ibrx0) {
                    return ibrx0;
                }
                account0 = (Account)object1;
                goto label_42;
            }
            case 1: {
                account0 = (Account)cadu1.b;
                s = (String)cadu1.a;
                ibnx.b(object0);
            label_42:
                if(!((Boolean)object0).booleanValue()) {
                    ((ggtj)BackupService.b.i()).x("keychainConsent is false");
                    return new Integer(2);
                }
                gmcd gmcd1 = backupService0.j().c(s);
                cadu1.a = account0;
                cadu1.b = null;
                cadu1.e = 2;
                object0 = icpu.c(gmcd1, cadu1);
                if(object0 == ibrx0) {
                    return ibrx0;
                }
                goto label_54;
            }
            case 2: {
                account0 = (Account)cadu1.a;
                ibnx.b(object0);
            label_54:
                ProductKey productKey0 = (ProductKey)ibpo.X(((List)object0));
                if(productKey0 == null) {
                    ((ggtj)BackupService.b.i()).x("productKey is unavailable");
                    return new Integer(2);
                }
                gged_interceptors gged0 = ggdx.a(((List)oqj.b(backupService0.f().a.u().a, true, false, new caek())));
                if(!gged0.isEmpty()) {
                    ibuq.f(gged0, "eventEntities");
                    StringBuilder stringBuilder0 = new StringBuilder();
                    Iterator iterator1 = gged0.iterator();
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        caei caei0 = (caei)object2;
                        if(au.a()) {
                            IntrusionDetectionEvent intrusionDetectionEvent0 = caei0.b;
                            switch(intrusionDetectionEvent0.getType()) {
                                case 0: {
                                    goto label_70;
                                }
                                case 1: {
                                    goto label_408;
                                }
                                case 2: {
                                    goto label_431;
                                }
                            }
                            continue;
                        label_70:
                            SecurityLog.SecurityEvent securityLog$SecurityEvent0 = intrusionDetectionEvent0.getSecurityEvent();
                            ibuq.e(securityLog$SecurityEvent0, "getSecurityEvent(...)");
                            ibuq.f(securityLog$SecurityEvent0, "securityEvent");
                            cadn cadn0 = new cadn(securityLog$SecurityEvent0.getTag(), securityLog$SecurityEvent0.getTimeNanos(), securityLog$SecurityEvent0.getData(), securityLog$SecurityEvent0.getId());
                            JSONObject jSONObject0 = new JSONObject();
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("event_id", cadn0.d);
                            jSONObject1.put("event_time", cadn0.b);
                            switch(cadn0.a) {
                                case 210001: {
                                    jSONObject1.put("adb_shell_interactive", new JSONObject());
                                    break;
                                }
                                case 210002: {
                                    jSONObject1.put("adb_shell_cmd", cadl.a(cadn0));
                                    break;
                                }
                                case 210003: {
                                    jSONObject1.put("adb_sync_recv_file", cadl.b(cadn0));
                                    break;
                                }
                                case 210004: {
                                    goto label_86;
                                }
                                case 210005: {
                                    jSONObject1.put("app_process_start", cadl.c(cadn0));
                                    break;
                                }
                                case 210006: {
                                    jSONObject1.put("keyguard_dismissed", new JSONObject());
                                    break;
                                }
                                case 210007: {
                                    jSONObject1.put("keyguard_dismiss_auth_attempt", cadl.o(cadn0));
                                    break;
                                }
                                case 210008: {
                                    jSONObject1.put("keyguard_secured", new JSONObject());
                                    break;
                                }
                                case 210009: {
                                    jSONObject1.put("os_startup", cadl.t(cadn0));
                                    break;
                                }
                                case 210010: {
                                    jSONObject1.put("os_shutdown", new JSONObject());
                                    break;
                                }
                                case 210011: {
                                    jSONObject1.put("logging_started", new JSONObject());
                                    break;
                                }
                                case 210012: {
                                    jSONObject1.put("logging_stopped", new JSONObject());
                                    break;
                                }
                                case 210013: {
                                    jSONObject1.put("media_mounted", cadl.r(cadn0));
                                    break;
                                }
                                case 210014: {
                                    jSONObject1.put("media_unmounted", cadl.s(cadn0));
                                    break;
                                }
                                case 210015: {
                                    jSONObject1.put("log_buffer_size_critical", new JSONObject());
                                    break;
                                }
                                case 210016: {
                                    goto label_114;
                                }
                                case 210017: {
                                    goto label_135;
                                }
                                case 210018: {
                                    goto label_184;
                                }
                                case 210019: {
                                    jSONObject1.put("max_screen_lock_timeout_set", cadl.q(cadn0));
                                    break;
                                }
                                case 210020: {
                                    jSONObject1.put("max_password_attempts_set", cadl.p(cadn0));
                                    break;
                                }
                                case 210021: {
                                    jSONObject1.put("keyguard_disabled_features_set", cadl.n(cadn0));
                                    break;
                                }
                                case 210022: {
                                    goto label_211;
                                }
                                case 210023: {
                                    jSONObject1.put("wipe_failure", new JSONObject());
                                    break;
                                }
                                case 210024: {
                                    jSONObject1.put("key_generated", cadl.k(cadn0));
                                    break;
                                }
                                case 210025: {
                                    jSONObject1.put("key_imported", cadl.l(cadn0));
                                    break;
                                }
                                case 210026: {
                                    jSONObject1.put("key_destruction", cadl.j(cadn0));
                                    break;
                                }
                                case 210027: {
                                    goto label_236;
                                }
                                case 210028: {
                                    goto label_253;
                                }
                                case 210029: {
                                    jSONObject1.put("cert_authority_installed", cadl.h(cadn0));
                                    break;
                                }
                                case 210030: {
                                    jSONObject1.put("cert_authority_removed", cadl.i(cadn0));
                                    break;
                                }
                                case 210031: {
                                    goto label_274;
                                }
                                case 210032: {
                                    jSONObject1.put("key_integrity_violation", cadl.m(cadn0));
                                    break;
                                }
                                case 210033: {
                                    goto label_282;
                                }
                                case 210034: {
                                    jSONObject1.put("camera_policy_set", cadl.g(cadn0));
                                    break;
                                }
                                case 210035: {
                                    goto label_290;
                                }
                                case 210036: {
                                    goto label_311;
                                }
                                case 210037: {
                                    goto label_324;
                                }
                                case 210038: {
                                    goto label_341;
                                }
                                case 210039: {
                                    jSONObject1.put("bluetooth_connection", cadl.e(cadn0));
                                    break;
                                }
                                case 210040: {
                                    jSONObject1.put("bluetooth_disconnection", cadl.f(cadn0));
                                    break;
                                }
                                case 210041: {
                                    jSONObject1.put("package_installed", cadl.u(cadn0));
                                    break;
                                }
                                case 210042: {
                                    goto label_360;
                                }
                                case 210043: {
                                    goto label_377;
                                }
                                case 210044: {
                                    jSONObject1.put("backup_service_toggled", cadl.d(cadn0));
                                    break;
                                }
                                case 210045: {
                                    jSONObject1.put("nfc_enabled", new JSONObject());
                                    break;
                                }
                                case 210046: {
                                    goto label_398;
                                }
                            }
                            goto label_399;
                        label_86:
                            JSONObject jSONObject2 = new JSONObject();
                            Object object3 = cadn0.c;
                            if((object3 instanceof String)) {
                                jSONObject2.put("path", object3);
                            }
                            jSONObject1.put("adb_sync_send_file", jSONObject2);
                            goto label_399;
                        label_114:
                            Object object4 = cadn0.c;
                            JSONObject jSONObject3 = new JSONObject();
                            if((object4 instanceof Object[])) {
                                Object object5 = ibpg.F(((Object[])object4), 0);
                                String s1 = (object5 instanceof String) ? ((String)object5) : null;
                                if(s1 != null) {
                                    jSONObject3.put("package", s1);
                                }
                                Object object6 = ibpg.F(((Object[])object4), 1);
                                Integer integer0 = (object6 instanceof Integer) ? ((Integer)object6) : null;
                                if(integer0 != null) {
                                    jSONObject3.put("admin_user", integer0.intValue());
                                }
                                Object object7 = ibpg.F(((Object[])object4), 2);
                                Integer integer1 = (object7 instanceof Integer) ? ((Integer)object7) : null;
                                if(integer1 != null) {
                                    jSONObject3.put("target_user", integer1.intValue());
                                }
                                Object object8 = ibpg.F(((Object[])object4), 3);
                                Long long0 = (object8 instanceof Long) ? ((Long)object8) : null;
                                if(long0 != null) {
                                    jSONObject3.put("timeout", long0.longValue());
                                }
                            }
                            jSONObject1.put("password_expiration_set", jSONObject3);
                            goto label_399;
                        label_135:
                            Object object9 = cadn0.c;
                            JSONObject jSONObject4 = new JSONObject();
                            if((object9 instanceof Object[])) {
                                Object object10 = ibpg.F(((Object[])object9), 0);
                                String s2 = (object10 instanceof String) ? ((String)object10) : null;
                                if(s2 != null) {
                                    jSONObject4.put("package", s2);
                                }
                                Object object11 = ibpg.F(((Object[])object9), 1);
                                Integer integer2 = (object11 instanceof Integer) ? ((Integer)object11) : null;
                                if(integer2 != null) {
                                    jSONObject4.put("admin_user", integer2.intValue());
                                }
                                Object object12 = ibpg.F(((Object[])object9), 2);
                                Integer integer3 = (object12 instanceof Integer) ? ((Integer)object12) : null;
                                if(integer3 != null) {
                                    jSONObject4.put("target_user", integer3.intValue());
                                }
                                Object object13 = ibpg.F(((Object[])object9), 3);
                                Integer integer4 = (object13 instanceof Integer) ? ((Integer)object13) : null;
                                if(integer4 != null) {
                                    jSONObject4.put("length", integer4.intValue());
                                }
                                Object object14 = ibpg.F(((Object[])object9), 4);
                                Integer integer5 = (object14 instanceof Integer) ? ((Integer)object14) : null;
                                if(integer5 != null) {
                                    jSONObject4.put("quality", integer5.intValue());
                                }
                                Object object15 = ibpg.F(((Object[])object9), 5);
                                Integer integer6 = (object15 instanceof Integer) ? ((Integer)object15) : null;
                                if(integer6 != null) {
                                    jSONObject4.put("num_letters", integer6.intValue());
                                }
                                Object object16 = ibpg.F(((Object[])object9), 6);
                                Integer integer7 = (object16 instanceof Integer) ? ((Integer)object16) : null;
                                if(integer7 != null) {
                                    jSONObject4.put("num_non_letters", integer7.intValue());
                                }
                                Object object17 = ibpg.F(((Object[])object9), 7);
                                Integer integer8 = (object17 instanceof Integer) ? ((Integer)object17) : null;
                                if(integer8 != null) {
                                    jSONObject4.put("num_numeric", integer8.intValue());
                                }
                                Object object18 = ibpg.F(((Object[])object9), 8);
                                Integer integer9 = (object18 instanceof Integer) ? ((Integer)object18) : null;
                                if(integer9 != null) {
                                    jSONObject4.put("num_uppercase", integer9.intValue());
                                }
                                Object object19 = ibpg.F(((Object[])object9), 9);
                                Integer integer10 = (object19 instanceof Integer) ? ((Integer)object19) : null;
                                if(integer10 != null) {
                                    jSONObject4.put("num_lowercase", integer10.intValue());
                                }
                                Object object20 = ibpg.F(((Object[])object9), 10);
                                Integer integer11 = (object20 instanceof Integer) ? ((Integer)object20) : null;
                                if(integer11 != null) {
                                    jSONObject4.put("num_symbols", integer11.intValue());
                                }
                            }
                            jSONObject1.put("password_complexity_set", jSONObject4);
                            goto label_399;
                        label_184:
                            Object object21 = cadn0.c;
                            JSONObject jSONObject5 = new JSONObject();
                            if((object21 instanceof Object[])) {
                                Object object22 = ibpg.F(((Object[])object21), 0);
                                String s3 = (object22 instanceof String) ? ((String)object22) : null;
                                if(s3 != null) {
                                    jSONObject5.put("package", s3);
                                }
                                Object object23 = ibpg.F(((Object[])object21), 1);
                                Integer integer12 = (object23 instanceof Integer) ? ((Integer)object23) : null;
                                if(integer12 != null) {
                                    jSONObject5.put("admin_user", integer12.intValue());
                                }
                                Object object24 = ibpg.F(((Object[])object21), 2);
                                Integer integer13 = (object24 instanceof Integer) ? ((Integer)object24) : null;
                                if(integer13 != null) {
                                    jSONObject5.put("target_user", integer13.intValue());
                                }
                                Object object25 = ibpg.F(((Object[])object21), 3);
                                Integer integer14 = (object25 instanceof Integer) ? ((Integer)object25) : null;
                                if(integer14 != null) {
                                    jSONObject5.put("length", integer14.intValue());
                                }
                            }
                            jSONObject1.put("password_history_length_set", jSONObject5);
                            goto label_399;
                        label_211:
                            Object object26 = cadn0.c;
                            JSONObject jSONObject6 = new JSONObject();
                            if((object26 instanceof Object[])) {
                                Object object27 = ibpg.F(((Object[])object26), 0);
                                String s4 = (object27 instanceof String) ? ((String)object27) : null;
                                if(s4 != null) {
                                    jSONObject6.put("package", s4);
                                }
                                Object object28 = ibpg.F(((Object[])object26), 1);
                                Integer integer15 = (object28 instanceof Integer) ? ((Integer)object28) : null;
                                if(integer15 != null) {
                                    jSONObject6.put("admin_user", integer15.intValue());
                                }
                                Object object29 = ibpg.F(((Object[])object26), 2);
                                Integer integer16 = (object29 instanceof Integer) ? ((Integer)object29) : null;
                                if(integer16 != null) {
                                    jSONObject6.put("target_user", integer16.intValue());
                                }
                            }
                            jSONObject1.put("remote_lock", jSONObject6);
                            goto label_399;
                        label_236:
                            Object object30 = cadn0.c;
                            JSONObject jSONObject7 = new JSONObject();
                            if((object30 instanceof Object[])) {
                                Object object31 = ibpg.F(((Object[])object30), 0);
                                String s5 = (object31 instanceof String) ? ((String)object31) : null;
                                if(s5 != null) {
                                    jSONObject7.put("package", s5);
                                }
                                Object object32 = ibpg.F(((Object[])object30), 1);
                                Integer integer17 = (object32 instanceof Integer) ? ((Integer)object32) : null;
                                if(integer17 != null) {
                                    jSONObject7.put("admin_user", integer17.intValue());
                                }
                                Object object33 = ibpg.F(((Object[])object30), 2);
                                String s6 = (object33 instanceof String) ? ((String)object33) : null;
                                if(s6 != null) {
                                    jSONObject7.put("restriction", s6);
                                }
                            }
                            jSONObject1.put("user_restriction_added", jSONObject7);
                            goto label_399;
                        label_253:
                            Object object34 = cadn0.c;
                            JSONObject jSONObject8 = new JSONObject();
                            if((object34 instanceof Object[])) {
                                Object object35 = ibpg.F(((Object[])object34), 0);
                                String s7 = (object35 instanceof String) ? ((String)object35) : null;
                                if(s7 != null) {
                                    jSONObject8.put("package", s7);
                                }
                                Object object36 = ibpg.F(((Object[])object34), 1);
                                Integer integer18 = (object36 instanceof Integer) ? ((Integer)object36) : null;
                                if(integer18 != null) {
                                    jSONObject8.put("admin_user", integer18.intValue());
                                }
                                Object object37 = ibpg.F(((Object[])object34), 2);
                                String s8 = (object37 instanceof String) ? ((String)object37) : null;
                                if(s8 != null) {
                                    jSONObject8.put("restriction", s8);
                                }
                            }
                            jSONObject1.put("user_restriction_removed", jSONObject8);
                            goto label_399;
                        label_274:
                            JSONObject jSONObject9 = new JSONObject();
                            Object object38 = cadn0.c;
                            if((object38 instanceof Integer)) {
                                jSONObject9.put("success", ibuq.m(object38, Integer.valueOf(1)));
                            }
                            jSONObject1.put("crypto_self_test_completed", jSONObject9);
                            goto label_399;
                        label_282:
                            JSONObject jSONObject10 = new JSONObject();
                            Object object39 = cadn0.c;
                            if((object39 instanceof String)) {
                                jSONObject10.put("reason", object39);
                            }
                            jSONObject1.put("cert_validation_failure", jSONObject10);
                            goto label_399;
                        label_290:
                            Object object40 = cadn0.c;
                            JSONObject jSONObject11 = new JSONObject();
                            if((object40 instanceof Object[])) {
                                Object object41 = ibpg.F(((Object[])object40), 0);
                                String s9 = (object41 instanceof String) ? ((String)object41) : null;
                                if(s9 != null) {
                                    jSONObject11.put("package", s9);
                                }
                                Object object42 = ibpg.F(((Object[])object40), 1);
                                Integer integer19 = (object42 instanceof Integer) ? ((Integer)object42) : null;
                                if(integer19 != null) {
                                    jSONObject11.put("admin_user", integer19.intValue());
                                }
                                Object object43 = ibpg.F(((Object[])object40), 2);
                                Integer integer20 = (object43 instanceof Integer) ? ((Integer)object43) : null;
                                if(integer20 != null) {
                                    jSONObject11.put("target_user", integer20.intValue());
                                }
                                Object object44 = ibpg.F(((Object[])object40), 3);
                                Integer integer21 = (object44 instanceof Integer) ? ((Integer)object44) : null;
                                if(integer21 != null) {
                                    jSONObject11.put("complexity", integer21.intValue());
                                }
                            }
                            jSONObject1.put("password_complexity_required", jSONObject11);
                            goto label_399;
                        label_311:
                            Object object45 = cadn0.c;
                            JSONObject jSONObject12 = new JSONObject();
                            if((object45 instanceof Object[])) {
                                Object object46 = ibpg.F(((Object[])object45), 0);
                                Integer integer22 = (object46 instanceof Integer) ? ((Integer)object46) : null;
                                if(integer22 != null) {
                                    jSONObject12.put("password_complexity", integer22.intValue());
                                }
                                Object object47 = ibpg.F(((Object[])object45), 1);
                                Integer integer23 = (object47 instanceof Integer) ? ((Integer)object47) : null;
                                if(integer23 != null) {
                                    jSONObject12.put("target_user", integer23.intValue());
                                }
                            }
                            jSONObject1.put("password_changed", jSONObject12);
                            goto label_399;
                        label_324:
                            Object object48 = cadn0.c;
                            JSONObject jSONObject13 = new JSONObject();
                            if((object48 instanceof Object[])) {
                                Object object49 = ibpg.F(((Object[])object48), 0);
                                String s10 = (object49 instanceof String) ? ((String)object49) : null;
                                if(s10 != null) {
                                    jSONObject13.put("bssid", s10);
                                }
                                Object object50 = ibpg.F(((Object[])object48), 1);
                                String s11 = (object50 instanceof String) ? ((String)object50) : null;
                                if(s11 != null) {
                                    jSONObject13.put("event_type", s11);
                                }
                                Object object51 = ibpg.F(((Object[])object48), 2);
                                String s12 = (object51 instanceof String) ? ((String)object51) : null;
                                if(s12 != null) {
                                    jSONObject13.put("reason", s12);
                                }
                            }
                            jSONObject1.put("wifi_connection", jSONObject13);
                            goto label_399;
                        label_341:
                            Object object52 = cadn0.c;
                            JSONObject jSONObject14 = new JSONObject();
                            if((object52 instanceof Object[])) {
                                Object object53 = ibpg.F(((Object[])object52), 0);
                                String s13 = (object53 instanceof String) ? ((String)object53) : null;
                                if(s13 != null) {
                                    jSONObject14.put("bssid", s13);
                                }
                                Object object54 = ibpg.F(((Object[])object52), 1);
                                String s14 = (object54 instanceof String) ? ((String)object54) : null;
                                if(s14 != null) {
                                    jSONObject14.put("reason", s14);
                                }
                            }
                            jSONObject1.put("wifi_disconnection", jSONObject14);
                            goto label_399;
                        label_360:
                            JSONObject jSONObject15 = new JSONObject();
                            Object object55 = cadn0.c;
                            if((object55 instanceof Object[])) {
                                Object object56 = ibpg.F(((Object[])object55), 0);
                                String s15 = (object56 instanceof String) ? ((String)object56) : null;
                                if(s15 != null) {
                                    jSONObject15.put("package_name", s15);
                                }
                                Object object57 = ibpg.F(((Object[])object55), 1);
                                Long long1 = (object57 instanceof Long) ? ((Long)object57) : null;
                                if(long1 != null) {
                                    jSONObject15.put("version_code", long1.longValue());
                                }
                                Object object58 = ibpg.F(((Object[])object55), 2);
                                Integer integer24 = (object58 instanceof Integer) ? ((Integer)object58) : null;
                                if(integer24 != null) {
                                    jSONObject15.put("user_id", integer24.intValue());
                                }
                            }
                            jSONObject1.put("package_updated", jSONObject15);
                            goto label_399;
                        label_377:
                            JSONObject jSONObject16 = new JSONObject();
                            Object object59 = cadn0.c;
                            if((object59 instanceof Object[])) {
                                Object object60 = ibpg.F(((Object[])object59), 0);
                                String s16 = (object60 instanceof String) ? ((String)object60) : null;
                                if(s16 != null) {
                                    jSONObject16.put("package_name", s16);
                                }
                                Object object61 = ibpg.F(((Object[])object59), 1);
                                Long long2 = (object61 instanceof Long) ? ((Long)object61) : null;
                                if(long2 != null) {
                                    jSONObject16.put("version_code", long2.longValue());
                                }
                                Object object62 = ibpg.F(((Object[])object59), 2);
                                Integer integer25 = (object62 instanceof Integer) ? ((Integer)object62) : null;
                                if(integer25 != null) {
                                    jSONObject16.put("user_id", integer25.intValue());
                                }
                            }
                            jSONObject1.put("package_uninstalled", jSONObject16);
                            goto label_399;
                        label_398:
                            jSONObject1.put("nfc_disabled", new JSONObject());
                        label_399:
                            jSONObject0.put("security_event", jSONObject1);
                            stringBuilder0.append(jSONObject0);
                            stringBuilder0.append('\n');
                            gged0 = gged0;
                            account0 = account0;
                            iterator1 = iterator1;
                            ibrx0 = ibrx0;
                            cadu1 = cadu1;
                            continue;
                        label_408:
                            DnsEvent dnsEvent0 = intrusionDetectionEvent0.getDnsEvent();
                            ibuq.e(dnsEvent0, "getDnsEvent(...)");
                            cadk cadk0 = cadj.a(dnsEvent0);
                            JSONObject jSONObject17 = new JSONObject();
                            JSONObject jSONObject18 = new JSONObject();
                            jSONObject18.put("event_id", cadk0.a);
                            jSONObject18.put("event_time", cadk0.b);
                            jSONObject18.put("package_name", cadk0.c);
                            jSONObject18.put("hostname", cadk0.d);
                            JSONArray jSONArray0 = new JSONArray();
                            String[] arr_s = cadk0.e;
                            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                                jSONArray0.put(arr_s[v1]);
                            }
                            jSONObject18.put("ip_addresses", jSONArray0);
                            jSONObject18.put("ip_addresses_count", cadk0.f);
                            jSONObject17.put("dns_event", jSONObject18);
                            stringBuilder0.append(jSONObject17);
                            stringBuilder0.append('\n');
                            gged0 = gged0;
                            continue;
                        label_431:
                            ConnectEvent connectEvent0 = intrusionDetectionEvent0.getConnectEvent();
                            ibuq.e(connectEvent0, "getConnectEvent(...)");
                            cadh cadh0 = cadg.a(connectEvent0);
                            JSONObject jSONObject19 = new JSONObject();
                            JSONObject jSONObject20 = new JSONObject();
                            jSONObject20.put("event_id", cadh0.a);
                            jSONObject20.put("event_time", cadh0.b);
                            jSONObject20.put("package_name", cadh0.c);
                            jSONObject20.put("port", cadh0.d);
                            jSONObject20.put("ip_address", cadh0.e);
                            jSONObject19.put("connect_event", jSONObject20);
                            stringBuilder0.append(jSONObject19);
                            stringBuilder0.append('\n');
                            gged0 = gged0;
                        }
                    }
                    String s17 = stringBuilder0.toString();
                    Context context0 = this.d();
                    ibuq.f(context0, "context");
                    String s18 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
                    ibuq.e(s18, "format(...)");
                    UUID uUID0 = UUID.randomUUID();
                    StringBuilder stringBuilder1 = new StringBuilder("backup_");
                    stringBuilder1.append(s18);
                    stringBuilder1.append("_");
                    stringBuilder1.append(uUID0);
                    stringBuilder1.append(".enc");
                    File file0 = context0.getCacheDir();
                    try {
                        File file1 = new File(ccsb.a.b(file0, stringBuilder1.toString()));
                        if(!file1.createNewFile()) {
                            throw new IllegalStateException("Check failed.");
                        }
                        file2 = file1;
                        goto label_470;
                    }
                    catch(IOException iOException0) {
                        a.e(BackupService.b.i(), "Fail to create temp file: %s", iOException0.getMessage(), iOException0);
                    }
                    catch(IllegalStateException illegalStateException0) {
                        a.e(BackupService.b.i(), "Fail to create temp file: %s", illegalStateException0.getMessage(), illegalStateException0);
                    }
                    file2 = null;
                label_470:
                    if(file2 == null) {
                        ((ggtj)BackupService.b.i()).x("temp file is null");
                        return new Integer(2);
                    }
                    byte[] arr_b = productKey0.b;
                    ibuq.e(arr_b, "keyMaterial");
                    ibuq.f(arr_b, "rootKeyBytes");
                    gmnr.a();
                    if(arr_b.length == 0x20) {
                        try {
                            gmpk gmpk0 = new gmpk();
                            gmpk0.b();
                            gmpk0.c(0x20);
                            gmpk0.d();
                            gmpk0.a = gmpl.c;
                            gmmg0 = gnpz.c(gmpb.a(gmpk0.a(), gnsl.c(arr_b), null));
                        }
                        catch(GeneralSecurityException generalSecurityException0) {
                            throw new GeneralSecurityException("Error initializing AEAD with the provided key.", generalSecurityException0);
                        }
                        String s19 = file2.getAbsolutePath();
                        ibuq.e(s19, "getAbsolutePath(...)");
                        byte[] arr_b1 = cade.a(s17, s19, gmmg0, new byte[0]);
                        Context context1 = this.d();
                        ibuq.f(context1, "context");
                        String s20 = bbmq.m(context1);
                        ibuq.e(s20, "getAndroidIdFromGservicesAsHexString(...)");
                        Context context2 = this.d();
                        ibuq.f(context2, "context");
                        String s21 = Settings.Global.getString(context2.getContentResolver(), "device_name");
                        ibuq.e(s21, "getString(...)");
                        backupService0 = this;
                        try {
                            cacc cacc0 = backupService0.d;
                            if(cacc0 == null) {
                                ibuq.j("cloudClient");
                                cacc1 = null;
                            }
                            else {
                                cacc1 = cacc0;
                            }
                            String s22 = file2.getAbsolutePath();
                            ibuq.e(s22, "getAbsolutePath(...)");
                            gged1 = gged0;
                            cadu1.a = gged1;
                            cadu1.b = file2;
                            cadu1.e = 3;
                            object0 = cacc1.b(account0, s20, arr_b1, productKey0.a, s22, s21, cadu1);
                            if(object0 == ibrx0) {
                                return ibrx0;
                            }
                            goto label_520;
                        }
                        catch(IOException iOException1) {
                            goto label_523;
                        }
                        catch(Throwable throwable0) {
                            file2.delete();
                            throw throwable0;
                        }
                    }
                    throw new IllegalArgumentException("Root key must be 256 bits (32 bytes).");
                }
                ((ggtj)BackupService.b.i()).x("no eventEntities to backup");
                return new Integer(2);
            }
            case 3: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        file2 = (File)cadu1.b;
        gged1 = (gged_interceptors)cadu1.a;
        try {
            try {
                ibnx.b(object0);
            label_520:
                ((Number)object0).longValue();
                goto label_529;
            }
            catch(IOException iOException1) {
            }
        label_523:
            ((ggtj)((ggtj)BackupService.b.i()).s(iOException1)).B("Failed to upload log file: %s", iOException1.getMessage());
        }
        catch(Throwable throwable0) {
            file2.delete();
            throw throwable0;
        }
        file2.delete();
        return new Integer(1);
    label_529:
        file2.delete();
        caed caed0 = backupService0.f();
        ibuq.f(gged1, "entities");
        caej caej0 = caed0.a.u();
        gged1.getClass();
        caem caem0 = new caem(caej0, gged1);
        Integer integer26 = (Integer)oqj.b(caej0.a, false, true, caem0);
        return new Integer(0);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        cadv cadv0 = new cadv(this, null);
        return icpu.e(this.g, cadv0);
    }

    public final caje j() {
        caje caje0 = this.f;
        if(caje0 != null) {
            return caje0;
        }
        ibuq.j("gmsKeyRetrievalClient");
        return null;
    }
}

