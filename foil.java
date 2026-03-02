import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Property;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

public final class foil extends kd implements fnwq {
    public static final Property ag;
    public static final Property ah;
    public fohq ai;
    public boolean aj;
    public SparseArray ak;
    public foip al;
    public ExpandableDialogView am;
    public foig an;
    public final fnwr ao;
    public fnuu ap;
    private boolean aq;
    private foik ar;
    private final aaw as;

    static {
        foil.ag = new fohz(Float.class);
        foil.ah = new foia(Integer.class);
    }

    public foil() {
        this.ao = new fnwr(this);
        this.as = new fohw(this);
    }

    public final void A() {
        if(this.isAdded()) {
            if(this.isStateSaved()) {
                super.dismissAllowingStateLoss();
            }
            else {
                super.dismiss();
            }
            foig foig0 = this.an;
            if(foig0 != null) {
                foig0.b.a();
            }
        }
    }

    public final void B() {
        foig foig0 = this.an;
        if(foig0 != null) {
            ExpandableDialogView expandableDialogView0 = this.am;
            if(expandableDialogView0 != null) {
                View view0 = expandableDialogView0.h;
                if(view0 != null) {
                    fhvt fhvt0 = new fhvt(gltz.e);
                    foig0.d.f(fhvt0, view0);
                }
            }
        }
        this.dismiss();
    }

    public final void C(foik foik0) {
        this.ar = foik0;
        if(this.aq && foik0 != null) {
            ExpandableDialogView expandableDialogView0 = this.am;
            if(expandableDialogView0 != null) {
                foik0.a(expandableDialogView0);
            }
        }
    }

    private static void D(ViewGroup viewGroup0, foih foih0) {
        viewGroup0.removeAllViews();
        viewGroup0.addView(foih0.a(LayoutInflater.from(viewGroup0.getContext()), viewGroup0));
    }

    @Override  // de
    public final void dismiss() {
        if(this.getDialog() != null && this.getDialog().getWindow() != null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.getDialog().getWindow().getDecorView(), foil.ag, new float[]{1.0f, 0.0f});
            objectAnimator0.setDuration(83L);
            objectAnimator0.setInterpolator(new LinearInterpolator());
            objectAnimator0.addListener(new fohy(this));
            objectAnimator0.start();
            return;
        }
        this.A();
    }

    @Override  // du
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        ExpandableDialogView expandableDialogView0 = this.am;
        if(expandableDialogView0 != null) {
            expandableDialogView0.onConfigurationChanged(configuration0);
        }
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(2, 0x7F16055C);  // style:OneGoogle.Dialog
    }

    @Override  // kd
    public final Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        ((aas)dialog0).getOnBackPressedDispatcher().c(this, this.as);
        return dialog0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = new FrameLayout(layoutInflater0.getContext());
        fohs fohs0 = new fohs(this, layoutInflater0, viewGroup0, ((FrameLayout)view0), bundle0);
        this.ao.c(fohs0);
        return view0;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        this.ap = null;
        this.al = null;
        this.an = null;
        this.ar = null;
    }

    @Override  // de
    public final void onDestroyView() {
        super.onDestroyView();
        fohq fohq0 = this.ai;
        if(fohq0 != null) {
            fohq0.d.getViewTreeObserver().removeOnScrollChangedListener(fohq0.b);
            fohq0.d.getViewTreeObserver().removeOnGlobalLayoutListener(fohq0.c);
            this.ai = null;
        }
        foig foig0 = this.an;
        if(foig0 != null) {
            foig0.c.a();
        }
        this.am = null;
        this.aq = false;
    }

    @Override  // de
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        if(this.am != null) {
            SparseArray sparseArray0 = new SparseArray();
            this.ak = sparseArray0;
            this.am.saveHierarchyState(sparseArray0);
            bundle0.putSparseParcelableArray("viewHierarchyState", this.ak);
        }
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        this.aj = true;
        fnuu fnuu0 = this.ap;
        if(fnuu0 != null) {
            fnuu0.a();
        }
    }

    @Override  // de
    public final void onStop() {
        super.onStop();
        this.aj = false;
        fnuu fnuu0 = this.ap;
        if(fnuu0 != null) {
            fnuu0.b();
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        fnxo.a(view0);
        foht foht0 = new foht(this, view0, bundle0);
        this.ao.c(foht0);
    }

    @Override  // fnwq
    public final boolean y() {
        return this.an != null;
    }

    public final void z(foip foip0, View view0) {
        frbi.c();
        this.aq = true;
        foil.D(((ViewGroup)view0.findViewById(0x7F0B1AE0)), foip0.c);  // id:og_container_footer
        foil.D(((ViewGroup)view0.findViewById(0x7F0B1AF1)), foip0.a);  // id:og_header_container
        foil.D(((ViewGroup)view0.findViewById(0x7F0B1ADE)), foip0.b);  // id:og_container_content_view
        kfe.l(view0.findViewById(0x7F0B1AF0), view0.getResources().getString(foip0.d));  // id:og_header_close_button
        view0.setVisibility(0);
        foik foik0 = this.ar;
        if(foik0 != null) {
            foik0.a(view0);
        }
    }
}

