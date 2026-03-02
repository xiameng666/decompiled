package com.google.android.gms.backup.transport.snapshot;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import adgg;
import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.UserHandle;
import android.provider.Settings.Secure;
import aqee;
import aqfs;
import aqjk;
import aqjl;
import aqld;
import aqnj;
import aqql;
import aqra;
import aqsl;
import aqvc;
import aqvd;
import aqvj;
import aqvk;
import aqyw;
import aqyx;
import aqzr;
import atnc;
import atnf;
import atng;
import atnh;
import atni;
import azqi;
import azqj;
import bakc;
import baun;
import bbdg;
import bbmt;
import ccmq;
import cllr;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fpwn;
import fpwo;
import gftm;
import gful_cronetEngineProvider;
import ggaf;
import gged_interceptors;
import ghyr;
import ghys;
import ghzm;
import giat;
import gicj;
import gick;
import hfrj;
import hfuf;
import hfuo;
import hqgx;
import hqlt;
import hqmf;
import hqmi;
import j..util.Collection.-EL;
import j..util.Objects;
import java.util.Arrays;
import java.util.List;

public class DeviceStateSnapshotLoggingTask extends GmsTaskBoundService {
    public static final baun a;

    static {
        DeviceStateSnapshotLoggingTask.a = aqql.a("DeviceStateSnapshotLoggingTask");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        int v15;
        aqvk aqvk0;
        Context context4;
        boolean z13;
        Context context3;
        boolean z12;
        ghzm ghzm1;
        int v3;
        gicj[] arr_gicj;
        int v1;
        Account[] arr_account;
        int v;
        Account account0;
        ccmq.a().a(bbdg.mi);
        DeviceStateSnapshotLoggingTask.a.j("Running", new Object[0]);
        atni atni0 = new atni(this);
        ProtoLiteBuilder hftp0 = aqra.b();
        try {
            Context context0 = atni0.b;
            account0 = null;
            account0 = new aqee(context0).a();
            if(account0 == null) {
                v = -1;
            }
            else {
                try {
                    arr_account = new adgg(context0).e(context0);
                }
                catch(RemoteException | azqj | azqi unused_ex) {
                    atni.a.m("Unable to get accounts on device.", new Object[0]);
                    arr_account = new Account[0];
                }
                v = -2;
                if(arr_account.length != 0) {
                    Arrays.sort(arr_account, new atnc());
                    v1 = bbmt.a(arr_account, account0);
                    goto label_21;
                }
            }
        }
        catch(IllegalArgumentException unused_ex) {
            v = -3;
        }
        goto label_23;
    label_21:
        if(v1 != -1) {
            v = v1;
        }
    label_23:
        aqjk aqjk0 = atni0.c;
        boolean z = aqjk0.i();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gick.a).v_newBuilder();
        gicj gicj0 = atni.a(aqjk0.d());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gick)hftp1.b_message).i = gicj0.g;
        ((gick)hftp1.b_message).b |= 0x40;
        String[] arr_s = aqjk0.g() ? aqjk0.a.listAllTransports() : null;
        if(arr_s == null) {
            arr_gicj = new gicj[0];
        }
        else {
            gicj[] arr_gicj1 = new gicj[arr_s.length];
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                arr_gicj1[v2] = atni.a(arr_s[v2]);
            }
            arr_gicj = arr_gicj1;
        }
        List list0 = Arrays.asList(arr_gicj);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick0 = (gick)hftp1.b_message;
        hfuf hfuf0 = gick0.j;
        if(!hfuf0.c()) {
            gick0.j = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: list0) {
            gick0.j.i(((gicj)object0).g);
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gick)hftv0).b |= 1;
        ((gick)hftv0).c = z;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick1 = (gick)hftp1.b_message;
        gick1.b |= 4;
        gick1.e = v;
        if(!((Boolean)atni0.i.mr()).booleanValue()) {
            switch(atni0.e.getInt("backupService", -1)) {
                case 0: {
                    v3 = 3;
                    break;
                }
                case 1: {
                    v3 = 2;
                    break;
                }
                default: {
                    v3 = 1;
                }
            }
        }
        else if(!aqjk0.j(UserHandle.of(UserHandle.myUserId()))) {
            v3 = 3;
        }
        else {
            v3 = 2;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gick)hftp1.b_message).d = v3 - 1;
        ((gick)hftp1.b_message).b |= 2;
        aqjl aqjl0 = atni0.g;
        Context context1 = atni0.b;
        boolean z1 = aqjl0.l(context1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick2 = (gick)hftp1.b_message;
        gick2.b |= 16;
        gick2.g = z1;
        int v4 = Settings.Secure.getInt(context1.getContentResolver(), "backup_auto_restore", 1);
        aqjl.p("backup_auto_restore", v4, aqjl.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick3 = (gick)hftp1.b_message;
        gick3.b |= 0x20;
        gick3.h = v4 != 0;
        boolean z2 = ContentResolver.getMasterSyncAutomatically();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick4 = (gick)hftp1.b_message;
        gick4.b |= 0x4000;
        gick4.r = z2;
        boolean z3 = aqjl0.k(context1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick5 = (gick)hftp1.b_message;
        gick5.b |= 0x800;
        gick5.o = z3;
        boolean z4 = aqjl0.m(context1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick6 = (gick)hftp1.b_message;
        gick6.b |= 0x200;
        gick6.m = z4;
        boolean z5 = aqjl0.n(context1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick7 = (gick)hftp1.b_message;
        gick7.b |= 0x400;
        gick7.n = z5;
        boolean z6 = aqjl0.j(context1);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick8 = (gick)hftp1.b_message;
        gick8.b |= 0x2000;
        gick8.q = z6;
        bakc bakc0 = atni0.e;
        long v5 = bakc0.getLong("lastKvBackupPassTimeMs", 0L);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick9 = (gick)hftp1.b_message;
        gick9.b |= 0x80;
        gick9.k = v5;
        long v6 = bakc0.getLong("lastFullBackupPassTimeMs", 0L);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick10 = (gick)hftp1.b_message;
        gick10.b |= 0x100;
        gick10.l = v6;
        boolean z7 = ((PowerManager)context1.getSystemService("power")).isPowerSaveMode();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick11 = (gick)hftp1.b_message;
        gick11.b |= 0x8000;
        gick11.s = z7;
        aqyx aqyx0 = atni0.f;
        Context context2 = ((aqyw)aqyx0).a;
        boolean z8 = new aqld(context2).a();
        Boolean.valueOf(z8).getClass();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick12 = (gick)hftp1.b_message;
        gick12.b |= 0x10000;
        gick12.t = z8;
        Object object1 = ((gftm)aqyx0.a()).a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick13 = (gick)hftp1.b_message;
        gick13.u = ((aqzr)object1).a - 1;
        gick13.b |= 0x20000;
        if(hqmi.a.b().c()) {
            boolean z9 = ((aqyw)aqyx0).b.o(context2);
            Boolean.valueOf(z9).getClass();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gick gick14 = (gick)hftp1.b_message;
            gick14.b |= 0x1000;
            gick14.p = z9;
        }
        bakc bakc1 = new bakc(context1, "backup_settings", true);
        Boolean boolean0 = bakc1.contains("use_mobile_data") ? Boolean.valueOf(bakc1.getBoolean("use_mobile_data", false)) : null;
        if(boolean0 != null) {
            boolean z10 = boolean0.booleanValue();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gick gick15 = (gick)hftp1.b_message;
            gick15.b |= 0x40000;
            gick15.v = z10;
        }
        SharedPreferences sharedPreferences0 = context1.getSharedPreferences("com.google.android.gms.backup.component.NoBackupNotificationService", 0);
        Integer integer0 = sharedPreferences0.contains("times_shown") ? sharedPreferences0.getInt("times_shown", 0) : null;
        if(integer0 != null) {
            int v7 = (int)integer0;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gick gick16 = (gick)hftp1.b_message;
            gick16.b |= 0x80000;
            gick16.w = v7;
        }
        boolean z11 = new aqee(context1).d();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick17 = (gick)hftp1.b_message;
        gick17.b |= 8;
        gick17.f = z11;
        if(hqmf.a.b().b()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghzm.a).v_newBuilder();
            ApplicationBackupStats[] arr_applicationBackupStats = new aqfs(context1).a(new BackupStatsRequestConfig(true, true));
            if(arr_applicationBackupStats == null) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ghzm ghzm0 = (ghzm)hftp2.b_message;
                ghzm0.b |= 16;
                ghzm0.g = -1;
                ghzm1 = (ghzm)hftp2.N_build();
                z12 = z;
                context3 = context1;
            }
            else if(arr_applicationBackupStats.length == 0) {
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ghzm ghzm2 = (ghzm)hftp2.b_message;
                ghzm2.b |= 16;
                ghzm2.g = 0;
                ghzm1 = (ghzm)hftp2.N_build();
                z12 = z;
                context3 = context1;
            }
            else {
                int v8 = 0;
                long v9 = 0L;
                long v10 = 0L;
                int v11 = 0;
                int v12 = 0;
                while(v8 < arr_applicationBackupStats.length) {
                    ApplicationBackupStats applicationBackupStats0 = arr_applicationBackupStats[v8];
                    if(applicationBackupStats0.b == 0) {
                        z13 = z;
                        context4 = context1;
                        if(applicationBackupStats0.c == 0) {
                            atni.a.j("Package %s has 0 backup size.", new Object[]{applicationBackupStats0.a});
                        }
                        else {
                            v10 += applicationBackupStats0.d;
                            ++v12;
                        }
                    }
                    else {
                        z13 = z;
                        context4 = context1;
                        v9 += applicationBackupStats0.d;
                        ++v11;
                    }
                    ++v8;
                    z = z13;
                    context1 = context4;
                }
                z12 = z;
                context3 = context1;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((ghzm)hftv1).b |= 16;
                ((ghzm)hftv1).g = arr_applicationBackupStats.length;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((ghzm)hftv2).b |= 4;
                ((ghzm)hftv2).e = v11;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp2.b_message;
                ((ghzm)hftv3).b |= 8;
                ((ghzm)hftv3).f = v12;
                if(!hftv3.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                ((ghzm)hftv4).b |= 1;
                ((ghzm)hftv4).c = v11 == 0 ? 0L : v9 / ((long)v11);
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ghzm ghzm3 = (ghzm)hftp2.b_message;
                ghzm3.b |= 2;
                ghzm3.d = v12 == 0 ? 0L : v10 / ((long)v12);
                ghzm1 = (ghzm)hftp2.N_build();
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gick gick18 = (gick)hftp1.b_message;
            ghzm1.getClass();
            gick18.x = ghzm1;
            gick18.b |= 0x100000;
        }
        else {
            z12 = z;
            context3 = context1;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)giat.a).v_newBuilder();
        fpwn fpwn0 = aqsl.a(context3.getPackageManager());
        int v13 = fpwn0.b();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        giat giat0 = (giat)hftp3.b_message;
        giat0.b |= 4;
        giat0.e = v13;
        int v14 = atni.b(fpwn0);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((giat)hftp3.b_message).d = v14 - 1;
        ((giat)hftp3.b_message).b |= 2;
        switch(v14) {
            case 4: {
                try {
                    if(context3.getPackageManager().getPackageInfo("com.google.android.apps.photos", 0).versionCode >= 222407) {
                        goto label_294;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    atni.a.j("Photos APK not found on the device.", new Object[0]);
                }
                break;
                try {
                label_294:
                    aqvc aqvc0 = aqvd.a();
                    aqvc0.c(16);
                    aqvd aqvd0 = aqvc0.a();
                    aqvk0 = atni0.j.b(aqvd0);
                }
                catch(RuntimeException runtimeException0) {
                    atni.a.g("Failed to fetch Photos backup state.", runtimeException0, new Object[0]);
                    aqvk0 = null;
                }
                if(aqvk0 == null) {
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((giat)hftp3.b_message).c = 3;
                    ((giat)hftp3.b_message).b |= 1;
                }
                else {
                    aqvj aqvj0 = aqvk0.a;
                    if(aqvj0 == aqvj.c) {
                        v15 = 4;
                    }
                    else {
                        v15 = aqvj0 == aqvj.b ? 3 : 2;
                    }
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ((giat)hftp3.b_message).c = v15 - 1;
                    ((giat)hftp3.b_message).b |= 1;
                    if(v15 == 2 && account0 != null) {
                        boolean z14 = Objects.equals(account0.name, aqvk0.b);
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        giat giat1 = (giat)hftp3.b_message;
                        giat1.b |= 8;
                        giat1.f = z14;
                    }
                }
                break;
            }
            case 3: 
            case 6: {
                break;
            }
            default: {
                goto label_294;
            }
        }
        Context context5 = atni0.b;
        fpwo fpwo0 = fpwo.g(context5.getPackageManager(), ((gful_cronetEngineProvider)new atnh()));
        int v16 = fpwo0.b();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        giat giat2 = (giat)hftp3.b_message;
        giat2.b |= 0x20;
        giat2.h = v16;
        int v17 = atni.b(fpwo0);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((giat)hftp3.b_message).g = v17 - 1;
        ((giat)hftp3.b_message).b |= 16;
        if(((Boolean)atni0.h.mr()).booleanValue()) {
            boolean z15 = new aqnj(context5).a().c;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            giat giat3 = (giat)hftp3.b_message;
            giat3.b |= 0x40;
            giat3.i = z15;
        }
        giat giat4 = (giat)hftp3.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gick gick19 = (gick)hftp1.b_message;
        giat4.getClass();
        gick19.y = giat4;
        gick19.b |= 0x200000;
        if(z12 && hqgx.a.c().r()) {
            gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(context5.getPackageManager().getInstalledPackages(0)).filter(new atnf(atni0)).map(new atng()).collect(ggaf.a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gick gick20 = (gick)hftp1.b_message;
            hfuo hfuo0 = gick20.z;
            if(!hfuo0.c()) {
                gick20.z = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged0, gick20.z);
        }
        gick gick21 = (gick)hftp1.N_build();
        int v18 = (int)hqlt.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        ghys0.b |= 0x200000;
        ghys0.w = v18;
        if(!hqlt.a.o().al()) {
            return 0;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp0.b_message;
        gick21.getClass();
        ghys1.u = gick21;
        ghys1.b |= 0x80000;
        ghys ghys2 = (ghys)hftp0.N_build();
        atni0.d.a(ghys2, ghyr.p);
        return 0;
    }
}

