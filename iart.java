import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import jeb.synthetic.FIN;

abstract class iart implements ibfp {
    private InputStream a;
    protected final iarm b;
    protected final iakk c;
    final int d;
    protected iaso e;
    protected ibfn f;
    protected ibfq g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private iarr n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;

    public iart(iarm iarm0, iakk iakk0, int v) {
        this.n = iarr.a;
        this.b = iarm0;
        this.c = iakk0;
        this.d = v;
    }

    protected abstract void a(iapk arg1);

    protected abstract void b();

    public abstract void c(int arg1, Parcel arg2);

    public boolean d() {
        throw null;
    }

    public abstract void e(Parcel arg1);

    @Override  // ibfp
    public final InputStream f() {
        InputStream inputStream0;
        InputStream inputStream1;
        synchronized(this) {
            inputStream0 = this.a;
            if(inputStream0 != null) {
                this.a = null;
            }
            else if(this.p > 0 && this.r()) {
                int v1 = this.i;
                this.i = 0;
                if(v1 == 1) {
                    iars iars0 = (iars)this.j.remove(0);
                    inputStream1 = iars0.a;
                    if(inputStream1 == null) {
                        inputStream1 = new iarn(iars0.b);
                    }
                }
                else {
                    byte[][] arr2_b = new byte[v1][];
                    int v3 = 0;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        byte[] arr_b = ((iars)this.j.remove(0)).b;
                        gftb.check(arr_b);
                        arr2_b[v2] = arr_b;
                        v3 += arr_b.length;
                    }
                    inputStream1 = new iarn(arr2_b, v3);
                }
                this.h += v1;
                this.q();
                inputStream0 = inputStream1;
            }
            else {
                inputStream0 = null;
            }
            if(inputStream0 == null) {
                this.r = false;
                if(this.s() && !this.o()) {
                    this.l(iarr.d);
                    this.i();
                    return null;
                }
            }
            else {
                --this.p;
            }
        }
        return inputStream0;
    }

    final void g(iapk iapk0) {
        this.p(iapk0, iapk0, false);
    }

    final void h(iapk iapk0) {
        this.p(iapk.c, iapk0, false);
    }

    final void i() {
        if(this.q) {
            return;
        }
        this.q = true;
    alab1:
        while(true) {
            switch(this.n.ordinal()) {
                case 2: {
                    if(this.g == null || this.r) {
                        break alab1;
                    }
                    if(this.r()) {
                        if(this.p == 0) {
                            break alab1;
                        }
                    }
                    else if(!this.s()) {
                        break alab1;
                    }
                    break;
                }
                case 3: {
                    if(this.g != null && this.k) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    break alab1;
                }
            }
            switch(this.n.ordinal()) {
                case 2: {
                    if(this.r) {
                        continue;
                    }
                    if(this.r()) {
                        this.r = true;
                        this.g.d(this);
                        continue;
                    }
                    else {
                        if(!this.k) {
                            continue;
                        }
                        this.l(iarr.d);
                    }
                    break;
                }
                case 3: {
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
            if(this.k) {
                this.l(iarr.e);
                this.b();
            }
        }
        this.q = false;
    }

    final void j(Parcel parcel0) {
        byte[] arr_b;
        boolean z2;
        int v4;
        iasq iasq0;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.o()) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        try {
            int v1 = parcel0.readInt();
            if(iasy.c(v1, 8)) {
                iapk iapk0 = iasy.a(v1, parcel0);
                this.p(iapk0, iapk0, true);
                FIN.finallyExec$NT(v);
                return;
            }
            int v2 = parcel0.readInt();
            boolean z = iasy.c(v1, 2);
            boolean z1 = iasy.c(v1, 4);
            if(iasy.c(v1, 1)) {
                this.e(parcel0);
                this.l(iarr.c);
            }
            if(z) {
                if((v1 & 0x40) == 0) {
                    v4 = parcel0.readInt();
                    arr_b = iaro.c(v4);
                    if(v4 > 0) {
                        parcel0.readByteArray(arr_b);
                    }
                    z2 = (v1 & 0x80) == 0;
                    iasq0 = null;
                }
                else {
                    iaqs iaqs0 = (iaqs)this.c.a(iarm.l);
                    if(iaqs0 != null && iaqs0.c) {
                        int v3 = parcel0.dataPosition();
                        iasq0 = new iasq(null, parcel0.readParcelable(this.getClass().getClassLoader()), true);
                        v4 = parcel0.dataPosition() - v3;
                        z2 = true;
                        arr_b = null;
                        goto label_36;
                    }
                    throw new iapl(iapk.i.f("Parcelable messages not allowed"));
                }
            label_36:
                if(this.j != null) {
                label_45:
                    iars iars0 = new iars(iasq0, arr_b, v4, z2);
                    int v5 = v2 - this.h;
                    if(v5 < this.j.size()) {
                        this.j.set(v5, iars0);
                        this.q();
                    }
                    else if(v5 > this.j.size()) {
                        do {
                            this.j.add(null);
                        }
                        while(v5 > this.j.size());
                        this.j.add(iars0);
                    }
                    else {
                        this.j.add(iars0);
                        this.q();
                    }
                }
                else if(this.o == 0 && z2 && v2 == this.h) {
                    gftb.q(this.a == null);
                    if(iasq0 == null) {
                        iasq0 = new iarn(arr_b);
                    }
                    this.a = iasq0;
                    this.t();
                }
                else {
                    this.j = new ArrayList(16);
                    goto label_45;
                }
            }
            if(z1) {
                this.c(v1, parcel0);
                this.l = v2;
                this.k = true;
            }
            int v6 = this.h;
            if(v2 == v6) {
                ArrayList arrayList0 = this.j;
                if(arrayList0 == null) {
                    this.h = v6 + 1;
                }
                else if(!z && !z1) {
                    arrayList0.remove(0);
                    ++this.h;
                }
            }
            int v7 = parcel0.dataSize();
            int v8 = this.m + v7;
            this.m = v8;
            ibfn ibfn0 = this.f;
            if(ibfn0 != null && v8 != 0) {
                ibfn0.b(((long)v8));
                this.m = 0;
            }
            this.i();
            FIN.finallyExec$NT(v);
        }
        catch(iapl iapl0) {
            this.g(iapl0.a);
            FIN.finallyExec$NT(v);
        }
    }

    final void k(iaso iaso0, ibfq ibfq0) {
        this.e = iaso0;
        this.f = iaso0.a;
        this.g = ibfq0;
        if(!this.o()) {
            this.l(iarr.b);
        }
    }

    protected final void l(iarr iarr0) {
        iarr iarr1 = this.n;
        boolean z = false;
        switch(iarr0.ordinal()) {
            case 1: {
                if(iarr1 == iarr.a) {
                    z = true;
                }
                gftb.w(z, "%s -> %s", iarr1, iarr0);
                break;
            }
            case 2: {
                if(iarr1 == iarr.b || iarr1 == iarr.a) {
                    z = true;
                }
                gftb.w(z, "%s -> %s", iarr1, iarr0);
                break;
            }
            case 3: {
                if(iarr1 == iarr.c) {
                    z = true;
                }
                gftb.w(z, "%s -> %s", iarr1, iarr0);
                break;
            }
            case 4: {
                if(iarr1 == iarr.d) {
                    z = true;
                }
                gftb.w(z, "%s -> %s", iarr1, iarr0);
                break;
            }
            case 5: {
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        this.n = iarr0;
    }

    public final void m(int v) {
        this.p += v;
        this.i();
    }

    final void n() {
        iarm iarm0 = this.b;
        if(this.d() && ((iarl)iarm0).d.decrementAndGet() == 0) {
            ((iarl)iarm0).g.a(false);
        }
        if(iarm0.p.remove(Integer.valueOf(this.d)) != null && iarm0.p.isEmpty()) {
            iard iard0 = new iard(iarm0);
            iarm0.n.execute(iard0);
        }
    }

    protected final boolean o() {
        return this.n == iarr.f;
    }

    private final void p(iapk iapk0, iapk iapk1, boolean z) {
        if(!this.o()) {
            boolean z1 = this.n != iarr.a;
            this.l(iarr.f);
            if(z1) {
                this.f.m();
            }
            if(!z) {
                try {
                    iarm iarm0 = this.b;
                    int v = this.d;
                    try(iasp iasp0 = iasp.c()) {
                        iasp0.a().writeInt(0);
                        Parcel parcel0 = iasp0.a();
                        int v1 = iapk0.t.r << 16;
                        String s = iapk0.u;
                        if(s != null && s.length() > 1000) {
                            s = s.substring(0, 1000);
                        }
                        if(s != null) {
                            v1 |= 0x20;
                            parcel0.writeString(s);
                        }
                        iasy.b(iasp0.a(), v1 | 8);
                        iarm0.t(v, iasp0);
                    }
                }
                catch(iapl iapl0) {
                    iarm.j.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", iapl0);
                }
            }
            if(z1) {
                this.a(iapk1);
            }
            this.n();
        }
    }

    private final void q() {
        if(this.i == 0) {
            int v = 0;
            while(v < this.j.size()) {
                iars iars0 = (iars)this.j.get(v);
                if(iars0 == null) {
                    break;
                }
                ++v;
                if(iars0.d) {
                    this.i = v;
                    this.t();
                    return;
                }
            }
        }
    }

    private final boolean r() {
        return this.a != null || this.i > 0;
    }

    private final boolean s() {
        return this.k && this.h >= this.l;
    }

    private final void t() {
        gftb.check(this.f);
        ++this.o;
    }

    @Override
    public final String toString() {
        ibfq ibfq0;
        String s1;
        boolean z;
        String s;
        synchronized(this) {
            s = this.getClass().getSimpleName();
            z = this.k;
            s1 = String.valueOf(this.n);
            ibfq0 = this.g;
        }
        return s + "[SfxA=" + z + "/De=" + s1 + "/Msg=" + this.r() + "/Lis=" + (ibfq0 != null) + "]";
    }
}

