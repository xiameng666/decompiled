import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class bqi implements azp {
    public final bhj a;
    public final azy b;
    public final List c;
    public List d;
    public Range e;
    public final bia f;
    public final Object g;
    private final bng h;
    private final List i;
    private boolean j;
    private bjt k;
    private ben l;
    private bud m;
    private final bas n;
    private final bas o;
    private final brc p;
    private final ayv q;
    private final bqp r;

    public bqi(bin bin0, bhi bhi0, bas bas0, bas bas1, ayv ayv0, bqp bqp0, bng bng0) {
        this.c = new ArrayList();
        this.i = new ArrayList();
        this.d = Collections.EMPTY_LIST;
        this.e = bmi.a;
        this.g = new Object();
        this.j = true;
        this.k = null;
        this.p = new brc();
        this.f = bhi0.b;
        this.a = new bhj(bin0, bhi0);
        this.n = bas0;
        this.o = bas1;
        this.q = ayv0;
        this.h = bng0;
        this.b = azx.b(bhi0);
        this.r = bqp0;
    }

    public final List a() {
        synchronized(this.g) {
        }
        return new ArrayList(this.c);
    }

    @Override  // azp
    public final azz b() {
        throw null;
    }

    public final void c(bqc bqc0) {
        Map map0;
        Collection collection0 = bqc0.b;
        Object object0 = this.g;
        bqo bqo0 = bqc0.i;
        synchronized(object0) {
            Iterator iterator0 = collection0.iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                map0 = bqo0.a;
                if(!z) {
                    break;
                }
                Object object1 = iterator0.next();
                Rect rect0 = this.a.a.e();
                bmi bmi0 = (bmi)map0.get(((ben)object1));
                kay.i(bmi0);
                kay.b(rect0.width() > 0 && rect0.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
                RectF rectF0 = new RectF(rect0);
                Matrix matrix0 = new Matrix();
                matrix0.setRectToRect(new RectF(0.0f, 0.0f, ((float)bmi0.b.getWidth()), ((float)bmi0.b.getHeight())), rectF0, Matrix.ScaleToFit.CENTER);
                matrix0.invert(matrix0);
                ((ben)object1).j(matrix0);
            }
        }
        Collection collection1 = bqc0.a;
        List list0 = bqi.l(this.d, collection0);
        ArrayList arrayList0 = new ArrayList(collection1);
        arrayList0.removeAll(collection0);
        List list1 = bqi.l(list0, arrayList0);
        if(!list1.isEmpty()) {
            Objects.toString(list1);
            bcs.d("CameraUseCaseAdapter", "Unused effects: " + list1.toString());
        }
        List list2 = bqc0.e;
        for(Object object2: list2) {
            ((ben)object2).O(this.a);
        }
        bhj bhj0 = this.a;
        bhj0.p(list2);
        if(list2.isEmpty()) {
            Iterator iterator2 = bqc0.d.iterator();
        label_41:
            while(iterator2.hasNext()) {
                Object object3 = iterator2.next();
                ben ben0 = (ben)object3;
                if(map0.containsKey(ben0)) {
                    bmi bmi1 = (bmi)map0.get(ben0);
                    bjt bjt0 = ((bmi)j..util.Objects.requireNonNull(bmi1)).g;
                    if(bjt0 != null) {
                        bmb bmb0 = ben0.m;
                        bjt bjt1 = bmi1.g;
                        bjt bjt2 = bmb0.d();
                        if(((bjt)j..util.Objects.requireNonNull(bjt1)).r().size() == bmb0.d().r().size()) {
                            Iterator iterator3 = blq.f(((blr)bjt1)).iterator();
                            while(true) {
                                if(!iterator3.hasNext()) {
                                    continue label_41;
                                }
                                Object object4 = iterator3.next();
                                bjr bjr0 = (bjr)object4;
                                if(bjt2.s(bjr0) && j..util.Objects.equals(bjt2.l(bjr0), blq.b(((blr)bjt1), bjr0))) {
                                    continue;
                                }
                                goto label_57;
                            }
                        }
                        else {
                        label_57:
                            ben0.j = ben0.b(bjt0);
                            if(!this.j) {
                                continue;
                            }
                            bhj0.v(ben0);
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        List list3 = bqc0.c;
        for(Object object5: list3) {
            bqh bqh0 = (bqh)j..util.Objects.requireNonNull(((bqh)bqc0.h.get(((ben)object5))));
            ((ben)object5).H(bhj0, null, bqh0.a, bqh0.b);
            bmi bmi2 = (bmi)map0.get(((ben)object5));
            kay.i(bmi2);
            ((ben)object5).Q(bmi2, null);
        }
        if(this.j) {
            bhj0.n(list3);
        }
        for(Object object6: list3) {
            ((ben)object6).L();
        }
        this.c.clear();
        this.c.addAll(collection1);
        this.i.clear();
        this.i.addAll(collection0);
        this.l = bqc0.g;
        this.m = bqc0.f;
    }

    public final void d() {
        bhj bhj0;
        Object object0 = this.g;
        synchronized(object0) {
            if(!this.j) {
                List list0 = this.i;
                if(!list0.isEmpty()) {
                    this.a.z(this.f);
                }
                bhj0 = this.a;
                bhj0.n(list0);
                __monitor_enter(object0);
                goto label_9;
            }
            goto label_27;
        }
        try {
        label_9:
            bjt bjt0 = this.k;
            if(bjt0 != null) {
                bhj0.b.i(bjt0);
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
            for(Object object1: this.i) {
                ((ben)object1).L();
            }
            this.j = true;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_27:
        __monitor_exit(object0);
    }

    public final void e() {
        Object object0 = this.g;
        synchronized(object0) {
            if(this.j) {
                ArrayList arrayList0 = new ArrayList(this.i);
                this.a.p(arrayList0);
                __monitor_enter(object0);
                goto label_6;
            }
            goto label_18;
        }
        try {
        label_6:
            this.k = this.a.b.d();
            this.a.b.k();
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
            this.j = false;
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_18:
        __monitor_exit(object0);
    }

    public final void f(Collection collection0) {
        synchronized(this.g) {
            for(Object object1: collection0) {
                ((ben)object1).N(null);
            }
            LinkedHashSet linkedHashSet0 = new LinkedHashSet(this.c);
            linkedHashSet0.removeAll(collection0);
            this.c(this.j(linkedHashSet0, false));
        }
    }

    public final void g(boolean z) {
        this.a.y(z);
    }

    static boolean h(Collection collection0) {
        for(Object object0: collection0) {
            if(bqi.i(((ben)object0))) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(ben ben0) {
        if(ben0 != null) {
            if(ben0.i.s(bnc.y)) {
                return ben0.i.k() == bne.d;
            }
            Objects.toString(ben0);
            Log.e("CameraUseCaseAdapter", ben0.toString() + " UseCase does not have capture type.");
        }
        return false;
    }

    public final bqc j(Collection collection0, boolean z) {
        avf avf1;
        avf avf0;
        boolean z9;
        Rect rect0;
        int v8;
        LinkedHashMap linkedHashMap0;
        String s1;
        Collection collection1;
        ArrayList arrayList5;
        Range range0;
        bhi bhi0;
        bqp bqp0;
        Object object10;
        bud bud0;
        HashSet hashSet0;
        if(this.m()) {
            for(Object object0: collection0) {
                bat bat0 = ((ben)object0).i.e();
                if(bat0.i == 10 || bat0.h != 0 && bat0.h != 1) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if(bqi.n(collection0)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        Object object1 = this.g;
        synchronized(object1) {
            if(!this.d.isEmpty()) {
                for(Object object2: collection0) {
                    ben ben0 = (ben)object2;
                    if((ben0 instanceof bce)) {
                        bnc bnc0 = ben0.i;
                        bjr bjr0 = bkk.e;
                        if(bnc0.s(bjr0)) {
                            Integer integer0 = (Integer)bnc0.l(bjr0);
                            kay.i(integer0);
                            if(((int)integer0) == 1) {
                                throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                            }
                        }
                    }
                }
                if(bqi.n(collection0)) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            }
        }
        __monitor_exit(object1);
        if(!z) {
            if(this.m() && bqi.h(collection0)) {
                return this.j(collection0, true);
            }
            boolean z1 = false;
            brc brc0 = this.p;
            String s = this.a.a.j();
            if(brc0.a != null) {
                if(ImageCaptureFailedForSpecificCombinationQuirk.a()) {
                    if(s.equals("1") && ImageCaptureFailedForSpecificCombinationQuirk.c(collection0)) {
                        return this.j(collection0, true);
                    }
                }
                else if(ImageCaptureFailedForSpecificCombinationQuirk.b() && s.equals("1") && ImageCaptureFailedForSpecificCombinationQuirk.c(collection0)) {
                    return this.j(collection0, true);
                }
            }
            else if(brc0.b != null && PreviewGreenTintQuirk.a() && ibuq.m(s, "0") && collection0.size() == 2) {
                if(!collection0.isEmpty()) {
                    for(Object object3: collection0) {
                        if((((ben)object3) instanceof bdf)) {
                            z1 = true;
                            break;
                        }
                    }
                }
                boolean z2 = false;
                if(!collection0.isEmpty()) {
                    for(Object object4: collection0) {
                        ben ben1 = (ben)object4;
                        if(ben1.i.s(bnc.y) && ben1.i.k() == bne.d) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if(z1 && z2) {
                    return this.j(collection0, true);
                }
            }
        }
        synchronized(object1) {
            hashSet0 = new HashSet();
            __monitor_enter(object1);
        }
        try {
            Iterator iterator4 = this.d.iterator();
            if(iterator4.hasNext()) {
                Object object5 = iterator4.next();
                azr azr0 = (azr)object5;
                throw null;
            }
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(object1);
                throw throwable2;
            }
            catch(Throwable throwable1) {
                __monitor_exit(object1);
                throw throwable1;
            }
        }
        __monitor_exit(object1);
        try {
            for(Object object6: collection0) {
                ben ben2 = (ben)object6;
                kay.b(((boolean)(ben2 instanceof bud ^ 1)), "Only support one level of sharing for now.");
                if(ben2.R((z ? 3 : 0))) {
                    hashSet0.add(ben2);
                }
            }
            if(hashSet0.size() >= 2 || this.m() && bqi.h(hashSet0)) {
                if(this.m == null || !this.m.i().equals(hashSet0)) {
                    HashSet hashSet1 = new HashSet();
                    Iterator iterator6 = hashSet0.iterator();
                    while(true) {
                        if(!iterator6.hasNext()) {
                            bud0 = new bud(this.a, this.n, this.o, hashSet0, this.h);
                            break;
                        }
                        Object object7 = iterator6.next();
                        ben ben3 = (ben)object7;
                        int v = 0;
                        while(v < 3) {
                            int v1 = new int[]{1, 2, 4}[v];
                            if(!ben3.R(v1)) {
                                ++v;
                                continue;
                            }
                            Integer integer1 = v1;
                            if(!hashSet1.contains(integer1)) {
                                hashSet1.add(integer1);
                                ++v;
                                continue;
                            }
                            goto label_95;
                        }
                    }
                }
                else {
                    goto label_100;
                }
                goto label_102;
            }
            else {
                goto label_104;
            }
            goto label_105;
        }
        catch(Throwable throwable1) {
            __monitor_exit(object1);
            throw throwable1;
        }
    label_95:
        __monitor_exit(object1);
        goto label_105;
        try {
            bud0 = new bud(this.a, this.n, this.o, hashSet0, this.h);
            goto label_102;
        label_100:
            this.m.q(hashSet0);
            bud0 = (bud)j..util.Objects.requireNonNull(this.m);
        }
        catch(Throwable throwable1) {
            __monitor_exit(object1);
            throw throwable1;
        }
    label_102:
        __monitor_exit(object1);
        goto label_110;
    label_104:
        __monitor_exit(object1);
        try {
        label_105:
            bud0 = null;
        }
        catch(Throwable throwable1) {
            __monitor_exit(object1);
            throw throwable1;
        }
    label_110:
        synchronized(object1) {
            ArrayList arrayList0 = new ArrayList(collection0);
            if(bud0 != null) {
                arrayList0.add(bud0);
                arrayList0.removeAll(bud0.i());
            }
            __monitor_enter(object1);
        }
        try {
            int v2 = (int)(((Integer)blq.c(this.f, bia.b, Integer.valueOf(0))));
        }
        catch(Throwable throwable4) {
            try {
                __monitor_exit(object1);
                throw throwable4;
            }
            catch(Throwable throwable3) {
                __monitor_exit(object1);
                throw throwable3;
            }
        }
        __monitor_exit(object1);
        try {
            if(v2 == 1) {
                boolean z3 = false;
                boolean z4 = false;
                for(Object object8: arrayList0) {
                    ben ben4 = (ben)object8;
                    if((ben4 instanceof bdf) || (ben4 instanceof bud)) {
                        z4 = true;
                    }
                    else if((ben4 instanceof bce)) {
                        z3 = true;
                    }
                }
                if(!z3 || z4) {
                    boolean z5 = false;
                    boolean z6 = false;
                    for(Object object9: arrayList0) {
                        ben ben5 = (ben)object9;
                        if((ben5 instanceof bdf) || (ben5 instanceof bud)) {
                            z5 = true;
                        }
                        else if((ben5 instanceof bce)) {
                            z6 = true;
                        }
                    }
                    if(!z5 || z6) {
                        object10 = null;
                    }
                    else {
                        object10 = this.l;
                        if(!(object10 instanceof bce)) {
                            bbw bbw0 = new bbw();
                            bbw0.c("ImageCapture-Extra");
                            blb blb0 = bbw0.a;
                            Integer integer2 = (Integer)blb0.m(bkk.d, null);
                            if(integer2 != null) {
                                blb0.c(bkm.l, integer2);
                            }
                            else if(bce.r(blb0)) {
                                blb0.c(bkm.l, Integer.valueOf(0x20));
                            }
                            else if(bce.s(blb0)) {
                                blb0.c(bkm.l, Integer.valueOf(0x20));
                                blb0.c(bkm.m, Integer.valueOf(0x100));
                            }
                            else if(bce.t(blb0)) {
                                blb0.c(bkm.l, Integer.valueOf(0x1005));
                                blb0.c(bkm.F, bat.a);
                            }
                            else {
                                blb0.c(bkm.l, Integer.valueOf(0x100));
                            }
                            bkk bkk0 = bbw0.b();
                            bkn.c(bkk0);
                            bce bce0 = new bce(bkk0);
                            Size size0 = (Size)blb0.m(bkk.K, null);
                            if(size0 != null) {
                                new Rational(size0.getWidth(), size0.getHeight());
                            }
                            kay.j(((Executor)blb0.m(bkk.Q, bov.a())), "The IO executor can\'t be null");
                            bjr bjr1 = bkk.b;
                            if(blb0.s(bjr1)) {
                                Integer integer3 = (Integer)blb0.l(bjr1);
                                if(integer3 == null || ((int)integer3) != 0 && ((int)integer3) != 1 && ((int)integer3) != 2 && ((int)integer3) != 3) {
                                    Objects.toString(integer3);
                                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + integer3);
                                }
                                if(((int)integer3) == 3 && blb0.m(bkk.i, null) == null) {
                                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                                }
                            }
                            object10 = bce0;
                        }
                    }
                }
                else {
                    object10 = this.l;
                    if(!(object10 instanceof bdf)) {
                        bdc bdc0 = new bdc();
                        bdc0.e("Preview-Extra");
                        object10 = bdc0.b();
                        ((bdf)object10).a(new bqf());
                    }
                }
            }
            else {
                object10 = null;
            }
        }
        catch(Throwable throwable3) {
            __monitor_exit(object1);
            throw throwable3;
        }
        __monitor_exit(object1);
        ArrayList arrayList1 = new ArrayList(collection0);
        if(object10 != null) {
            arrayList1.add(object10);
        }
        if(bud0 != null) {
            arrayList1.add(bud0);
            arrayList1.removeAll(bud0.i());
        }
        ArrayList arrayList2 = new ArrayList(arrayList1);
        arrayList2.removeAll(this.i);
        ArrayList arrayList3 = new ArrayList(arrayList1);
        arrayList3.retainAll(this.i);
        ArrayList arrayList4 = new ArrayList(this.i);
        arrayList4.removeAll(arrayList1);
        bia bia0 = this.f;
        Map map0 = bqi.k(arrayList2, bia0.a(), this.h, this.e);
        List[] arr_list = {arrayList2, arrayList3};
        boolean z7 = false;
        int v3 = 0;
        while(v3 < 2) {
            for(Object object11: arr_list[v3]) {
                if(((ben)object11).h == null) {
                    continue;
                }
                else {
                    z7 = true;
                }
                break;
            }
            if(z7) {
                break;
            }
            ++v3;
        }
        try {
            bqp0 = this.r;
            bhi0 = this.a.a;
            range0 = this.e;
            ibuq.f(range0, "targetFrameRate");
            arrayList5 = new ArrayList();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            collection1 = collection0;
            goto label_370;
        }
        try {
            s1 = bhi0.j();
            linkedHashMap0 = new LinkedHashMap();
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            collection1 = collection0;
            goto label_370;
        }
        try {
            LinkedHashMap linkedHashMap1 = new LinkedHashMap();
            for(Object object12: arrayList3) {
                bmi bmi0 = ((ben)object12).j;
                if(bmi0 == null) {
                    throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
                }
                asi asi0 = bqp0.b;
                if(asi0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int v4 = ((ben)object12).v();
                Size size1 = ((ben)object12).A();
                if(size1 == null) {
                    throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
                }
                bmj bmj0 = ((ben)object12).i.j();
                synchronized(asi0.a) {
                    avf0 = (avf)asi0.b.get(s1);
                }
                boolean z8 = avf0 != null;
                kay.b(z8, "No such camera id in supported combination list: " + s1);
                bmp bmp0 = avf0.e(v4, size1, bmj0);
                int v6 = ((ben)object12).v();
                Size size2 = ((ben)object12).A();
                ibuq.c(size2);
                bat bat1 = bmi0.d;
                List list0 = bud.f(((ben)object12));
                bjt bjt0 = bmi0.g;
                int v7 = ((ben)object12).i.y();
                Range range1 = ((ben)object12).i.d(bmi.a);
                if(range1 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bhk bhk0 = new bhk(bmp0, v6, size2, bat1, list0, bjt0, v7, range1, ((ben)object12).i.u());
                arrayList5.add(bhk0);
                linkedHashMap1.put(bhk0, ((ben)object12));
                linkedHashMap0.put(((ben)object12), bmi0);
                bia0 = bia0;
                arrayList3 = arrayList3;
                arrayList4 = arrayList4;
                arrayList1 = arrayList1;
                bud0 = bud0;
                object10 = object10;
                map0 = map0;
            }
            Pair pair0 = new Pair(linkedHashMap0, linkedHashMap1);
            Object object13 = pair0.second;
            ibuq.e(object13, "second");
            Map map1 = bqi.k(arrayList2, bia0.a(), bqp0.a, range0);
            String s2 = bhi0.j();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if(arrayList2.isEmpty()) {
                v8 = 0x7FFFFFFF;
            }
            else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                try {
                    rect0 = null;
                    rect0 = bhi0.e();
                }
                catch(NullPointerException unused_ex) {
                }
                bqq bqq0 = new bqq(bhi0, (rect0 == null ? null : bok.j(rect0)));
                Iterator iterator11 = arrayList2.iterator();
            alab1:
                while(true) {
                    z9 = false;
                    while(true) {
                        if(!iterator11.hasNext()) {
                            break alab1;
                        }
                        Object object14 = iterator11.next();
                        ben ben6 = (ben)object14;
                        Object object15 = map1.get(ben6);
                        if(object15 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        bnc bnc1 = ben6.E(bhi0, ((bqh)object15).a, ((bqh)object15).b);
                        linkedHashMap3.put(bnc1, ben6);
                        linkedHashMap4.put(bnc1, bqq0.c(bnc1));
                        if((ben6 instanceof bdf) || (ben6 instanceof bud)) {
                            if(bnc1.b() != 2) {
                                break;
                            }
                            z9 = true;
                        }
                    }
                }
                asi asi1 = bqp0.b;
                if(asi1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ArrayList arrayList6 = new ArrayList(((Map)object13).keySet());
                boolean z10 = bqi.h(arrayList2);
                kay.b(((boolean)(linkedHashMap4.isEmpty() ^ 1)), "No new use cases to be bound.");
                synchronized(asi1.a) {
                    avf1 = (avf)asi1.b.get(s2);
                }
                boolean z11 = avf1 != null;
                kay.b(z11, "No such camera id in supported combination list: " + s2);
                bmr bmr0 = avf1.d(arrayList6, linkedHashMap4, z9, z10, z7);
                Map map2 = bmr0.a;
                Map map3 = bmr0.b;
                v8 = bmr0.c;
                for(Object object16: linkedHashMap3.entrySet()) {
                    Object object17 = ((Map.Entry)object16).getValue();
                    Object object18 = map2.get(((Map.Entry)object16).getKey());
                    if(object18 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap2.put(object17, object18);
                }
                for(Object object19: map3.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object19;
                    if(((Map)object13).containsKey(map$Entry0.getKey())) {
                        Object object20 = ((Map)object13).get(map$Entry0.getKey());
                        if(object20 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        linkedHashMap2.put(object20, map$Entry0.getValue());
                    }
                }
            }
            bqo bqo0 = new bqo(linkedHashMap2, v8);
            Object object21 = pair0.first;
            ibuq.e(object21, "first");
            return new bqc(collection0, arrayList1, arrayList2, arrayList3, arrayList4, bud0, ((ben)object10), map0, new bqo(ibpz.n(((Map)object21), bqo0.a), bqo0.b), null);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            collection1 = collection0;
        }
    label_370:
        if(!z && !this.m()) {
            return this.j(collection1, true);
        }
        throw illegalArgumentException0;
    }

    static Map k(Collection collection0, bng bng0, bng bng1, Range range0) {
        bnc bnc1;
        Map map0 = new HashMap();
        for(Object object0: collection0) {
            ben ben0 = (ben)object0;
            if((ben0 instanceof bud)) {
                bnc bnc0 = new bdc().b().d(false, bng0);
                if(bnc0 == null) {
                    bnc1 = null;
                }
                else {
                    blb blb0 = blb.b(bnc0);
                    blb0.e(bqt.D);
                    bnc1 = ((bud)ben0).c(blb0).d();
                }
            }
            else {
                bnc1 = ben0.d(false, bng0);
            }
            bnc bnc2 = ben0.d(true, bng1);
            blb blb1 = bnc2 == null ? blb.a() : blb.b(bnc2);
            blb1.c(bnc.t, Integer.valueOf(0));
            if(!bmi.a.equals(range0)) {
                blb1.d(bnc.u, bjs.b, range0);
                blb1.c(bnc.v, Boolean.valueOf(true));
            }
            map0.put(ben0, new bqh(bnc1, ben0.c(blb1).d()));
        }
        return map0;
    }

    private static List l(List list0, Collection collection0) {
        List list1 = new ArrayList(list0);
        for(Object object0: collection0) {
            ben ben0 = (ben)object0;
            Iterator iterator1 = list0.iterator();
            if(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                azr azr0 = (azr)object1;
                throw null;
            }
        }
        return list1;
    }

    private final boolean m() {
        boolean z;
        synchronized(this.g) {
            z = this.f.b() != null;
        }
        return z;
    }

    private static boolean n(Collection collection0) {
        for(Object object0: collection0) {
            ben ben0 = (ben)object0;
            if((ben0 instanceof bce)) {
                bnc bnc0 = ben0.i;
                bjr bjr0 = bkk.e;
                if(bnc0.s(bjr0)) {
                    Integer integer0 = (Integer)bnc0.l(bjr0);
                    kay.i(integer0);
                    if(((int)integer0) == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

