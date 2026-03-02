import j..util.DesugarCollections;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class aes extends ajk {
    public final String a;
    final List b;
    public final String c;
    private final List d;

    public aes(String s, List list0, List list1) {
        this.a = s;
        kay.i(list0);
        this.b = list0;
        this.d = list1;
        this.c = "";
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.d);
    }

    public final List b() {
        aem aem0;
        List list0 = this.b;
        if(list0.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list1 = new ArrayList(list0.size());
        for(int v = 0; v < list0.size(); ++v) {
            ajt ajt0 = (ajt)list0.get(v);
            kay.i(ajt0);
            switch(ajt0.b) {
                case 1: {
                    aem0 = new aer(ajt0);
                    break;
                }
                case 2: {
                    aem0 = new aeo(ajt0);
                    break;
                }
                case 3: {
                    aem0 = new ael(ajt0);
                    break;
                }
                case 4: {
                    aem0 = new aee(ajt0);
                    break;
                }
                case 5: {
                    aem0 = new aeh(ajt0);
                    break;
                }
                case 6: {
                    aem0 = new aej(ajt0);
                    break;
                }
                default: {
                    aem0 = new aem(ajt0);
                }
            }
            list1.add(aem0);
        }
        return list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof aes)) {
            return false;
        }
        if(this.a.equals(((aes)object0).a)) {
            if(!this.c.equals(((aes)object0).c)) {
                return false;
            }
            return this.a().equals(((aes)object0).a()) ? this.b().equals(((aes)object0).b()) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        List list0 = this.b();
        List list1 = this.a();
        return Objects.hash(new Object[]{this.a, list0, list1, this.c});
    }

    @Override
    public final String toString() {
        aka aka0 = new aka();
        aka0.a("{\n");
        aka0.d();
        aka0.a("schemaType: \"");
        aka0.a(this.a);
        aka0.a("\",\n");
        aka0.a("description: \"");
        aka0.a(this.c);
        aka0.a("\",\n");
        aka0.a("properties: [\n");
        aep[] arr_aep = (aep[])this.b().toArray(new aep[0]);
        Arrays.sort(arr_aep, new aeb());
        for(int v = 0; v < arr_aep.length; ++v) {
            aep aep0 = arr_aep[v];
            aka0.d();
            aep0.h(aka0);
            if(v != arr_aep.length - 1) {
                aka0.a(",\n");
            }
            aka0.c();
        }
        aka0.a("\n");
        aka0.a("]\n");
        aka0.c();
        aka0.a("}");
        return aka0.toString();
    }
}

