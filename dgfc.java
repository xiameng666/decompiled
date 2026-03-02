import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class dgfc {
    public final int a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final Map g;
    public List h;
    public final Map i;
    public final boolean j;
    private final ibnn k;
    private final ibnn l;

    public dgfc(int v, String s, List list0, List list1, List list2, List list3) {
        this.a = v;
        this.b = s;
        this.c = list0;
        this.d = list1;
        this.e = list2;
        this.f = list3;
        if(list0.isEmpty() && list1.isEmpty() && list2.isEmpty() && list3.isEmpty()) {
            throw new IllegalArgumentException("Must have metadata to create an introduction.");
        }
        this.g = new LinkedHashMap();
        this.k = new ibnz(new dgev(this));
        this.h = ibps.a;
        dgfa dgfa0 = new dgfa(this);
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(dgfa0, 10)), 16));
        for(Object object0: dgfa0) {
            ibns ibns0 = new ibns(((long)((dgey)object0).b), ((long)((dgey)object0).e));
            linkedHashMap0.put(ibns0.a, ibns0.b);
        }
        this.i = linkedHashMap0;
        this.l = new ibnz(new dgew(this));
        boolean z = false;
        if(!this.c.isEmpty()) {
            List list4 = this.c;
            if(!list4.isEmpty()) {
                for(Object object1: list4) {
                    if(((dgfl)object1).g != 0L) {
                        continue;
                    }
                    goto label_32;
                }
            }
            z = true;
        }
    label_32:
        this.j = z;
    }

    public final float a() {
        return ibwt.e(((float)this.b()) * 100.0f / ((float)this.d()), 100.0f);
    }

    public final long b() {
        long v1;
        long v = 0L;
        for(Object object0: new dgfa(this)) {
            dgey dgey0 = (dgey)object0;
            dgfu dgfu0 = dgey0.d;
            if((dgfu0 instanceof dgft)) {
                v1 = ((dgft)dgfu0).a;
                v += v1;
                continue;
            }
            if(!ibuq.m(dgfu0, dgfs.a)) {
                throw new ibnq();
            }
            v1 = dgey0.e;
            v += v1;
            continue;
        }
        return v;
    }

    public final long c() {
        return this.d() - this.b();
    }

    public final long d() {
        return ((Number)this.l.a()).longValue();
    }

    public final cuwu e(long v) {
        Object object0 = this.g.get(Long.valueOf(v));
        if(object0 != null) {
            return (cuwu)object0;
        }
        throw new IllegalArgumentException(a.D(v, "Payload (id=", ") doesn\'t exist."));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof dgfc)) {
            return false;
        }
        if(this.a != ((dgfc)object0).a) {
            return false;
        }
        if(!ibuq.m(this.b, ((dgfc)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((dgfc)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((dgfc)object0).d)) {
            return false;
        }
        return ibuq.m(this.e, ((dgfc)object0).e) ? ibuq.m(this.f, ((dgfc)object0).f) : false;
    }

    public final Long f(long v, dgfu dgfu0) {
        for(Object object0: new dgfa(this)) {
            if(((dgey)object0).b != v) {
                continue;
            }
            goto label_6;
        }
        object0 = null;
    label_6:
        if(((dgey)object0) == null) {
            return null;
        }
        dgeo dgeo0 = ((dgey)object0).a;
        if((dgeo0 instanceof dgfl)) {
            ((dgfl)dgeo0).j = dgfu0;
        }
        if((dgeo0 instanceof dggj)) {
            ((dggj)dgeo0).g = dgfu0;
        }
        if((dgeo0 instanceof dggo)) {
            ((dggo)dgeo0).e = dgfu0;
        }
        dgem dgem0 = ((dgey)object0).c;
        if(dgem0 != null) {
            dgem0.e = dgfu0;
        }
        return dgeo0.a();
    }

    public final Set g() {
        List list0 = ibpo.ak(ibpo.ak(ibpo.ak(this.c, this.d), this.e), this.f);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(((dgeo)object0).d()) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(Long.valueOf(((dgeo)object1).a()));
        }
        return ibpo.ay(arrayList1);
    }

    public final Set h() {
        List list0 = ibpo.ak(ibpo.ak(ibpo.ak(this.c, this.d), this.e), this.f);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!((dgeo)object0).d()) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object1: arrayList0) {
            arrayList1.add(Long.valueOf(((dgeo)object1).a()));
        }
        return ibpo.ay(arrayList1);
    }

    @Override
    public final int hashCode() {
        return this.b == null ? (((this.a * 0x1F * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode() : ((((this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode()) * 0x1F + this.f.hashCode();
    }

    public final Set i() {
        return (Set)this.k.a();
    }

    public final boolean j(long v) {
        return this.g.containsKey(Long.valueOf(v));
    }

    public final boolean k(cuwu cuwu0) {
        for(Object object0: this.f) {
            dgen dgen0 = (dgen)object0;
            ArrayList arrayList0 = new ArrayList(ibpo.q(dgen0.e, 10));
            for(Object object1: dgen0.e) {
                arrayList0.add(Long.valueOf(((dgem)object1).b));
            }
            if(arrayList0.contains(Long.valueOf(cuwu0.i)) && cuwu0.o && !dgen0.f) {
                dgen0.f = true;
            }
        }
        Set set0 = this.i();
        Long long0 = (long)cuwu0.i;
        if(set0.contains(long0)) {
            this.g.put(long0, cuwu0);
            return true;
        }
        return false;
    }

    public final List l() {
        dgfa dgfa0 = new dgfa(this);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: dgfa0) {
            dgey dgey0 = (dgey)object0;
            if(!dgey0.a.d() && (dgey0.c == null || (dgey0.c.e instanceof dgft))) {
                arrayList0.add(object0);
            }
        }
        List list0 = ibpo.ap(arrayList0, 1);
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object1: list0) {
            list1.add(new dgep(((dgey)object1).a, ((dgey)object1).b));
        }
        return list1;
    }

    @Override
    public final String toString() {
        return "ContentIntroduction(useCase=" + this.a + ", requiredPackage=" + this.b + ", fileMetadataList=" + this.c + ", textMetadataList=" + this.d + ", wifiCredentialsMetadataList=" + this.e + ", appMetadataList=" + this.f + ")";
    }
}

