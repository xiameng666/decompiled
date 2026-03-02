import android.net.Uri;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;
import java.util.Arrays;

public final class dyar {
    public static final int a;
    private static final bboh b;
    private final dybr c;
    private final frli d;

    static {
        dyar.b = bboh.b("tapandpay", bbcu.cZ);
    }

    public dyar(String s, String s1) {
        frce frce0 = new frce(AppContextProvider.a());
        frce0.d("tapandpay");
        String s2 = String.format("%s_%s_%s", Arrays.copyOf(new Object[]{s, s1, "purchase_settings_datastore.pb"}, 3));
        ibuq.e(s2, "format(...)");
        frce0.e(s2);
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)fter.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        frli frli0 = cjtb.a.a(frif0);
        ibuq.e(frli0, "getOrCreate(...)");
        this.d = frli0;
        this.c = new dybr(s, s1);
    }

    public final Object a(dyna dyna0, ibrl ibrl0) {
        Object object2;
        dyam dyam0;
        if((ibrl0 instanceof dyam)) {
            dyam0 = (dyam)ibrl0;
            int v = dyam0.c;
            if((v & 0x80000000) == 0) {
                dyam0 = new dyam(this, ibrl0);
            }
            else {
                dyam0.c = v - 0x80000000;
            }
        }
        else {
            dyam0 = new dyam(this, ibrl0);
        }
        Object object0 = dyam0.a;
        Object object1 = ibrx.a;
        switch(dyam0.c) {
            case 0: {
                ibnx.b(object0);
                dyam0.d = dyna0;
                dyam0.c = 1;
                object0 = this.b(dyna0.name(), dyam0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                dyna0 = dyam0.d;
                ibnx.b(object0);
            label_21:
                if(((ftix)object0) != null) {
                    return (ftix)object0;
                }
                evql evql0 = edng.a(gdtf.j(this.c.a.a(), new dybq(dyna0), gmap.a));
                dyam0.d = null;
                dyam0.c = 2;
                object2 = fsdk.a(evql0, dyam0);
                if(object2 == object1) {
                    return object1;
                }
                goto label_31;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ibnx.b(object0);
        object2 = ((ibnw)object0).a;
    label_31:
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dyar.b.j(), "Failed to get last topup settings from SE data store.", throwable0);
        }
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        dykr dykr0 = ((gfsx)object2) == null ? null : ((dykr)((gfsx)object2).g());
        if(dykr0 == null) {
            return null;
        }
        ftiz ftiz0 = ftiy.a(((ProtoLiteMessage)ftix.a).v_newBuilder());
        ftiz0.b(dykr0.b);
        return ftiz0.a();
    }

    public final Object b(String s, ibrl ibrl0) {
        Object object2;
        dyan dyan0;
        if((ibrl0 instanceof dyan)) {
            dyan0 = (dyan)ibrl0;
            int v = dyan0.c;
            if((v & 0x80000000) == 0) {
                dyan0 = new dyan(this, ibrl0);
            }
            else {
                dyan0.c = v - 0x80000000;
            }
        }
        else {
            dyan0 = new dyan(this, ibrl0);
        }
        Object object0 = dyan0.a;
        Object object1 = ibrx.a;
        switch(dyan0.c) {
            case 0: {
                ibnx.b(object0);
                gmcd gmcd0 = this.d.a();
                ibuq.e(gmcd0, "getData(...)");
                evql evql0 = edng.a(gmcd0);
                dyan0.d = s;
                dyan0.c = 1;
                object2 = fsdk.a(evql0, dyan0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                s = dyan0.d;
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dyar.b.j(), "Failed to get last topup settings.", throwable0);
        }
        if((object2 instanceof ibnv)) {
            object2 = null;
        }
        if(((fter)object2) != null) {
            s.getClass();
            Object object3 = (ftix)((fter)object2).b.get(s);
            return object3 == null ? null : object3;
        }
        return null;
    }

    public final Object c(dyna dyna0, ftix ftix0, ibrl ibrl0) {
        dyao dyao0;
        if((ibrl0 instanceof dyao)) {
            dyao0 = (dyao)ibrl0;
            int v = dyao0.c;
            if((v & 0x80000000) == 0) {
                dyao0 = new dyao(this, ibrl0);
            }
            else {
                dyao0.c = v - 0x80000000;
            }
        }
        else {
            dyao0 = new dyao(this, ibrl0);
        }
        Object object0 = dyao0.a;
        Object object1 = ibrx.a;
        switch(dyao0.c) {
            case 0: {
                ibnx.b(object0);
                dyao0.d = dyna0;
                dyao0.e = ftix0;
                dyao0.c = 1;
                if(this.d(dyna0.name(), ftix0, dyao0) == object1) {
                    return object1;
                }
                goto label_22;
            }
            case 1: {
                ftix0 = dyao0.e;
                dyna0 = dyao0.d;
                ibnx.b(object0);
            label_22:
                if(hwue.a.b().g()) {
                    dyao0.d = null;
                    dyao0.e = null;
                    dyao0.c = 2;
                    if(this.e(dyna0, ftix0, dyao0) == object1) {
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(String s, ftix ftix0, ibrl ibrl0) {
        Object object2;
        dyap dyap0;
        if((ibrl0 instanceof dyap)) {
            dyap0 = (dyap)ibrl0;
            int v = dyap0.c;
            if((v & 0x80000000) == 0) {
                dyap0 = new dyap(this, ibrl0);
            }
            else {
                dyap0.c = v - 0x80000000;
            }
        }
        else {
            dyap0 = new dyap(this, ibrl0);
        }
        Object object0 = dyap0.a;
        Object object1 = ibrx.a;
        switch(dyap0.c) {
            case 0: {
                ibnx.b(object0);
                dyal dyal0 = new dyal(new dyak(s, ftix0));
                evql evql0 = edng.a(this.d.b(dyal0, gmap.a));
                dyap0.c = 1;
                object2 = fsdk.a(evql0, dyap0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dyar.b.j(), "Failed to upsert last topup settings.", throwable0);
        }
        return ibom.a;
    }

    public final Object e(dyna dyna0, ftix ftix0, ibrl ibrl0) {
        Object object2;
        dyaq dyaq0;
        if((ibrl0 instanceof dyaq)) {
            dyaq0 = (dyaq)ibrl0;
            int v = dyaq0.c;
            if((v & 0x80000000) == 0) {
                dyaq0 = new dyaq(this, ibrl0);
            }
            else {
                dyaq0.c = v - 0x80000000;
            }
        }
        else {
            dyaq0 = new dyaq(this, ibrl0);
        }
        Object object0 = dyaq0.a;
        Object object1 = ibrx.a;
        switch(dyaq0.c) {
            case 0: {
                ibnx.b(object0);
                dybr dybr0 = this.c;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dykr.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                long v1 = ftix0.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((dykr)hftp0.b_message).b = v1;
                ProtoLiteMessage hftv0 = hftp0.N_build();
                ibuq.e(hftv0, "build(...)");
                dybp dybp0 = new dybp(dyna0, ((dykr)hftv0));
                evql evql0 = edng.a(dybr0.a.b(dybp0, gmap.a));
                dyaq0.c = 1;
                object2 = fsdk.a(evql0, dyaq0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dyar.b.j(), "Failed to upsert last topup settings in SE data store.", throwable0);
        }
        return ibom.a;
    }
}

