import android.content.Context;
import android.icu.text.ListFormatter;
import java.util.ArrayList;
import java.util.SortedSet;

public final class ehoq extends lsb {
    public final hgiq a;
    public final ibtw b;
    public final ibts c;
    public final icnj d;
    private final ehlq e;
    private final ehlp f;
    private final ehmg g;
    private final icnl h;

    public ehoq(Context context0, ehmg ehmg0, ehlq ehlq0, ehlp ehlp0, hgiq hgiq0, ibtw ibtw0, ibts ibts0) {
        ibuq.f(context0, "context");
        ibuq.f(hgiq0, "userServiceId");
        super();
        this.g = ehmg0;
        this.e = ehlq0;
        this.f = ehlp0;
        this.a = hgiq0;
        this.b = ibtw0;
        this.c = ibts0;
        icnl icnl0 = icnm.a(new ehnx("Learn more", new ehnz(this), new ehoa(this), ""));
        this.h = icnl0;
        this.d = new icmp(icnl0);
        icbb.b(lsc.a(this), null, null, new ehoj(this, context0, null), 3);
    }

    public final Object a(Context context0, hgiq hgiq0, ibrl ibrl0) {
        ehon ehon0;
        if((ibrl0 instanceof ehon)) {
            ehon0 = (ehon)ibrl0;
            int v = ehon0.d;
            if((v & 0x80000000) == 0) {
                ehon0 = new ehon(this, ibrl0);
            }
            else {
                ehon0.d = v - 0x80000000;
            }
        }
        else {
            ehon0 = new ehon(this, ibrl0);
        }
        Object object0 = ehon0.b;
        Object object1 = ibrx.a;
        switch(ehon0.d) {
            case 0: {
                ibnx.b(object0);
                ehon0.a = context0;
                ehon0.d = 1;
                ehly ehly0 = new ehly(((ehmc)this.e), hgiq0, null);
                object0 = icbd.a(cclw.a, ehly0, ehon0);
                if(object0 != object1) {
                    return ((SortedSet)object0).isEmpty() ? "Only those services that you turn off will be disabled. Some services must remain active for your device to function as intended." : "Only those services that you turn off will be disabled. Some services must remain active for your device to function as intended.\n\n" + context0.getString(0x7F152A0A, new Object[]{ListFormatter.getInstance().format(((SortedSet)object0))});  // string:service_permissions "This service uses these permissions: %1$s"
                }
                return object1;
            }
            case 1: {
                context0 = ehon0.a;
                ibnx.b(object0);
                return ((SortedSet)object0).isEmpty() ? "Only those services that you turn off will be disabled. Some services must remain active for your device to function as intended." : "Only those services that you turn off will be disabled. Some services must remain active for your device to function as intended.\n\n" + context0.getString(0x7F152A0A, new Object[]{ListFormatter.getInstance().format(((SortedSet)object0))});  // string:service_permissions "This service uses these permissions: %1$s"
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object b(Context context0, hgiq hgiq0, ibrl ibrl0) {
        String s2;
        hgiq hgiq3;
        ehlx ehlx0;
        String s;
        ehop ehop0;
        Object object0 = context0;
        hgiq hgiq1 = hgiq0;
        if((ibrl0 instanceof ehop)) {
            ehop0 = (ehop)ibrl0;
            int v = ehop0.d;
            if((v & 0x80000000) == 0) {
                ehop0 = new ehop(this, ibrl0);
            }
            else {
                ehop0.d = v - 0x80000000;
            }
        }
        else {
            ehop0 = new ehop(this, ibrl0);
        }
        Object object1 = ehop0.b;
        Object object2 = ibrx.a;
        switch(ehop0.d) {
            case 0: {
                ibnx.b(object1);
                ehop0.a = object0;
                ehop0.e = hgiq1;
                ehop0.d = 1;
                object1 = this.a(((Context)object0), hgiq1, ehop0);
                if(object1 != object2) {
                    goto label_27;
                }
                return object2;
            }
            case 1: {
                hgiq hgiq2 = ehop0.e;
                Object object3 = ehop0.a;
                ibnx.b(object1);
                hgiq1 = hgiq2;
                object0 = object3;
            label_27:
                ehop0.a = object0;
                ehop0.e = hgiq1;
                ehop0.f = (String)object1;
                ehop0.d = 2;
                ehmf ehmf0 = new ehmf(this.g, hgiq1, null);
                Object object4 = icbd.a(cclw.a, ehmf0, ehop0);
                if(object4 != object2) {
                    s = (String)object1;
                    object1 = object4;
                    goto label_43;
                }
                return object2;
            }
            case 2: {
                String s1 = ehop0.f;
                hgiq1 = ehop0.e;
                Object object5 = ehop0.a;
                ibnx.b(object1);
                s = s1;
                object0 = object5;
            label_43:
                if(((ehlx)object1) == null) {
                    ibuq.e("Google Play services", "getString(...)");
                    ibuq.e("Learn more", "getString(...)");
                    ehob ehob0 = new ehob(this, hgiq1);
                    ehoc ehoc0 = new ehoc(this);
                    ibuq.e("", "getString(...)");
                    ehnv ehnv0 = new ehnv("Google Play services", "", ehph.a, s, "Learn more", ehob0, ehoc0, "");
                    this.h.g(ehnv0);
                    return ibom.a;
                }
                if(((ehlx)object1).d == bbde.d) {
                    ehod ehod0 = new ehod(this, hgiq1);
                    ehoe ehoe0 = new ehoe(this);
                    ehnw ehnw0 = new ehnw(((ehlx)object1).b, ((ehlx)object1).c, s, ((ehlx)object1).e, ehod0, ehoe0, ibps.a, ((ehlx)object1).f);
                    this.h.g(ehnw0);
                    return ibom.a;
                }
                ehop0.a = object0;
                ehop0.e = hgiq1;
                ehop0.f = s;
                ehop0.g = (ehlx)object1;
                ehop0.d = 3;
                Object object6 = ehll.a(this.f, hgiq1, ehop0);
                if(object6 != object2) {
                    ehlx0 = (ehlx)object1;
                    object1 = object6;
                    hgiq3 = hgiq1;
                    s2 = s;
                    break;
                }
                return object2;
            }
            case 3: {
                ehlx0 = ehop0.g;
                String s3 = ehop0.f;
                hgiq3 = ehop0.e;
                ibnx.b(object1);
                s2 = s3;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((((ehlo)object1) instanceof ehln)) {
            ibuq.e("Learn more", "getString(...)");
            ehof ehof0 = new ehof(this, hgiq3);
            ehog ehog0 = new ehog(this);
            ibuq.e("", "getString(...)");
            ehnv ehnv1 = new ehnv(ehlx0.b, ehlx0.c, ehph.b, s2, "Learn more", ehof0, ehog0, "");
            this.h.g(ehnv1);
            return ibom.a;
        }
        ibuq.d(((ehlo)object1), "null cannot be cast to non-null type com.google.android.gms.permissions.serviceinfo.repository.IServiceControlsProvider.ServiceControlsInfo.Collected");
        icnl icnl0 = this.h;
        String s4 = ehlx0.b;
        String s5 = ehlx0.c;
        String s6 = ehlx0.e;
        ehoh ehoh0 = new ehoh(this, hgiq3);
        ehoi ehoi0 = new ehoi(this);
        ArrayList arrayList0 = new ArrayList(ibpo.q(((ehlm)(((ehlo)object1))).a, 10));
        for(Object object7: ((ehlm)(((ehlo)object1))).a) {
            arrayList0.add(new ehpg(((ehlj)object7).b, ((ehlj)object7).c, ((ehlj)object7).d, ((ehlj)object7).a, ((ehlj)object7).e));
        }
        icnl0.g(new ehnw(s4, s5, s2, s6, ehoh0, ehoi0, ibpo.ao(arrayList0, new ehoo()), ehlx0.f));
        return ibom.a;
    }
}

