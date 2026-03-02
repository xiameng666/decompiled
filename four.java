import java.io.File;

public final class four implements glzm {
    public final fous a;

    public four(fous fous0) {
        this.a = fous0;
    }

    @Override  // glzm
    public final gmcd a() {
        fous fous0 = this.a;
        gfsx gfsx0 = (gfsx)fous0.b.mr();
        boolean z = gfsx0.i();
        Object object0 = fous0.c.mr();
        if(z && ((gfsx)object0).i()) {
            fouq fouq0 = new fouq(((File)gfsx0.d()), ((String)((gfsx)object0).d()));
            int v = fouq0.a();
            fouq0.b().delete();
            fouq0.b = 0;
            fouq0.c = true;
            if(v >= ((fout)fous0.f.get()).c) {
                fotj fotj0 = fous0.e;
                fota fota0 = fotb.a();
                idcv idcv0 = (idcv)((ProtoLiteMessage)idcw.a).v_newBuilder();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)idcu.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((idcu)hftp0.b_message).c = 6;
                ((idcu)hftp0.b_message).b |= 1;
                if(!idcv0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)idcv0).ensureMutable();
                }
                idcw idcw0 = (idcw)idcv0.b_message;
                idcu idcu0 = (idcu)hftp0.N_build();
                idcu0.getClass();
                idcw0.z = idcu0;
                idcw0.b |= 0x1000000;
                fota0.f(((idcw)((ProtoLiteBuilder)idcv0).N_build()));
                return fotj0.b(fota0.a());
            }
            return gmbx.a;
        }
        return gmbx.a;
    }
}

