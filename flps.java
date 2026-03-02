import java.util.HashMap;

public final class flps implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        fmhp fmhp0 = (fmhp)object0;
        Object object1 = new HashMap();
        ((HashMap)object1).put("ID", Integer.valueOf(fmhp0.b));
        ((HashMap)object1).put("TEXT", fmhp0.c);
        ((HashMap)object1).put("SECONDARY_TEXT", fmhp0.f);
        flpt flpt0 = new flpt(((HashMap)object1));
        flbl.b(fmhp0.d, flpt0);
        ((HashMap)object1).put("ACTION", flnq.b(fmhp0.e));
        return object1;
    }
}

