import android.util.Base64;
import java.util.function.Supplier;

public final class cqnk implements Supplier {
    public final cqnv a;

    public cqnk(cqnv cqnv0) {
        this.a = cqnv0;
    }

    @Override
    public final Object get() {
        cqnv cqnv0 = this.a;
        long v = bbmq.f(cqnv0.requireContext());
        cqqt.c("Deleting security question and answer remotely", new Object[0]);
        hluu hluu0 = hluu.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hluu0).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hluw.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hlut.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((hlut)hftp2.b_message).b = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hluw hluw0 = (hluw)hftp1.b_message;
        hlut hlut0 = (hlut)hftp2.N_build();
        hlut0.getClass();
        hluw0.c = hlut0;
        hluw0.b = 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hluw)hftp1.b_message).d = 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hluu hluu1 = (hluu)hftp0.b_message;
        hluw hluw1 = (hluw)hftp1.N_build();
        hluw1.getClass();
        hluu1.c = hluw1;
        hluu1.b |= 1;
        hluu hluu2 = (hluu)hftp0.N_build();
        if(hxvi.n()) {
            cqqt.c("deleteSecurityQuestionAndAnswer %s", new Object[]{Base64.encodeToString(hluu2.toBytesArray(), 2)});
        }
        hnos hnos0 = (hnos)cqnv0.aj.d.q(cmlp.a, cqnv0.aj.c.b);
        iakr iakr0 = hnos0.a;
        gRPCMethodDescriptor iaoj0 = hnot.g;
        if(iaoj0 == null) {
            synchronized(hnot.class) {
                iaoj0 = hnot.g;
                if(iaoj0 == null) {
                    gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                    iaog0.methodType = gRPCMethodType.a;
                    iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("google.internal.fmd.FmdApiService", "DeleteQuickLockChallenge");
                    iaog0.setSampledToLocalTracing();
                    iaog0.requestMarshaller = new ibjh(((MessageLite)hluu0));
                    iaog0.responseMarshaller = new ibjh(((MessageLite)hluv.a));
                    gRPCMethodDescriptor iaoj1 = iaog0.build();
                    hnot.g = iaoj1;
                    iaoj0 = iaoj1;
                }
            }
        }
        gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, hnos0.b), hluu2);
        cqic cqic0 = new cqic();
        return cqnv.K(glyi.g(gmcd0, Exception.class, cqic0, gmap.a));
    }
}

