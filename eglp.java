import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class eglp {
    static final GetBackupSyncSuggestionResponse a(GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest0, Context context0, egyq egyq0, egys egys0, ehjc ehjc0, egyo egyo0) {
        int v7;
        int v6;
        Context context1;
        int v2;
        BackupAndSyncOptInState backupAndSyncOptInState0;
        egyo egyo1;
        int v = getBackupSyncSuggestionRequest0.a;
        int v1 = getBackupSyncSuggestionRequest0.b;
        String s = String.format("%s%016x", egzf.f(egze.a, v, v1), eglt.a.b.nextLong());
        hwxo hwxo0 = hwxo.a;
        if(hwxo0.b().c() && v == 4) {
            egyo1 = egyo0;
            backupAndSyncOptInState0 = egyo1.c(false);
            v2 = 4;
        }
        else {
            egyo1 = egyo0;
            v2 = v;
            backupAndSyncOptInState0 = egyo1.b();
        }
        boolean z = hwzg.f();
        boolean z1 = hwzg.a.c().k();
        if(z && backupAndSyncOptInState0.c == 5) {
            return eglp.c(s, v1, context0, egyq0, egys0, ehjc0, egyo1);
        }
        int v3 = backupAndSyncOptInState0.c;
        if(v3 == 3) {
            return !z || !z1 || eglp.e(egys0) <= 0 ? eglp.c(s, v1, context0, egyq0, egys0, ehjc0, egyo0) : eglp.b(5, s, v1, egyq0, egys0);
        }
        if(v3 != 0 && v3 != 1) {
            if(hwxo0.b().e()) {
                try {
                    if(ehjc0.d().length > 0) {
                        return eglp.b(3, s, v1, egyq0, egys0);
                    }
                }
                catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
                    throw new eglv("Unable to fetch account unicorn attributes.", exception0);
                }
            }
            egma egma0 = new egma(v2, v1);
            eglu eglu0 = new eglu(backupAndSyncOptInState0.d);
            egqh egqh0 = hwxo0.b().b();
            gfsx gfsx0 = gfqx.a;
            for(Object object0: egqh0.b) {
                egqi egqi0 = (egqi)object0;
                if(((egpt.b(egqi0.b) == null ? egpt.a : egpt.b(egqi0.b)) == egpt.b || (egpt.b(egqi0.b) == null ? egpt.a : egpt.b(egqi0.b)).j == egma0.a) && ((egpv.b(egqi0.c) == null ? egpv.a : egpv.b(egqi0.c)) == egpv.b || (egpv.b(egqi0.c) == null ? egpv.a : egpv.b(egqi0.c)).i == egma0.b)) {
                    if(!gfsx0.i()) {
                    }
                    else if(egqi0.e <= ((egqi)gfsx0.d()).e) {
                        continue;
                    }
                    gfsx0 = gfsx.m(egqi0);
                }
            }
            if(gfsx0.i()) {
                egql egql0 = ((egqi)gfsx0.d()).d;
                if(egql0 == null) {
                    egql0 = egql.a;
                }
                int v4 = egql0.d;
                int v5 = egqk.a(v4);
                if(v5 == 0) {
                    context1 = context0;
                label_64:
                    v6 = egqk.a(egql0.b);
                    if(v6 == 0) {
                        v6 = 1;
                    }
                }
                else if(v5 != 1 && (egqk.a(v4) == 0 ? 1 : egqk.a(v4)) != (egqk.a(egql0.b) == 0 ? 1 : egqk.a(egql0.b))) {
                    try {
                        context1 = context0;
                        if(egls.a((egql0.c == null ? egqb.a : egql0.c), egma0, context1, eglu0)) {
                            v6 = egqk.a(egql0.d);
                            if(v6 == 0) {
                                goto label_59;
                            }
                        }
                        else {
                            goto label_64;
                        }
                    }
                    catch(eglw | eglv exception1) {
                        if(hwxo.a.b().l()) {
                            throw exception1;
                        }
                        v6 = egqk.a(egql0.b);
                        if(v6 == 0) {
                            goto label_59;
                        }
                    }
                    goto label_70;
                label_59:
                    v6 = 1;
                }
                else {
                    context1 = context0;
                    goto label_64;
                }
            }
            else {
                context1 = context0;
                v6 = 1;
            }
        label_70:
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)egpd.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egpd egpd0 = (egpd)hftp0.b_message;
            s.getClass();
            egpd0.b |= 1;
            egpd0.c = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)egpc.a).v_newBuilder();
            switch(v6 - 1) {
                case 1: {
                    v7 = 2;
                    break;
                }
                case 2: {
                    v7 = 3;
                    break;
                }
                default: {
                    v7 = 1;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((egpc)hftp1.b_message).c = v7 - 1;
            ((egpc)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            egpd egpd1 = (egpd)hftp0.b_message;
            egpc egpc0 = (egpc)hftp1.N_build();
            egpc0.getClass();
            egpd1.f = egpc0;
            egpd1.b |= 8;
            egpd egpd2 = (egpd)hftp0.N_build();
            if(hwxo.c()) {
                egyt.a().a.put(s, egpd2);
            }
            else {
                try {
                    egzd.c(context1).b(s, egpd2);
                }
                catch(LevelDbException | UnsupportedEncodingException | hfur exception2) {
                    egig.d("BsSuggestionMaker", "Exception in store suggestion event: %s", new Object[]{exception2});
                }
            }
            switch(v6 - 1) {
                case 1: {
                    return eglp.b(4, s, v1, egyq0, egys0);
                }
                case 2: {
                    return eglp.b(3, s, v1, egyq0, egys0);
                }
                default: {
                    return eglp.b(0, s, v1, egyq0, egys0);
                }
            }
        }
        return eglp.b(1, s, v1, egyq0, egys0);
    }

    public static final GetBackupSyncSuggestionResponse b(int v, String s, int v1, egyq egyq0, egys egys0) {
        int v7;
        int v6;
        if(!hwzg.e() && !hwzg.d()) {
            int v2 = eglp.d(egyq0);
            int v3 = eglp.e(egys0);
            return new GetBackupSyncSuggestionResponse(v, s, new BackupSyncContactInfo(v2, v3, v3, v3));
        }
        int v4 = eglp.e(egys0);
        int v5 = eglp.d(egyq0);
        if(hwzg.e()) {
            v6 = egys0.a();
        }
        else if(!hwzg.a.c().g()) {
            v6 = v4;
        }
        else if(v1 == 104) {
            v6 = v4;
            v1 = 104;
        }
        else {
            v6 = egys0.a();
        }
        if(!hwzg.d() && (!hwzg.a.c().e() || v1 == 104)) {
            return new GetBackupSyncSuggestionResponse(v, s, new BackupSyncContactInfo(v5, v4, v6, v4));
        }
        try {
            Set set0 = egys0.c();
            v7 = 0;
            if(set0.isEmpty()) {
                return new GetBackupSyncSuggestionResponse(v, s, new BackupSyncContactInfo(v5, v4, v6, v7));
            }
            ehbp ehbp0 = new ehbp(egys0.a.getContentResolver(), null, gfsx.m(egzl.b));
            List list0 = ehfr.c(egys.d(set0), egys0.a, ehbp0);
            Set set1 = ehay.b(list0, egys0.a, ehbp0, null);
            Iterator iterator0 = list0.iterator();
            while(true) {
            label_26:
                if(!iterator0.hasNext()) {
                    return new GetBackupSyncSuggestionResponse(v, s, new BackupSyncContactInfo(v5, v4, v6, v7));
                }
                Object object0 = iterator0.next();
                if(set1.contains(((ehge)object0).b)) {
                    break;
                }
            }
        }
        catch(RuntimeException runtimeException0) {
            egig.c("FSA2_SimContactsCounter", "Failed to get not in google sim contact count", runtimeException0);
            throw new cjuh(13, "Failed to get not in google sim contact count: " + runtimeException0.getMessage());
        }
        ++v7;
        goto label_26;
    }

    private static final GetBackupSyncSuggestionResponse c(String s, int v, Context context0, egyq egyq0, egys egys0, ehjc ehjc0, egyo egyo0) {
        return eglp.b(2, s, v, egyq0, egys0);
    }

    private static final int d(egyq egyq0) {
        try {
            return egyq0.b();
        }
        catch(cjuh cjuh0) {
            egig.d("BsSuggestionMaker", "Exception in getting device contact count: %s", new Object[]{cjuh0});
            return 0;
        }
    }

    private static final int e(egys egys0) {
        try {
            return egys0.b();
        }
        catch(cjuh cjuh0) {
            egig.d("BsSuggestionMaker", "Exception in getting sim contact count: %s", new Object[]{cjuh0});
            return 0;
        }
    }
}

