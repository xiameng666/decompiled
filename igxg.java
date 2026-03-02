import java.util.ArrayList;
import java.util.HashMap;

final class igxg {
    private String a;
    private final HashMap b;

    public igxg(igvx igvx0) {
        this.a = null;
        this.b = new HashMap();
        this.c(igvx0);
    }

    public final int a(String s) {
        this.a = s;
        return (int)(((Integer)this.b.get(s)));
    }

    final igvx b(igvx igvx0) {
        igvx igvx1 = new igwg("_" + this.a);
        igvx0.e(igvx1);
        return igvx1;
    }

    private final void c(igvx igvx0) {
        ArrayList arrayList0 = igvx0.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            igvx igvx1 = (igvx)arrayList0.get(v1);
            if((igvx1 instanceof igwb)) {
                HashMap hashMap0 = this.b;
                if(!hashMap0.containsKey(igvx1.d)) {
                    hashMap0.put(igvx1.d, ((Integer)igvx1.b()));
                }
            }
            if((igvx1 instanceof igwr)) {
                HashMap hashMap1 = this.b;
                if(!hashMap1.containsKey(igvx1.d)) {
                    hashMap1.put(igvx1.d, Integer.valueOf(((int)igvx1.toString().equals("1"))));
                }
            }
            if(igvx1.b != null) {
                this.c(igvx1);
            }
        }
    }
}

