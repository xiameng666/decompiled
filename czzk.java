import android.content.Context;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.webrtc.PeerConnection.IceServer;
import org.webrtc.PeerConnection.TlsCertPolicy;

public final class czzk {
    private final Context a;
    private czzl b;
    private final czyv c;
    private final String d;
    private czzq e;
    private final gybo f;

    public czzk(Context context0, czyv czyv0, String s, gybo gybo0) {
        czzl czzl0 = new czzl(context0);
        super();
        this.a = context0;
        this.b = czzl0;
        this.c = czyv0;
        this.d = s;
        this.f = gybo0;
    }

    public final void a() {
        this.b.a.shutdownChannelNow();
    }

    final boolean b() {
        synchronized(this) {
        }
        return this.e != null;
    }

    public final List c(String s, int v) {
        List list0;
        synchronized(this) {
            list0 = new ArrayList();
            try {
                czzo czzo0 = new czzo(this.b.e, cmlp.a, ckjs.b);
                baqr baqr0 = this.b.b;
                hnxl hnxl0 = czzk.h(this.c, this.f);
                String s1 = UUID.randomUUID().toString();
                cunf cunf0 = czkq.a;
                cunf0.b().i("GetICEServerRequest with messageId(%s), requestId(%s).", s1, hnxl0.c);
                hnvx hnvx0 = hnvx.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnvx0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                hnxl0.getClass();
                ((hnvx)hftv0).c = hnxl0;
                ((hnvx)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnvx)hftp0.b_message).d = "skylift_prod";
                hnvx hnvx1 = (hnvx)hftp0.N_build();
                if(czzo.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)hnvx0));
                    ibjh ibjh1 = new ibjh(((MessageLite)hnvy.a));
                    czzo.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.communications.instantmessaging.v1.PeerToPeer/GetICEServer", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                hnpv hnpv0 = ((hnvy)czzo0.c.callUnaryWithAuth(czzo.b, baqr0, hnvx1, ((long)czzo.a), TimeUnit.MILLISECONDS, czzo0.d)).b;
                if(hnpv0 == null) {
                    hnpv0 = hnpv.a;
                }
                for(Object object0: hnpv0.b) {
                    String s2 = ((hnpw)object0).c;
                    String s3 = ((hnpw)object0).d;
                    for(Object object1: ((hnpw)object0).b) {
                        List list1 = Collections.singletonList(((String)object1));
                        PeerConnection.TlsCertPolicy peerConnection$TlsCertPolicy0 = PeerConnection.TlsCertPolicy.a;
                        if(list1 == null || list1.isEmpty()) {
                            throw new IllegalArgumentException("urls == null || urls.isEmpty(): " + list1);
                        }
                        list0.add(new PeerConnection.IceServer(((String)list1.get(0)), list1, s2, s3, peerConnection$TlsCertPolicy0));
                    }
                }
                cunf0.b().h("Got %d ice servers from tachyon.", Integer.valueOf(list0.size()));
            }
            catch(acse | iapl exception0) {
                if(v == 3) {
                    czke.t(s, 8, gymb.m, ((exception0 instanceof acse) ? gymd.bs : gymd.bt), exception0.getMessage());
                }
                czkq.a.e().f(exception0).p("Failed to get ice servers from tachyon.", new Object[0]);
            }
        }
        return list0;
    }

    public final boolean d(String s, int v, czyv czyv0, byte[] arr_b) {
        synchronized(this) {
            int v2 = 4;
            try {
                czzn czzn0 = new czzn(this.b.c, cmlp.a, ckju.b);
                baqr baqr0 = this.b.b;
                String s1 = this.d;
                gybo gybo0 = this.f;
                hnxl hnxl0 = czzk.h(this.c, gybo0);
                String s2 = UUID.randomUUID().toString();
                cunf cunf0 = czkq.a;
                cunf0.b().i("SendMessageExpressRequest with messageId(%s), requestId(%s).", s2, hnxl0.c);
                hnwr hnwr0 = hnwr.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwr0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                hnxl0.getClass();
                ((hnwr)hftv0).c = hnxl0;
                ((hnwr)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnwr)hftp0.b_message).d = s1;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnwb.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s2.getClass();
                ((hnwb)hftv1).b = s2;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnwb)hftp1.b_message).c = 4;
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((hnwb)hftv2).d = hfsf0;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hnwb)hftp1.b_message).e = 2;
                hnwb hnwb0 = (hnwb)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnwr hnwr1 = (hnwr)hftp0.b_message;
                hnwb0.getClass();
                hnwr1.f = hnwb0;
                hnwr1.b |= 4;
                hnxb hnxb0 = czzk.g(czyv0, gybo0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hnwr hnwr2 = (hnwr)hftp0.b_message;
                hnxb0.getClass();
                hnwr2.e = hnxb0;
                hnwr2.b |= 2;
                hnwr hnwr3 = (hnwr)hftp0.N_build();
                if(czzn.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)hnwr0));
                    ibjh ibjh1 = new ibjh(((MessageLite)hnws.a));
                    czzn.b = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.communications.instantmessaging.v1.Messaging/SendMessageExpress", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                hnws hnws0 = (hnws)czzn0.c.callUnaryWithAuth(czzn.b, baqr0, hnwr3, ((long)czzn.a), TimeUnit.MILLISECONDS, czzn0.d);
                cunf0.b().p("Sent message to tachyon.", new Object[0]);
            }
            catch(acse | iapl exception0) {
                if(v == 3) {
                    v2 = 8;
                }
                gymb gymb0 = v == 3 ? gymb.m : gymt.f;
                czke.t(s, v2, gymb0, ((exception0 instanceof acse) ? gymd.bq : gymd.br), exception0.getMessage());
                return false;
            }
        }
        return true;
    }

    public final boolean e(String s, int v, czzm czzm0) {
        String s2;
        synchronized(this) {
            if(this.b()) {
                if(v == 3) {
                    czke.s(s, 8, gymb.k, gymd.bj);
                }
                return false;
            }
            gmcu gmcu0 = new gmcu();
            czzl czzl0 = this.b;
            czzq czzq0 = czzl0.d;
            this.e = czzq0;
            try {
                baqr baqr0 = czzl0.b;
                String s1 = this.d;
                hnxl hnxl0 = czzk.h(this.c, this.f);
                czkq.a.b().h("ReceiveMessagesExpressRequest with requestId(%s).", hnxl0.c);
                hnwe hnwe0 = hnwe.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnwe0).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                hnxl0.getClass();
                ((hnwe)hftv0).c = hnxl0;
                ((hnwe)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hnwe)hftp0.b_message).d = s1;
                hnwe hnwe1 = (hnwe)hftp0.N_build();
                czzj czzj0 = new czzj(this, gmcu0, czzm0, s, v);
                czzq czzq1 = new czzq(czzq0, cmlp.a, ckjt.b);
                if(czzq.b == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)hnwe0));
                    ibjh ibjh1 = new ibjh(((MessageLite)hnwl.a));
                    czzq.b = new gRPCMethodDescriptor(gRPCMethodType.c, "google.internal.communications.instantmessaging.v1.Messaging/ReceiveMessagesExpress", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                bbfe_BaseGrpcServer bbfe0 = czzq1.c;
                gRPCMethodDescriptor iaoj0 = czzq.b;
                iakq iakq0 = bbfe_BaseGrpcServer.applyDeadline(czzq1.d, ((long)czzq.a), TimeUnit.MILLISECONDS);
                bbfe0.ensureChannelInitialized();
                bbfb bbfb0 = new bbfb(bbfe0, czzj0, iaoj0);
                batl.t(bbfe0.grpcChannel, "grpc channel is null, cannot make grpc request");
                try {
                    s2 = ((AbstractServer)bbfe0).getAuthToken(baqr0);
                }
                catch(VolleyError volleyError0) {
                    throw new iapl(iapk.q.f("IOException when getting auth token").e(volleyError0));
                }
                String s3 = ((AbstractServer)bbfe0).getAppCert(baqr0);
                iaof_metadata iaof0 = bbfe0.buildMetadata(baqr0);
                iakr iakr0 = bbfn_channelFactory.c(bbfe0.context, bbfe0.grpcChannel, s2, s3, iaof0, bbfe0.enableRetry, bbfe_BaseGrpcServer.mergeInterceptors(bbfe0.interceptors));
                try {
                    ibjw.c(iakr0.a(iaoj0, bbfe0.configureCallOptions(iakq0)), hnwe1, bbfb0);
                }
                catch(RuntimeException runtimeException0) {
                    throw bbfe_BaseGrpcServer.wrapException(runtimeException0);
                }
            }
            catch(acse | iapl exception0) {
                if(v == 3) {
                    czke.t(s, 8, gymb.m, ((exception0 instanceof acse) ? gymd.bo : gymd.bp), exception0.getMessage());
                }
                czkq.a.e().f(exception0).p("Failed to receive messages from tachyon.", new Object[0]);
                return false;
            }
            try {
                gmcu0.v(hvog.a.bk().dm(), TimeUnit.MILLISECONDS);
                czkq.a.b().p("Receiving messages from tachyon.", new Object[0]);
                return true;
            }
            catch(InterruptedException interruptedException0) {
                if(v == 3) {
                    czke.s(s, 8, gymb.m, gymd.bl);
                }
                czkq.a.c().f(interruptedException0).p("Interrupted when starting to receive message from tachyon.", new Object[0]);
                Thread.currentThread().interrupt();
            }
            catch(ExecutionException executionException0) {
                if(v == 3) {
                    czke.s(s, 8, gymb.m, gymd.bm);
                }
                czkq.a.c().f(executionException0).p("Failed to receive message from tachyon.", new Object[0]);
            }
            catch(TimeoutException timeoutException0) {
                if(v == 3) {
                    czke.s(s, 8, gymb.m, gymd.bn);
                }
                czkq.a.c().f(timeoutException0).p("Timed out when receiving message from tachyon.", new Object[0]);
            }
        }
        return false;
    }

    public final void f() {
        synchronized(this) {
            if(!this.b()) {
                czkq.a.e().p("Skipping stop receiving messages. We are not currently receiving messages from tachyon.", new Object[0]);
                return;
            }
            czzq czzq0 = this.e;
            if(czzq0 != null) {
                czzq0.c.shutdownChannelNow();
                this.e = null;
            }
            this.b.a.shutdownChannel();
            this.b = new czzl(this.a);
            czkq.a.b().p("Stopped receiving messages from tachyon.", new Object[0]);
        }
    }

    private static hnxb g(czyv czyv0, gybo gybo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxb.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnxb)hftv0).e = "Nearby";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnxb)hftv1).c = 27;
        String s = czyv0.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxb hnxb0 = (hnxb)hftp0.b_message;
        s.getClass();
        hnxb0.d = s;
        if(gybo0 == null) {
            gybo0 = czmk.c(gxyg.a());
        }
        int v = gybo0.d;
        int v1 = 3;
        if(gybq.a(v) != 2) {
            switch(gybq.a(v)) {
                case 0: {
                    v1 = 2;
                    break;
                }
                case 3: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 2;
                }
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnxd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hnxd)hftv2).c = v1 - 2;
        String s1 = gybo0.c;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnxd hnxd0 = (hnxd)hftp1.b_message;
        s1.getClass();
        hnxd0.b = s1;
        hnxd hnxd1 = (hnxd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxb hnxb1 = (hnxb)hftp0.b_message;
        hnxd1.getClass();
        hnxb1.f = hnxd1;
        hnxb1.b |= 1;
        return (hnxb)hftp0.N_build();
    }

    private static hnxl h(czyv czyv0, gybo gybo0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnxl.a).v_newBuilder();
        String s = UUID.randomUUID().toString();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((hnxl)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnxl)hftp0.b_message).e = "Nearby";
        hnxb hnxb0 = czzk.g(czyv0, gybo0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxl hnxl0 = (hnxl)hftp0.b_message;
        hnxb0.getClass();
        hnxl0.h = hnxb0;
        hnxl0.b |= 2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnwz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((hnwz)hftv1).g = 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hnwz)hftv2).b = 1;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((hnwz)hftv3).c = 24;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((hnwz)hftv4).d = 0;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hnwz)hftp1.b_message).e = 4;
        hnwz hnwz0 = (hnwz)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnxl hnxl1 = (hnxl)hftp0.b_message;
        hnwz0.getClass();
        hnxl1.g = hnwz0;
        hnxl1.b |= 1;
        return (hnxl)hftp0.N_build();
    }
}

