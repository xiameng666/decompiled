import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;

final class kzp extends khe {
    final kzq a;

    public kzp(kzq kzq0) {
        this.a = kzq0;
        super();
    }

    @Override  // khe
    public final khb a(int v) {
        return khb.f(this.a.k(v));
    }

    @Override  // khe
    public final khb b(int v) {
        int v1 = v == 2 ? this.a.c : this.a.d;
        return v1 == 0x80000000 ? null : this.a(v1);
    }

    @Override  // khe
    public final boolean d(int v, int v1, Bundle bundle0) {
        kzq kzq0 = this.a;
        if(v != -1) {
            switch(v1) {
                case 1: {
                    return kzq0.w(v);
                }
                case 2: {
                    return kzq0.s(v);
                }
                case 0x40: {
                    AccessibilityManager accessibilityManager0 = kzq0.a;
                    if(accessibilityManager0.isEnabled()) {
                        if(!accessibilityManager0.isTouchExplorationEnabled()) {
                            return false;
                        }
                        int v2 = kzq0.c;
                        if(v2 != v) {
                            if(v2 != 0x80000000) {
                                kzq0.r(v2);
                            }
                            kzq0.c = v;
                            kzq0.b.invalidate();
                            kzq0.x(v, 0x8000);
                            return true;
                        }
                    }
                    return false;
                }
                case 0x80: {
                    return kzq0.r(v);
                }
                default: {
                    return kzq0.v(v, v1, bundle0);
                }
            }
        }
        return kzq0.b.performAccessibilityAction(v1, bundle0);
    }
}

