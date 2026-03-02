package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.util.weaklisteners.b;

public final class an {
    public boolean a;
    public boolean b;
    private final View c;
    private final Activity d;
    private boolean e;
    private final ViewTreeObserver.OnGlobalLayoutListener f;

    public an(Activity activity0, View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0) {
        this.d = activity0;
        this.c = view0;
        this.f = viewTreeObserver$OnGlobalLayoutListener0;
    }

    public final void a() {
        if(!this.e) {
            Activity activity0 = this.d;
            if(activity0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.f;
                ViewTreeObserver viewTreeObserver0 = an.c(activity0);
                if(viewTreeObserver0 != null) {
                    viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
                }
            }
            b b0 = new b(this.c, this.f);
            ViewTreeObserver viewTreeObserver1 = b0.a();
            if(viewTreeObserver1 != null) {
                viewTreeObserver1.addOnGlobalLayoutListener(b0);
            }
            this.e = true;
        }
    }

    public final void b() {
        Activity activity0 = this.d;
        if(activity0 != null && this.e) {
            ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.f;
            ViewTreeObserver viewTreeObserver0 = an.c(activity0);
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
            this.e = false;
        }
    }

    private static ViewTreeObserver c(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.getDecorView();
            return view0 == null ? null : view0.getViewTreeObserver();
        }
        return null;
    }
}

