import android.text.TextUtils;
import android.util.Log;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class kfe {
    public static final int a;
    private static WeakHashMap b;
    private static final int[] c;
    private static final kev d;

    static {
        kfe.c = new int[]{0x7F0B0A34, 0x7F0B0A35, 0x7F0B0A40, 0x7F0B0A4B, 0x7F0B0A4E, 0x7F0B0A4F, 0x7F0B0A50, 0x7F0B0A51, 0x7F0B0A52, 0x7F0B0A53, 0x7F0B0A36, 0x7F0B0A37, 0x7F0B0A38, 0x7F0B0A39, 0x7F0B0A3A, 0x7F0B0A3B, 0x7F0B0A3C, 0x7F0B0A3D, 0x7F0B0A3E, 0x7F0B0A3F, 0x7F0B0A41, 0x7F0B0A42, 0x7F0B0A43, 0x7F0B0A44, 0x7F0B0A45, 0x7F0B0A46, 0x7F0B0A47, 0x7F0B0A48, 0x7F0B0A49, 0x7F0B0A4A, 0x7F0B0A4C, 0x7F0B0A4D};  // id:accessibility_custom_action_0
        kfe.d = new kev();
    }

    public static int a(View view0, CharSequence charSequence0, kho kho0) {
        int v1;
        List list0 = kfe.o(view0);
        for(int v = 0; true; ++v) {
            if(v >= list0.size()) {
                int v3 = -1;
                for(int v2 = 0; v2 < 0x20 && v3 == -1; ++v2) {
                    v3 = kfe.c[v2];
                    int v5 = 1;
                    for(int v4 = 0; v4 < list0.size(); ++v4) {
                        v5 &= (((kgx)list0.get(v4)).a() == v3 ? 0 : 1);
                    }
                    if(1 != v5) {
                        v3 = -1;
                    }
                }
                v1 = v3;
                break;
            }
            if(TextUtils.equals(charSequence0, ((kgx)list0.get(v)).b())) {
                v1 = ((kgx)list0.get(v)).a();
                break;
            }
        }
        if(v1 != -1) {
            kfe.p(view0, new kgx(null, v1, charSequence0, kho0, null));
        }
        return v1;
    }

    public static kdl b(View view0) {
        View.AccessibilityDelegate view$AccessibilityDelegate0 = kfc.a(view0);
        if(view$AccessibilityDelegate0 == null) {
            return null;
        }
        return (view$AccessibilityDelegate0 instanceof kdk) ? ((kdk)view$AccessibilityDelegate0).a : new kdl(view$AccessibilityDelegate0);
    }

    @Deprecated
    public static kfs c(View view0) {
        if(kfe.b == null) {
            kfe.b = new WeakHashMap();
        }
        kfs kfs0 = (kfs)kfe.b.get(view0);
        if(kfs0 == null) {
            kfs0 = new kfs(view0);
            kfe.b.put(view0, kfs0);
        }
        return kfs0;
    }

    public static kgq d(View view0, kgq kgq0) {
        WindowInsets windowInsets0 = kgq0.e();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = kfd.a(view0, windowInsets0);
            return windowInsets1.equals(windowInsets0) ? kgq0 : kgq.s(windowInsets1, view0);
        }
        return kgq0;
    }

    public static kgq e(View view0, kgq kgq0) {
        WindowInsets windowInsets0 = kgq0.e();
        if(windowInsets0 != null) {
            WindowInsets windowInsets1 = view0.onApplyWindowInsets(windowInsets0);
            return windowInsets1.equals(windowInsets0) ? kgq0 : kgq.s(windowInsets1, view0);
        }
        return kgq0;
    }

    public static void f(ViewGroup viewGroup0, View view0) {
        viewGroup0.getOverlay().add(view0);
        View view1 = (View)view0.getParent();
        ibuq.f(view1, "<this>");
        view1.setTag(0x7F0B2461, viewGroup0);  // id:view_tree_disjoint_parent
    }

    public static void g(View view0) {
        kdl kdl0 = kfe.b(view0);
        if(kdl0 == null) {
            kdl0 = new kdl();
        }
        kfe.j(view0, kdl0);
    }

    public static void h(View view0, int v) {
        kfe.q(v, view0);
        kfe.n(view0);
    }

    public static void i(View view0, kgx kgx0, CharSequence charSequence0, kho kho0) {
        if(kho0 == null && charSequence0 == null) {
            kfe.h(view0, kgx0.a());
            return;
        }
        kfe.p(view0, new kgx(null, kgx0.O, charSequence0, kho0, kgx0.P));
    }

    public static void j(View view0, kdl kdl0) {
        if(kdl0 == null && (kfc.a(view0) instanceof kdk)) {
            kdl0 = new kdl();
        }
        kfe.r(view0);
        view0.setAccessibilityDelegate((kdl0 == null ? null : kdl0.C));
    }

    public static void k(View view0, boolean z) {
        Boolean.valueOf(z).getClass();
        kfb.c(view0, z);
    }

    public static void l(View view0, CharSequence charSequence0) {
        kfb.d(view0, charSequence0);
        if(charSequence0 != null) {
            kev kev0 = kfe.d;
            boolean z = view0.isShown() && view0.getWindowVisibility() == 0;
            kev0.a.put(view0, Boolean.valueOf(z));
            view0.addOnAttachStateChangeListener(kev0);
            if(view0.isAttachedToWindow()) {
                kev0.a(view0);
            }
            return;
        }
        kfe.d.a.remove(view0);
        view0.removeOnAttachStateChangeListener(kfe.d);
        view0.getViewTreeObserver().removeOnGlobalLayoutListener(kfe.d);
    }

    @Deprecated
    public static void m(View view0) {
        view0.setAccessibilityLiveRegion(1);
    }

    static void n(View view0) {
        if(((AccessibilityManager)view0.getContext().getSystemService("accessibility")).isEnabled()) {
            int v = kfb.a(view0) == null || !view0.isShown() || view0.getWindowVisibility() != 0 ? 0 : 1;
            if(view0.getAccessibilityLiveRegion() != 0 || v != 0) {
                goto label_10;
            }
            if(view0.getParent() != null) {
                ViewParent viewParent0 = view0.getParent();
                try {
                    viewParent0.notifySubtreeAccessibilityStateChanged(view0, view0, 0);
                }
                catch(AbstractMethodError abstractMethodError0) {
                    Log.e("ViewCompat", view0.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", abstractMethodError0);
                }
                return;
            label_10:
                AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain();
                accessibilityEvent0.setEventType((1 == v ? 0x20 : 0x800));
                accessibilityEvent0.setContentChangeTypes(0);
                if(v != 0) {
                    accessibilityEvent0.getText().add(kfb.a(view0));
                    kfe.r(view0);
                }
                view0.sendAccessibilityEventUnchecked(accessibilityEvent0);
            }
        }
    }

    private static List o(View view0) {
        List list0 = (ArrayList)view0.getTag(0x7F0B221C);  // id:tag_accessibility_actions
        if(list0 == null) {
            list0 = new ArrayList();
            view0.setTag(0x7F0B221C, list0);  // id:tag_accessibility_actions
        }
        return list0;
    }

    private static void p(View view0, kgx kgx0) {
        kfe.g(view0);
        kfe.q(kgx0.a(), view0);
        kfe.o(view0).add(kgx0);
        kfe.n(view0);
    }

    private static void q(int v, View view0) {
        List list0 = kfe.o(view0);
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            if(((kgx)list0.get(v1)).a() == v) {
                list0.remove(v1);
                return;
            }
        }
    }

    private static void r(View view0) {
        if(view0.getImportantForAccessibility() == 0) {
            view0.setImportantForAccessibility(1);
        }
    }
}

