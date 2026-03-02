package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fyem;
import fyen;
import fyxc;
import jtl;
import kfe;
import kgx;
import kzw;
import kzx;

public class SwipeDismissBehavior extends jtl {
    public kzx a;
    public boolean b;
    public int c;
    public float d;
    public float e;
    public fyxc f;
    private boolean g;
    private final kzw h;

    public SwipeDismissBehavior() {
        this.c = 2;
        this.d = 0.0f;
        this.e = 0.5f;
        this.h = new fyem(this);
    }

    @Override  // jtl
    public boolean f(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        boolean z = this.g;
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                z = coordinatorLayout0.l(view0, ((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                this.g = z;
                break;
            }
            case 1: {
                this.g = false;
                break;
            }
            default: {
                if(v == 3) {
                    this.g = false;
                }
            }
        }
        if(z) {
            if(this.a == null) {
                this.a = kzx.b(coordinatorLayout0, this.h);
            }
            return !this.b && this.a.l(motionEvent0);
        }
        return false;
    }

    @Override  // jtl
    public final boolean g(CoordinatorLayout coordinatorLayout0, View view0, int v) {
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
            kfe.h(view0, 0x100000);
            if(this.s(view0)) {
                fyen fyen0 = new fyen(this);
                kfe.i(view0, kgx.u, null, fyen0);
            }
        }
        return false;
    }

    @Override  // jtl
    public final boolean j(CoordinatorLayout coordinatorLayout0, View view0, MotionEvent motionEvent0) {
        if(this.a != null) {
            if(!this.b || motionEvent0.getActionMasked() != 3) {
                this.a.g(motionEvent0);
            }
            return true;
        }
        return false;
    }

    public boolean s(View view0) {
        return true;
    }

    public static float t(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }
}

