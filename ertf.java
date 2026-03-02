import android.content.Context;
import android.content.Intent;
import java.util.List;

public final class ertf {
    private static final List a;
    private final ibnf b;
    private final Context c;

    static {
        ertf.a = ibpo.b("com.google.android.apps.messaging");
    }

    public ertf(ibnf ibnf0, Context context0) {
        ibuq.f(ibnf0, "spatulaSettingsStorageOperations");
        super();
        this.b = ibnf0;
        this.c = context0;
    }

    public static Object a(ertf ertf0, String s, boolean z, ibrl ibrl0) {
        Object object2;
        erte erte0;
        if((ibrl0 instanceof erte)) {
            erte0 = (erte)ibrl0;
            int v = erte0.c;
            if((v & 0x80000000) == 0) {
                erte0 = new erte(ertf0, ibrl0);
            }
            else {
                erte0.c = v - 0x80000000;
            }
        }
        else {
            erte0 = new erte(ertf0, ibrl0);
        }
        Object object0 = erte0.a;
        Object object1 = ibrx.a;
        switch(erte0.c) {
            case 0: {
                ibnx.b(object0);
                if(ibzk.D(s)) {
                    return ibnx.a(new IllegalArgumentException("Account name cannot be blank"));
                }
                erua erua0 = (erua)ertf0.b.get();
                erte0.d = ertf0;
                erte0.e = s;
                erte0.c = 1;
                object2 = erua0.b(s, z, erte0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = erte0.e;
                ertf0 = erte0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibnw.b(object2)) {
            ibom ibom0 = (ibom)object2;
            Intent intent0 = new Intent("com.google.android.gms.spatula.settings.core.SPATULA_SETTING_UPDATED");
            intent0.putExtra("ACCOUNT_NAME", s);
            intent0.addFlags(0x8000000);
            for(Object object3: ertf.a) {
                intent0.setPackage(((String)object3));
                ertf0.c.sendOrderedBroadcast(intent0, null);
            }
        }
        return object2;
    }
}

