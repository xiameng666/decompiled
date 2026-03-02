import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class bma extends blt {
    public final StringBuilder j;
    public boolean k;
    public final List l;
    private final bre m;
    private boolean n;

    public bma() {
        this.m = new bre();
        this.n = true;
        this.j = new StringBuilder();
        this.k = false;
        this.l = new ArrayList();
    }

    @Override  // blt
    public final bmb a() {
        if(!this.n) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList0 = new ArrayList(this.a);
        if(this.m.a) {
            Collections.sort(arrayList0, new brd());
        }
        blz blz0 = null;
        if(this.h == 1) {
            bjm bjm0 = this.b;
            if(arrayList0.size() == 2 && !arrayList0.isEmpty()) {
                Iterator iterator0 = arrayList0.iterator();
            label_9:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    ibuq.e(((bly)object0).a, "getSurface(...)");
                    if(bqj.a(((bly)object0).a)) {
                        Set set0 = bjm0.a;
                        if(!set0.isEmpty()) {
                            for(Object object1: set0) {
                                ibuq.c(((bka)object1));
                                if(!bqj.a(((bka)object1))) {
                                    continue;
                                }
                                break label_9;
                            }
                        }
                        Range range0 = bjm0.a();
                        if(range0 != null) {
                            if(((Number)range0.getUpper()).intValue() < 120 || !ibuq.m(range0.getLower(), range0.getUpper())) {
                                range0 = null;
                            }
                            if(range0 != null) {
                                Objects.toString(range0);
                                bcs.h("HighSpeedFpsModifier");
                                bjm0.i(new Range(((int)30), range0.getUpper()));
                            }
                        }
                        break;
                    }
                }
            }
        }
        if(!this.l.isEmpty()) {
            blz0 = new blz(this);
        }
        return new bmb(arrayList0, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.b(), blz0, this.g, this.h, this.i);
    }

    public final void s(bmb bmb0) {
        bjo bjo0 = bmb0.g;
        int v = bjo0.f;
        if(v != -1) {
            this.k = true;
            bjm bjm0 = this.b;
            bjm0.b = bmb.a(v, bjm0.b);
        }
        Range range0 = bjo0.d();
        Range range1 = bmi.a;
        if(!range0.equals(range1)) {
            bjm bjm1 = this.b;
            if(bjm1.a().equals(range1)) {
                bjm1.i(range0);
            }
            else if(!bjm1.a().equals(range0)) {
                this.n = false;
                String s = "Different ExpectedFrameRateRange values; current = " + bjm1.a() + ", new = " + range0;
                bcs.a("ValidatingBuilder", s);
                this.j.append(s);
            }
        }
        int v1 = bjo0.b();
        if(v1 != 0) {
            this.b.k(v1);
        }
        int v2 = bjo0.c();
        if(v2 != 0) {
            this.b.l(v2);
        }
        bjm bjm2 = this.b;
        bjm2.e.b.putAll(bjo0.j.b);
        this.c.addAll(bmb0.c);
        this.d.addAll(bmb0.d);
        bjm2.c(bmb0.f());
        this.e.addAll(bmb0.e);
        blv blv0 = bmb0.f;
        if(blv0 != null) {
            this.l.add(blv0);
        }
        InputConfiguration inputConfiguration0 = bmb0.i;
        if(inputConfiguration0 != null) {
            this.g = inputConfiguration0;
        }
        Set set0 = this.a;
        set0.addAll(bmb0.a);
        Set set1 = bjm2.a;
        set1.addAll(bjo0.e());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: set0) {
            arrayList0.add(((bly)object0).a);
            for(Object object1: ((bly)object0).b) {
                arrayList0.add(((bka)object1));
            }
        }
        if(!arrayList0.containsAll(set1)) {
            bcs.h("ValidatingBuilder");
            this.n = false;
            this.j.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int v3 = bmb0.h;
        if(v3 != this.h && v3 != 0 && this.h != 0) {
            bcs.h("ValidatingBuilder");
            this.n = false;
            this.j.append("Invalid configuration due to that two non-default session types are set");
        }
        else if(v3 != 0) {
            this.h = v3;
        }
        bly bly0 = bmb0.b;
        if(bly0 != null) {
            if(this.i != bly0 && this.i != null) {
                bcs.h("ValidatingBuilder");
                this.n = false;
                this.j.append("Invalid configuration due to that two different postview output configs are set");
            }
            else {
                this.i = bly0;
            }
        }
        bjm2.f(bjo0.e);
    }

    public final boolean t() {
        return this.k && this.n;
    }
}

