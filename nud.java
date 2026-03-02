import java.util.Map;

public final class nud {
    public static final boolean a(String s) {
        return s != null && s.length() > 0;
    }

    public static final String b(Class class0) {
        ibuq.f(class0, "navigatorClass");
        Map map0 = nue.a;
        String s = (String)map0.get(class0);
        if(s == null) {
            nub nub0 = (nub)class0.getAnnotation(nub.class);
            s = nub0 == null ? null : nub0.a();
            if(!nud.a(s)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + class0.getSimpleName());
            }
            map0.put(class0, s);
            ibuq.c(s);
            return s;
        }
        ibuq.c(s);
        return s;
    }
}

