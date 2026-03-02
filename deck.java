import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Objects;

public final class deck {
    public static final void a(dnr dnr0, List list0) {
        dnr0.b(list0.size(), null, new deci(list0), new gze(2039820996, true, new decj(list0, list0)));
    }

    public static final void b(deax deax0, goz goz0, int v) {
        String s2;
        ibuq.f(deax0, "contact");
        goz goz1 = goz0.ao(0x371A1533);
        if((((v & 6) == 0 ? (goz1.Z(deax0) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s = deax0.a;
            debb debb0 = deax0.c;
            goz1.M(0xD8E9A330);
            if((debb0 instanceof deaz)) {
                String s1 = ((deaz)debb0).a;
                Locale locale0 = jyw.a(((Configuration)goz1.h(AndroidCompositionLocals_androidKt.a))).g(0);
                if(locale0 == null) {
                    locale0 = Locale.getDefault();
                    ibuq.e(locale0, "getDefault(...)");
                }
                s2 = kaj.b(locale0).g(s1, kao.a).toString();
            }
            else {
                s2 = (debb0 instanceof deay) ? ((deay)debb0).a : null;
            }
            goz1.x();
            ddzz.b(s, null, s2, gzf.e(0x705E8570, new debx(deax0), goz1), null, goz1, 0xC00, 18);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new debu(deax0, v);
        }
    }

    public static final void c(decl decl0, ibts ibts0, ibth ibth0, goz goz0, int v) {
        ibuq.f(decl0, "state");
        ibuq.f(ibts0, "dispatch");
        ibuq.f(ibth0, "onBackClick");
        goz goz1 = goz0.ao(1809527878);
        int v1 = (v & 6) == 0 ? (goz1.Z(decl0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) == 0x92 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = guf.a(ibts0, goz1);
            ibom ibom0 = ibom.a;
            goz1.M(5004770);
            boolean z = goz1.X(gui0);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new debr(gui0);
                goz1.P(object0);
            }
            goz1.x();
            gqe.c(ibom0, ((ibts)object0), goz1);
            goz1.M(5004770);
            boolean z1 = goz1.X(decl0);
            Object object1 = goz1.j();
            if(z1 || object1 == gop.a) {
                debi debi0 = decl0.b;
                if((debi0 instanceof debf)) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: ((debf)debi0).a) {
                        if(ibzk.C(((deax)object2).a, decl0.a, true)) {
                            arrayList0.add(object2);
                        }
                    }
                    LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(((debf)debi0).b.size()));
                    for(Object object3: ((debf)debi0).b.entrySet()) {
                        Object object4 = ((Map.Entry)object3).getKey();
                        List list0 = (List)((Map.Entry)object3).getValue();
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object5: list0) {
                            if(ibzk.C(((deax)object5).a, decl0.a, true)) {
                                arrayList1.add(object5);
                            }
                        }
                        linkedHashMap0.put(object4, arrayList1);
                    }
                    debi0 = new debf(arrayList0, linkedHashMap0);
                }
                object1 = decl.a(decl0, null, debi0, 1);
                goz1.P(object1);
            }
            goz1.x();
            cmig.f(263070, gzf.e(0xDF296D84, new dece(ibth0, ((decl)object1), ibts0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new debs(decl0, ibts0, ibth0, v);
        }
    }

    public static final void d(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0x69198B82);
        if(v != 0) {
            cmig.f(0x40311, deaw.d, goz1, 54);
            v1 = v;
        }
        else if(!goz1.ac()) {
            cmig.f(0x40311, deaw.d, goz1, 54);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new debv(v1);
        }
    }

    public static final void e(goz goz0, int v) {
        int v1 = 0;
        goz goz1 = goz0.ao(0x9FECD412);
        if(v != 0) {
            cmig.f(0x40471, deaw.e, goz1, 54);
            v1 = v;
        }
        else if(!goz1.ac()) {
            cmig.f(0x40471, deaw.e, goz1, 54);
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new debw(v1);
        }
    }

    public static final void f(String s, ibts ibts0, goz goz0, int v) {
        ibuq.f(s, "searchQuery");
        ibuq.f(ibts0, "onValueChange");
        goz goz1 = goz0.ao(2027454099);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibts0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            cmig.f(0x40472, gzf.e(0xD1653A51, new dech(s, ibts0), goz1), goz1, 54);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new debt(s, ibts0, v);
        }
    }

    public static final void g(dixi dixi0, ibth ibth0, goz goz0, int v) {
        int v2;
        ibuq.f(ibth0, "onBackClick");
        goz goz1 = goz0.ao(0x6E3E96DC);
        int v1 = (v & 6) == 0 ? v | 2 : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(ibth0) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
            goto label_56;
        }
        goz1.I();
        if((v & 1) != 0 && !goz1.aa()) {
            v2 = v1 & -15;
            goz1.G();
            goto label_46;
        }
        goz1.M(0x6E3C21FE);
        Object object0 = goz1.j();
        if(object0 == gop.a) {
            object0 = deby.a;
            goz1.P(object0);
        }
        goz1.x();
        decl decl0 = new decl(null);
        goz1.M(0x56FA0E43);
        Context context0;
        for(context0 = (Context)goz1.h(AndroidCompositionLocals_androidKt.b); (context0 instanceof ContextWrapper); context0 = ((ContextWrapper)context0).getBaseContext()) {
            if((context0 instanceof xnb)) {
                lsk lsk0 = ((xnb)context0).getDefaultViewModelProviderFactory();
                lsq lsq0 = lud.b(goz1);
                if(lsq0 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ltx ltx0 = (lsq0 instanceof loz) ? ((loz)lsq0).getDefaultViewModelCreationExtras() : ltv.a;
                dixh dixh0 = (dixh)lue.a(new ibuk(debj.class), lsq0, null, lsk0, ltx0);
                goz1.x();
                goz1.M(0xDE86146D);
                String s = "com.google.android.gms.nearby.DefaultKey:" + ((ibtw)(((ibwx)object0))).hashCode();
                ibuk ibuk0 = new ibuk(debe.class);
                dixj dixj0 = new dixj(((ibtw)(((ibwx)object0))), decl0, ((debj)dixh0).a, ibuk0);
                lsq lsq1 = lud.b(goz1);
                if(lsq1 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                v2 = v1 & -15;
                ltx ltx1 = (lsq1 instanceof loz) ? ((loz)lsq1).getDefaultViewModelCreationExtras() : ltv.a;
                dixi0 = (dixn)lue.a(new ibuk(dixn.class), lsq1, s, dixj0, ltx1);
                goz1.x();
            label_46:
                goz1.w();
                decl decl1 = (decl)ltd.b(((dixn)dixi0).c, goz1).a();
                goz1.M(5004770);
                boolean z = goz1.Z(dixi0);
                Object object1 = goz1.j();
                if(z || object1 == gop.a) {
                    object1 = new debz(dixi0);
                    goz1.P(object1);
                }
                goz1.x();
                deck.c(decl1, ((ibts)(((ibwx)object1))), ibth0, goz1, v2 << 3 & 0x380);
            label_56:
                gsb gsb0 = goz1.af();
                if(gsb0 != null) {
                    gsb0.d = new debq(dixi0, ibth0, v);
                }
                return;
            }
        }
        Objects.toString(context0);
        throw new IllegalStateException("Expected a chimerax activity context for providing a view model factory but instead found: " + context0);
    }
}

