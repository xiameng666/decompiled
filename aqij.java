import android.accounts.Account;
import android.widget.Toast;
import com.google.android.gms.backup.base.SetBackupAccountChimeraActivity;

public final class aqij {
    public static final baun a;
    public final SetBackupAccountChimeraActivity b;
    public final aqnb c;
    public final aqrd d;
    public final aqys e;
    public final gful_cronetEngineProvider f;

    static {
        aqij.a = aqql.a("BackupAccountSwitcher");
    }

    public aqij(SetBackupAccountChimeraActivity setBackupAccountChimeraActivity0, aqnb aqnb0, aqrd aqrd0, aqys aqys0) {
        this.f = gfus.a(((gful_cronetEngineProvider)new aqig()));
        this.b = setBackupAccountChimeraActivity0;
        this.c = aqnb0;
        this.d = aqrd0;
        this.e = aqys0;
    }

    public final void a() {
        Toast.makeText(this.b, 0x7F1508E3, 0).show();  // string:common_something_went_wrong "Something went wrong"
    }

    public final int b(Account account0) {
        String s = this.b.getIntent().getStringExtra("photosBackupAccountName");
        Account account1 = (Account)this.b.getIntent().getParcelableExtra("currentBackupAccount");
        if(account1 == null) {
            return 1;
        }
        if(s == null) {
            return 2;
        }
        if(s.equals(account1.name)) {
            return 4;
        }
        return s.equals(account0.name) ? 3 : 5;
    }

    public final void c(Account account0, int v) {
        int v1 = this.b(account0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghzj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghzj)hftv0).c = 1;
        ((ghzj)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((ghzj)hftv1).d = v1 - 1;
        ((ghzj)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghzj)hftp0.b_message).e = v - 1;
        ((ghzj)hftp0.b_message).b |= 4;
        ghzj ghzj0 = (ghzj)hftp0.N_build();
        ProtoLiteBuilder hftp1 = aqra.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        ghzj0.getClass();
        ghys0.ap = ghzj0;
        ghys0.d |= 0x40000;
        this.e.x(hftp1, ghyr.aD, 0);
    }
}

