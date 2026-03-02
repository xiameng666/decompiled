import j..util.Objects;

public final class ajri implements AutoCloseable {
    public final ajrc a;
    public final akbo b;

    public ajri(akbo akbo0) {
        this.a = new ajrc(akbo0.a);
        this.b = akbo0;
    }

    public final grds a(grdm grdm0) {
        grds grds0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghsx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ghsx)hftp0.b_message).c = 14;
        ((ghsx)hftp0.b_message).b |= 1;
        try {
            ProtoLiteBuilder hftp1 = this.b.g;
            ProtoLiteMessage hftv0 = hftp1.b_message;
            int v1 = ((ghth)hftv0).r + 1;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghth ghth0 = (ghth)hftp1.b_message;
            ghth0.b |= 0x80000;
            ghth0.r = v1;
            long v2 = hput.b();
            Objects.requireNonNull(this.a);
            ajrd ajrd0 = new ajrd(this.a);
            ajrg ajrg0 = new ajrg(v2, grdm0);
            grds0 = (grds)this.a.b(ajrd0, ajrg0);
            int v3 = iaph.a.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx0 = (ghsx)hftp0.b_message;
            ghsx0.b |= 2;
            ghsx0.d = v3;
        }
        catch(ajqz ajqz0) {
            int v4 = ajqz0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghsx ghsx1 = (ghsx)hftp0.b_message;
            ghsx1.b |= 2;
            ghsx1.d = v4;
            throw ajqz0;
        }
        finally {
            akdz.c(null, ((ghsx)hftp0.N_build()), this.b.e);
        }
        return grds0;
    }

    @Override
    public final void close() {
        this.a.d();
    }
}

