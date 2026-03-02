import android.os.Looper;
import java.util.concurrent.TimeUnit;

public final class csae implements Runnable {
    public final csaq a;
    public final csar b;
    public final ProtoLiteBuilder c;

    public csae(csar csar0, ProtoLiteBuilder hftp0, csaq csaq0) {
        this.b = csar0;
        this.c = hftp0;
        this.a = csaq0;
    }

    @Override
    public final void run() {
        csao csao0;
        try {
            qil qil0 = this.b.d;
            baqr baqr0 = csar.a(this.b.e);
            qhz qhz0 = (qhz)this.c.N_build();
            if(qil.c == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)qhz.a));
                ibjh ibjh1 = new ibjh(((MessageLite)qia.a));
                qil.c = new gRPCMethodDescriptor(gRPCMethodType.a, "cloud.verticals.telco.subgraph.esim.EsimService/GetEsimActivationCode", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            qia qia0 = (qia)qil0.e.callUnaryWithAuth(qil.c, baqr0, qhz0, 10000L, TimeUnit.MILLISECONDS, qil0.f);
            ((ggtj)csar.a.h()).B("eSIM receiving subgraph response: %s", qia0.b);
            csao0 = new csao(qia0);
        }
        catch(iapl iapl0) {
            a.ae(csar.a.j(), "eSIM GetEsimActivationCode RPC failed.", iapl0);
            csao0 = new csan(((long)iapl0.a.t.r));
        }
        catch(acse acse0) {
            a.ae(csar.a.j(), "eSIM could not authenticate to GetEsimActivationCode.", acse0);
            csao0 = new csan(27060L);
        }
        long v = csap.a(csao0);
        cscn cscn0 = ((csci)this.a).a;
        cscn0.c.j(hhct.dY, v);
        if(!(csao0 instanceof csao)) {
            ((ggtj)cscn.a.j()).x("Failed to get activation code for eSIM");
            cscn0.ag.putLong("ESIM_RPC_STATUS_KEY", v);
            cscn0.z(hhct.ee);
            return;
        }
        qia qia1 = (qia)csap.b(csao0, qia.class);
        if(qia1 == null) {
            ((ggtj)cscn.a.j()).x("Failed to get activation code for eSIM");
            cscn0.z(hhct.dB);
            return;
        }
        new clht(Looper.getMainLooper()).post(new cscj(cscn0, qia1));
    }
}

