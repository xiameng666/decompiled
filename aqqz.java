import android.content.Context;
import android.net.Uri;

public final class aqqz {
    public static final bboh a;
    public final Context b;
    public final gmcg c;
    public final frli d;

    static {
        aqqz.a = bboh.b("LogSamplingProtoDataStore", bbcu.dF);
    }

    public aqqz(Context context0) {
        bblp bblp0 = new bblp(1, 9);
        super();
        this.b = context0;
        this.c = bblp0;
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("log_sampling.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqqq.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.d = frli0;
    }

    public final Object a(ibrl ibrl0) {
        Object object2;
        aqqv aqqv0;
        if((ibrl0 instanceof aqqv)) {
            aqqv0 = (aqqv)ibrl0;
            int v = aqqv0.c;
            if((v & 0x80000000) == 0) {
                aqqv0 = new aqqv(this, ibrl0);
            }
            else {
                aqqv0.c = v - 0x80000000;
            }
        }
        else {
            aqqv0 = new aqqv(this, ibrl0);
        }
        Object object0 = aqqv0.a;
        Object object1 = ibrx.a;
        switch(aqqv0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.d.a();
                ibuq.e(gmcd0, "getData(...)");
                aqqv0.c = 1;
                object0 = icpu.c(gmcd0, aqqv0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                ibnx.b(object0);
            label_21:
                object2 = (aqqq)object0;
                if((object2.b & 1) == 0 || ibuq.m((object2.c == null ? hfwn.a : object2.c), hfwo.a(((ProtoLiteMessage)hfwn.a).v_newBuilder()).a())) {
                    aqqv0.c = 2;
                    aqqu aqqu0 = new aqqu(new aqqt());
                    Object object3 = icpu.c(this.d.b(aqqu0, this.c), aqqv0);
                    if(object3 != object1) {
                        object3 = ibom.a;
                    }
                    if(object3 == object1) {
                        return object1;
                    }
                    goto label_31;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
            label_31:
                gmcd gmcd1 = this.d.a();
                ibuq.e(gmcd1, "getData(...)");
                aqqv0.c = 3;
                object0 = icpu.c(gmcd1, aqqv0);
                if(object0 == object1) {
                    return object1;
                }
                object2 = (aqqq)object0;
                break;
            }
            case 3: {
                ibnx.b(object0);
                object2 = (aqqq)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.c(object2);
        return object2;
    }
}

