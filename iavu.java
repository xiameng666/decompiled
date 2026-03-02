import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class iavu extends iavq {
    final iawg a;

    public iavu(iawh iawh0, iawg iawg0) {
        this.a = iawg0;
        Objects.requireNonNull(iawh0);
        super(iawh0.a);
    }

    @Override  // iavq
    public final void a() {
        List list1;
        iawg iawg0;
        for(List list0 = new ArrayList(); true; list0 = list1) {
            iawg0 = this.a;
            synchronized(iawg0) {
                if(iawg0.c.isEmpty()) {
                    break;
                }
                list1 = iawg0.c;
                iawg0.c = list0;
            }
            for(Object object0: list1) {
                ((Runnable)object0).run();
            }
            list1.clear();
        }
        iawg0.c = null;
        iawg0.b = true;
    }
}

