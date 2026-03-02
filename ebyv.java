import android.content.Context;

public final class ebyv {
    public final dyfv a;
    public final donp b;
    public final Context c;
    public String d;
    public fhwb e;
    public fich f;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public ebyv(dyfv dyfv0, donp donp0, String s, Context context0) {
        ibuq.f(donp0, "callbacks");
        ibuq.f(s, "callingPackage");
        ibuq.f(context0, "context");
        super();
        this.a = dyfv0;
        this.b = donp0;
        this.c = context0;
    }

    public final boolean a() {
        dykd dykd0;
        int v = (this.a.b == 8 ? ((dyke)this.a.c) : dyke.a).d;
        switch(v) {
            case 0: {
                dykd0 = dykd.a;
                break;
            }
            case 1: {
                dykd0 = dykd.b;
                break;
            }
            default: {
                dykd0 = v == 2 ? dykd.c : null;
            }
        }
        if(dykd0 == null) {
            dykd0 = dykd.d;
        }
        return dykd0 == dykd.b;
    }
}

