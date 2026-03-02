import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.RefreshSePostpaidsTransactionsFromChipRequest;
import dagger.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class ebyg extends ebav {
    public static final bboh a;
    edfu b;
    dmtv c;
    dypj d;
    dmgi e;
    ebpk f;
    public static final int g;
    private final RefreshSePostpaidsTransactionsFromChipRequest h;
    private final donp n;
    private final String o;

    static {
        ebyg.a = bboh.b("Pay", bbcu.cZ);
        ebyg.g = 5;
    }

    public ebyg(RefreshSePostpaidsTransactionsFromChipRequest refreshSePostpaidsTransactionsFromChipRequest0, String s, donp donp0, azug azug0) {
        super("RefreshSePostpaidTransactionFromChip", s, azug0);
        this.o = s;
        this.h = refreshSePostpaidsTransactionsFromChipRequest0;
        this.n = donp0;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Account account0 = this.h.a;
        String s = account0.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            Status status0 = new Status(5);
            this.n.x(status0);
            return;
        }
        if(this.f == null) {
            dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
            done done0 = new done();
            dmgr dmgr0 = new dmgr(this.o);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.f = new ebpk(dola0, dmgr0, done0, domv0, new edop());
        }
        this.f.inject(this);
        try {
            dxeo dxeo0 = this.c.a(account0, 1);
        }
        catch(InterruptedException | ExecutionException | TimeoutException exception0) {
            throw new cjuh(8, null, null, exception0);
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        GooglePaymentMethodId[] arr_googlePaymentMethodId = this.h.b;
        for(Object object0: dxeo0.b) {
            dxev dxev0 = (dxev)object0;
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            String s2 = (hkhh0.g == null ? hkir.a : hkhh0.g).c;
            if(!dnpx.r(dxev0) || s2.isEmpty()) {
            }
            else if(arr_googlePaymentMethodId != null && arr_googlePaymentMethodId.length != 0) {
                int v = 0;
                while(v < arr_googlePaymentMethodId.length) {
                    GooglePaymentMethodId googlePaymentMethodId0 = arr_googlePaymentMethodId[v];
                    hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
                    hjqn hjqn0 = hkhr1.e == null ? hjqn.a : hkhr1.e;
                    if((hjqn0.c.isEmpty() || !hjqn0.c.equals(googlePaymentMethodId0.b)) && (hjqn0.b.isEmpty() || !hjqn0.b.equals(googlePaymentMethodId0.a))) {
                        ++v;
                        continue;
                    }
                    else {
                        goto label_40;
                    }
                    break;
                }
            }
            else {
            label_40:
                arrayList0.add(dxev0);
                arrayList1.add(s2);
            }
        }
        if(arrayList1.isEmpty()) {
            this.n.x(Status.b);
            ebwm.c(this.e, ebyg.g);
            return;
        }
        dyxt dyxt0 = this.d.b;
        evql evql0 = dyxt0.d(new dywk(new dyxq(dyxt0, arrayList1)));
        evql0.y(new bblp(0x7FFFFFFF, 9), new ebye(this, arrayList0));
        evql0.v(new bblp(0x7FFFFFFF, 9), new ebyf(this));
        this.n.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.n.x(status0);
    }
}

