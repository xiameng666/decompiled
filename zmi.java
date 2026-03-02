import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class zmi {
    public static final baun a;
    public final aatb b;
    public final grxw c;
    public final fhrt d;
    public final zjw e;
    public final ExecutorService f;
    public final zjp g;
    public boolean h;
    public boolean i;
    public Exception j;
    public final lqi k;
    public final zis l;
    private int m;
    private final aauo n;
    private final zip o;

    static {
        zmi.a = new baun("AccountSettings", new String[]{"ScreenGraphFetcher"});
    }

    @AssistedInject
    public zmi(@Assisted grxw grxw0, @Assisted fhrt fhrt0, aatb aatb0, aauo aauo0, zjw zjw0, ExecutorService executorService0, zis zis0, zjp zjp0, zip zip0) {
        this.b = aatb0;
        this.c = grxw0;
        this.d = fhrt0;
        this.n = aauo0;
        this.e = zjw0;
        this.f = executorService0;
        this.l = zis0;
        this.g = zjp0;
        this.o = zip0;
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = zjw0.d(this.a(grxw0));
        this.m = 0;
    }

    public final zjv a(grxw grxw0) {
        String s = aaus.a();
        int v = this.n.a();
        return new zjv(this.b, grxw0, s, this.d, v);
    }

    // Detected as a lambda impl.
    public final void b() {
        int v = this.m - 1;
        this.m = v;
        if(v == 0) {
            this.h = false;
            this.i = false;
            this.i();
        }
    }

    // Detected as a lambda impl.
    public final void c(grxw grxw0, long v, Exception exception0) {
        switch(grxw0.c) {
            case 10200: 
            case 10202: {
                if(!hoju.j()) {
                    goto label_3;
                }
                break;
            }
            case 1: 
            case 0x19F: 
            case 10006: 
            case 10100: 
            case 10104: 
            case 10312: {
            label_3:
                zip zip0 = this.o;
                this.e();
                zjv zjv0 = this.a(grxw0);
                zlv zlv0 = new zlv(this, v);
                switch(zjv0.b.c) {
                    case 1: {
                        aatb aatb0 = zjv0.a;
                        grwa grwa0 = zip.c(zip.g(), gged_interceptors.n(zip.d(), zip.f(), zip.h()));
                        if(hoju.j()) {
                            zlv0.a(grwa0);
                        }
                        else {
                            zip0.a(aatb0, zlv0, grwa0);
                        }
                        break;
                    }
                    case 0x19F: {
                        zlv0.a(zip.c(zip.h(), ggna.a));
                        break;
                    }
                    case 10006: {
                        aatb aatb1 = zjv0.a;
                        grwa grwa1 = zip.c(zip.i(), (hoju.j() ? gged_interceptors.n(zip.e(), zip.f(), zip.h()) : gged_interceptors.o(zip.e(), zip.f(), zip.h(), zip.j())));
                        if(hoju.j()) {
                            zlv0.a(grwa1);
                        }
                        else {
                            zip0.a(aatb1, zlv0, grwa1);
                        }
                        break;
                    }
                    case 10100: {
                        zlv0.a(zip.c(zip.d(), gged_interceptors.m(zip.f(), zip.h())));
                        break;
                    }
                    case 10104: {
                        zlv0.a(zip.c(zip.e(), gged_interceptors.m(zip.f(), zip.h())));
                        break;
                    }
                    case 10200: {
                        aatb aatb2 = zjv0.a;
                        if(hoju.j()) {
                            zlv0.a(zip.c(zip.j(), ggna.a));
                        }
                        else {
                            zip0.a(aatb2, zlv0, zip.c(zip.j(), gged_interceptors.q(zip.i(), zip.e(), zip.g(), zip.d(), zip.f(), zip.h())));
                        }
                        break;
                    }
                    case 10202: {
                        aatb aatb3 = zjv0.a;
                        if(hoju.j()) {
                            zlv0.a(zip.c(zip.k(null), ggna.a));
                        }
                        else {
                            zip0.a(aatb3, zlv0, null);
                        }
                        break;
                    }
                    case 10312: {
                        zlv0.a(zip.c(zip.f(), gged_interceptors.l(zip.h())));
                        break;
                    }
                    default: {
                        zlv0.a(grwa.a);
                    }
                }
            }
        }
        if(this.j == null) {
            this.j = exception0;
            this.i();
        }
    }

    // Detected as a lambda impl.
    public final void d(grwa grwa0, long v, boolean z, boolean z1) {
        ggdy ggdy0 = new ggdy();
        int v1 = grwa0.b & 1;
        if(z1) {
            v = 0L;
        }
        if(v1 != 0) {
            ggdy0.i(new zho((grwa0.c == null ? grxr.a : grwa0.c), v, z));
        }
        for(Object object0: grwa0.d) {
            ggdy0.i(new zho(((grxr)object0), v, z));
        }
        this.h(ggdy0.h());
        if((grwa0.b & 1) != 0) {
            this.n((grwa0.c == null ? grxr.a : grwa0.c));
        }
    }

    public final void e() {
        ++this.m;
    }

    public final void f(grxw grxw0) {
        zmi.a.j("loadRemoteResourceAndDescendants(%s)", new Object[]{((int)grxw0.c)});
        zjw zjw0 = this.e;
        if(!((Boolean)zmi.m(zjw0.a())).booleanValue()) {
            this.e();
            zlz zlz0 = new zlz(this, grxw0);
            evql evql0 = evrg.a(this.f, zlz0);
            evql0.b(new zma(this, grxw0));
            evql0.A((Exception exception0) -> {
                switch(grxw0.c) {
                    case 10200: 
                    case 10202: {
                        if(!hoju.j()) {
                            goto label_3;
                        }
                        break;
                    }
                    case 1: 
                    case 0x19F: 
                    case 10006: 
                    case 10100: 
                    case 10104: 
                    case 10312: {
                    label_3:
                        zip zip0 = this.o;
                        this.e();
                        zjv zjv0 = this.a(grxw0);
                        zlv zlv0 = new zlv(this, System.currentTimeMillis());
                        switch(zjv0.b.c) {
                            case 1: {
                                aatb aatb0 = zjv0.a;
                                grwa grwa0 = zip.c(zip.g(), gged_interceptors.n(zip.d(), zip.f(), zip.h()));
                                if(hoju.j()) {
                                    zlv0.a(grwa0);
                                }
                                else {
                                    zip0.a(aatb0, zlv0, grwa0);
                                }
                                break;
                            }
                            case 0x19F: {
                                zlv0.a(zip.c(zip.h(), ggna.a));
                                break;
                            }
                            case 10006: {
                                aatb aatb1 = zjv0.a;
                                grwa grwa1 = zip.c(zip.i(), (hoju.j() ? gged_interceptors.n(zip.e(), zip.f(), zip.h()) : gged_interceptors.o(zip.e(), zip.f(), zip.h(), zip.j())));
                                if(hoju.j()) {
                                    zlv0.a(grwa1);
                                }
                                else {
                                    zip0.a(aatb1, zlv0, grwa1);
                                }
                                break;
                            }
                            case 10100: {
                                zlv0.a(zip.c(zip.d(), gged_interceptors.m(zip.f(), zip.h())));
                                break;
                            }
                            case 10104: {
                                zlv0.a(zip.c(zip.e(), gged_interceptors.m(zip.f(), zip.h())));
                                break;
                            }
                            case 10200: {
                                aatb aatb2 = zjv0.a;
                                if(hoju.j()) {
                                    zlv0.a(zip.c(zip.j(), ggna.a));
                                }
                                else {
                                    zip0.a(aatb2, zlv0, zip.c(zip.j(), gged_interceptors.q(zip.i(), zip.e(), zip.g(), zip.d(), zip.f(), zip.h())));
                                }
                                break;
                            }
                            case 10202: {
                                aatb aatb3 = zjv0.a;
                                if(hoju.j()) {
                                    zlv0.a(zip.c(zip.k(null), ggna.a));
                                }
                                else {
                                    zip0.a(aatb3, zlv0, null);
                                }
                                break;
                            }
                            case 10312: {
                                zlv0.a(zip.c(zip.f(), gged_interceptors.l(zip.h())));
                                break;
                            }
                            default: {
                                zlv0.a(grwa.a);
                            }
                        }
                    }
                }
                if(this.j == null) {
                    this.j = exception0;
                    this.i();
                }
            });
            evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
                int v = this.m - 1;
                this.m = v;
                if(v == 0) {
                    this.h = false;
                    this.i = false;
                    this.i();
                }
            });
            return;
        }
        this.g(grxw0, ((zho)zmi.m(zjw0.c(this.a(grxw0)))));
    }

    public final void g(grxw grxw0, zho zho0) {
        ggfp ggfp0;
        if(!zho0.c()) {
            zmi.a.j("loadRemoteResourceAndDescendants(%s): no refresh needed for this resource", new Object[]{((int)grxw0.c)});
            this.n(zho0.a);
            return;
        }
        zjw zjw0 = this.e;
        zjv zjv0 = this.a(grxw0);
        Map map0 = zjw0.c;
        if(map0.containsKey(zjv0)) {
            ggfn ggfn0 = new ggfn();
            grxr grxr0 = zjw0.e(zjv0).a;
            Set set0 = zhp.i(grxr0);
            ggfn0.k(set0);
            for(Object object0: set0) {
                String s = zjv0.c;
                aatb aatb0 = zjv0.a;
                fhrt fhrt0 = zjv0.d;
                int v = zjv0.e;
                zjv zjv1 = new zjv(aatb0, ((grxw)object0), s, fhrt0, v);
                if(map0.containsKey(zjv1)) {
                    grxr grxr1 = zjw0.e(zjv1).a;
                    ggfn0.k(zhp.j(grxr1));
                    if(grxr1.c == 6) {
                        ggfp ggfp1 = ggfp.G(((grve)grxr1.d).c);
                        ggfn0.k(ggfp1);
                        for(Object object1: ggfp1) {
                            zjv zjv2 = new zjv(aatb0, ((grxw)object1), s, fhrt0, v);
                            fhrt0 = fhrt0;
                            v = v;
                            if(map0.containsKey(zjv2)) {
                                ggfn0.k(zhp.j(zjw0.e(zjv2).a));
                            }
                        }
                    }
                }
            }
            ggfn0.k(zhp.j(grxr0));
            ggfp0 = ggfn0.h();
        }
        else {
            ggfp0 = ggnj.a;
        }
        ggfn ggfn1 = new ggfn();
        for(Object object2: ggfp0) {
            zjv zjv3 = new zjv(zjv0.a, ((grxw)object2), zjv0.c, zjv0.d, zjv0.e);
            if(map0.containsKey(zjv3)) {
                zho zho1 = zjw0.e(zjv3);
                if(!zho1.c()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxz.a).v_newBuilder();
                    grxw grxw1 = zho1.a.e == null ? grxw.a : zho1.a.e;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    grxz grxz0 = (grxz)hftp0.b_message;
                    grxw1.getClass();
                    grxz0.c = grxw1;
                    grxz0.b |= 1;
                    ggfn1.i(((grxz)hftp0.N_build()));
                }
            }
        }
        ggfp ggfp2 = ggfn1.h();
        long v1 = System.currentTimeMillis();
        this.e();
        zmd zmd0 = new zmd(this, grxw0, v1, ggfp2);
        evql evql0 = evrg.a(this.f, zmd0);
        evql0.b((grwa grwa0) -> {
            ggdy ggdy0 = new ggdy();
            int v1 = grwa0.b & 1;
            if(false) {
                v1 = 0L;
            }
            if(v1 != 0) {
                ggdy0.i(new zho((grwa0.c == null ? grxr.a : grwa0.c), v1, false));
            }
            for(Object object0: grwa0.d) {
                ggdy0.i(new zho(((grxr)object0), v1, false));
            }
            this.h(ggdy0.h());
            if((grwa0.b & 1) != 0) {
                this.n((grwa0.c == null ? grxr.a : grwa0.c));
            }
        });
        evql0.A((Exception exception0) -> {
            switch(grxw0.c) {
                case 10200: 
                case 10202: {
                    if(!hoju.j()) {
                        goto label_3;
                    }
                    break;
                }
                case 1: 
                case 0x19F: 
                case 10006: 
                case 10100: 
                case 10104: 
                case 10312: {
                label_3:
                    zip zip0 = this.o;
                    this.e();
                    zjv zjv0 = this.a(grxw0);
                    zlv zlv0 = new zlv(this, v1);
                    switch(zjv0.b.c) {
                        case 1: {
                            aatb aatb0 = zjv0.a;
                            grwa grwa0 = zip.c(zip.g(), gged_interceptors.n(zip.d(), zip.f(), zip.h()));
                            if(hoju.j()) {
                                zlv0.a(grwa0);
                            }
                            else {
                                zip0.a(aatb0, zlv0, grwa0);
                            }
                            break;
                        }
                        case 0x19F: {
                            zlv0.a(zip.c(zip.h(), ggna.a));
                            break;
                        }
                        case 10006: {
                            aatb aatb1 = zjv0.a;
                            grwa grwa1 = zip.c(zip.i(), (hoju.j() ? gged_interceptors.n(zip.e(), zip.f(), zip.h()) : gged_interceptors.o(zip.e(), zip.f(), zip.h(), zip.j())));
                            if(hoju.j()) {
                                zlv0.a(grwa1);
                            }
                            else {
                                zip0.a(aatb1, zlv0, grwa1);
                            }
                            break;
                        }
                        case 10100: {
                            zlv0.a(zip.c(zip.d(), gged_interceptors.m(zip.f(), zip.h())));
                            break;
                        }
                        case 10104: {
                            zlv0.a(zip.c(zip.e(), gged_interceptors.m(zip.f(), zip.h())));
                            break;
                        }
                        case 10200: {
                            aatb aatb2 = zjv0.a;
                            if(hoju.j()) {
                                zlv0.a(zip.c(zip.j(), ggna.a));
                            }
                            else {
                                zip0.a(aatb2, zlv0, zip.c(zip.j(), gged_interceptors.q(zip.i(), zip.e(), zip.g(), zip.d(), zip.f(), zip.h())));
                            }
                            break;
                        }
                        case 10202: {
                            aatb aatb3 = zjv0.a;
                            if(hoju.j()) {
                                zlv0.a(zip.c(zip.k(null), ggna.a));
                            }
                            else {
                                zip0.a(aatb3, zlv0, null);
                            }
                            break;
                        }
                        case 10312: {
                            zlv0.a(zip.c(zip.f(), gged_interceptors.l(zip.h())));
                            break;
                        }
                        default: {
                            zlv0.a(grwa.a);
                        }
                    }
                }
            }
            if(this.j == null) {
                this.j = exception0;
                this.i();
            }
        });
        evql0.z((/* MISSING LAMBDA PARAMETER */) -> {
            int v = this.m - 1;
            this.m = v;
            if(v == 0) {
                this.h = false;
                this.i = false;
                this.i();
            }
        });
    }

    public final void h(List list0) {
        for(Object object0: list0) {
            zho zho0 = (zho)object0;
            if(!zho0.b()) {
                grxr grxr0 = zho0.a;
                lqi lqi0 = this.e.c(this.a((grxr0.e == null ? grxw.a : grxr0.e)));
                zho zho1 = (zho)lqi0.ij();
                boolean z = zho0.c;
                if(!z || zho1 == null || zho1.b() || zho1.c) {
                    lqi0.l(new zho(zif.a(grxr0), zho0.b, z));
                }
            }
        }
    }

    public final void i() {
        zhq zhq0 = new zhq(this.h, this.i, this.j);
        this.k.l(zhq0);
    }

    public final boolean j(grxw grxw0) {
        zjv zjv0 = this.a(grxw0);
        zho zho0 = (zho)zmi.m(this.e.c(zjv0));
        if(zho0.b()) {
            return false;
        }
        for(Object object0: zhp.i(zho0.a)) {
            if(!this.j(((grxw)object0))) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(grxw grxw0) {
        zjv zjv0 = this.a(grxw0);
        zho zho0 = (zho)zmi.m(this.e.c(zjv0));
        if(zho0.c()) {
            return false;
        }
        for(Object object0: zhp.i(zho0.a)) {
            if(!this.k(((grxw)object0))) {
                return false;
            }
        }
        return true;
    }

    public final void l(grxw grxw0, long v, Map map0, zis zis0) {
        zir zir0;
        if(map0.containsKey(grxw0)) {
            return;
        }
        zjv zjv0 = this.a(grxw0);
        zho zho0 = this.e.c.containsKey(zjv0) ? this.e.e(zjv0) : new zho(zjv0.b);
        zho zho1 = null;
        if(zho0.c()) {
            if(grxw0.c == 10047) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grxr.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((grxr)hftv0).b |= 2;
                ((grxr)hftv0).f = true;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grxr grxr0 = (grxr)hftp0.b_message;
                grxw0.getClass();
                grxr0.e = grxw0;
                grxr0.b |= 1;
                gryb gryb0 = (gryb)((ProtoLiteMessage)gryc.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grul.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grwv.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                grwv grwv0 = (grwv)hftp2.b_message;
                grwv0.b |= 1;
                grwv0.c = 10;
                grwv grwv1 = (grwv)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                grul grul0 = (grul)hftp1.b_message;
                grwv1.getClass();
                grul0.c = grwv1;
                grul0.b |= 2;
                if(!gryb0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gryb0).ensureMutable();
                }
                gryc gryc0 = (gryc)gryb0.b_message;
                grul grul1 = (grul)hftp1.N_build();
                grul1.getClass();
                gryc0.b();
                gryc0.b.add(grul1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                grxr grxr1 = (grxr)hftp0.b_message;
                gryc gryc1 = (gryc)((ProtoLiteBuilder)gryb0).N_build();
                gryc1.getClass();
                grxr1.d = gryc1;
                grxr1.c = 3;
                zir0 = new zir(((grxr)hftp0.N_build()));
            }
            else {
                zir0 = null;
            }
            if(zir0 != null) {
                zho1 = new zho(zir0.a, v, true);
            }
            if(zho1 == null) {
                this.o(zho0, v, map0, zis0);
                return;
            }
            batl.l(((ProtoLiteMessage)(zho1.a.e == null ? grxw.a : zho1.a.e)).equals(grxw0));
            batl.l(zho1.c);
            map0.put(grxw0, zho1);
            this.o(zho1, v, map0, zis0);
            return;
        }
        this.o(zho0, v, map0, zis0);
    }

    public static final Object m(lqd lqd0) {
        Object object0 = lqd0.ij();
        gftb.z(object0, "LiveData value should never be null here.");
        return object0;
    }

    private final void n(grxr grxr0) {
        for(Object object0: zhp.i(grxr0)) {
            zmi.a.j("loadRemoteDescendants(%s) -> %s", new Object[]{((int)(grxr0.e == null ? grxw.a : grxr0.e).c), ((int)((grxw)object0).c)});
            this.f(((grxw)object0));
        }
    }

    private final void o(zho zho0, long v, Map map0, zis zis0) {
        for(Object object0: zhp.i(zho0.a)) {
            this.l(((grxw)object0), v, map0, zis0);
        }
    }
}

