import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.RefreshSePrepaidTransactionsFromChipRequest;
import dagger.internal.Preconditions;

@cmcs(a = cmcr.d)
public final class ebyi extends ebav {
    edfu a;
    dmtv b;
    dypo c;
    ebwl d;
    ebpp e;
    public static final int f;
    private final gtni g;
    private final RefreshSePrepaidTransactionsFromChipRequest h;
    private final donp n;
    private final String o;

    public ebyi(RefreshSePrepaidTransactionsFromChipRequest refreshSePrepaidTransactionsFromChipRequest0, String s, donp donp0, azug azug0) {
        super("RefreshSePrepaidTransactionFromChip", s, azug0);
        this.o = s;
        this.h = refreshSePrepaidTransactionsFromChipRequest0;
        this.n = donp0;
        this.g = dypl.g(refreshSePrepaidTransactionsFromChipRequest0.c);
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        RefreshSePrepaidTransactionsFromChipRequest refreshSePrepaidTransactionsFromChipRequest0 = this.h;
        String s = refreshSePrepaidTransactionsFromChipRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            Status status0 = new Status(5);
            this.n.x(status0);
            return;
        }
        if(this.e == null) {
            dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
            done done0 = new done();
            dmgr dmgr0 = new dmgr(this.o);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.e = new ebpp(dola0, dmgr0, done0, domv0, new edop());
        }
        this.e.inject(this);
        Iterable iterable0 = this.c.c(dypo.b, this.c.p());
        GooglePaymentMethodId[] arr_googlePaymentMethodId = refreshSePrepaidTransactionsFromChipRequest0.b;
        if(arr_googlePaymentMethodId != null && arr_googlePaymentMethodId.length != 0) {
            iterable0 = gggq.d(iterable0, new ebyh(arr_googlePaymentMethodId));
        }
        for(Object object0: iterable0) {
            this.a.c(((dylf)object0), 4);
        }
        this.d.g(this.g, 15);
        this.n.x(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ebwl ebwl0 = this.d;
        if(ebwl0 != null) {
            ebwl0.c(this.g, 15, 15);
        }
        this.n.x(status0);
    }
}

