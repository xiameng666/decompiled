import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import j..util.Objects;

final class aahy implements pcq {
    final AnimatorListenerAdapter a;
    final aaif b;

    public aahy(aaif aaif0, AnimatorListenerAdapter animatorListenerAdapter0) {
        this.a = animatorListenerAdapter0;
        Objects.requireNonNull(aaif0);
        this.b = aaif0;
        super();
    }

    @Override  // pcq
    public final void a(int v) {
    }

    @Override  // pcq
    public final void kh(int v) {
        aaif aaif0 = this.b;
        grwy grwy0 = aaif0.c;
        int v1 = aaif0.y(v);
        int v2 = ((grwz)grwy0.d.get(v1)).f;
        aaot aaot0 = aaif0.a;
        int v3 = aaif0.ak;
        int v4 = aaot0.c;
        if(v4 != v2) {
            aaot0.c = v2;
            aaot0.b.l.k(v3, v3, v4, v2, 8);
            aaot0.b.l.g(v3, v3, v4, aaot0.c);
        }
        if(aaif0.ag.isTouchExplorationEnabled()) {
            if(aabu.r(aaif0.requireContext())) {
                v = aaif0.c.d.size() - 1 - v;
            }
            View view0 = aaif0.ai.getChildAt(v);
            AccessibilityManager accessibilityManager0 = aaif0.ag;
            String s = aaif0.z(v);
            Context context0 = view0 == null || view0.getContext() == null ? null : view0.getContext().getApplicationContext();
            if(context0 != null && !TextUtils.isEmpty(s)) {
                if(accessibilityManager0 == null) {
                    accessibilityManager0 = (AccessibilityManager)context0.getSystemService("accessibility");
                }
                if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
                    AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(0x4000);
                    accessibilityEvent0.getText().add(s);
                    accessibilityEvent0.setEnabled(view0.isEnabled());
                    accessibilityEvent0.setClassName(view0.getClass().getName());
                    accessibilityEvent0.setPackageName("com.google.android.gms");
                    new khf(accessibilityEvent0).a(view0);
                    accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
                }
            }
        }
    }

    @Override  // pcq
    public final void ki(int v, float f) {
        aaif aaif0 = this.b;
        if(!aaif0.al) {
            return;
        }
        aaif0.aj.j(this.a);
        aaif aaif1 = aaif0.d.a;
        int v1 = aaif1.y(v);
        if(aabu.r(aaif1.requireContext())) {
            f = 1.0f - f;
        }
        else if((f > 0.0f)) {
            ++v1;
        }
        else {
            f = 1.0f;
        }
        grus grus0 = ((grwz)aaif1.c.d.get(v1)).d;
        if(grus0 == null) {
            grus0 = grus.a;
        }
        int v2 = grus0.c - grus0.b;
        grus grus1 = ((grwz)aaif1.c.d.get(v1)).d;
        if(grus1 == null) {
            grus1 = grus.a;
        }
        float f1 = aaif1.d.a(grus1.b + ((int)(f * ((float)v2))));
        aaif1.aj.s(f1);
    }
}

