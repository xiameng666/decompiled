import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.Map;

public final class dgeh implements dgff {
    public final Map a;

    public dgeh(Map map0) {
        ibuq.f(map0, "details");
        super();
        this.a = map0;
    }

    @Override  // dgfe
    public final byte[] a() {
        dcnr dcnr0 = dcnq.a(((ProtoLiteMessage)dcjy.a).v_newBuilder());
        dcnr0.d(dcjx.c);
        dbxg dbxg0 = dbxf.a(((ProtoLiteMessage)dciz.a).v_newBuilder());
        dbxg0.b(dciy.b);
        for(Object object0: this.a.entrySet()) {
            long v = ((Number)((Map.Entry)object0).getKey()).longValue();
            long v1 = ((Number)((Map.Entry)object0).getValue()).longValue();
            ProtoLiteBuilder hftp0 = dbxg0.a;
            Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((dciz)hftp0.b_message).d));
            ibuq.e(map0, "getAttachmentDetailsMap(...)");
            new hfxv(map0);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)dciu.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)dcjb.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            dcjb dcjb0 = (dcjb)hftp2.b_message;
            dcjb0.b |= 1;
            dcjb0.c = v1;
            ProtoLiteMessage hftv0 = hftp2.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((dcjb)hftv0), "value");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            dciu dciu0 = (dciu)hftp1.b_message;
            ((dcjb)hftv0).getClass();
            dciu0.d = (dcjb)hftv0;
            dciu0.b |= 2;
            ProtoLiteMessage hftv1 = hftp1.N_build();
            ibuq.e(hftv1, "build(...)");
            ibuq.f(((dciu)hftv1), "value");
            ((dciu)hftv1).getClass();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((dciz)hftp0.b_message).b().put(Long.valueOf(v), ((dciu)hftv1));
        }
        dcnr0.b(dbxg0.a());
        return dgfd.b(dcnr0.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dgeh) ? ibuq.m(this.a, ((dgeh)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Accept(details=" + this.a + ")";
    }
}

