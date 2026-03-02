import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.android.gms.tapandpay.firstparty.GetTapAndPaySettingsResponse;
import com.google.android.gms.tapandpay.firstparty.TapAndPaySettings;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public final class dmbq implements dmba {
    private static final bboh a;
    private final PageData b;
    private final Account c;
    private GetAllCardsResponse d;
    private int e;
    private final etgl f;

    static {
        dmbq.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmbq(etgl etgl0, PageData pageData0, Account account0) {
        this.f = etgl0;
        this.b = pageData0;
        this.c = account0;
        this.e = 1;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v2;
        int v;
        GetAllCardsResponse getAllCardsResponse0;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 62, "Cannot evaluate filter that is not payment method auth to tap filter", new Object[0]);
        if(this.d == null) {
            try {
                getAllCardsResponse0 = null;
                getAllCardsResponse0 = (GetAllCardsResponse)evrg.n(this.f.k(this.c, false));
            }
            catch(InterruptedException interruptedException0) {
                a.ae(dmbq.a.j(), "Could not get all cards.", interruptedException0);
            }
            catch(ExecutionException executionException0) {
                a.ae(dmbq.a.j(), "Could not get all cards.", executionException0);
            }
            catch(IllegalStateException illegalStateException0) {
                a.ae(dmbq.a.j(), "Could not get all cards.", illegalStateException0);
            }
            this.d = getAllCardsResponse0;
        }
        if(this.e == 1) {
            try {
                Object object0 = evrg.n(this.f.cC(new int[]{2}));
                ibuq.e(object0, "await(...)");
                ibuq.e(((GetTapAndPaySettingsResponse)object0).a, "getTapAndPaySettings(...)");
                TapAndPaySettings tapAndPaySettings0 = (TapAndPaySettings)ibpo.U(((GetTapAndPaySettingsResponse)object0).a, 0);
                if(tapAndPaySettings0 == null) {
                    goto label_32;
                }
                else {
                    v = tapAndPaySettings0.a;
                }
                goto label_33;
            }
            catch(InterruptedException interruptedException1) {
                a.ae(dmbq.a.j(), "Failed to get transit verification settings.", interruptedException1);
            }
            catch(ExecutionException executionException1) {
                a.ae(dmbq.a.j(), "Failed to get transit verification settings.", executionException1);
            }
            catch(IllegalStateException illegalStateException1) {
                a.ae(dmbq.a.j(), "Failed to get transit verification settings.", illegalStateException1);
            }
        label_32:
            v = 1;
        label_33:
            this.e = v;
        }
        GetAllCardsResponse getAllCardsResponse1 = this.d;
        if(getAllCardsResponse1 != null) {
            CardInfo[] arr_cardInfo = getAllCardsResponse1.a;
            if(arr_cardInfo != null) {
                ArrayList arrayList0 = new ArrayList();
                for(int v1 = 0; true; ++v1) {
                    v2 = 3;
                    if(v1 >= arr_cardInfo.length) {
                        break;
                    }
                    CardInfo cardInfo0 = arr_cardInfo[v1];
                    if(cardInfo0.g != null && cardInfo0.g.b == 5 && cardInfo0.R == null && (!cardInfo0.D || this.e == 3)) {
                        arrayList0.add(cardInfo0);
                    }
                }
                switch((hjwe0.b == 62 ? ((hjur)hjwe0.c) : hjur.a).b) {
                    case 0: {
                        v2 = 2;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        v2 = 4;
                        break;
                    }
                    default: {
                        v2 = 0;
                    }
                }
                if(v2 == 0) {
                    v2 = 1;
                }
                switch(v2 - 2) {
                    case 1: {
                        goto label_57;
                    }
                    case 2: {
                        return !arrayList0.isEmpty();
                    }
                }
                return false;
            label_57:
                if(!arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        if(!ibuq.m(((CardInfo)object1).a, this.b.b)) {
                            continue;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

