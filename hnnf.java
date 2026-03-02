public final class hnnf {
    private final String a;

    public hnnf(String s) {
        this.a = s;
    }

    public final hnnf a(String s) {
        return new hnnf(this.a);
    }

    public static final void b(Object[] arr_object) {
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null && !(object0 instanceof Byte) && (object0 instanceof byte[])) {
                hnne.a(((byte[])object0));
            }
        }
    }
}

