import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bvxi extends bvxo {
    private static final bboh a;
    private final bwdi b;

    static {
        bvxi.a = bboh.b("UiFlow", bbcu.ff);
    }

    public bvxi(hgmq hgmq0, fhwo fhwo0, bvwy bvwy0, bvxp bvxp0, bvwa bvwa0, du du0, bwdi bwdi0, bwdm bwdm0) {
        super(hgmq0, bvwy0, fhwo0, bvwa0, bvxp0, du0, bwdm0);
        this.b = bwdi0;
    }

    @Override  // bvxo
    public final void a(View view0, LayoutInflater layoutInflater0) {
        String s;
        ibuq.f(layoutInflater0, "inflater");
        hgmq hgmq0 = this.d;
        hgmk hgmk0 = hgmq0.e == 10 ? ((hgmk)hgmq0.f) : hgmk.a;
        ibuq.e(hgmk0, "getContainer(...)");
        bwdm bwdm0 = this.i;
        if(bwdm0.g() && ibuq.m(hgmk0.c, "layout/uiflow_bottom_pager")) {
            s = "layout/uiflow_bottom_pager_bc25";
        }
        else if(bwdm0.h() && ibuq.m(hgmk0.c, "layout/uiflow_summary_screen")) {
            s = "layout/uiflow_summary_screen_bc25";
        }
        else if(bwdm0.h() && ibuq.m(hgmk0.c, "layout/uiflow_summary_card_expandable_v2")) {
            s = "layout/uiflow_summary_card_expandable_v2_bc25";
        }
        else if(bwdm0.h() && ibuq.m(hgmk0.c, "layout/uiflow_google_settings_link")) {
            s = "layout/uiflow_google_settings_link_bc25";
        }
        else if(bwdm0.d() && ibuq.m(hgmk0.c, "layout/uiflow_feature_card")) {
            s = "layout/uiflow_feature_card_bc25";
        }
        else if(bwdm0.d() && ibuq.m(hgmk0.c, "layout/uiflow_instructions")) {
            s = "layout/uiflow_instructions_bc25";
        }
        else if(bwdm0.f() && ibuq.m(hgmk0.c, "layout/uiflow_intro_screen")) {
            s = "layout/uiflow_intro_screen_bc25";
        }
        else if(bwdm0.f() && ibuq.m(hgmk0.c, "layout/uiflow_intro_ctas")) {
            s = "layout/uiflow_intro_ctas_bc25";
        }
        else if(bwdm0.a() && ibuq.m(hgmk0.c, "layout/uiflow_done_button")) {
            s = "layout/uiflow_done_button_bc25";
        }
        else {
            s = hgmk0.c;
            ibuq.e(s, "getLayoutId(...)");
        }
        ibuq.f(s, "name");
        Integer integer0 = bvwy.d(this.e, s, "layout");
        if(integer0 != null && (view0 instanceof ViewGroup)) {
            View view1 = layoutInflater0.inflate(integer0.intValue(), ((ViewGroup)view0), false);
            ViewGroup viewGroup0 = (view1 instanceof ViewGroup) ? ((ViewGroup)view1) : null;
            if(viewGroup0 == null) {
                ((ggtj)bvxi.a.j()).x("Failed binding ContainerElement - missing containerView");
                return;
            }
            ((ViewGroup)view0).addView(viewGroup0);
            String s1 = hgmk0.f;
            ibuq.e(s1, "getBackgroundColor(...)");
            this.c(viewGroup0, s1);
            String s2 = hgmq0.h;
            ibuq.e(s2, "getContentDescription(...)");
            if(s2.length() > 0) {
                viewGroup0.setContentDescription(hgmq0.h);
            }
            this.d(viewGroup0);
            if((viewGroup0 instanceof bwcd)) {
                ((bwcd)viewGroup0).g(bwdm0);
            }
            hfuo hfuo0 = hgmk0.d;
            ibuq.e(hfuo0, "getChildrenList(...)");
            for(Object object0: hfuo0) {
                ibuq.c(((hgmq)object0));
                bvxo bvxo0 = this.g.a(((hgmq)object0));
                if(bvxo0 == null) {
                    ((ggtj)bvxi.a.j()).x("Failed binding ContainerElement child - missing binder");
                }
                else {
                    bvxo0.b(viewGroup0, layoutInflater0);
                }
            }
            if((hgmk0.b & 1) != 0) {
                ibuq.f(hgmk0, "containerElement");
                hgme hgme0 = hgmk0.e == null ? hgme.a : hgmk0.e;
                ibuq.e(hgme0, "getOnScrollAction(...)");
                bwdb bwdb0 = this.b.a(hgme0, viewGroup0);
                if(bwdb0 != null) {
                    viewGroup0.addOnAttachStateChangeListener(new bwdf(bwdb0, viewGroup0, new bwdg(bwdb0)));
                }
            }
            ibxl ibxl0 = new ibxl(new ibxm(bwdz.d(viewGroup0), true, bvxh.a));
            while(ibxl0.hasNext()) {
                Object object1 = ibxl0.next();
                ((bwcd)object1).g(bwdm0);
            }
            return;
        }
        ((ggtj)bvxi.a.j()).x("Failed binding ContainerElement - missing parameters");
    }
}

