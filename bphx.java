public final class bphx implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        int v = ((bnvj)object0).l - 1;
        if(((bnvj)object0).l != 0) {
            return v == 0 || v == 2 || v == 3 ? Boolean.valueOf(true) : Boolean.valueOf(((bnvj)object0).equals(bnvj.c));
        }
        throw null;
    }
}

