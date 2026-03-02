import com.google.android.gms.pay.GetSePrepaidCardRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;

final class dxqf extends ibsl implements ibtw {
    int a;
    final dxqi b;

    public dxqf(dxqi dxqi0, ibrl ibrl0) {
        this.b = dxqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            GetSePrepaidCardRequest getSePrepaidCardRequest0 = new GetSePrepaidCardRequest();
            getSePrepaidCardRequest0.a = this.b.j;
            getSePrepaidCardRequest0.b = dypl.b(gtni.b);
            getSePrepaidCardRequest0.d = 3;
            getSePrepaidCardRequest0.e = 1;
            evql evql0 = this.b.n.aN(getSePrepaidCardRequest0);
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        dxqi dxqi0 = this.b;
        if(ibnw.b(object2)) {
            ibuq.c(((ProtoSafeParcelable)object2));
            ibuq.e(dyhg.a, "getDefaultInstance(...)");
            MessageLite hfvm0 = ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)dyhg.a));
            ibuq.e(hfvm0, "parse(...)");
            dyer dyer0 = ((dyhg)hfvm0).d;
            if(dyer0 == null) {
                dyer0 = dyer.a;
            }
            String s = dyer0.b;
            ibuq.e(s, "getErrorString(...)");
            if(s.length() > 0) {
                dyer dyer1 = ((dyhg)hfvm0).d;
                if(dyer1 == null) {
                    dyer1 = dyer.a;
                }
                String s1 = dyer1.b;
                ibuq.e(s1, "getErrorString(...)");
                ((ggtj)dxqi.i.i()).B("Could not read MFC card from chip, error: %s", s1);
                dxmj.m(dxqi0, s1, 2);
            }
            else if((((dyhg)hfvm0).b & 1) == 0) {
                dxmj.m(dxqi0, null, 3);
            }
            else {
                dylf dylf0 = ((dyhg)hfvm0).c;
                if(dylf0 == null) {
                    dylf0 = dylf.a;
                }
                dylc dylc0 = dylf0.d == null ? dylc.a : dylf0.d;
                dymg dymg0 = dylc0.e == null ? dymg.a : dylc0.e;
                ibuq.e(dymg0, "getBalance(...)");
                dxqi0.i(lsc.a(dxqi0), new frxf[]{new dxrf(dymg0)});
            }
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dxqi.i.i(), "Could not read MFC card from chip.", throwable0);
            dxmj.m(dxqi0, dxsy.f(throwable0), 2);
        }
        return ibom.a;
    }
}

