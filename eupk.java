final class eupk extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        return ((hkhr)object0).h.equals(((hkhr)object1).h) && ((hkhr)object0).i.equals(((hkhr)object1).i) && ((hkhr)object0).l.equals(((hkhr)object1).l);
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        hjqn hjqn0 = ((hkhr)object1).e;
        if(hjqn0 == null) {
            hjqn0 = hjqn.a;
        }
        hjqn hjqn1 = ((hkhr)object0).e;
        if(hjqn1 == null) {
            hjqn1 = hjqn.a;
        }
        return ((ProtoLiteMessage)hjqn0).equals(hjqn1);
    }
}

