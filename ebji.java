import com.google.android.gms.common.api.Status;

public final class ebji implements ibts {
    public final ebjl a;
    public final gtni b;

    public ebji(ebjl ebjl0, gtni gtni0) {
        this.a = ebjl0;
        this.b = gtni0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Status status0 = Status.b;
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        ibuq.d(((Boolean)object0), "null cannot be cast to non-null type kotlin.Boolean");
        ProtoLiteBuilder hftp0 = dyga0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ebjl ebjl0 = this.a;
        gtni gtni0 = this.b;
        dyfy dyfy0 = (dyfy)hftp0.b_message;
        dyfy0.b = 9;
        dyfy0.c = (Boolean)object0;
        byte[] arr_b = dyga0.a().toBytesArray();
        ebjl0.b.b(status0, arr_b);
        if(((Boolean)object0).booleanValue()) {
            ebwl ebwl0 = ebjl0.a();
            gged_interceptors gged0 = gged_interceptors.l(hale.c);
            ebwl0.h(gtni0, ebjl.f, gged0, 2);
            return ibom.a;
        }
        ebwl ebwl1 = ebjl0.a();
        gged_interceptors gged1 = gged_interceptors.l(hale.c);
        ebwl1.e(gtni0, ebjl.f, gged1, 0x20);
        return ibom.a;
    }
}

