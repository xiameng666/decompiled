import j..util.Map.-EL;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ghas implements ghbk, Serializable, Comparable {
    public static final ghab a;
    public static final ggyy b;
    public static final ggyy c;
    public final List d;
    public transient ghde e;
    public int f;
    private ggzx g;
    private final AtomicInteger h;

    static {
        ghas.a = new ghab(new ghae[0]);
        ghas.b = (/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            ggxe ggxe0 = new ggxe(ggxg.c(ggxh0, ggxj0));
            int v = ggxe0.a();
            int v1 = 0;
            switch(v) {
                case 1: {
                    ghas ghas0 = new ghas();
                    ghas0.k();
                    ggxe0.a();
                    ggxe0.a();
                    int v2 = ggxe0.c();
                    if(v2 < 0) {
                        throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v2);
                    }
                    ghas0.f = 0;
                    int v3 = 0;
                    while(v3 < v2) {
                        int v4 = ggxe0.a();
                        if(v4 != 1) {
                            throw new IOException("Unknown S2Loop encoding version encountered during decoding: " + v4);
                        }
                        int v5 = ggxe0.c();
                        if(v5 < 0) {
                            throw new IOException(a.f(v5, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                        }
                        ArrayList arrayList0 = new ArrayList(v5);
                        for(int v6 = 0; v6 < v5; ++v6) {
                            arrayList0.add(new ghae(ggxe0.b(), ggxe0.b(), ggxe0.b()));
                        }
                        boolean z = ggxe0.a() != 0;
                        int v7 = ggxe0.c();
                        ghab ghab0 = new ghab(arrayList0, z, ggzx.c(ggxe0));
                        ghab0.h = v7;
                        if(v5 > 0) {
                            ghab0.q();
                        }
                        if(!ghas.g(ghab0)) {
                            ghas0.f += ghab0.d;
                            ghas0.d.add(ghab0);
                        }
                        ++v3;
                        continue;
                    }
                    ggzx ggzx0 = ggzx.c(ggxe0);
                    ghas0.g = ggzx0;
                    ggzd.a(ggzx0);
                    ghas0.l();
                    return ghas0;
                }
                case 4: {
                    int v8 = ggxe0.a();
                    if(v8 > 30 || v8 < 0) {
                        throw new IOException("Invalid level " + v8);
                    }
                    int v9 = ggxe0.d();
                    if(v9 < 0) {
                        throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v9);
                    }
                    ghas ghas1 = new ghas();
                    ghas1.k();
                    while(v1 < v9) {
                        int v10 = ggxe0.d();
                        if(v10 < 0) {
                            throw new IOException(a.f(v10, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                        }
                        List list0 = ghaj.a(v10, v8, ggxe0);
                        long v11 = ggxe0.f();
                        int v12 = ggxe0.d();
                        ghab ghab1 = ghaa.a(ggzz.b, v11) ? new ghab(list0, ghaa.a(ggzz.a, v11), ggzx.c(ggxe0)) : new ghab(list0);
                        ghab1.h = v12;
                        if(!ghas.g(ghab1)) {
                            ghas1.d.add(ghab1);
                        }
                        ++v1;
                        continue;
                    }
                    ghas1.n();
                    return ghas1;
                }
                default: {
                    throw new IOException("Unsupported S2Polygon encoding version " + v);
                }
            }
        };
        ghas.c = (/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            ggxe ggxe0 = new ggxe(ggxg.c(ggxh0, ggxj0));
            int v = ggxe0.a();
            int v1 = 0;
            switch(v) {
                case 1: {
                    ghas ghas0 = new ghas();
                    ghas0.k();
                    ggxe0.a();
                    ggxe0.a();
                    int v2 = ggxe0.c();
                    if(v2 < 0) {
                        throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v2);
                    }
                    ghas0.f = 0;
                    int v3 = 0;
                    while(v3 < v2) {
                        int v4 = ggxe0.a();
                        if(v4 != 1) {
                            throw new IOException("Unknown S2Loop encoding version encountered during decoding: " + v4);
                        }
                        int v5 = ggxe0.c();
                        if(v5 < 0) {
                            throw new IOException(a.f(v5, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                        }
                        ArrayList arrayList0 = new ArrayList(v5);
                        for(int v6 = 0; v6 < v5; ++v6) {
                            arrayList0.add(new ghae(ggxe0.b(), ggxe0.b(), ggxe0.b()));
                        }
                        boolean z = ggxe0.a() != 0;
                        int v7 = ggxe0.c();
                        ghab ghab0 = new ghab(arrayList0, z, ggzx.c(ggxe0));
                        ghab0.h = v7;
                        if(v5 > 0) {
                            ghab0.q();
                        }
                        if(!ghas.g(ghab0)) {
                            ghas0.f += ghab0.d;
                            ghas0.d.add(ghab0);
                        }
                        ++v3;
                        continue;
                    }
                    ggzx ggzx0 = ggzx.c(ggxe0);
                    ghas0.g = ggzx0;
                    ggzd.a(ggzx0);
                    ghas0.l();
                    return ghas0;
                }
                case 4: {
                    int v8 = ggxe0.a();
                    if(v8 > 30 || v8 < 0) {
                        throw new IOException("Invalid level " + v8);
                    }
                    int v9 = ggxe0.d();
                    if(v9 < 0) {
                        throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v9);
                    }
                    ghas ghas1 = new ghas();
                    ghas1.k();
                    while(v1 < v9) {
                        int v10 = ggxe0.d();
                        if(v10 < 0) {
                            throw new IOException(a.f(v10, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                        }
                        List list0 = ghaj.a(v10, v8, ggxe0);
                        long v11 = ggxe0.f();
                        int v12 = ggxe0.d();
                        ghab ghab1 = ghaa.a(ggzz.b, v11) ? new ghab(list0, ghaa.a(ggzz.a, v11), ggzx.c(ggxe0)) : new ghab(list0);
                        ghab1.h = v12;
                        if(!ghas.g(ghab1)) {
                            ghas1.d.add(ghab1);
                        }
                        ++v1;
                        continue;
                    }
                    ghas1.n();
                    return ghas1;
                }
                default: {
                    throw new IOException("Unsupported S2Polygon encoding version " + v);
                }
            }
        };
    }

    public ghas() {
        this.d = new ArrayList();
        this.h = new AtomicInteger();
        this.f = 0;
        this.g = ggzx.d();
        ggzx.d();
        this.l();
    }

    // This method was un-flattened
    public ghas(List list0) {
        List list2;
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        this.h = new AtomicInteger();
        this.f = 0;
        if(list0.size() == 1) {
            ghab ghab0 = (ghab)list0.get(0);
            this.k();
            if(ghas.g(ghab0)) {
                this.n();
            }
            else {
                arrayList0.add(ghab0);
                ghab ghab1 = (ghab)arrayList0.get(0);
                ghab1.h = 0;
                this.f = ghab1.d;
                this.g = ghab1.e;
                this.l();
            }
        }
        else {
            this.k();
            IdentityHashMap identityHashMap0 = new IdentityHashMap();
            ghab ghab2 = ghas.a;
            identityHashMap0.put(ghab2, new ArrayList());
            for(Object object0: list0) {
                ghab ghab3 = (ghab)object0;
                if(!ghas.g(ghab3)) {
                    List list1 = (List)Map.-EL.computeIfAbsent(identityHashMap0, ghab3, new ghak());
                    ghab ghab4 = ghab2;
                    while(true) {
                        list2 = (List)identityHashMap0.get(ghab4);
                        Iterator iterator1 = list2.iterator();
                    label_31:
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object1 = iterator1.next();
                        ghab ghab5 = (ghab)object1;
                        if(ghab5.t(ghab3)) {
                            ghab4 = ghab5;
                            continue;
                        }
                        goto label_31;
                    }
                    int v = 0;
                    while(v < list2.size()) {
                        ghab ghab6 = (ghab)list2.get(v);
                        if(ghab3.t(ghab6)) {
                            list1.add(ghab6);
                            list2.remove(v);
                        }
                        else {
                            ++v;
                        }
                    }
                    list2.add(ghab3);
                }
            }
            for(Object object2: identityHashMap0.values()) {
                Collections.sort(((List)object2));
            }
            ArrayDeque arrayDeque0 = new ArrayDeque();
            arrayDeque0.addFirst(ghab2);
            int v1 = -1;
            while(!arrayDeque0.isEmpty()) {
                ghab ghab7 = (ghab)arrayDeque0.removeFirst();
                if(ghab7 != ghab2) {
                    v1 = ghab7.h;
                    this.d.add(ghab7);
                }
                List list3 = (List)identityHashMap0.get(ghab7);
                for(int v2 = list3.size() - 1; v2 >= 0; --v2) {
                    ghab ghab8 = (ghab)list3.get(v2);
                    ghab8.h = v1 + 1;
                    arrayDeque0.addFirst(ghab8);
                }
            }
            this.n();
        }
        list0.clear();
    }

    public final int a() {
        return this.d.size();
    }

    public final ghab b(int v) {
        return (ghab)this.d.get(v);
    }

    public final ghar c() {
        if(this.a() > 5) {
            int[] arr_v = new int[this.a()];
            int v1 = 0;
            for(int v = 0; true; ++v) {
                List list0 = this.d;
                if(v >= list0.size()) {
                    break;
                }
                arr_v[v] = v1;
                v1 += ((ghab)list0.get(v)).d;
            }
            return new gham(this, this, arr_v);
        }
        return new ghan(this, this);
    }

    @Override
    public final int compareTo(Object object0) {
        if(this.a() != ((ghas)object0).a()) {
            return this.a() - ((ghas)object0).a();
        }
        for(int v = 0; v < this.a(); ++v) {
            int v1 = ((ghab)this.d.get(v)).a(((ghab)((ghas)object0).d.get(v)));
            if(v1 != 0) {
                return v1;
            }
        }
        return 0;
    }

    // Detected as a lambda impl.
    public static ghas d(InputStream inputStream0) {
        ggxe ggxe0 = new ggxe(inputStream0);
        int v = ggxe0.a();
        int v1 = 0;
        switch(v) {
            case 1: {
                ghas ghas0 = new ghas();
                ghas0.k();
                ggxe0.a();
                ggxe0.a();
                int v2 = ggxe0.c();
                if(v2 < 0) {
                    throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v2);
                }
                ghas0.f = 0;
                int v3 = 0;
                while(v3 < v2) {
                    int v4 = ggxe0.a();
                    if(v4 != 1) {
                        throw new IOException("Unknown S2Loop encoding version encountered during decoding: " + v4);
                    }
                    int v5 = ggxe0.c();
                    if(v5 < 0) {
                        throw new IOException(a.f(v5, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                    }
                    ArrayList arrayList0 = new ArrayList(v5);
                    for(int v6 = 0; v6 < v5; ++v6) {
                        arrayList0.add(new ghae(ggxe0.b(), ggxe0.b(), ggxe0.b()));
                    }
                    boolean z = ggxe0.a() != 0;
                    int v7 = ggxe0.c();
                    ghab ghab0 = new ghab(arrayList0, z, ggzx.c(ggxe0));
                    ghab0.h = v7;
                    if(v5 > 0) {
                        ghab0.q();
                    }
                    if(!ghas.g(ghab0)) {
                        ghas0.f += ghab0.d;
                        ghas0.d.add(ghab0);
                    }
                    ++v3;
                    continue;
                }
                ggzx ggzx0 = ggzx.c(ggxe0);
                ghas0.g = ggzx0;
                ggzd.a(ggzx0);
                ghas0.l();
                return ghas0;
            }
            case 4: {
                int v8 = ggxe0.a();
                if(v8 > 30 || v8 < 0) {
                    throw new IOException("Invalid level " + v8);
                }
                int v9 = ggxe0.d();
                if(v9 < 0) {
                    throw new IOException("Can only decode polygons with up to 2^31 - 1 loops. Got " + v9);
                }
                ghas ghas1 = new ghas();
                ghas1.k();
                while(v1 < v9) {
                    int v10 = ggxe0.d();
                    if(v10 < 0) {
                        throw new IOException(a.f(v10, "Invalid numVertices: ", ". Loops with more than 2^31 - 1 vertices are not supported."));
                    }
                    List list0 = ghaj.a(v10, v8, ggxe0);
                    long v11 = ggxe0.f();
                    int v12 = ggxe0.d();
                    ghab ghab1 = ghaa.a(ggzz.b, v11) ? new ghab(list0, ghaa.a(ggzz.a, v11), ggzx.c(ggxe0)) : new ghab(list0);
                    ghab1.h = v12;
                    if(!ghas.g(ghab1)) {
                        ghas1.d.add(ghab1);
                    }
                    ++v1;
                    continue;
                }
                ghas1.n();
                return ghas1;
            }
            default: {
                throw new IOException("Unsupported S2Polygon encoding version " + v);
            }
        }
    }

    public final boolean e(ghae ghae0) {
        if(!this.e.g && !this.g.p(ghae0)) {
            return false;
        }
        if(this.f > 0x20 && (this.e.g || this.h.decrementAndGet() <= 0)) {
            return new ggza(this.e).a(ghae0);
        }
        int v1 = 0;
        for(int v = 0; v < this.a(); ++v) {
            v1 ^= this.b(v).r(ghae0);
        }
        return v1 != 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof ghas)) {
            if(this.a() != ((ghas)object0).a()) {
                return false;
            }
            if(this.f != ((ghas)object0).f) {
                return false;
            }
            int v = 0;
            while(v < this.a()) {
                ghab ghab0 = this.b(v);
                ghab ghab1 = ((ghas)object0).b(v);
                if(ghab1.h == ghab0.h) {
                    if(!ghab1.equals(ghab0)) {
                        return false;
                    }
                    ++v;
                    continue;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override  // ghbk
    public final ggyh f() {
        return this.g.f();
    }

    public static boolean g(ghab ghab0) {
        return ghab0.d == 1 && ghab0.k(0).t(ghab.a);
    }

    @Override  // ghbk
    public final boolean h(ggyi ggyi0) {
        return new ghdf(this.e).h(ggyi0);
    }

    @Override
    public final int hashCode() {
        return this.g.hashCode();
    }

    public static boolean i(ghab ghab0) {
        return ghab0.d == 1 && ghab0.k(0).t(ghab.b);
    }

    public final boolean j() {
        return this.d.isEmpty();
    }

    private final void k() {
        this.d.clear();
        ghde ghde0 = this.e;
        if(ghde0 != null) {
            ghde0.d = ggna.a;
            ghde0.f.clear();
            ghde0.c.clear();
            ghde0.g = false;
            ghde0.e = 0;
        }
        this.f = 0;
        this.g = ggzx.d();
        ggzx.d();
    }

    private final void l() {
        if(this.e == null) {
            this.e = new ghde();
        }
        this.e.d(this.c());
        int v = this.f;
        int v1 = 10;
        if(v > 8) {
            if(v <= 0x2000) {
                v1 = 50;
            }
            else if(v > 50000) {
                v1 = 2;
            }
        }
        this.h.set(v1);
    }

    @Override  // ghbk
    public final boolean m(ggyi ggyi0) {
        return new ghdf(this.e).m(ggyi0);
    }

    private final void n() {
        this.f = 0;
        ggzw ggzw0 = ggzw.c();
        for(Object object0: this.d) {
            ghab ghab0 = (ghab)object0;
            if(ghab0.h == 0) {
                ggzw0.g(ghab0.e);
            }
            this.f += ghab0.d;
        }
        ggzx ggzx0 = ggzw0.d();
        this.g = ggzx0;
        ggzd.a(ggzx0);
        this.l();
    }

    private Object readResolve() {
        this.l();
        return this;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Polygon: (");
        stringBuilder0.append(this.a());
        stringBuilder0.append(") loops:\n");
        for(int v = 0; v < this.a(); ++v) {
            ghab ghab0 = this.b(v);
            stringBuilder0.append("loop with depth ");
            stringBuilder0.append(ghab0.h);
            stringBuilder0.append(" <\n");
            for(int v1 = 0; v1 < ghab0.d; ++v1) {
                stringBuilder0.append(ghab0.k(v1).s());
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(">\n");
        }
        return stringBuilder0.toString();
    }
}

