import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.recovery.RecoveryController;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;
import com.google.android.gms.chimera.modules.auth.folsom.AppContextProvider;
import j..util.DesugarCollections;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.UUID;

public final class ajvt {
    public static final baun a;
    public static final String[] b;
    private static final bboh c;

    static {
        ajvt.a = akea.a("RecoverableKeyStoreGmsInitOperation");
        ajvt.c = akea.b("RecoverableKeyStoreGmsInitOperation");
        ajvt.b = new String[]{"com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService", "com.google.android.gms.auth.folsom.service.GcmReceiverService"};
    }

    public static void a(Context context0, String s) {
        try {
            Account[] arr_account = cchj.b(context0).p("com.google");
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_account.length; ++v) {
                arrayList0.add(arr_account[v].name);
            }
            akba akba0 = (akba)akba.b.b();
            frli frli0 = akba0.d;
            ajwt ajwt0 = (ajwt)akba.g(frli0.a());
            HashSet hashSet0 = new HashSet();
            for(Object object0: arrayList0) {
                hashSet0.add(akba0.c.a(((String)object0)));
            }
            HashSet hashSet1 = new HashSet(DesugarCollections.unmodifiableMap(ajwt0.c).keySet());
            hashSet1.removeAll(hashSet0);
            if(hashSet1.isEmpty()) {
                return;
            }
            akdz.g(3, null, s);
            akba.g(frli0.b(new akag(hashSet1), gmap.a));
        }
        catch(IOException | acse exception0) {
            a.ae(ajvt.c.h(), "Error during retainKeysForCurrentAccounts.", exception0);
        }
    }

    public static void b(boolean z) {
        Context context0 = AppContextProvider.a();
        try {
            long v = (long)ajwp.b(context0);
            byte[] arr_b = ajwp.c(new SecureRandom().nextLong(), v);
            akba akba0 = (akba)akba.b.b();
            long v1 = akba0.c();
            if(Long.compare(v1, System.currentTimeMillis() - 20000L) > 0) {
                ajvt.a.d("Vault handle was updated recently", new Object[0]);
                return;
            }
            akba0.w(arr_b);
            ajvt.a.h("Setting vault handle", new Object[0]);
            RecoveryController recoveryController0 = RecoveryController.getInstance(context0);
            akea.b("RecoveryControllerProxy");
            akem.f(recoveryController0, arr_b);
            if(v1 == 0L || z) {
                int v2 = ((akbf)akbf.a.b()).a();
                try {
                    akav akav0 = new akav(v2);
                    akba.g(akba0.d.b(akav0, gmap.a));
                }
                catch(IOException iOException1) {
                    a.ae(akba.a.j(), "Error during blocked snapshot version update", iOException1);
                }
            }
        }
        catch(IOException iOException0) {
            a.ae(ajvt.c.j(), "Error setting device ID.", iOException0);
        }
    }

    public static boolean c(boolean z) {
        Account[] arr_account = cchj.b(AppContextProvider.a()).p("com.google");
        boolean z1 = false;
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            boolean z2 = ajvt.f(account0, "chromesync", z) || z1;
            z1 = ajvt.f(account0, "general", z) || z2;
            if(hpvl.a.d().f()) {
                z1 = ajvt.f(account0, "on_device_location_history", z) || z1;
            }
        }
        if(z1) {
            Context context0 = AppContextProvider.a();
            long v1 = hpvv.a.g().l();
            long v2 = hpvv.a.g().k();
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService";
            clkn0.t("com.google.android.gms.auth.folsom.RETRY_PRE_ENROLLMENT_FOR_ALL_ACCOUNTS");
            clkn0.p = true;
            clkn0.e(v1, v2);
            clkn0.t = FolsomGcmTaskChimeraService.d();
            clkn0.g(0);
            clkn0.v(2);
            clkn0.u = new Bundle();
            clko clko0 = clkn0.a();
            cljp.a(context0).f(clko0);
            return true;
        }
        return false;
    }

    public static boolean d(Context context0, String s) {
        return bbmq.a(context0, s) == 1;
    }

    public static void e(Context context0, int v) {
        int v12;
        ProtoLiteBuilder hftp3;
        ajck ajck3;
        gfsx gfsx3;
        ghtd ghtd1;
        int v10;
        ProtoLiteBuilder hftp2;
        ghtd ghtd0;
        akba akba4;
        ajck ajck2;
        gfsx gfsx1;
        grff grff0;
        Iterator iterator2;
        akba akba3;
        ArrayList arrayList0;
        gred gred3;
        ajsq ajsq0;
        String s6;
        Object object1;
        boolean z2;
        Account[] arr_account2;
        ajck ajck1;
        Account account0;
        int v7;
        String s3;
        PendingIntent pendingIntent0;
        SecureRandom secureRandom0;
        byte[] arr_b1;
        String s2;
        Long long0;
        byte[] arr_b;
        akba akba0;
        fced fced0 = fcfo.a(context0);
        baun baun0 = ajvt.a;
        baun0.h("Initializing auth_folsom", new Object[0]);
        String s = UUID.randomUUID().toString();
        fced0.f("/auth_folsom/key_retrieval_capability");
        baun0.d("Initializing auth_folsom - skip API level check.", new Object[0]);
        if(Long.parseLong(bapf.c(context0), 16) != 0L) {
            int v1 = azqk.a(context0);
            String[] arr_s = ajvt.b;
            for(int v2 = 0; v2 < 2; ++v2) {
                String s1 = arr_s[v2];
                if(TextUtils.equals(s1, "com.google.android.gms.auth.folsom.service.GcmReceiverService") && v1 < 12656023) {
                    ajvt.a.h(String.valueOf(s1).concat(" is not supported. Ignore."), new Object[0]);
                }
                else {
                    try {
                        if(ajvt.d(context0, s1)) {
                            baun0.h(s1 + " is already enabled. Ignore.", new Object[0]);
                        }
                        else {
                            baun0.h(a.a(s1, "Enabling ", "."), new Object[0]);
                            bbmq.G(context0, s1, true);
                        }
                    }
                    catch(IllegalArgumentException unused_ex) {
                        ajvt.a.d(a.a(s1, "Component ", " is not included in the container"), new Object[0]);
                    }
                }
            }
            boolean z = akdv.b;
            if(z) {
                ajvt.a.j("Initializing RecoveryController", new Object[0]);
                RecoveryController recoveryController0 = RecoveryController.getInstance(context0);
                akea.b("RecoveryControllerProxy");
                akem.e(recoveryController0, new int[]{100});
                try {
                    akba0 = (akba)akba.b.b();
                    arr_b = ((ajwt)akba.g(akba0.d.a())).d.toByteArray();
                    long v3 = akba0.c();
                    long v4 = System.currentTimeMillis();
                    if(v3 == 0L) {
                        goto label_61;
                    }
                    else if(v3 < v4 - hput.a.c().q()) {
                        ajvt.b(false);
                        s2 = s;
                    }
                    else {
                        long0 = ajwp.b(context0);
                        goto label_39;
                    }
                    goto label_67;
                }
                catch(IOException iOException0) {
                    goto label_65;
                }
            label_39:
                long v5 = (long)long0;
                if(arr_b != null && arr_b.length == 17) {
                    try {
                        long v6 = ajwp.a(arr_b);
                        if(v6 == v5) {
                            s2 = s;
                            arr_b1 = arr_b;
                            goto label_53;
                        }
                        goto label_46;
                    }
                    catch(akbi unused_ex) {
                        goto label_46;
                    }
                    catch(IOException iOException0) {
                        s2 = s;
                        goto label_66;
                    }
                }
                else {
                    try {
                    label_46:
                        secureRandom0 = new SecureRandom();
                    }
                    catch(IOException iOException0) {
                        s2 = s;
                        goto label_66;
                    }
                    s2 = s;
                    try {
                        arr_b1 = ajwp.c(secureRandom0.nextLong(), v5);
                    label_53:
                        if(!Arrays.equals(arr_b1, arr_b)) {
                            akba0.w(arr_b1);
                        }
                        ajvt.a.h("Setting vault handle", new Object[0]);
                        akea.b("RecoveryControllerProxy");
                        akem.f(recoveryController0, arr_b1);
                        goto label_67;
                    }
                    catch(IOException iOException0) {
                    }
                    goto label_66;
                }
                goto label_53;
                try {
                label_61:
                    ajvt.b(false);
                    s2 = s;
                    goto label_67;
                }
                catch(IOException iOException0) {
                label_65:
                    s2 = s;
                }
            label_66:
                a.ae(ajvt.c.j(), "Error setting device ID.", iOException0);
            label_67:
                Intent intent0 = IntentOperation.getStartIntent(context0, KeySyncIntentOperation.class, "android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT");
                if(intent0 == null) {
                    ((ggtj)ajvt.c.j()).x("Could not get start intent for KeySyncIntentOperation");
                    pendingIntent0 = null;
                }
                else {
                    pendingIntent0 = PendingIntent.getService(context0, 0, intent0, 0xC000000);
                }
                if(pendingIntent0 == null) {
                    ((ggtj)ajvt.c.j()).x("Could not create PendingIntent to start KeySyncIntentOperation.");
                    s3 = s2;
                }
                else {
                    akem.g(recoveryController0, pendingIntent0);
                    s3 = s2;
                    new ajqx(s3).b(context0, true, v);
                }
                ((akbf)akbf.a.b()).f();
            }
            else {
                s3 = s;
            }
            ajvt.a(context0, s3);
            akba akba1 = (akba)akba.b.b();
            try {
                frli frli0 = akba1.d;
                if(((ajwt)akba.g(frli0.a())).f == 0L) {
                    akba.g(frli0.b(new akas(), gmap.a));
                    akdz.g(6, null, s3);
                    Account[] arr_account = cchj.b(AppContextProvider.a()).p("com.google");
                    v7 = 0;
                    while(true) {
                    label_91:
                        if(v7 >= arr_account.length) {
                            break;
                        }
                        account0 = arr_account[v7];
                        goto label_97;
                    }
                }
            }
            catch(IOException iOException1) {
                a.ae(akba.a.j(), "Error during pds init time update", iOException1);
            }
            goto label_111;
            try {
            label_97:
                String s4 = account0.name;
                Iterator iterator0 = akba1.j(s4).entrySet().iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        ++v7;
                        goto label_91;
                    }
                    Object object0 = iterator0.next();
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    String s5 = (String)map$Entry0.getKey();
                    if(akbl.x(s5)) {
                        hfuo hfuo0 = ((ajxj)map$Entry0.getValue()).d;
                        if(hfuo0.isEmpty()) {
                            continue;
                        }
                        akdv.c();
                        akba1.u(s4, s5, hfuo0, s3);
                        continue;
                    }
                    ++v7;
                    goto label_91;
                }
            }
            catch(IOException | acse unused_ex) {
                ++v7;
                goto label_91;
            }
        label_111:
            if(v == 4) {
                if(akdv.b()) {
                    ajvt.c(false);
                }
                if(hpvi.a.b().a()) {
                    ajck ajck0 = akba.b;
                    akba akba2 = (akba)ajck0.b();
                    Account[] arr_account1 = cchj.b(context0).p("com.google");
                    int v8 = hpvi.d();
                    int v9 = 0;
                    while(v9 < arr_account1.length) {
                        Account account1 = arr_account1[v9];
                        akeh akeh0 = (akeh)akeh.a.b();
                        try {
                            boolean z1 = akba2.z(account1.name);
                        }
                        catch(IOException | acse unused_ex) {
                            ajck1 = ajck0;
                            arr_account2 = arr_account1;
                            z2 = z;
                            goto label_372;
                        }
                        if(z1) {
                            try {
                                ggqk ggqk0 = akeh0.b.E();
                                while(true) {
                                label_131:
                                    if(!ggqk0.hasNext()) {
                                        goto label_156;
                                    }
                                    object1 = ggqk0.next();
                                    break;
                                }
                            }
                            catch(IOException | acse unused_ex) {
                                ajck1 = ajck0;
                                arr_account2 = arr_account1;
                                z2 = z;
                                goto label_372;
                            }
                            try {
                                s6 = (String)object1;
                                gfsx gfsx0 = akba2.d(account1.name, s6);
                                goto label_143;
                            }
                            catch(IOException | acse unused_ex) {
                                try {
                                    ajck1 = ajck0;
                                    goto label_158;
                                label_143:
                                    ajck1 = ajck0;
                                    boolean z3 = akeh0.f(account1.name, s6);
                                    if(gfsx0.i() && ((Boolean)gfsx0.d()).booleanValue() && z3) {
                                        if(v8 != 0) {
                                            akba2.l(account1.name, s6);
                                        }
                                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghtd.a).v_newBuilder();
                                        if(!hftp0.b_message.isImmutable()) {
                                            hftp0.ensureMutable();
                                        }
                                        ((ghtd)hftp0.b_message).c = 8;
                                        ((ghtd)hftp0.b_message).b |= 1;
                                        akdz.d(((ghtd)hftp0.N_build()), s6, s3);
                                    }
                                    ajck0 = ajck1;
                                    goto label_131;
                                label_156:
                                    ajck1 = ajck0;
                                    akdz.m(10, s3);
                                }
                                catch(IOException | acse unused_ex) {
                                }
                            }
                        label_158:
                            arr_account2 = arr_account1;
                            z2 = z;
                        }
                        else {
                            ajck1 = ajck0;
                            gfqx gfqx0 = gfqx.a;
                            try {
                                akbm akbm0 = new akbm();
                                akbm0.a = account1;
                                akbm0.b = akbn.q;
                                akbm0.d = s3;
                                ajsq0 = new ajsq(akbm0.a());
                                grec grec0 = (grec)((ProtoLiteMessage)gred.a).v_newBuilder();
                                grec0.a("users/me/securitydomains/chromesync");
                                grec0.a("users/me/securitydomains/hw_protected");
                                if(!grec0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)grec0).ensureMutable();
                                }
                                gred gred0 = (gred)grec0.b_message;
                                hfuf hfuf0 = gred0.d;
                                if(!hfuf0.c()) {
                                    gred0.d = ProtoLiteMessage.C(hfuf0);
                                }
                                gred0.d.i(2);
                                if(!grec0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)grec0).ensureMutable();
                                }
                                ((gred)grec0.b_message).f = 3;
                                if(!grec0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)grec0).ensureMutable();
                                }
                                gred.b(((gred)grec0.b_message));
                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)greo.a).v_newBuilder();
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                greo.b(((greo)hftp1.b_message));
                                greo greo0 = (greo)hftp1.N_build();
                                if(!grec0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)grec0).ensureMutable();
                                }
                                gred gred1 = (gred)grec0.b_message;
                                greo0.getClass();
                                gred1.c = greo0;
                                gred1.b |= 1;
                                if(!grec0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)grec0).ensureMutable();
                                }
                                gred gred2 = (gred)grec0.b_message;
                                s3.getClass();
                                gred2.h = s3;
                                gred3 = (gred)((ProtoLiteBuilder)grec0).N_build();
                                arrayList0 = new ArrayList();
                                try {
                                    akba3 = (akba)ajck1.b();
                                }
                                catch(IOException | acse unused_ex) {
                                    arr_account2 = arr_account1;
                                    goto label_215;
                                }
                            }
                            catch(ajqz ajqz0) {
                                arr_account2 = arr_account1;
                                z2 = z;
                                a.ae(ajvt.c.j(), "Error during listSecurityDomainMembers call; Skipping lskf consent backfill.", ajqz0);
                                akdz.m(5, s3);
                                goto label_372;
                            }
                            arr_account2 = arr_account1;
                            try {
                                try {
                                    Iterator iterator1 = akba3.h(account1.name).iterator();
                                    while(true) {
                                        if(!iterator1.hasNext()) {
                                            goto label_215;
                                        }
                                        Object object2 = iterator1.next();
                                        arrayList0.add(((ajxc)object2).c);
                                    }
                                }
                                catch(IOException | acse unused_ex) {
                                label_215:
                                    iterator2 = ajsq0.c(gred3).b.iterator();
                                    while(true) {
                                    label_216:
                                        boolean z4 = iterator2.hasNext();
                                        goto label_221;
                                    }
                                }
                            }
                            catch(ajqz ajqz0) {
                            }
                            z2 = z;
                            a.ae(ajvt.c.j(), "Error during listSecurityDomainMembers call; Skipping lskf consent backfill.", ajqz0);
                            akdz.m(5, s3);
                            goto label_372;
                            try {
                            label_221:
                                if(z4) {
                                    Object object3 = iterator2.next();
                                    grff grff1 = (grff)object3;
                                    if(grfa.b(grff1.f) != 4 || !arrayList0.contains(grff1.d)) {
                                        goto label_216;
                                    }
                                    grff0 = grff1;
                                }
                                else {
                                    grff0 = grff.a;
                                }
                                if(!((ProtoLiteMessage)grff0).equals(grff.a)) {
                                    grey grey0 = grff0.g;
                                    if(grey0 == null) {
                                        grey0 = grey.a;
                                    }
                                    if(grey0.b == 4) {
                                        grey grey1 = grff0.g;
                                        if(grey1 == null) {
                                            grey1 = grey.a;
                                        }
                                        grex grex0 = grey1.b == 4 ? ((grex)grey1.c) : grex.a;
                                        gfsx1 = gfsx.m(Boolean.valueOf(grex0.b));
                                        goto label_248;
                                    }
                                }
                            }
                            catch(ajqz ajqz0) {
                                z2 = z;
                                a.ae(ajvt.c.j(), "Error during listSecurityDomainMembers call; Skipping lskf consent backfill.", ajqz0);
                                akdz.m(5, s3);
                                goto label_372;
                            }
                            gfsx1 = gfqx0;
                        label_248:
                            if(!gfsx1.i() && !hpvi.a.b().e()) {
                                akdz.m(7, s3);
                                z2 = z;
                            }
                            else {
                                try {
                                    boolean z5 = hpvi.d();
                                    ajck2 = akba.b;
                                    akba4 = (akba)ajck2.b();
                                    ghtd0 = ghtd.a;
                                    hftp2 = ((ProtoLiteMessage)ghtd0).v_newBuilder();
                                    v10 = ((Boolean)gfsx1.f(Boolean.valueOf(true))).booleanValue();
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp2.b_message;
                                    ((ghtd)hftv0).c = 5;
                                    ((ghtd)hftv0).b |= 1;
                                    if(!hftv0.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    ghtd1 = (ghtd)hftp2.b_message;
                                }
                                catch(IOException | acse exception0) {
                                    z2 = z;
                                    a.ae(ajvt.c.j(), "Error updating local lskf opt in state.", exception0);
                                    goto label_372;
                                }
                                z2 = z;
                                try {
                                    ghtd1.b |= 2;
                                    ghtd1.d = v10 ^ 1;
                                    boolean z6 = false;
                                    ggqk ggqk1 = akeh0.b.E();
                                    while(true) {
                                        if(!ggqk1.hasNext()) {
                                            goto label_351;
                                        }
                                        Object object4 = ggqk1.next();
                                        String s7 = (String)object4;
                                        gfsx gfsx2 = ((akba)ajck2.b()).d(account1.name, s7);
                                        if(gfsx2.i()) {
                                            boolean z7 = ((Boolean)gfsx2.d()).booleanValue();
                                            gfsx3 = gfsx2;
                                            if(!hftp2.b_message.isImmutable()) {
                                                hftp2.ensureMutable();
                                            }
                                            ghtd ghtd2 = (ghtd)hftp2.b_message;
                                            ajck3 = ajck2;
                                            ghtd2.b |= 4;
                                            ghtd2.e = z7;
                                        }
                                        else {
                                            gfsx3 = gfsx2;
                                            ajck3 = ajck2;
                                        }
                                        if(v10 == 0) {
                                            hftp3 = hftp2;
                                            if(gfsx3.i()) {
                                                if(((Boolean)gfsx3.d()).booleanValue()) {
                                                    boolean z8 = ((Boolean)gfsx3.d()).booleanValue();
                                                    if(!hftp3.b_message.isImmutable()) {
                                                        hftp3.ensureMutable();
                                                    }
                                                    ghtd ghtd5 = (ghtd)hftp3.b_message;
                                                    ghtd5.b |= 0x20;
                                                    ghtd5.h = z8;
                                                }
                                                else {
                                                    boolean z9 = akeh0.f(account1.name, s7);
                                                    if(!z9) {
                                                        if(z5) {
                                                            akba4.o(account1.name, s7, true);
                                                        }
                                                        if(!hftp3.b_message.isImmutable()) {
                                                            hftp3.ensureMutable();
                                                        }
                                                        ghtd ghtd6 = (ghtd)hftp3.b_message;
                                                        ghtd6.b |= 0x20;
                                                        ghtd6.h = true;
                                                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)ghtd0).v_newBuilder();
                                                        boolean z10 = hftp4.b_message.isImmutable();
                                                        if(!z10) {
                                                            hftp4.ensureMutable();
                                                        }
                                                        ghtd ghtd7 = (ghtd)hftp4.b_message;
                                                        ghtd7.c = 10;
                                                        int v11 = ghtd7.b;
                                                        ghtd7.b = v11 | 1;
                                                        akdz.d(((ghtd)hftp4.N_build()), s7, s3);
                                                    }
                                                    else if(z5) {
                                                        akba4.l(account1.name, s7);
                                                    }
                                                }
                                            }
                                            else if(!akeh0.f(account1.name, s7)) {
                                                if(!hftp3.b_message.isImmutable()) {
                                                    hftp3.ensureMutable();
                                                }
                                                ghtd ghtd4 = (ghtd)hftp3.b_message;
                                                ghtd4.b |= 0x20;
                                                ghtd4.h = true;
                                                if(z5) {
                                                    akba4.o(account1.name, s7, true);
                                                }
                                            }
                                            z6 = z6;
                                        }
                                        else {
                                            if(z5) {
                                                akba4.o(account1.name, s7, false);
                                            }
                                            hftp3 = hftp2;
                                            if(!hftp3.b_message.isImmutable()) {
                                                hftp3.ensureMutable();
                                            }
                                            ghtd ghtd3 = (ghtd)hftp3.b_message;
                                            ghtd3.b |= 0x20;
                                            ghtd3.h = false;
                                            z6 = true;
                                        }
                                        akdz.d(((ghtd)hftp3.N_build()), s7, s3);
                                        hftp2 = hftp3;
                                        ggqk1 = ggqk1;
                                        ajck2 = ajck3;
                                    }
                                }
                                catch(IOException | acse exception0) {
                                }
                                a.ae(ajvt.c.j(), "Error updating local lskf opt in state.", exception0);
                                goto label_372;
                            label_351:
                                if(z6) {
                                    if(v8 == 0) {
                                        goto label_361;
                                    }
                                    else {
                                        try {
                                            akbm akbm1 = new akbm();
                                            akbm1.a = account1;
                                            akbm1.b("chromesync");
                                            akbm1.b = akbn.v;
                                            akbm1.d = s3;
                                            new akbl(akbm1.a()).m();
                                            v12 = 0;
                                            goto label_362;
                                        label_361:
                                            v12 = true;
                                        label_362:
                                            akdz.m(4, s3);
                                            goto label_368;
                                        }
                                        catch(akbi akbi0) {
                                        }
                                        a.ae(ajvt.c.h(), "Error when removing LSKF member from SDS; Skip backfill.", akbi0);
                                        goto label_372;
                                    }
                                    goto label_362;
                                }
                                else {
                                    v12 = v8 ^ 1;
                                }
                                try {
                                label_368:
                                    if(v12 == 0) {
                                        akab akab0 = new akab(akba2.c.a(account1.name));
                                        akba.g(akba2.d.b(akab0, gmap.a));
                                    }
                                    akdz.m(2, s3);
                                }
                                catch(IOException | acse unused_ex) {
                                }
                            }
                        }
                    label_372:
                        ++v9;
                        ajck0 = ajck1;
                        arr_account1 = arr_account2;
                        z = z2;
                    }
                }
            }
            if(ajvt.d(context0, "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService")) {
                FolsomGcmTaskChimeraService.f(context0);
                if(z) {
                    if(hput.a.c().G()) {
                        FolsomGcmTaskChimeraService.e(context0);
                        return;
                    }
                    cljp.a(context0).d("com.google.android.gms.auth.folsom.PERIODIC_CERT_UPDATE", "com.google.android.gms.auth.folsom.service.FolsomPublicKeyUpdateService");
                }
            }
        }
    }

    private static boolean f(Account account0, String s, boolean z) {
        akbm akbm0 = new akbm();
        akbm0.a = account0;
        akbm0.b(s);
        akbm0.b = akbn.o;
        akbl akbl0 = new akbl(akbm0.a());
        synchronized(akbl.class) {
            try {
                akbl.a.d("Adding pre-enrollment key to security domain.", new Object[0]);
                akbo akbo0 = akbl0.d;
                if(akbl0.w(((String)akbo0.b.d()), z)) {
                    akbl.I(akbo0, 3);
                }
                return false;
            }
            catch(akbi akbi0) {
                akbl.I(akbl0.d, akbi0.a);
                if(akbi0.a == 14) {
                    return false;
                }
                akbl.a.d("Pre enrollment failed with temporary error and will be retried", new Object[0]);
                return true;
            }
        }
    }
}

