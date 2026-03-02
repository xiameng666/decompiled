import java.util.Comparator;

public final class cfu implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        float f = -1.0f;
        Float float0 = (float)(Float.compare(((cfk)object0).a(), 0.0f) != 0 || !(((cfk)object0) instanceof cfk) || ((cfk)object0).h != null ? ((cfk)object0).a() : -1.0f);
        if((((cfk)object1).a() != 0.0f || !(((cfk)object1) instanceof cfk)) || ((cfk)object1).h != null) {
            f = ((cfk)object1).a();
        }
        return ibrc.a(float0, Float.valueOf(f));
    }
}

