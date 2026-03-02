import android.content.Context;
import java.util.function.UnaryOperator;

public final class cect implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        bbdv bbdv2;
        cdmr.a(((Context)object0));
        cdax cdax0 = hros.T();
        if(cdlr.c(((Context)object0))) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
            bbed bbed0 = bbed.aX;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv0 = (bbdv)hftp0.b_message;
            bbdv0.b = bbed0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((bbdv)hftv0).c = 1;
            bbdz bbdz0 = bbdz.d;
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
        ccvw ccvw0 = ccvx.c("STRICT_INTENTS_SANITIZATION_EVENT", 0);
        ccvw0.h(true);
        ccvw0.b = new cecu();
        ccvw0.g(hros.T());
        ccvx ccvx0 = ccvw0.a();
        return new cecv(cdax0, cdlr.e(((Context)object0), cdef.ie, ccvx0, cdax0, bbdv2, new UnaryOperator[0]), ((Context)object0));
    }
}

