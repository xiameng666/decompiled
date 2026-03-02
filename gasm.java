import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import j..util.Objects;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class gasm {
    public int a;
    public final gatc b;
    final gbmd c;
    public final byi d;
    public bzt e;
    public bzt f;
    private gbmg g;
    @Deprecated
    private final Set h;

    public gasm(gatc gatc0) {
        this.a = -1;
        this.d = new byi(1);
        this.g = new gbme();
        this.h = new bxf();
        this.b = gatc0;
        this.c = new gbmd(gatc0.b);
    }

    public final gbmd a(gass gass0) {
        long v = gass0.y(gass0).no();
        return (gbmd)Objects.requireNonNullElse(((gbmd)this.d.d(v)), this.c);
    }

    public final void b(int v) {
        hdzs hdzs1;
        if(this.f != null && this.f.i(v)) {
            return;
        }
        switch(v) {
            case 10: {
                hdzr hdzr0 = (hdzr)((ProtoLiteMessage)hdzs.a).v_newBuilder();
                if(!hdzr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hdzr0).ensureMutable();
                }
                hdzs hdzs0 = (hdzs)hdzr0.b_message;
                hdzs0.b |= 1;
                hdzs0.c = 10;
                hdzk hdzk0 = gboq.a(0, 0xFF);
                ProtoLiteBuilder hftp0 = gboq.b(gboq.b, 100, hdzk0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hdzq hdzq0 = (hdzq)hftp0.b_message;
                hdzq0.b |= 4;
                hdzq0.e = 50;
                hdzr0.a(hftp0);
                hdzr0.a(gboq.c(gboq.a));
                hdzs1 = (hdzs)((ProtoLiteBuilder)hdzr0).N_build();
                break;
            }
            case 20: {
                hdzr hdzr1 = (hdzr)((ProtoLiteMessage)hdzs.a).v_newBuilder();
                if(!hdzr1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)hdzr1).ensureMutable();
                }
                hdzs hdzs2 = (hdzs)hdzr1.b_message;
                hdzs2.b |= 1;
                hdzs2.c = 20;
                hdzk hdzk1 = gboq.a(0xFF, 0);
                hdzr1.a(gboq.b(gboq.b, 100, hdzk1));
                hdzr1.a(gboq.c(gboq.a));
                hdzs1 = (hdzs)((ProtoLiteBuilder)hdzr1).N_build();
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported customTransitionId: %d", v));
            }
        }
        if(this.f == null) {
            this.f = new bzt();
        }
        this.f.h(hdzs1.c, hdzs1);
    }

    public final void c() {
        gbmd gbmd0 = this.c;
        if(!gbmd0.k()) {
            gbmd0.h();
        }
        byi byi0 = this.d;
        int v = byi0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            gbmd gbmd1 = (gbmd)byi0.f(v1);
            if(!gbmd1.k()) {
                gbmd1.h();
            }
        }
    }

    public final void d() {
        this.c.e = this;
    }

    public final void e(gass gass0) {
        gbmd gbmd0 = this.a(gass0);
        if(gbmd0.j() && !gbmd0.k()) {
            gass0.y(gass0).au();
            gbmd0.b = 2;
            ViewGroup viewGroup0 = gbmd0.a;
            gbmc gbmc0 = new gbmc(gbmd0);
            gbmc0.U(0);
            gbmc0.C(new int[]{2, 1});
            gbmd gbmd1 = gbmc0.B;
            gbmj gbmj0 = new gbmj(gbmd1);
            gbmj0.C(new int[]{2, 1});
            gbmc0.h(gbmj0);
            if(gbmd1.c) {
                oyw oyw0 = new oyw();
                oyw0.b = 300L;
                oyw0.c = new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f);
                oyw0.C(new int[]{2, 1});
                gbmc0.h(oyw0);
            }
            else {
                gbmb gbmb0 = new gbmb(gbmd1);
                gbmb0.C(new int[]{2, 1});
                gbmc0.h(gbmb0);
            }
            gbmc0.V(gbmd0);
            pao.b(viewGroup0, gbmc0);
        }
    }

    public final void f(List list0) {
        if(this.e == null) {
            this.e = new bzt(list0.size());
        }
        for(Object object0: list0) {
            this.e.h(((hdzs)object0).c, ((hdzs)object0));
        }
    }

    public final void g(long v) {
        this.c.i(true, gged_interceptors.l(Long.valueOf(v)));
        byi byi0 = this.d;
        int v1 = byi0.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((gbmd)byi0.f(v2)).i(true, gged_interceptors.l(Long.valueOf(v)));
        }
    }

    public final void h(List list0) {
        boolean z;
        gaxl.a();
        if(gaxm.k()) {
            z = this.g.c(list0);
        }
        else {
            z = false;
            for(Object object0: list0) {
                if(this.h.contains(((Long)object0))) {
                    z = true;
                    break;
                }
            }
        }
        if(z) {
            this.c.i(false, list0);
            byi byi0 = this.d;
            int v = byi0.b();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gbmd)byi0.f(v1)).i(false, list0);
            }
        }
    }

    public final void i(View view0, gass gass0) {
        hdtk hdtk0 = this.a(gass0).l(view0, 0);
        String s = null;
        if(view0.getVisibility() == 0 && hdtk0 != null) {
            s = (hdtk0.b & 4) == 0 ? "ui_" + gass0.no() : Integer.toString(hdtk0.f);
        }
        view0.setTransitionName(s);
    }

    public final void j(gbpb gbpb0, hdrl hdrl0, List list0, Long long0) {
        gaxl.a();
        if(gaxm.k()) {
            this.g = new gbme();
            ArrayDeque arrayDeque0 = new ArrayDeque();
            arrayDeque0.add(hdrl0);
            arrayDeque0.addAll(list0);
            while(!arrayDeque0.isEmpty()) {
                hdrl hdrl1 = (hdrl)arrayDeque0.remove();
                hdtl hdtl0 = hdrl1.j == null ? hdtl.a : hdrl1.j;
                gbme gbme0 = new gbme();
                for(Object object0: hdtl0.b) {
                    hdtk hdtk0 = (hdtk)object0;
                    if(hdtk0.d.size() <= 0) {
                        gbme0 = gbmf.a;
                        break;
                    }
                    gbme0.b(hdtk0.d);
                }
                gbmg gbmg0 = this.g.a(gbme0);
                this.g = gbmg0;
                if((gbmg0 instanceof gbmf)) {
                    break;
                }
                arrayDeque0.addAll(gbpb.a(hdrl1));
            }
            if(long0 != null) {
                this.g.b(gged_interceptors.l(long0));
            }
        }
        else {
            Set set0 = this.h;
            set0.clear();
            this.k(gbpb0, hdrl0);
            for(Object object1: list0) {
                this.k(gbpb0, ((hdrl)object1));
            }
            if(long0 != null) {
                set0.add(long0);
            }
        }
    }

    @Deprecated
    private final void k(gbpb gbpb0, hdrl hdrl0) {
        for(Object object0: (hdrl0.j == null ? hdtl.a : hdrl0.j).b) {
            this.h.addAll(((hdtk)object0).d);
        }
        for(Object object1: gbpb.a(hdrl0)) {
            this.k(gbpb0, ((hdrl)object1));
        }
    }
}

