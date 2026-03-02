import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import com.google.android.gms.leveldb.LevelDb.Iterator;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

final class fxti implements Runnable {
    final fxtj a;

    public fxti(fxtj fxtj0) {
        Objects.requireNonNull(fxtj0);
        this.a = fxtj0;
        super();
    }

    @Override
    public final void run() {
        int v38;
        Object object2;
        fxqn fxqn2;
        int v30;
        fxso fxso1;
        fxsf fxsf0;
        ayvc ayvc0;
        String s2;
        int v29;
        fxtr fxtr0;
        fxso fxso0;
        long v28;
        ProtoLiteBuilder hftp0;
        gzuh gzuh1;
        gzuh gzuh0;
        ArrayList arrayList0;
        int v19;
        int v18;
        long v17;
        int v15;
        int v14;
        byte[] arr_b;
        LevelDb.Iterator levelDb$Iterator0;
        Account account2;
        int v12;
        int v11;
        int v10;
        fxqp fxqp0;
        Object object1;
        boolean z;
        int v8;
        int v7;
        int v6;
        Account account1;
        hzel hzel0;
        hzek hzek0;
        long v5;
        int v4;
        long v3;
        Context context1;
        fxqn fxqn1;
        ReportingConfig reportingConfig1;
        fxra.g("UlrUploadTaskStarted");
        fxsh fxsh0 = this.a.b;
        ReportingConfig reportingConfig0 = fxsh0.b.d();
        fxqn fxqn0 = fxsh0.e;
        fxqn0.a(reportingConfig0);
        int v = reportingConfig0.c().size();
        fxra.r(0, v);
        Context context0 = fxsh0.a;
        if(fxva.n(context0)) {
            long v1 = SystemClock.elapsedRealtime();
            List list0 = reportingConfig0.b();
            Collections.shuffle(list0, fxsh0.g);
            int v2 = 0;
            for(Object object0: list0) {
                AccountConfig accountConfig0 = (AccountConfig)object0;
                Account account0 = accountConfig0.a;
                try {
                    if(accountConfig0.l) {
                        fxqw.c("GCoreUlr", "Settings dirty, skipping upload for " + cnug.a(account0));
                        ReportingSyncChimeraService.b(account0, context0);
                        fxra.k("UlrUploadStatus", 5);
                        reportingConfig1 = reportingConfig0;
                        fxqn1 = fxqn0;
                        context1 = context0;
                        v3 = v1;
                        v4 = 0;
                    }
                    else {
                        v5 = System.currentTimeMillis();
                        hzek0 = hzek.a;
                        hzel0 = hzek0.i();
                        context1 = context0;
                        goto label_43;
                    }
                    goto label_441;
                }
                catch(RuntimeException runtimeException0) {
                    reportingConfig1 = reportingConfig0;
                    fxqn1 = fxqn0;
                    context1 = context0;
                    v3 = v1;
                    account1 = account0;
                    goto label_433;
                }
                try {
                label_43:
                    v6 = (int)hzel0.B();
                    v7 = 0;
                    v8 = 0;
                    z = true;
                }
                catch(RuntimeException runtimeException0) {
                    reportingConfig1 = reportingConfig0;
                    fxqn1 = fxqn0;
                    v3 = v1;
                    account1 = account0;
                    goto label_433;
                }
                while(v7 < v6 && z) {
                    try {
                        int v9 = (int)hzek0.i().A();
                        object1 = fxqn0.c;
                        __monitor_enter(object1);
                    }
                    catch(RuntimeException runtimeException0) {
                        reportingConfig1 = reportingConfig0;
                        fxqn1 = fxqn0;
                        v3 = v1;
                        account1 = account0;
                        goto label_433;
                    }
                    try {
                        fxqp0 = new fxqp();
                        v10 = v7;
                        if(fxqn0.d == null) {
                            __monitor_exit(object1);
                            reportingConfig1 = reportingConfig0;
                            v11 = v6;
                            v12 = v8;
                            account2 = account0;
                        }
                        else {
                            goto label_80;
                        }
                        goto label_134;
                    }
                    catch(Throwable throwable0) {
                        try {
                            reportingConfig1 = reportingConfig0;
                            fxqn1 = fxqn0;
                            v3 = v1;
                            account1 = account0;
                            goto label_129;
                        }
                        catch(Throwable throwable0) {
                            goto label_132;
                        }
                    }
                    try {
                    label_80:
                        reportingConfig1 = reportingConfig0;
                        account2 = account0;
                        fxqn0.h(account2);
                        v11 = v6;
                        levelDb$Iterator0 = fxqn0.d.iterator();
                        arr_b = fxqq.c(account2, v5);
                    }
                    catch(Throwable throwable0) {
                        goto label_126;
                    }
                    try {
                        levelDb$Iterator0.seek(arr_b);
                        int v13 = 0;
                        while(true) {
                            if(fxqn.c(levelDb$Iterator0, account2)) {
                                v14 = v13;
                                if(fxqp0.a.size() + fxqp0.b.size() + fxqp0.c.size() < v9) {
                                    fxrq fxrq0 = fxqn.i(fxqn0.e(levelDb$Iterator0.value()));
                                    if(fxrq0 == null) {
                                        v15 = v8;
                                    }
                                    else {
                                        v15 = v8;
                                        fxqp0.a(levelDb$Iterator0.key(), fxrq0);
                                        if((fxrq0.b & 1) != 0) {
                                            v13 = 1;
                                            levelDb$Iterator0.next();
                                            v8 = v15;
                                            continue;
                                        }
                                    }
                                    v13 = v14;
                                    levelDb$Iterator0.next();
                                    v8 = v15;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v14 = v13;
                            break;
                        }
                        v12 = v8;
                        int v16 = v14;
                        while(fxqn.c(levelDb$Iterator0, account2) && v16 == 0) {
                            fxrq fxrq1 = fxqn.i(fxqn0.e(levelDb$Iterator0.value()));
                            if(fxrq1 != null && (fxrq1.b & 1) != 0) {
                                fxqp0.a(levelDb$Iterator0.key(), fxrq1);
                                v16 = 1;
                            }
                            else {
                                v16 = 0;
                            }
                            levelDb$Iterator0.next();
                        }
                    }
                    catch(Throwable throwable1) {
                        try {
                            account1 = account2;
                            fxqn1 = fxqn0;
                            v3 = v1;
                            levelDb$Iterator0.close();
                            throw throwable1;
                        }
                        catch(Throwable throwable0) {
                            goto label_132;
                        }
                    }
                    try {
                        levelDb$Iterator0.close();
                        __monitor_exit(object1);
                        goto label_134;
                    }
                    catch(Throwable throwable0) {
                        try {
                        label_126:
                            account1 = account2;
                            fxqn1 = fxqn0;
                            v3 = v1;
                            while(true) {
                            label_129:
                                __monitor_exit(object1);
                                break;
                            label_132:
                            }
                        }
                        catch(Throwable throwable0) {
                            goto label_132;
                        }
                    }
                    try {
                        throw throwable0;
                    }
                    catch(RuntimeException runtimeException0) {
                        goto label_433;
                    }
                label_134:
                    String s = null;
                    if(fxqp0.a.isEmpty()) {
                        if(v10 == 0) {
                            fxqn1 = fxqn0;
                            v3 = v1;
                            v17 = v5;
                            v18 = 0;
                            v19 = 4;
                        }
                        else {
                            fxqn1 = fxqn0;
                            v3 = v1;
                            v17 = v5;
                            v18 = v10;
                            v19 = 2;
                        }
                        account1 = account2;
                    }
                    else {
                        if(v10 == 0) {
                            try {
                                arrayList0 = fxqp0.c;
                                arrayList0.add(fxvb.d(System.currentTimeMillis(), false));
                                gzuh0 = fxsh0.f.i();
                                if(gzuh0 == null) {
                                    fxqn1 = fxqn0;
                                    v3 = v1;
                                    gzuh1 = null;
                                }
                                else {
                                    hftp0 = ((ProtoLiteMessage)gzuh.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        goto label_161;
                                    }
                                    goto label_168;
                                }
                                goto label_239;
                            }
                            catch(RuntimeException runtimeException0) {
                                fxqn1 = fxqn0;
                                v3 = v1;
                                account1 = account2;
                                goto label_433;
                            }
                            try {
                            label_161:
                                hftp0.ensureMutable();
                            }
                            catch(RuntimeException runtimeException0) {
                                account1 = account2;
                                fxqn1 = fxqn0;
                                v3 = v1;
                                goto label_433;
                            }
                            try {
                            label_168:
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                gzuh gzuh2 = (gzuh)hftv0;
                                fxqn1 = fxqn0;
                                gzuh2.b |= 0x200;
                                gzuh2.l = false;
                                v3 = v1;
                                goto label_180;
                            }
                            catch(RuntimeException runtimeException0) {
                                try {
                                    fxqn1 = fxqn0;
                                    v3 = v1;
                                    account1 = account2;
                                    goto label_433;
                                label_180:
                                    long v20 = gzuh0.d;
                                    if(!hftv0.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp0.b_message;
                                    ((gzuh)hftv1).b |= 2;
                                    ((gzuh)hftv1).d = v20;
                                    long v21 = gzuh0.c;
                                    if(!hftv1.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv2 = hftp0.b_message;
                                    ((gzuh)hftv2).b |= 1;
                                    ((gzuh)hftv2).c = v21;
                                    long v22 = gzuh0.g;
                                    if(!hftv2.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    gzuh gzuh3 = (gzuh)hftp0.b_message;
                                    gzuh3.b |= 16;
                                    gzuh3.g = v22;
                                    if((gzuh0.b & 0x80) != 0) {
                                        gzsv gzsv0 = gzuh0.j == null ? gzsv.a : gzuh0.j;
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        gzuh gzuh4 = (gzuh)hftp0.b_message;
                                        gzsv0.getClass();
                                        gzuh4.j = gzsv0;
                                        gzuh4.b |= 0x80;
                                    }
                                    if((gzuh0.b & 0x20) != 0) {
                                        int v23 = gzue.a(gzuh0.h) == 0 ? 1 : gzue.a(gzuh0.h);
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gzuh)hftp0.b_message).h = v23 - 1;
                                        ((gzuh)hftp0.b_message).b |= 0x20;
                                    }
                                    if((gzuh0.b & 0x40) != 0) {
                                        int v24 = gzug.a(gzuh0.i) == 0 ? 1 : gzug.a(gzuh0.i);
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gzuh)hftp0.b_message).i = v24 - 1;
                                        ((gzuh)hftp0.b_message).b |= 0x40;
                                    }
                                    if((gzuh0.b & 0x100) != 0) {
                                        String s1 = gzuh0.k;
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        gzuh gzuh5 = (gzuh)hftp0.b_message;
                                        s1.getClass();
                                        gzuh5.b |= 0x100;
                                        gzuh5.k = s1;
                                    }
                                    if((gzuh0.b & 4) != 0) {
                                        int v25 = gzue.a(gzuh0.e) == 0 ? 1 : gzue.a(gzuh0.e);
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gzuh)hftp0.b_message).e = v25 - 1;
                                        ((gzuh)hftp0.b_message).b |= 4;
                                    }
                                    if((gzuh0.b & 8) != 0) {
                                        int v26 = gzug.a(gzuh0.f) == 0 ? 1 : gzug.a(gzuh0.f);
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((gzuh)hftp0.b_message).f = v26 - 1;
                                        ((gzuh)hftp0.b_message).b |= 8;
                                    }
                                    gzuh1 = (gzuh)hftp0.N_build();
                                label_239:
                                    if(gzuh1 != null) {
                                        arrayList0.add(fxvb.c(gzuh1));
                                    }
                                    int v27 = 0;
                                    v10 = 0;
                                    goto label_247;
                                label_244:
                                    fxqn1 = fxqn0;
                                    v3 = v1;
                                    v27 = v10;
                                label_247:
                                    fxqw.c("GCoreUlr", String.format(Locale.US, "LocationReporter sending %s for account %s request #%d; requests: %s", fxqp0, cnug.a(account2), v27, fxsh0.d.e()));
                                    v28 = accountConfig0.i;
                                    goto label_249;
                                }
                                catch(RuntimeException runtimeException0) {
                                    account1 = account2;
                                    goto label_433;
                                }
                            }
                        }
                        else {
                            goto label_244;
                        }
                        goto label_247;
                        try {
                        label_249:
                            fxso0 = fxsh0.c;
                            fxtr0 = fxso0.a;
                            try {
                                v29 = fxtr0.a(account2);
                                s2 = fxso0.c(account2);
                                if(hzek.q()) {
                                    goto label_254;
                                }
                                else {
                                    goto label_271;
                                }
                                goto label_272;
                            }
                            catch(IOException iOException0) {
                                account1 = account2;
                                v17 = v5;
                                goto label_339;
                            }
                            catch(acse | iapl exception0) {
                                account1 = account2;
                                v17 = v5;
                                goto label_343;
                            }
                        }
                        catch(RuntimeException runtimeException0) {
                            account1 = account2;
                            goto label_433;
                        }
                    label_254:
                        try {
                            ayvc0 = fxra.b();
                            goto label_272;
                        }
                        catch(IOException iOException0) {
                            account1 = account2;
                            v17 = v5;
                            goto label_339;
                        }
                        catch(acse | iapl exception0) {
                            account1 = account2;
                            v17 = v5;
                            goto label_343;
                        }
                        catch(RuntimeException runtimeException0) {
                            account1 = account2;
                            goto label_433;
                        }
                    label_271:
                        ayvc0 = null;
                        try {
                        label_272:
                            fxsf0 = fxso0.b.b(account2, v29, s2, fxqp0, v28);
                            account1 = account2;
                            fxso1 = fxso0;
                        }
                        catch(acse acse0) {
                            v17 = v5;
                            account1 = account2;
                            fxso1 = fxso0;
                            goto label_322;
                        }
                        catch(Exception exception1) {
                            v17 = v5;
                            account1 = account2;
                            s = "UlrProfUploadException";
                            throw exception1;
                        }
                        catch(Throwable throwable2) {
                            v17 = v5;
                            account1 = account2;
                            goto label_329;
                        }
                        if(fxsf0 != null) {
                            try {
                                if(fxsf0.h == 2 && fxsf0.g == 0 && (fxsf0.j == 1 || fxsf0.j == 2) && (fxsf0.a != null && ((long)fxsf0.a) <= v28)) {
                                    v30 = 1;
                                }
                                else {
                                label_293:
                                    v30 = 0;
                                }
                                boolean z1 = v30 != 0 || fxso.g(fxsf0);
                                if(fxsf0 != null && !z1) {
                                    v17 = v5;
                                }
                                else {
                                    fxso1.f(account1, s2);
                                    v17 = v5;
                                    goto label_310;
                                }
                                goto label_314;
                            }
                            catch(acse acse0) {
                                v17 = v5;
                                goto label_322;
                            }
                            catch(Exception exception1) {
                                v17 = v5;
                                s = "UlrProfUploadException";
                                throw exception1;
                            }
                            catch(Throwable throwable2) {
                                v17 = v5;
                                goto label_329;
                            }
                        }
                        goto label_293;
                        try {
                        label_310:
                            String s3 = fxtu.j(account1);
                            SharedPreferences.Editor sharedPreferences$Editor0 = fxtr0.d.a.edit();
                            sharedPreferences$Editor0.putLong(s3, System.currentTimeMillis());
                            sharedPreferences$Editor0.apply();
                        label_314:
                            if(z1) {
                                fxso1.e(fxsf0);
                            }
                            fxso1.d(account1, true);
                            if(1 == v30) {
                                fxsf0 = null;
                            }
                            if(ayvc0 != null) {
                                goto label_334;
                            }
                            goto label_346;
                        }
                        catch(acse acse0) {
                        }
                        catch(Exception exception1) {
                            s = "UlrProfUploadException";
                            throw exception1;
                        }
                        catch(Throwable throwable2) {
                            goto label_329;
                        }
                        try {
                        label_322:
                            fxso1.d(account1, false);
                            s = "UlrProfUploadException";
                            throw acse0;
                        }
                        catch(Throwable throwable2) {
                        }
                        try {
                        label_329:
                            if(ayvc0 != null && s != null) {
                                ayve ayve0 = fxra.c(s);
                                long v31 = ayvc0.a();
                                ayve0.a(ayve0.g.a(v31), 1L, ayvf.b);
                            }
                            throw throwable2;
                        label_334:
                            ayve ayve1 = fxra.c((fxsf0 == null ? "UlrProfUploadSuccess" : "UlrProfUploadSettings"));
                            long v32 = ayvc0.a();
                            ayve1.a(ayve1.g.a(v32), 1L, ayvf.b);
                            goto label_346;
                        }
                        catch(IOException iOException0) {
                        }
                        catch(acse | iapl exception0) {
                            goto label_343;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_433;
                        }
                        try {
                        label_339:
                            fxsh.a(account1, iOException0);
                            v19 = 7;
                            goto label_374;
                        label_343:
                            fxsh.a(account1, exception0);
                            v19 = 8;
                            goto label_374;
                        label_346:
                            if(fxsf0 == null) {
                                fxqw.c("GCoreUlr", "Batch Location Update succeeded for account " + cnug.a(account1));
                                fxqn2 = fxsh0.e;
                                object2 = fxqn2.c;
                                __monitor_enter(object2);
                                goto label_355;
                            }
                            else {
                                fxqw.c("GCoreUlr", "Server reports setting change occurred after " + v28 + ", requesting sync: " + fxsf0.toString());
                                ReportingSyncChimeraService.b(account1, fxsh0.a);
                                v19 = 6;
                            }
                            goto label_374;
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_433;
                        }
                        try {
                        label_355:
                            if(fxqn2.d != null) {
                                fxqm fxqm0 = new fxqm();
                                try {
                                    for(Object object3: fxqp0.f) {
                                        fxqm0.a.delete(((byte[])object3));
                                        ++fxqm0.b;
                                    }
                                    fxqn2.d(fxqm0, "Delete");
                                }
                                finally {
                                    fxqm0.a();
                                }
                            }
                        }
                        catch(Throwable throwable3) {
                            goto label_372;
                        }
                        try {
                            __monitor_exit(object2);
                        }
                        catch(RuntimeException runtimeException0) {
                            goto label_433;
                        }
                        try {
                            v19 = 1;
                            goto label_374;
                        }
                        catch(Throwable throwable3) {
                            try {
                            label_372:
                                __monitor_exit(object2);
                                throw throwable3;
                            label_374:
                                ArrayList arrayList1 = fxqp0.c;
                                if(hzeq.g()) {
                                    for(Object object4: arrayList1) {
                                        hfuo hfuo0 = ((gzty)object4).n;
                                        if(!hfuo0.isEmpty()) {
                                            fxra.h("OdlhOsTotalSegmentsUploadedToServer", ((long)hfuo0.size()));
                                            fxra.k("OdlhOsTotalSegmentsUploadedToServerHistogram", hfuo0.size());
                                            int v34 = 0;
                                            int v35 = 0;
                                            int v36 = 0;
                                            for(Object object5: hfuo0) {
                                                int v37 = gzus.a(((gzuv)object5).j);
                                                if(v37 == 0) {
                                                    v37 = 1;
                                                }
                                                switch(v37 - 1) {
                                                    case 1: {
                                                        ++v34;
                                                        goto label_398;
                                                    }
                                                    case 2: {
                                                        goto label_397;
                                                    }
                                                }
                                                ++v36;
                                                goto label_398;
                                            label_397:
                                                ++v35;
                                            label_398:
                                                fxra.h("OdlhOsTotalVisitsUploadedToServer", ((long)v34));
                                                fxra.h("OdlhOsTotalActivitiesUploadedToServer", ((long)v35));
                                                fxra.h("OdlhOsTotalUnknownUploadedToServer", ((long)v36));
                                                fxra.k("OdlhOsTotalVisitsUploadedToServerHistogram", v34);
                                                fxra.k("OdlhOsTotalActivitiesUploadedToServerHistogram", v35);
                                                fxra.k("OdlhOsTotalUnknownUploadedToServerHistogram", v36);
                                            }
                                        }
                                    }
                                }
                                v18 = v10;
                            label_407:
                                switch(v19) {
                                    case 2: {
                                        v38 = 2;
                                        v8 = v12;
                                        goto label_416;
                                    }
                                    case 4: {
                                        goto label_414;
                                    }
                                }
                                v38 = v19;
                                v8 = 1;
                                goto label_416;
                            label_414:
                                v38 = 4;
                                v8 = v12;
                            label_416:
                                switch(v38) {
                                    case 1: {
                                        z = true;
                                        goto label_423;
                                    }
                                    case 7: {
                                        goto label_421;
                                    }
                                }
                                z = false;
                                goto label_423;
                            label_421:
                                z = true;
                                v38 = 7;
                            label_423:
                                fxra.k("UlrUploadStatus", v38);
                                v7 = v18 + 1;
                                account0 = account1;
                                reportingConfig0 = reportingConfig1;
                                v6 = v11;
                                fxqn0 = fxqn1;
                                v1 = v3;
                                v5 = v17;
                                continue;
                            }
                            catch(RuntimeException runtimeException0) {
                            }
                            goto label_433;
                        }
                    }
                    goto label_407;
                label_433:
                    fxra.k("UlrUploadStatus", 9);
                    fxqw.g(("Batch Location Update failed for account " + cnug.a(account1)), runtimeException0);
                    v2 = 1;
                    goto label_442;
                }
                reportingConfig1 = reportingConfig0;
                fxqn1 = fxqn0;
                v3 = v1;
                v4 = v8;
            label_441:
                v2 |= v4;
            label_442:
                context0 = context1;
                reportingConfig0 = reportingConfig1;
                fxqn0 = fxqn1;
                v1 = v3;
            }
            if(v2 != 0) {
                fxtt fxtt0 = fxsh0.d;
                synchronized(fxtt.a) {
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object7: fxtt0.e()) {
                        fxuf fxuf0 = (fxuf)object7;
                        if(fxuf0.b <= v1) {
                            arrayList2.add(fxuf0);
                        }
                    }
                    if(fxtt0.l(arrayList2)) {
                        fxtk.e(fxtt0.b, "LocationReportingPreferences.removeExpiredRequests");
                    }
                }
            }
            if(fxra.p()) {
                fxra.a.d();
            }
            fxra.n(reportingConfig0.e());
        }
        else {
            fxqw.c("GCoreUlr", "Batch Location Update aborted because not connected");
            fxra.r(3, v);
        }
        fxra.g("UlrUploadTaskDone");
    }
}

