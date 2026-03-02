import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.List;
import java.util.Map.Entry;

final class dxvv extends ibsl implements ibtw {
    Object a;
    final dxwe b;

    public dxvv(dxwe dxwe0, ibrl ibrl0) {
        this.b = dxwe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxvv)this.c(((igyc)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dxvv(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        fhvs fhvs1;
        fhvw fhvw0 = null;
        ibnx.b(object0);
        igyc igyc0 = (igyc)this.a;
        dxwe dxwe0 = this.b;
        xob xob0 = dxwe0.an();
        if(xob0 != null) {
            if((igyc0 instanceof igxo)) {
                xob0.setResult(((igxo)igyc0).a);
                xob0.finish();
                return ibom.a;
            }
            if((igyc0 instanceof igxw)) {
                Toast.makeText(xob0, ((igxw)igyc0).a, 0).show();
                return ibom.a;
            }
            if((igyc0 instanceof igxy)) {
                String s = ((igxy)igyc0).b;
                if(ibzk.D(s)) {
                    s = "com.google.android.gms";
                }
                Intent intent0 = new Intent().setClassName(s, ((igxy)igyc0).c);
                ibuq.e(intent0, "setClassName(...)");
                String s1 = ((igxy)igyc0).a;
                if(s1 != null) {
                    intent0.setAction(s1);
                }
                Bundle bundle0 = new Bundle();
                for(Object object1: ((igxy)igyc0).d.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    Object object2 = map$Entry0.getValue();
                    if((object2 instanceof Boolean)) {
                        bundle0.putBoolean(((String)map$Entry0.getKey()), ((Boolean)object2).booleanValue());
                    }
                    else if((object2 instanceof Integer)) {
                        bundle0.putInt(((String)map$Entry0.getKey()), ((Number)object2).intValue());
                    }
                    else if((object2 instanceof Long)) {
                        bundle0.putLong(((String)map$Entry0.getKey()), ((Number)object2).longValue());
                    }
                    else if((object2 instanceof Float)) {
                        bundle0.putFloat(((String)map$Entry0.getKey()), ((Number)object2).floatValue());
                    }
                    else if((object2 instanceof String)) {
                        bundle0.putString(((String)map$Entry0.getKey()), ((String)object2));
                    }
                    else {
                        if(!(object2 instanceof ByteString)) {
                            continue;
                        }
                        bundle0.putByteArray(((String)map$Entry0.getKey()), ((ByteString)object2).toByteArray());
                    }
                }
                intent0.putExtras(bundle0);
                if(edno.a(dxwe0.requireContext(), intent0)) {
                    dxwe0.c.b(intent0);
                    return ibom.a;
                }
                ((ggtj)dxwe.b.j()).B("Intent does not resolve: %s", intent0);
                return ibom.a;
            }
            if(!(igyc0 instanceof igxt)) {
                goto label_108;
            }
            List list0 = dxwe0.an;
            if(!list0.contains(((igxt)igyc0))) {
                Integer integer0 = ((igxt)igyc0).b;
                if(integer0 == null) {
                    fhvs fhvs0 = dxwe0.al;
                    if(fhvs0 != null) {
                        ficx ficx0 = dxwe0.aj;
                        if(ficx0 == null) {
                            ibuq.j("syntheticHost");
                            ficx0 = null;
                        }
                        ficx0.a(fhvs0);
                        ((fhvs)fhvs0.e.d()).e.j(fhvs0);
                    }
                    dxwe0.am.clear();
                    list0.clear();
                    fhvs1 = dxwe0.ak;
                }
                else {
                    fhvs1 = (fhvs)dxwe0.am.get(integer0);
                }
                if(fhvs1 == null) {
                    ((ggtj)dxwe.b.j()).B("VE error: parent for %s not found", ((igxt)igyc0));
                    return ibom.a;
                }
                fhwk fhwk0 = dxwe0.z();
                int v = ((igxt)igyc0).a;
                fhvo fhvo0 = fhwk0.e(v);
                gjdw gjdw0 = ((igxt)igyc0).c;
                if(gjdw0 != null) {
                    fhvo0.d(new fhvp(gjdr.a, gjdw0));
                }
                ficx ficx1 = dxwe0.aj;
                if(ficx1 == null) {
                    ibuq.j("syntheticHost");
                    ficx1 = null;
                }
                ficx1.a(fhvs1);
                fhvs fhvs2 = fhvo0.a(fhvs1.d);
                fida fida0 = new fida(fhvs2);
                fhvs2.e = fida0;
                fida0.l();
                fhvs1.e.e(fhvs2);
                if(fhvs1.e.o()) {
                    hftr hftr0 = fhvs2.g;
                    long v1 = ficx1.d.a() * 1000L;
                    if(!hftr0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)hftr0).ensureMutable();
                    }
                    fhwd fhwd0 = (fhwd)hftr0.b_message;
                    fhwd0.b |= 4;
                    fhwd0.f = v1;
                }
                dxwe0.am.put(Integer.valueOf(v), fhvs2);
                list0.add(((igxt)igyc0));
                if(integer0 == null) {
                    dxwe0.al = fhvs2;
                }
                ficx ficx2 = dxwe0.aj;
                if(ficx2 == null) {
                    ibuq.j("syntheticHost");
                }
                else {
                    fhvw0 = ficx2;
                }
                ((ficx)fhvw0).b();
                return ibom.a;
            label_108:
                if(!(igyc0 instanceof igxv)) {
                    throw new IllegalArgumentException();
                }
                fhvs fhvs3 = (fhvs)dxwe0.am.get(Integer.valueOf(((igxv)igyc0).a));
                if(fhvs3 == null) {
                    ((ggtj)dxwe.b.j()).x("VE with id %s not found");
                    return ibom.a;
                }
                gjce gjce0 = ((igxv)igyc0).b;
                fhvt fhvt0 = new fhvt(gltz.e);
                if(gjce0 != null) {
                    fhvt0.b(new fhvu(gjdq.a, gjce0));
                }
                fhvw fhvw1 = dxwe0.ai;
                if(fhvw1 == null) {
                    ibuq.j("interactionLogger");
                }
                else {
                    fhvw0 = fhvw1;
                }
                fhvw0.b(fhvt0.a(), fhvs3);
                return ibom.a;
            }
        }
        return ibom.a;
    }
}

