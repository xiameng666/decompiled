import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public final class fkso {
    public final fkjj a;
    public final hhps b;
    public final String c;
    private gful_cronetEngineProvider d;

    public fkso(fkjj fkjj0, hhps hhps0, String s, gfsx gfsx0, gful_cronetEngineProvider gful0) {
        this.d = new fksf();
        this.a = fkjj0;
        this.b = hhps0;
        this.c = s;
        if(gfsx0.i()) {
            this.d = new fksg(gful0, gfsx0);
        }
    }

    public final gmcd a(Object object0, fkrn fkrn0, gmcd gmcd0) {
        gfsx gfsx0 = (gfsx)this.d.mr();
        hhps hhps0 = this.b;
        gftb.check(hhps0.a);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[hhps0.a.a(object0)]);
        ((gvex)hhps0.a).b(((String)object0), byteBuffer0);
        byteBuffer0.flip();
        if(gfsx0.i()) {
            fkml fkml0 = (fkml)gfsx0.d();
            fkml0.e = this.c;
            fkml fkml1 = (fkml)gfsx0.d();
            int v = fkrn0.d;
            ProtoLiteBuilder hftp0 = fkml1.f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glom glom0 = (glom)hftp0.b_message;
            if(v == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            glom0.e = v - 2;
            glom0.b |= 4;
            fkml fkml2 = (fkml)gfsx0.d();
            String s = hhps0.c;
            ProtoLiteBuilder hftp1 = fkml2.f;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glom glom1 = (glom)hftp1.b_message;
            s.getClass();
            glom1.b |= 1;
            glom1.c = s;
            ProtoLiteBuilder hftp2 = ((fkml)gfsx0.d()).f;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            glom glom2 = (glom)hftp2.b_message;
            glom2.b |= 0x20;
            glom2.h = 1L;
        }
        gmbt gmbt0 = gmbt.h(gmcd0);
        fksh fksh0 = new fksh(this);
        gmcd gmcd1 = glzd.g(glzd.g(glyi.g(gmbt0, Exception.class, fksh0, gmap.a), new fksi(this, gfsx0, byteBuffer0, fkrn0), gmap.a), new fksj(this, gfsx0), gmap.a);
        fksk fksk0 = new fksk(gfsx0);
        gmcd gmcd2 = glyi.g(gmcd1, fkrs.class, fksk0, gmap.a);
        fksl fksl0 = new fksl(gfsx0);
        gmcd gmcd3 = glyi.g(gmcd2, fkrt.class, fksl0, gmap.a);
        fksm fksm0 = new fksm(gfsx0);
        gmcd gmcd4 = glyi.g(gmcd3, fkru.class, fksm0, gmap.a);
        fksn fksn0 = new fksn(gfsx0);
        return glyi.g(gmcd4, hfur.class, fksn0, gmap.a);
    }

    public static final void b(gfsx gfsx0, int v) {
        if(gfsx0.i()) {
            fkml fkml0 = (fkml)gfsx0.d();
            ProtoLiteBuilder hftp0 = fkml0.f;
            long v1 = fkml0.a.a(TimeUnit.MILLISECONDS);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            glom glom0 = (glom)hftp0.b_message;
            glom0.b |= 16;
            glom0.g = v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((glom)hftp0.b_message).f = v - 2;
            ((glom)hftp0.b_message).b |= 8;
            glom glom1 = (glom)hftp0.N_build();
            fkml0.b.a(glom1, fkml0.c, fkml0.d, fkml0.e);
        }
    }
}

