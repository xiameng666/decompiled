import android.content.Context;
import j..util.function.UnaryOperator.-CC;
import java.util.function.UnaryOperator;

public final class chlb implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        bbdv bbdv2;
        cdmr.a(((Context)object0));
        cdax cdax0 = hros.G();
        ggdy ggdy0 = new ggdy();
        if(hrsz.d()) {
            ggdy0.i(cczk.i);
        }
        if(cdlr.c(((Context)object0))) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
            bbed bbed0 = bbed.aM;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv0 = (bbdv)hftp0.b_message;
            bbdv0.b = bbed0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((bbdv)hftv0).c = 3;
            bbdz bbdz0 = bbdz.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv1 = (bbdv)hftp0.b_message;
            bbdv1.d = bbdz0.a();
            bbdv2 = (bbdv)hftp0.N_build();
        }
        else {
            bbdv2 = null;
        }
        ccvw ccvw0 = ccvx.c("GMS_CORE", 24);
        ccvw0.g(hros.G());
        ccvx ccvx0 = ccvw0.a();
        return ggdy0.h().contains(cczk.i) ? new chlc(cdax0, cdlr.e(((Context)object0), cdef.gr, ccvx0, cdax0, bbdv2, new UnaryOperator[]{new cdmd()}), ((Context)object0)) : new chlc(cdax0, cdlr.e(((Context)object0), cdef.gr, ccvx0, cdax0, bbdv2, new UnaryOperator[]{UnaryOperator.-CC.identity()}), ((Context)object0));
    }
}

