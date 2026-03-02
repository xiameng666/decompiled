import android.content.Context;
import android.os.Binder;
import java.util.Random;

public final class aiju {
    protected final Context a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public int f;
    private Long g;
    private final int h;

    public aiju(Context context0) {
        this.a = context0;
        this.h = 1;
        this.d = 1;
        this.e = 1;
    }

    public final void a() {
        Random random0 = new Random();
        Context context0 = this.a;
        long v = bbmq.d(context0);
        if(v == 0L) {
            Long long0 = this.g;
            if(long0 != null) {
                random0.setSeed(long0.longValue());
            }
        }
        else {
            random0.setSeed(v);
        }
        if((random0.nextDouble() >= hpra.a.b().b())) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghpi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghpi)hftv0).c = 0;
        ((ghpi)hftv0).b |= 1;
        int v1 = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        if(v1 == 0) {
            throw null;
        }
        ((ghpi)hftv1).d = v1 - 1;
        ((ghpi)hftv1).b |= 2;
        boolean z = this.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((ghpi)hftv2).b |= 4;
        ((ghpi)hftv2).e = z;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((ghpi)hftv3).b |= 8;
        ((ghpi)hftv3).f = 0L;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((ghpi)hftv4).b |= 16;
        ((ghpi)hftv4).g = false;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((ghpi)hftv5).b |= 0x20;
        ((ghpi)hftv5).h = false;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp0.b_message;
        ((ghpi)hftv6).b |= 0x40;
        ((ghpi)hftv6).i = false;
        long v2 = this.c;
        if(!hftv6.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghpi ghpi0 = (ghpi)hftp0.b_message;
        ghpi0.b |= 0x80;
        ghpi0.j = v2;
        Long long1 = this.g;
        if(long1 != null) {
            long v3 = (long)long1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghpi ghpi1 = (ghpi)hftp0.b_message;
            ghpi1.b |= 0x200;
            ghpi1.k = v3;
        }
        int v4 = this.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp0.b_message;
        if(v4 == 0) {
            throw null;
        }
        ((ghpi)hftv7).l = v4 - 1;
        ((ghpi)hftv7).b |= 0x400;
        int v5 = this.f;
        if(v5 != 0) {
            if(!hftv7.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((ghpi)hftp0.b_message).m = v5 - 1;
            ((ghpi)hftp0.b_message).b |= 0x800;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghon.a).v_newBuilder();
        ghom ghom0 = ghom.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp1.b_message;
        ((ghon)hftv8).e = ghom0.av;
        ((ghon)hftv8).b |= 1;
        if(!hftv8.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghon ghon0 = (ghon)hftp1.b_message;
        ghpi ghpi2 = (ghpi)hftp0.N_build();
        ghpi2.getClass();
        ghon0.h = ghpi2;
        ghon0.b |= 8;
        ghon ghon1 = (ghon)hftp1.N_build();
        long v6 = Binder.clearCallingIdentity();
        try {
            if(hprg.d()) {
                cdwr.v().j(((ProtoLiteMessage)ghon1));
            }
            else {
                new aytt(context0, "ANDROID_AUTH").a().i(((MessageLite)ghon1)).d();
            }
        }
        finally {
            Binder.restoreCallingIdentity(v6);
        }
    }

    public final void b(byte[] arr_b) {
        long v;
        if(arr_b.length == 0) {
            v = 0L;
        }
        else {
            v = (long)(arr_b[0] & 0xFF);
            for(int v1 = 1; v1 < Math.min(arr_b.length, 8); ++v1) {
                v |= (((long)arr_b[v1]) & 0xFFL) << v1 * 8;
            }
        }
        this.g = v;
    }
}

