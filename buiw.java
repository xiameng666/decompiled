import android.accounts.Account;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

final class buiw extends ibsl implements ibtw {
    int a;
    final buiy b;

    public buiw(buiy buiy0, ibrl ibrl0) {
        this.b = buiy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buiw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buiw(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                Account account0 = new Account(this.b.c.a, "com.google");
                this.a = 1;
                object0 = this.b.d.b(account0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_10:
                String s = (String)object0;
                return buiu.a;
            }
            catch(UserRecoverableAuthException userRecoverableAuthException0) {
                return new buit(userRecoverableAuthException0);
            }
            catch(IOException iOException0) {
                a.ae(buiy.a.j(), "Encountered IOException when authenticating", iOException0);
                return buir.a;
            }
            catch(acse acse0) {
                a.ae(buiy.a.j(), "Encountered unrecoverable authentication error.", acse0);
                return buir.a;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(UserRecoverableAuthException userRecoverableAuthException0) {
                return new buit(userRecoverableAuthException0);
            }
            catch(IOException iOException0) {
                a.ae(buiy.a.j(), "Encountered IOException when authenticating", iOException0);
                return buir.a;
            }
            catch(acse acse0) {
                a.ae(buiy.a.j(), "Encountered unrecoverable authentication error.", acse0);
                return buir.a;
            }
        }
        goto label_10;
    }
}

