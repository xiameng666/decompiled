import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Optional;
import java.util.concurrent.ExecutionException;

public final class ebur implements evqc {
    public final ebus a;
    public final dyna b;
    public final String c;
    public final ggdy d;

    public ebur(ebus ebus0, dyna dyna0, String s, ggdy ggdy0) {
        this.a = ebus0;
        this.b = dyna0;
        this.c = s;
        this.d = ggdy0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        String s1;
        ggdy ggdy0;
        ebus ebus0;
        try {
            ebus0 = this.a;
            dyna dyna0 = this.b;
            String s = this.c;
            ggdy0 = this.d;
            if(!(exception0 instanceof ExecutionException) && !(exception0 instanceof InterruptedException) && !(exception0 instanceof fsim)) {
                if((exception0 instanceof IllegalArgumentException)) {
                    ((ggtj)((ggtj)((ggtj)ebus.a.i()).s(exception0)).ar(0x3004)).x("Failed to marshall GetSePrepaidCardResponse.");
                    ebus0.c.q(Status.d, null);
                }
                return;
            }
            ((ggtj)((ggtj)((ggtj)ebus.a.i()).s(exception0)).ar(0x3002)).x("Error while getting prepaid card data");
            ((ggtj)((ggtj)ebus.a.i()).ar(0x3003)).R("Failed to find requested card. Service provider: %s Card ID: %s", dyna0.name(), s);
            donp donp0 = ebus0.c;
            Status status0 = Status.b;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyhg.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dyer.a).v_newBuilder();
            Optional optional0 = ebza.e(exception0);
            if(optional0.isPresent()) {
                s1 = (String)optional0.get();
            }
            else {
                s1 = exception0.getMessage();
                if(gfta.c(s1)) {
                    s1 = "INTERNAL_ERROR";
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dyer dyer0 = (dyer)hftp1.b_message;
            s1.getClass();
            dyer0.b = s1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dyhg dyhg0 = (dyhg)hftp0.b_message;
            dyer dyer1 = (dyer)hftp1.N_build();
            dyer1.getClass();
            dyhg0.d = dyer1;
            dyhg0.b |= 2;
            donp0.q(status0, ftqe.b(((MessageLite)(((dyhg)hftp0.N_build())))));
            gged_interceptors gged0 = ggdy0.h();
            Optional optional1 = ebza.f(exception0);
            ebus0.h.j(ebus0.d, ebus.n, gged0, optional1);
        }
        catch(RemoteException remoteException0) {
            Optional optional2 = ebza.f(remoteException0);
            ebwl ebwl0 = ebus0.h;
            gged_interceptors gged1 = ggdy0.h();
            ebwl0.j(ebus0.d, ebus.n, gged1, optional2);
        }
    }
}

