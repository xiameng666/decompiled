import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.ArrayList;

public final class cbpo implements cbpi {
    public static final bboh a;
    public final icnl b;
    private final bavt c;

    static {
        cbpo.a = bboh.b("ModuleDownloadClient", bbcu.ac);
    }

    public cbpo(Context context0, bavt bavt0) {
        ibuq.f(context0, "context");
        super();
        this.c = bavt0;
        this.b = icnm.a(Float.valueOf(0.0f));
    }

    public final Object a(Context context0, String s, ibrl ibrl0) {
        Object object3;
        String s2;
        String s1;
        Object object2;
        long v1;
        icbr icbr0;
        cbpl cbpl0;
        if((ibrl0 instanceof cbpl)) {
            cbpl0 = (cbpl)ibrl0;
            int v = cbpl0.e;
            if((v & 0x80000000) == 0) {
                cbpl0 = new cbpl(this, ibrl0);
            }
            else {
                cbpl0.e = v - 0x80000000;
            }
        }
        else {
            cbpl0 = new cbpl(this, ibrl0);
        }
        Object object0 = cbpl0.c;
        Object object1 = ibrx.a;
        switch(cbpl0.e) {
            case 0: {
                ibnx.b(object0);
                icbr0 = new icbr();
                v1 = SystemClock.elapsedRealtime();
                if(hukx.a.b().a()) {
                    cbpl0.a = context0;
                    cbpl0.f = s;
                    cbpl0.g = icbr0;
                    cbpl0.b = v1;
                    cbpl0.e = 1;
                    object2 = this.d(context0, cbpl0);
                    if(object2 == object1) {
                        return object1;
                    }
                    s1 = s;
                    goto label_37;
                }
                else {
                    s2 = s;
                    goto label_39;
                }
                break;
            }
            case 1: {
                long v2 = cbpl0.b;
                icbr icbr1 = cbpl0.g;
                s1 = cbpl0.f;
                Context context1 = (Context)cbpl0.a;
                ibnx.b(object0);
                icbr0 = icbr1;
                context0 = context1;
                v1 = v2;
                object2 = object0;
            label_37:
                if(!((Boolean)object2).booleanValue()) {
                    s2 = s1;
                label_39:
                    ArrayList arrayList0 = new ArrayList();
                    bavv.b(capp.b(context0, huld.d()), arrayList0);
                    cbpj cbpj0 = new cbpj(this, icbr0, v1, s2, context0);
                    ((ggtj)cbpo.a.h()).x("Requesting module download.");
                    bavw bavw0 = bavv.a(arrayList0, cbpj0);
                    evql evql0 = this.c.c(bavw0);
                    cbpl0.a = icbr0;
                    cbpl0.f = null;
                    cbpl0.g = null;
                    cbpl0.e = 2;
                    object0 = ictn.b(evql0, cbpl0);
                    if(object0 != object1) {
                        object3 = icbr0;
                        break;
                    }
                    return object1;
                }
                ((ggtj)cbpo.a.h()).x("Module is already installed, skipping download.");
                return icbs.a(cbpg.a);
            }
            case 2: {
                object3 = (icbr)cbpl0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((ModuleInstallResponse)object0).a()) {
            ((ggtj)cbpo.a.h()).x("Skipping module download due to module already installed.");
            return icbs.a(cbpg.a);
        }
        return object3;
    }

    @Override  // cbpi
    public final Object b(Context context0, String s, ibrl ibrl0) {
        cbpk cbpk0;
        if((ibrl0 instanceof cbpk)) {
            cbpk0 = (cbpk)ibrl0;
            int v = cbpk0.c;
            if((v & 0x80000000) == 0) {
                cbpk0 = new cbpk(this, ibrl0);
            }
            else {
                cbpk0.c = v - 0x80000000;
            }
        }
        else {
            cbpk0 = new cbpk(this, ibrl0);
        }
        Object object0 = cbpk0.a;
        Object object1 = ibrx.a;
        switch(cbpk0.c) {
            case 0: {
                ibnx.b(object0);
                cbpk0.c = 1;
                object0 = this.a(context0, s, cbpk0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                cbpk0.c = 2;
                Object object2 = ((iccs)object0).n(cbpk0);
                return object2 == object1 ? object1 : object2;
            }
            case 2: {
                ibnx.b(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // cbpi
    public final Object d(Context context0, ibrl ibrl0) {
        cbpm cbpm0;
        if((ibrl0 instanceof cbpm)) {
            cbpm0 = (cbpm)ibrl0;
            int v = cbpm0.c;
            if((v & 0x80000000) == 0) {
                cbpm0 = new cbpm(this, ibrl0);
            }
            else {
                cbpm0.c = v - 0x80000000;
            }
        }
        else {
            cbpm0 = new cbpm(this, ibrl0);
        }
        Object object0 = cbpm0.a;
        Object object1 = ibrx.a;
        boolean z = false;
        switch(cbpm0.c) {
            case 0: {
                ibnx.b(object0);
                azty[] arr_azty = {capp.b(context0, huld.d())};
                evql evql0 = this.c.b(arr_azty);
                cbpm0.c = 1;
                object0 = ictn.b(evql0, cbpm0);
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
        if(((ModuleAvailabilityResponse)object0).a) {
            this.b.g(new Float(1.0f));
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override  // cbpi
    public final Object e(Context context0, String s, ibrl ibrl0) {
        cbpn cbpn0;
        if((ibrl0 instanceof cbpn)) {
            cbpn0 = (cbpn)ibrl0;
            int v = cbpn0.c;
            if((v & 0x80000000) == 0) {
                cbpn0 = new cbpn(this, ibrl0);
            }
            else {
                cbpn0.c = v - 0x80000000;
            }
        }
        else {
            cbpn0 = new cbpn(this, ibrl0);
        }
        Object object0 = cbpn0.a;
        Object object1 = ibrx.a;
        switch(cbpn0.c) {
            case 0: {
                ibnx.b(object0);
                cbpn0.c = 1;
                object0 = this.a(context0, s, cbpn0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_19;
            }
            case 1: {
                ibnx.b(object0);
            label_19:
                if(((iccs)object0).oM()) {
                    cbpn0.c = 2;
                    object0 = ((iccs)object0).n(cbpn0);
                    return object0 != object1 ? ((cbpg)object0) : object1;
                }
                return null;
            }
            case 2: {
                ibnx.b(object0);
                return (cbpg)object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // cbpi
    public final cbpg h(Context context0) {
        return cbpe.a(this, context0);
    }

    @Override  // cbpi
    public final Object i(Context context0) {
        azty[] arr_azty = {capp.b(context0, huld.d())};
        this.c.e(arr_azty);
        return ibom.a;
    }
}

