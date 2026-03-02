import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.List;

public final class fuqz implements fura {
    private static final ggeo a;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(kgx.g, "accessibility_focus");
        hashMap0.put(kgx.h, "clear_accessibility_focus");
        hashMap0.put(kgx.b, "clear_focus");
        hashMap0.put(kgx.d, "clear_selection");
        hashMap0.put(kgx.e, "click");
        hashMap0.put(kgx.t, "collapse");
        hashMap0.put(kgx.G, "context_click");
        hashMap0.put(kgx.o, "copy");
        hashMap0.put(kgx.q, "cut");
        hashMap0.put(kgx.u, "dismiss");
        hashMap0.put(kgx.s, "expand");
        hashMap0.put(kgx.a, "focus");
        hashMap0.put(kgx.K, "hide_tooltip");
        hashMap0.put(kgx.f, "long_click");
        hashMap0.put(kgx.I, "move_window");
        hashMap0.put(kgx.i, "next_at_movement_granularity");
        hashMap0.put(kgx.k, "next_html_element");
        hashMap0.put(kgx.D, "page_down");
        hashMap0.put(kgx.E, "page_left");
        hashMap0.put(kgx.F, "page_right");
        hashMap0.put(kgx.C, "page_up");
        hashMap0.put(kgx.p, "paste");
        hashMap0.put(kgx.L, "press_and_hold");
        hashMap0.put(kgx.j, "previous_at_movement_granularity");
        hashMap0.put(kgx.l, "previous_html_element");
        hashMap0.put(kgx.n, "scroll_backward");
        hashMap0.put(kgx.A, "scroll_down");
        hashMap0.put(kgx.m, "scroll_forward");
        hashMap0.put(kgx.z, "scroll_left");
        hashMap0.put(kgx.B, "scroll_right");
        hashMap0.put(kgx.x, "scroll_to_position");
        hashMap0.put(kgx.y, "scroll_up");
        hashMap0.put(kgx.c, "select");
        hashMap0.put(kgx.H, "set_progress");
        hashMap0.put(kgx.r, "set_selection");
        hashMap0.put(kgx.v, "set_text");
        hashMap0.put(kgx.w, "show_on_screen");
        hashMap0.put(kgx.J, "show_tooltip");
        fuqz.a = ggeo.k(hashMap0);
    }

    @Override  // fura
    public final void a(fusj fusj0, View view0) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = view0.createAccessibilityNodeInfo();
        if(accessibilityNodeInfo0 != null) {
            khb khb0 = new khb(accessibilityNodeInfo0);
            fusj0.c("accessibility_clickable", khb0.ah());
            fusj0.c("checkable", khb0.ag());
            fusj0.c("scrollable", khb0.an());
            fusj0.c("password", khb0.am());
            fusj0.c("long_clickable", khb0.al());
            AccessibilityNodeInfo accessibilityNodeInfo1 = khb0.a;
            fusj0.c("accessibility_screenReaderFocusable", accessibilityNodeInfo1.isScreenReaderFocusable());
            CharSequence charSequence0 = khb0.g();
            if(charSequence0 == null) {
                charSequence0 = "<null>";
            }
            fusj0.b("accessibility_className", charSequence0);
            AccessibilityNodeInfo.CollectionInfo accessibilityNodeInfo$CollectionInfo0 = accessibilityNodeInfo1.getCollectionInfo();
            kgz kgz0 = null;
            kgy kgy0 = accessibilityNodeInfo$CollectionInfo0 == null ? null : new kgy(accessibilityNodeInfo$CollectionInfo0);
            if(kgy0 != null) {
                fusj0.e("accessibility_collectionInfo_rowCount", ((AccessibilityNodeInfo.CollectionInfo)kgy0.a).getRowCount());
                fusj0.e("accessibility_collectionInfo_columnCount", ((AccessibilityNodeInfo.CollectionInfo)kgy0.a).getColumnCount());
                fusj0.e("accessibility_collectionInfo_selectionMode", ((AccessibilityNodeInfo.CollectionInfo)kgy0.a).getSelectionMode());
            }
            AccessibilityNodeInfo.CollectionItemInfo accessibilityNodeInfo$CollectionItemInfo0 = accessibilityNodeInfo1.getCollectionItemInfo();
            if(accessibilityNodeInfo$CollectionItemInfo0 != null) {
                kgz0 = new kgz(accessibilityNodeInfo$CollectionItemInfo0);
            }
            if(kgz0 != null) {
                fusj0.e("accessibility_collectionItemInfo_rowIndex", ((AccessibilityNodeInfo.CollectionItemInfo)kgz0.a).getRowIndex());
                fusj0.e("accessibility_collectionItemInfo_rowSpan", ((AccessibilityNodeInfo.CollectionItemInfo)kgz0.a).getRowSpan());
                fusj0.e("accessibility_collectionItemInfo_columnIndex", ((AccessibilityNodeInfo.CollectionItemInfo)kgz0.a).getColumnIndex());
                fusj0.e("accessibility_collectionItemInfo_columnSpan", ((AccessibilityNodeInfo.CollectionItemInfo)kgz0.a).getColumnSpan());
            }
            Resources resources0 = view0.getResources();
            List list0 = khb0.l();
            int v = 0;
            while(v < list0.size()) {
                kgx kgx0 = (kgx)list0.get(v);
                ++v;
                int v1 = kgx0.a() & 0xFF000000;
                String s = (String)fuqz.a.get(kgx0);
                int v2 = v1 == 0 ? 0 : 1;
                if(s == null && v2 != 0) {
                    s = fusc.a(resources0, kgx0.a());
                }
                if(s == null) {
                    s = String.format("%s (%d)", (1 == v2 ? "custom" : "unknown"), kgx0.a());
                }
                CharSequence charSequence1 = kgx0.b();
                if(charSequence1 != null) {
                    s = String.format("%s: `%s`", s, charSequence1);
                }
                fusj0.b("accessibility_action_" + v, s);
            }
        }
    }
}

