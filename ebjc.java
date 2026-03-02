import com.google.android.gms.common.api.Status;

public final class ebjc implements ibts {
    public final ebjf a;

    public ebjc(ebjf ebjf0) {
        this.a = ebjf0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyex.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.c(((dyim)object0));
        ibuq.f(((dyim)object0), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dyex dyex0 = (dyex)hftp0.b_message;
        ((dyim)object0).getClass();
        dyex0.c = (dyim)object0;
        dyex0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dyex)hftv0), "value");
        ProtoLiteBuilder hftp1 = dyga0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dyfy dyfy0 = (dyfy)hftp1.b_message;
        ((dyex)hftv0).getClass();
        dyfy0.c = (dyex)hftv0;
        dyfy0.b = 12;
        byte[] arr_b = dyga0.a().toBytesArray();
        this.a.b.b(Status.b, arr_b);
        return ibom.a;
    }
}

