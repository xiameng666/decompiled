import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

public final class fcat extends gdak {
    final ArrayList a;
    final ArrayList ag;
    private final SparseArray ah;
    private final SparseArray ai;
    private final gamj aj;
    private final gdew ak;
    private String al;
    final ArrayList b;
    final ArrayList c;
    final ArrayList d;

    public fcat() {
        this.a = new ArrayList(2);
        this.ah = new SparseArray(2);
        this.ai = new SparseArray(2);
        this.b = new ArrayList(2);
        this.c = new ArrayList(2);
        this.d = new ArrayList(2);
        this.ag = new ArrayList(2);
        this.aj = new gamj(0x20);
        this.ak = new gdew();
    }

    @Override  // gami
    public final gamj B() {
        return this.aj;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gexr)this.aA).b;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gexr.a).jf(7, null);
    }

    @Override  // gdcm
    public final void M() {
        boolean z = this.ca;
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((fcab)arrayList0.get(v2)).ll(z);
        }
        ArrayList arrayList1 = this.c;
        int v3 = arrayList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            ((gcyd)arrayList1.get(v1)).c().setEnabled(z);
        }
    }

    private final fcab Q(gewu gewu0, ViewGroup viewGroup0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gewu0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gewu0));
        gewg gewg0 = ((gewu)((gews)hftp0).b_message).c;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gewg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gewg0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gewg)hftp1.b_message).h = 1;
        ((gewg)hftp1.b_message).b |= 16;
        if(!((gews)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((gews)hftp0))).ensureMutable();
        }
        gewu gewu1 = (gewu)((gews)hftp0).b_message;
        gewg gewg1 = (gewg)hftp1.N_build();
        gewg1.getClass();
        gewu1.c = gewg1;
        gewu1.b |= 1;
        for(int v = 0; v < ((gewu)((gews)hftp0).b_message).d.size(); ++v) {
            gewt gewt0 = (gewt)((gewu)((gews)hftp0).b_message).d.get(v);
            if(gewt0.b == 2) {
                gewq gewq0 = (gewq)gewt0.c;
                gfjj gfjj0 = gewq0.b == 1 ? ((gfjj)gewq0.c) : gfjj.a;
                if(!Objects.equals(gfjj0, gfjj.a)) {
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gfjj0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)gfjj0));
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    gfjj gfjj1 = (gfjj)hftp2.b_message;
                    gfjj1.b |= 0x20;
                    gfjj1.j = "";
                    gfjj0 = (gfjj)hftp2.N_build();
                }
                ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)gewt0).jf(5, null);
                hftp3.X(((ProtoLiteMessage)gewt0));
                gewq gewq1 = gewt0.b == 2 ? ((gewq)gewt0.c) : gewq.a;
                ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)gewq1).jf(5, null);
                hftp4.X(((ProtoLiteMessage)gewq1));
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                gewq gewq2 = (gewq)hftp4.b_message;
                gfjj0.getClass();
                gewq2.c = gfjj0;
                gewq2.b = 1;
                gewq gewq3 = (gewq)hftp4.N_build();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gewt gewt1 = (gewt)hftp3.b_message;
                gewq3.getClass();
                gewt1.c = gewq3;
                gewt1.b = 2;
                ((gews)hftp0).a(v, hftp3);
            }
        }
        gewu gewu2 = (gewu)((ProtoLiteBuilder)(((gews)hftp0))).N_build();
        fcab fcab0 = (fcab)this.getChildFragmentManager().h((gewu2.c == null ? gewg.a : gewu2.c).c);
        if(fcab0 == null) {
            fcab0 = fcab.I(gewu2, this.bU, this.al, true, this.bZ);
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.u(viewGroup0.getId(), fcab0, (gewu2.c == null ? gewg.a : gewu2.c).c);
            ca0.a();
        }
        fcab0.cb = this.cb;
        this.b.add(fcab0);
        gczs gczs0 = new gczs(fcab0);
        this.ag.add(gczs0);
        return fcab0;
    }

    @Override  // gdak
    public final ArrayList aY() {
        ArrayList arrayList0 = super.aY();
        arrayList0.addAll(this.a);
        ArrayList arrayList1 = this.c;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(((gcyd)arrayList1.get(v1)).c());
        }
        arrayList0.addAll(this.d);
        return arrayList0;
    }

    @Override  // gdak
    public final View lN() {
        View view0 = super.lN();
        if(view0 == null) {
            return this.c.isEmpty() ? null : ((View)this.c.get(0));
        }
        return view0;
    }

    @Override  // gdak
    public final void lW(int v) {
        int v1 = this.aY().size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((View)this.aY().get(v2)).setVisibility(v);
        }
    }

    @Override  // gdaa
    public final boolean la() {
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((fcab)arrayList0.get(v1)).la()) {
                return false;
            }
        }
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.ag;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ak;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.al = this.getArguments().getString("flowAnalyticsId");
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = (ViewGroup)layoutInflater0.inflate(0x7F0E0D2F, viewGroup0, false);  // layout:wallet_fragment_dynamic_list
        for(Object object0: ((gexr)this.aA).c) {
            gexs gexs0 = (gexs)object0;
            ViewGroup viewGroup1 = (ViewGroup)layoutInflater0.inflate(0x7F0E0E2F, ((ViewGroup)view0), false);  // layout:wallet_view_existing_item
            viewGroup1.setId(this.cH().a());
            this.a.add(viewGroup1);
            ((ViewGroup)view0).addView(viewGroup1);
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: gexs0.d) {
                if(((gexu)object1).b != 1) {
                    throw new IllegalArgumentException("Received empty SubItem in DynamicList.");
                }
                arrayList0.add(this.Q(((gewu)((gexu)object1).c), viewGroup1));
                continue;
            }
            int v = viewGroup1.getId();
            this.ai.put(v, arrayList0);
            if((1 & gexs0.b) != 0) {
                fcab fcab0 = this.Q((gexs0.c == null ? gewu.a : gexs0.c), viewGroup1);
                int v1 = viewGroup1.getId();
                this.ah.put(v1, fcab0);
            }
            View view1 = layoutInflater0.inflate(0x7F0E0E66, ((ViewGroup)view0), false);  // layout:wallet_view_separator
            this.d.add(view1);
            ((ViewGroup)view0).addView(view1);
        }
        for(Object object2: ((gexr)this.aA).d) {
            gext gext0 = (gext)object2;
            if(!gext0.c.isEmpty()) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gevs.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((gevs)hftv0).j = 7;
                ((gevs)hftv0).b |= 0x80;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((gevs)hftv1).b |= 2;
                ((gevs)hftv1).d = false;
                if((gext0.b & 1) != 0) {
                    String s = gext0.c;
                    if(!hftv1.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gevs gevs0 = (gevs)hftp0.b_message;
                    s.getClass();
                    gevs0.b |= 8;
                    gevs0.f = s;
                }
                gevs gevs1 = (gevs)hftp0.N_build();
                gcyd gcyd0 = (gcyd)layoutInflater0.inflate(0x7F0E0C52, ((ViewGroup)view0), false);  // layout:view_link_button
                gcyd0.d().setTextColor(gdcb.l(this.bV));
                gcyd0.i(gevs1);
                int v2 = (int)this.getResources().getDimension(0x7F07148C);  // dimen:wallet_dynamic_list_item_margin_top_bottom
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)gcyd0.c().getLayoutParams();
                viewGroup$MarginLayoutParams0.topMargin = v2;
                viewGroup$MarginLayoutParams0.bottomMargin = v2;
                gcyd0.c().setLayoutParams(viewGroup$MarginLayoutParams0);
                this.c.add(gcyd0);
                ((ViewGroup)view0).addView(gcyd0.c());
                View view2 = layoutInflater0.inflate(0x7F0E0E66, ((ViewGroup)view0), false);  // layout:wallet_view_separator
                this.d.add(view2);
                ((ViewGroup)view0).addView(view2);
            }
        }
        this.ak.n();
        return view0;
    }
}

