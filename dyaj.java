import android.content.Context;
import android.net.Uri;

public final class dyaj {
    private final frli a;

    public dyaj(Context context0, frii frii0) {
        ibuq.f(frii0, "protoDataStoreFactory");
        super();
        frce frce0 = new frce(context0);
        frce0.d("pay");
        frce0.e("pix_risk_signals.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)dxfq.a(((ProtoLiteMessage)dxfp.a).v_newBuilder()).a()));
        frli frli0 = frii0.a(frie0.a());
        ibuq.e(frli0, "getOrCreate(...)");
        this.a = frli0;
    }

    public final Object a(ibrl ibrl0) {
        dyai dyai0;
        if((ibrl0 instanceof dyai)) {
            dyai0 = (dyai)ibrl0;
            int v = dyai0.c;
            if((v & 0x80000000) == 0) {
                dyai0 = new dyai(this, ibrl0);
            }
            else {
                dyai0.c = v - 0x80000000;
            }
        }
        else {
            dyai0 = new dyai(this, ibrl0);
        }
        Object object0 = dyai0.a;
        Object object1 = ibrx.a;
        switch(dyai0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.a.a();
                ibuq.e(gmcd0, "getData(...)");
                dyai0.c = 1;
                object0 = icpu.c(gmcd0, dyai0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibuq.e(object0, "await(...)");
        return object0;
    }

    public final Object b(dxfp dxfp0, ibrl ibrl0) {
        dyah dyah0 = new dyah(dxfp0);
        Object object0 = ftqa.b(this.a, dyah0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

