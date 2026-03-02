import android.content.Context;
import android.location.Location;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

public final class fxec {
    public final Context a;
    public final fxeb b;
    public fxea c;
    private ExecutorService d;

    static {
        bboh.c("EQMon", bbcu.g, "GLS");
    }

    public fxec(Context context0) {
        fxeb fxeb0 = new fxeb(context0);
        super();
        this.a = context0;
        this.b = fxeb0;
    }

    static gwtr a(Location location0) {
        gwtr gwtr0;
        int v2;
        synchronized(fxec.class) {
            long v1 = location0.getTime();
            String s = location0.getProvider();
            if("gps".equals(s)) {
                v2 = 1;
            }
            else {
                v2 = "network".equals(s) ? 33 : 16;
            }
            gwtr0 = fvsb.c(location0, v2, v1);
        }
        return gwtr0;
    }

    public final void b(gwvi gwvi0) {
        synchronized(this) {
            ExecutorService executorService0 = this.d;
            if(executorService0 != null) {
                try {
                    executorService0.execute(new fxdx(this, gwvi0));
                }
                catch(RejectedExecutionException unused_ex) {
                }
            }
        }
    }

    public final void c() {
        synchronized(this) {
            if(this.d == null) {
                bblp bblp0 = new bblp(1, 10);
                this.d = bblp0;
                bblp0.execute(new fxdy(this));
            }
        }
    }

    public final void d() {
        synchronized(this) {
            ExecutorService executorService0 = this.d;
            if(executorService0 != null) {
                executorService0.execute(new fxdz(this));
                this.d.shutdown();
            }
        }
    }

    static gwvi e(gwsw gwsw0, gwuv gwuv0) {
        gwvh gwvh0 = (gwvh)((ProtoLiteMessage)gwvi.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwts.a).v_newBuilder();
        String s = fxel.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwts gwts0 = (gwts)hftp0.b_message;
        s.getClass();
        gwts0.b |= 2;
        gwts0.d = s;
        String s1 = Integer.toString(bbrc.f());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwts gwts1 = (gwts)hftp0.b_message;
        s1.getClass();
        gwts1.b |= 0x100;
        gwts1.g = s1;
        String s2 = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwts gwts2 = (gwts)hftp0.b_message;
        s2.getClass();
        gwts2.b |= 0x400;
        gwts2.h = s2;
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi0 = (gwvi)gwvh0.b_message;
        gwts gwts3 = (gwts)hftp0.N_build();
        gwts3.getClass();
        gwvi0.c = gwts3;
        gwvi0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwvj.a).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwvj)hftv0).b |= 1;
        ((gwvj)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gwvj)hftv1).b |= 8;
        ((gwvj)hftv1).f = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwvj gwvj0 = (gwvj)hftp1.b_message;
        gwvj0.b |= 4;
        gwvj0.e = 0;
        String s3 = UUID.randomUUID().toString();
        String s4 = huwd.t() ? "@debug." + s3 : "@" + s3;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwvj gwvj1 = (gwvj)hftp1.b_message;
        gwvj1.b |= 2;
        gwvj1.d = s4;
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi1 = (gwvi)gwvh0.b_message;
        gwvj gwvj2 = (gwvj)hftp1.N_build();
        gwvj2.getClass();
        gwvi1.g = gwvj2;
        gwvi1.b |= 4;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwto.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gwto gwto0 = (gwto)hftp2.b_message;
        gwto0.b |= 1;
        gwto0.c = "sglclt/com.google.android.apps.location.quake";
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi2 = (gwvi)gwvh0.b_message;
        gwto gwto1 = (gwto)hftp2.N_build();
        gwto1.getClass();
        gwvi2.b();
        gwvi2.d.add(gwto1);
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwtl.a).v_newBuilder();
        ByteString hfsf0 = gwsw0.getDefaultInstanceForType();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gwtl gwtl0 = (gwtl)hftp3.b_message;
        hfuo hfuo0 = gwtl0.g;
        if(!hfuo0.c()) {
            gwtl0.g = ProtoLiteMessage.E(hfuo0);
        }
        gwtl0.g.add(hfsf0);
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gwtl gwtl1 = (gwtl)hftp3.b_message;
        hfuf hfuf0 = gwtl1.f;
        if(!hfuf0.c()) {
            gwtl1.f = ProtoLiteMessage.C(hfuf0);
        }
        gwtl1.f.i(6);
        if(gwuv0 != null) {
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gwtl)hftp3.b_message).h = gwuv0;
            ((gwtl)hftp3.b_message).b |= 0x20;
        }
        if(!gwvh0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gwvh0).ensureMutable();
        }
        gwvi gwvi3 = (gwvi)gwvh0.b_message;
        gwtl gwtl2 = (gwtl)hftp3.N_build();
        gwtl2.getClass();
        gwvi3.c();
        gwvi3.f.add(gwtl2);
        return (gwvi)((ProtoLiteBuilder)gwvh0).N_build();
    }
}

