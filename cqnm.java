import android.util.Base64;
import java.util.function.Supplier;

public final class cqnm implements Supplier {
    public final cqnv a;
    public final elhs b;

    public cqnm(cqnv cqnv0, elhs elhs0) {
        this.a = cqnv0;
        this.b = elhs0;
    }

    @Override
    public final Object get() {
        cqnv cqnv0 = this.a;
        long v = bbmq.f(cqnv0.requireContext());
        cqqt.c("Storing security question and answer remotely", new Object[0]);
        hlvc hlvc0 = hlvc.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlvc0).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hlvb.a).v_newBuilder();
        hlva hlva0 = (hlva)cqji.b.kt(this.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hlvb hlvb0 = (hlvb)hftp1.b_message;
        hlva0.getClass();
        hlvb0.c = hlva0;
        hlvb0.b = 1;
        hlvb hlvb1 = (hlvb)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlvc hlvc1 = (hlvc)hftp0.b_message;
        hlvb1.getClass();
        hlvc1.d = hlvb1;
        hlvc1.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hluw.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hlut.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hlut)hftp3.b_message).b = v;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hluw hluw0 = (hluw)hftp2.b_message;
        hlut hlut0 = (hlut)hftp3.N_build();
        hlut0.getClass();
        hluw0.c = hlut0;
        hluw0.b = 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hluw)hftp2.b_message).d = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hlvc hlvc2 = (hlvc)hftp0.b_message;
        hluw hluw1 = (hluw)hftp2.N_build();
        hluw1.getClass();
        hlvc2.c = hluw1;
        hlvc2.b |= 1;
        hlvc hlvc3 = (hlvc)hftp0.N_build();
        if(hxvi.n()) {
            cqqt.c("setSecurityQuestionAndAnswer %s", new Object[]{Base64.encodeToString(hlvc3.toBytesArray(), 2)});
        }
        hnos hnos0 = (hnos)cqnv0.aj.d.q(cmlp.a, cqnv0.aj.c.a);
        iakr iakr0 = hnos0.a;
        gRPCMethodDescriptor iaoj0 = hnot.f;
        if(iaoj0 == null) {
            synchronized(hnot.class) {
                iaoj0 = hnot.f;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.fmd.FmdApiService", "SetQuickLockChallenge");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hlvc0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hlvd.a));
                    iaoj0 = iaog0.build();
                    hnot.f = iaoj0;
                }
            }
        }
        gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, hnos0.b), hlvc3);
        cqie cqie0 = new cqie();
        return cqnv.K(glyi.g(gmcd0, Exception.class, cqie0, gmap.a));
    }
}

