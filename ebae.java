import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.GoogleTransactionId;
import com.google.android.gms.pay.Transaction;
import dagger.internal.Preconditions;

@cmcs(a = cmcr.c)
public final class ebae extends ebav {
    edgp a;
    eavy b;
    private final GetTransactionsRequest c;
    private final donp d;
    private final String e;

    public ebae(GetTransactionsRequest getTransactionsRequest0, String s, donp donp0, azug azug0) {
        super("GetTransactionById", s, azug0);
        this.c = getTransactionsRequest0;
        this.d = donp0;
        this.e = s;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Transaction transaction0;
        GetTransactionsRequest getTransactionsRequest0 = this.c;
        GoogleTransactionId googleTransactionId0 = getTransactionsRequest0.b;
        if(googleTransactionId0 == null) {
            Status status0 = new Status(10);
            this.d.z(status0, null);
            return;
        }
        String s = getTransactionsRequest0.a.name;
        String s1 = dlmj.b(context0, s);
        if(s1 == null) {
            this.d.z(Status.d, null);
            return;
        }
        if(this.b == null) {
            dola dola0 = dlmg.a(AppContextProvider.a(), s, s1);
            dmgr dmgr0 = new dmgr(this.e);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.b = new eavy(dola0, dmgr0, domv0);
        }
        this.b.inject(this);
        try {
            transaction0 = this.a.a(googleTransactionId0.a, googleTransactionId0.b);
        }
        catch(dmhl dmhl0) {
            throw new cjuh(8, null, null, dmhl0);
        }
        GetTransactionsResponse getTransactionsResponse0 = new GetTransactionsResponse();
        if(transaction0 != null) {
            getTransactionsResponse0.a = new Transaction[]{transaction0};
        }
        this.d.z(Status.b, getTransactionsResponse0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.d.z(status0, null);
    }
}

