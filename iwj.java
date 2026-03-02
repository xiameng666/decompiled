import java.util.ArrayList;
import java.util.List;

public final class iwj implements CharSequence {
    public final List a;
    public final String b;
    public final List c;
    public final List d;

    public iwj(String s) {
        this(s, ibps.a);
    }

    public iwj(String s, List list0) {
        if(list0.isEmpty()) {
            list0 = null;
        }
        this(list0, s);
    }

    public iwj(String s, List list0, byte[] arr_b) {
        if(list0.isEmpty()) {
            list0 = null;
        }
        this(list0, s);
    }

    public iwj(List list0, String s) {
        List list3;
        List list2;
        this.a = list0;
        this.b = s;
        List list1 = null;
        if(list0 == null) {
            list2 = null;
            list3 = null;
        }
        else {
            int v = list0.size();
            list2 = null;
            list3 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                iwh iwh0 = (iwh)list0.get(v1);
                Object object0 = iwh0.a;
                if((object0 instanceof jat)) {
                    if(list2 == null) {
                        list2 = new ArrayList();
                    }
                    ibuq.d(iwh0, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    list2.add(iwh0);
                }
                else if((object0 instanceof ixo)) {
                    if(list3 == null) {
                        list3 = new ArrayList();
                    }
                    ibuq.d(iwh0, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    list3.add(iwh0);
                }
            }
        }
        this.c = list2;
        this.d = list3;
        if(list3 != null) {
            list1 = ibpo.ao(list3, new iwi());
        }
        if(list1 != null && !list1.isEmpty()) {
            bxt bxt0 = bxu.a(((iwh)ibpo.R(list1)).c);
            int v2 = list1.size();
            int v3 = 1;
            while(v3 < v2) {
                iwh iwh1 = (iwh)list1.get(v3);
                while(bxt0.b != 0) {
                    int v4 = bxt0.b();
                    if(iwh1.b >= v4) {
                        bxt0.h(bxt0.b - 1);
                        continue;
                    }
                    else if(iwh1.c > v4) {
                        jie.a(("Paragraph overlap not allowed, end " + iwh1.c + " should be less than or equal to " + v4));
                    }
                    break;
                }
                bxt0.g(iwh1.c);
                ++v3;
            }
        }
    }

    public final char a(int v) {
        return this.b.charAt(v);
    }

    public final int b() {
        return this.b.length();
    }

    public final iwj c(ibts ibts0) {
        iwg iwg0 = new iwg(this);
        List list0 = iwg0.a;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list0.set(v1, iwe.a(((iwh)ibts0.a(iwf.b(((iwf)list0.get(v1)))))));
        }
        return iwg0.d();
    }

    @Override
    public final char charAt(int v) {
        return this.a(v);
    }

    public final iwj d(iwj iwj0) {
        iwg iwg0 = new iwg(this);
        iwg0.i(iwj0);
        return iwg0.d();
    }

    public final iwj e(int v, int v1) {
        if(v > v1) {
            jie.a(("start (" + v + ") should be less or equal to end (" + v1 + ')'));
        }
        if(v == 0 && v1 == this.b.length()) {
            return this;
        }
        String s = this.b.substring(v, v1);
        ibuq.e(s, "substring(...)");
        List list0 = this.a;
        if(v > v1) {
            jie.a(("start (" + v + ") should be less than or equal to end (" + v1 + ')'));
        }
        List list1 = null;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                iwh iwh0 = (iwh)list0.get(v3);
                int v4 = iwh0.b;
                int v5 = iwh0.c;
                if(iwm.b(v, v1, v4, v5)) {
                    arrayList0.add(new iwh(iwh0.a, Math.max(v, v4) - v, Math.min(v1, v5) - v, iwh0.d));
                }
            }
            if(!arrayList0.isEmpty()) {
                list1 = arrayList0;
            }
        }
        return new iwj(list1, s);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof iwj)) {
            return false;
        }
        return ibuq.m(this.b, ((iwj)object0).b) ? ibuq.m(this.a, ((iwj)object0).a) : false;
    }

    public final List f() {
        List list0 = this.c;
        return list0 == null ? ibps.a : list0;
    }

    public final List g(int v) {
        List list0 = this.a;
        if(list0 != null) {
            List list1 = new ArrayList(list0.size());
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = list0.get(v2);
                iwh iwh0 = (iwh)object0;
                if((iwh0.a instanceof ixa) && iwm.b(0, v, iwh0.b, iwh0.c)) {
                    list1.add(object0);
                }
            }
            return list1;
        }
        return ibps.a;
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        return this.a == null ? v : v + this.a.hashCode();
    }

    @Override
    public final int length() {
        return this.b();
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return this.e(v, v1);
    }

    @Override
    public final String toString() {
        return this.b;
    }
}

