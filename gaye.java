import android.content.Context;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gaye implements gaym {
    public long a;
    public Long b;
    public String c;
    public boolean d;
    public ggdy e;
    private final Context f;
    private final ayud g;
    private final gayi h;
    private byte[] i;
    private final List j;
    private final boolean k;

    public gaye(Context context0, ayud ayud0, gayi gayi0, long v, Long long0, String s, boolean z) {
        this.f = context0;
        this.g = ayud0;
        this.h = gayi0;
        this.a = v;
        this.b = long0;
        this.c = s;
        this.d = z;
        this.i = new byte[0];
        gaxl.a();
        this.j = gaxm.v();
        gaxl.a();
        this.k = gaxm.v().contains(Integer.valueOf(-1));
        this.e = new ggdy();
    }

    @Override  // gaym
    public final gged_interceptors a() {
        this.i = new byte[0];
        gged_interceptors gged0 = this.e.h();
        ibuq.e(gged0, "build(...)");
        this.e = new ggdy();
        return gged0;
    }

    @Override  // gaym
    public final void b(List list0) {
        ibuq.f(list0, "events");
        this.e.k(list0);
    }

    @Override  // gaym
    public final void c(long v) {
        this.g.e(v, TimeUnit.MILLISECONDS);
    }

    @Override  // gaym
    public final void d(byte[] arr_b) {
        ibuq.f(arr_b, "clientLogToken");
        this.i = arr_b;
    }

    @Override  // gaym
    public final ayuc e(ProtoLiteBuilder hftp0) {
        ibuq.f(hftp0, "eventBuilder");
        this.i(hftp0);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return gayd.a(this.f, this.g, ((gkxt)hftv0), this.c);
    }

    @Override  // gaym
    public final void f(ProtoLiteBuilder hftp0) {
        ibuq.f(hftp0, "eventBuilder");
        gaxl.a();
        if(!hzks.a.c().f()) {
            this.h(hftp0);
            return;
        }
        if(this.b != null) {
            this.h(hftp0);
        }
    }

    @Override  // gayi
    public final void g(ProtoLiteBuilder hftp0) {
        ibuq.f(hftp0, "eventBuilder");
        this.i(hftp0);
        this.h.g(hftp0);
    }

    private final void h(ProtoLiteBuilder hftp0) {
        this.i(hftp0);
        if(this.d) {
            if(this.k) {
            label_8:
                ggdy ggdy0 = this.e;
                byte[] arr_b = this.i;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)heah.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((heah)hftv0).c = 794;
                ((heah)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                heah heah0 = (heah)hftp1.b_message;
                gkxt gkxt0 = (gkxt)hftp0.N_build();
                gkxt0.getClass();
                heah0.f = gkxt0;
                heah0.b |= 0x40;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                heah.c(((heah)hftp1.b_message));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                heah.b(((heah)hftp1.b_message));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                heah.d(((heah)hftp1.b_message));
                if(arr_b.length != 0) {
                    ByteString hfsf0 = ByteString.copyFrom(arr_b);
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    heah heah1 = (heah)hftp1.b_message;
                    heah1.b |= 4;
                    heah1.d = hfsf0;
                }
                ProtoLiteMessage hftv1 = hftp1.N_build();
                ibuq.e(hftv1, "build(...)");
                ggdy0.i(((heah)hftv1));
            }
            else {
                List list0 = this.j;
                gkwx gkwx0 = gkwx.b(((gkxt)hftp0.b_message).g);
                if(gkwx0 == null) {
                    gkwx0 = gkwx.a;
                }
                if(list0.contains(Integer.valueOf(gkwx0.G))) {
                    goto label_8;
                }
            }
        }
        gaxl.a();
        if(hzmn.a.b().f()) {
            this.h.g(hftp0);
            return;
        }
        this.e(hftp0).d();
    }

    private final void i(ProtoLiteBuilder hftp0) {
        if((((gkxt)hftp0.b_message).b & 0x80) == 0) {
            long v = SystemClock.elapsedRealtime();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gkxt gkxt0 = (gkxt)hftp0.b_message;
            gkxt0.b |= 0x80;
            gkxt0.n = v;
        }
        long v1 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkxt gkxt1 = (gkxt)hftp0.b_message;
        gkxt1.b |= 1;
        gkxt1.e = v1;
    }
}

