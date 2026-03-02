import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.significant.places.AppContextProvider;
import com.google.android.gms.significantplaces.storage.SignificantPlacesStateFlow;
import java.io.IOException;
import java.lang.ref.WeakReference;

public final class epom {
    public static final epom a;
    public static final Context b;
    public static WeakReference c;
    private static icck d;
    private static frjn e;
    private static SignificantPlacesStateFlow f;
    private static frli g;

    static {
        epom.a = new epom();
        epom.b = ModuleManager.requireSubmoduleContext(AppContextProvider.a(), "significant_places_tracking");
        epom.c = new WeakReference(null);
    }

    public final Object a(epng epng0, ibrl ibrl0) {
        int v = epng0.b;
        if((v & 2) == 0 || (v & 1) == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if((v & 0x40) != 0 && (v & 0x20) == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ((ggtj)epon.a.h()).B("addSignificantPlace: %s", epng0);
        Object object0 = this.f(new epny(epng0, null), ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    public final Object b(epng epng0, ibrl ibrl0) {
        epob epob0;
        if((ibrl0 instanceof epob)) {
            epob0 = (epob)ibrl0;
            int v = epob0.c;
            if((v & 0x80000000) == 0) {
                epob0 = new epob(this, ibrl0);
            }
            else {
                epob0.c = v - 0x80000000;
            }
        }
        else {
            epob0 = new epob(this, ibrl0);
        }
        Object object0 = epob0.a;
        Object object1 = ibrx.a;
        switch(epob0.c) {
            case 0: {
                ibnx.b(object0);
                int v1 = epng0.b;
                if((v1 & 2) != 0) {
                    return epng0;
                }
                if((v1 & 1) == 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                long v2 = ibzy.h(5, ibzz.d);
                epoc epoc0 = new epoc(epng0, null);
                epob0.d = epng0;
                epob0.c = 1;
                object0 = icfo.d(v2, epoc0, epob0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                epng0 = epob0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((hjij)object0) != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)epng0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)epng0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            epng epng1 = (epng)hftp0.b_message;
            epng1.d = (hjij)object0;
            epng1.b |= 2;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.c(hftv0);
            return (epng)hftv0;
        }
        return epng0;
    }

    public final Object c(ibrl ibrl0) {
        return this.d(new epnx(), ibps.a, ibrl0);
    }

    public final Object d(ibts ibts0, Object object0, ibrl ibrl0) {
        epoe epoe0;
        if((ibrl0 instanceof epoe)) {
            epoe0 = (epoe)ibrl0;
            int v = epoe0.c;
            if((v & 0x80000000) == 0) {
                epoe0 = new epoe(this, ibrl0);
            }
            else {
                epoe0.c = v - 0x80000000;
            }
        }
        else {
            epoe0 = new epoe(this, ibrl0);
        }
        Object object1 = epoe0.a;
        Object object2 = ibrx.a;
        switch(epoe0.c) {
            case 0: {
                ibnx.b(object1);
                try {
                    gmcd gmcd0 = this.h().a();
                    ibuq.e(gmcd0, "getData(...)");
                    epoe0.e = (ibps)object0;
                    epoe0.d = (epnx)ibts0;
                    epoe0.c = 1;
                    object1 = icpu.c(gmcd0, epoe0);
                    if(object1 == object2) {
                        return object2;
                    label_22:
                        ibts0 = epoe0.d;
                        object0 = epoe0.e;
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
        a.ae(epon.a.i(), "error reading significant places proto", iOException0);
        return object0;
    }

    public final Object e(ibts ibts0, ibrl ibrl0) {
        ibvb ibvb1;
        epof epof0;
        if((ibrl0 instanceof epof)) {
            epof0 = (epof)ibrl0;
            int v = epof0.c;
            if((v & 0x80000000) == 0) {
                epof0 = new epof(this, ibrl0);
            }
            else {
                epof0.c = v - 0x80000000;
            }
        }
        else {
            epof0 = new epof(this, ibrl0);
        }
        Object object0 = epof0.a;
        Object object1 = ibrx.a;
        switch(epof0.c) {
            case 0: {
                ibnx.b(object0);
                ibvb ibvb0 = new ibvb();
                epog epog0 = new epog(ibvb0, ibts0, null);
                epof0.d = ibvb0;
                epof0.c = 1;
                if(this.f(epog0, epof0) != object1) {
                    ibvb1 = ibvb0;
                    break;
                }
                return object1;
            }
            case 1: {
                ibvb1 = epof0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ggtj)epon.a.h()).z("removed %d significant places", ibvb1.a);
        return new Integer(ibvb1.a);
    }

    public final Object f(ibtw ibtw0, ibrl ibrl0) {
        epoh epoh0;
        if((ibrl0 instanceof epoh)) {
            epoh0 = (epoh)ibrl0;
            int v = epoh0.c;
            if((v & 0x80000000) == 0) {
                epoh0 = new epoh(this, ibrl0);
            }
            else {
                epoh0.c = v - 0x80000000;
            }
        }
        else {
            epoh0 = new epoh(this, ibrl0);
        }
        Object object0 = epoh0.a;
        Object object1 = ibrx.a;
        switch(epoh0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    epol epol0 = new epol(ibtw0, null);
                    epoh0.c = 1;
                    if(icbd.a(icey.a, epol0, epoh0) == object1) {
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
        a.ae(epon.a.i(), "error writing significant places proto", iOException0);
        return ibom.a;
    }

    public final icig g() {
        SignificantPlacesStateFlow significantPlacesStateFlow0;
        synchronized(this) {
            significantPlacesStateFlow0 = epom.f;
            if(significantPlacesStateFlow0 == null) {
                icck icck0 = epom.a.j();
                ibuq.e(epom.b, "context");
                significantPlacesStateFlow0 = new SignificantPlacesStateFlow(icck0, epom.b);
                epom.f = significantPlacesStateFlow0;
            }
        }
        return significantPlacesStateFlow0;
    }

    public final frli h() {
        frjn frjn0;
        frli frli0;
        synchronized(this) {
            frli0 = epom.g;
            if(frli0 == null) {
                frii frii0 = cjtb.a;
                frie frie0 = frif.a();
                frce frce0 = new frce(epom.b);
                frce0.d("location");
                frce0.e("significant_places.pb");
                frie0.f(frce0.a());
                frie0.e(((MessageLite)epnt.a));
                frie0.h(new frjp(cjtd.a));
                epom epom0 = epom.a;
                synchronized(epom0) {
                    frjn0 = epom.e;
                    if(frjn0 == null) {
                        icck icck0 = epom0.j();
                        frjk frjk0 = frjn.d(AppContextProvider.a(), new bblp(1, 9));
                        frjk0.c = "coffee_preferences";
                        frjk0.c();
                        frjk0.b();
                        frjk0.d(true);
                        frjk0.d = new epne(icck0);
                        frjn0 = frjk0.a();
                        epom.e = frjn0;
                    }
                }
                frie0.b(frjn0);
                frli0 = frii0.a(frie0.a());
                epom.g = frli0;
            }
            ibuq.c(frli0);
        }
        return frli0;
    }

    public static final Object i(Iterable iterable0, ibrl ibrl0) {
        return iccl.a(new epoa(iterable0, null), ibrl0);
    }

    private final icck j() {
        icck icck0;
        synchronized(this) {
            icck0 = epom.d;
            if(icck0 == null) {
                icck0 = iccl.b(cclw.a);
                epom.d = icck0;
            }
        }
        return icck0;
    }
}

