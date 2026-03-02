import java.math.BigInteger;

public final class igpy extends igpz {
    public igpy(igps igps0) {
        this(igps0, null, null, false);
    }

    public igpy(igps igps0, igpv igpv0, igpv igpv1, boolean z) {
        super(igps0, igpv0, igpv1);
        if((igpv0 == null ? 1 : 0) != (igpv1 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f = z;
    }

    public igpy(igps igps0, igpv igpv0, igpv igpv1, igpv[] arr_igpv, boolean z) {
        super(igps0, igpv0, igpv1, arr_igpv);
        this.f = z;
    }

    protected final igpv a(igpv igpv0, igpv igpv1) {
        igpv igpv2 = this.b.e;
        if(!igpv2.s() && !igpv0.r()) {
            if(igpv1 == null) {
                igpv1 = igpv0.m();
            }
            igpv igpv3 = igpv1.m();
            igpv igpv4 = igpv2.k();
            return igpv4.a() >= igpv2.a() ? igpv3.h(igpv2) : igpv3.h(igpv4).k();
        }
        return igpv2;
    }

    @Override  // igpz
    protected final boolean d() {
        igpv igpv0 = this.c;
        igpv igpv1 = this.b.e;
        igpv igpv2 = this.b.f;
        igpv igpv3 = this.d.m();
        switch(this.q()) {
            case 0: {
                break;
            }
            case 1: {
                igpv igpv4 = this.e[0];
                if(!igpv4.r()) {
                    igpv igpv5 = igpv4.m();
                    igpv igpv6 = igpv4.h(igpv5);
                    igpv3 = igpv3.h(igpv4);
                    igpv1 = igpv1.h(igpv5);
                    igpv2 = igpv2.h(igpv6);
                    return igpv3.equals(igpv0.m().d(igpv1).h(igpv0).d(igpv2));
                }
                break;
            }
            case 2: 
            case 3: 
            case 4: {
                igpv igpv7 = this.e[0];
                if(!igpv7.r()) {
                    igpv igpv8 = igpv7.m();
                    igpv igpv9 = igpv8.m();
                    igpv igpv10 = igpv8.h(igpv9);
                    igpv1 = igpv1.h(igpv9);
                    igpv2 = igpv2.h(igpv10);
                    return igpv3.equals(igpv0.m().d(igpv1).h(igpv0).d(igpv2));
                }
                break;
            }
            default: {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
        return igpv3.equals(igpv0.m().d(igpv1).h(igpv0).d(igpv2));
    }

    @Override  // igpz
    public final igpz f(igpz igpz0) {
        igpv igpv14;
        if(this.v()) {
            return igpz0;
        }
        if(igpz0.v()) {
            return this;
        }
        if(this != igpz0) {
            igps igps0 = this.b;
            int v = igps0.i;
            igpv igpv0 = this.c;
            igpv igpv1 = this.d;
            igpv igpv2 = igpz0.c;
            igpv igpv3 = igpz0.d;
            switch(v) {
                case 0: {
                    igpv igpv25 = igpv2.p(igpv0);
                    igpv igpv26 = igpv3.p(igpv1);
                    if(igpv25.s()) {
                        return igpv26.s() ? this.h() : igps0.k();
                    }
                    igpv igpv27 = igpv26.f(igpv25);
                    igpv igpv28 = igpv27.m().p(igpv0).p(igpv2);
                    return new igpy(igps0, igpv28, igpv27.h(igpv0.p(igpv28)).p(igpv1), this.f);
                }
                case 1: {
                    igpv igpv29 = this.e[0];
                    igpv igpv30 = igpz0.e[0];
                    boolean z2 = igpv29.r();
                    boolean z3 = igpv30.r();
                    if(!z2) {
                        igpv3 = igpv3.h(igpv29);
                    }
                    if(!z3) {
                        igpv1 = igpv1.h(igpv30);
                    }
                    igpv igpv31 = igpv3.p(igpv1);
                    if(!z2) {
                        igpv2 = igpv2.h(igpv29);
                    }
                    if(!z3) {
                        igpv0 = igpv0.h(igpv30);
                    }
                    igpv igpv32 = igpv2.p(igpv0);
                    if(igpv32.s()) {
                        return igpv31.s() ? this.h() : igps0.k();
                    }
                    if(z2) {
                        igpv29 = igpv30;
                    }
                    else if(!z3) {
                        igpv29 = igpv29.h(igpv30);
                    }
                    igpv igpv33 = igpv32.m();
                    igpv igpv34 = igpv33.h(igpv32);
                    igpv igpv35 = igpv33.h(igpv0);
                    igpv igpv36 = igpv31.m().h(igpv29).p(igpv34).p(igpv35.d(igpv35));
                    return new igpy(igps0, igpv32.h(igpv36), igpv35.p(igpv36).i(igpv31, igpv1, igpv34), new igpv[]{igpv34.h(igpv29)}, this.f);
                }
                default: {
                    if(v != 2 && v != 4) {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                    igpv igpv4 = this.e[0];
                    igpv igpv5 = igpz0.e[0];
                    boolean z = igpv4.r();
                    if(!z && igpv4.equals(igpv5)) {
                        igpv igpv6 = igpv0.p(igpv2);
                        igpv igpv7 = igpv1.p(igpv3);
                        if(igpv6.s()) {
                            return igpv7.s() ? this.h() : igps0.k();
                        }
                        igpv igpv8 = igpv6.m();
                        igpv igpv9 = igpv0.h(igpv8);
                        igpv igpv10 = igpv2.h(igpv8);
                        igpv igpv11 = igpv9.p(igpv10).h(igpv1);
                        igpv igpv12 = igpv7.m().p(igpv9).p(igpv10);
                        igpv igpv13 = igpv9.p(igpv12).h(igpv7).p(igpv11);
                        igpv14 = igpv6.h(igpv4);
                        return v == 4 ? new igpy(igps0, igpv12, igpv13, new igpv[]{igpv14, this.a(igpv14, null)}, this.f) : new igpy(igps0, igpv12, igpv13, new igpv[]{igpv14}, this.f);
                    }
                    if(!z) {
                        igpv igpv15 = igpv4.m();
                        igpv2 = igpv15.h(igpv2);
                        igpv3 = igpv15.h(igpv4).h(igpv3);
                    }
                    boolean z1 = igpv5.r();
                    if(!z1) {
                        igpv igpv16 = igpv5.m();
                        igpv0 = igpv16.h(igpv0);
                        igpv1 = igpv16.h(igpv5).h(igpv1);
                    }
                    igpv igpv17 = igpv0.p(igpv2);
                    igpv igpv18 = igpv1.p(igpv3);
                    if(igpv17.s()) {
                        return igpv18.s() ? this.h() : igps0.k();
                    }
                    igpv igpv19 = igpv17.m();
                    igpv igpv20 = igpv19.h(igpv17);
                    igpv igpv21 = igpv19.h(igpv0);
                    igpv igpv22 = igpv18.m().d(igpv20).p(igpv21.d(igpv21));
                    igpv igpv23 = igpv21.p(igpv22).i(igpv18, igpv20, igpv1);
                    igpv igpv24 = z ? igpv17 : igpv17.h(igpv4);
                    igpv14 = z1 ? igpv24 : igpv24.h(igpv5);
                    if(igpv14 == igpv17) {
                        return v == 4 ? new igpy(igps0, igpv22, igpv23, new igpv[]{igpv14, this.a(igpv14, igpv19)}, this.f) : new igpy(igps0, igpv22, igpv23, new igpv[]{igpv14}, this.f);
                    }
                    return v == 4 ? new igpy(igps0, igpv22, igpv23, new igpv[]{igpv14, this.a(igpv14, null)}, this.f) : new igpy(igps0, igpv22, igpv23, new igpv[]{igpv14}, this.f);
                }
            }
        }
        return this.h();
    }

    @Override  // igpz
    public final igpz g() {
        if(!this.v()) {
            igps igps0 = this.b;
            return igps0.i == 0 ? new igpy(igps0, this.c, this.d.k(), this.f) : new igpy(igps0, this.c, this.d.k(), this.e, this.f);
        }
        return this;
    }

    @Override  // igpz
    public final igpz h() {
        igpv igpv25;
        igpv igpv24;
        boolean z2;
        igpv igpv23;
        igpv igpv17;
        if(!this.v()) {
            igps igps0 = this.b;
            igpv igpv0 = this.d;
            if(!igpv0.s()) {
                igpv igpv1 = this.c;
                switch(igps0.i) {
                    case 0: {
                        igpv igpv2 = igpy.p(igpv1.m()).d(this.b.e).f(igpv0.d(igpv0));
                        igpv igpv3 = igpv2.m().p(igpv1.d(igpv1));
                        return new igpy(igps0, igpv3, igpv2.h(igpv1.p(igpv3)).p(igpv0), this.f);
                    }
                    case 1: {
                        igpv igpv4 = this.e[0];
                        boolean z = igpv4.r();
                        igpv igpv5 = igps0.e;
                        igpv igpv6 = (igpv5.s() || z ? igps0.e : igpv5.h(igpv4.m())).d(igpy.p(igpv1.m()));
                        igpv igpv7 = z ? igpv0 : igpv0.h(igpv4);
                        igpv igpv8 = z ? igpv0.m() : igpv7.h(igpv0);
                        igpv igpv9 = igpy.o(igpv1.h(igpv8));
                        igpv igpv10 = igpv6.m().p(igpv9.d(igpv9));
                        igpv igpv11 = igpv7.d(igpv7);
                        igpv igpv12 = igpv10.h(igpv11);
                        igpv igpv13 = igpv8.d(igpv8);
                        igpv igpv14 = igpv9.p(igpv10).h(igpv6);
                        igpv igpv15 = igpv13.m();
                        igpv igpv16 = igpv14.p(igpv15.d(igpv15));
                        if(z) {
                            igpv17 = igpv13.d(igpv13);
                            return new igpy(igps0, igpv12, igpv16, new igpv[]{igpv17.d(igpv17).h(igpv7)}, this.f);
                        }
                        igpv17 = igpv11.m();
                        return new igpy(igps0, igpv12, igpv16, new igpv[]{igpv17.d(igpv17).h(igpv7)}, this.f);
                    }
                    case 2: {
                        igpv igpv18 = this.e[0];
                        boolean z1 = igpv18.r();
                        igpv igpv19 = igpv0.m();
                        igpv igpv20 = igpv19.m();
                        igpv igpv21 = igps0.e;
                        igpv igpv22 = igpv21.k();
                        if(igpv22.c().equals(BigInteger.valueOf(3L))) {
                            if(z1) {
                                igpv23 = igpv18;
                                z2 = true;
                            }
                            else {
                                igpv23 = igpv18.m();
                                z2 = false;
                            }
                            igpv24 = igpy.p(igpv1.d(igpv23).h(igpv1.p(igpv23)));
                            igpv25 = igpy.o(igpv19.h(igpv1));
                        }
                        else {
                            igpv igpv26 = igpy.p(igpv1.m());
                            if(z1) {
                                igpv24 = igpv26.d(igpv21);
                                z2 = true;
                            }
                            else if(igpv21.s()) {
                                z2 = false;
                                igpv24 = igpv26;
                            }
                            else {
                                igpv igpv27 = igpv18.m().m();
                                igpv24 = igpv22.a() >= igpv21.a() ? igpv26.d(igpv27.h(igpv21)) : igpv26.p(igpv27.h(igpv22));
                                z2 = false;
                            }
                            igpv25 = igpy.o(igpv1.h(igpv19));
                        }
                        igpv igpv28 = igpv24.m().p(igpv25.d(igpv25));
                        igpv igpv29 = igpv25.p(igpv28).h(igpv24).p(igpy.o(igpv20.d(igpv20)));
                        igpv igpv30 = igpv0.d(igpv0);
                        if(!z2) {
                            igpv30 = igpv30.h(igpv18);
                        }
                        return new igpy(igps0, igpv28, igpv29, new igpv[]{igpv30}, this.f);
                    }
                    case 4: {
                        return this.n(true);
                    }
                    default: {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                }
            }
            return igps0.k();
        }
        return this;
    }

    @Override  // igpz
    public final igpz i(igpz igpz0) {
        if(this == igpz0) {
            return this.l();
        }
        if(!this.v()) {
            if(igpz0.v()) {
                return this.h();
            }
            igpv igpv0 = this.d;
            if(!igpv0.s()) {
                igps igps0 = this.b;
                switch(igps0.i) {
                    case 0: {
                        igpv igpv1 = this.c;
                        igpv igpv2 = igpz0.c;
                        igpv igpv3 = igpz0.d;
                        igpv igpv4 = igpv2.p(igpv1);
                        igpv igpv5 = igpv3.p(igpv0);
                        if(igpv4.s()) {
                            return igpv5.s() ? this.l() : this;
                        }
                        igpv igpv6 = igpv4.m();
                        igpv igpv7 = igpv5.m();
                        igpv igpv8 = igpv6.h(igpv1.d(igpv1).d(igpv2)).p(igpv7);
                        if(igpv8.s()) {
                            return igps0.k();
                        }
                        igpv igpv9 = igpv8.h(igpv4).g();
                        igpv igpv10 = igpv8.h(igpv9).h(igpv5);
                        igpv igpv11 = igpv0.d(igpv0).h(igpv6).h(igpv4).h(igpv9).p(igpv10);
                        igpv igpv12 = igpv11.p(igpv10).h(igpv10.d(igpv11)).d(igpv2);
                        return new igpy(igps0, igpv12, igpv1.p(igpv12).h(igpv11).p(igpv0), this.f);
                    }
                    case 4: {
                        return this.n(false).f(igpz0);
                    }
                    default: {
                        return this.h().f(igpz0);
                    }
                }
            }
        }
        return igpz0;
    }

    @Override  // igpz
    protected final boolean j() {
        if(this.w()) {
            return this.d.t();
        }
        throw new IllegalStateException("point not in normal form");
    }

    protected final igpv k() {
        igpv[] arr_igpv = this.e;
        igpv igpv0 = arr_igpv[1];
        if(igpv0 == null) {
            igpv igpv1 = this.a(arr_igpv[0], null);
            arr_igpv[1] = igpv1;
            return igpv1;
        }
        return igpv0;
    }

    @Override  // igpz
    public final igpz l() {
        if(!this.v()) {
            igpv igpv0 = this.d;
            if(!igpv0.s()) {
                igps igps0 = this.b;
                switch(igps0.i) {
                    case 0: {
                        igpv igpv1 = this.c;
                        igpv igpv2 = igpv0.d(igpv0);
                        igpv igpv3 = igpv2.m();
                        igpv igpv4 = igpy.p(igpv1.m()).d(this.b.e);
                        igpv igpv5 = igpv4.m();
                        igpv igpv6 = igpy.p(igpv1).h(igpv3).p(igpv5);
                        if(igpv6.s()) {
                            return this.b.k();
                        }
                        igpv igpv7 = igpv6.h(igpv2).g();
                        igpv igpv8 = igpv6.h(igpv7).h(igpv4);
                        igpv igpv9 = igpv3.m().h(igpv7).p(igpv8);
                        igpv igpv10 = igpv9.p(igpv8).h(igpv8.d(igpv9)).d(igpv1);
                        return new igpy(igps0, igpv10, igpv1.p(igpv10).h(igpv9).p(igpv0), this.f);
                    }
                    case 4: {
                        return this.n(false).f(this);
                    }
                    default: {
                        return this.h().f(this);
                    }
                }
            }
        }
        return this;
    }

    @Override  // igpz
    public final igpz m(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("\'e\' cannot be negative");
        }
        if(v != 0 && !this.v()) {
            if(v == 1) {
                return this.h();
            }
            igps igps0 = this.b;
            igpv igpv0 = this.d;
            if(!igpv0.s()) {
                int v1 = igps0.i;
                igpv igpv1 = igps0.e;
                igpv igpv2 = this.c;
                igpv igpv3 = this.e.length > 0 ? this.e[0] : igps0.f(igpo.c);
                if(!igpv3.r()) {
                    switch(v1) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            igpv igpv4 = igpv3.m();
                            igpv2 = igpv2.h(igpv3);
                            igpv0 = igpv0.h(igpv4);
                            igpv1 = this.a(igpv3, igpv4);
                            break;
                        }
                        case 2: {
                            igpv1 = this.a(igpv3, null);
                            break;
                        }
                        case 4: {
                            igpv1 = this.k();
                            break;
                        }
                        default: {
                            throw new IllegalStateException("unsupported coordinate system");
                        }
                    }
                }
                int v2 = 0;
                while(v2 < v) {
                    if(igpv0.s()) {
                        return igps0.k();
                    }
                    igpv igpv5 = igpy.p(igpv2.m());
                    igpv igpv6 = igpv0.d(igpv0);
                    igpv igpv7 = igpv6.h(igpv0);
                    igpv igpv8 = igpv2.h(igpv7);
                    igpv igpv9 = igpv8.d(igpv8);
                    igpv igpv10 = igpv7.m();
                    igpv igpv11 = igpv10.d(igpv10);
                    if(!igpv1.s()) {
                        igpv5 = igpv5.d(igpv1);
                        igpv igpv12 = igpv11.h(igpv1);
                        igpv1 = igpv12.d(igpv12);
                    }
                    igpv igpv13 = igpv5.m().p(igpv9.d(igpv9));
                    igpv0 = igpv5.h(igpv9.p(igpv13)).p(igpv11);
                    igpv3 = igpv3.r() ? igpv6 : igpv6.h(igpv3);
                    ++v2;
                    igpv2 = igpv13;
                }
                switch(v1) {
                    case 0: {
                        igpv igpv14 = igpv3.g();
                        igpv igpv15 = igpv14.m();
                        igpv igpv16 = igpv15.h(igpv14);
                        return new igpy(igps0, igpv2.h(igpv15), igpv0.h(igpv16), this.f);
                    }
                    case 1: {
                        return new igpy(igps0, igpv2.h(igpv3), igpv0, new igpv[]{igpv3.h(igpv3.m())}, this.f);
                    }
                    case 2: {
                        return new igpy(igps0, igpv2, igpv0, new igpv[]{igpv3}, this.f);
                    }
                    default: {
                        if(v1 == 4) {
                            return new igpy(igps0, igpv2, igpv0, new igpv[]{igpv3, igpv1}, this.f);
                        }
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                }
            }
            return igps0.k();
        }
        return this;
    }

    protected final igpy n(boolean z) {
        igpv igpv14;
        igpv igpv0 = this.c;
        igpv igpv1 = this.d;
        igpv igpv2 = this.e[0];
        igpv igpv3 = this.k();
        igpv igpv4 = igpy.p(igpv0.m()).d(igpv3);
        igpv igpv5 = igpv1.d(igpv1);
        igpv igpv6 = igpv5.h(igpv1);
        igpv igpv7 = igpv0.h(igpv6);
        igpv igpv8 = igpv7.d(igpv7);
        igpv igpv9 = igpv4.m().p(igpv8.d(igpv8));
        igpv igpv10 = igpv6.m();
        igpv igpv11 = igpv10.d(igpv10);
        igpv igpv12 = igpv4.h(igpv8.p(igpv9)).p(igpv11);
        if(z) {
            igpv igpv13 = igpv11.h(igpv3);
            igpv14 = igpv13.d(igpv13);
        }
        else {
            igpv14 = null;
        }
        if(!igpv2.r()) {
            igpv5 = igpv5.h(igpv2);
        }
        return new igpy(this.b, igpv9, igpv12, new igpv[]{igpv5, igpv14}, this.f);
    }

    protected static igpv o(igpv igpv0) {
        igpv igpv1 = igpv0.d(igpv0);
        return igpv1.d(igpv1);
    }

    protected static igpv p(igpv igpv0) {
        return igpv0.d(igpv0).d(igpv0);
    }
}

