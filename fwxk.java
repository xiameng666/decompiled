import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class fwxk implements SharedPreferences.OnSharedPreferenceChangeListener, fwxg, fwyt {
    public final fvwz a;
    public final List b;
    public boolean c;
    public int d;
    public Map e;
    public gwxu f;
    public boolean g;
    public final gfsd h;
    public final Context i;
    public final fwxh j;
    public final fwxa k;
    public final fwxb l;
    public fwxl m;
    private final fwzp p;

    public fwxk(Context context0, fwzp fwzp0, fwxh fwxh0, fwxa fwxa0, fwxb fwxb0, fvwz fvwz0) {
        this.b = new ArrayList();
        this.c = false;
        this.d = 0x7FFFFFFF;
        this.g = false;
        this.h = new fwxj();
        this.i = context0;
        this.p = fwzp0;
        this.j = fwxh0;
        this.k = fwxa0;
        this.l = fwxb0;
        this.a = fvwz0;
    }

    @Override  // fwyt
    public final int a() {
        return this.j.b();
    }

    public final void b() {
        gwwv gwwv0 = gwwv.e;
        fwso.f(this.a, gwwv0.ordinal());
        gwxu gwxu0 = gwxu.values()[Math.max(Math.min(((int)huou.a.c().f()), gwxu.values().length - 1), 0)];
        boolean z = huou.a.c().m();
        long v = huou.a.c().a();
        int v1 = (int)huou.a.c().l();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwwt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwwt gwwt0 = (gwwt)hftp0.b_message;
        gwxu0.getClass();
        hfuf hfuf0 = gwwt0.c;
        if(!hfuf0.c()) {
            gwwt0.c = ProtoLiteMessage.C(hfuf0);
        }
        gwwt0.c.i(gwxu0.g);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gwwt)hftv0).b |= 1;
        ((gwwt)hftv0).d = z;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gwwt)hftv1).e = 1;
        ((gwwt)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gwwt)hftv2).b |= 8;
        ((gwwt)hftv2).g = v;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwwt gwwt1 = (gwwt)hftp0.b_message;
        gwwt1.b |= 16;
        gwwt1.h = v1;
        if(humy.f()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwxo.a).v_newBuilder();
            humy humy0 = humy.a;
            int v2 = (int)humy0.b().l();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo0 = (gwxo)hftp1.b_message;
            gwxo0.b |= 1;
            gwxo0.c = v2;
            int v3 = (int)humy0.b().m();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo1 = (gwxo)hftp1.b_message;
            gwxo1.b |= 2;
            gwxo1.d = v3;
            int v4 = (int)humy0.b().p();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo2 = (gwxo)hftp1.b_message;
            gwxo2.b |= 4;
            gwxo2.e = v4;
            int v5 = (int)humy0.b().q();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo3 = (gwxo)hftp1.b_message;
            gwxo3.b |= 16;
            gwxo3.g = v5;
            int v6 = (int)humy0.b().o();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo4 = (gwxo)hftp1.b_message;
            gwxo4.b |= 0x40;
            gwxo4.i = v6;
            int v7 = (int)humy0.b().j();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo5 = (gwxo)hftp1.b_message;
            gwxo5.b |= 8;
            gwxo5.f = v7;
            int v8 = (int)humy0.b().k();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo6 = (gwxo)hftp1.b_message;
            gwxo6.b |= 0x20;
            gwxo6.h = v8;
            int v9 = (int)humy0.b().i();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo7 = (gwxo)hftp1.b_message;
            gwxo7.b |= 0x80;
            gwxo7.j = v9;
            float f = (float)humy0.b().a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo8 = (gwxo)hftp1.b_message;
            gwxo8.b |= 0x200;
            gwxo8.l = f;
            float f1 = (float)humy0.b().b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo9 = (gwxo)hftp1.b_message;
            gwxo9.b |= 0x400;
            gwxo9.m = f1;
            float f2 = (float)humy0.b().e();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo10 = (gwxo)hftp1.b_message;
            gwxo10.b |= 0x1000;
            gwxo10.o = f2;
            float f3 = (float)humy0.b().f();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo11 = (gwxo)hftp1.b_message;
            gwxo11.b |= 0x2000;
            gwxo11.p = f3;
            float f4 = (float)humy0.b().d();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo12 = (gwxo)hftp1.b_message;
            gwxo12.b |= 0x800;
            gwxo12.n = f4;
            boolean z1 = humy.e();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo13 = (gwxo)hftp1.b_message;
            gwxo13.b |= 0x80000;
            gwxo13.v = z1;
            boolean z2 = humy.g();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo14 = (gwxo)hftp1.b_message;
            gwxo14.b |= 0x100000;
            gwxo14.w = z2;
            long v10 = humy0.b().r();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo15 = (gwxo)hftp1.b_message;
            gwxo15.b |= 0x200000;
            gwxo15.x = v10;
            float f5 = (float)humy0.b().h();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo16 = (gwxo)hftp1.b_message;
            gwxo16.b |= 0x400000;
            gwxo16.y = f5;
            float f6 = (float)humy0.b().g();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo17 = (gwxo)hftp1.b_message;
            gwxo17.b |= 0x800000;
            gwxo17.z = f6;
            long v11 = humy0.b().v();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo18 = (gwxo)hftp1.b_message;
            gwxo18.b |= 0x8000;
            gwxo18.r = v11;
            long v12 = humy0.b().t();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo19 = (gwxo)hftp1.b_message;
            gwxo19.b |= 0x10000;
            gwxo19.s = v12;
            long v13 = humy0.b().u();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo20 = (gwxo)hftp1.b_message;
            gwxo20.b |= 0x20000;
            gwxo20.t = v13;
            long v14 = humy0.b().s();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo21 = (gwxo)hftp1.b_message;
            gwxo21.b |= 0x40000;
            gwxo21.u = v14;
            boolean z3 = humy0.b().G();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo22 = (gwxo)hftp1.b_message;
            gwxo22.b |= 0x1000000;
            gwxo22.A = z3;
            int v15 = (int)humy0.b().n();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo23 = (gwxo)hftp1.b_message;
            gwxo23.b |= 0x100;
            gwxo23.k = v15;
            float f7 = (float)humy0.b().c();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo24 = (gwxo)hftp1.b_message;
            gwxo24.b |= 0x4000;
            gwxo24.q = f7;
            boolean z4 = humy0.b().F();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo25 = (gwxo)hftp1.b_message;
            gwxo25.b |= 0x2000000;
            gwxo25.B = z4;
            int v16 = (int)humy0.b().w();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo26 = (gwxo)hftp1.b_message;
            gwxo26.b |= 0x4000000;
            gwxo26.C = v16;
            boolean z5 = humy0.b().D();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo27 = (gwxo)hftp1.b_message;
            gwxo27.b |= 0x8000000;
            gwxo27.D = z5;
            boolean z6 = humy0.b().E();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwxo gwxo28 = (gwxo)hftp1.b_message;
            gwxo28.b |= 0x10000000;
            gwxo28.E = z6;
            gwxo gwxo29 = (gwxo)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwwt gwwt2 = (gwwt)hftp0.b_message;
            gwxo29.getClass();
            gwwt2.f = gwxo29;
            gwwt2.b |= 4;
        }
        humv humv0 = humv.a;
        if(humv0.d().S()) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gwxf.a).v_newBuilder();
            long v17 = humv0.d().H();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf0 = (gwxf)hftp2.b_message;
            gwxf0.b |= 1;
            gwxf0.c = v17;
            int v18 = (int)humv0.d().i();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf1 = (gwxf)hftp2.b_message;
            gwxf1.b |= 2;
            gwxf1.d = v18;
            int v19 = (int)humv0.d().g();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf2 = (gwxf)hftp2.b_message;
            gwxf2.b |= 4;
            gwxf2.e = v19;
            int v20 = (int)humv0.d().l();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf3 = (gwxf)hftp2.b_message;
            gwxf3.b |= 8;
            gwxf3.f = v20;
            int v21 = (int)humv0.d().w();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf4 = (gwxf)hftp2.b_message;
            gwxf4.b |= 0x20;
            gwxf4.g = v21;
            int v22 = (int)humv0.d().v();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf5 = (gwxf)hftp2.b_message;
            gwxf5.b |= 0x80;
            gwxf5.h = v22;
            long v23 = humv0.d().G();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf6 = (gwxf)hftp2.b_message;
            gwxf6.b |= 0x100;
            gwxf6.i = v23;
            int v24 = (int)humv0.d().f();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf7 = (gwxf)hftp2.b_message;
            gwxf7.b |= 0x200;
            gwxf7.j = v24;
            int v25 = (int)humv0.d().j();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf8 = (gwxf)hftp2.b_message;
            gwxf8.b |= 0x400;
            gwxf8.k = v25;
            int v26 = (int)humv0.d().h();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf9 = (gwxf)hftp2.b_message;
            gwxf9.b |= 0x800;
            gwxf9.l = v26;
            int v27 = (int)humv0.d().k();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gwxf gwxf10 = (gwxf)hftp2.b_message;
            gwxf10.b |= 0x2000;
            gwxf10.m = v27;
            gwxf gwxf11 = (gwxf)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwwt gwwt3 = (gwwt)hftp0.b_message;
            gwxf11.getClass();
            gwwt3.i = gwxf11;
            gwwt3.b |= 0x20;
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gwww.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        ((gwww)hftv3).c = gwwv0.g;
        ((gwww)hftv3).b |= 1;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        gwww gwww0 = (gwww)hftp3.b_message;
        gwwt gwwt4 = (gwwt)hftp0.N_build();
        gwwt4.getClass();
        gwww0.f = gwwt4;
        gwww0.b |= 4;
        gwww gwww1 = (gwww)hftp3.N_build();
        this.j.c(gwww1);
    }

    @Override  // fwyt
    public final void c(fwyn fwyn0) {
        List list0 = this.b;
        if(!list0.contains(fwyn0)) {
            list0.add(fwyn0);
        }
    }

    @Override  // fwyt
    public final void d() {
        if(huou.d()) {
            huou.d();
            return;
        }
        this.k();
        gwww gwww0 = fwwz.a(gwwv.a);
        this.j.c(gwww0);
        fwso.f(this.a, gwwv.a.g);
    }

    @Override  // fwyt
    public final void e(Boolean boolean0, Boolean boolean1) {
        Objects.toString(boolean0);
        Objects.toString(boolean1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwxs.a).v_newBuilder();
        if(boolean0 != null) {
            boolean z = boolean0.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwxs gwxs0 = (gwxs)hftp0.b_message;
            gwxs0.b |= 1;
            gwxs0.c = z;
        }
        if(boolean1 != null) {
            boolean z1 = boolean1.booleanValue();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwxs gwxs1 = (gwxs)hftp0.b_message;
            gwxs1.b |= 2;
            gwxs1.d = z1;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwww.a).v_newBuilder();
        gwwv gwwv0 = gwwv.f;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gwww)hftv0).c = gwwv0.g;
        ((gwww)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gwww gwww0 = (gwww)hftp1.b_message;
        gwxs gwxs2 = (gwxs)hftp0.N_build();
        gwxs2.getClass();
        gwww0.g = gwxs2;
        gwww0.b |= 8;
        gwww gwww1 = (gwww)hftp1.N_build();
        this.j.c(gwww1);
    }

    @Override  // fwyt
    public final boolean f() {
        if(!huou.e()) {
            return false;
        }
        this.k.c();
        return this.k.c();
    }

    @Override  // fwyt
    public final boolean g(fwyo fwyo0) {
        List list0;
        fwxl fwxl0;
        if(huou.e()) {
            fwxa fwxa0 = this.k;
            if(fwxa0.c()) {
                Map map0 = fwyo0.a;
                gwww gwww0 = fwwz.b(0x7FFFFFFF, map0);
                for(int v = 0; v < gwww0.e.size(); ++v) {
                    boolean z = gwxi.b(((gwxe)gwww0.e.get(v)).c) != null;
                    boolean z1 = gwxw.b(((gwxe)gwww0.e.get(v)).d) != null;
                    gwxe gwxe0 = (gwxe)gwww0.e.get(v);
                }
                this.c = this.j.c(gwww0);
                int v1 = map0.size();
                fwsj fwsj0 = new fwsj(this.a.f(), v1, v1);
                this.a.a(fwsj0);
                if(this.c) {
                    this.d = 0x7FFFFFFF;
                    this.e = map0;
                    fwxb fwxb0 = this.l;
                    int[] arr_v = fwxa0.e();
                    fwxa0.a.lock();
                    try {
                        fwxa0.a();
                        list0 = fwxa0.d;
                    }
                    finally {
                        fwxa0.a.unlock();
                    }
                    for(int v3 = 0; true; ++v3) {
                        if(v3 >= arr_v.length) {
                            fwxl0 = new fwxl(fwxb0, arr_v, list0);
                            break;
                        }
                        if(!list0.contains(fwxc.a(arr_v[v3]))) {
                            fwxl0 = null;
                            break;
                        }
                    }
                    this.m = fwxl0;
                    if(fwxl0 == null) {
                        this.d();
                        return false;
                    }
                }
                return this.c;
            }
        }
        return false;
    }

    @Override  // fwyt
    public final boolean h() {
        return huou.e() ? this.c : false;
    }

    @Override  // fwyt
    public final boolean i() {
        return false;
    }

    @Override  // fwyt
    public final void j() {
        if(SystemClock.elapsedRealtime() - this.l.c > huou.a.c().b()) {
            gwww gwww0 = fwwz.a(gwwv.c);
            this.j.c(gwww0);
        }
        gwww gwww1 = fwwz.a(gwwv.d);
        this.g = this.j.c(gwww1);
    }

    public final void k() {
        this.c = false;
        this.g = false;
    }

    public static fwxk l(Context context0, fwzp fwzp0, fvwz fvwz0) {
        synchronized(fwxk.class) {
            if(huou.e()) {
                if(huou.a.c().o() && bbpj.a(context0).h()) {
                    return null;
                }
                gxcy gxcy0 = fwpq.a(context0);
                if(gxcy0 == null) {
                    return null;
                }
                fwxh fwxh0 = new fwxh(gxcy0, fwzp0, fvwz0);
                fwxk fwxk0 = new fwxk(context0, fwzp0, fwxh0, new fwxa(fwxh0), new fwxb(), fvwz0);
                fwxh0.d = fwxk0;
                fwxh0.b = new bblg("AR_CHRE_Handler", 9);
                fwxh0.b.start();
                fwxh0.c = new bblf(fwxh0.b);
                fwxh0.a.f(0x476F6F676C00100BL, fwxh0, fwxh0.c);
                try {
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("activityRecognitionAccuracyModeName", 0);
                    if(sharedPreferences0 != null) {
                        sharedPreferences0.registerOnSharedPreferenceChangeListener(fwxk0);
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                return fwxk0;
            }
        }
        return null;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(s != null && TextUtils.equals(s, "arAccuracyModePref")) {
            fwzp fwzp0 = this.p;
            if(fwzp0 != null) {
                fwzp0.m(new fwxi(this));
            }
        }
    }
}

