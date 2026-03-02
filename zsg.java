import android.os.Bundle;
import j..util.Objects;

public final class zsg extends lp {
    public static final zsg a;

    static {
        zsg.a = new zsg();
    }

    @Override  // lp
    public final Object a(Object object0, Object object1) {
        Object object2 = new Bundle();
        if((((aaem)object0) instanceof znm) && (((aaem)object1) instanceof znm)) {
            ((Bundle)object2).putBoolean("EXPANDED_COLLAPSED_STATE_CHANGED", true);
            return object2;
        }
        if((((aaem)object0) instanceof zno) && (((aaem)object1) instanceof zno)) {
            ((Bundle)object2).putBoolean("EXPAND_OVERFLOW_STATE_CHANGED", true);
        }
        return object2;
    }

    @Override  // lp
    public final boolean b(Object object0, Object object1) {
        if((((aaem)object0) instanceof znm) && (((aaem)object1) instanceof znm)) {
            return !Objects.equals(((znm)(((aaem)object0))).a, ((znm)(((aaem)object1))).a) || ((znm)(((aaem)object0))).c != ((znm)(((aaem)object1))).c ? false : !hoju.j() || ((znm)(((aaem)object0))).b == ((znm)(((aaem)object1))).b;
        }
        if(hoju.j() && hoju.d() && (((aaem)object0) instanceof znp) && (((aaem)object1) instanceof znp)) {
            return ((znp)(((aaem)object0))).d == ((znp)(((aaem)object1))).d ? ((znp)(((aaem)object0))).c == ((znp)(((aaem)object1))).c : false;
        }
        if((((aaem)object0) instanceof zno) && (((aaem)object1) instanceof zno)) {
            if(((zno)(((aaem)object0))).f == ((zno)(((aaem)object1))).f) {
                return hoju.j() ? ((zno)(((aaem)object0))).e == ((zno)(((aaem)object1))).e : true;
            }
            return false;
        }
        return Objects.equals(((aaem)object0), ((aaem)object1));
    }

    @Override  // lp
    public final boolean c(Object object0, Object object1) {
        if(((aaem)object0).a() != ((aaem)object1).a()) {
            return false;
        }
        if(hoju.j() && hoju.d() && (((aaem)object0) instanceof znp) && (((aaem)object1) instanceof znp)) {
            return true;
        }
        if(hoju.j() && (((aaem)object0) instanceof aaeq) && (((aaem)object1) instanceof aaeq)) {
            return true;
        }
        if((((aaem)object0) instanceof zno) && (((aaem)object1) instanceof zno)) {
            return true;
        }
        return !(((aaem)object0) instanceof aaex) || !(((aaem)object1) instanceof aaex) ? Objects.equals(((aaem)object0), ((aaem)object1)) : Objects.equals(((aaex)(((aaem)object0))).h, ((aaex)(((aaem)object1))).h);
    }
}

