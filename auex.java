import com.google.android.gms.actionlearner.ContextData;

public final class auex implements ibts {
    public final String a;
    public final String b;

    public auex(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(this.a, "<set-?>");
        ((aawz)object0).a = this.a;
        String s = this.b;
        if(s.length() > 0) {
            auev auev0 = new auev(s);
            aaxm aaxm0 = new aaxm();
            auev0.a(aaxm0);
            ((aawz)object0).b = new ContextData(aaxm0.a());
        }
        return ibom.a;
    }
}

