import android.os.Looper;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class aauf {
    public final gged_interceptors a;
    public final clht b;
    public final List c;
    private final cczf d;
    private final aavk e;
    private final gged_interceptors f;
    private final String g;
    private final aauo h;

    public aauf(aatb aatb0, cczf cczf0, aavk aavk0, aauo aauo0, gged_interceptors gged0, gged_interceptors gged1) {
        this.b = new clht(Looper.getMainLooper());
        this.c = DesugarCollections.synchronizedList(new ArrayList());
        this.g = aatb0 == null ? null : aatb0.b;
        this.d = cczf0;
        this.e = aavk0;
        this.h = aauo0;
        this.a = gged0;
        this.f = gged1;
    }

    public final gqvx a() {
        grvk grvk0 = this.h.b();
        grvm grvm0 = this.e.a();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqvz.a).v_newBuilder();
        for(Object object0: grvk0.d) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqwk.a).v_newBuilder();
            int v = ((grzx)object0).c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqwk gqwk0 = (gqwk)hftp1.b_message;
            gqwk0.b |= 1;
            gqwk0.c = v;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqvz gqvz0 = (gqvz)hftp0.b_message;
            gqwk gqwk1 = (gqwk)hftp1.N_build();
            gqwk1.getClass();
            hfuo hfuo0 = gqvz0.c;
            if(!hfuo0.c()) {
                gqvz0.c = ProtoLiteMessage.E(hfuo0);
            }
            gqvz0.c.add(gqwk1);
        }
        for(Object object1: grvk0.c) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwl.a).v_newBuilder();
            int v1 = ((grzy)object1).c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gqwl gqwl0 = (gqwl)hftp2.b_message;
            gqwl0.b |= 1;
            gqwl0.c = v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqvz gqvz1 = (gqvz)hftp0.b_message;
            gqwl gqwl1 = (gqwl)hftp2.N_build();
            gqwl1.getClass();
            hfuo hfuo1 = gqvz1.b;
            if(!hfuo1.c()) {
                gqvz1.b = ProtoLiteMessage.E(hfuo1);
            }
            gqvz1.b.add(gqwl1);
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwa.a).v_newBuilder();
        String s = grvm0.c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s.getClass();
        ((gqwa)hftv0).b |= 1;
        ((gqwa)hftv0).c = s;
        if((grvm0.b & 0x40) != 0) {
            String s1 = grvm0.h;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            gqwa gqwa0 = (gqwa)hftp3.b_message;
            s1.getClass();
            gqwa0.b |= 4;
            gqwa0.e = s1;
        }
        if((grvm0.b & 0x20) != 0) {
            String s2 = grvm0.g;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gqwa gqwa1 = (gqwa)hftp3.b_message;
            s2.getClass();
            gqwa1.b |= 2;
            gqwa1.d = s2;
        }
        if((grvm0.b & 4) != 0) {
            String s3 = grvm0.e;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gqwa gqwa2 = (gqwa)hftp3.b_message;
            s3.getClass();
            gqwa2.b |= 0x40;
            gqwa2.f = s3;
        }
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqvx.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqvx gqvx0 = (gqvx)hftp4.b_message;
        gqvz gqvz2 = (gqvz)hftp0.N_build();
        gqvz2.getClass();
        gqvx0.c = gqvz2;
        gqvx0.b |= 1;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqvx gqvx1 = (gqvx)hftp4.b_message;
        gqwa gqwa3 = (gqwa)hftp3.N_build();
        gqwa3.getClass();
        gqvx1.d = gqwa3;
        gqvx1.b |= 2;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqvx gqvx2 = (gqvx)hftp4.b_message;
        gqvx2.b |= 4;
        gqvx2.e = false;
        return (gqvx)hftp4.N_build();
    }

    public final void b() {
        List list0 = this.c;
        if(!list0.isEmpty()) {
            for(Object object0: list0) {
                this.b.removeCallbacks(((Runnable)object0));
            }
            list0.clear();
        }
    }

    public final void c(gqxt gqxt0) {
        cczf cczf0 = this.d;
        if(!(cczf0 instanceof cdpk)) {
            throw new UnsupportedOperationException("This event can only be logged when using de-identified loggers.");
        }
        cczf0.f(gqxt0);
    }

    public final void d(int v, gqsm gqsm0, String s) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.fI;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqxs0.b |= 16;
        gqxs0.g = v;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        gqvx gqvx0 = this.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs1.i = gqvx0;
        gqxs1.b |= 0x80;
        if(s != null) {
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs gqxs2 = (gqxs)hftr0.b_message;
            gqxs2.b |= 8;
            gqxs2.f = s;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs3 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs3.getClass();
        gqxt0.c = gqxs3;
        gqxt0.b |= 1;
        this.e(v, ((gqxt)hftp0.N_build()));
    }

    public final void e(int v, gqxt gqxt0) {
        if(!this.f.contains(Integer.valueOf(v))) {
            cczf cczf0 = this.d;
            if((cczf0 instanceof cdpo)) {
                cczf0.i(gqxt0, this.g);
                return;
            }
            if((cczf0 instanceof cdpk)) {
                cczf0.f(gqxt0);
            }
        }
    }

    public final void f(grxw grxw0, grxw grxw1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxv.a).v_newBuilder();
        int v = grxw0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gqxv)hftv0).b |= 1;
        ((gqxv)hftv0).c = v;
        int v1 = grxw1.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxv gqxv0 = (gqxv)hftp0.b_message;
        gqxv0.b |= 2;
        gqxv0.d = v1;
        int v2 = aauf.m();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqxv)hftp0.b_message).g = v2 - 1;
        ((gqxv)hftp0.b_message).b |= 0x400;
        int v3 = grxw1.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((gqwq)hftv1).c = 3;
        ((gqwq)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp3.b_message;
        gqxv gqxv1 = (gqxv)hftp0.N_build();
        gqxv1.getClass();
        gqwq0.e = gqxv1;
        gqwq0.b |= 4;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp2.b_message;
        gqwq gqwq1 = (gqwq)hftp3.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp1.b_message;
        gqwt gqwt1 = (gqwt)hftp2.N_build();
        gqwt1.getClass();
        gqxt0.e = gqwt1;
        gqxt0.b |= 8;
        this.e(v3, ((gqxt)hftp1.N_build()));
    }

    public final void g(int v, int v1, int v2, int v3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gqwq)hftp2.b_message).c = 3;
        ((gqwq)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqxv.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((gqxv)hftv0).b |= 1;
        ((gqxv)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((gqxv)hftv1).b |= 2;
        ((gqxv)hftv1).d = v1;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp3.b_message;
        ((gqxv)hftv2).b |= 4;
        ((gqxv)hftv2).e = v2;
        if(!hftv2.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqxv gqxv0 = (gqxv)hftp3.b_message;
        gqxv0.b |= 8;
        gqxv0.f = v3;
        int v4 = aauf.m();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gqxv)hftp3.b_message).g = v4 - 1;
        ((gqxv)hftp3.b_message).b |= 0x400;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp2.b_message;
        gqxv gqxv1 = (gqxv)hftp3.N_build();
        gqxv1.getClass();
        gqwq0.e = gqxv1;
        gqwq0.b |= 4;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp1.b_message;
        gqwq gqwq1 = (gqwq)hftp2.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqwt gqwt1 = (gqwt)hftp1.N_build();
        gqwt1.getClass();
        gqxt0.e = gqwt1;
        gqxt0.b |= 8;
        this.e(v1, ((gqxt)hftp0.N_build()));
    }

    public static final gqwf h(String s, long v, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwf.a).v_newBuilder();
        String[] arr_s = s.split("\\.");
        String s2 = arr_s[arr_s.length - 1];
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s2.getClass();
        ((gqwf)hftv0).b |= 1;
        ((gqwf)hftv0).c = s2;
        String s3 = arr_s[arr_s.length - 2];
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqwf gqwf0 = (gqwf)hftp0.b_message;
        s3.getClass();
        gqwf0.b |= 2;
        gqwf0.d = s3;
        String s4 = hojn.l();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gqwf)hftv1).b |= 4;
        ((gqwf)hftv1).e = s4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gqwf)hftv2).b |= 8;
        ((gqwf)hftv2).f = (int)v;
        if(s1 != null) {
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqwf gqwf1 = (gqwf)hftp0.b_message;
            gqwf1.b |= 16;
            gqwf1.g = s1;
        }
        return (gqwf)hftp0.N_build();
    }

    public final void i(gqsm gqsm0) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.fI;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        gqvx gqvx0 = this.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs0.i = gqvx0;
        gqxs0.b |= 0x80;
        if(!bbqr.d(null)) {
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs gqxs1 = (gqxs)hftr0.b_message;
            throw null;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs2.getClass();
        gqxt0.c = gqxs2;
        gqxt0.b |= 1;
        this.c(((gqxt)hftp0.N_build()));
    }

    public final void j(grxw grxw0, grxw grxw1, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gqwn)hftv0).c = v - 1;
        ((gqwn)hftv0).b |= 1;
        int v1 = grxw0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gqwn)hftv1).b |= 2;
        ((gqwn)hftv1).d = v1;
        int v2 = grxw1.c;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqwn gqwn0 = (gqwn)hftp0.b_message;
        gqwn0.b |= 4;
        gqwn0.e = v2;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxk.a).v_newBuilder();
        int v3 = grxw0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gqxk)hftv2).b |= 1;
        ((gqxk)hftv2).c = v3;
        int v4 = grxw1.c;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqxk gqxk0 = (gqxk)hftp1.b_message;
        gqxk0.b |= 2;
        gqxk0.d = v4;
        int v5 = grxw0.c;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqvy gqvy0 = (gqvy)hftp3.b_message;
        gqwn gqwn1 = (gqwn)hftp0.N_build();
        gqwn1.getClass();
        gqvy0.f = gqwn1;
        gqvy0.b |= 8;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvy gqvy1 = (gqvy)hftp3.N_build();
        gqvy1.getClass();
        gqxs0.k = gqvy1;
        gqxs0.b |= 0x1000;
        gqvx gqvx0 = this.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs1.i = gqvx0;
        gqxs1.b |= 0x80;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp2.b_message;
        gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs2.getClass();
        gqxt0.c = gqxs2;
        gqxt0.b |= 1;
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp5.b_message;
        ((gqwq)hftv3).c = 3;
        ((gqwq)hftv3).b |= 1;
        if(!hftv3.isImmutable()) {
            hftp5.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp5.b_message;
        gqxk gqxk1 = (gqxk)hftp1.N_build();
        gqxk1.getClass();
        gqwq0.d = gqxk1;
        gqwq0.b |= 2;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp4.b_message;
        gqwq gqwq1 = (gqwq)hftp5.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqxt gqxt1 = (gqxt)hftp2.b_message;
        gqwt gqwt1 = (gqwt)hftp4.N_build();
        gqwt1.getClass();
        gqxt1.e = gqwt1;
        gqxt1.b |= 8;
        this.e(v5, ((gqxt)hftp2.N_build()));
    }

    public final void k(int v, int v1, int v2, int v3, int v4) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gqwn)hftv0).c = v4 - 1;
        ((gqwn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gqwn)hftv1).b |= 2;
        ((gqwn)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gqwn)hftv2).b |= 4;
        ((gqwn)hftv2).e = v1;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gqwn)hftv3).b |= 8;
        ((gqwn)hftv3).f = v2;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwn gqwn0 = (gqwn)hftp2.b_message;
        gqwn0.b |= 16;
        gqwn0.g = v3;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqvy gqvy0 = (gqvy)hftp1.b_message;
        gqwn gqwn1 = (gqwn)hftp2.N_build();
        gqwn1.getClass();
        gqvy0.f = gqwn1;
        gqvy0.b |= 8;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvy gqvy1 = (gqvy)hftp1.N_build();
        gqvy1.getClass();
        gqxs0.k = gqvy1;
        gqxs0.b |= 0x1000;
        gqvx gqvx0 = this.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs1.i = gqvx0;
        gqxs1.b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs2.getClass();
        gqxt0.c = gqxs2;
        gqxt0.b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gqwq)hftp4.b_message).c = 3;
        ((gqwq)hftp4.b_message).b |= 1;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gqxk.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp5.b_message;
        ((gqxk)hftv4).b |= 1;
        ((gqxk)hftv4).c = v;
        if(!hftv4.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp5.b_message;
        ((gqxk)hftv5).b |= 2;
        ((gqxk)hftv5).d = v1;
        if(!hftv5.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp5.b_message;
        ((gqxk)hftv6).b |= 4;
        ((gqxk)hftv6).e = v2;
        if(!hftv6.isImmutable()) {
            hftp5.ensureMutable();
        }
        gqxk gqxk0 = (gqxk)hftp5.b_message;
        gqxk0.b |= 8;
        gqxk0.f = v3;
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        gqwq gqwq0 = (gqwq)hftp4.b_message;
        gqxk gqxk1 = (gqxk)hftp5.N_build();
        gqxk1.getClass();
        gqwq0.d = gqxk1;
        gqwq0.b |= 2;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp3.b_message;
        gqwq gqwq1 = (gqwq)hftp4.N_build();
        gqwq1.getClass();
        gqwt0.c = gqwq1;
        gqwt0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt1 = (gqxt)hftp0.b_message;
        gqwt gqwt1 = (gqwt)hftp3.N_build();
        gqwt1.getClass();
        gqxt1.e = gqwt1;
        gqxt1.b |= 8;
        this.e(v, ((gqxt)hftp0.N_build()));
    }

    public final void l(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((gqwn)hftv0).c = 10;
        ((gqwn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((gqwn)hftv1).b |= 2;
        ((gqwn)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqwn gqwn0 = (gqwn)hftp2.b_message;
        gqwn0.b |= 4;
        gqwn0.e = 0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqvy gqvy0 = (gqvy)hftp1.b_message;
        gqwn gqwn1 = (gqwn)hftp2.N_build();
        gqwn1.getClass();
        gqvy0.f = gqwn1;
        gqvy0.b |= 8;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvy gqvy1 = (gqvy)hftp1.N_build();
        gqvy1.getClass();
        gqxs0.k = gqvy1;
        gqxs0.b |= 0x1000;
        gqvx gqvx0 = this.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs1.i = gqvx0;
        gqxs1.b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs2.getClass();
        gqxt0.c = gqxs2;
        gqxt0.b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)gqwq.a).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        ((gqwq)hftp4.b_message).c = 3;
        ((gqwq)hftp4.b_message).b |= 1;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gqwt gqwt0 = (gqwt)hftp3.b_message;
        gqwq gqwq0 = (gqwq)hftp4.N_build();
        gqwq0.getClass();
        gqwt0.c = gqwq0;
        gqwt0.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt1 = (gqxt)hftp0.b_message;
        gqwt gqwt1 = (gqwt)hftp3.N_build();
        gqwt1.getClass();
        gqxt1.e = gqwt1;
        gqxt1.b |= 8;
        this.e(v, ((gqxt)hftp0.N_build()));
    }

    private static final int m() {
        return cchl.d() ? 3 : 2;
    }
}

