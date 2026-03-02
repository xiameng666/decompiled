import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo.RangeInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public final class khb {
    public final AccessibilityNodeInfo a;
    public int b;
    public int c;

    public khb(AccessibilityNodeInfo accessibilityNodeInfo0) {
        this.b = -1;
        this.c = -1;
        this.a = accessibilityNodeInfo0;
    }

    public final void A(Object object0) {
        this.a.setCollectionInfo(((AccessibilityNodeInfo.CollectionInfo)(object0 == null ? null : ((kgy)object0).a)));
    }

    public final void B(Object object0) {
        this.a.setCollectionItemInfo(((AccessibilityNodeInfo.CollectionItemInfo)((kgz)object0).a));
    }

    public final void C(CharSequence charSequence0) {
        this.a.setContentDescription(charSequence0);
    }

    public final void D(boolean z) {
        this.a.setDismissable(z);
    }

    public final void E(boolean z) {
        this.a.setEnabled(z);
    }

    public final void F(CharSequence charSequence0) {
        this.a.setError(charSequence0);
    }

    public final void G(boolean z) {
        this.a.setFocusable(z);
    }

    public final void H(boolean z) {
        this.a.setFocused(z);
    }

    public final void I(boolean z) {
        this.a.setHeading(z);
    }

    public final void J(CharSequence charSequence0) {
        this.a.setHintText(charSequence0);
    }

    public final void K(boolean z) {
        this.a.setImportantForAccessibility(z);
    }

    public final void L(View view0) {
        this.a.setLabelFor(view0);
    }

    public final void M(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void N(int v) {
        this.a.setMaxTextLength(v);
    }

    public final void O(int v) {
        this.a.setMovementGranularities(v);
    }

    public final void P(CharSequence charSequence0) {
        this.a.setPackageName(charSequence0);
    }

    public final void Q(CharSequence charSequence0) {
        this.a.setPaneTitle(charSequence0);
    }

    public final void R(View view0) {
        this.b = -1;
        this.a.setParent(view0);
    }

    public final void S(View view0, int v) {
        this.b = v;
        this.a.setParent(view0, v);
    }

    public final void T(kha kha0) {
        this.a.setRangeInfo(((AccessibilityNodeInfo.RangeInfo)kha0.a));
    }

    public final void U(CharSequence charSequence0) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence0);
    }

    public final void V(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public final void W(boolean z) {
        this.a.setScrollable(z);
    }

    public final void X(boolean z) {
        this.a.setSelected(z);
    }

    public final void Y(boolean z) {
        this.a.setShowingHintText(z);
    }

    public final void Z(View view0, int v) {
        this.c = v;
        this.a.setSource(view0, v);
    }

    @Deprecated
    public final int a() {
        return this.a.getActions();
    }

    public final void aa(CharSequence charSequence0) {
        this.a.setStateDescription(charSequence0);
    }

    public final void ab(CharSequence charSequence0) {
        this.a.setText(charSequence0);
    }

    public final void ac(View view0) {
        this.a.setTraversalAfter(view0);
    }

    public final void ad(View view0) {
        this.a.setTraversalBefore(view0);
    }

    public final void ae(View view0, int v) {
        this.a.setTraversalBefore(view0, v);
    }

    public final void af(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final boolean ag() {
        return this.a.isCheckable();
    }

    public final boolean ah() {
        return this.a.isClickable();
    }

    public final boolean ai() {
        return this.a.isEnabled();
    }

    public final boolean aj() {
        return this.a.isFocusable();
    }

    public final boolean ak() {
        return this.a.isFocused();
    }

    public final boolean al() {
        return this.a.isLongClickable();
    }

    public final boolean am() {
        return this.a.isPassword();
    }

    public final boolean an() {
        return this.a.isScrollable();
    }

    public final boolean ao() {
        return this.a.isSelected();
    }

    public final boolean ap() {
        return this.a.isVisibleToUser();
    }

    public final void aq(kgx kgx0) {
        this.a.removeAction(((AccessibilityNodeInfo.AccessibilityAction)kgx0.N));
    }

    public final void ar() {
        this.t(0x4000000, true);
    }

    private final List as(String s) {
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        List list0 = accessibilityNodeInfo0.getExtras().getIntegerArrayList(s);
        if(list0 == null) {
            list0 = new ArrayList();
            accessibilityNodeInfo0.getExtras().putIntegerArrayList(s, ((ArrayList)list0));
        }
        return list0;
    }

    private final boolean at(int v) {
        Bundle bundle0 = this.c();
        return bundle0 == null ? false : (bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & v) == v;
    }

    public final int b() {
        return this.a.getMovementGranularities();
    }

    public final Bundle c() {
        return this.a.getExtras();
    }

    public static khb d() {
        return new khb(AccessibilityNodeInfo.obtain());
    }

    public static khb e(View view0) {
        return new khb(AccessibilityNodeInfo.obtain(view0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof khb)) {
            return false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        if(accessibilityNodeInfo0 == null) {
            if(((khb)object0).a != null) {
                return false;
            }
        }
        else if(!accessibilityNodeInfo0.equals(((khb)object0).a)) {
            return false;
        }
        return this.c == ((khb)object0).c ? this.b == ((khb)object0).b : false;
    }

    public static khb f(khb khb0) {
        return new khb(AccessibilityNodeInfo.obtain(khb0.a));
    }

    public final CharSequence g() {
        return this.a.getClassName();
    }

    public final CharSequence h() {
        return this.a.getContentDescription();
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    public final CharSequence i() {
        return this.a.getPackageName();
    }

    public final CharSequence j() {
        if(!this.as("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List list0 = this.as("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List list1 = this.as("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List list2 = this.as("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List list3 = this.as("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence0 = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for(int v = 0; v < list0.size(); ++v) {
                ((Spannable)charSequence0).setSpan(new kgw(((int)(((Integer)list3.get(v)))), this, this.c().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list0.get(v)).intValue(), ((Integer)list1.get(v)).intValue(), ((Integer)list2.get(v)).intValue());
            }
            return charSequence0;
        }
        return this.a.getText();
    }

    static String k(int v) {
        switch(v) {
            case 1: {
                return "ACTION_FOCUS";
            }
            case 2: {
                return "ACTION_CLEAR_FOCUS";
            }
            case 4: {
                return "ACTION_SELECT";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 0x20: {
                return "ACTION_LONG_CLICK";
            }
            case 0x40: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 0x80: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 0x100: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 0x200: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 0x400: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 0x800: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 0x1000: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 0x2000: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 0x4000: {
                return "ACTION_COPY";
            }
            case 0x8000: {
                return "ACTION_PASTE";
            }
            case 0x10000: {
                return "ACTION_CUT";
            }
            case 0x20000: {
                return "ACTION_SET_SELECTION";
            }
            case 0x40000: {
                return "ACTION_EXPAND";
            }
            case 0x80000: {
                return "ACTION_COLLAPSE";
            }
            case 0x200000: {
                return "ACTION_SET_TEXT";
            }
            case 0x1020036: {
                return "ACTION_SHOW_ON_SCREEN";
            }
            case 0x1020037: {
                return "ACTION_SCROLL_TO_POSITION";
            }
            case 0x1020038: {
                return "ACTION_SCROLL_UP";
            }
            case 0x1020039: {
                return "ACTION_SCROLL_LEFT";
            }
            case 0x102003A: {
                return "ACTION_SCROLL_DOWN";
            }
            case 0x102003B: {
                return "ACTION_SCROLL_RIGHT";
            }
            case 0x102003C: {
                return "ACTION_CONTEXT_CLICK";
            }
            case 0x102003D: {
                return "ACTION_SET_PROGRESS";
            }
            case 0x1020042: {
                return "ACTION_MOVE_WINDOW";
            }
            case 0x1020044: {
                return "ACTION_SHOW_TOOLTIP";
            }
            case 0x1020045: {
                return "ACTION_HIDE_TOOLTIP";
            }
            case 0x1020046: {
                return "ACTION_PAGE_UP";
            }
            case 0x1020047: {
                return "ACTION_PAGE_DOWN";
            }
            case 0x1020048: {
                return "ACTION_PAGE_LEFT";
            }
            case 0x1020049: {
                return "ACTION_PAGE_RIGHT";
            }
            case 0x102004A: {
                return "ACTION_PRESS_AND_HOLD";
            }
            case 0x1020054: {
                return "ACTION_IME_ENTER";
            }
            case 0x1020055: {
                return "ACTION_DRAG_START";
            }
            case 0x1020056: {
                return "ACTION_DRAG_DROP";
            }
            case 0x1020057: {
                return "ACTION_DRAG_CANCEL";
            }
            case 0x102005E: {
                return "ACTION_SCROLL_IN_DIRECTION";
            }
            default: {
                return "ACTION_UNKNOWN";
            }
        }
    }

    public final List l() {
        List list0 = this.a.getActionList();
        List list1 = new ArrayList();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            list1.add(new kgx(list0.get(v1), 0, null, null, null));
        }
        return list1;
    }

    public final void m(int v) {
        this.a.addAction(v);
    }

    public final void n(kgx kgx0) {
        this.a.addAction(((AccessibilityNodeInfo.AccessibilityAction)kgx0.N));
    }

    public final void o(View view0) {
        this.a.addChild(view0);
    }

    public final void p(View view0, int v) {
        this.a.addChild(view0, v);
    }

    @Deprecated
    public final void q(Rect rect0) {
        this.a.getBoundsInParent(rect0);
    }

    public final void r(Rect rect0) {
        this.a.getBoundsInScreen(rect0);
    }

    public final void s(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void t(int v, boolean z) {
        Bundle bundle0 = this.c();
        if(bundle0 != null) {
            int v1 = bundle0.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~v;
            if(!z) {
                v = 0;
            }
            bundle0.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", v | v1);
        }
    }

    @Override
    public final String toString() {
        String s1;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        Rect rect0 = new Rect();
        this.q(rect0);
        stringBuilder0.append("; boundsInParent: " + rect0.toString());
        this.r(rect0);
        stringBuilder0.append("; boundsInScreen: " + rect0.toString());
        if(Build.VERSION.SDK_INT >= 34) {
            this.a.getBoundsInWindow(rect0);
        }
        else {
            Rect rect1 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if(rect1 != null) {
                rect0.set(rect1.left, rect1.top, rect1.right, rect1.bottom);
            }
        }
        stringBuilder0.append("; boundsInWindow: " + rect0.toString());
        stringBuilder0.append("; packageName: ");
        stringBuilder0.append(this.i());
        stringBuilder0.append("; className: ");
        stringBuilder0.append(this.g());
        stringBuilder0.append("; text: ");
        stringBuilder0.append(this.j());
        stringBuilder0.append("; error: ");
        AccessibilityNodeInfo accessibilityNodeInfo0 = this.a;
        stringBuilder0.append(accessibilityNodeInfo0.getError());
        stringBuilder0.append("; maxTextLength: ");
        stringBuilder0.append(accessibilityNodeInfo0.getMaxTextLength());
        stringBuilder0.append("; stateDescription: ");
        stringBuilder0.append(accessibilityNodeInfo0.getStateDescription());
        stringBuilder0.append("; contentDescription: ");
        stringBuilder0.append(this.h());
        stringBuilder0.append("; supplementalDescription: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 36 ? accessibilityNodeInfo0.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY") : accessibilityNodeInfo0.getSupplementalDescription()));
        stringBuilder0.append("; tooltipText: ");
        stringBuilder0.append(accessibilityNodeInfo0.getTooltipText());
        stringBuilder0.append("; viewIdResName: ");
        stringBuilder0.append(accessibilityNodeInfo0.getViewIdResourceName());
        stringBuilder0.append("; uniqueId: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 33 ? accessibilityNodeInfo0.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY") : accessibilityNodeInfo0.getUniqueId()));
        stringBuilder0.append("; checkable: ");
        stringBuilder0.append(this.ag());
        stringBuilder0.append("; checked: ");
        int v = Build.VERSION.SDK_INT < 36 ? accessibilityNodeInfo0.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", ((int)accessibilityNodeInfo0.isChecked())) : accessibilityNodeInfo0.getChecked();
        String s = "PARTIAL";
        if(v == 1) {
            s1 = "TRUE";
        }
        else {
            s1 = v == 2 ? "PARTIAL" : "FALSE";
        }
        stringBuilder0.append(s1);
        stringBuilder0.append("; fieldRequired: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 36 ? accessibilityNodeInfo0.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY") : accessibilityNodeInfo0.isFieldRequired()));
        stringBuilder0.append("; focusable: ");
        stringBuilder0.append(this.aj());
        stringBuilder0.append("; focused: ");
        stringBuilder0.append(this.ak());
        stringBuilder0.append("; selected: ");
        stringBuilder0.append(this.ao());
        stringBuilder0.append("; clickable: ");
        stringBuilder0.append(this.ah());
        stringBuilder0.append("; longClickable: ");
        stringBuilder0.append(this.al());
        stringBuilder0.append("; contextClickable: ");
        stringBuilder0.append(accessibilityNodeInfo0.isContextClickable());
        stringBuilder0.append("; expandedState: ");
        int v2 = Build.VERSION.SDK_INT < 36 ? accessibilityNodeInfo0.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0) : accessibilityNodeInfo0.getExpandedState();
        switch(v2) {
            case 0: {
                s = "UNDEFINED";
                break;
            }
            case 1: {
                s = "COLLAPSED";
                break;
            }
            case 2: {
                break;
            }
            default: {
                s = v2 == 3 ? "FULL" : "UNKNOWN";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append("; enabled: ");
        stringBuilder0.append(this.ai());
        stringBuilder0.append("; password: ");
        stringBuilder0.append(this.am());
        stringBuilder0.append("; scrollable: " + this.an());
        stringBuilder0.append("; containerTitle: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 34 ? accessibilityNodeInfo0.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY") : accessibilityNodeInfo0.getContainerTitle()));
        stringBuilder0.append("; granularScrollingSupported: ");
        stringBuilder0.append(this.at(0x4000000));
        stringBuilder0.append("; importantForAccessibility: ");
        stringBuilder0.append(accessibilityNodeInfo0.isImportantForAccessibility());
        stringBuilder0.append("; visible: ");
        stringBuilder0.append(this.ap());
        stringBuilder0.append("; isTextSelectable: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 33 ? this.at(0x800000) : accessibilityNodeInfo0.isTextSelectable()));
        stringBuilder0.append("; accessibilityDataSensitive: ");
        stringBuilder0.append((Build.VERSION.SDK_INT < 34 ? this.at(0x40) : accessibilityNodeInfo0.isAccessibilityDataSensitive()));
        stringBuilder0.append("; [");
        List list0 = this.l();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            kgx kgx0 = (kgx)list0.get(v1);
            String s2 = khb.k(kgx0.a());
            if(s2.equals("ACTION_UNKNOWN") && kgx0.b() != null) {
                s2 = kgx0.b().toString();
            }
            stringBuilder0.append(s2);
            if(v1 != list0.size() - 1) {
                stringBuilder0.append(", ");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Deprecated
    public final void u(Rect rect0) {
        this.a.setBoundsInParent(rect0);
    }

    public final void v(Rect rect0) {
        this.a.setBoundsInScreen(rect0);
    }

    public final void w(boolean z) {
        this.a.setCheckable(z);
    }

    @Deprecated
    public final void x(boolean z) {
        this.a.setChecked(z);
    }

    public final void y(CharSequence charSequence0) {
        this.a.setClassName(charSequence0);
    }

    public final void z(boolean z) {
        this.a.setClickable(z);
    }
}

