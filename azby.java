import android.content.Context;

@ibnh
public final class azby {
    private final ibnf a;

    @Deprecated
    public azby() {
        this.a = new azbx();
    }

    public azby(ibnf ibnf0) {
        this.a = ibnf0;
    }

    public final ayud a(Context context0, String s, String s1) {
        ibnf ibnf0 = this.a;
        if(((gfsx)ibnf0.get()).i()) {
            aytt aytt0 = new aytt(context0, s);
            azcl azcl0 = (azcl)((gfsx)ibnf0.get()).g();
            if(azcl0 != null) {
                aytt0.h = azcl0;
            }
            if(s1 != null) {
                aytt0.f = s1;
            }
            return aytt0.a();
        }
        return new ayud(context0, s, s1);
    }
}

