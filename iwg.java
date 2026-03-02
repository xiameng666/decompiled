import java.util.ArrayList;
import java.util.List;

public final class iwg implements Appendable {
    public final List a;
    private final StringBuilder b;
    private final List c;

    public iwg() {
        this(null);
    }

    public iwg(int v) {
        this.b = new StringBuilder(v);
        this.c = new ArrayList();
        this.a = new ArrayList();
        new ArrayList();
    }

    public iwg(iwj iwj0) {
        this(null);
        this.i(iwj0);
    }

    public iwg(byte[] arr_b) {
        this(16);
    }

    public final int a() {
        return this.b.length();
    }

    @Override
    public final Appendable append(char c) {
        this.b.append(c);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence0) {
        this.l(charSequence0);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence0, int v, int v1) {
        if((charSequence0 instanceof iwj)) {
            int v2 = this.b.length();
            this.b.append(((iwj)charSequence0).b, v, v1);
            List list0 = iwm.a(((iwj)charSequence0), v, v1, null);
            if(list0 != null) {
                int v3 = list0.size();
                for(int v4 = 0; v4 < v3; ++v4) {
                    iwh iwh0 = (iwh)list0.get(v4);
                    iwf iwf0 = new iwf(iwh0.a, iwh0.b + v2, iwh0.c + v2, iwh0.d);
                    this.a.add(iwf0);
                }
            }
            return this;
        }
        this.b.append(charSequence0, v, v1);
        return this;
    }

    public final int b(ixa ixa0) {
        iwf iwf0 = new iwf(ixa0, this.b.length(), 0, 12);
        this.c.add(iwf0);
        this.a.add(iwf0);
        return this.c.size() - 1;
    }

    public final int c(jat jat0) {
        iwf iwf0 = new iwf(jat0, this.b.length(), 0, 12);
        this.c.add(iwf0);
        this.a.add(iwf0);
        return this.c.size() - 1;
    }

    public final iwj d() {
        StringBuilder stringBuilder0 = this.b;
        String s = stringBuilder0.toString();
        List list0 = this.a;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(((iwf)list0.get(v1)).a(stringBuilder0.length()));
        }
        return new iwj(s, arrayList0);
    }

    public final void e(iwy iwy0, int v, int v1) {
        iwf iwf0 = new iwf(iwy0, v, v1, 8);
        this.a.add(iwf0);
    }

    public final void f(iwz iwz0, int v, int v1) {
        iwf iwf0 = new iwf(iwz0, v, v1, 8);
        this.a.add(iwf0);
    }

    public final void g(String s, String s1, int v, int v1) {
        iwf iwf0 = new iwf(new jaw(s1), v, v1, s);
        this.a.add(iwf0);
    }

    public final void h(jat jat0, int v, int v1) {
        iwf iwf0 = new iwf(jat0, v, v1, 8);
        this.a.add(iwf0);
    }

    public final void i(iwj iwj0) {
        int v = this.b.length();
        this.b.append(iwj0.b);
        List list0 = iwj0.a;
        if(list0 != null) {
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                iwh iwh0 = (iwh)list0.get(v2);
                iwf iwf0 = new iwf(iwh0.a, iwh0.b + v, iwh0.c + v, iwh0.d);
                this.a.add(iwf0);
            }
        }
    }

    public final void j(String s) {
        this.b.append(s);
    }

    public final void k(int v) {
        List list0 = this.c;
        if(v >= list0.size()) {
            jie.b((v + " should be less than " + list0.size()));
        }
        while(list0.size() - 1 >= v) {
            if(list0.isEmpty()) {
                jie.b("Nothing to pop.");
            }
            ((iwf)list0.remove(list0.size() - 1)).a = this.b.length();
        }
    }

    public final void l(CharSequence charSequence0) {
        if((charSequence0 instanceof iwj)) {
            this.i(((iwj)charSequence0));
            return;
        }
        this.b.append(charSequence0);
    }
}

