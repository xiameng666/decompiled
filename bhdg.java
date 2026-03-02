public final class bhdg implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        switch(((bhcl)object0).b) {
            case 0: {
                object1 = bhck.a;
                break;
            }
            case 1: {
                object1 = bhck.b;
                break;
            }
            case 2: {
                object1 = bhck.c;
                break;
            }
            default: {
                object1 = null;
            }
        }
        return object1 == null ? bhck.d : object1;
    }
}

