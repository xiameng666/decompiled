import j..util.DesugarCollections;
import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

public final class ifzg implements igad {
    public final igac a;

    public ifzg(igac igac0) {
        this.a = igac0;
    }

    @Override  // igad
    public final void a() {
        igac igac0 = this.a;
        if(igac0.q == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        String s = "http/1.1";
        String s1;
        for(int v = 0; (s1 = igac0.q.getHeaderFieldKey(v)) != null; ++v) {
            if("X-Android-Selected-Transport".equalsIgnoreCase(s1)) {
                s = igac0.q.getHeaderField(v);
            }
            if(!s1.startsWith("X-Android")) {
                arrayList0.add(new AbstractMap.SimpleEntry(s1, igac0.q.getHeaderField(v)));
            }
        }
        int v1 = igac0.q.getResponseCode();
        igan igan0 = new igan(new ArrayList(igac0.f), v1, igac0.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList0), s);
        if(v1 >= 300 && v1 < 400) {
            List list0 = (List)igan0.getAllHeaders().get("location");
            if(list0 != null) {
                igac0.j(1, 2, new ifzk(igac0, ((String)list0.get(0)), igan0));
                return;
            }
        }
        igac0.o = igan0;
        igac0.e();
        if(v1 >= 400) {
            InputStream inputStream0 = igac0.q.getErrorStream();
            igac0.n = inputStream0 == null ? null : ifyi.a(inputStream0);
            igac0.b.d();
            return;
        }
        igac0.n = ifyi.a(igac0.q.getInputStream());
        igac0.b.d();
    }
}

