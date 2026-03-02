package com.google.android.libraries.messaging.lighter;

import android.content.Context;
import fiei;
import fiej;
import fier;
import flar;
import flas;
import flat;
import flau;
import flbc;
import flbe;
import flbj;
import flbv;
import flby;
import flbz;
import flce;
import fldt;
import fleb;
import flen;
import fleo;
import fler;
import flfy;
import flit;
import fliu;
import fljc;
import fljw;
import flkh;
import flky;
import flkz;
import flna;
import flnb;
import flnc;
import flqy;
import flrd;
import flsl;
import flvd;
import flvj;
import flvy;
import flvz;
import flwa;
import flwi;
import flwm;
import flws;
import fpjb;
import gfqx;
import gfsx;
import gged_interceptors;
import ggna;
import glzd;
import gmap;
import gpgz;
import java.util.HashMap;
import java.util.Map;

public final class Lighter {
    public final Context a;
    public final flsl b;
    public final flby c;
    public final flbv d;
    public final fljw e;
    public final flit f;
    public final flen g;
    public final fldt h;
    public final fliu i;
    public final flkh j;
    public final fleb k;
    private static Lighter l;
    private final flce m;
    private final flvd n;
    private final Map o;
    private final flau optionalLighterPackageInitializer;
    private final flky p;
    private final flfy q;
    private final flna r;
    private final flnc s;

    static {
    }

    private Lighter(Context context0, fiei fiei0, flbz flbz0, fiej fiej0, fier fier0, gfsx gfsx0, gpgz gpgz0, flbe flbe0, flau flau0, gfsx gfsx1, gfsx gfsx2, Map map0) {
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.m = flce.c();
        fpjb.f(context1);
        flnc flnc0 = new flnc(new flkz(context1));
        this.s = flnc0;
        flna flna0 = new flna(context1, flnc0);
        this.r = flna0;
        if(flbc.a == null) {
            flbc.a = new flbc(map0);
        }
        flsl flsl0 = flsl.a(context1);
        this.b = flsl0;
        flky flky0 = new flky(context1, flsl0, gfsx2, gfsx0);
        this.p = flky0;
        HashMap hashMap0 = new HashMap();
        this.o = hashMap0;
        if(gpgz0 == null) {
            flqy.a();
            flrd flrd0 = new flrd();
            this.n = new flvd(context1, new flvy(context1, null), flrd0);
        }
        else {
            flqy.a();
            flrd flrd1 = new flrd();
            this.n = new flvd(context1, new flvy(context1, gpgz0), flrd1);
        }
        flce flce0 = flce.c();
        flwm flwm0 = new flwm(context1, this.n, flce0);
        flwi flwi0 = new flwi(this.n, context1, hashMap0);
        flwa flwa0 = new flwa(this.n, context1);
        flvz flvz0 = new flvz(this.n);
        flfy flfy0 = new flfy(context1, flky0, flwi0);
        this.q = flfy0;
        fljw fljw0 = new fljw(hashMap0, flwm0, flna0, fiei0, fiej0, flsl0, fier0);
        flit flit0 = new flit(context1, flwi0, flky0, new fleo(flky0), hashMap0, fier0, flbe0, flsl0, flfy0);
        flen flen0 = new flen(context1, flky0, flwa0, flbe0, flsl0);
        flkh flkh0 = new flkh(flwi0, flky0);
        fldt fldt0 = new fldt(flky0, flvz0, new flnb(context1), flkh0);
        fljc fljc0 = new fljc(context1, flwi0, flna0, flky0, fier0);
        fler fler0 = new fler(flky0);
        this.n.g = fljw0;
        this.n.e = flbz0;
        flvj flvj0 = new flvj(this.n, context1, flsl0, hashMap0);
        if(fleb.a == null) {
            fleb.a = new fleb(flky0, flvj0, fldt0, flit0, flsl0);
        }
        flbj.a("LitBstrpCntrl", "Initializing BootstrapController Instance");
        fleb fleb0 = fleb.h();
        this.k = fleb0;
        fljw0.o = fleb0;
        fljw0.n = flit0;
        flit0.u = flen0;
        flit0.v = fldt0;
        flit0.w = flkh0;
        this.e = fljw0;
        this.f = flit0;
        this.g = flen0;
        this.h = fldt0;
        this.c = fljc0;
        this.d = fler0;
        this.i = new fliu();
        this.j = flkh0;
        this.optionalLighterPackageInitializer = flau0;
        gged_interceptors gged0 = flau0.a;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            flat flat0 = (flat)gged0.get(v1);
            for(Object object0: flat0.b(this.n, this.p, this.a)) {
                String s = ((flws)object0).c();
                this.o.put(s, ((flws)object0));
            }
            gged_interceptors gged1 = flat0.a();
            this.m.b(gged1);
        }
        glzd.f(this.e.c(), new flas(this), gmap.a);
    }

    public static Lighter a(Context context0, fiei fiei0, flbz flbz0, fiej fiej0, fier fier0, gpgz gpgz0, flbe flbe0, flau flau0, Map map0) {
        Lighter lighter0;
        synchronized(Lighter.class) {
            lighter0 = Lighter.c(context0, fiei0, flbz0, fiej0, fier0, gfqx.a, gpgz0, flbe0, flau0, gfqx.a, gfqx.a, gfqx.a, map0);
        }
        return lighter0;
    }

    public static Lighter b(Context context0, fiei fiei0, flbz flbz0, fiej fiej0, fier fier0, flau flau0, Map map0) {
        Lighter lighter0;
        synchronized(Lighter.class) {
            lighter0 = Lighter.c(context0, fiei0, flbz0, fiej0, fier0, gfqx.a, null, null, flau0, gfqx.a, gfqx.a, gfqx.a, map0);
        }
        return lighter0;
    }

    private static Lighter c(Context context0, fiei fiei0, flbz flbz0, fiej fiej0, fier fier0, gfsx gfsx0, gpgz gpgz0, flbe flbe0, flau flau0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3, Map map0) {
        Lighter lighter0;
        synchronized(Lighter.class) {
            lighter0 = Lighter.l;
            if(lighter0 == null) {
                Lighter lighter1 = new Lighter(context0, fiei0, flbz0, fiej0, fier0, gfsx0, gpgz0, flbe0, flau0, gfsx1, gfsx2, map0);
                Lighter.l = lighter1;
                if(lighter1.optionalLighterPackageInitializer != null) {
                    return lighter1;
                }
                lighter0 = lighter1;
            }
        }
        return lighter0;
    }

    @Override
    protected final void finalize() {
        glzd.f(this.e.c(), new flar(this), gmap.a);
    }
}

