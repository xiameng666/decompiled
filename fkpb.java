import android.util.Log;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class fkpb {
    public final gdwl a;
    public boolean b;
    private final bxf c;
    private final bxd d;
    private final bxd e;
    private long f;

    public fkpb() {
        this.a = new gdwl();
        this.c = new bxf(null);
        this.d = new bxd();
        this.e = new bxd();
        this.f = -1L;
    }

    public final Object a(aet aet0, aet aet1, ibrl ibrl0) {
        Object object7;
        Object object5;
        Object object4;
        String s;
        Object object3;
        bxf bxf1;
        Object object2;
        fkoo fkoo0;
        if((ibrl0 instanceof fkoo)) {
            fkoo0 = (fkoo)ibrl0;
            int v = fkoo0.g;
            if((v & 0x80000000) == 0) {
                fkoo0 = new fkoo(this, ibrl0);
            }
            else {
                fkoo0.g = v - 0x80000000;
            }
        }
        else {
            fkoo0 = new fkoo(this, ibrl0);
        }
        Object object0 = fkoo0.e;
        Object object1 = ibrx.a;
        switch(fkoo0.g) {
            case 0: {
                ibnx.b(object0);
                bxf bxf0 = new bxf(null);
                object2 = this.d.entrySet().iterator();
                bxf1 = bxf0;
                goto label_31;
            }
            case 1: {
                object3 = fkoo0.d;
                s = fkoo0.i;
                object2 = fkoo0.c;
                bxf1 = fkoo0.h;
                object4 = fkoo0.b;
                object5 = fkoo0.a;
                ibnx.b(object0);
            label_25:
                while(((List)object0).isEmpty()) {
                    ibuq.c(s);
                    bxf1.add(s);
                    break;
                }
                ibsx.a(((Closeable)object3), null);
                aet1 = object4;
                aet0 = object5;
            label_31:
                while(((Iterator)object2).hasNext()) {
                    Object object6 = ((Iterator)object2).next();
                    fknx fknx0 = (fknx)((Map.Entry)object6).getKey();
                    String s1 = (String)((Map.Entry)object6).getValue();
                    String s2 = fknx0.b.g;
                    String s3 = s2 == null ? null : a.a(s2, "g3attrinfo.normal:\"", "\"");
                    if(s3 == null) {
                        ibuq.c(s1);
                        bxf1.add(s1);
                        continue;
                    }
                    afz afz0 = new afz();
                    afz0.e(1);
                    afz0.b();
                    afz0.b = 1;
                    afz0.g(new String[]{fknx0.a});
                    afz0.b();
                    afz0.a.add("VERBATIM_SEARCH");
                    afy afy0 = aet1.b(s3, afz0.a());
                    try {
                        gmcd gmcd0 = afy0.a();
                        fkoo0.a = aet0;
                        fkoo0.b = aet1;
                        fkoo0.h = bxf1;
                        fkoo0.c = object2;
                        fkoo0.i = s1;
                        fkoo0.d = afy0;
                        fkoo0.g = 1;
                        object7 = icpu.c(gmcd0, fkoo0);
                    }
                    catch(Throwable throwable0) {
                        object3 = afy0;
                        throw throwable0;
                    }
                    if(object7 != object1) {
                        try {
                            object5 = aet0;
                            object3 = afy0;
                            object4 = aet1;
                            s = s1;
                            object0 = object7;
                            goto label_25;
                        }
                        catch(Throwable throwable0) {
                        }
                        try {
                            throw throwable0;
                        }
                        catch(Throwable throwable1) {
                            ibsx.a(((Closeable)object3), throwable0);
                            throw throwable1;
                        }
                    }
                    return object1;
                }
                fkoo0.a = null;
                fkoo0.b = null;
                fkoo0.h = null;
                fkoo0.c = null;
                fkoo0.i = null;
                fkoo0.d = null;
                fkoo0.g = 2;
                return this.b(bxf1, aet0, fkoo0) != object1 ? ibom.a : object1;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(Collection collection0, aet aet0, ibrl ibrl0) {
        fkoq fkoq0;
        if((ibrl0 instanceof fkoq)) {
            fkoq0 = (fkoq)ibrl0;
            int v = fkoq0.d;
            if((v & 0x80000000) == 0) {
                fkoq0 = new fkoq(this, ibrl0);
            }
            else {
                fkoq0.d = v - 0x80000000;
            }
        }
        else {
            fkoq0 = new fkoq(this, ibrl0);
        }
        Object object0 = fkoq0.b;
        Object object1 = ibrx.a;
        switch(fkoq0.d) {
            case 0: {
                ibnx.b(object0);
                if(!collection0.isEmpty()) {
                    afo afo0 = new afo("G3_TS_TAGS");
                    afo0.b(collection0);
                    gmcd gmcd0 = aet0.f(afo0.a());
                    fkoq0.a = collection0;
                    fkoq0.d = 1;
                    object0 = icpu.c(gmcd0, fkoq0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_25;
                }
                break;
            }
            case 1: {
                collection0 = fkoq0.a;
                ibnx.b(object0);
            label_25:
                if(((adx)object0).c()) {
                    this.d.values().removeAll(collection0);
                    return ibom.a;
                }
                Log.w("G3AppSearchTagStore", "Failed to delete tag documents from TagStore");
                collection0.removeAll(((adx)object0).a().keySet());
                this.d.values().removeAll(collection0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object c(fknw fknw0, agf agf0, aet aet0, aet aet1, ibrl ibrl0) {
        Object object3;
        agf agf1;
        Object object2;
        fkot fkot0;
        if((ibrl0 instanceof fkot)) {
            fkot0 = (fkot)ibrl0;
            int v = fkot0.f;
            if((v & 0x80000000) == 0) {
                fkot0 = new fkot(this, ibrl0);
            }
            else {
                fkot0.f = v - 0x80000000;
            }
        }
        else {
            fkot0 = new fkot(this, ibrl0);
        }
        Object object0 = fkot0.d;
        Object object1 = ibrx.a;
        switch(fkot0.f) {
            case 0: {
                ibnx.b(object0);
                fkot0.g = agf0;
                fkot0.a = aet0;
                fkot0.b = aet1;
                fkot0.f = 1;
                object0 = this.h(fknw0.a, aet0, fkot0);
                if(object0 != object1) {
                    goto label_25;
                }
                return object1;
            }
            case 1: {
                aet1 = fkot0.b;
                aet0 = fkot0.a;
                agf0 = fkot0.g;
                ibnx.b(object0);
            label_25:
                object2 = (Set)object0;
                fkot0.g = agf0;
                fkot0.a = aet0;
                fkot0.b = aet1;
                fkot0.c = object2;
                fkot0.f = 2;
                if(this.g(aet0, fkot0) != object1) {
                    agf1 = agf0;
                    object3 = aet1;
                    goto label_40;
                }
                return object1;
            }
            case 2: {
                object2 = fkot0.c;
                object3 = fkot0.b;
                aet0 = fkot0.a;
                agf1 = fkot0.g;
                ibnx.b(object0);
            label_40:
                if(agf1.c == null) {
                    kay.i(agf1.b);
                    agf1.c = new bxf(agf1.b);
                }
                Set set0 = DesugarCollections.unmodifiableSet(agf1.c);
                ibuq.e(set0, "getMigratedTypes(...)");
                if(set0.isEmpty()) {
                    if(agf1.d == null) {
                        kay.i(agf1.a);
                        agf1.d = new bxf(agf1.a);
                    }
                    Set set1 = DesugarCollections.unmodifiableSet(agf1.d);
                    ibuq.e(set1, "getIncompatibleTypes(...)");
                    if(set1.isEmpty()) {
                        if(((Set)object2).isEmpty()) {
                            return ibom.a;
                        }
                        fkot0.g = null;
                        fkot0.a = null;
                        fkot0.b = null;
                        fkot0.c = null;
                        fkot0.f = 4;
                        return this.d(((Set)object2), aet0, ((aet)object3), fkot0) != object1 ? ibom.a : object1;
                    }
                }
                fkot0.g = null;
                fkot0.a = null;
                fkot0.b = null;
                fkot0.c = null;
                fkot0.f = 3;
                return this.f(aet0, ((aet)object3), fkot0) != object1 ? ibom.a : object1;
            }
            case 3: 
            case 4: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(Set set0, aet aet0, aet aet1, ibrl ibrl0) {
        Object object2;
        Object object1;
        Object object0;
        fkou fkou0;
        if((ibrl0 instanceof fkou)) {
            fkou0 = (fkou)ibrl0;
            int v = fkou0.f;
            if((v & 0x80000000) == 0) {
                fkou0 = new fkou(this, ibrl0);
            }
            else {
                fkou0.f = v - 0x80000000;
            }
        }
        else {
            fkou0 = new fkou(this, ibrl0);
        }
        try {
            object0 = fkou0.d;
            object1 = ibrx.a;
            switch(fkou0.f) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_31;
                }
                case 2: {
                    goto label_45;
                }
                case 3: {
                    goto label_79;
                }
            }
        }
        catch(Throwable throwable0) {
            ibsx.a(((Closeable)object2), throwable0);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        bxf bxf0 = new bxf(null);
        afz afz0 = new afz();
        afz0.e(100);
        afz0.c(set0);
        afz0.d(gged_interceptors.l("g3attrinfo"));
        object2 = aet1.b("", afz0.a());
        try {
            gmcd gmcd0 = ((afy)object2).a();
            fkou0.a = aet0;
            fkou0.g = bxf0;
            fkou0.b = object2;
            fkou0.c = object2;
            fkou0.f = 1;
            Object object3 = icpu.c(gmcd0, fkou0);
            if(object3 != object1) {
                Object object4 = object3;
                Object object5 = object2;
                goto label_40;
            label_31:
                object2 = fkou0.c;
                Object object6 = fkou0.b;
                bxf bxf1 = fkou0.g;
                Object object7 = fkou0.a;
                ibnx.b(object0);
                object5 = object6;
                aet0 = object7;
                object4 = object0;
                bxf0 = bxf1;
            label_40:
                List list0 = (List)object4;
                Object object8 = aet0;
                Object object9 = object5;
                bxf bxf2 = bxf0;
                goto label_52;
            label_45:
                object2 = fkou0.c;
                object9 = fkou0.b;
                bxf2 = fkou0.g;
                Object object10 = fkou0.a;
                ibnx.b(object0);
                while(true) {
                    list0 = (List)object0;
                    object8 = object10;
                label_52:
                    ibuq.c(list0);
                    if(list0.isEmpty()) {
                        goto label_67;
                    }
                    ibuq.c(list0);
                    this.k(list0, bxf2, new LinkedHashSet());
                    gmcd gmcd1 = ((afy)object9).a();
                    fkou0.a = object8;
                    fkou0.g = bxf2;
                    fkou0.b = object9;
                    fkou0.c = object2;
                    fkou0.f = 2;
                    Object object11 = icpu.c(gmcd1, fkou0);
                    if(object11 == object1) {
                        break;
                    }
                    object10 = object8;
                    object0 = object11;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
            ibsx.a(((Closeable)object2), throwable0);
            throw throwable0;
        }
    label_67:
        ibsx.a(((Closeable)object2), null);
        fkou0.a = null;
        fkou0.g = null;
        fkou0.b = null;
        fkou0.c = null;
        fkou0.f = 3;
        if(this.e(bxf2, ((aet)object8), fkou0) != object1) {
            return ibom.a;
        }
        try {
            return object1;
        }
        catch(Throwable throwable0) {
            ibsx.a(((Closeable)object2), throwable0);
            throw throwable0;
        }
    label_79:
        ibnx.b(object0);
        return ibom.a;
    }

    public final Object e(Collection collection0, aet aet0, ibrl ibrl0) {
        Object object3;
        fkox fkox0;
        if((ibrl0 instanceof fkox)) {
            fkox0 = (fkox)ibrl0;
            int v = fkox0.d;
            if((v & 0x80000000) == 0) {
                fkox0 = new fkox(this, ibrl0);
            }
            else {
                fkox0.d = v - 0x80000000;
            }
        }
        else {
            fkox0 = new fkox(this, ibrl0);
        }
        Object object0 = fkox0.b;
        Object object1 = ibrx.a;
        switch(fkox0.d) {
            case 0: {
                ibnx.b(object0);
                if(!collection0.isEmpty()) {
                    afm afm0 = new afm();
                    bxd bxd0 = new bxd();
                    bxe bxe0 = new bxe(((bxf)collection0));
                    while(bxe0.hasNext()) {
                        Object object2 = bxe0.next();
                        fknx fknx0 = (fknx)object2;
                        try {
                            long v1 = this.f + 1L;
                            this.f = v1;
                            String s = String.valueOf(v1);
                            afa[] arr_afa = {afa.f(fknx0.b)};
                            afm0.c(new afa[]{new aez("G3_TS_TAGS", s, "__G3_TAG__" + fknx0.a).a("g3tsattrinfo", arr_afa).e()});
                            bxd0.put(new fknx(fknx0.a, fknx0.b), s);
                        }
                        catch(ags ags0) {
                            Log.w("G3AppSearchTagStore", "Failed to create Tag document", ags0);
                        }
                    }
                    if(!bxd0.isEmpty()) {
                        gmcd gmcd0 = aet0.e(afm0.a());
                        fkox0.a = bxd0;
                        fkox0.d = 1;
                        object0 = icpu.c(gmcd0, fkox0);
                        if(object0 != object1) {
                            object3 = bxd0;
                            break;
                        }
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 1: {
                object3 = fkox0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((adx)object0).c()) {
            Map map0 = ibvh.c(object3);
            this.d.putAll(map0);
            return ibom.a;
        }
        Log.e("G3AppSearchTagStore", "Failed to insert tag documents into TagStore");
        ((bxd)object3).values().removeAll(((adx)object0).a().keySet());
        Map map1 = ibvh.c(object3);
        this.d.putAll(map1);
        return ibom.a;
    }

    public final Object f(aet aet0, aet aet1, ibrl ibrl0) {
        Object object13;
        List list0;
        fkoy fkoy1;
        bxf bxf2;
        Object object8;
        Object object7;
        Object object6;
        Object object5;
        bxf bxf1;
        Object object4;
        Object object3;
        Object object2;
        fkoy fkoy0;
        if((ibrl0 instanceof fkoy)) {
            fkoy0 = (fkoy)ibrl0;
            int v = fkoy0.h;
            if((v & 0x80000000) == 0) {
                fkoy0 = new fkoy(this, ibrl0);
            }
            else {
                fkoy0.h = v - 0x80000000;
            }
        }
        else {
            fkoy0 = new fkoy(this, ibrl0);
        }
        Object object0 = fkoy0.f;
        Object object1 = ibrx.a;
        switch(fkoy0.h) {
            case 0: {
                ibnx.b(object0);
                bxf bxf0 = new bxf(null);
                bxd bxd0 = new bxd(this.d);
                afz afz0 = new afz();
                afz0.e(100);
                afz0.c(this.c);
                afz0.d(gged_interceptors.l("g3attrinfo"));
                object2 = aet1.b("", afz0.a());
                try {
                    gmcd gmcd0 = ((afy)object2).a();
                    fkoy0.a = aet0;
                    fkoy0.b = bxf0;
                    fkoy0.c = bxd0;
                    fkoy0.d = object2;
                    fkoy0.e = object2;
                    fkoy0.h = 1;
                    object3 = icpu.c(gmcd0, fkoy0);
                }
                catch(Throwable throwable0) {
                    object4 = object2;
                    throw throwable0;
                }
                if(object3 != object1) {
                    bxf1 = bxf0;
                    object0 = object3;
                    object5 = bxd0;
                    object6 = aet0;
                    object4 = object2;
                    goto label_46;
                }
                return object1;
            }
            case 1: {
                object4 = fkoy0.e;
                object2 = fkoy0.d;
                object5 = fkoy0.c;
                bxf1 = (bxf)fkoy0.b;
                object6 = fkoy0.a;
                ibnx.b(object0);
            label_46:
                object7 = object2;
                object8 = object6;
                bxf2 = bxf1;
                fkoy1 = fkoy0;
                list0 = (List)object0;
                goto label_64;
            }
            case 2: {
                object4 = fkoy0.e;
                Object object9 = fkoy0.d;
                object5 = fkoy0.c;
                bxf bxf3 = (bxf)fkoy0.b;
                Object object10 = fkoy0.a;
                ibnx.b(object0);
                Object object11 = object9;
                object8 = object10;
                bxf2 = bxf3;
                fkoy1 = fkoy0;
                while(true) {
                    list0 = (List)object0;
                    object7 = object11;
                label_64:
                    ibuq.c(list0);
                    if(list0.isEmpty()) {
                        break;
                    }
                    ibuq.c(list0);
                    this.k(list0, bxf2, ((bxd)object5).keySet());
                    gmcd gmcd1 = ((afy)object7).a();
                    fkoy1.a = object8;
                    fkoy1.b = bxf2;
                    fkoy1.c = object5;
                    fkoy1.d = object7;
                    fkoy1.e = object4;
                    fkoy1.h = 2;
                    Object object12 = icpu.c(gmcd1, fkoy1);
                    if(object12 == object1) {
                        return object1;
                    }
                    object11 = object7;
                    object0 = object12;
                }
                ibsx.a(((Closeable)object4), null);
                fkoy1.a = object8;
                fkoy1.b = object5;
                fkoy1.c = null;
                fkoy1.d = null;
                fkoy1.e = null;
                fkoy1.h = 3;
                if(this.e(bxf2, ((aet)object8), fkoy1) != object1) {
                    object13 = object5;
                    fkoy0 = fkoy1;
                    goto label_94;
                }
                return object1;
            }
            case 3: {
                object13 = (bxd)fkoy0.b;
                object8 = fkoy0.a;
                ibnx.b(object0);
            label_94:
                Collection collection0 = ((bxd)object13).values();
                fkoy0.a = null;
                fkoy0.b = null;
                fkoy0.h = 4;
                if(this.b(collection0, ((aet)object8), fkoy0) != object1) {
                    return ibom.a;
                }
                try {
                    return object1;
                }
                catch(Throwable throwable0) {
                }
                try {
                    throw throwable0;
                }
                catch(Throwable throwable1) {
                    ibsx.a(((Closeable)object4), throwable0);
                    throw throwable1;
                }
            }
            case 4: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object g(aet aet0, ibrl ibrl0) {
        Object object3;
        fkoz fkoz0;
        if((ibrl0 instanceof fkoz)) {
            fkoz0 = (fkoz)ibrl0;
            int v = fkoz0.d;
            if((v & 0x80000000) == 0) {
                fkoz0 = new fkoz(this, ibrl0);
            }
            else {
                fkoz0.d = v - 0x80000000;
            }
        }
        else {
            fkoz0 = new fkoz(this, ibrl0);
        }
        Object object0 = fkoz0.b;
        Object object1 = ibrx.a;
        switch(fkoz0.d) {
            case 0: {
                ibnx.b(object0);
                afm afm0 = new afm();
                bxd bxd0 = new bxd();
                bxe bxe0 = new bxe(this.c);
                while(bxe0.hasNext()) {
                    Object object2 = bxe0.next();
                    String s = (String)object2;
                    ggnj ggnj0 = ggnj.a;
                    ibuq.e(ggnj0, "of(...)");
                    fkol fkol0 = new fkol(ggnj0);
                    if(!ibuq.m(fkol0, this.e.get(s))) {
                        String s1 = "__G3_TAG__" + s;
                        aez aez0 = new aez("G3_TS_TAGS", s1, s1);
                        String[] arr_s = (String[])ggnj0.toArray(new String[0]);
                        afm0.c(new afa[]{aez0.b("tsparenttypes", ((String[])Arrays.copyOf(arr_s, arr_s.length))).e()});
                        bxd0.put(s, fkol0);
                    }
                }
                if(!bxd0.isEmpty()) {
                    gmcd gmcd0 = aet0.e(afm0.a());
                    fkoz0.a = bxd0;
                    fkoz0.d = 1;
                    object0 = icpu.c(gmcd0, fkoz0);
                    if(object0 != object1) {
                        object3 = bxd0;
                        goto label_41;
                    }
                    return object1;
                }
                break;
            }
            case 1: {
                object3 = fkoz0.a;
                ibnx.b(object0);
            label_41:
                if(((adx)object0).c()) {
                    Map map0 = ibvh.c(object3);
                    this.e.putAll(map0);
                    return ibom.a;
                }
                Log.e("G3AppSearchTagStore", "Failed to insert schema tag documents into TagStore");
                ((bxd)object3).keySet().removeAll(((adx)object0).a().keySet());
                Map map1 = ibvh.c(object3);
                this.e.putAll(map1);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object h(agc agc0, aet aet0, ibrl ibrl0) {
        bxf bxf1;
        fkpa fkpa0;
        if((ibrl0 instanceof fkpa)) {
            fkpa0 = (fkpa)ibrl0;
            int v = fkpa0.c;
            if((v & 0x80000000) == 0) {
                fkpa0 = new fkpa(this, ibrl0);
            }
            else {
                fkpa0.c = v - 0x80000000;
            }
        }
        else {
            fkpa0 = new fkpa(this, ibrl0);
        }
        Object object0 = fkpa0.a;
        Object object1 = ibrx.a;
        switch(fkpa0.c) {
            case 0: {
                ibnx.b(object0);
                agb agb0 = new agb();
                agb0.e(true);
                bxf bxf0 = new bxf(null);
                Iterator iterator0 = agc0.g().iterator();
            label_19:
                while(iterator0.hasNext()) {
                    Object object2 = iterator0.next();
                    String s = ((aes)object2).a;
                    Iterator iterator1 = ((aes)object2).b().iterator();
                    do {
                        if(!iterator1.hasNext()) {
                            continue label_19;
                        }
                        Object object3 = iterator1.next();
                    }
                    while(!ibuq.m(((aep)object3).g(), "g3attrinfo"));
                    aef aef0 = new aef("__G3_TAG__" + s);
                    aei aei0 = new aei("g3tsattrinfo", "G3AttributionInfo");
                    aei0.c(2);
                    aei0.a = false;
                    aef0.c(aei0.a());
                    aeq aeq0 = new aeq("tsparenttypes");
                    aeq0.b(1);
                    aef0.c(aeq0.a());
                    aes aes0 = aef0.a();
                    agb0.j(new aes[]{aes0});
                    String s1 = aes0.a;
                    if(agc0.h().contains(s)) {
                        agb0.g(s1);
                    }
                    Set set0 = (Set)agc0.f().get(s);
                    if(set0 != null) {
                        for(Object object4: set0) {
                            agb0.h(s1, ((afj)object4));
                        }
                    }
                    afj afj0 = (afj)agc0.c().get(s);
                    if(afj0 != null) {
                        agb0.f(s1, afj0);
                    }
                    Set set1 = (Set)agc0.e().get(s);
                    if(set1 != null) {
                        for(Object object5: set1) {
                            kay.i(((afr)object5));
                            agb0.b();
                            Set set2 = (Set)agb0.b.get(s1);
                            if(set2 == null) {
                                set2 = new bxf();
                                agb0.b.put(s1, set2);
                            }
                            set2.add(((afr)object5));
                        }
                    }
                    Set set3 = (Set)agc0.d().get(s);
                    if(set3 != null) {
                        for(Object object6: set3) {
                            agb0.c(s1, ((Set)object6));
                        }
                    }
                    bxf0.add(s);
                }
                if(!bxf0.isEmpty()) {
                    agb0.j(new aes[]{G3AttributionInfo.b});
                    agb0.g("G3AttributionInfo");
                }
                gmcd gmcd0 = aet0.h(agb0.a());
                fkpa0.d = bxf0;
                fkpa0.c = 1;
                object0 = icpu.c(gmcd0, fkpa0);
                if(object0 != object1) {
                    bxf1 = bxf0;
                    break;
                }
                return object1;
            }
            case 1: {
                bxf1 = fkpa0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        agf agf0 = (agf)object0;
        Object object7 = new bxf(bxf1);
        bxf bxf2 = this.c;
        int v2 = bxf2.c;
        for(int v1 = 0; v1 < v2; ++v1) {
            ((bxf)object7).remove(bxf2.b(v1));
        }
        bxf2.clear();
        bxf2.c(bxf1);
        this.e.keySet().retainAll(bxf2);
        Collection.-EL.removeIf(this.d.keySet(), new fkon(new fkom(bxf1)));
        return object7;
    }

    public final void i(afa afa0, Set set0) {
        String s = afa0.m();
        ibuq.e(s, "getSchemaType(...)");
        if(this.c.contains(s)) {
            afa afa1 = afa0.g("g3attrinfo");
            if(afa1 != null) {
                try {
                    fknx fknx0 = new fknx(s, fknq.a(((G3AttributionInfo)afa1.i(G3AttributionInfo.class))));
                    if(!this.d.containsKey(fknx0)) {
                        set0.add(fknx0);
                    }
                }
                catch(ags ags0) {
                    Log.w("G3AppSearchTagStore", "Failed to extract tag from document", ags0);
                }
            }
        }
    }

    public final Object j(aet aet0, ibrl ibrl0) {
        ggfp ggfp0;
        Object object4;
        Object object3;
        aet aet1;
        fkow fkow0;
        if((ibrl0 instanceof fkow)) {
            fkow0 = (fkow)ibrl0;
            int v = fkow0.e;
            if((v & 0x80000000) == 0) {
                fkow0 = new fkow(this, ibrl0);
            }
            else {
                fkow0.e = v - 0x80000000;
            }
        }
        else {
            fkow0 = new fkow(this, ibrl0);
        }
        Object object0 = fkow0.c;
        Object object1 = ibrx.a;
        switch(fkow0.e) {
            case 0: {
                ibnx.b(object0);
                if(this.b) {
                    return Boolean.valueOf(true);
                }
                try {
                    gmcd gmcd0 = aet0.d();
                    aet1 = aet0;
                    fkow0.a = aet1;
                    fkow0.e = 1;
                    object0 = icpu.c(gmcd0, fkow0);
                    if(object0 != object1) {
                        goto label_25;
                    }
                    return object1;
                }
                catch(Exception exception0) {
                    goto label_104;
                }
                goto label_25;
            }
            case 1: {
                aet1 = (aet)fkow0.a;
                try {
                    ibnx.b(object0);
                label_25:
                    for(Object object2: ((afe)object0).b()) {
                        String s = ((aes)object2).a;
                        if(fkpc.c(s)) {
                            String s1 = fkpc.b(s);
                            ibuq.c(s1);
                            this.c.add(s1);
                        }
                    }
                    afz afz0 = new afz();
                    afz0.e(100);
                    object3 = aet1.b("", afz0.a());
                }
                catch(Exception exception0) {
                    goto label_104;
                }
                try {
                    gmcd gmcd1 = ((afy)object3).a();
                    fkow0.a = object3;
                    fkow0.b = object3;
                    fkow0.e = 2;
                    object0 = icpu.c(gmcd1, fkow0);
                    if(object0 == object1) {
                        return object1;
                    }
                    object4 = object3;
                    goto label_51;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                object3 = fkow0.b;
                object4 = (afy)fkow0.a;
                goto label_50;
            }
            case 3: {
                object3 = fkow0.b;
                object4 = (afy)fkow0.a;
                try {
                label_50:
                    ibnx.b(object0);
                    do {
                    label_51:
                        ibuq.c(((List)object0));
                        if(((List)object0).isEmpty()) {
                            goto label_100;
                        }
                        ibuq.c(((List)object0));
                        for(Object object5: ((List)object0)) {
                            afa afa0 = ((afx)object5).a();
                            ibuq.e(afa0, "getGenericDocument(...)");
                            String s2 = afa0.m();
                            ibuq.e(s2, "getSchemaType(...)");
                            if(fkpc.c(s2)) {
                                String s3 = fkpc.b(s2);
                                if(this.c.contains(s3)) {
                                    if(afa0.k().startsWith("__G3_TAG__")) {
                                        String[] arr_s = afa0.u("tsparenttypes");
                                        if(arr_s == null) {
                                            ggfp0 = ggnj.a;
                                            ibuq.e(ggfp0, "of(...)");
                                        }
                                        else {
                                            ggfp0 = ggfp.H(arr_s);
                                            ibuq.e(ggfp0, "copyOf(...)");
                                            if(ggfp0 == null) {
                                                ggfp0 = ggnj.a;
                                                ibuq.e(ggfp0, "of(...)");
                                            }
                                        }
                                        fkol fkol0 = new fkol(ggfp0);
                                        this.e.put(s3, fkol0);
                                        continue;
                                    }
                                    else {
                                        String s4 = afa0.k();
                                        ibuq.e(s4, "getId(...)");
                                        Long long0 = ibzk.g(s4);
                                        this.f = Math.max((long0 == null ? -1L : ((long)long0)), this.f);
                                        afa afa1 = afa0.g("g3tsattrinfo");
                                        if(afa1 == null) {
                                            continue;
                                            try {
                                            label_84:
                                                fknx fknx0 = new fknx(s3, ((G3AttributionInfo)afa1.i(G3AttributionInfo.class)));
                                                this.d.put(fknx0, afa0.k());
                                            }
                                            catch(ags ags0) {
                                                Log.w("G3AppSearchTagStore", "Failed to convert document to tag", ags0);
                                            }
                                            continue;
                                        }
                                        else {
                                            goto label_84;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        gmcd gmcd2 = ((afy)object4).a();
                        fkow0.a = object4;
                        fkow0.b = object3;
                        fkow0.e = 3;
                        object0 = icpu.c(gmcd2, fkow0);
                    }
                    while(object0 != object1);
                    return object1;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            ibsx.a(((Closeable)object3), throwable0);
            throw throwable0;
        label_100:
            ibsx.a(((Closeable)object3), null);
            this.b = true;
            return Boolean.valueOf(this.b);
        }
        catch(Exception exception0) {
        label_104:
            Log.e("G3AppSearchTagStore", "Failed to initialize", exception0);
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f = -1L;
            this.b = false;
            return Boolean.valueOf(this.b);
        }
    }

    private final void k(List list0, Set set0, Set set1) {
        for(Object object0: list0) {
            afa afa0 = ((afx)object0).a();
            ibuq.e(afa0, "getGenericDocument(...)");
            String s = afa0.m();
            ibuq.e(s, "getSchemaType(...)");
            if(this.c.contains(s)) {
                afa afa1 = afa0.g("g3attrinfo");
                if(afa1 == null) {
                    continue;
                    try {
                    label_10:
                        fknx fknx0 = new fknx(s, fknq.a(((G3AttributionInfo)afa1.i(G3AttributionInfo.class))));
                        if(this.d.containsKey(fknx0)) {
                            set1.remove(fknx0);
                        }
                        else {
                            set0.add(fknx0);
                        }
                    }
                    catch(ags ags0) {
                        Log.w("G3AppSearchTagStore", "Failed to extract tag from document", ags0);
                    }
                    continue;
                }
                else {
                    goto label_10;
                }
                break;
            }
        }
    }
}

