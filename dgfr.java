public class dgfr {
    public final byte[] a() {
        dcjn dcjn0;
        dbyv dbyv0 = dbyu.a(((ProtoLiteMessage)dcjh.a).v_newBuilder());
        dbyv0.c(dcjg.b);
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.e);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dcjo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(ibuq.m(this, dgfo.a)) {
            dcjn0 = dcjn.c;
        }
        else {
            if((this instanceof dgfp)) {
                dcjn0 = dcjn.b;
                goto label_14;
            }
            if(!ibuq.m(this, dgfq.a)) {
                throw new ibnq();
            }
            dcjn0 = dcjn.d;
        }
    label_14:
        ibuq.f(dcjn0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjo)hftp0.b_message).c = dcjn0.e;
        ((dcjo)hftp0.b_message).b |= 1;
        gzad gzad0 = gzad.b;
        ibuq.f(gzad0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjo)hftp0.b_message).d = gzad0.g;
        ((dcjo)hftp0.b_message).b |= 2;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((dcjo)hftv0), "value");
        ProtoLiteBuilder hftp1 = dcnr0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp1.b_message;
        ((dcjo)hftv0).getClass();
        dcjy0.g = (dcjo)hftv0;
        dcjy0.b |= 16;
        dbyv0.b(dcnr0.a());
        return dbyv0.a().toBytesArray();
    }
}

