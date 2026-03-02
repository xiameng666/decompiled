import android.content.Context;

public final class fxdx implements Runnable {
    public final fxec a;
    public final gwvi b;

    public fxdx(fxec fxec0, gwvi gwvi0) {
        this.a = fxec0;
        this.b = gwvi0;
    }

    @Override
    public final void run() {
        fwxq fwxq0;
        fxea fxea0 = this.a.c;
        if(fxea0 != null) {
            Context context0 = fxea0.a.a;
            ByteString hfsf0 = this.b.getDefaultInstanceForType();
            fxbl fxbl0 = new fxbl(context0);
            synchronized(fxed.class) {
                if(fxed.a == null) {
                    fxed.a = new fwxq(context0, fxbl0);
                }
                fwxq0 = fxed.a;
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfrn.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfrn)hftv0).b = "type.googleapis.com/lbs.GLocRequest";
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hfrn)hftp0.b_message).c = hfsf0;
            hfrn hfrn0 = (hfrn)hftp0.N_build();
            gxmo gxmo0 = (gxmo)((ProtoLiteMessage)gxmp.a).v_newBuilder();
            if(!gxmo0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxmo0).ensureMutable();
            }
            gxmp gxmp0 = (gxmp)gxmo0.b_message;
            hfrn0.getClass();
            gxmp0.c = hfrn0;
            gxmp0.b |= 1;
            gxmo0.a("gls-indoor-upload");
            gxmp gxmp1 = (gxmp)((ProtoLiteBuilder)gxmo0).N_build();
            try {
                fwxq0.a(gxmp1, 3, "collectionlib", hebp.d);
            }
            catch(iapl unused_ex) {
            }
            synchronized(fxed.class) {
                if(fxed.a != null) {
                    fxed.a = null;
                }
            }
        }
    }
}

