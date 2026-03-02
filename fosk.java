import android.os.health.TimerStat;

final class fosk extends fosi {
    public static final fosk a;

    static {
        fosk.a = new fosk();
    }

    @Override  // fosi
    public final MessageLite a(String s, Object object0) {
        return fosl.g(s, ((TimerStat)object0));
    }

    @Override  // fosi
    public final MessageLite b(MessageLite hfvm0, MessageLite hfvm1) {
        return fosl.f(((iczm)hfvm0), ((iczm)hfvm1));
    }

    @Override  // fosi
    public final String c(MessageLite hfvm0) {
        iczg iczg0 = ((iczm)hfvm0).e;
        if(iczg0 == null) {
            iczg0 = iczg.a;
        }
        if((iczg0.b & 2) != 0) {
            iczg iczg1 = ((iczm)hfvm0).e;
            if(iczg1 == null) {
                iczg1 = iczg.a;
            }
            return iczg1.d;
        }
        iczg iczg2 = ((iczm)hfvm0).e;
        if(iczg2 == null) {
            iczg2 = iczg.a;
        }
        return Long.toHexString(iczg2.c);
    }
}

