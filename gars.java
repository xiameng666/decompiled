import java.util.Iterator;
import java.util.Map;

public final class gars implements lqj {
    public final garw a;

    public gars(garw garw0) {
        this.a = garw0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        gged_interceptors gged0 = gged_interceptors.i(this.a.e);
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            gbvh gbvh0 = (gbvh)gged0.get(v1);
            Iterator iterator0 = gbvh0.a().iterator();
        label_6:
            if(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                fbnf fbnf0 = (fbnf)((Map)object0).get(((Long)object1));
                if(fbnf0 == null) {
                    fbnf0 = fbnf.c;
                }
                switch(fbnf0.ordinal()) {
                    case 2: {
                        goto label_6;
                    }
                    case 3: {
                        if(gbvh0.p == hcog.c) {
                            gbvh0.aA();
                        }
                    }
                }
            }
            else {
                gbvh0.I();
            }
            ++v1;
        }
    }
}

