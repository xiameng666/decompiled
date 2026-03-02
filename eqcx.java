import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import com.google.android.gms.auth.api.accounttransfer.AuthenticatorAnnotatedData;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController.ChallengeIntentHelper;
import com.google.android.gms.smartdevice.d2d.TargetAccountImportController.ImportReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class eqcx {
    public static final baun a;
    public final Handler b;
    public final adts c;
    public final eqcy d;
    public final Set e;
    public boolean f;
    public final TargetAccountImportController.ChallengeIntentHelper g;
    public final eqsl h;
    public AccountTransferMsg i;
    private final Context j;
    private final eqme k;
    private final Set l;
    private BroadcastReceiver m;

    static {
        eqcx.a = new erqc(new String[]{"D2D", "TargetAccountImportController"});
    }

    public eqcx(Context context0, Handler handler0, eqme eqme0, eqcy eqcy0, boolean z) {
        this.l = new HashSet();
        this.e = new HashSet();
        batl.s(context0);
        this.j = context0;
        batl.s(handler0);
        this.b = handler0;
        batl.s(eqme0);
        this.k = eqme0;
        batl.s(eqcy0);
        this.d = eqcy0;
        eqsl eqsl0 = new eqsl(new bblp(1, 10), new bbre(handler0), hyim.a.e().b(), new eqcu(this));
        this.h = eqsl0;
        this.g = new TargetAccountImportController.ChallengeIntentHelper(context0, handler0, eqsl0, eqcy0);
        this.c = new adts(context0, eqfx.a(context0, false, z));
    }

    public final void a() {
        synchronized(this) {
            if(this.m != null) {
                this.f();
                try {
                    BroadcastReceiver broadcastReceiver0 = this.m;
                    batl.s(broadcastReceiver0);
                    this.j.unregisterReceiver(broadcastReceiver0);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    eqcx.a.l(illegalArgumentException0);
                }
                this.m = null;
            }
            this.l.clear();
        }
    }

    public final void b() {
        Account[] arr_account = erpb.a(this.j).p("com.google");
        ArrayList arrayList0 = new ArrayList(arr_account.length);
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            Bundle bundle0 = new Bundle();
            bundle0.putString("name", account0.name);
            arrayList0.add(bundle0);
        }
        this.h.b();
        this.d.b(arrayList0);
        this.d.c();
    }

    public final void c(AccountTransferMsg accountTransferMsg0) {
        batl.e(this.b);
        int v = 3;
        this.k.D(3);
        if(!this.g.e) {
            eqsl eqsl0 = this.h;
            if(eqsl0.f()) {
                eqsl0.d();
            }
            else {
                eqsl0.a();
            }
        }
        this.f = true;
        ArrayList arrayList0 = accountTransferMsg0.c;
        int v1 = eqri.a(arrayList0);
        for(int v2 = 0; v2 < v1; ++v2) {
            AuthenticatorAnnotatedData authenticatorAnnotatedData0 = (AuthenticatorAnnotatedData)arrayList0.get(v2);
            this.l.add(authenticatorAnnotatedData0.c.c);
        }
        if(this.m == null) {
            this.m = new TargetAccountImportController.ImportReceiver(this);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP");
            intentFilter0.addAction("com.google.android.gms.smartdevice.setup.IMPORT_CHALLENGE_COMPLETE");
            intentFilter0.addAction("com.google.android.gms.smartdevice.setup.RESTORE_DATA");
            jwe.b(this.j, this.m, intentFilter0, 2);
            eqcx.a.d("importAccount(START_SESSION, data) size = %s", new Object[]{v1});
            v = 1;
        }
        else {
            eqcx.a.j("importAccounts(DEPOSIT_DATA, data) size = %s", new Object[]{v1});
        }
        adtu adtu0 = new adtu();
        adtu0.c(v);
        adtu0.a(accountTransferMsg0.c);
        adtu0.b(accountTransferMsg0.e);
        AccountTransferMsg accountTransferMsg1 = new AccountTransferMsg(adtu0);
        evql evql0 = this.c.c(accountTransferMsg1);
        Status status0 = erqf.b(evql0);
        eqcx.a.j("importAccount() %s", new Object[]{status0});
        this.d((status0.e() ? ((AccountTransferMsg)evql0.j()) : null), hygl.e());
    }

    public final boolean d(AccountTransferMsg accountTransferMsg0, boolean z) {
        if(accountTransferMsg0 != null) {
            AccountTransferProgress accountTransferProgress0 = accountTransferMsg0.e;
            if(accountTransferProgress0 != null) {
                eqcx.a.j("checking progress %s", new Object[]{accountTransferProgress0});
                this.i = accountTransferMsg0;
                for(Object object0: accountTransferProgress0.g().entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    String s1 = (String)((Map.Entry)object0).getValue();
                    if(("in_progress".equals(s1) || "registered".equals(s1)) && (!z || s.equals("com.google"))) {
                        return false;
                    }
                }
                this.f();
                if(!eqcx.e(accountTransferMsg0)) {
                    this.d.d(10579, "Google authenticator failed to import");
                    return true;
                }
                this.b();
                return true;
            }
        }
        return false;
    }

    public static boolean e(AccountTransferMsg accountTransferMsg0) {
        if(accountTransferMsg0 == null) {
            return false;
        }
        AccountTransferProgress accountTransferProgress0 = accountTransferMsg0.e;
        if(accountTransferProgress0 == null) {
            return false;
        }
        List list0 = accountTransferProgress0.d;
        Map map0 = accountTransferProgress0.g();
        return list0 != null && list0.contains("com.google") || !map0.containsKey("com.google");
    }

    private final void f() {
        AccountTransferMsg accountTransferMsg0 = this.i;
        if(accountTransferMsg0 == null) {
            eqcx.a.f("Cannot log - no previous transfer message", new Object[0]);
        }
        else {
            AccountTransferProgress accountTransferProgress0 = accountTransferMsg0.e;
            if(accountTransferProgress0 == null) {
                eqcx.a.f("Cannot log - last transfer message has no progress", new Object[0]);
            }
            else {
                int v = this.l.size();
                int v1 = eqri.a(accountTransferProgress0.d);
                int v2 = eqri.a(accountTransferProgress0.f);
                int v3 = eqri.a(accountTransferProgress0.e);
                ProtoLiteBuilder hftp0 = this.k.d.b().b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjpb gjpb0 = (gjpb)hftp0.b_message;
                gjpb0.b |= 1;
                gjpb0.c = v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gjpb)hftv0).b |= 2;
                ((gjpb)hftv0).d = v1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gjpb)hftv1).b |= 4;
                ((gjpb)hftv1).e = v2;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjpb gjpb1 = (gjpb)hftp0.b_message;
                gjpb1.b |= 8;
                gjpb1.f = v3;
            }
        }
        this.h.b();
        if(this.f) {
            this.f = false;
            baun baun0 = eqcx.a;
            baun0.d("importAccounts(END_SESSION)", new Object[0]);
            adtu adtu0 = new adtu();
            adtu0.c(4);
            AccountTransferMsg accountTransferMsg1 = new AccountTransferMsg(adtu0);
            Status status0 = erqf.b(this.c.c(accountTransferMsg1));
            if(!status0.e()) {
                baun0.f("Error ending session %d", new Object[]{((int)status0.i)});
            }
        }
    }
}

