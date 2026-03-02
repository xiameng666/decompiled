import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class ueo {
    private final uen a;
    private final Map b;

    public ueo() {
        this.a = new uen(null);
        this.b = new HashMap();
    }

    public final Object a(uev uev0) {
        Map map0 = this.b;
        uen uen0 = (uen)map0.get(uev0);
        if(uen0 == null) {
            uen0 = new uen(uev0);
            map0.put(uev0, uen0);
        }
        else {
            uev0.a();
        }
        ueo.d(uen0);
        uen0.d = this.a;
        uen0.c = this.a.c;
        ueo.e(uen0);
        return uen0.b();
    }

    public final Object b() {
        uen uen0 = this.a;
        for(uen uen1 = uen0.d; !uen1.equals(uen0); uen1 = uen1.d) {
            Object object0 = uen1.b();
            if(object0 != null) {
                return object0;
            }
            ueo.d(uen1);
            this.b.remove(uen1.a);
            ((uev)uen1.a).a();
        }
        return null;
    }

    public final void c(uev uev0, Object object0) {
        Map map0 = this.b;
        uen uen0 = (uen)map0.get(uev0);
        if(uen0 == null) {
            uen0 = new uen(uev0);
            ueo.d(uen0);
            uen0.d = this.a.d;
            uen0.c = this.a;
            ueo.e(uen0);
            map0.put(uev0, uen0);
        }
        else {
            uev0.a();
        }
        if(uen0.b == null) {
            uen0.b = new ArrayList();
        }
        uen0.b.add(object0);
    }

    private static void d(uen uen0) {
        uen0.d.c = uen0.c;
        uen0.c.d = uen0.d;
    }

    private static void e(uen uen0) {
        uen0.c.d = uen0;
        uen0.d.c = uen0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GroupedLinkedMap( ");
        uen uen0 = this.a;
        uen uen1 = uen0.c;
        boolean z;
        for(z = false; !uen1.equals(uen0); z = true) {
            stringBuilder0.append('{');
            stringBuilder0.append(uen1.a);
            stringBuilder0.append(':');
            stringBuilder0.append(uen1.a());
            stringBuilder0.append("}, ");
            uen1 = uen1.c;
        }
        if(z) {
            stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
        }
        stringBuilder0.append(" )");
        return stringBuilder0.toString();
    }
}

