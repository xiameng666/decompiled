import android.accounts.Account;
import com.google.android.gms.backup.BackupOptInSettings;

public final class asmo extends ibsl implements ibtw {
    int a;
    final asms b;

    public asmo(asms asms0, ibrl ibrl0) {
        this.b = asms0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asmo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asmo(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        String s = null;
        switch(v) {
            case 0: {
                ibnx.b(object0);
                BackupOptInSettings backupOptInSettings0 = new BackupOptInSettings(true, true, true, true);
                iccs iccs0 = ictn.c(this.b.b.b(false, null, backupOptInSettings0));
                this.a = 1;
                object0 = iccs0.n(this);
                if(object0 != object1) {
                    goto label_15;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_15:
                Void void0 = (Void)object0;
                asms asms0 = this.b;
                if(asms0.e()) {
                    asml asml0 = (asml)((aqqh)asms0.f.b()).b();
                    Account account0 = (asml0 instanceof asmk) ? ((asmk)asml0).a : null;
                    if(account0 != null) {
                        s = account0.name;
                    }
                    if(s == null) {
                        ((ggtj)asms.a.j()).x("Cannot disable MMS backups due to missing backup account.");
                        goto label_28;
                    }
                    else {
                        evql evql0 = asms0.b.d(false, s);
                        this.a = 2;
                        if(ictn.b(evql0, this) != object1) {
                            goto label_28;
                        }
                    }
                }
                else {
                label_28:
                    this.a = 3;
                    if(this.b.c.a(this) != object1) {
                    label_30:
                        this.a = 4;
                        if(this.b.d(this) != object1) {
                            return ibom.a;
                        }
                    }
                }
                break;
            }
            default: {
                ibnx.b(object0);
                switch(v) {
                    case 2: {
                        goto label_28;
                    }
                    case 3: {
                        goto label_30;
                    }
                    default: {
                        return ibom.a;
                    }
                }
            }
        }
        return object1;
    }
}

