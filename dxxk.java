import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.UserRecoverableAuthException;
import dagger.Lazy;
import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;

public final class dxxk extends lsb implements fsuj {
    public fsvb a;
    public final icmn b;
    public final icmq c;
    public final icmn d;
    public final icmq e;
    public dpty f;
    public Context g;
    public ibrt h;
    public String i;
    public String j;
    public dxwm k;
    public Lazy l;
    public dmgo m;
    public fhwb n;
    public dmgi o;
    public boolean p;
    public static final int q;
    private static final bboh r;
    private final icmn s;
    private final fsre t;
    private final icck u;
    private final icnl v;

    static {
        dxxk.r = bboh.b("Pay", bbcu.cZ);
    }

    public dxxk() {
        this.a = fssm.a;
        gze gze0 = new gze(-2075927118, true, new dxws(this));
        this.v = icnm.a(new dxwq(fssm.a, gze0));
        icmn icmn0 = icmu.e(0, 0, 0, 7);
        this.b = icmn0;
        this.c = new icmo(icmn0);
        this.d = icmu.e(0, 0, 0, 7);
        icmn icmn1 = icmu.e(0, 0, 0, 7);
        this.s = icmn1;
        this.e = new icmo(icmn1);
        this.t = new fsre(this);
        this.u = lsc.a(this);
    }

    public final dxwm a() {
        dxwm dxwm0 = this.k;
        if(dxwm0 != null) {
            return dxwm0;
        }
        ibuq.j("pageCache");
        return null;
    }

    public final Object b(fsvb fsvb0, ibrl ibrl0) {
        dxwu dxwu0;
        if((ibrl0 instanceof dxwu)) {
            dxwu0 = (dxwu)ibrl0;
            int v = dxwu0.c;
            if((v & 0x80000000) == 0) {
                dxwu0 = new dxwu(this, ibrl0);
            }
            else {
                dxwu0.c = v - 0x80000000;
            }
        }
        else {
            dxwu0 = new dxwu(this, ibrl0);
        }
        Object object0 = dxwu0.a;
        Object object1 = ibrx.a;
        switch(dxwu0.c) {
            case 0: {
                ibnx.b(object0);
                dxwm dxwm0 = this.a();
                dxwu0.d = fsvb0;
                dxwu0.c = 1;
                object0 = dxwm0.d(dxwu0);
                if(object0 != object1) {
                    goto label_22;
                }
                return object1;
            }
            case 1: {
                fsvb0 = dxwu0.d;
                ibnx.b(object0);
            label_22:
                if(((Boolean)object0).booleanValue()) {
                    ((ggtj)dxxk.r.j()).x("Potential crash detected, clearing page cache");
                    dxwm dxwm1 = this.a();
                    dxwu0.d = fsvb0;
                    dxwu0.c = 2;
                    Object object2 = dxwm1.e(new dxwh(), dxwu0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                    if(object2 != object1) {
                        goto label_34;
                    }
                }
                else {
                    goto label_34;
                }
                return object1;
            }
            case 2: {
                fsvb0 = dxwu0.d;
                ibnx.b(object0);
            label_34:
                dxwm dxwm2 = this.a();
                dxwu0.d = fsvb0;
                dxwu0.c = 3;
                if(dxwm2.f(true, dxwu0) != object1) {
                    dxwu0.d = null;
                    dxwu0.c = 4;
                    return this.g(fsvb0, dxwu0) != object1 ? ibom.a : object1;
                }
                return object1;
            }
            case 3: {
                fsvb0 = dxwu0.d;
                ibnx.b(object0);
                dxwu0.d = null;
                dxwu0.c = 4;
                return this.g(fsvb0, dxwu0) != object1 ? ibom.a : object1;
            }
            case 4: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object c(fsvb fsvb0, ibrl ibrl0) {
        dxwv dxwv0;
        if((ibrl0 instanceof dxwv)) {
            dxwv0 = (dxwv)ibrl0;
            int v = dxwv0.c;
            if((v & 0x80000000) == 0) {
                dxwv0 = new dxwv(this, ibrl0);
            }
            else {
                dxwv0.c = v - 0x80000000;
            }
        }
        else {
            dxwv0 = new dxwv(this, ibrl0);
        }
        Object object0 = dxwv0.a;
        Object object1 = ibrx.a;
        switch(dxwv0.c) {
            case 0: {
                ibnx.b(object0);
                dxwm dxwm0 = this.a();
                dxwv0.c = 1;
                object0 = dxwm0.c(fsvb0, dxwv0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_20;
            }
            case 1: {
                ibnx.b(object0);
            label_20:
                if(((hkiv)object0) == null) {
                    return Boolean.valueOf(false);
                }
                if(((long)((hkiv)object0).e) < hwqv.b()) {
                    ((ggtj)dxxk.r.h()).x("cached page discarded -- version incompatibility detected");
                    dxwm dxwm1 = this.a();
                    dxwv0.c = 2;
                    Object object2 = dxwm1.e(new dxwf(((hkiv)object0)), dxwv0);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                    return object2 != object1 ? Boolean.valueOf(false) : object1;
                }
                icnl icnl0 = this.v;
                fsvb fsvb1 = ((hkiv)object0).c;
                if(fsvb1 == null) {
                    fsvb1 = fsvb.a;
                }
                ibuq.e(fsvb1, "getComposable(...)");
                icnl0.g(new dxwq(fsvb1, null, 2));
                return Boolean.valueOf(true);
            }
            case 2: {
                ibnx.b(object0);
                return Boolean.valueOf(false);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object e(igxm igxm0, ibrl ibrl0) {
        fsvb fsvb3;
        hkiv hkiv0;
        int v1;
        igxm igxm2;
        Object object3;
        igxm igxm1;
        fsvb fsvb1;
        dxwy dxwy0;
        if((ibrl0 instanceof dxwy)) {
            dxwy0 = (dxwy)ibrl0;
            int v = dxwy0.f;
            if((v & 0x80000000) == 0) {
                dxwy0 = new dxwy(this, ibrl0);
            }
            else {
                dxwy0.f = v - 0x80000000;
            }
        }
        else {
            dxwy0 = new dxwy(this, ibrl0);
        }
        Object object0 = dxwy0.d;
        Object object1 = ibrx.a;
        switch(dxwy0.f) {
            case 0: {
                ibnx.b(object0);
                fsvb fsvb0 = igxm0.a;
                this.a = fsvb0;
                dxwy0.a = igxm0;
                dxwy0.b = fsvb0;
                dxwy0.f = 1;
                Object object2 = this.c(fsvb0, dxwy0);
                if(object2 != object1) {
                    fsvb1 = fsvb0;
                    object0 = object2;
                    igxm1 = igxm0;
                    goto label_29;
                }
                return object1;
            }
            case 1: {
                fsvb fsvb2 = (fsvb)dxwy0.b;
                igxm1 = (igxm)dxwy0.a;
                ibnx.b(object0);
                fsvb1 = fsvb2;
            label_29:
                boolean z = ((Boolean)object0).booleanValue();
                if(!z) {
                    this.l();
                }
                try {
                    dxwy0.a = igxm1;
                    dxwy0.b = fsvb1;
                    dxwy0.c = z;
                    dxwy0.f = 2;
                    object3 = this.v(fsvb1, dxwy0);
                }
                catch(IOException iOException0) {
                    igxm2 = igxm1;
                    v1 = z;
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", iOException0);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                catch(dpuk dpuk0) {
                    igxm2 = igxm1;
                    v1 = z;
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpuk0);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                catch(dpuc dpuc0) {
                    igxm2 = igxm1;
                    v1 = z;
                    goto label_74;
                }
                catch(dpui dpui0) {
                    igxm2 = igxm1;
                    v1 = z;
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpui0);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                if(object3 != object1) {
                    try {
                        igxm2 = igxm1;
                        v1 = z;
                        hkiv0 = (hkiv)object3;
                        goto label_95;
                    }
                    catch(IOException iOException0) {
                        a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", iOException0);
                        this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                        return ibom.a;
                    }
                    catch(dpuk dpuk0) {
                        a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpuk0);
                        this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                        return ibom.a;
                    }
                    catch(dpuc dpuc0) {
                        goto label_74;
                    }
                    catch(dpui dpui0) {
                        a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpui0);
                        this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                        return ibom.a;
                    }
                }
                return object1;
            }
            case 2: {
                v1 = dxwy0.c;
                fsvb1 = (fsvb)dxwy0.b;
                igxm2 = (igxm)dxwy0.a;
                try {
                    ibnx.b(object0);
                    hkiv0 = (hkiv)object0;
                    goto label_95;
                }
                catch(IOException iOException0) {
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", iOException0);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                catch(dpuk dpuk0) {
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpuk0);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                catch(dpuc dpuc0) {
                label_74:
                    a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpuc0);
                    Throwable throwable0 = dpuc0.getCause();
                    dpuc dpuc1 = (throwable0 instanceof dpuc) ? ((dpuc)throwable0) : null;
                    if(dpuc1 != null) {
                        dpuc0 = dpuc1;
                    }
                    Throwable throwable1 = dpuc0.getCause();
                    UserRecoverableAuthException userRecoverableAuthException0 = (throwable1 instanceof UserRecoverableAuthException) ? ((UserRecoverableAuthException)throwable1) : null;
                    if(userRecoverableAuthException0 == null) {
                        this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                        return ibom.a;
                    }
                    Intent intent0 = userRecoverableAuthException0.a();
                    if(intent0 == null) {
                        this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                        return ibom.a;
                    }
                    dxwy0.a = null;
                    dxwy0.b = null;
                    dxwy0.f = 3;
                    return this.s.a(intent0, dxwy0) != object1 ? ibom.a : object1;
                }
                catch(dpui dpui0) {
                }
                a.ae(dxxk.r.j(), "fetchAndDisplayProposal error", dpui0);
                this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                return ibom.a;
            label_95:
                if(((long)hkiv0.e) < hwqv.b()) {
                    ((ggtj)dxxk.r.j()).z("Propose version incompatible: %s", hkiv0.e);
                    this.n(fsvb1, ((boolean)(v1 ^ 1)), igxm2);
                    return ibom.a;
                }
                dxwm dxwm0 = this.a();
                dxwy0.a = fsvb1;
                dxwy0.b = hkiv0;
                dxwy0.f = 4;
                if(dxwm0.a(hkiv0, dxwy0) != object1) {
                    fsvb3 = fsvb1;
                    break;
                }
                return object1;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            case 4: {
                hkiv0 = (hkiv)dxwy0.b;
                fsvb3 = (fsvb)dxwy0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibuq.m(this.a, fsvb3)) {
            fsvb fsvb4 = hkiv0.c == null ? fsvb.a : hkiv0.c;
            ibuq.e(fsvb4, "getComposable(...)");
            this.v.g(new dxwq(fsvb4, null, 2));
            return ibom.a;
        }
        return ibom.a;
    }

    public final Object f(igxn igxn0, ibrl ibrl0) {
        dxwz dxwz0;
        if((ibrl0 instanceof dxwz)) {
            dxwz0 = (dxwz)ibrl0;
            int v = dxwz0.c;
            if((v & 0x80000000) == 0) {
                dxwz0 = new dxwz(this, ibrl0);
            }
            else {
                dxwz0.c = v - 0x80000000;
            }
        }
        else {
            dxwz0 = new dxwz(this, ibrl0);
        }
        Object object0 = dxwz0.a;
        Object object1 = ibrx.a;
        switch(dxwz0.c) {
            case 0: {
                ibnx.b(object0);
                try {
                    dxwz0.c = 1;
                    object0 = this.v(igxn0.a, dxwz0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_19;
                label_18:
                    ibnx.b(object0);
                label_19:
                    hkiv hkiv0 = (hkiv)object0;
                    goto label_27;
                }
                catch(IOException iOException0) {
                    a.ae(dxxk.r.j(), "fetchProposal error", iOException0);
                    return ibom.a;
                }
                catch(dpuk dpuk0) {
                    a.ae(dxxk.r.j(), "fetchProposal error", dpuk0);
                    return ibom.a;
                }
            }
            case 1: {
                goto label_18;
            label_27:
                if(((long)hkiv0.e) >= hwqv.b()) {
                    dxwm dxwm0 = this.a();
                    dxwz0.c = 2;
                    if(dxwm0.a(hkiv0, dxwz0) == object1) {
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

    @Override  // fsuj
    public final Object g(fsvb fsvb0, ibrl ibrl0) {
        dxxh dxxh0;
        if((ibrl0 instanceof dxxh)) {
            dxxh0 = (dxxh)ibrl0;
            int v = dxxh0.c;
            if((v & 0x80000000) == 0) {
                dxxh0 = new dxxh(this, ibrl0);
            }
            else {
                dxxh0.c = v - 0x80000000;
            }
        }
        else {
            dxxh0 = new dxxh(this, ibrl0);
        }
        Object object0 = dxxh0.a;
        Object object1 = ibrx.a;
        switch(dxxh0.c) {
            case 0: {
                ibnx.b(object0);
                ibuq.f(fsvb0, "proposal");
                int v1 = fsvb0.b == 2 ? ((int)(((Integer)fsvb0.c))) : 0;
                dmgi dmgi0 = null;
                hfuo hfuo0 = fsvb0.d;
                ibuq.e(hfuo0, "getArgList(...)");
                igyc igyc0 = ((igyc)ibpz.g(igyc.f, Integer.valueOf(v1))).c(hfuo0);
                if(!(igyc0 instanceof igxl)) {
                    if((igyc0 instanceof igxm)) {
                        dxxh0.c = 1;
                        if(this.e(((igxm)igyc0), dxxh0) == object1) {
                            return object1;
                        }
                    }
                    else if((igyc0 instanceof igxn)) {
                        dxxh0.c = 2;
                        if(this.f(((igxn)igyc0), dxxh0) == object1) {
                            return object1;
                        }
                    }
                    else if((igyc0 instanceof igxo)) {
                        dxxh0.c = 3;
                        if(this.r(igyc0, dxxh0) == object1) {
                            return object1;
                        }
                    }
                    else if((igyc0 instanceof igxw)) {
                        dxxh0.c = 4;
                        if(this.r(igyc0, dxxh0) == object1) {
                            return object1;
                        }
                    }
                    else {
                        if((igyc0 instanceof igxy)) {
                            dxxh0.c = 5;
                            object0 = this.h(((igxy)igyc0), dxxh0);
                            return object0 == object1 ? object1 : ((igxz)object0).b();
                        }
                        if((igyc0 instanceof igxk)) {
                            dmgi dmgi1 = this.o;
                            if(dmgi1 == null) {
                                ibuq.j("clearcutEventLogger");
                            }
                            else {
                                dmgi0 = dmgi1;
                            }
                            dmgi0.c(((igxk)igyc0).a, ((igxk)igyc0).b);
                            return fssm.a;
                        }
                        if((igyc0 instanceof igyb)) {
                            Lazy lazy0 = this.l;
                            if(lazy0 == null) {
                                ibuq.j("auditUtil");
                            }
                            else {
                                dmgi0 = lazy0;
                            }
                            byte[] arr_b = ((dlnm)((Lazy)dmgi0).get()).l(((igyb)igyc0).a, ((igyb)igyc0).b, ((igyb)igyc0).c);
                            if(arr_b != null) {
                                Object object2 = fssm.k(null, null, null, null, null, ByteString.copyFrom(arr_b), null, null, 0xDF);
                                if(object2 != null) {
                                    return object2;
                                }
                            }
                            return fssm.a;
                        }
                        if((igyc0 instanceof igxq)) {
                            fhvz fhvz0 = fhwa.a(((igxq)igyc0).a);
                            if(((igxq)igyc0).b) {
                                fhvz0.c(fhwp.c());
                            }
                            else {
                                String s = this.j;
                                if(s == null) {
                                    ibuq.j("accountName");
                                    s = null;
                                }
                                fhvz0.c(fhwp.b(s));
                            }
                            gjce gjce0 = ((igxq)igyc0).c;
                            if(gjce0 != null) {
                                fhvz0.b(new fhvu(gjdq.a, gjce0));
                            }
                            fhwb fhwb0 = this.n;
                            if(fhwb0 == null) {
                                ibuq.j("semanticLogger");
                            }
                            else {
                                dmgi0 = fhwb0;
                            }
                            ((fhwb)dmgi0).a(fhvz0.a());
                            return fssm.a;
                        }
                        if((igyc0 instanceof igxt)) {
                            dxxh0.c = 6;
                            if(this.r(igyc0, dxxh0) == object1) {
                                return object1;
                            }
                        }
                        else {
                            if(!(igyc0 instanceof igxv)) {
                                throw new ibnq();
                            }
                            dxxh0.c = 7;
                            if(this.r(igyc0, dxxh0) == object1) {
                                return object1;
                            }
                        }
                    }
                }
                return fssm.a;
            }
            case 5: {
                ibnx.b(object0);
                return ((igxz)object0).b();
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 6: 
            case 7: {
                ibnx.b(object0);
                return fssm.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object h(igxy igxy0, ibrl ibrl0) {
        Bundle bundle0;
        dxxj dxxj0;
        if((ibrl0 instanceof dxxj)) {
            dxxj0 = (dxxj)ibrl0;
            int v = dxxj0.c;
            if((v & 0x80000000) == 0) {
                dxxj0 = new dxxj(this, ibrl0);
            }
            else {
                dxxj0.c = v - 0x80000000;
            }
        }
        else {
            dxxj0 = new dxxj(this, ibrl0);
        }
        Object object0 = dxxj0.a;
        Object object1 = ibrx.a;
        switch(dxxj0.c) {
            case 0: {
                ibnx.b(object0);
                dxxj0.c = 1;
                if(this.r(igxy0, dxxj0) == object1) {
                    return object1;
                }
                goto label_18;
            }
            case 1: {
                ibnx.b(object0);
            label_18:
                dxxj0.c = 2;
                object0 = icll.a(this.d, dxxj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Intent intent0 = ((ActivityResult)object0).b;
        if(intent0 == null) {
            bundle0 = new Bundle();
        }
        else {
            bundle0 = intent0.getExtras();
            if(bundle0 == null) {
                bundle0 = new Bundle();
            }
        }
        ibuq.f(bundle0, "<this>");
        ibqu ibqu0 = new ibqu();
        for(Object object2: bundle0.keySet()) {
            String s = (String)object2;
            Object object3 = bundle0.get(s);
            if(object3 != null) {
                if(!(object3 instanceof Boolean) && !(object3 instanceof Integer) && !(object3 instanceof Long) && !(object3 instanceof Float) && !(object3 instanceof String)) {
                    if(!(object3 instanceof byte[])) {
                        throw new IllegalArgumentException("Unsupported type: " + s + " :: " + object3.getClass().getName());
                    }
                    ibuq.c(s);
                    ibqu0.put(s, ByteString.copyFrom(((byte[])object3)));
                }
                else {
                    ibuq.c(s);
                    ibqu0.put(s, object3);
                }
                continue;
            }
        }
        Map map0 = ibpz.b(ibqu0);
        return new igxz(((ActivityResult)object0).a, map0);
    }

    @Override  // fsuj
    public final ibrt i() {
        return this.j();
    }

    public final ibrt j() {
        ibrt ibrt0 = this.h;
        if(ibrt0 != null) {
            return ibrt0;
        }
        ibuq.j("backgroundCoroutine");
        return null;
    }

    @Override  // fsuj
    public final icck k() {
        return this.u;
    }

    @Override  // lsb
    protected final void km() {
        icbb.b(iccl.b(this.j()), null, null, new dxxg(this, null), 3);
    }

    public final void l() {
        dxwq dxwq0 = new dxwq(null, new gze(0x62951EAB, true, new dxwx(this)), 1);
        this.v.g(dxwq0);
    }

    public final void m() {
        dxxk.o(this, new dxxa(this, null));
    }

    public final void n(fsvb fsvb0, boolean z, igxm igxm0) {
        ibuq.f(fsvb0, "walletPage");
        ibuq.f(igxm0, "operation");
        if(ibuq.m(this.a, fsvb0) && z) {
            dxwq dxwq0 = new dxwq(null, new gze(0xFA107ADD, true, new dxxf(this, igxm0)), 1);
            this.v.g(dxwq0);
        }
    }

    static void o(dxxk dxxk0, ibtw ibtw0) {
        ibrt ibrt0 = dxxk0.j();
        icbb.b(lsc.a(dxxk0), ibrt0, null, ibtw0, 2);
    }

    public final void p(goz goz0, int v) {
        goz goz1 = goz0.ao(470905794);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = gtr.a(this.v, goz1);
            ibtw ibtw0 = dxxk.q(gui0).b;
            goz1.M(1568906410);
            if(ibtw0 != null) {
                ibtw0.a(goz1, Integer.valueOf(0));
            }
            goz1.x();
            if(!ibuq.m(dxxk.q(gui0).a, fssm.a)) {
                fsvb fsvb0 = dxxk.q(gui0).a;
                this.t.q(fsvb0, goz1, 0x40);
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new dxwp(this, v);
        }
    }

    private static final dxwq q(gui gui0) {
        return (dxwq)gui0.a();
    }

    private final Object r(igyc igyc0, ibrl ibrl0) {
        Object object0 = this.b.a(igyc0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }

    private final Object v(fsvb fsvb0, ibrl ibrl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkiu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(fsvb0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkiu hkiu0 = (hkiu)hftp0.b_message;
        fsvb0.getClass();
        hkiu0.c = fsvb0;
        hkiu0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hkit.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        dmgo dmgo0 = this.m;
        dpty dpty0 = null;
        if(dmgo0 == null) {
            ibuq.j("clientCapabilitiesApi");
            dmgo0 = null;
        }
        gtpr gtpr0 = dmgo0.b(true);
        ibuq.e(gtpr0, "getClientCapabilitiesInstance(...)");
        ibuq.f(gtpr0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkit hkit0 = (hkit)hftp1.b_message;
        gtpr0.getClass();
        hkit0.c = gtpr0;
        hkit0.b |= 1;
        String s = TimeZone.getDefault().getID();
        ibuq.e(s, "getID(...)");
        ibuq.f(s, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s.getClass();
        ((hkit)hftv0).d = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hkit)hftp1.b_message).e = 8;
        ProtoLiteMessage hftv1 = hftp1.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((hkit)hftv1), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkiu hkiu1 = (hkiu)hftp0.b_message;
        ((hkit)hftv1).getClass();
        hkiu1.d = (hkit)hftv1;
        hkiu1.b |= 2;
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        dpty dpty1 = this.f;
        if(dpty1 == null) {
            ibuq.j("crossbar");
        }
        else {
            dpty0 = dpty1;
        }
        ibuq.e(hkiv.a, "getDefaultInstance(...)");
        return dpty.b(dpty0, dpuj.bh, ((MessageLite)(((hkiu)hftv2))), ((MessageLite)hkiv.a), ibrl0);
    }
}

