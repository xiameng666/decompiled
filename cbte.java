import android.accounts.Account;
import android.app.Application;
import android.app.supervision.SupervisionManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.kids.settings.AppContextProvider;
import java.util.List;
import java.util.Locale;

public final class cbte extends lny {
    public final ibrt a;
    public final boolean b;
    public final icmn c;
    public final cbpi d;
    public final icnj e;
    public iccs f;
    public List g;
    public final icnl h;
    public static final int i;
    private static final bboh j;
    private static final gmcg k;
    private final Application l;
    private final lrf m;
    private final cbvg n;
    private final ibnn o;
    private final cbdy p;
    private fkvs q;

    static {
        cbte.j = bboh.b("DeviceSupervisionOptInViewModel", bbcu.ac);
        new cbsq(null, null, null, cbsp.c, null);
        cbte.k = new bblp(1, 10);
    }

    public cbte(Application application0, ibrt ibrt0, boolean z, lrf lrf0) {
        ibuq.f(ibrt0, "highSpeedCoroutineScope");
        super(application0);
        this.l = application0;
        this.a = ibrt0;
        this.b = z;
        this.m = lrf0;
        icnl icnl0 = icnm.a(Boolean.valueOf(false));
        this.h = icnl0;
        icmn icmn0 = icmu.e(0, 0, 0, 7);
        this.c = icmn0;
        this.p = cbec.b(application0);
        this.d = cbpi.f.a(application0, z);
        Context context0 = AppContextProvider.a();
        ibuq.e(context0, "getApplicationContext(...)");
        this.n = new cbvg(context0, ibrt0);
        this.o = new ibnz(new cbsl());
        this.e = iclp.b(new icmj(icnl0, icmn0, new cbsv(null)), lsc.a(this), icmy.a(0L, 3), new cbuz(null));
        this.g = ibps.a;
        icbb.b(lsc.a(this), null, null, new cbsm(this, null), 3);
        if(hukf.d()) {
            gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
            gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
            gvhy0.c(this.k());
            gvhy0.d(gvkw.T);
            gvib0.b(gvhy0.a());
            gvij gvij0 = gvib0.a();
            cczb cczb0 = cfvm.v().c(((ProtoLiteMessage)gvij0));
            cczb0.c = (int)(z ? gvkq.dx.er : gvkq.dy.er);
            cczb0.a();
        }
    }

    public final long b() {
        Long long0 = (Long)this.m.d("max_retries_counter");
        return long0 == null ? hukf.a.c().b() : ((long)long0);
    }

    public final Intent c() {
        if(cbgq.a() && e.a()) {
            SupervisionManager supervisionManager0 = (SupervisionManager)this.a().getSystemService(SupervisionManager.class);
            return supervisionManager0 == null ? null : supervisionManager0.createConfirmSupervisionCredentialsIntent();
        }
        return null;
    }

    public final Object e(Context context0, ibrl ibrl0) {
        cbsr cbsr0;
        if((ibrl0 instanceof cbsr)) {
            cbsr0 = (cbsr)ibrl0;
            int v = cbsr0.d;
            if((v & 0x80000000) == 0) {
                cbsr0 = new cbsr(this, ibrl0);
            }
            else {
                cbsr0.d = v - 0x80000000;
            }
        }
        else {
            cbsr0 = new cbsr(this, ibrl0);
        }
        Object object0 = cbsr0.b;
        Object object1 = ibrx.a;
        switch(cbsr0.d) {
            case 0: {
                ibnx.b(object0);
                if(this.b() == 0L) {
                    ((ggtj)cbte.j.j()).x("Download failed due to exceeding max retries.");
                    return cbuy.d;
                }
                if(this.b) {
                    cbsr0.a = context0;
                    cbsr0.d = 1;
                    object0 = this.d.d(context0, cbsr0);
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_25;
                }
                goto label_28;
            }
            case 1: {
                context0 = cbsr0.a;
                ibnx.b(object0);
            label_25:
                if(((Boolean)object0).booleanValue()) {
                    ((ggtj)cbte.j.j()).x("Supervision already enabled and module already installed. Skipping download.");
                    return cbuy.b;
                }
            label_28:
                long v1 = this.b() - 1L;
                this.m.e("max_retries_counter", Long.valueOf(v1));
                long v2 = huku.a.b().a();
                cbss cbss0 = new cbss(this, context0, null);
                cbsr0.a = null;
                cbsr0.d = 2;
                object0 = icfo.c(v2, cbss0, cbsr0);
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
        synchronized(this) {
            this.f = null;
        }
        if(((cbuy)object0) != null) {
            return (cbuy)object0;
        }
        ((ggtj)cbte.j.j()).x("Download timed out.");
        return cbuy.c;
    }

    public final Object f(String s, gvku gvku0, ibrl ibrl0) {
        String s1 = this.k();
        if(this.b && gvku0 == gvku.h) {
            return this.n.a(s, s1, gvku0, "pse", ibrl0);
        }
        return gvku0 == gvku.h ? this.n.a(s, s1, gvku0, "psd", ibrl0) : this.n.a(s, s1, gvku0, null, ibrl0);
    }

    public final Object g(ibrl ibrl0) {
        cbst cbst0;
        if((ibrl0 instanceof cbst)) {
            cbst0 = (cbst)ibrl0;
            int v = cbst0.c;
            if((v & 0x80000000) == 0) {
                cbst0 = new cbst(this, ibrl0);
            }
            else {
                cbst0.c = v - 0x80000000;
            }
        }
        else {
            cbst0 = new cbst(this, ibrl0);
        }
        Object object0 = cbst0.a;
        Object object1 = ibrx.a;
        switch(cbst0.c) {
            case 0: {
                ibnx.b(object0);
                cbsu cbsu0 = new cbsu(this, null);
                cbst0.c = 1;
                object0 = icbd.a(this.a, cbsu0, cbst0);
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
        ibuq.e(object0, "withContext(...)");
        return object0;
    }

    public final Object h(Account account0, ibrl ibrl0) {
        cbsp cbsp0;
        String s5;
        gssv gssv0;
        ibvd ibvd1;
        cbsx cbsx0;
        if((ibrl0 instanceof cbsx)) {
            cbsx0 = (cbsx)ibrl0;
            int v = cbsx0.c;
            if((v & 0x80000000) == 0) {
                cbsx0 = new cbsx(this, ibrl0);
            }
            else {
                cbsx0.c = v - 0x80000000;
            }
        }
        else {
            cbsx0 = new cbsx(this, ibrl0);
        }
        Object object0 = cbsx0.a;
        Object object1 = ibrx.a;
        String s = null;
        switch(cbsx0.c) {
            case 0: {
                ibnx.b(object0);
                ibvd ibvd0 = new ibvd();
                ibuq.e(gssv.a, "getDefaultInstance(...)");
                ibvd0.a = gssv.a;
                if(this.q == null) {
                    cjix cjix0 = new cjix();
                    cjix0.b(cbte.k);
                    cjix0.a = "kids";
                    this.q = cjix0.a();
                }
                fkvs fkvs0 = this.q;
                if(fkvs0 == null) {
                    ibvd1 = ibvd0;
                    gssv0 = null;
                }
                else {
                    fkvi fkvi0 = fkvs0.a(account0);
                    if(fkvi0 == null) {
                        ibvd1 = ibvd0;
                        gssv0 = null;
                    }
                    else {
                        gmcd gmcd0 = fkvi0.d();
                        cbsx0.d = ibvd0;
                        cbsx0.c = 1;
                        Object object2 = icpu.c(gmcd0, cbsx0);
                        if(object2 != object1) {
                            ibvd1 = ibvd0;
                            gssv0 = (gssv)object2;
                            break;
                        }
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ibvd1 = cbsx0.d;
                ibnx.b(object0);
                gssv0 = (gssv)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(gssv0 != null && !gssv0.b.isEmpty()) {
            ibvd1.a = gssv0;
            hfuo hfuo0 = ((gssv)ibvd1.a).b;
            ibuq.e(hfuo0, "getPersonResponseList(...)");
            gstw gstw0 = (gstw)ibpo.R(hfuo0);
            hfuo hfuo1 = (gstw0.d == null ? gdmq.a : gstw0.d).h;
            ibuq.e(hfuo1, "getEmailList(...)");
            for(Object object3: hfuo1) {
                gdmt gdmt0 = ((gdlt)object3).c;
                if(gdmt0 == null) {
                    gdmt0 = gdmt.a;
                }
                if(!gdmt0.f) {
                    continue;
                }
                goto label_61;
            }
            object3 = null;
        label_61:
            hfuo hfuo2 = (gstw0.d == null ? gdmq.a : gstw0.d).f;
            ibuq.e(hfuo2, "getNameList(...)");
            for(Object object4: hfuo2) {
                gdmt gdmt1 = ((gdmg)object4).c;
                if(gdmt1 == null) {
                    gdmt1 = gdmt.a;
                }
                if(!gdmt1.f) {
                    continue;
                }
                goto label_72;
            }
            object4 = null;
        label_72:
            hfuo hfuo3 = (gstw0.d == null ? gdmq.a : gstw0.d).g;
            ibuq.e(hfuo3, "getPhotoList(...)");
            for(Object object5: hfuo3) {
                gdmt gdmt2 = ((gdmz)object5).c;
                if(gdmt2 == null) {
                    gdmt2 = gdmt.a;
                }
                if(!gdmt2.f) {
                    continue;
                }
                goto label_83;
            }
            object5 = null;
        label_83:
            hfuo hfuo4 = (gstw0.d == null ? gdmq.a : gstw0.d).j;
            ibuq.e(hfuo4, "getGenderList(...)");
            for(Object object6: hfuo4) {
                gdmt gdmt3 = ((gdma)object6).c;
                if(gdmt3 == null) {
                    gdmt3 = gdmt.a;
                }
                if(!gdmt3.f) {
                    continue;
                }
                goto label_94;
            }
            object6 = null;
        label_94:
            String s1 = ((gdmg)object4) == null ? null : ((gdmg)object4).d;
            String s2 = ((gdmg)object4) == null ? null : ((gdmg)object4).f;
            String s3 = ((gdmz)object5) == null ? null : ((gdmz)object5).d;
            if(((gdma)object6) == null) {
                s5 = null;
            }
            else {
                String s4 = ((gdma)object6).d;
                if(s4 == null) {
                    s5 = null;
                }
                else {
                    Locale locale0 = Locale.US;
                    ibuq.e(locale0, "US");
                    s5 = s4.toLowerCase(locale0);
                    ibuq.e(s5, "toLowerCase(...)");
                }
            }
            if(ibuq.m(s5, "male")) {
                cbsp0 = cbsp.a;
            }
            else {
                cbsp0 = ibuq.m(s5, "female") ? cbsp.b : cbsp.c;
            }
            if(((gdlt)object3) != null) {
                String s6 = ((gdlt)object3).d;
                if(s6 != null) {
                    s = s6.toLowerCase(Locale.ROOT);
                    ibuq.e(s, "toLowerCase(...)");
                }
            }
            return new cbsq(s1, s2, s3, cbsp0, s);
        }
        gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
        gvhy gvhy0 = gvhx.a(((ProtoLiteMessage)gvhl.a).v_newBuilder());
        gvhy0.c(this.k());
        gvhy0.d(gvkw.T);
        gvib0.b(gvhy0.a());
        gvij gvij0 = gvib0.a();
        cczb cczb0 = cfvm.v().c(((ProtoLiteMessage)gvij0));
        cczb0.c = (int)gvkq.dv.er;
        cczb0.a();
        return null;
    }

    public final Object i(ibrl ibrl0) {
        cbsy cbsy0 = new cbsy(this, null);
        return icbd.a(this.a, cbsy0, ibrl0);
    }

    public final Object j(ibrl ibrl0) {
        cbtd cbtd0;
        if((ibrl0 instanceof cbtd)) {
            cbtd0 = (cbtd)ibrl0;
            int v = cbtd0.c;
            if((v & 0x80000000) == 0) {
                cbtd0 = new cbtd(this, ibrl0);
            }
            else {
                cbtd0.c = v - 0x80000000;
            }
        }
        else {
            cbtd0 = new cbtd(this, ibrl0);
        }
        Object object0 = cbtd0.a;
        Object object1 = ibrx.a;
        switch(cbtd0.c) {
            case 0: {
                ibnx.b(object0);
                cbtd0.c = 1;
                object0 = this.p.b(cbtd0);
                if(object0 != object1) {
                    return ((gged_interceptors)object0).isEmpty() ? Boolean.valueOf(false) : Boolean.valueOf(true);
                }
                return object1;
            }
            case 1: {
                ibnx.b(object0);
                return ((gged_interceptors)object0).isEmpty() ? Boolean.valueOf(false) : Boolean.valueOf(true);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final String k() {
        return (String)this.o.a();
    }

    public final void l(Context context0) {
        icbb.b(lsc.a(this), null, null, new cbtb(this, context0, null), 3);
    }
}

