import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.SyncTransactionByIdRequest;
import com.google.android.gms.pay.SyncTransactionByIdResponse;
import dagger.internal.Preconditions;
import java.util.concurrent.ExecutorService;

@cmcs(a = cmcr.c)
public final class ebby extends ebav {
    private final SyncTransactionByIdRequest a;
    private final donp b;
    private final String c;

    public ebby(SyncTransactionByIdRequest syncTransactionByIdRequest0, String s, donp donp0, azug azug0) {
        super("SyncTransactionById", s, azug0);
        this.a = syncTransactionByIdRequest0;
        this.b = donp0;
        this.c = s;
    }

    @Override  // ebaw
    protected final void b(Context context0) {
        SyncTransactionByIdRequest syncTransactionByIdRequest0 = this.a;
        Account account0 = syncTransactionByIdRequest0.a;
        String s = eccr.a(context0, account0);
        dola dola0 = dlmg.a(AppContextProvider.a(), account0.name, s);
        dmgr dmgr0 = new dmgr(this.c);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        edgp edgp0 = new edgp(new edfx(eayt.b(domv0, dola0, dmgr0), eayt.c(domv0, dola0), new edgi(domv0.a(), dole.b(dola0), dmgy.a()), new earj(new earo(domv0.a(), dole.b(dola0), dmgy.a(), new earr(domv0.a(), dole.b(dola0), dmgy.a())))), new edgk(eayt.b(domv0, dola0, dmgr0)), eass.a(), new edgz(new edtj(dolc.b(dola0), new fbio(domv0.a(), edtq.b(eayt.a(), dolc.b(dola0))), edtn.a(), eayt.a()), eayt.b(domv0, dola0, dmgr0), eayt.c(domv0, dola0)));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjqu.a).v_newBuilder();
        String s1 = syncTransactionByIdRequest0.b.a;
        if(!gfta.c(s1)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjqu hjqu0 = (hjqu)hftp0.b_message;
            s1.getClass();
            hjqu0.b = s1;
        }
        String s2 = syncTransactionByIdRequest0.b.b;
        if(!gfta.c(s2)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hjqu hjqu1 = (hjqu)hftp0.b_message;
            s2.getClass();
            hjqu1.c = s2;
        }
        boolean z = edgp0.e(((hjqu)hftp0.N_build()));
        SyncTransactionByIdResponse syncTransactionByIdResponse0 = new SyncTransactionByIdResponse();
        syncTransactionByIdResponse0.a = z;
        this.b.y(Status.b, syncTransactionByIdResponse0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.b.y(status0, null);
    }

    @Override  // ebav
    protected final ExecutorService r() {
        return new bblp(1, 10);
    }
}

