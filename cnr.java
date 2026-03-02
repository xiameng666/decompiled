import java.util.LinkedHashMap;
import java.util.List;

public final class cnr implements ibty {
    public final boolean a;
    public final cog b;
    public final ibty c;

    public cnr(boolean z, cog cog0, ibty ibty0) {
        this.a = z;
        this.b = cog0;
        this.c = ibty0;
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        Float float0 = (Float)object0;
        Float float1 = (Float)object1;
        int v = (int)(((Integer)object3));
        if(((goz)object2).ad((v & 0x81) != 0x80, v & 1)) {
            cog cog0 = this.b;
            hqf hqf0 = cog0.a;
            clj clj0 = clz.d(Boolean.valueOf(this.a), hqf0.d, ((goz)object2), 0, 0);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            ((goz)object2).M(0xEF0270F1);
            List list0 = cog0.b;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                coh coh0 = (coh)list0.get(v2);
                cok cok0 = coh0.b;
                int v3 = cog0.c;
                ((goz)object2).M(0xD7BC1271);
                Object object4 = ((goz)object2).k();
                if(object4 == gop.a) {
                    object4 = new cpm();
                    ((goz)object2).R(object4);
                }
                cok0.c(clj0, ((cpm)object4), v3, ((goz)object2), 0);
                ((goz)object2).A();
                String s = coh0.a;
                cpm cpm0 = (cpm)linkedHashMap0.get(s);
                if(cpm0 == null) {
                    linkedHashMap0.put(s, ((cpm)object4));
                }
                else {
                    gui gui0 = ((cpm)object4).a;
                    if(gui0 != null) {
                        cpm0.a = gui0;
                    }
                    gui gui1 = ((cpm)object4).b;
                    if(gui1 != null) {
                        cpm0.b = gui1;
                    }
                    gui gui2 = ((cpm)object4).c;
                    if(gui2 != null) {
                        cpm0.c = gui2;
                    }
                    gui gui3 = ((cpm)object4).d;
                    if(gui3 != null) {
                        cpm0.d = gui3;
                    }
                    gui gui4 = ((cpm)object4).e;
                    if(gui4 != null) {
                        cpm0.e = gui4;
                    }
                    gui gui5 = ((cpm)object4).f;
                    if(gui5 != null) {
                        cpm0.f = gui5;
                    }
                    gui gui6 = ((cpm)object4).g;
                    if(gui6 != null) {
                        cpm0.g = gui6;
                    }
                    gui gui7 = ((cpm)object4).h;
                    if(gui7 != null) {
                        cpm0.h = gui7;
                    }
                    gui gui8 = ((cpm)object4).i;
                    if(gui8 != null) {
                        cpm0.i = gui8;
                    }
                    gui gui9 = ((cpm)object4).j;
                    if(gui9 != null) {
                        cpm0.j = gui9;
                    }
                    gui gui10 = ((cpm)object4).k;
                    if(gui10 != null) {
                        cpm0.k = gui10;
                    }
                    gui gui11 = ((cpm)object4).l;
                    if(gui11 != null) {
                        cpm0.l = gui11;
                    }
                    gui gui12 = ((cpm)object4).m;
                    if(gui12 != null) {
                        cpm0.m = gui12;
                    }
                    gui gui13 = ((cpm)object4).n;
                    if(gui13 != null) {
                        cpm0.n = gui13;
                    }
                    gui gui14 = ((cpm)object4).o;
                    if(gui14 != null) {
                        cpm0.o = gui14;
                    }
                    gui gui15 = ((cpm)object4).p;
                    if(gui15 != null) {
                        cpm0.p = gui15;
                    }
                }
            }
            ((goz)object2).A();
            this.c.a(hqf0.i, linkedHashMap0, ((goz)object2), Integer.valueOf(0));
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

