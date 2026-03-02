import java.util.HashMap;

public final class fmju implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        fmlm fmlm0 = (fmlm)object0;
        Object object1 = new HashMap();
        ((HashMap)object1).put("DISPLAY_TEXT", fmlm0.c);
        ((HashMap)object1).put("ICON", fmlm0.a);
        ((HashMap)object1).put("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON", floh.b(fmlm0.b));
        ((HashMap)object1).put("ACTION", flnq.b(fmlm0.d));
        return object1;
    }
}

