import android.content.Context;
import android.net.Uri;
import j..util.DesugarCollections;

public final class ahzo {
    public final Context a;
    public final int b;
    public final int c;
    public final frli d;

    public ahzo(Context context0, int v, int v1) {
        this.a = context0;
        this.b = v;
        this.c = v1;
        frce frce0 = new frce(context0);
        frce0.d("missedcallverification");
        frce0.e("missedCallApiCallHistoryStore.pb");
        Uri uri0 = frce0.a();
        ibuq.e(uri0, "build(...)");
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ahzg.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.d = frli0;
    }

    public final Object a(String s, ibrl ibrl0) {
        ahzn ahzn0;
        if((ibrl0 instanceof ahzn)) {
            ahzn0 = (ahzn)ibrl0;
            int v = ahzn0.c;
            if((v & 0x80000000) == 0) {
                ahzn0 = new ahzn(this, ibrl0);
            }
            else {
                ahzn0.c = v - 0x80000000;
            }
        }
        else {
            ahzn0 = new ahzn(this, ibrl0);
        }
        Object object0 = ahzn0.a;
        Object object1 = ibrx.a;
        switch(ahzn0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.d.a();
                ibuq.e(gmcd0, "getData(...)");
                ahzn0.d = s;
                ahzn0.c = 1;
                object0 = icpu.c(gmcd0, ahzn0);
                return object0 == object1 ? object1 : DesugarCollections.unmodifiableMap(((ahzg)object0).b).get(s);
            }
            case 1: {
                s = ahzn0.d;
                ibnx.b(object0);
                return DesugarCollections.unmodifiableMap(((ahzg)object0).b).get(s);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

