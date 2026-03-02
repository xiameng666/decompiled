import android.content.Context;
import com.google.android.gms.chimera.modules.significant.places.AppContextProvider;
import java.io.IOException;

public final class epnr {
    public static final epnr a;
    public static final frli b;
    private static final Context c;

    static {
        epnr.a = new epnr();
        Context context0 = AppContextProvider.a();
        epnr.c = context0;
        frie frie0 = frif.a();
        frce frce0 = new frce(context0);
        frce0.d("location");
        frce0.e("significant_places_preferences.pb");
        frie0.f(frce0.a());
        frie0.e(((MessageLite)epoo.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        epnr.b = cjtb.a.a(frif0);
    }

    public final Object a(ibts ibts0, Object object0, ibrl ibrl0) {
        epnk epnk0;
        if((ibrl0 instanceof epnk)) {
            epnk0 = (epnk)ibrl0;
            int v = epnk0.c;
            if((v & 0x80000000) == 0) {
                epnk0 = new epnk(this, ibrl0);
            }
            else {
                epnk0.c = v - 0x80000000;
            }
        }
        else {
            epnk0 = new epnk(this, ibrl0);
        }
        Object object1 = epnk0.a;
        Object object2 = ibrx.a;
        switch(epnk0.c) {
            case 0: {
                ibnx.b(object1);
                try {
                    gmcd gmcd0 = epnr.b.a();
                    ibuq.e(gmcd0, "getData(...)");
                    epnk0.d = (Integer)object0;
                    epnk0.e = (epnj)ibts0;
                    epnk0.c = 1;
                    object1 = icpu.c(gmcd0, epnk0);
                    if(object1 == object2) {
                        return object2;
                    label_22:
                        ibts0 = epnk0.e;
                        object0 = epnk0.d;
                        ibnx.b(object1);
                    }
                    ibuq.e(object1, "await(...)");
                    return ibts0.a(object1);
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_22;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(epon.a.i(), "error reading significant places preferences proto", iOException0);
        return object0;
    }

    public final Object b(ibrl ibrl0) {
        return this.a(new epnj(), new Integer(0), ibrl0);
    }

    public final Object c(int v, ibrl ibrl0) {
        Object object0 = this.d(new epnl(v, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object d(ibtw ibtw0, ibrl ibrl0) {
        epnm epnm0;
        if((ibrl0 instanceof epnm)) {
            epnm0 = (epnm)ibrl0;
            int v = epnm0.c;
            if((v & 0x80000000) == 0) {
                epnm0 = new epnm(this, ibrl0);
            }
            else {
                epnm0.c = v - 0x80000000;
            }
        }
        else {
            epnm0 = new epnm(this, ibrl0);
        }
        Object object0 = epnm0.a;
        Object object1 = ibrx.a;
        switch(epnm0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    epnq epnq0 = new epnq(ibtw0, null);
                    epnm0.c = 1;
                    if(iccl.a(epnq0, epnm0) == object1) {
                        return object1;
                    label_18:
                        ibnx.b(object0);
                        return ibom.a;
                    }
                    return ibom.a;
                }
                catch(IOException iOException0) {
                    break;
                }
            }
            case 1: {
                goto label_18;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a.ae(epon.a.i(), "error writing significant places preferences proto", iOException0);
        return ibom.a;
    }
}

