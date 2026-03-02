import java.util.List;

public final class cany implements gfsi {
    public final caod a;

    public cany(caod caod0) {
        this.a = caod0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        canh canh0 = this.a.f;
        canh0.c();
        if(((List)object0) == null) {
            canh0.g(4);
            cakj.a().d(canh0.a());
            return Boolean.valueOf(false);
        }
        int v = 1;
        for(Object object1: ((List)object0)) {
            v &= ((Boolean)object1).booleanValue();
        }
        if(v == 0) {
            canh0.g(4);
        }
        else {
            canh0.g(3);
        }
        cakj cakj0 = cakj.a();
        canh0.c();
        cakj0.d(canh0.a());
        return Boolean.valueOf(((boolean)v));
    }
}

