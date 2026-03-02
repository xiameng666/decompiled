import android.accounts.Account;
import android.content.Context;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.List;

public final class ebvh {
    public static final bboh a;
    public final dyfv b;
    public final donp c;
    public final String d;
    public final Context e;
    public Account f;
    public String g;
    public dyra h;
    public dxzq i;
    public gmcg j;
    public ebst k;

    static {
        ebvh.a = bboh.b("Pay", bbcu.cZ);
    }

    public ebvh(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.b = dyfv0;
        this.c = donp0;
        this.d = s;
        this.e = context0;
    }

    public final gmcg a() {
        gmcg gmcg0 = this.j;
        if(gmcg0 != null) {
            return gmcg0;
        }
        ibuq.j("highSpeedExecutor");
        return null;
    }

    public static final ibom b(ebvh ebvh0, String s, List list0) {
        ebst ebst1;
        dxzq dxzq0 = ebvh0.i;
        if(dxzq0 == null) {
            ibuq.j("octopusAppStatusDataStoreProvider");
            dxzq0 = null;
        }
        Account account0 = ebvh0.f;
        if(account0 == null) {
            ibuq.j("account");
            account0 = null;
        }
        String s1 = ebvh0.g;
        if(s1 == null) {
            ibuq.j("environment");
            s1 = null;
        }
        dyim dyim0 = (dyim)dxzq0.a(account0, s1).a().get();
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhq.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.c(dyim0);
        ibuq.f(dyim0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyhq dyhq0 = (dyhq)hftp0.b_message;
        dyim0.getClass();
        dyhq0.c = dyim0;
        dyhq0.b |= 1;
        List list1 = DesugarCollections.unmodifiableList(dyhq0.d);
        ibuq.e(list1, "getOctopusPaymentMethodList(...)");
        new hfxu(list1);
        ibuq.c(list0);
        ibuq.f(list0, "values");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyhq dyhq1 = (dyhq)hftp0.b_message;
        hfuo hfuo0 = dyhq1.d;
        if(!hfuo0.c()) {
            dyhq1.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, dyhq1.d);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyhq)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyhq)hftv0).getClass();
        dyfy0.c = (dyhq)hftv0;
        dyfy0.b = 4;
        dyfy dyfy1 = dyga0.a();
        if(hwnm.a.f().F()) {
            try {
                byte[] arr_b = dyfy1.toBytesArray();
                ebvh0.c.b(Status.b, arr_b);
            }
            catch(DeadObjectException deadObjectException0) {
                a.ae(ebvh.a.j(), "ListOctopusCards: caller process is dead after listing octopus cards.", deadObjectException0);
                ebst ebst0 = ebvh0.k;
                if(ebst0 == null) {
                    ibuq.j("emoneyOperationUtils");
                    ebst1 = null;
                }
                else {
                    ebst1 = ebst0;
                }
                dyhn dyhn0 = ebvh0.b.b == 5 ? ((dyhn)ebvh0.b.c) : dyhn.a;
                int v = (dyfc.b(dyhn0.b) == null ? dyfc.d : dyfc.b(dyhn0.b)).a();
                dyhn dyhn1 = ebvh0.b.b == 5 ? ((dyhn)ebvh0.b.c) : dyhn.a;
                ebst1.b(s, 232800, 0L, v, (dyfc.b(dyhn1.b) == null ? dyfc.d : dyfc.b(dyhn1.b)).name());
            }
            return ibom.a;
        }
        byte[] arr_b1 = dyfy1.toBytesArray();
        ebvh0.c.b(Status.b, arr_b1);
        return ibom.a;
    }
}

