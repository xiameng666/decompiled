public final class aloi implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        switch(((alua)object0).d) {
            case 0: {
                object1 = alum.a;
                break;
            }
            case 1: {
                object1 = alum.b;
                break;
            }
            default: {
                object1 = null;
            }
        }
        return object1 == null ? alum.c : object1;
    }
}

