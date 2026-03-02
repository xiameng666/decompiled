import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashSet;
import java.util.Set;

public final class dvxv extends dwso {
    public final Set a;
    public int b;
    int c;
    final gfsx e;
    private final dsiu i;
    private final dxcz j;
    private final dvth k;
    private final dvxw l;
    private final dvtg m;
    private final dvsx n;
    private final dvri o;
    private final dvso p;
    private final AppBarLayout q;
    private final LinearLayout r;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dvxv(dokz dokz0, ValuableGroup valuableGroup0, dsiu dsiu0, dxcz dxcz0, AppBarLayout appBarLayout0, LinearLayout linearLayout0, dvth dvth0, dvxw dvxw0, dvtg dvtg0, dvri dvri0, dvso dvso0, dvsx dvsx0) {
        super(dvuz.class, dokz0, valuableGroup0.a);
        this.a = new HashSet();
        this.b = 0;
        this.c = 0;
        this.e = gfqx.a;
        this.i = dsiu0;
        this.j = dxcz0;
        this.q = appBarLayout0;
        this.r = linearLayout0;
        this.k = dvth0;
        this.l = dvxw0;
        this.m = dvtg0;
        this.o = dvri0;
        this.p = dvso0;
        this.n = dvsx0;
    }

    @Override  // dwso
    protected final dwsn b(Context context0, Valuable valuable0, Iterable iterable0, int v) {
        dwsn dwsn0 = new dvuz(context0);
        dwsn0.S = this.e;
        xob xob0 = (xob)context0;
        dvxu dvxu0 = new dvxu(this, xob0, fipw.a.a(xob0), fipw.c.a(xob0), v);
        ((dvuz)dwsn0).a(this.f, this.k, this.l, this.m, this.o, this.p, dvxu0, this.n);
        ((dvuz)dwsn0).e(valuable0, iterable0);
        ((dvuz)dwsn0).setTag(valuable0.b);
        dvxt dvxt0 = new dvxt(this, v);
        dwsn0.b.j(dvxt0);
        ((dvuz)dwsn0).setScrollY(this.c);
        return dwsn0;
    }

    @Override  // pch
    public final void f(ViewGroup viewGroup0, int v, Object object0) {
        this.q(v);
        xob xob0 = (xob)viewGroup0.getContext();
        if(xob0 != null && (object0 instanceof dvuz)) {
            this.p(xob0, ((NestedScrollView)((dvuz)object0).findViewById(0x7F0B0274)), fipw.a.a(xob0), fipw.c.a(xob0));  // id:DetailBackdrop
        }
    }

    final gfsx o(int v) {
        try {
            return gfsx.m(((Valuable)this.g.v().get(v)));
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return gfqx.a;
        }
    }

    public final void p(xob xob0, NestedScrollView nestedScrollView0, int v, int v1) {
        int v2 = nestedScrollView0.canScrollVertically(-1) ? v1 : v;
        this.q.setBackgroundColor(v2);
        xob0.getWindow().setStatusBarColor(v2);
        if(nestedScrollView0.canScrollVertically(1)) {
            v = v1;
        }
        this.r.setBackgroundColor(v);
        xob0.getWindow().setNavigationBarColor(v);
    }

    public final void q(int v) {
        this.b = v;
        String s = ((Valuable)this.g.v().get(v)).b;
        this.j.b(s);
        if(this.a.contains(Integer.valueOf(v))) {
            this.i.b();
            return;
        }
        this.i.c();
    }

    final void r(int v) {
        ggqk ggqk0 = ((gged_interceptors)this.u()).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            Pair pair0 = (Pair)object0;
            if(((int)(((Integer)pair0.first))) == v) {
                dvuz dvuz0 = (dvuz)pair0.second;
                if(dvuz0.r.i()) {
                    try {
                        long v1 = Long.parseLong(((Valuable)dvuz0.r.d()).c);
                        dvfu dvfu0 = dvuz0.B;
                        guwf guwf0 = ((Valuable)dvuz0.r.d()).R;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hasf.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((hasf)hftv0).b = v1;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hasf hasf0 = (hasf)hftp0.b_message;
                        hasf0.c = guwf0.a();
                        hasf hasf1 = (hasf)hftp0.N_build();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        hapr hapr0 = (hapr)hftp1.b_message;
                        hasf1.getClass();
                        hapr0.bL = hasf1;
                        hapr0.g |= 0x2000;
                        dvfu0.b.a(hftp1);
                    }
                    catch(NumberFormatException numberFormatException0) {
                        ((ggtj)((ggtj)dvuz.a.i()).s(numberFormatException0)).B("Invalid issuerId in ParsedExternalClassID with external class ID: %s", ((Valuable)dvuz0.r.d()).c);
                    }
                    dvuz0.B.i(24, ((Valuable)dvuz0.r.d()).b, gged_interceptors.l(((Valuable)dvuz0.r.d()).b));
                    dvxw dvxw0 = dvuz0.n;
                    Valuable valuable0 = (Valuable)dvuz0.r.d();
                    dvxj dvxj0 = (dvxj)dvxw0;
                    if(!dvxj0.S(valuable0)) {
                        continue;
                    }
                    if(gfta.c(dvxj0.aM)) {
                        dvxi dvxi0 = new dvxi(dvxj0);
                        dvxj0.ao.a(valuable0.b, dvxi0, dvxi0);
                    }
                    else {
                        dvxj0.H(dvxj0.aM);
                    }
                }
                else {
                    ((ggtj)dvuz.a.i()).x("Attempted to share absent valuable.");
                }
            }
        }
    }

    public final void s(ValuableGroup valuableGroup0) {
        gged_interceptors gged0 = valuableGroup0.a;
        this.a.clear();
        super.v(gged0);
    }

    final boolean t(int v) {
        ggqk ggqk0 = ((gged_interceptors)this.u()).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            Pair pair0 = (Pair)object0;
            if(((int)(((Integer)pair0.first))) == v) {
                dvuz dvuz0 = (dvuz)pair0.second;
                if(!dvuz0.r.i()) {
                    ((ggtj)dvuz.a.i()).x("Attempted to generate shareability when valuable is not present.");
                    return false;
                }
                return dvuz0.n.S(((Valuable)dvuz0.r.d()));
            }
        }
        return false;
    }
}

