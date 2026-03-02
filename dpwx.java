import android.util.Pair;

final class dpwx extends lp {
    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        return ((ProtoLiteMessage)(((hkhr)((Pair)object1).first))).equals(((Pair)object0).first) && ((Boolean)((Pair)object1).second).equals(((Pair)object0).second);
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        hjqn hjqn0 = ((hkhr)((Pair)object1).first).e;
        if(hjqn0 == null) {
            hjqn0 = hjqn.a;
        }
        hjqn hjqn1 = ((hkhr)((Pair)object0).first).e;
        if(hjqn1 == null) {
            hjqn1 = hjqn.a;
        }
        return ((ProtoLiteMessage)hjqn0).equals(hjqn1);
    }
}

