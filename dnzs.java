final class dnzs extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        return ((ProtoLiteMessage)(((dlul)object0))).equals(((dlul)object1));
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        hjrn hjrn0 = ((dlul)object0).d;
        if(hjrn0 == null) {
            hjrn0 = hjrn.a;
        }
        String s = hjrn0.e;
        hjrn hjrn1 = ((dlul)object1).d;
        if(hjrn1 == null) {
            hjrn1 = hjrn.a;
        }
        return s.equals(hjrn1.e) && ((dlul)object0).c == ((dlul)object1).c;
    }
}

