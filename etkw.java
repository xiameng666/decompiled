import android.os.Build;
import android.provider.Settings.Global;
import java.util.List;

final class etkw extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final etlf d;
    final hjxe e;

    public etkw(etlf etlf0, hjxe hjxe0, ibrl ibrl0) {
        this.d = etlf0;
        this.e = hjxe0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((etkw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new etkw(this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object6;
        Object object5;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                evql evql0 = etho.a(this.d.m, this.e);
                this.c = 1;
                object2 = fsdk.a(evql0, this);
                if(object2 == object1) {
                    return object1;
                }
                goto label_12;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
            label_12:
                if(ibnw.b(object2)) {
                    etlf etlf0 = this.d;
                    hjxh hjxh0 = hjxh.a;
                    if((object2 instanceof ibnv)) {
                        object2 = hjxh0;
                    }
                    hfuo hfuo0 = ((hjxh)object2).b;
                    ibuq.e(hfuo0, "getDevicesList(...)");
                    etlf0.g = ibpo.at(hfuo0);
                    List list0 = etlf0.g;
                    if(list0 == null) {
                        ibuq.j("devicesForGaia");
                        list0 = null;
                    }
                    for(Object object3: list0) {
                        if(!((hjxg)object3).j) {
                            continue;
                        }
                        goto label_30;
                    }
                    object3 = null;
                label_30:
                    hjxg hjxg0 = (hjxg)object3;
                    if(hjxg0 == null) {
                        hjxj hjxj0 = hjxi.a(((ProtoLiteMessage)hjxg.a).v_newBuilder());
                        hjxj0.b(0L);
                        hjxj0.c(gtmu.b);
                        hjxj0.d(gtmv.b);
                        hjxj0.g();
                        hjxj0.f(true);
                        hjxg0 = hjxj0.a();
                    }
                    String s = Settings.Global.getString(etlf0.m.d.getContentResolver(), "device_name");
                    if(s == null) {
                        s = Build.MODEL;
                    }
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hjxg0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)hjxg0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hjxg hjxg1 = (hjxg)hftp0.b_message;
                    s.getClass();
                    hjxg1.b |= 8;
                    hjxg1.f = s;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    String s1 = hjxg0.d;
                    ibuq.e(s1, "getPublicWalletId(...)");
                    this.a = etlf0;
                    this.b = (hjxg)hftv0;
                    this.c = 2;
                    Object object4 = etlf0.c(s1, this);
                    if(object4 != object1) {
                        object5 = (hjxg)hftv0;
                        object0 = object4;
                        object6 = etlf0;
                        goto label_69;
                    }
                    return object1;
                }
                else {
                    ((ggtj)this.d.f.j()).x("Unable to get devices from server");
                }
                break;
            }
            case 2: {
                object5 = this.b;
                object6 = this.a;
                ibnx.b(object0);
            label_69:
                ((etlf)object6).j = new etli(((hjxg)object5), null, null, ((Boolean)object0).booleanValue());
                this.a = null;
                this.b = null;
                this.c = 3;
                if(this.d.f(this) == object1) {
                    return object1;
                }
                break;
            }
            default: {
                ibnx.b(object0);
            }
        }
        this.d.i = false;
        return ibom.a;
    }
}

