import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class gasp implements View.OnClickListener {
    public final gass a;
    public final View b;

    public gasp(gass gass0, View view0) {
        this.a = gass0;
        this.b = view0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        gass gass0 = this.a;
        if(gass0.k == null) {
            gass0.k = gaxn.b(gass0.a.a.a.b).a();
        }
        gass0.k.a(fhvv.d(), this.b);
        if(gass0.b != null && (gass0.b.b & 0x20) != 0 && new hfuh((gass0.b.h == null ? heae.c : gass0.b.h).g, heae.b).contains(gltz.e)) {
            gbaf gbaf0 = gass0.a.a.m;
            if(gbaf0 != null) {
                int v = gass0.nn();
                long v1 = gass0.no();
                int v2 = gbaf0.a.a;
                gbaf0.a.a = v2 + 1;
                fbbm fbbm0 = fbbl.a(((ProtoLiteMessage)fbbj.a).v_newBuilder());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fbbk.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                gkzw gkzw0 = gkzv.a(((ProtoLiteMessage)gkyr.a).v_newBuilder());
                gkzw0.b(v2);
                gkyr gkyr0 = gkzw0.a();
                ibuq.f(gkyr0, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                gkyr0.getClass();
                ((fbbk)hftv0).c = gkyr0;
                ((fbbk)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((fbbk)hftv1).b |= 2;
                ((fbbk)hftv1).d = v;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fbbk fbbk0 = (fbbk)hftp0.b_message;
                fbbk0.b |= 4;
                fbbk0.e = v1;
                ProtoLiteMessage hftv2 = hftp0.N_build();
                ibuq.e(hftv2, "build(...)");
                ibuq.f(((fbbk)hftv2), "value");
                ProtoLiteBuilder hftp1 = fbbm0.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fbbj fbbj0 = (fbbj)hftp1.b_message;
                ((fbbk)hftv2).getClass();
                fbbj0.c = (fbbk)hftv2;
                fbbj0.b = 1;
                gbak gbak0 = new gbak(fbbm0.a(), new Bundle());
                Object object0 = gbaf0.c.a(gbak0);
                gaxl.a();
                gbaj gbaj0 = gaxm.y() ? gbaj.a : gbac.a;
                Throwable throwable0 = ibnw.a(object0);
                if(throwable0 != null) {
                    try {
                        object0 = gbaj0.a(throwable0);
                    }
                    catch(Throwable throwable1) {
                        object0 = ibnx.a(throwable1);
                    }
                }
                ibnx.b(object0);
            }
        }
    }
}

