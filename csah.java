import android.os.Looper;
import j..util.Optional;
import java.util.concurrent.TimeUnit;

public final class csah implements Runnable {
    public final csaq a;
    public final csar b;
    public final ProtoLiteBuilder c;

    public csah(csar csar0, ProtoLiteBuilder hftp0, csaq csaq0) {
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
            qhy qhy0 = (qhy)this.c.N_build();
            if(qil.d == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)qhy.a));
                ibjh ibjh1 = new ibjh(((MessageLite)hfsw.a));
                qil.d = new gRPCMethodDescriptor(gRPCMethodType.a, "cloud.verticals.telco.subgraph.esim.EsimService/UpdateEsimStatus", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            hfsw hfsw0 = (hfsw)qil0.e.callUnaryWithAuth(qil.d, baqr0, qhy0, 10000L, TimeUnit.MILLISECONDS, qil0.f);
            ((ggtj)csar.a.h()).x("eSIM receiving updateEsimStatus response");
            csao0 = new csao(hfsw0);
        }
        catch(iapl iapl0) {
            a.ae(csar.a.j(), "eSIM UpdateEsimStatus RPC failed.", iapl0);
            csao0 = new csan(((long)iapl0.a.t.r));
        }
        catch(acse acse0) {
            a.ae(csar.a.j(), "eSIM could not authenticate to UpdateEsimStatus.", acse0);
            csao0 = new csan(27060L);
        }
        long v = csap.a(csao0);
        cslb cslb0 = (cslb)this.a;
        csld csld0 = cslb0.a;
        csld0.j(hhct.dZ, v);
        xob xob0 = cslb0.c;
        boolean z = cslb0.b;
        if(!(csao0 instanceof csao)) {
            ((ggtj)csld.a.j()).x("Failed to update status for eSIM");
            crxn crxn0 = crxn.c();
            String s = csld0.b;
            Optional optional0 = csld0.b("plan_segment_id");
            Optional optional1 = csld0.b("plan_subsegment_id");
            long v1 = csld0.d.getLong("esim_carrier_id");
            crxn0.p(hhct.ef, s, optional0, optional1, v1, v);
            if(cslb0.d > 0) {
                int v2 = cslb0.e;
                if(v2 < 2000) {
                    new clht(Looper.getMainLooper()).postDelayed(new csla(csld0, xob0, cslb0.f, v2, z), ((long)v2));
                    return;
                }
            }
            if(z) {
                csld0.m(xob0);
            }
        }
        else if(z) {
            csld0.m(xob0);
        }
    }
}

