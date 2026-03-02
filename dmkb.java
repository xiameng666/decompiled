import android.accounts.Account;
import android.content.Intent;
import android.os.UserHandle;

final class dmkb extends ibsl implements ibtw {
    int a;
    final dmkc b;
    final Intent c;

    public dmkb(dmkc dmkc0, Intent intent0, ibrl ibrl0) {
        this.b = dmkc0;
        this.c = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dmkb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dmkb(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                dmkc dmkc0 = this.b;
                xni xni0 = dmkc0.b;
                if(xni0.isFinishing()) {
                    return ibom.a;
                }
                if(hyoz.h()) {
                    Intent intent0 = this.c;
                    if(intent0.getBooleanExtra("access_work_profile_initiated", false)) {
                        ((ggtj)dmkc.a.h()).x("[Work Profile] Start activity as the system user");
                        intent0.addFlags(0x14000000);
                        xni0.startActivityAsUser(intent0, UserHandle.SYSTEM);
                        xni0.finish();
                        return ibom.a;
                    }
                }
                this.a = 1;
                object0 = dllw.a(dmkc0.c, this);
                if(object0 != object1) {
                    goto label_20;
                }
                break;
            }
            case 1: {
            label_20:
                if(((Account)object0) == null) {
                    ((ggtj)dmkc.a.j()).x("No active account found");
                    this.b.b.finish();
                    return ibom.a;
                }
                this.a = 2;
                object0 = dqfa.b(this.b.d, this.c, ((Account)object0), this);
                if(object0 != object1) {
                    ((Intent)object0).addFlags(0x4000000);
                    this.b.b.startActivity(((Intent)object0));
                    this.b.b.finish();
                    return ibom.a;
                }
                break;
            }
            default: {
                ((Intent)object0).addFlags(0x4000000);
                this.b.b.startActivity(((Intent)object0));
                this.b.b.finish();
                return ibom.a;
            }
        }
        return object1;
    }
}

