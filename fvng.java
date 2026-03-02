import android.os.SystemClock;
import j..util.DesugarCollections;
import java.util.List;

final class fvng extends fvnq {
    private final boolean a;
    private long b;
    private gwvh c;

    public fvng(fvlt fvlt0, fybc fybc0, boolean z) {
        super(fvlt0, fybc0, new fvob(false));
        this.b = -1L;
        this.a = z;
    }

    @Override  // fvnq
    protected final void a() {
        fvlt fvlt0 = this.h;
        if(fvlt0 != null) {
            gwvh gwvh0 = this.c;
            if(gwvh0 != null) {
                fvlt0.g(((gwvi)((ProtoLiteBuilder)gwvh0).N_build()));
            }
            fvlt0.i();
        }
    }

    @Override  // fvnq
    protected final boolean b(gwvh gwvh0, ProtoLiteBuilder hftp0) {
        long v = SystemClock.elapsedRealtime();
        if(this.b == -1L) {
            this.b = v;
        }
        fvlt fvlt0 = this.h;
        if(fvlt0 != null) {
            gwvj gwvj0 = (gwvj)hftp0.N_build();
            if(!gwvh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvh0).ensureMutable();
            }
            gwvi gwvi0 = (gwvi)gwvh0.b_message;
            gwvj0.getClass();
            gwvi0.g = gwvj0;
            gwvi0.b |= 4;
            fvlt0.h(((gwvj)hftp0.b_message).e, ((gwvi)((ProtoLiteBuilder)gwvh0).N_build()));
        }
        if(this.a && v - this.b <= 300000L) {
            gwvh gwvh1 = this.c;
            if(gwvh1 == null) {
                gwvi gwvi1 = (gwvi)((ProtoLiteBuilder)gwvh0).N_build();
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gwvi1).jf(5, null);
                hftp1.X(((ProtoLiteMessage)gwvi1));
                gwvj gwvj1 = (gwvj)hftp0.N_build();
                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gwvj1).jf(5, null);
                hftp2.X(((ProtoLiteMessage)gwvj1));
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gwvj gwvj2 = (gwvj)hftp2.b_message;
                gwvj2.b |= 4;
                gwvj2.e = 0;
                if(!((gwvh)hftp1).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)(((gwvh)hftp1))).ensureMutable();
                }
                gwvi gwvi2 = (gwvi)((gwvh)hftp1).b_message;
                gwvj gwvj3 = (gwvj)hftp2.N_build();
                gwvj3.getClass();
                gwvi2.g = gwvj3;
                gwvi2.b |= 4;
                this.c = (gwvh)hftp1;
                return true;
            }
            List list0 = DesugarCollections.unmodifiableList(((gwvi)gwvh0.b_message).f);
            if(!gwvh1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gwvh1).ensureMutable();
            }
            gwvi gwvi3 = (gwvi)gwvh1.b_message;
            gwvi3.c();
            hfrj.E(list0, gwvi3.f);
            return true;
        }
        this.c = null;
        return true;
    }
}

