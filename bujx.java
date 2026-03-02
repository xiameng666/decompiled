import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GetTokenResponse;

public final class bujx {
    private final Context a;
    private final icck b;
    private final actv c;

    public bujx(Context context0, icck icck0, actv actv0) {
        ibuq.f(icck0, "scope");
        super();
        this.a = context0;
        this.b = icck0;
        this.c = actv0;
    }

    public final gmcd a(Account account0) {
        ibuq.f(account0, "account");
        bujw bujw0 = new bujw(this, account0, null);
        return icpu.e(this.b, bujw0);
    }

    public final Object b(Account account0, ibrl ibrl0) {
        bujv bujv0;
        if((ibrl0 instanceof bujv)) {
            bujv0 = (bujv)ibrl0;
            int v = bujv0.c;
            if((v & 0x80000000) == 0) {
                bujv0 = new bujv(this, ibrl0);
            }
            else {
                bujv0.c = v - 0x80000000;
            }
        }
        else {
            bujv0 = new bujv(this, ibrl0);
        }
        Object object0 = bujv0.a;
        Object object1 = ibrx.a;
        switch(bujv0.c) {
            case 0: {
                ibnx.b(object0);
                String s = acso.e(this.a, account0.name);
                actp actp0 = GetTokenRequest.a();
                actp0.d(true);
                hfuo hfuo0 = htuh.e().f().b;
                ibuq.e(hfuo0, "getElementList(...)");
                hfuo hfuo1 = htuh.e().e().b;
                ibuq.e(hfuo1, "getElementList(...)");
                actp0.c = ibpo.ak(hfuo0, hfuo1);
                actt actt0 = new actt();
                actt0.d(s);
                actt0.b(account0.type);
                actt0.c(account0.name);
                actp0.a = actt0.a();
                GetTokenRequest getTokenRequest0 = actp0.a();
                evql evql0 = this.c.d(getTokenRequest0);
                bujv0.c = 1;
                object0 = ictn.b(evql0, bujv0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(((GetTokenResponse)object0).a, "getToken(...)");
        return ((GetTokenResponse)object0).a;
    }
}

