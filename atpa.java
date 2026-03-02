import android.content.Context;
import android.net.Uri;
import j..util.DesugarCollections;

public final class atpa implements atpc {
    public final frli a;
    public static final int b;
    private final Context c;

    static {
        bboh.b("BankScamWarningDS", bbcu.gX);
    }

    public atpa(Context context0) {
        this.c = context0;
        frce frce0 = new frce(context0);
        frce0.d("bankscamwarning");
        frce0.e("BankScamWarningSettings.pb");
        Uri uri0 = frce0.a();
        ibuq.e(uri0, "build(...)");
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)atph.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }

    @Override  // atpc
    public final Object a(String s, ibrl ibrl0) {
        atoz atoz0;
        if((ibrl0 instanceof atoz)) {
            atoz0 = (atoz)ibrl0;
            int v = atoz0.c;
            if((v & 0x80000000) == 0) {
                atoz0 = new atoz(this, ibrl0);
            }
            else {
                atoz0.c = v - 0x80000000;
            }
        }
        else {
            atoz0 = new atoz(this, ibrl0);
        }
        Object object0 = atoz0.a;
        Object object1 = ibrx.a;
        switch(atoz0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                atoz0.d = s;
                atoz0.c = 1;
                object0 = icpu.c(gmcd0, atoz0);
                return object0 == object1 ? object1 : DesugarCollections.unmodifiableMap(((atph)object0).b).get(s);
            }
            case 1: {
                s = atoz0.d;
                ibnx.b(object0);
                return DesugarCollections.unmodifiableMap(((atph)object0).b).get(s);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

