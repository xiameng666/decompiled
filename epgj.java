import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.significantplaces.SignificantPlaceParceable;
import java.util.List;

public final class epgj {
    public final eppe a;
    private final Context b;

    public epgj(Context context0, icck icck0) {
        ibuq.f(icck0, "scope");
        super();
        this.b = context0;
        this.a = new eppe(ModuleManager.requireSubmoduleContext(context0, "significant_places_tracking"), icck0);
    }

    public final Object a(SignificantPlaceParceable significantPlaceParceable0, ibrl ibrl0) {
        epgf epgf0;
        if((ibrl0 instanceof epgf)) {
            epgf0 = (epgf)ibrl0;
            int v = epgf0.c;
            if((v & 0x80000000) == 0) {
                epgf0 = new epgf(this, ibrl0);
            }
            else {
                epgf0.c = v - 0x80000000;
            }
        }
        else {
            epgf0 = new epgf(this, ibrl0);
        }
        Object object0 = epgf0.a;
        Object object1 = ibrx.a;
        switch(epgf0.c) {
            case 0: {
                ibnx.b(object0);
                epni epni0 = epnh.a(((ProtoLiteMessage)epng.a).v_newBuilder());
                epni0.g(significantPlaceParceable0.a);
                epni0.d(significantPlaceParceable0.b);
                epni0.c(significantPlaceParceable0.c);
                hjil hjil0 = hjik.a(((ProtoLiteMessage)hjij.a).v_newBuilder());
                hjil0.b(significantPlaceParceable0.d);
                hjil0.c(significantPlaceParceable0.e);
                epni0.e(hjil0.a());
                epni0.h(((float)hydt.b()));
                epng epng0 = epni0.a();
                epgf0.c = 1;
                return epom.a.a(epng0, epgf0) == object1 ? object1 : Boolean.valueOf(true);
            }
            case 1: {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(bbpd bbpd0, ibrl ibrl0) {
        epgg epgg0;
        if((ibrl0 instanceof epgg)) {
            epgg0 = (epgg)ibrl0;
            int v = epgg0.c;
            if((v & 0x80000000) == 0) {
                epgg0 = new epgg(this, ibrl0);
            }
            else {
                epgg0.c = v - 0x80000000;
            }
        }
        else {
            epgg0 = new epgg(this, ibrl0);
        }
        Object object0 = epgg0.a;
        Object object1 = ibrx.a;
        switch(epgg0.c) {
            case 0: {
                ibnx.b(object0);
                bbpd0.println("Significant Places:");
                bbpd0.b();
                epgg0.d = bbpd0;
                epgg0.c = 1;
                object0 = epom.a.c(epgg0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                bbpd0 = epgg0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        for(Object object2: ((List)object0)) {
            epng epng0 = (epng)object2;
            bbpd0.println(epng0.f);
            bbpd0.b();
            bbpd0.print("place id: ");
            bbpd0.println(epng0.c);
            bbpd0.print("address: ");
            bbpd0.println(epng0.g);
            bbpd0.print("lat/lng: ");
            hjij hjij0 = epng0.d == null ? hjij.a : epng0.d;
            Double double0 = null;
            bbpd0.print((hjij0 == null ? null : new Double(hjij0.b)));
            bbpd0.print(", ");
            hjij hjij1 = epng0.d == null ? hjij.a : epng0.d;
            if(hjij1 != null) {
                double0 = new Double(hjij1.c);
            }
            bbpd0.println(double0);
            bbpd0.print("radius: ");
            bbpd0.println(epng0.e);
            if((epng0.b & 0x40) != 0) {
                bbpd0.print("alias: ");
                bbpd0.print(epng0.i);
                bbpd0.print(" (");
                bbpd0.print(epng0.h);
                bbpd0.println(" )");
            }
            bbpd0.a();
        }
        bbpd0.a();
        bbpd0.println();
        bbpd0.println("Tracking Manager:");
        bbpd0.b();
        this.a.k(bbpd0);
        bbpd0.a();
        return ibom.a;
    }

    public final Object c(ibrl ibrl0) {
        epgh epgh0;
        if((ibrl0 instanceof epgh)) {
            epgh0 = (epgh)ibrl0;
            int v = epgh0.c;
            if((v & 0x80000000) == 0) {
                epgh0 = new epgh(this, ibrl0);
            }
            else {
                epgh0.c = v - 0x80000000;
            }
        }
        else {
            epgh0 = new epgh(this, ibrl0);
        }
        Object object0 = epgh0.a;
        Object object1 = ibrx.a;
        switch(epgh0.c) {
            case 0: {
                ibnx.b(object0);
                epgh0.c = 1;
                object0 = epom.a.c(epgh0);
                return object0 == object1 ? object1 : new Integer(((List)object0).size());
            }
            case 1: {
                ibnx.b(object0);
                return new Integer(((List)object0).size());
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object d(String s, ibrl ibrl0) {
        epgi epgi0;
        if((ibrl0 instanceof epgi)) {
            epgi0 = (epgi)ibrl0;
            int v = epgi0.c;
            if((v & 0x80000000) == 0) {
                epgi0 = new epgi(this, ibrl0);
            }
            else {
                epgi0.c = v - 0x80000000;
            }
        }
        else {
            epgi0 = new epgi(this, ibrl0);
        }
        Object object0 = epgi0.a;
        Object object1 = ibrx.a;
        boolean z = true;
        switch(epgi0.c) {
            case 0: {
                ibnx.b(object0);
                epge epge0 = new epge(s);
                epgi0.c = 1;
                object0 = epom.a.e(epge0, epgi0);
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
        if(((Number)object0).intValue() <= 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

