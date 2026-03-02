import android.content.Intent;
import com.google.android.chimera.BoundService;

final class gbjo extends ibsl implements ibtx {
    int a;
    Object b;
    final gbjp c;
    private Object d;

    public gbjo(gbjp gbjp0, ibrl ibrl0) {
        this.c = gbjp0;
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        gbjo gbjo0 = new gbjo(this.c, ((ibrl)object2));
        gbjo0.d = (icih)object0;
        gbjo0.b = (ibpv)object1;
        return gbjo0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibns ibns0;
        Boolean boolean0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Object object2 = this.d;
            int v1 = ((ibpv)this.b).a;
            gbjt gbjt0 = (gbjt)((ibpv)this.b).b;
            if(!(gbjt0 instanceof gbjq)) {
                goto label_12;
            }
            this.d = null;
            this.a = 1;
            if(((icih)object2).a(((gbjq)gbjt0).a, this) == object1) {
                return object1;
            label_12:
                if(!(gbjt0 instanceof gbjr)) {
                    if(!(gbjt0 instanceof gbjs)) {
                        throw new ibnq();
                    }
                    if(v1 != 0) {
                        gavr.e("BE_IPRCMI_01", this.c.a, null, "Connection failed!", null, 20);
                        throw new ibnm();
                    }
                    gbju gbju0 = this.c.b;
                    if(((gbjv)gbju0).g.h(gbjs.a, gbjr.a)) {
                        try {
                            gaym gaym0 = ((gbjv)gbju0).e;
                            ibts ibts0 = gavs.a;
                            try {
                                Intent intent0 = BoundService.getStartIntent(((gbjj)gbju0).a, "com.google.android.gms.wallet.service.PdfRendererBoundService.START");
                                gavr.d(intent0, "BE_GCIPDRSC_01", ((gbjj)gbju0).b, null, "failed to build intent for service com.google.android.gms.wallet.service.PdfRendererBoundService.START", 8);
                                boolean0 = Boolean.valueOf(((gbjj)gbju0).c.e(((gbjj)gbju0).a, "wallet_ui", intent0, ((gbjj)gbju0).d, 0x1081));
                            }
                            catch(Throwable throwable0) {
                                if(!(throwable0 instanceof gavn)) {
                                    if(!(throwable0 instanceof gavu)) {
                                        if((throwable0 instanceof gavs)) {
                                            throw throwable0;
                                        }
                                        gayy.i(gaym0, "BE_IPRSCB_01", gavs.b, ibts0);
                                        throw new gavs("BE_IPRSCB_01", throwable0);
                                    }
                                    ((gavu)throwable0).a(gaym0);
                                    throw ((gavu)throwable0).a;
                                }
                                ((gavn)throwable0).a(gaym0);
                                throw new gavs("BE_IPRSCB_01", throwable0);
                            }
                            ibns0 = new ibns(boolean0, null);
                        }
                        catch(gavs gavs0) {
                            ibns0 = new ibns(Boolean.valueOf(false), gavs0);
                        }
                        boolean z = ((Boolean)ibns0.a).booleanValue();
                        gavs gavs1 = (gavs)ibns0.b;
                        if(!z) {
                            ((gbjv)gbju0).g.h(gbjr.a, gbjs.a);
                        }
                        if(gavs1 != null) {
                            throw gavs1;
                        }
                        gavr.c(z, "BE_IPRSCB_02", ((gbjv)gbju0).e, "Connection failed to initiate");
                        return Boolean.valueOf(true);
                    }
                }
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }
}

