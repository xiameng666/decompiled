public final class aiyh implements gfsi {
    public final String a;

    public aiyh(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((ajbz)object0) != null) {
            String s = this.a;
            if(((ajbz)object0).i(s)) {
                s.getClass();
                ajbc ajbc0 = (ajbc)((ajbz)object0).k.get(s);
                if(ajbc0 == null) {
                    throw new IllegalArgumentException();
                }
                ajbb ajbb0 = ajbc0.c == null ? ajbb.a : ajbc0.c;
                return aizr.k((ajbn.a(ajbb0.c) == 0 ? 1 : ajbn.a(ajbb0.c)));
            }
        }
        return (int)0;
    }
}

