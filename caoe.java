import j..util.Objects;
import java.util.List;

final class caoe implements gfsi {
    final caoh a;

    public caoe(caoh caoh0) {
        Objects.requireNonNull(caoh0);
        this.a = caoh0;
        super();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        canh canh0 = this.a.e;
        canh0.c();
        if(((List)object0) == null) {
            canh0.g(4);
            cakj.a().d(canh0.a());
            return Boolean.valueOf(false);
        }
        Object object1 = Boolean.valueOf(true);
        for(Object object2: ((List)object0)) {
            object1 = Boolean.valueOf(((boolean)(((Boolean)object1).booleanValue() & ((Boolean)object2).booleanValue())));
        }
        if(((Boolean)object1).booleanValue()) {
            canh0.g(3);
        }
        else {
            canh0.g(4);
        }
        cakj cakj0 = cakj.a();
        canh0.c();
        cakj0.d(canh0.a());
        return object1;
    }
}

