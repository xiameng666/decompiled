public final class dtzc {
    public static String a(qjd qjd0) {
        if((qjd0 instanceof qjn)) {
            return ((qjn)qjd0).a;
        }
        if((qjd0 instanceof qjo)) {
            return qjd0.toString();
        }
        throw new IllegalArgumentException("DataItem is not a UnicodeString");
    }
}

