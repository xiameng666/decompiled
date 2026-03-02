public final class igpx extends igpz {
    public igpx(igps igps0) {
        this(igps0, null, null, false);
    }

    public igpx(igps igps0, igpv igpv0, igpv igpv1, boolean z) {
        super(igps0, igpv0, igpv1);
        if((igpv0 == null ? 1 : 0) != (igpv1 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        if(igpv0 != null) {
            igpt.q(this.c, this.d);
            if(igps0 != null) {
                igpt.q(this.c, this.b.e);
            }
        }
        this.f = z;
    }

    public igpx(igps igps0, igpv igpv0, igpv igpv1, igpv[] arr_igpv, boolean z) {
        super(igps0, igpv0, igpv1, arr_igpv);
        this.f = z;
    }

    public final igpx a(int v) {
        if(!this.v()) {
            igps igps0 = this.b;
            igpv igpv0 = this.c;
            switch(igps0.i) {
                case 0: 
                case 5: {
                    igpv igpv1 = this.d;
                    return (igpx)igps0.h(igpv0.o(v), igpv1.o(v), this.f);
                }
                case 1: 
                case 6: {
                    igpv igpv2 = this.d;
                    igpv igpv3 = this.e[0];
                    return (igpx)igps0.i(igpv0.o(v), igpv2.o(v), new igpv[]{igpv3.o(v)}, this.f);
                }
                default: {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }
        return this;
    }

    @Override  // igpz
    public final igpz b(igpv igpv0) {
        if(this.v()) {
            return this;
        }
        switch(this.q()) {
            case 5: {
                igpv igpv1 = this.c;
                igpv igpv2 = this.d;
                igpv igpv3 = igpv1.h(igpv0);
                igpv igpv4 = igpv2.d(igpv1).f(igpv0).d(igpv3);
                return this.b.i(igpv1, igpv4, this.e, this.f);
            }
            case 6: {
                igpv igpv5 = this.c;
                igpv igpv6 = this.d;
                igpv igpv7 = this.e[0];
                igpv igpv8 = igpv5.h(igpv0.m());
                igpv igpv9 = igpv6.d(igpv5).d(igpv8);
                igpv[] arr_igpv = {igpv7.h(igpv0)};
                return this.b.i(igpv8, igpv9, arr_igpv, this.f);
            }
            default: {
                return super.b(igpv0);
            }
        }
    }

    @Override  // igpz
    public final igpz c(igpv igpv0) {
        if(this.v()) {
            return this;
        }
        if(this.q() != 5 && this.q() != 6) {
            return super.c(igpv0);
        }
        igpv igpv1 = this.c;
        igpv igpv2 = this.d.d(igpv1).h(igpv0).d(igpv1);
        return this.b.i(igpv1, igpv2, this.e, this.f);
    }

    @Override  // igpz
    protected final boolean d() {
        igpv igpv8;
        igpv igpv7;
        igpv igpv0 = this.c;
        igpv igpv1 = this.b.e;
        igpv igpv2 = this.b.f;
        int v = this.b.i;
        if(v == 6) {
            igpv igpv3 = this.e[0];
            boolean z = igpv3.r();
            if(igpv0.s()) {
                igpv igpv4 = this.d.m();
                if(!z) {
                    igpv2 = igpv2.h(igpv3.m());
                }
                return igpv4.equals(igpv2);
            }
            igpv igpv5 = this.d;
            igpv igpv6 = igpv0.m();
            if(z) {
                igpv7 = igpv5.m().d(igpv5).d(igpv1);
                igpv8 = igpv6.m().d(igpv2);
                return igpv7.h(igpv6).equals(igpv8);
            }
            igpv igpv9 = igpv3.m();
            igpv igpv10 = igpv9.m();
            igpv7 = igpv5.d(igpv3).j(igpv5, igpv1, igpv9);
            igpv8 = igpv6.n(igpv2, igpv10);
            return igpv7.h(igpv6).equals(igpv8);
        }
        igpv igpv11 = this.d;
        igpv igpv12 = igpv11.d(igpv0).h(igpv11);
        switch(v) {
            case 0: {
                break;
            }
            case 1: {
                igpv igpv13 = this.e[0];
                if(!igpv13.r()) {
                    igpv igpv14 = igpv13.h(igpv13.m());
                    igpv12 = igpv12.h(igpv13);
                    igpv1 = igpv1.h(igpv13);
                    igpv2 = igpv2.h(igpv14);
                }
                break;
            }
            default: {
                throw new IllegalStateException("unsupported coordinate system");
            }
        }
        return igpv12.equals(igpv0.d(igpv1).h(igpv0.m()).d(igpv2));
    }

    @Override  // igpz
    public final igpv e() {
        int v = this.q();
        if(v != 5 && v != 6) {
            return this.d;
        }
        igpv igpv0 = this.c;
        igpv igpv1 = this.d;
        if(!this.v() && !igpv0.s()) {
            igpv igpv2 = igpv1.d(igpv0).h(igpv0);
            if(v == 6) {
                igpv igpv3 = this.e[0];
                return igpv3.r() ? igpv2 : igpv2.f(igpv3);
            }
            return igpv2;
        }
        return igpv1;
    }

    @Override  // igpz
    public final igpz f(igpz igpz0) {
        igpv igpv25;
        igpv igpv24;
        igpv igpv23;
        if(this.v()) {
            return igpz0;
        }
        if(!igpz0.v()) {
            igps igps0 = this.b;
            igpv igpv0 = this.c;
            igpv igpv1 = igpz0.c;
            switch(igps0.i) {
                case 0: {
                    igpv igpv2 = this.d;
                    igpv igpv3 = igpz0.d;
                    igpv igpv4 = igpv0.d(igpv1);
                    igpv igpv5 = igpv2.d(igpv3);
                    if(igpv4.s()) {
                        return igpv5.s() ? this.h() : igps0.k();
                    }
                    igpv igpv6 = igpv5.f(igpv4);
                    igpv igpv7 = igpv6.m().d(igpv6).d(igpv4).d(igps0.e);
                    return new igpx(igps0, igpv7, igpv6.h(igpv0.d(igpv7)).d(igpv7).d(igpv2), this.f);
                }
                case 1: {
                    igpv igpv8 = this.d;
                    igpv igpv9 = this.e[0];
                    igpv igpv10 = igpz0.d;
                    igpv igpv11 = igpz0.e[0];
                    boolean z = igpv11.r();
                    igpv igpv12 = igpv9.h(igpv10).d((z ? igpv8 : igpv8.h(igpv11)));
                    igpv igpv13 = igpv9.h(igpv1).d((z ? igpv0 : igpv0.h(igpv11)));
                    if(igpv13.s()) {
                        return igpv12.s() ? this.h() : igps0.k();
                    }
                    igpv igpv14 = igpv13.m();
                    igpv igpv15 = igpv14.h(igpv13);
                    if(!z) {
                        igpv9 = igpv9.h(igpv11);
                    }
                    igpv igpv16 = igpv12.d(igpv13);
                    igpv igpv17 = igpv16.j(igpv12, igpv14, igps0.e).h(igpv9).d(igpv15);
                    igpv igpv18 = igpv13.h(igpv17);
                    if(!z) {
                        igpv14 = igpv14.h(igpv11);
                    }
                    return new igpx(igps0, igpv18, igpv12.j(igpv0, igpv13, igpv8).j(igpv14, igpv16, igpv17), new igpv[]{igpv15.h(igpv9)}, this.f);
                }
                case 6: {
                    if(igpv0.s()) {
                        return igpv1.s() ? igps0.k() : igpz0.f(this);
                    }
                    igpv igpv19 = this.d;
                    igpv igpv20 = this.e[0];
                    igpv igpv21 = igpz0.d;
                    igpv igpv22 = igpz0.e[0];
                    boolean z1 = igpv20.r();
                    if(z1) {
                        igpv23 = igpv1;
                        igpv24 = igpv21;
                    }
                    else {
                        igpv23 = igpv1.h(igpv20);
                        igpv24 = igpv21.h(igpv20);
                    }
                    boolean z2 = igpv22.r();
                    if(z2) {
                        igpv25 = igpv19;
                    }
                    else {
                        igpv0 = igpv0.h(igpv22);
                        igpv25 = igpv19.h(igpv22);
                    }
                    igpv igpv26 = igpv25.d(igpv24);
                    igpv igpv27 = igpv0.d(igpv23);
                    if(igpv27.s()) {
                        return igpv26.s() ? this.h() : igps0.k();
                    }
                    if(igpv1.s()) {
                        igpz igpz1 = this.t();
                        igpv igpv28 = igpz1.c;
                        igpv igpv29 = igpz1.e();
                        igpv igpv30 = igpv29.d(igpv21).f(igpv28);
                        igpv igpv31 = igpv30.m().d(igpv30).d(igpv28).d(igps0.e);
                        return igpv31.s() ? new igpx(igps0, igpv31, igps0.f.l(), this.f) : new igpx(igps0, igpv31, igpv30.h(igpv28.d(igpv31)).d(igpv31).d(igpv29).f(igpv31).d(igpv31), new igpv[]{igps0.f(igpo.c)}, this.f);
                    }
                    igpv igpv32 = igpv27.m();
                    igpv igpv33 = igpv26.h(igpv0);
                    igpv igpv34 = igpv26.h(igpv23);
                    igpv igpv35 = igpv33.h(igpv34);
                    if(igpv35.s()) {
                        return new igpx(igps0, igpv35, igps0.f.l(), this.f);
                    }
                    igpv igpv36 = igpv26.h(igpv32);
                    igpv igpv37 = z2 ? igpv36 : igpv36.h(igpv22);
                    igpv igpv38 = igpv34.d(igpv32).n(igpv37, igpv19.d(igpv20));
                    if(!z1) {
                        igpv37 = igpv37.h(igpv20);
                    }
                    return new igpx(igps0, igpv35, igpv38, new igpv[]{igpv37}, this.f);
                }
                default: {
                    throw new IllegalStateException("unsupported coordinate system");
                }
            }
        }
        return this;
    }

    @Override  // igpz
    public final igpz g() {
        if(!this.v()) {
            igpv igpv0 = this.c;
            if(!igpv0.s()) {
                switch(this.q()) {
                    case 0: {
                        return new igpx(this.b, igpv0, this.d.d(igpv0), this.f);
                    }
                    case 1: {
                        igpv igpv1 = this.d;
                        igpv igpv2 = this.e[0];
                        return new igpx(this.b, igpv0, igpv1.d(igpv0), new igpv[]{igpv2}, this.f);
                    }
                    case 5: {
                        return new igpx(this.b, igpv0, this.d.e(), this.f);
                    }
                    case 6: {
                        igpv igpv3 = this.d;
                        igpv igpv4 = this.e[0];
                        return new igpx(this.b, igpv0, igpv3.d(igpv4), new igpv[]{igpv4}, this.f);
                    }
                    default: {
                        throw new IllegalStateException("unsupported coordinate system");
                    }
                }
            }
        }
        return this;
    }

    @Override  // igpz
    public final igpz h() {
        if(!this.v()) {
            igps igps0 = this.b;
            igpv igpv0 = this.c;
            if(!igpv0.s()) {
                switch(igps0.i) {
                    case 0: {
                        igpv igpv1 = this.d.f(igpv0).d(igpv0);
                        igpv igpv2 = igpv1.m().d(igpv1).d(igps0.e);
                        return new igpx(igps0, igpv2, igpv0.n(igpv2, igpv1.e()), this.f);
                    }
                    case 1: {
                        igpv igpv3 = this.d;
                        igpv igpv4 = this.e[0];
                        boolean z = igpv4.r();
                        igpv igpv5 = z ? igpv0 : igpv0.h(igpv4);
                        if(!z) {
                            igpv3 = igpv3.h(igpv4);
                        }
                        igpv igpv6 = igpv0.m();
                        igpv igpv7 = igpv6.d(igpv3);
                        igpv igpv8 = igpv5.m();
                        igpv igpv9 = igpv7.d(igpv5);
                        igpv igpv10 = igpv9.j(igpv7, igpv8, igps0.e);
                        return new igpx(igps0, igpv5.h(igpv10), igpv6.m().j(igpv5, igpv10, igpv9), new igpv[]{igpv5.h(igpv8)}, this.f);
                    }
                    case 6: {
                        igpv igpv11 = this.d;
                        igpv igpv12 = this.e[0];
                        boolean z1 = igpv12.r();
                        igpv igpv13 = z1 ? igpv11 : igpv11.h(igpv12);
                        igpv igpv14 = z1 ? igpv12 : igpv12.m();
                        igpv igpv15 = igps0.e;
                        igpv igpv16 = z1 ? igpv15 : igpv15.h(igpv14);
                        igpv igpv17 = igpv11.m().d(igpv13).d(igpv16);
                        if(igpv17.s()) {
                            return new igpx(igps0, igpv17, igps0.f.l(), this.f);
                        }
                        igpv igpv18 = igpv17.m();
                        igpv igpv19 = z1 ? igpv17 : igpv17.h(igpv14);
                        igpv igpv20 = igps0.f;
                        if(igpv20.a() < igps0.d() >> 1) {
                            igpv igpv21 = igpv11.d(igpv0).m();
                            igpv igpv22 = igpv20.r() ? igpv16.d(igpv14).m() : igpv16.n(igpv20, igpv14.m());
                            igpv igpv23 = igpv21.d(igpv17).d(igpv14).h(igpv21).d(igpv22).d(igpv18);
                            if(igpv15.s()) {
                                return new igpx(igps0, igpv18, igpv23.d(igpv19), new igpv[]{igpv19}, this.f);
                            }
                            return igpv15.r() ? new igpx(igps0, igpv18, igpv23, new igpv[]{igpv19}, this.f) : new igpx(igps0, igpv18, igpv23.d(igpv15.e().h(igpv19)), new igpv[]{igpv19}, this.f);
                        }
                        if(!z1) {
                            igpv0 = igpv0.h(igpv12);
                        }
                        return new igpx(igps0, igpv18, igpv0.n(igpv17, igpv13).d(igpv18).d(igpv19), new igpv[]{igpv19}, this.f);
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
        if(!this.v()) {
            if(igpz0.v()) {
                return this.h();
            }
            igps igps0 = this.b;
            igpv igpv0 = this.c;
            if(!igpv0.s()) {
                if(igps0.i != 6) {
                    return this.h().f(igpz0);
                }
                igpv igpv1 = igpz0.c;
                igpv igpv2 = igpz0.e[0];
                if(!igpv1.s() && igpv2.r()) {
                    igpv igpv3 = this.d;
                    igpv igpv4 = this.e[0];
                    igpv igpv5 = igpz0.d;
                    igpv igpv6 = igpv0.m();
                    igpv igpv7 = igpv3.m();
                    igpv igpv8 = igpv4.m();
                    igpv igpv9 = igpv3.h(igpv4);
                    igpv igpv10 = igps0.e.h(igpv8).d(igpv7).d(igpv9);
                    igpv igpv11 = igpv5.e();
                    igpv igpv12 = igps0.e.d(igpv11).h(igpv8).d(igpv7).j(igpv10, igpv6, igpv8);
                    igpv igpv13 = igpv1.h(igpv8);
                    igpv igpv14 = igpv13.d(igpv10).m();
                    if(igpv14.s()) {
                        return igpv12.s() ? igpz0.h() : igps0.k();
                    }
                    if(igpv12.s()) {
                        return new igpx(igps0, igpv12, igps0.f.l(), this.f);
                    }
                    igpv igpv15 = igpv12.m().h(igpv13);
                    igpv igpv16 = igpv12.h(igpv14).h(igpv8);
                    return new igpx(igps0, igpv15, igpv12.d(igpv14).m().j(igpv10, igpv11, igpv16), new igpv[]{igpv16}, this.f);
                }
                return this.h().f(igpz0);
            }
        }
        return igpz0;
    }

    @Override  // igpz
    protected final boolean j() {
        igpv igpv0 = this.c;
        if(!igpv0.s()) {
            igpv igpv1 = this.d;
            return this.q() == 5 || this.q() == 6 ? igpv1.t() != igpv0.t() : igpv1.f(igpv0).t();
        }
        return false;
    }
}

