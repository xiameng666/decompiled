package com.google.android.material.bottomappbar;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import fycu;
import fyer;
import fyew;
import fyex;
import fykw;
import fylc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import jto;

public class BottomAppBar.Behavior extends HideBottomViewOnScrollBehavior {
    public final Rect g;
    public WeakReference h;
    public int i;
    private final View.OnLayoutChangeListener j;

    public BottomAppBar.Behavior() {
        this.j = new fyex(this);
        this.g = new Rect();
    }

    public BottomAppBar.Behavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.j = new fyex(this);
        this.g = new Rect();
    }

    @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
    public final boolean g(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        this.h = new WeakReference(((BottomAppBar)view0));
        View view1 = ((BottomAppBar)view0).R();
        if(view1 != null && !view1.isLaidOut()) {
            jto jto0 = (jto)view1.getLayoutParams();
            jto0.d = 17;
            int v1 = ((BottomAppBar)view0).B;
            if(v1 == 1) {
                jto0.d = 49;
            }
            else if(v1 == 0) {
                jto0.d = 81;
            }
            this.i = ((jto)view1.getLayoutParams()).bottomMargin;
            if((view1 instanceof FloatingActionButton)) {
                if(((BottomAppBar)view0).B == 0 && ((BottomAppBar)view0).D) {
                    ((FloatingActionButton)view1).setElevation(0.0f);
                    ((FloatingActionButton)view1).c().h(0.0f);
                }
                if(((FloatingActionButton)view1).c().w == null) {
                    ((FloatingActionButton)view1).c().w = fycu.c(((FloatingActionButton)view1).getContext(), 0x7F020033);  // animator:mtrl_fab_show_motion_spec
                }
                if(((FloatingActionButton)view1).c().x == null) {
                    ((FloatingActionButton)view1).c().x = fycu.c(((FloatingActionButton)view1).getContext(), 0x7F020032);  // animator:mtrl_fab_hide_motion_spec
                }
                AnimatorListenerAdapter animatorListenerAdapter0 = ((BottomAppBar)view0).N;
                fylc fylc0 = ((FloatingActionButton)view1).c();
                if(fylc0.C == null) {
                    fylc0.C = new ArrayList();
                }
                fylc0.C.add(animatorListenerAdapter0);
                fyew fyew0 = new fyew(((BottomAppBar)view0));
                fylc fylc1 = ((FloatingActionButton)view1).c();
                if(fylc1.B == null) {
                    fylc1.B = new ArrayList();
                }
                fylc1.B.add(fyew0);
                fyer fyer0 = ((BottomAppBar)view0).O;
                fylc fylc2 = ((FloatingActionButton)view1).c();
                fykw fykw0 = new fykw(((FloatingActionButton)view1), fyer0);
                if(fylc2.D == null) {
                    fylc2.D = new ArrayList();
                }
                fylc2.D.add(fykw0);
            }
            view1.addOnLayoutChangeListener(this.j);
            ((BottomAppBar)view0).X();
        }
        coordinatorLayout0.k(((BottomAppBar)view0), v);
        super.g(coordinatorLayout0, ((BottomAppBar)view0), v);
        return false;
    }

    @Override  // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
    public final boolean i(CoordinatorLayout coordinatorLayout0, View view0, View view1, View view2, int v, int v1) {
        return ((BottomAppBar)view0).E && super.i(coordinatorLayout0, ((BottomAppBar)view0), view1, view2, v, v1);
    }
}

