import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bmb {
    public final List a;
    public final bly b;
    public final List c;
    public final List d;
    public final List e;
    public final blv f;
    public final bjo g;
    public final int h;
    public final InputConfiguration i;
    private static final List j;

    static {
        bmb.j = Arrays.asList(new Integer[]{((int)1), ((int)5), ((int)3)});
    }

    public bmb(List list0, List list1, List list2, List list3, bjo bjo0, blv blv0, InputConfiguration inputConfiguration0, int v, bly bly0) {
        this.a = list0;
        this.c = DesugarCollections.unmodifiableList(list1);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = DesugarCollections.unmodifiableList(list3);
        this.f = blv0;
        this.g = bjo0;
        this.i = inputConfiguration0;
        this.h = v;
        this.b = bly0;
    }

    public static int a(int v, int v1) {
        return bmb.j.indexOf(Integer.valueOf(v)) < bmb.j.indexOf(Integer.valueOf(v1)) ? v1 : v;
    }

    public final int b() {
        return this.g.f;
    }

    public final Range c() {
        return this.g.d();
    }

    public final bjt d() {
        return this.g.e;
    }

    public static bmb e() {
        return new bmb(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new bjm().b(), null, null, 0, null);
    }

    public final List f() {
        return this.g.h;
    }

    public final List g() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            arrayList0.add(((bly)object0).a);
            for(Object object1: ((bly)object0).b) {
                arrayList0.add(((bka)object1));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }
}

