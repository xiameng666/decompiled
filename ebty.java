import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import j..util.Optional;

public final class ebty implements ibts {
    public final ebub a;

    public ebty(ebub ebub0) {
        this.a = ebub0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ebub ebub0 = this.a;
        dxzq dxzq0 = ebub0.i;
        String s = null;
        if(dxzq0 == null) {
            ibuq.j("octopusAppStatusDataStoreProvider");
            dxzq0 = null;
        }
        Account account0 = ebub0.f;
        if(account0 == null) {
            ibuq.j("account");
            account0 = null;
        }
        String s1 = ebub0.g;
        if(s1 == null) {
            ibuq.j("environment");
        }
        else {
            s = s1;
        }
        dyim dyim0 = (dyim)dxzq0.a(account0, s).a().get();
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhe.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.c(dyim0);
        ibuq.f(dyim0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyhe dyhe0 = (dyhe)hftp0.b_message;
        dyim0.getClass();
        dyhe0.c = dyim0;
        dyhe0.b |= 1;
        if(((Optional)object0).isPresent()) {
            Object object1 = ((Optional)object0).get();
            ibuq.e(object1, "get(...)");
            ibuq.f(((dyja)object1), "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyhe dyhe1 = (dyhe)hftp0.b_message;
            ((dyja)object1).getClass();
            dyhe1.d = (dyja)object1;
            dyhe1.b |= 2;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyhe)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyhe)hftv0).getClass();
        dyfy0.c = (dyhe)hftv0;
        dyfy0.b = 5;
        byte[] arr_b = dyga0.a().toBytesArray();
        ebub0.c.b(Status.b, arr_b);
        return ibom.a;
    }
}

