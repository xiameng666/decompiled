import java.util.Iterator;

final class ggsh extends ggsx {
    public ggsh(Class class0) {
        super("group_by", class0, true);
    }

    @Override  // ggsx
    public final void a(Iterator iterator0, ggsw ggsw0) {
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!iterator0.hasNext()) {
                ggsw0.a(this.a, object0);
                return;
            }
            StringBuilder stringBuilder0 = new StringBuilder("[");
            stringBuilder0.append(object0);
            do {
                stringBuilder0.append(',');
                Object object1 = iterator0.next();
                stringBuilder0.append(object1);
            }
            while(iterator0.hasNext());
            stringBuilder0.append(']');
            ggsw0.a(this.a, stringBuilder0.toString());
        }
    }
}

