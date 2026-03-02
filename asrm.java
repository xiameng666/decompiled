import android.content.Context;
import android.net.Uri;

public final class asrm {
    public final gmcg a;
    public final frli b;
    private final Context c;

    public asrm(Context context0, bbng bbng0) {
        ibuq.f(bbng0, "clock");
        bblp bblp0 = new bblp(1, 10);
        ibuq.f(bbng0, "clock");
        super();
        this.c = context0;
        this.a = bblp0;
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("settings_notifications.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)asrb.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.b = frli0;
    }

    public final Object a(ibrl ibrl0) {
        asrk asrk0;
        if((ibrl0 instanceof asrk)) {
            asrk0 = (asrk)ibrl0;
            int v = asrk0.c;
            if((v & 0x80000000) == 0) {
                asrk0 = new asrk(this, ibrl0);
            }
            else {
                asrk0.c = v - 0x80000000;
            }
        }
        else {
            asrk0 = new asrk(this, ibrl0);
        }
        Object object0 = asrk0.a;
        Object object1 = ibrx.a;
        switch(asrk0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.b.a();
                ibuq.e(gmcd0, "getData(...)");
                asrk0.c = 1;
                object0 = icpu.c(gmcd0, asrk0);
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

    public final Object b(ibrl ibrl0) {
        asrl asrl0;
        if((ibrl0 instanceof asrl)) {
            asrl0 = (asrl)ibrl0;
            int v = asrl0.c;
            if((v & 0x80000000) == 0) {
                asrl0 = new asrl(this, ibrl0);
            }
            else {
                asrl0.c = v - 0x80000000;
            }
        }
        else {
            asrl0 = new asrl(this, ibrl0);
        }
        Object object0 = asrl0.a;
        Object object1 = ibrx.a;
        switch(asrl0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.b.a();
                ibuq.e(gmcd0, "getData(...)");
                asrl0.c = 1;
                object0 = icpu.c(gmcd0, asrl0);
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
        Object object2 = ((asrb)object0).d;
        if(object2 == null) {
            object2 = asrx.a;
        }
        ibuq.e(object2, "getPhotosBackupMissingPermissions(...)");
        return object2;
    }
}

