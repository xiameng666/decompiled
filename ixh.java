import java.util.ArrayList;
import java.util.List;

public final class ixh implements ixm {
    public final iwj a;
    public final List b;
    public final ibnn c;
    public final List d;
    private final ibnn e;

    public ixh(iwj iwj0, jbn jbn0, List list0, jks jks0, jed jed0) {
        iwj iwj1 = iwj0;
        jbn jbn1 = jbn0;
        super();
        this.a = iwj1;
        this.b = list0;
        ixf ixf0 = new ixf(this);
        this.c = ibno.a(ibnp.c, ixf0);
        ixg ixg0 = new ixg(this);
        this.e = ibno.a(ibnp.c, ixg0);
        ixo ixo0 = jbn1.c;
        List list1 = iwj1.d;
        if(list1 == null) {
            list2 = ibps.a;
        }
        else {
            List list2 = ibpo.ao(list1, new iwl());
            if(list2 == null) {
                list2 = ibps.a;
            }
        }
        ArrayList arrayList0 = new ArrayList();
        ibpf ibpf0 = new ibpf();
        int v = list2.size();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            iwh iwh0 = (iwh)list2.get(v1);
            iwh iwh1 = iwh.a(iwh0, ixo0.a(((ixo)iwh0.a)), 0, 14);
            while(true) {
                int v3 = iwh1.b;
                if(v2 >= v3 || ibpf0.isEmpty()) {
                    break;
                }
                iwh iwh2 = (iwh)ibpf0.e();
                int v4 = iwh1.b;
                int v5 = iwh2.c;
                if(v4 < v5) {
                    arrayList0.add(new iwh(iwh2.a, v2, v4));
                    v2 = iwh1.b;
                    continue;
                }
                arrayList0.add(new iwh(iwh2.a, v2, v5));
                v2 = iwh2.c;
                while(!ibpf0.isEmpty() && v2 == ((iwh)ibpf0.e()).c) {
                    ibpf0.removeLast();
                }
            }
            if(v2 < v3) {
                arrayList0.add(new iwh(ixo0, v2, v3));
                v2 = iwh1.b;
            }
            iwh iwh3 = (iwh)ibpf0.f();
            if(iwh3 == null) {
            label_60:
                ibpf0.add(new iwh(iwh1.a, iwh1.b, iwh1.c));
            }
            else {
                int v6 = iwh3.b;
                if(v6 == iwh1.b && iwh3.c == iwh1.c) {
                    ibpf0.removeLast();
                    ibpf0.add(new iwh(((ixo)iwh3.a).a(((ixo)iwh1.a)), iwh1.b, iwh1.c));
                    goto label_61;
                }
                else {
                    int v7 = iwh3.c;
                    if(v6 == v7) {
                        arrayList0.add(new iwh(iwh3.a, v6, v7));
                        ibpf0.removeLast();
                        ibpf0.add(new iwh(iwh1.a, iwh1.b, iwh1.c));
                        goto label_61;
                    }
                    else {
                        if(v7 >= iwh1.c) {
                            ibpf0.add(new iwh(((ixo)iwh3.a).a(((ixo)iwh1.a)), iwh1.b, iwh1.c));
                            goto label_61;
                        }
                        throw new IllegalArgumentException();
                    }
                }
                goto label_60;
            }
        label_61:
            ++v1;
        }
        while(v2 <= iwj1.b.length() && !ibpf0.isEmpty()) {
            iwh iwh4 = (iwh)ibpf0.e();
            arrayList0.add(new iwh(iwh4.a, v2, iwh4.c));
            v2 = iwh4.c;
            while(!ibpf0.isEmpty() && v2 == ((iwh)ibpf0.e()).c) {
                ibpf0.removeLast();
            }
        }
        if(v2 < iwj1.b.length()) {
            arrayList0.add(new iwh(ixo0, v2, iwj1.b.length()));
        }
        if(arrayList0.isEmpty()) {
            arrayList0.add(new iwh(ixo0, 0, 0));
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v8 = arrayList0.size();
        int v9 = 0;
        while(v9 < v8) {
            iwh iwh5 = (iwh)arrayList0.get(v9);
            int v10 = iwh5.b;
            int v11 = iwh5.c;
            if(v10 == v11) {
                s = "";
            }
            else {
                String s = iwj1.b.substring(v10, v11);
                ibuq.e(s, "substring(...)");
            }
            List list3 = iwm.a(iwj1, v10, v11, new iwk());
            if(list3 == null) {
                list3 = ibps.a;
            }
            iwj iwj2 = new iwj(s, list3);
            ixo ixo1 = (ixo)iwh5.a;
            if(ixo1.b == 0) {
                iwh iwh6 = iwh5;
                ixo1 = new ixo(ixo1.a, ixo0.b, ixo1.c, ixo1.d, ixo1.e, ixo1.f, ixo1.g, ixo1.h, ixo1.i);
            }
            else {
                iwh6 = iwh5;
            }
            String s1 = iwj2.b;
            ixo ixo2 = jbn1.c.a(ixo1);
            jbn jbn2 = new jbn(jbn1.b, ixo2);
            List list4 = iwj2.a;
            if(list4 == null) {
                list4 = ibps.a;
            }
            List list5 = this.b;
            int v12 = iwh6.b;
            int v13 = iwh6.c;
            ArrayList arrayList2 = new ArrayList(list5.size());
            int v14 = list5.size();
            int v15 = 0;
            while(v15 < v14) {
                iwh iwh7 = (iwh)list5.get(v15);
                int v16 = iwh7.b;
                int v17 = iwh7.c;
                if(iwm.b(v12, v13, v16, v17)) {
                    if(v12 > v16 || v17 > v13) {
                        jie.a("placeholder can not overlap with paragraph.");
                    }
                    int v18 = v8;
                    arrayList2.add(new iwh(iwh7.a, iwh7.b - v12, iwh7.c - v12));
                }
                else {
                    v18 = v8;
                }
                ++v15;
                ixo0 = ixo0;
                arrayList0 = arrayList0;
                v8 = v18;
            }
            arrayList1.add(new ixl(new jin(s1, jbn2, list4, arrayList2, jed0, jks0), iwh6.b, iwh6.c));
            ++v9;
            iwj1 = iwj0;
            jbn1 = jbn0;
            ixo0 = ixo0;
        }
        this.d = arrayList1;
    }

    @Override  // ixm
    public final float a() {
        return ((Number)this.e.a()).floatValue();
    }

    @Override  // ixm
    public final float b() {
        throw null;
    }

    @Override  // ixm
    public final boolean c() {
        List list0 = this.d;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ixl)list0.get(v1)).a.c()) {
                return true;
            }
        }
        return false;
    }
}

