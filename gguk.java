import java.util.Iterator;

final class gguk implements ggug {
    @Override  // ggug
    public final void a(ggsx ggsx0, Iterator iterator0, Object object0) {
        ggwv.b(ggsx0.b, "non repeating key");
        if(ggsx0.c && gguv.a() > 20) {
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                ((ggsw)object0).a(ggsx0.a, object1);
            }
            return;
        }
        ggsx0.a(iterator0, ((ggsw)object0));
    }
}

