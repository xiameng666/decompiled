import java.util.Map.Entry;

public final class leu implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        String s;
        ibuq.f(((Map.Entry)object0), "entry");
        Object object1 = ((Map.Entry)object0).getValue();
        if((object1 instanceof byte[])) {
            s = ibpg.ar(((byte[])object1), ", ", "[", "]", null, 56);
            return "  " + ((ley)((Map.Entry)object0).getKey()).a + " = " + s;
        }
        s = String.valueOf(((Map.Entry)object0).getValue());
        return "  " + ((ley)((Map.Entry)object0).getKey()).a + " = " + s;
    }
}

