public final class aloe implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1;
        switch(((alua)object0).g) {
            case 0: {
                object1 = aldk.a;
                break;
            }
            case 1: {
                object1 = aldk.b;
                break;
            }
            case 2: {
                object1 = aldk.c;
                break;
            }
            default: {
                object1 = null;
            }
        }
        return object1 == null ? aldk.d : object1;
    }
}

