import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

public final class fohs implements Runnable {
    public final foil a;
    public final LayoutInflater b;
    public final ViewGroup c;
    public final FrameLayout d;
    public final Bundle e;

    public fohs(foil foil0, LayoutInflater layoutInflater0, ViewGroup viewGroup0, FrameLayout frameLayout0, Bundle bundle0) {
        this.a = foil0;
        this.b = layoutInflater0;
        this.c = viewGroup0;
        this.d = frameLayout0;
        this.e = bundle0;
    }

    @Override
    public final void run() {
        foil foil0 = this.a;
        gftb.r(foil0.an != null, "configuration can\'t be null after initialization.");
        Context context0 = foil0.an.e.f(this.b.getContext());
        if(foil0.getArguments() != null && foil0.getArguments().getBoolean("accountMenuFlavorsStyle", false)) {
            context0 = new ContextThemeWrapper(context0, 0x7F160554);  // style:OneGoogle.AccountMenuFlavors
        }
        if(foil0.getArguments() != null && foil0.getArguments().getBoolean("dialogCenteredStyle", false)) {
            context0 = new ContextThemeWrapper(context0, 0x7F160575);  // style:OneGoogle.DialogCentered
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E0636, this.c, false);  // layout:og_dialog
        this.d.addView(view0);
        ExpandableDialogView expandableDialogView0 = (ExpandableDialogView)view0.findViewById(0x7F0B1AEC);  // id:og_dialog_view
        gftb.check(expandableDialogView0);
        foil0.am = expandableDialogView0;
        foil0.an.a.a(this.d);
        foil0.am.l = foil0.an.f;
        foil0.am.b(foil0.an.d);
        SparseArray sparseArray0 = null;
        Window window0 = foil0.getDialog() == null ? null : foil0.getDialog().getWindow();
        ExpandableDialogView expandableDialogView1 = foil0.am;
        expandableDialogView1.k = window0;
        expandableDialogView1.j = new fohv(foil0);
        foip foip0 = foil0.al;
        if(foip0 != null) {
            foil0.z(foip0, expandableDialogView1);
            return;
        }
        Bundle bundle0 = this.e;
        if(bundle0 != null) {
            sparseArray0 = bundle0.getSparseParcelableArray("viewHierarchyState");
        }
        foil0.ak = sparseArray0;
    }
}

