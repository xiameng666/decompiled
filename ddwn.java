import android.accounts.Account;
import androidx.activity.result.ActivityResult;

public final class ddwn implements ibts {
    public final ibts a;

    public ddwn(ibts ibts0) {
        this.a = ibts0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ActivityResult)object0), "result");
        if(((ActivityResult)object0).a == -1) {
            Account account0 = dizg.a(((ActivityResult)object0).b);
            if(account0 != null) {
                this.a.a(account0);
            }
        }
        return ibom.a;
    }
}

