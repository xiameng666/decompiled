import android.content.Context;
import j..util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aqus implements aqtz {
    public final gful_cronetEngineProvider a;
    public final aqvf b;
    public static final int c;
    private static final grns d;
    private static final baun e;
    private final gful_cronetEngineProvider f;
    private final gful_cronetEngineProvider g;
    private final aqrd h;
    private final long i;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grns.a).v_newBuilder();
        gqtz gqtz0 = gqtz.S;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grns grns0 = (grns)hftp0.b_message;
        grns0.c = gqtz0.a();
        grns0.b |= 1;
        aqus.d = (grns)hftp0.N_build();
        aqus.e = aqql.a("RestoreGrpcBackupApiClient");
    }

    public aqus(Context context0, aqrd aqrd0, long v, aquw aquw0) {
        aqvf aqvf0 = aqvf.b(context0, 4);
        Objects.requireNonNull(aquw0);
        aqup aqup0 = new aqup(aquw0);
        aquq aquq0 = new aquq(context0, aquw0);
        super();
        this.g = gfus.a(((gful_cronetEngineProvider)new aqur()));
        this.b = aqvf0;
        this.h = aqrd0;
        this.a = gfus.a(((gful_cronetEngineProvider)aqup0));
        this.f = gfus.a(((gful_cronetEngineProvider)aquq0));
        this.i = v;
    }

    @Override  // aqtz
    @Deprecated
    public final String a(aqvd aqvd0) {
        return ((aqvg)this.f.mr()).a(aqvd0).b;
    }

    @Override  // aqtz
    public final void b(String s, aqvd aqvd0) {
        this.f(s, grno.c, aqvd0.a);
        this.e(aqvd0);
    }

    @Override  // aqtz
    public final boolean c(String s, aqvd aqvd0) {
        this.f(s, grno.b, aqvd0.a);
        return this.g(s, aqvd0);
    }

    @Override  // aqtz
    public final void d(String s, aqvd aqvd0) {
        this.f(s, grno.b, aqvd0.a);
        try {
            int v = s.length();
            for(int v1 = 0; v1 < v; v1 += Character.charCount(v2)) {
                int v2 = s.codePointAt(v1);
                if(!Character.isWhitespace(v2)) {
                    this.g(s, aqvd0);
                    return;
                }
            }
            this.e(aqvd0);
        }
        catch(iapn unused_ex) {
        }
    }

    private final void e(aqvd aqvd0) {
        fpxz fpxz1;
        Long long0;
        try {
            long0 = this.b.a();
            fpyg fpyg0 = (fpyg)this.a.mr();
            if(((Boolean)this.g.mr()).booleanValue()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fpxz.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
                ByteString hfsf0 = aqvd0.a.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grkh grkh0 = (grkh)hftp1.b_message;
                hfsf0.getClass();
                grkh0.b |= 1;
                grkh0.c = hfsf0;
                grkh grkh1 = (grkh)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                grkh1.getClass();
                ((fpxz)hftv0).c = grkh1;
                ((fpxz)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fpxz fpxz0 = (fpxz)hftp0.b_message;
                fpxz0.b |= 2;
                fpxz0.d = 21;
                fpxz1 = (fpxz)hftp0.N_build();
            }
            else {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fpxz.a).v_newBuilder();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
                ByteString hfsf1 = aqvd0.a.c;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                grkh grkh2 = (grkh)hftp3.b_message;
                hfsf1.getClass();
                grkh2.b |= 1;
                grkh2.c = hfsf1;
                grkh grkh3 = (grkh)hftp3.N_build();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                fpxz fpxz2 = (fpxz)hftp2.b_message;
                grkh3.getClass();
                fpxz2.c = grkh3;
                fpxz2.b |= 1;
                fpxz1 = (fpxz)hftp2.N_build();
            }
            iakr iakr0 = fpyg0.a;
            gRPCMethodDescriptor iaoj0 = fpyh.a;
            if(iaoj0 == null) {
                synchronized(fpyh.class) {
                    gRPCMethodDescriptor iaoj1 = fpyh.a;
                    if(iaoj1 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.restore.backup.photos.apiservice.PhotosBackupApiService", "DisablePhotosBackup");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)fpxz.a));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)fpya.a));
                        iaoj1 = iaog0.build();
                        fpyh.a = iaoj1;
                    }
                    iaoj0 = iaoj1;
                }
            }
            ((glyq)ibjw.a(iakr0.a(iaoj0, fpyg0.b), fpxz1)).v(this.i, TimeUnit.SECONDS);
            this.b.g(5, aqvd0, null, long0);
        }
        catch(IllegalStateException | InterruptedException | ExecutionException | TimeoutException unused_ex) {
            this.b.f(5, aqvd0, 5, long0);
        }
    }

    private final void f(String s, grno grno0, grkh grkh0) {
        try {
            aqrd aqrd0 = this.h;
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
            evrg.o(aqrd0.a(s, ((grku)hftp0.N_build()), aqus.d, grkh0), hqhe.b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aqus.e.n("Unable to log consent on Photos API call", exception0, new Object[0]);
        }
    }

    private final boolean g(String s, aqvd aqvd0) {
        gRPCMethodDescriptor iaoj2;
        Long long0;
        try {
            long0 = this.b.a();
            fpyg fpyg0 = (fpyg)this.a.mr();
            fpyb fpyb0 = fpyb.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fpyb0).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grkh.a).v_newBuilder();
            ByteString hfsf0 = aqvd0.a.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grkh grkh0 = (grkh)hftp1.b_message;
            hfsf0.getClass();
            grkh0.b |= 1;
            grkh0.c = hfsf0;
            grkh grkh1 = (grkh)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fpyb fpyb1 = (fpyb)hftp0.b_message;
            grkh1.getClass();
            fpyb1.c = grkh1;
            fpyb1.b |= 1;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fpxw.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s.getClass();
            ((fpxw)hftv0).b |= 1;
            ((fpxw)hftv0).c = s;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            fpxw fpxw0 = (fpxw)hftp2.b_message;
            fpxw0.b |= 2;
            fpxw0.d = "";
            fpxw fpxw1 = (fpxw)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            fpxw1.getClass();
            ((fpyb)hftv1).d = fpxw1;
            ((fpyb)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((fpyb)hftv2).b |= 8;
            ((fpyb)hftv2).e = 21;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            fpyb fpyb2 = (fpyb)hftp0.b_message;
            fpyb2.b |= 16;
            fpyb2.f = false;
            fpyb fpyb3 = (fpyb)hftp0.N_build();
            iakr iakr0 = fpyg0.a;
            gRPCMethodDescriptor iaoj0 = fpyh.b;
            if(iaoj0 == null) {
                synchronized(fpyh.class) {
                    gRPCMethodDescriptor iaoj1 = fpyh.b;
                    if(iaoj1 == null) {
                        gRPCMethodDescriptorBuilder iaog0 = gRPCMethodDescriptor.newBuilder();
                        iaog0.methodType = gRPCMethodType.a;
                        iaog0.fullMethodName = gRPCMethodDescriptor.generateFullMethodName("com.google.android.libraries.restore.backup.photos.apiservice.PhotosBackupApiService", "EnablePhotosBackup");
                        iaog0.setSampledToLocalTracing();
                        iaog0.requestMarshaller = new ibjh(((MessageLite)fpyb0));
                        iaog0.responseMarshaller = new ibjh(((MessageLite)fpyc.a));
                        iaoj2 = iaog0.build();
                        fpyh.b = iaoj2;
                    }
                    else {
                        iaoj2 = iaoj1;
                    }
                    iaoj0 = iaoj2;
                }
            }
            fpyc fpyc0 = (fpyc)((glyq)ibjw.a(iakr0.a(iaoj0, fpyg0.b), fpyb3)).v(this.i, TimeUnit.SECONDS);
            this.b.g(4, aqvd0, Boolean.valueOf(true), long0);
            return true;
        }
        catch(IllegalStateException | InterruptedException | ExecutionException | TimeoutException unused_ex) {
            this.b.f(4, aqvd0, 5, long0);
            return false;
        }
    }
}

