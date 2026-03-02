import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import j..util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class bvxo {
    private static final Map a;
    private WeakReference b;
    public static final bboh c;
    public final hgmq d;
    public final bvwy e;
    public final fhwo f;
    public final bvxp g;
    public final du h;
    public final bwdm i;
    public final bvwa j;

    static {
        bvxo.a = ibpz.i(new ibns[]{new ibns("id/uiflow_header_media_container", ibqg.c(new String[]{"#F0F4F9", "#1E1F20"})), new ibns("id/uiflow_summary_card_expanded_media_container", ibqg.c(new String[]{"#F0F4F9", "#1E1F20"}))});
        bvxo.c = bboh.b("UiFlow", bbcu.ff);
    }

    protected bvxo(hgmq hgmq0, bvwy bvwy0, fhwo fhwo0, bvwa bvwa0, bvxp bvxp0, du du0, bwdm bwdm0) {
        this.d = hgmq0;
        this.e = bvwy0;
        this.f = fhwo0;
        this.j = bvwa0;
        this.g = bvxp0;
        this.h = du0;
        this.i = bwdm0;
    }

    public abstract void a(View arg1, LayoutInflater arg2);

    public final void b(View view0, LayoutInflater layoutInflater0) {
        bvxo bvxo0 = this;
        View view1 = view0;
        LayoutInflater layoutInflater1 = layoutInflater0;
        ibuq.f(layoutInflater1, "inflater");
        if(view1 != null) {
            bwdm bwdm0 = bvxo0.i;
            if(bwdm0.b()) {
                hgmq hgmq0 = bvxo0.d;
                if(bvxm.a(hgmq0)) {
                    String s = (hgmq0.e == 12 ? ((hgnm)hgmq0.f) : hgnm.a).c;
                    ibuq.e(s, "getText(...)");
                    if(s.length() > 0) {
                        String s1 = (hgmq0.e == 12 ? ((hgnm)hgmq0.f) : hgnm.a).d;
                        ibuq.e(s1, "getIconSourceUri(...)");
                        if(s1.length() > 0) {
                            View view2 = view1.findViewById(0x7F0B0BB0);  // id:app_badge_container
                            if(view2 != null) {
                                view2.setVisibility(0);
                            }
                        }
                    }
                    if(bwdz.k(view1)) {
                        View view3 = view1.findViewById(0x7F0B239F);  // id:uiflow_app_name_old
                        if(view3 != null) {
                            view3.setVisibility(0);
                        }
                    }
                }
            }
            String s2 = bwdm0.b() || !bvxm.a(bvxo0.d) ? bvxo0.d.g : "id/uiflow_app_name_old";
            ibuq.c(s2);
            if((bvxo0.b == null ? null : ((View)bvxo0.b.get())) == null) {
                View view4 = bvxo0.e.b(s2, view1);
                if(view4 == null) {
                    view4 = null;
                }
                else {
                    view4.setTag(0x7F0B23D7, bvxo0);  // id:up_element_binder_tag
                }
                bvxo0.b = new WeakReference(view4);
            }
            WeakReference weakReference0 = bvxo0.b;
            if(weakReference0 != null) {
                View view5 = (View)weakReference0.get();
                if(view5 != null) {
                    hgmq hgmq1 = bvxo0.d;
                    if(hgmq1.c == 7 && ((Boolean)hgmq1.d).booleanValue()) {
                        view5.setVisibility(0);
                    }
                    else if(hgmq1.c == 19 && ((Boolean)hgmq1.d).booleanValue()) {
                        view5.setVisibility(8);
                    }
                    if((hgmq1.b & 2) != 0) {
                        hgno hgno0 = hgmq1.i == null ? hgno.a : hgmq1.i;
                        ibuq.e(hgno0, "getVisualElementInfo(...)");
                        bvzg bvzg0 = (bvzg)bvxo0.j.a(bvzg.class);
                        fhvo fhvo0 = bvxo0.f.b.e(hgno0.b);
                        hfta hfta0 = hglp.b;
                        giuw giuw0 = giuv.a(((ProtoLiteMessage)giut.a).v_newBuilder());
                        gjzq gjzq0 = gjzp.a(((ProtoLiteMessage)gjzo.a).v_newBuilder());
                        String s3 = hgno0.c;
                        ibuq.e(s3, "getFeatureName(...)");
                        ibuq.f(s3, "value");
                        ProtoLiteBuilder hftp0 = gjzq0.a;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjzo gjzo0 = (gjzo)hftp0.b_message;
                        s3.getClass();
                        gjzo0.b |= 1;
                        gjzo0.c = s3;
                        String s4 = hgno0.d;
                        ibuq.e(s4, "getCardName(...)");
                        ibuq.f(s4, "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gjzo gjzo1 = (gjzo)hftp0.b_message;
                        s4.getClass();
                        gjzo1.b |= 2;
                        gjzo1.d = s4;
                        gjzq0.b(bvzg0.c);
                        hfuf hfuf0 = hgno0.e;
                        ibuq.e(hfuf0, "getMagicEyeAppsList(...)");
                        if(!hfuf0.isEmpty()) {
                            List list0 = DesugarCollections.unmodifiableList(((gjzo)hftp0.b_message).e);
                            ibuq.e(list0, "getMagicEyeAppsList(...)");
                            new hfxu(list0);
                            hfuf hfuf1 = hgno0.e;
                            ibuq.e(hfuf1, "getMagicEyeAppsList(...)");
                            ibuq.f(hfuf1, "values");
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            gjzo gjzo2 = (gjzo)hftp0.b_message;
                            hfuf hfuf2 = gjzo2.e;
                            if(!hfuf2.c()) {
                                gjzo2.e = ProtoLiteMessage.C(hfuf2);
                            }
                            hfrj.E(hfuf1, gjzo2.e);
                        }
                        giuw0.b(gjzq0.a());
                        fhvo0.d(new fhvp(hfta0, giuw0.a()));
                        fhvo0.c(view5);
                    }
                    bvxo0.a(view5, layoutInflater1);
                    String s5 = hgmq1.l;
                    ibuq.e(s5, "getBackgroundColor(...)");
                    bvxo0.c(view5, s5);
                    if(hgmq1.k) {
                        Context context0 = view5.getContext();
                        ibuq.e(context0, "getContext(...)");
                        if(!bwcp.a(context0)) {
                            view5.setScaleX(-1.0f);
                        }
                    }
                    bvze bvze0 = (bvze)bvxo0.j.a(bvze.class);
                    hfuo hfuo0 = hgmq1.m;
                    ibuq.e(hfuo0, "getDynamicElementModificationsList(...)");
                    for(Object object0: hfuo0) {
                        du du0 = bvxo0.h;
                        hgmn hgmn0 = ((hgmo)object0).d;
                        if(hgmn0 == null) {
                            hgmn0 = hgmn.a;
                        }
                        ibuq.e(hgmn0, "getTrigger(...)");
                        bvxl bvxl0 = new bvxl(((hgmo)object0), view5, bvxo0, view1, layoutInflater1);
                        ibuq.f(hgmn0, "trigger");
                        bvze0.a(hgmn0);
                        lps lps0 = du0.getViewLifecycleOwner();
                        ibuq.e(lps0, "getViewLifecycleOwner(...)");
                        icbb.b(lpt.a(lps0), null, null, new bvzd(lps0, bvze0, hgmn0, du0, bvxl0, null), 3);
                        bvxo0 = this;
                        view1 = view0;
                        view5 = view5;
                        bvze0 = bvze0;
                        layoutInflater1 = layoutInflater0;
                    }
                }
            }
        }
    }

    protected final void c(View view0, String s) {
        ibuq.f(s, "backgroundColorString");
        if(s.length() != 0) {
            hgmq hgmq0 = this.d;
            if(this.i.a()) {
                Set set0 = (Set)bvxo.a.get(hgmq0.g);
                if(set0 == null || !set0.contains(hgmq0.l)) {
                    goto label_6;
                }
            }
            else {
                try {
                label_6:
                    int v = Color.parseColor(s);
                    if((view0 instanceof MaterialCardView)) {
                        ((MaterialCardView)view0).d(v);
                        return;
                    }
                    view0.setBackgroundColor(v);
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
        }
    }

    public final void d(View view0) {
        Integer integer0;
        int v;
        ibuq.f(view0, "view");
        switch(this.d.j) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 0) {
            v = 1;
        }
        switch(v - 2) {
            case 1: {
                integer0 = (int)0;
                break;
            }
            case 2: {
                integer0 = (int)1;
                break;
            }
            case 3: {
                integer0 = (int)2;
                break;
            }
            case 4: {
                integer0 = (int)4;
                break;
            }
            default: {
                integer0 = null;
            }
        }
        if(integer0 != null) {
            view0.setImportantForAccessibility(integer0.intValue());
        }
    }
}

