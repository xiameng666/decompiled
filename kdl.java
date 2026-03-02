import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View.AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class kdl {
    public final View.AccessibilityDelegate C;
    private static final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    static {
        kdl.a = new View.AccessibilityDelegate();
    }

    public kdl() {
        this(kdl.a);
    }

    public kdl(View.AccessibilityDelegate view$AccessibilityDelegate0) {
        this.b = view$AccessibilityDelegate0;
        this.C = new kdk(this);
    }

    static List Q(View view0) {
        List list0 = (List)view0.getTag(0x7F0B221C);  // id:tag_accessibility_actions
        return list0 == null ? Collections.EMPTY_LIST : list0;
    }

    public khe a(View view0) {
        AccessibilityNodeProvider accessibilityNodeProvider0 = this.b.getAccessibilityNodeProvider(view0);
        return accessibilityNodeProvider0 == null ? null : new khe(accessibilityNodeProvider0);
    }

    public void b(View view0, AccessibilityEvent accessibilityEvent0) {
        this.b.onInitializeAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void c(View view0, khb khb0) {
        this.b.onInitializeAccessibilityNodeInfo(view0, khb0.a);
    }

    public void d(View view0, AccessibilityEvent accessibilityEvent0) {
        this.b.onPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public void e(View view0, int v) {
        this.b.sendAccessibilityEvent(view0, v);
    }

    public void f(View view0, AccessibilityEvent accessibilityEvent0) {
        this.b.sendAccessibilityEventUnchecked(view0, accessibilityEvent0);
    }

    public boolean g(View view0, AccessibilityEvent accessibilityEvent0) {
        return this.b.dispatchPopulateAccessibilityEvent(view0, accessibilityEvent0);
    }

    public boolean h(ViewGroup viewGroup0, View view0, AccessibilityEvent accessibilityEvent0) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup0, view0, accessibilityEvent0);
    }

    public boolean i(View view0, int v, Bundle bundle0) {
        boolean z;
        ClickableSpan[] arr_clickableSpan;
        List list0 = kdl.Q(view0);
        int v1 = 0;
        while(true) {
            arr_clickableSpan = null;
            if(v1 < list0.size()) {
                kgx kgx0 = (kgx)list0.get(v1);
                if(kgx0.a() != v) {
                    ++v1;
                    continue;
                }
                else if(kgx0.Q != null) {
                    Class class0 = kgx0.P;
                    if(class0 != null) {
                        try {
                            khg khg0 = (khg)class0.getDeclaredConstructor(null).newInstance(null);
                        }
                        catch(Exception exception0) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (kgx0.P == null ? "null" : kgx0.P.getName()), exception0);
                        }
                    }
                    z = kgx0.Q.a(view0);
                    break;
                }
            }
            z = false;
            break;
        }
        if(!z) {
            z = this.b.performAccessibilityAction(view0, v, bundle0);
        }
        if(!z && v == 0x7F0B0A33 && bundle0 != null) {  // id:accessibility_action_clickable_span
            int v2 = bundle0.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray0 = (SparseArray)view0.getTag(0x7F0B221D);  // id:tag_accessibility_clickable_spans
            if(sparseArray0 != null) {
                WeakReference weakReference0 = (WeakReference)sparseArray0.get(v2);
                if(weakReference0 != null) {
                    ClickableSpan clickableSpan0 = (ClickableSpan)weakReference0.get();
                    if(clickableSpan0 != null) {
                        CharSequence charSequence0 = view0.createAccessibilityNodeInfo().getText();
                        if((charSequence0 instanceof Spanned)) {
                            arr_clickableSpan = (ClickableSpan[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), ClickableSpan.class);
                        }
                        for(int v3 = 0; arr_clickableSpan != null && v3 < arr_clickableSpan.length; ++v3) {
                            if(clickableSpan0.equals(arr_clickableSpan[v3])) {
                                clickableSpan0.onClick(view0);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }
}

