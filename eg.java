public class eg {
    public static final int a;
    private static final bzs b;

    static {
        eg.b = new bzs();
    }

    public static Class a(ClassLoader classLoader0, String s) {
        bzs bzs0 = eg.b;
        bzs bzs1 = (bzs)bzs0.get(classLoader0);
        if(bzs1 == null) {
            bzs1 = new bzs();
            bzs0.put(classLoader0, bzs1);
        }
        Class class0 = (Class)bzs1.get(s);
        if(class0 == null) {
            Class class1 = Class.forName(s, false, classLoader0);
            bzs1.put(s, class1);
            return class1;
        }
        return class0;
    }

    public du b(String s) {
        throw null;
    }
}

