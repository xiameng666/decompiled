import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

final class fp extends lsb {
    public static final lsk a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;

    static {
        fp.a = new fo();
    }

    public fp(boolean z) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.g = false;
        this.e = z;
    }

    final void a(du du0) {
        if(this.g) {
            fm.ar(2);
            return;
        }
        HashMap hashMap0 = this.b;
        if(!hashMap0.containsKey(du0.k)) {
            hashMap0.put(du0.k, du0);
            if(fm.ar(2)) {
                Objects.toString(du0);
            }
        }
    }

    final void b(du du0, boolean z) {
        if(fm.ar(3)) {
            Objects.toString(du0);
        }
        this.g(du0.k, z);
    }

    final void c(String s, boolean z) {
        fm.ar(3);
        this.g(s, z);
    }

    final void e(du du0) {
        if(this.g) {
            fm.ar(2);
            return;
        }
        if(this.b.remove(du0.k) != null && fm.ar(2)) {
            Objects.toString(du0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && this.b.equals(((fp)object0).b) && this.c.equals(((fp)object0).c) && this.d.equals(((fp)object0).d);
    }

    final boolean f(du du0) {
        return !this.b.containsKey(du0.k) || !this.e ? true : this.f;
    }

    private final void g(String s, boolean z) {
        HashMap hashMap0 = this.c;
        fp fp0 = (fp)hashMap0.get(s);
        if(fp0 != null) {
            if(z) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.addAll(fp0.c.keySet());
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    fp0.c(((String)arrayList0.get(v1)), true);
                }
            }
            fp0.km();
            hashMap0.remove(s);
        }
        HashMap hashMap1 = this.d;
        lsp lsp0 = (lsp)hashMap1.get(s);
        if(lsp0 != null) {
            lsp0.c();
            hashMap1.remove(s);
        }
    }

    @Override
    public final int hashCode() {
        return (this.b.hashCode() * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
    }

    @Override  // lsb
    protected final void km() {
        boolean z = !fm.ar(3);
        this.f = true;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} Fragments (");
        Iterator iterator0 = this.b.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(object0);
            if(iterator0.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") Child Non Config (");
        Iterator iterator1 = this.c.keySet().iterator();
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            stringBuilder0.append(((String)object1));
            if(iterator1.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(") ViewModelStores (");
        Iterator iterator2 = this.d.keySet().iterator();
        while(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            stringBuilder0.append(((String)object2));
            if(iterator2.hasNext()) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

