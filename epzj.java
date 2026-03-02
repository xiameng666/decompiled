import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.SourceAccountExportController.ExportReceiver;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public final class epzj {
    public static final baun a;
    public final epzk b;
    public final adts c;
    public final ExecutorService d;
    public final AtomicInteger e;
    public final Set f;
    public final Set g;
    public int h;
    public final epwe i;
    private final Context j;
    private final eqlx k;
    private BroadcastReceiver l;

    static {
        epzj.a = new erqc(new String[]{"D2D", "SourceAccountExportController"});
    }

    public epzj(Context context0, eqlx eqlx0, epzk epzk0, boolean z, boolean z1) {
        this.f = new HashSet();
        this.g = new HashSet();
        batl.s(context0);
        this.j = context0;
        batl.s(eqlx0);
        this.k = eqlx0;
        batl.s(epzk0);
        this.b = epzk0;
        this.e = new AtomicInteger();
        this.d = new bblp(1, 10);
        this.c = new adts(context0, eqfx.a(context0, z, z1));
        this.i = epzg.a(context0);
    }

    public final void a() {
        synchronized(this) {
            if(this.l != null) {
                baun baun0 = epzj.a;
                baun0.d("exportAccounts(END_SESSION) %s", new Object[]{this});
                int v1 = this.h;
                Set set0 = this.f;
                int v2 = set0.size();
                ProtoLiteBuilder hftp0 = this.k.i;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjod gjod0 = (gjod)hftp0.b_message;
                gjod0.b |= 1;
                gjod0.c = v1;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gjod gjod1 = (gjod)hftp0.b_message;
                gjod1.b |= 2;
                gjod1.d = v2;
                this.h = 0;
                set0.clear();
                adtu adtu0 = new adtu();
                adtu0.c(4);
                AccountTransferMsg accountTransferMsg0 = new AccountTransferMsg(adtu0);
                Status status0 = erqf.b(this.c.b(accountTransferMsg0));
                if(!status0.e()) {
                    baun0.f("error ending session %s", new Object[]{status0});
                }
                BroadcastReceiver broadcastReceiver0 = this.l;
                if(broadcastReceiver0 != null) {
                    try {
                        this.j.unregisterReceiver(broadcastReceiver0);
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                    this.l = null;
                }
            }
        }
    }

    public final void b(AccountTransferPayload accountTransferPayload0) {
        baun baun0 = epzj.a;
        baun0.j("Importing authenticator data", new Object[0]);
        AccountTransferMsg accountTransferMsg0 = accountTransferPayload0.p();
        if(accountTransferMsg0 == null) {
            this.d("AccountTransferMsg is null");
            return;
        }
        adtu adtu0 = new adtu();
        adtu0.c(3);
        adtu0.b(accountTransferMsg0.e);
        adtu0.a(accountTransferMsg0.c);
        AccountTransferMsg accountTransferMsg1 = new AccountTransferMsg(adtu0);
        Status status0 = erqf.b(this.c.b(accountTransferMsg1));
        baun0.j("importAccounts status = %s", new Object[]{status0});
        if(!status0.e()) {
            this.d("Failure importing data from target");
        }
    }

    public final void c(boolean z) {
        synchronized(this) {
            baun baun0 = epzj.a;
            boolean z1 = false;
            baun0.j("Using exportAccounts()", new Object[0]);
            this.f.clear();
            this.k.s(3);
            int v1 = 1;
            if(this.l == null) {
                z1 = true;
            }
            batl.m(z1, "cleanup() must be called before retrying startAccountExport()");
            Context context0 = this.j;
            String s = context0.getResources().getQuantityString(0x7F130096, cchj.b(context0).p("com.google").length);  // plurals:smartdevice_d2d_copying_accounts
            MessagePayload messagePayload0 = new MessagePayload();
            messagePayload0.ai(s);
            this.b.f(messagePayload0);
            this.b.e(s);
            adtu adtu0 = new adtu();
            if(z) {
                v1 = 5;
            }
            adtu0.c(v1);
            AccountTransferMsg accountTransferMsg0 = new AccountTransferMsg(adtu0);
            this.l = new SourceAccountExportController.ExportReceiver(this);
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP");
            jwe.b(context0, this.l, intentFilter0, 2);
            Status status0 = erqf.b(this.c.b(accountTransferMsg0));
            baun0.d("exportAccounts(START_SESSION) status %s", new Object[]{status0});
            if(!status0.e()) {
                this.d("exportAccounts(START_SESSION) failed");
            }
        }
    }

    public final void d(String s) {
        epzj.a.f(s, new Object[0]);
        this.b.a(10579, s);
    }
}

