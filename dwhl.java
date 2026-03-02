import android.content.Context;
import android.content.Intent;

final class dwhl extends ibsl implements ibtw {
    int a;
    final dwhp b;

    public dwhl(dwhp dwhp0, ibrl ibrl0) {
        this.b = dwhp0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwhl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwhl(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dwhp dwhp0 = this.b;
            String s = dwhp0.i;
            evqp evqp0 = new evqp();
            dwhi dwhi0 = new dwhi(evqp0);
            dwhj dwhj0 = new dwhj(evqp0);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guxz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dvgq dvgq0 = dwhp0.e;
            guxz guxz0 = (guxz)hftp0.b_message;
            s.getClass();
            guxz0.b = s;
            if(hwfk.U() && dvgq0.a.d != null) {
                String s1 = dvgq0.c.c();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                guxz guxz1 = (guxz)hftp0.b_message;
                s1.getClass();
                guxz1.c = s1;
            }
            ProtoLiteMessage hftv0 = hftp0.N_build();
            dptv.m(dvgq0.a, dpuj.aV, ((MessageLite)hftv0), ((MessageLite)guya.a), dwhi0, dwhj0);
            this.a = 1;
            object2 = fsdk.a(evqp0.a, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        acp acp0 = null;
        if(ibnw.b(object2) && ((object2 instanceof ibnv) ? null : object2) != null) {
            guya guya0 = guya.a;
            if((object2 instanceof ibnv)) {
                object2 = guya0;
            }
            dwhp dwhp1 = this.b;
            acp acp1 = dwhp1.m;
            if(acp1 == null) {
                ibuq.j("editCategoryActivityResultLauncher");
            }
            else {
                acp0 = acp1;
            }
            Context context0 = dwhp1.c;
            gvbz gvbz0 = ((guya)object2).c;
            if(gvbz0 == null) {
                gvbz0 = gvbz.a;
            }
            gvby gvby0 = ((guya)object2).b;
            if(gvby0 == null) {
                gvby0 = gvby.a;
            }
            Intent intent0 = dlnf.H(context0, gvbz0, gvby0, true, dwhp1.h);
            ibuq.e(intent0, "newEditPassCategoryIntent(...)");
            acp0.b(intent0);
            return ibom.a;
        }
        a.ae(dwhp.a.j(), "Failed to get category options from RPC", ibnw.a(object2));
        this.b.f();
        return ibom.a;
    }
}

