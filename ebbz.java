import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.SyncTransactionsRequest;
import com.google.android.gms.pay.SyncTransactionsResponse;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;

@cmcs(a = cmcr.c)
public final class ebbz extends ebav {
    private final SyncTransactionsRequest a;
    private final donp b;
    private final String c;

    public ebbz(SyncTransactionsRequest syncTransactionsRequest0, String s, donp donp0, azug azug0) {
        super("SyncTransactions", s, azug0);
        this.a = syncTransactionsRequest0;
        this.b = donp0;
        this.c = s;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        Account account0 = this.a.a;
        String s = eccr.a(context0, account0);
        dola dola0 = dlmg.a(AppContextProvider.a(), account0.name, s);
        dmgr dmgr0 = new dmgr(this.c);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        edgp edgp0 = new edgp(new edfx(eayu.b(domv0, dola0, dmgr0), eayu.c(domv0, dola0), new edgi(domv0.a(), dole.b(dola0), dmgy.a()), new earj(new earo(domv0.a(), dole.b(dola0), dmgy.a(), new earr(domv0.a(), dole.b(dola0), dmgy.a())))), new edgk(eayu.b(domv0, dola0, dmgr0)), eass.a(), new edgz(new edtj(dolc.b(dola0), new fbio(domv0.a(), edtq.b(eayu.a(), dolc.b(dola0))), edtn.a(), eayu.a()), eayu.b(domv0, dola0, dmgr0), eayu.c(domv0, dola0)));
        long v = this.a.b;
        hkoc hkoc0 = v > 0L ? edgp0.c(v, this.a.c) : edgp0.b(this.a.c);
        SyncTransactionsResponse syncTransactionsResponse0 = new SyncTransactionsResponse();
        syncTransactionsResponse0.a = hkoc0.c;
        syncTransactionsResponse0.b = hkoc0.d.toByteArray();
        this.b.A(Status.b, syncTransactionsResponse0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.A(status0, null);
    }

    @Override  // ebav
    protected final ExecutorService r() {
        return new bblp(1, 10);
    }
}

