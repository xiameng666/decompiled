import java.util.concurrent.TimeUnit;

public final class crzw implements Runnable {
    public final qhv a;
    public final csaq b;
    public final csar c;

    public crzw(csar csar0, qhv qhv0, csaq csaq0) {
        this.c = csar0;
        this.a = qhv0;
        this.b = csaq0;
    }

    @Override
    public final void run() {
        csao csao0;
        try {
            qhv qhv0 = this.a;
            qil qil0 = this.c.d;
            baqr baqr0 = csar.a(this.c.e);
            if(qil.b == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)qhv.a));
                ibjh ibjh1 = new ibjh(((MessageLite)qhw.a));
                qil.b = new gRPCMethodDescriptor(gRPCMethodType.a, "cloud.verticals.telco.subgraph.esim.EsimService/CreateEsimActivationCode", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            qhw qhw0 = (qhw)qil0.e.callUnaryWithAuth(qil.b, baqr0, qhv0, 10000L, TimeUnit.MILLISECONDS, qil0.f);
            ((ggtj)csar.a.h()).x("eSIM receiving createEsimActivationCode response");
            csao0 = new csao(qhw0);
        }
        catch(iapl iapl0) {
            a.ae(csar.a.j(), "eSIM CreateEsimActivationCode RPC failed.", iapl0);
            csao0 = new csan(((long)iapl0.a.t.r));
        }
        catch(acse acse0) {
            a.ae(csar.a.j(), "eSIM could not authenticate to CreateEsimActivationCode.", acse0);
            csao0 = new csan(27060L);
        }
        long v = csap.a(csao0);
        cscn cscn0 = ((csch)this.b).a;
        cscn0.c.j(hhct.dX, v);
        if(!(csao0 instanceof csao)) {
            ((ggtj)cscn.a.j()).x("Failed to request activation code for eSIM");
            cscn0.ag.putLong("ESIM_RPC_STATUS_KEY", v);
            cscn0.z(hhct.ed);
            return;
        }
        ((ggtj)cscn.a.h()).x("Requested activation code for eSIM");
    }
}

