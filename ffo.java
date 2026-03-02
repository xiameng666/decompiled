public final class ffo implements ibtx {
    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = (int)(((Integer)object2));
        boolean z = true;
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((fzm)object0)) ? 4 : 2);
        }
        if((v & 19) == 18) {
            z = false;
        }
        if(((goz)object1).ad(z, v & 1)) {
            gah.c(((fzm)object0), null, null, 0L, 0L, 0L, 0L, 0L, ((goz)object1), v & 14);
            return ibom.a;
        }
        ((goz)object1).G();
        return ibom.a;
    }
}

