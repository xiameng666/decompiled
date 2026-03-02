import android.accounts.Account;
import com.google.android.gms.backup.BackupOptInSettings;

public final class asmp extends ibsl implements ibtw {
    int a;
    final asms b;
    final Account c;

    public asmp(asms asms0, Account account0, ibrl ibrl0) {
        this.b = asms0;
        this.c = account0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asmp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asmp(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        if(v == 0) {
            ibnx.b(object0);
            String s = this.c.name;
            BackupOptInSettings backupOptInSettings0 = new BackupOptInSettings(true, true, true, true);
            iccs iccs0 = ictn.c(this.b.b.b(true, s, backupOptInSettings0));
            this.a = 1;
            object0 = iccs0.n(this);
            if(object0 != object1) {
            label_13:
                Void void0 = (Void)object0;
                asms asms0 = this.b;
                if(asms0.e()) {
                    evql evql0 = asms0.b.d(true, this.c.name);
                    this.a = 2;
                    if(ictn.b(evql0, this) != object1) {
                        goto label_19;
                    }
                }
                else {
                label_19:
                    this.a = 3;
                    if(this.b.d(this) != object1) {
                        return ibom.a;
                    }
                }
            }
        }
        else {
            ibnx.b(object0);
            switch(v) {
                case 1: {
                    goto label_13;
                }
                case 2: {
                    goto label_19;
                }
                default: {
                    return ibom.a;
                }
            }
        }
        return object1;
    }
}

