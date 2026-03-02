import java.util.List;

public final class cog {
    public final hqf a;
    public final List b;
    public final int c;

    public cog(hqf hqf0, List list0) {
        Object object0;
        this.a = hqf0;
        this.b = list0;
        int v = 0;
        if(list0.isEmpty()) {
            object0 = null;
            goto label_20;
        }
        else {
            object0 = list0.get(0);
            int v1 = ((coh)object0).b.a();
            int v2 = ibpo.d(list0);
            if(v2 > 0) {
                int v3 = 1;
                while(true) {
                    Object object1 = list0.get(v3);
                    int v4 = ((coh)object1).b.a();
                    if(v1 < v4) {
                        object0 = object1;
                    }
                    if(v3 == v2) {
                        goto label_20;
                    }
                    ++v3;
                    v1 = v1 >= v4 ? v1 : v4;
                }
            }
            else {
            label_20:
                if(((coh)object0) != null) {
                    v = ((coh)object0).b.a();
                }
            }
        }
        this.c = v;
    }
}

