import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import com.google.android.gms.growth.uiflow.ui.widget.WebViewWrapper;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public final class bvzq extends fyfx implements HasAndroidInjector {
    public DispatchingAndroidInjector ag;
    public bwdm ah;
    public bvpc ai;

    @Override  // dagger.android.HasAndroidInjector
    public final AndroidInjector androidInjector() {
        return this.y();
    }

    @Override  // de
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        bvvv.a(this);
        super.onAttach(context0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        this.y().inject(this);
        View view0 = layoutInflater0.inflate(0x7F0E0513, viewGroup0, false);  // layout:learn_more_sheet_content
        WebViewWrapper webViewWrapper0 = (WebViewWrapper)view0.findViewById(0x7F0B24F3);  // id:webview_wrapper
        bwdm bwdm0 = this.ah;
        bvpc bvpc0 = null;
        if(bwdm0 == null) {
            ibuq.j("flags");
            bwdm0 = null;
        }
        webViewWrapper0.g(bwdm0);
        bvpc bvpc1 = this.ai;
        if(bvpc1 == null) {
            ibuq.j("clientStreamz");
        }
        else {
            bvpc0 = bvpc1;
        }
        ibuq.f(bvpc0, "<set-?>");
        webViewWrapper0.b = bvpc0;
        if(bundle0 == null) {
            Bundle bundle1 = this.getArguments();
            if(bundle1 != null) {
                String s = bundle1.getString("url");
                if(s != null) {
                    webViewWrapper0.a(new bwaz(s));
                }
            }
        }
        ibuq.e(view0, "apply(...)");
        return view0;
    }

    @Override  // de
    public final void onStart() {
        super.onStart();
        ViewParent viewParent0 = this.requireView().getParent();
        ibuq.d(viewParent0, "null cannot be cast to non-null type android.view.View");
        ((Button)((View)viewParent0).findViewById(0x7F0B0F1D)).setOnClickListener(new bvzo(this));  // id:close_button
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            kfv.a(window0, false);
            View view0 = dialog0.findViewById(0x7F0B0FCE);  // id:container
            if(view0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            view0.setFitsSystemWindows(false);
            kex.b(view0, new bwcg(view0));
            view0.addOnAttachStateChangeListener(new bwch());
            View view1 = dialog0.findViewById(0x7F0B1009);  // id:coordinator
            if(view1 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            view1.setFitsSystemWindows(false);
        }
        BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.v(((View)viewParent0));
        bottomSheetBehavior0.F(false);
        bottomSheetBehavior0.G(0.65f);
        bottomSheetBehavior0.E(0x94);
        bottomSheetBehavior0.y = true;
        bottomSheetBehavior0.K(6);
    }

    public final DispatchingAndroidInjector y() {
        DispatchingAndroidInjector dispatchingAndroidInjector0 = this.ag;
        if(dispatchingAndroidInjector0 != null) {
            return dispatchingAndroidInjector0;
        }
        ibuq.j("androidInjector");
        return null;
    }
}

