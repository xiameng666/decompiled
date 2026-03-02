import android.os.Build.VERSION;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager.ModuleInfo;
import com.google.android.chimera.config.ModuleManager;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aauo {
    private final ModuleManager a;
    private final baun b;
    private final ibnn c;

    public aauo(ModuleManager moduleManager0) {
        this.a = moduleManager0;
        this.b = new baun("AccountSettings", new String[]{"CapabilityProviderImpl"});
        this.c = new ibnz(new aaun(this));
    }

    public final int a() {
        return ((Number)this.c.a()).intValue();
    }

    public final grvk b() {
        String s1;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grvk.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list0 = DesugarCollections.unmodifiableList(((grvk)hftp0.b_message).c);
        ibuq.e(list0, "getSupportedNativeActionsList(...)");
        new hfxu(list0);
        ibqm ibqm0 = new ibqm(null);
        Integer integer0 = (int)2;
        Integer integer1 = (int)4;
        ibqm0.addAll(ibpo.g(new Integer[]{integer0, integer1, ((int)5), ((int)7), ((int)10), ((int)19)}));
        List list1 = ibpo.a(ibqm0);
        ArrayList arrayList0 = new ArrayList(ibpo.q(list1, 10));
        for(Object object0: list1) {
            int v = ((Number)object0).intValue();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grzy.a).v_newBuilder();
            ibuq.f(hftp1, "builder");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grzy grzy0 = (grzy)hftp1.b_message;
            grzy0.b |= 1;
            grzy0.c = v;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            arrayList0.add(((grzy)hftv0));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk0 = (grvk)hftp0.b_message;
        hfuo hfuo0 = grvk0.c;
        if(!hfuo0.c()) {
            grvk0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, grvk0.c);
        List list2 = DesugarCollections.unmodifiableList(((grvk)hftp0.b_message).d);
        ibuq.e(list2, "getSupportedIconsList(...)");
        new hfxu(list2);
        List list3 = ibpo.g(new grwd[]{grwd.h, grwd.g, grwd.i, grwd.m, grwd.j, grwd.n, grwd.o, grwd.p, grwd.B, grwd.C, grwd.k, grwd.l, grwd.E, grwd.x, grwd.H, grwd.I, grwd.v, grwd.w, grwd.y, grwd.z, grwd.A, grwd.R, grwd.D});
        ArrayList arrayList1 = new ArrayList(ibpo.q(list3, 10));
        for(Object object1: list3) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grzx.a).v_newBuilder();
            ibuq.f(hftp2, "builder");
            int v1 = ((grwd)object1).T;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grzx grzx0 = (grzx)hftp2.b_message;
            grzx0.b |= 1;
            grzx0.c = v1;
            ProtoLiteMessage hftv1 = hftp2.N_build();
            ibuq.e(hftv1, "build(...)");
            arrayList1.add(((grzx)hftv1));
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk1 = (grvk)hftp0.b_message;
        hfuo hfuo1 = grvk1.d;
        if(!hfuo1.c()) {
            grvk1.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(arrayList1, grvk1.d);
        grvl.a(hftp0);
        ibqm ibqm1 = new ibqm(null);
        if(((long)Build.VERSION.SDK_INT) >= hojn.c()) {
            ibqm1.add(Integer.valueOf(6));
            ibqm1.add(Integer.valueOf(8));
        }
        ibqm1.add(integer1);
        ibqm1.add(Integer.valueOf(9));
        ibqm1.add(integer0);
        ibqm1.add(Integer.valueOf(3));
        List list4 = ibpo.a(ibqm1);
        ArrayList arrayList2 = new ArrayList(ibpo.q(list4, 10));
        for(Object object2: list4) {
            int v2 = ((Number)object2).intValue();
            grzw grzw0 = grzv.a(((ProtoLiteMessage)grzu.a).v_newBuilder());
            grzw0.b(v2);
            arrayList2.add(grzw0.a());
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk2 = (grvk)hftp0.b_message;
        grvk2.b();
        hfrj.E(arrayList2, grvk2.e);
        if(hojn.a.g().F()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvk grvk3 = (grvk)hftp0.b_message;
            grvk3.b |= 4;
            grvk3.g = true;
        }
        try {
            boolean z = false;
            Collection collection0 = this.a.getAllModules();
            ibuq.e(collection0, "getAllModules(...)");
            if(!collection0.isEmpty()) {
                for(Object object3: collection0) {
                    ModuleManager.ModuleInfo moduleManager$ModuleInfo0 = (ModuleManager.ModuleInfo)object3;
                    if(moduleManager$ModuleInfo0 != null) {
                        String s = moduleManager$ModuleInfo0.moduleId;
                        if(s != null) {
                            s1 = ibzk.w(s, "com.google.android.gms.", s);
                            goto label_104;
                        }
                    }
                    s1 = null;
                label_104:
                    if(ibuq.m(s1, "octarine")) {
                        z = true;
                        break;
                    }
                }
            }
            boolean z1 = hojn.n();
        }
        catch(InvalidConfigException invalidConfigException0) {
            this.b.e("Can\'t retrieve modules", invalidConfigException0, new Object[0]);
            goto label_157;
        }
        if(z1 && z && ((long)Build.VERSION.SDK_INT) >= hojn.a.g().o()) {
            grvl.a(hftp0);
            grzw grzw1 = grzv.a(((ProtoLiteMessage)grzu.a).v_newBuilder());
            grzw1.b(5);
            grzu grzu0 = grzw1.a();
            ibuq.f(grzu0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvk grvk4 = (grvk)hftp0.b_message;
            grzu0.getClass();
            grvk4.b();
            grvk4.e.add(grzu0);
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gsaj.a).v_newBuilder();
            ibuq.f(hftp3, "builder");
            boolean z2 = hvwc.e();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gsaj gsaj0 = (gsaj)hftp3.b_message;
            gsaj0.b |= 1;
            gsaj0.c = z2;
            boolean z3 = hvwc.f();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gsaj gsaj1 = (gsaj)hftp3.b_message;
            gsaj1.b |= 2;
            gsaj1.d = z3;
            boolean z4 = hvwc.g();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp3.b_message;
            ((gsaj)hftv2).b |= 4;
            ((gsaj)hftv2).e = z4;
            if(!hftv2.isImmutable()) {
                hftp3.ensureMutable();
            }
            gsaj gsaj2 = (gsaj)hftp3.b_message;
            gsaj2.b |= 16;
            gsaj2.f = true;
            ProtoLiteMessage hftv3 = hftp3.N_build();
            ibuq.e(hftv3, "build(...)");
            ibuq.f(((gsaj)hftv3), "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvk grvk5 = (grvk)hftp0.b_message;
            ((gsaj)hftv3).getClass();
            grvk5.f = (gsaj)hftv3;
            grvk5.b |= 1;
        }
    label_157:
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk6 = (grvk)hftp0.b_message;
        grvk6.b |= 0x4000;
        grvk6.p = true;
        if(!hoju.j()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvk grvk7 = (grvk)hftp0.b_message;
            grvk7.b |= 0x1000;
            grvk7.n = true;
        }
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)grww.a).v_newBuilder();
        ibuq.f(hftp4, "builder");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        grww grww0 = (grww)hftp4.b_message;
        grww0.b |= 1;
        grww0.c = true;
        ProtoLiteMessage hftv4 = hftp4.N_build();
        ibuq.e(hftv4, "build(...)");
        ibuq.f(((grww)hftv4), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk8 = (grvk)hftp0.b_message;
        ((grww)hftv4).getClass();
        grvk8.k = (grww)hftv4;
        grvk8.b |= 0x40;
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)grvc.a).v_newBuilder();
        ibuq.f(hftp5, "builder");
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        grvc grvc0 = (grvc)hftp5.b_message;
        grvc0.b |= 1;
        grvc0.c = true;
        if(!hoju.j()) {
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            grvc grvc1 = (grvc)hftp5.b_message;
            grvc1.b |= 2;
            grvc1.d = true;
        }
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp5.b_message;
        ((grvc)hftv5).b |= 4;
        ((grvc)hftv5).e = true;
        if(!hftv5.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp5.b_message;
        ((grvc)hftv6).b |= 0x40;
        ((grvc)hftv6).g = true;
        if(!hftv6.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp5.b_message;
        ((grvc)hftv7).b |= 0x20;
        ((grvc)hftv7).f = true;
        if(!hftv7.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv8 = hftp5.b_message;
        ((grvc)hftv8).b |= 0x80;
        ((grvc)hftv8).h = true;
        if(!hftv8.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv9 = hftp5.b_message;
        ((grvc)hftv9).b |= 0x100;
        ((grvc)hftv9).i = true;
        if(!hftv9.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv10 = hftp5.b_message;
        ((grvc)hftv10).b |= 0x400;
        ((grvc)hftv10).k = true;
        if(!hftv10.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp5.b_message;
        ((grvc)hftv11).b |= 0x800;
        ((grvc)hftv11).l = true;
        if(!hftv11.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv12 = hftp5.b_message;
        ((grvc)hftv12).b |= 0x8000;
        ((grvc)hftv12).o = true;
        if(!hftv12.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv13 = hftp5.b_message;
        ((grvc)hftv13).b |= 0x200;
        ((grvc)hftv13).j = true;
        if(!hftv13.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv14 = hftp5.b_message;
        ((grvc)hftv14).b |= 0x2000;
        ((grvc)hftv14).m = true;
        if(!hftv14.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv15 = hftp5.b_message;
        ((grvc)hftv15).b |= 0x10000;
        ((grvc)hftv15).p = true;
        if(!hftv15.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv16 = hftp5.b_message;
        ((grvc)hftv16).b |= 0x20000;
        ((grvc)hftv16).q = true;
        if(!hftv16.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv17 = hftp5.b_message;
        ((grvc)hftv17).b |= 0x4000;
        ((grvc)hftv17).n = true;
        if(!hftv17.isImmutable()) {
            hftp5.ensureMutable();
        }
        grvc grvc2 = (grvc)hftp5.b_message;
        grvc2.b |= 0x40000;
        grvc2.r = true;
        ProtoLiteMessage hftv18 = hftp5.N_build();
        ibuq.e(hftv18, "build(...)");
        ibuq.f(((grvc)hftv18), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk9 = (grvk)hftp0.b_message;
        ((grvc)hftv18).getClass();
        grvk9.h = (grvc)hftv18;
        grvk9.b |= 8;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk10 = (grvk)hftp0.b_message;
        grvk10.b |= 16;
        grvk10.i = true;
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)gruq.a).v_newBuilder();
        ibuq.f(hftp6, "builder");
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        gruq gruq0 = (gruq)hftp6.b_message;
        gruq0.b |= 1;
        gruq0.c = true;
        if(hoju.n()) {
            if(!hftp6.b_message.isImmutable()) {
                hftp6.ensureMutable();
            }
            gruq gruq1 = (gruq)hftp6.b_message;
            gruq1.b |= 2;
            gruq1.d = true;
        }
        ProtoLiteMessage hftv19 = hftp6.N_build();
        ibuq.e(hftv19, "build(...)");
        ibuq.f(((gruq)hftv19), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk11 = (grvk)hftp0.b_message;
        ((gruq)hftv19).getClass();
        grvk11.j = (gruq)hftv19;
        grvk11.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk12 = (grvk)hftp0.b_message;
        grvk12.b |= 0x100;
        grvk12.l = false;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk13 = (grvk)hftp0.b_message;
        grvk13.b |= 0x200;
        grvk13.m = true;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grvk grvk14 = (grvk)hftp0.b_message;
        grvk14.b |= 0x2000;
        grvk14.o = true;
        if(hoju.j()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grvk grvk15 = (grvk)hftp0.b_message;
            grvk15.b |= 0x8000;
            grvk15.q = true;
        }
        ProtoLiteMessage hftv20 = hftp0.N_build();
        ibuq.e(hftv20, "build(...)");
        return (grvk)hftv20;
    }
}

