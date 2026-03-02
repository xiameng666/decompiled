import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class fcwg extends AccessibilityNodeProvider {
    final fcwh a;

    public fcwg(fcwh fcwh0) {
        Objects.requireNonNull(fcwh0);
        this.a = fcwh0;
        super();
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int v) {
        fcwh fcwh0 = this.a;
        if(v != -1) {
            fcwh0.e = new int[2];
            fcwh0.d = new Rect();
            fcwh0.c = new Rect();
            Rect rect0 = fcwh0.d;
            int[] arr_v = fcwh0.e;
            Rect rect1 = fcwh0.c;
            AccessibilityNodeInfo accessibilityNodeInfo0 = AccessibilityNodeInfo.obtain();
            accessibilityNodeInfo0.setEnabled(true);
            accessibilityNodeInfo0.setClassName(fcwh.a);
            Rect rect2 = fcwh.b;
            accessibilityNodeInfo0.setBoundsInParent(rect2);
            fcwh0.e(v, accessibilityNodeInfo0);
            if(accessibilityNodeInfo0.getText() == null && accessibilityNodeInfo0.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            }
            accessibilityNodeInfo0.getBoundsInParent(rect0);
            if(rect0.equals(rect2)) {
                throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            }
            int v2 = accessibilityNodeInfo0.getActions();
            if((v2 & 0x40) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            if((v2 & 0x80) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            View view0 = fcwh0.i;
            accessibilityNodeInfo0.setPackageName("com.google.android.gms");
            accessibilityNodeInfo0.setSource(view0, v);
            accessibilityNodeInfo0.setParent(view0);
            if(fcwh0.k == v) {
                accessibilityNodeInfo0.setAccessibilityFocused(true);
                accessibilityNodeInfo0.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            }
            else {
                accessibilityNodeInfo0.setAccessibilityFocused(false);
                accessibilityNodeInfo0.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
            }
            if(!rect0.isEmpty() && view0.getWindowVisibility() == 0) {
                for(ViewParent viewParent0 = view0.getParent(); true; viewParent0 = ((View)viewParent0).getParent()) {
                    if(!(viewParent0 instanceof View)) {
                        if(viewParent0 == null) {
                            break;
                        }
                        if(fcwh0.f == null) {
                            fcwh0.f = new Rect();
                        }
                        Rect rect3 = fcwh0.f;
                        if(!view0.getLocalVisibleRect(rect3) || !rect0.intersect(rect3)) {
                            break;
                        }
                        accessibilityNodeInfo0.setVisibleToUser(true);
                        accessibilityNodeInfo0.setBoundsInParent(rect0);
                        break;
                    }
                    if(((View)viewParent0).getAlpha() <= 0.0f || ((View)viewParent0).getVisibility() != 0) {
                        break;
                    }
                }
            }
            view0.getLocationOnScreen(arr_v);
            int v3 = arr_v[0];
            int v4 = arr_v[1];
            rect1.set(rect0);
            rect1.offset(v3, v4);
            accessibilityNodeInfo0.setBoundsInScreen(rect1);
            return accessibilityNodeInfo0;
        }
        View view1 = fcwh0.i;
        AccessibilityNodeInfo accessibilityNodeInfo1 = AccessibilityNodeInfo.obtain(view1);
        view1.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo1);
        int v5 = accessibilityNodeInfo1.getChildCount();
        List list0 = fcwh0.g;
        if(list0 == null) {
            fcwh0.g = new ArrayList();
        }
        else {
            list0.clear();
        }
        List list1 = fcwh0.g;
        fcwh0.a(list1);
        if(v5 > 0 && !list1.isEmpty()) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int v6 = list1.size();
        for(int v1 = 0; v1 < v6; ++v1) {
            accessibilityNodeInfo1.addChild(view1, ((Integer)list1.get(v1)).intValue());
        }
        return accessibilityNodeInfo1;
    }

    @Override  // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int v, int v1, Bundle bundle0) {
        fcwh fcwh0 = this.a;
        if(v != -1) {
            if(v1 != 0x40 && v1 != 0x80) {
                return fcwh0.h(v, v1);
            }
            switch(v1) {
                case 0x40: {
                    AccessibilityManager accessibilityManager0 = (AccessibilityManager)fcwh0.j.getSystemService("accessibility");
                    if(fcwh0.h.isEnabled()) {
                        if(!accessibilityManager0.isTouchExplorationEnabled()) {
                            return false;
                        }
                        if(!fcwh0.g(v)) {
                            int v2 = fcwh0.k;
                            if(v2 != 0x80000000) {
                                fcwh0.i(v2, 0x10000);
                            }
                            fcwh0.k = v;
                            fcwh0.i.invalidate();
                            fcwh0.i(v, 0x8000);
                            return true;
                        }
                    }
                    return false;
                }
                case 0x80: {
                    if(fcwh0.g(v)) {
                        fcwh0.k = 0x80000000;
                        fcwh0.i.invalidate();
                        fcwh0.i(v, 0x10000);
                        return true;
                    }
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return fcwh0.i.performAccessibilityAction(v1, bundle0);
    }
}

