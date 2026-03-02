import android.content.Context;
import java.util.function.UnaryOperator;

public final class cevb implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        bbdv bbdv2;
        cdmr.a(((Context)object0));
        cdax cdax0 = hrnt.c();
        if(cdlr.c(((Context)object0))) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bbdv.a).v_newBuilder();
            bbed bbed0 = bbed.aV;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            bbdv bbdv0 = (bbdv)hftp0.b_message;
            bbdv0.b = bbed0.a();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((bbdv)hftv0).c = 2;
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
        ccvw ccvw0 = ccvx.c("GMS_CORE", 75);
        ccvw0.h(true);
        ccvw0.g(hrnt.c());
        ccvx ccvx0 = ccvw0.a();
        return new cevc(cdax0, cdlr.e(((Context)object0), cdef.ho, ccvx0, cdax0, bbdv2, new UnaryOperator[0]), ((Context)object0));
    }
}

