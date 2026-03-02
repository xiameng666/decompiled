import android.app.PendingIntent;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class aquo implements aqtz {
    public static final int a;
    private static final baun b;
    private static final grns c;
    private final gmcg d;
    private final aqvf e;
    private final aqrd f;
    private final gful_cronetEngineProvider g;
    private final gful_cronetEngineProvider h;
    private final gful_cronetEngineProvider i;
    private final gful_cronetEngineProvider j;

    static {
        aquo.b = aqql.a("PhotosGrpcBackupApiClient");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.S;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns0 = (grns)hftp0.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        aquo.c = (grns)hftp0.N_build();
    }

    public aquo(Context context0, aqrd aqrd0) {
        aqvf aqvf0 = aqvf.b(context0, 3);
        aquk aquk0 = new aquk(context0);
        aqul aqul0 = new aqul(context0);
        super();
        this.d = new bblp(1, 9);
        this.i = gfus.a(((gful_cronetEngineProvider)new aqum()));
        this.j = gfus.a(((gful_cronetEngineProvider)new aqun()));
        this.e = aqvf0;
        this.f = aqrd0;
        this.g = gfus.a(((gful_cronetEngineProvider)aquk0));
        this.h = gfus.a(((gful_cronetEngineProvider)aqul0));
    }

    @Override  // aqtz
    @Deprecated
    public final String a(aqvd aqvd0) {
        return ((aqvg)this.h.mr()).a(aqvd0).b;
    }

    @Override  // aqtz
    public final void b(String s, aqvd aqvd0) {
        this.g(s, grno.c, aqvd0.a);
        this.f(aqvd0);
    }

    @Override  // aqtz
    public final boolean c(String s, aqvd aqvd0) {
        this.g(s, grno.b, aqvd0.a);
        return this.h(s, false, aqvd0);
    }

    @Override  // aqtz
    public final void d(String s, aqvd aqvd0) {
        this.g(s, grno.b, aqvd0.a);
        for(int v = 0; v < s.length(); v += Character.charCount(v1)) {
            int v1 = s.codePointAt(v);
            if(!Character.isWhitespace(v1)) {
                this.h(s, true, aqvd0);
                return;
            }
        }
        this.f(aqvd0);
    }

    public final PendingIntent e(aqvd aqvd0) {
        Long long0;
        try {
            long0 = this.e.a();
            AtomicReference atomicReference0 = new AtomicReference();
            fptx fptx0 = (fptx)fptm.a(((fptx)this.g.mr()), atomicReference0);
            fpto fpto0 = fpto.a;
            iakr iakr0 = fptx0.a;
            gRPCMethodDescriptor iaoj0 = fptz.e;
            if(iaoj0 == null) {
                synchronized(fptz.class) {
                    gRPCMethodDescriptor iaoj1 = fptz.e;
                    if(iaoj1 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.photos.backup.apiservice.grpc.proto.PhotosBackupGrpcService", "AttachBackupSettingsIntentToHeader");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)fpto0));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)fptp.a));
                        iaoj1 = iaog0.build();
                        fptz.e = iaoj1;
                    }
                    iaoj0 = iaoj1;
                }
            }
            gmcd gmcd0 = ibjw.a(iakr0.a(iaoj0, fptx0.b), fpto0);
            ibuq.f(fptj.a, "keys");
            PendingIntent pendingIntent0 = (PendingIntent)((glyq)glzd.g(gmcd0, new fptl(new fptk(atomicReference0, fptj.a)), this.d)).v(((Long)this.i.mr()).longValue(), TimeUnit.SECONDS);
            this.e.g(2, aqvd0, pendingIntent0, long0);
            return pendingIntent0;
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            this.e.f(2, aqvd0, 5, long0);
            return null;
        }
    }

    private final void f(aqvd aqvd0) {
        fptr fptr2;
        Long long0;
        try {
            long0 = this.e.a();
            fptx fptx0 = (fptx)this.g.mr();
            if(((Boolean)this.j.mr()).booleanValue()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fptr.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fptq.a).v_newBuilder();
                grnc grnc0 = grnc.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((fptq)hftv0).c = grnc0.h;
                ((fptq)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                fptq fptq0 = (fptq)hftp1.b_message;
                fptq0.b |= 2;
                fptq0.d = 21;
                fptq fptq1 = (fptq)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fptr fptr0 = (fptr)hftp0.b_message;
                fptq1.getClass();
                fptr0.c = fptq1;
                fptr0.b |= 1;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
                ByteString hfsf0 = aqvd0.a.c;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                grkh grkh0 = (grkh)hftp2.b_message;
                hfsf0.getClass();
                grkh0.b |= 1;
                grkh0.c = hfsf0;
                grkh grkh1 = (grkh)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fptr fptr1 = (fptr)hftp0.b_message;
                grkh1.getClass();
                fptr1.d = grkh1;
                fptr1.b |= 2;
                fptr2 = (fptr)hftp0.N_build();
            }
            else {
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fptr.a).v_newBuilder();
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)fptq.a).v_newBuilder();
                grnc grnc1 = grnc.c;
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((fptq)hftp4.b_message).c = grnc1.h;
                ((fptq)hftp4.b_message).b |= 1;
                fptq fptq2 = (fptq)hftp4.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fptr fptr3 = (fptr)hftp3.b_message;
                fptq2.getClass();
                fptr3.c = fptq2;
                fptr3.b |= 1;
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
                ByteString hfsf1 = aqvd0.a.c;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                grkh grkh2 = (grkh)hftp5.b_message;
                hfsf1.getClass();
                grkh2.b |= 1;
                grkh2.c = hfsf1;
                grkh grkh3 = (grkh)hftp5.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                fptr fptr4 = (fptr)hftp3.b_message;
                grkh3.getClass();
                fptr4.d = grkh3;
                fptr4.b |= 2;
                fptr2 = (fptr)hftp3.N_build();
            }
            iakr iakr0 = fptx0.a;
            gRPCMethodDescriptor iaoj0 = fptz.b;
            if(iaoj0 == null) {
                synchronized(fptz.class) {
                    gRPCMethodDescriptor iaoj1 = fptz.b;
                    if(iaoj1 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.photos.backup.apiservice.grpc.proto.PhotosBackupGrpcService", "DisableBackup");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)fptr.a));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)fpts.a));
                        iaoj1 = iaog0.build();
                        fptz.b = iaoj1;
                    }
                    iaoj0 = iaoj1;
                }
            }
            ((glyq)ibjw.a(iakr0.a(iaoj0, fptx0.b), fptr2)).v(((Long)this.i.mr()).longValue(), TimeUnit.SECONDS);
            this.e.g(5, aqvd0, null, long0);
        }
        catch(IllegalStateException | InterruptedException | ExecutionException | TimeoutException unused_ex) {
            this.e.f(5, aqvd0, 5, long0);
        }
    }

    private final void g(String s, grno grno0, grkh grkh0) {
        try {
            aqrd aqrd0 = this.f;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grku.a).v_newBuilder();
            gqub gqub0 = gqub.t;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grku)hftp0.b_message).c = gqub0.mk;
            ((grku)hftp0.b_message).b |= 1;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkv.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grjl.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((grnp)hftp3.b_message).c = grno0.d;
            ((grnp)hftp3.b_message).b |= 1;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grjl grjl0 = (grjl)hftp2.b_message;
            grnp grnp0 = (grnp)hftp3.N_build();
            grnp0.getClass();
            grjl0.i = grnp0;
            grjl0.b |= 0x100;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkv grkv0 = (grkv)hftp1.b_message;
            grjl grjl1 = (grjl)hftp2.N_build();
            grjl1.getClass();
            grkv0.h = grjl1;
            grkv0.b |= 8;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grku grku0 = (grku)hftp0.b_message;
            grkv grkv1 = (grkv)hftp1.N_build();
            grkv1.getClass();
            grku0.d = grkv1;
            grku0.b |= 2;
            evrg.o(aqrd0.a(s, ((grku)hftp0.N_build()), aquo.c, grkh0), hqhe.b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aquo.b.n("Unable to log consent on Photos API call", exception0, new Object[0]);
        }
    }

    private final boolean h(String s, boolean z, aqvd aqvd0) {
        Long long0;
        try {
            aqvf aqvf0 = this.e;
            long0 = aqvf0.a();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fptt.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fptq.a).v_newBuilder();
            grnc grnc0 = grnc.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((fptq)hftv0).c = grnc0.h;
            ((fptq)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            fptq fptq0 = (fptq)hftp1.b_message;
            fptq0.b |= 2;
            fptq0.d = 21;
            fptq fptq1 = (fptq)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fptt fptt0 = (fptt)hftp0.b_message;
            fptq1.getClass();
            fptt0.c = fptq1;
            fptt0.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
            ByteString hfsf0 = aqvd0.a.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grkh grkh0 = (grkh)hftp2.b_message;
            hfsf0.getClass();
            grkh0.b |= 1;
            grkh0.c = hfsf0;
            grkh grkh1 = (grkh)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            grkh1.getClass();
            ((fptt)hftv1).d = grkh1;
            ((fptt)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            s.getClass();
            ((fptt)hftv2).b |= 4;
            ((fptt)hftv2).e = s;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            fptt fptt1 = (fptt)hftp0.b_message;
            fptt1.b |= 8;
            fptt1.f = z;
            fptt fptt2 = (fptt)hftp0.N_build();
            fptu fptu0 = (fptu)((glyq)((fptx)this.g.mr()).a(fptt2)).v(((Long)this.i.mr()).longValue(), TimeUnit.SECONDS);
            aqvf0.g(4, aqvd0, Boolean.valueOf(true), long0);
            return true;
        }
        catch(IllegalStateException | InterruptedException | ExecutionException | TimeoutException unused_ex) {
            this.e.f(4, aqvd0, 5, long0);
            return false;
        }
    }
}

