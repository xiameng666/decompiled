import android.accounts.Account;
import com.google.android.gms.nearby.sharing.internal.GetReachablePhoneNumbersParams;

public final class ddrh implements azys {
    public final ddsc a;
    public final Account b;

    public ddrh(ddsc ddsc0, Account account0) {
        this.a = ddsc0;
        this.b = account0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        GetReachablePhoneNumbersParams getReachablePhoneNumbersParams0 = new GetReachablePhoneNumbersParams();
        getReachablePhoneNumbersParams0.b = this.b;
        getReachablePhoneNumbersParams0.a = new ddpk(this.a, ((evqp)object1));
        ddot0.r(getReachablePhoneNumbersParams0);
    }
}

