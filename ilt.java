import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan.VerbatimBuilder;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public final class ilt extends kdl implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public final bxv A;
    public final bxq B;
    private final ibts D;
    private final AccessibilityManager E;
    private final long F;
    private List G;
    private final ilk H;
    private final bxf I;
    private final icgv J;
    private bxv K;
    private final jjb L;
    private final ibts M;
    public static final bxt a;
    public final ili b;
    public int c;
    public final Handler d;
    public int e;
    public int f;
    public khb g;
    public khb h;
    public boolean i;
    public final bzt j;
    public final bzt k;
    public int l;
    public Integer m;
    public boolean n;
    public ill o;
    public final String p;
    public final String q;
    public iqk r;
    public boolean s;
    public final Runnable t;
    public final List u;
    public final bxv v;
    public final bxv w;
    public final bxx x;
    public final bxq y;
    public final bxq z;

    static {
        bxt bxt0 = new bxt(0x20);
        int v = bxt0.b;
        if(v < 0) {
            cad.c("");
        }
        bxt0.e(bxt0.b + 0x20);
        int[] arr_v = bxt0.a;
        int v1 = bxt0.b;
        if(v != v1) {
            ibpg.aa(arr_v, arr_v, v + 0x20, v, v1);
        }
        ibpg.af(new int[]{0x7F0B0A34, 0x7F0B0A35, 0x7F0B0A40, 0x7F0B0A4B, 0x7F0B0A4E, 0x7F0B0A4F, 0x7F0B0A50, 0x7F0B0A51, 0x7F0B0A52, 0x7F0B0A53, 0x7F0B0A36, 0x7F0B0A37, 0x7F0B0A38, 0x7F0B0A39, 0x7F0B0A3A, 0x7F0B0A3B, 0x7F0B0A3C, 0x7F0B0A3D, 0x7F0B0A3E, 0x7F0B0A3F, 0x7F0B0A41, 0x7F0B0A42, 0x7F0B0A43, 0x7F0B0A44, 0x7F0B0A45, 0x7F0B0A46, 0x7F0B0A47, 0x7F0B0A48, 0x7F0B0A49, 0x7F0B0A4A, 0x7F0B0A4C, 0x7F0B0A4D}, arr_v, v, 0, 12);  // id:accessibility_custom_action_0
        bxt0.b += 0x20;
        ilt.a = bxt0;
    }

    public ilt(ili ili0) {
        this.b = ili0;
        this.c = 0x80000000;
        this.D = new ilo(this);
        Object object0 = ili0.getContext().getSystemService("accessibility");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.E = (AccessibilityManager)object0;
        this.F = 100L;
        this.d = new Handler(Looper.getMainLooper());
        this.H = new ilk(this);
        this.e = 0x80000000;
        this.f = 0x80000000;
        this.v = new bxv(null);
        this.w = new bxv(null);
        this.j = new bzt(null);
        this.k = new bzt(null);
        this.l = -1;
        this.I = new bxf(null);
        this.J = icgx.a(1, 0, null, 6);
        this.n = true;
        this.K = bxw.a();
        this.x = new bxx(null);
        this.y = new bxq(null);
        this.z = new bxq(null);
        this.p = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.q = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.L = new jjb();
        this.A = new bxv(null);
        this.r = new iqk(ili0.m.a(), bxw.a());
        this.B = new bxq(null);
        ili0.addOnAttachStateChangeListener(this);
        this.t = new ilj(this);
        this.u = new ArrayList();
        this.M = new ilq(this);
    }

    public final void A(int v) {
        int v1 = this.c;
        if(v1 == v) {
            return;
        }
        this.c = v;
        ilt.K(this, v, 0x80, null, 12);
        ilt.K(this, v1, 0x100, null, 12);
    }

    public final boolean B(boolean z, int v, long v1) {
        Object[] arr_object2;
        long[] arr_v2;
        boolean z2;
        Object[] arr_object1;
        long[] arr_v1;
        if(!ibuq.m(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        bxv bxv0 = this.q();
        if(!hjz.g(v1, 0x7FC000007FC00000L)) {
            if(((0x7FFFFFFF7FFFFFFFL & v1) + 0x7FFFFF007FFFFFL & 0x8000000080000000L) == 0L) {
                ivi ivi0 = z ? iuz.u : iuz.t;
                Object[] arr_object = bxv0.c;
                long[] arr_v = bxv0.a;
                int v2 = arr_v.length - 2;
                if(v2 >= 0) {
                    int v3 = 0;
                    boolean z1 = false;
                    while(true) {
                        long v4 = arr_v[v3];
                        if((~v4 << 7 & v4 & 0x8080808080808080L) == 0x8080808080808080L) {
                            arr_v2 = arr_v;
                            arr_object2 = arr_object;
                        }
                        else {
                            int v5 = 0;
                            while(true) {
                                int v6 = 8 - (~(v3 - v2) >>> 0x1F);
                                if(v5 >= v6) {
                                    break;
                                }
                                if((v4 & 0xFFL) < 0x80L) {
                                    iui iui0 = (iui)arr_object[(v3 << 3) + v5];
                                    arr_v1 = arr_v;
                                    arr_object1 = arr_object;
                                    z2 = z1;
                                    if(new hka(((float)iui0.b.b), ((float)iui0.b.c), ((float)iui0.b.d), ((float)iui0.b.e)).g(v1)) {
                                        itu itu0 = (itu)itz.a(iui0.a.b, ivi0);
                                        if(itu0 != null) {
                                            if(v == 0 && itu0.c || (itu0.c ? -v : v) < 0) {
                                                if((((Number)itu0.a.a()).floatValue() > 0.0f)) {
                                                    z1 = true;
                                                    goto label_36;
                                                }
                                            }
                                            else if((((Number)itu0.a.a()).floatValue() < ((Number)itu0.b.a()).floatValue())) {
                                                z1 = true;
                                                goto label_36;
                                            }
                                        }
                                    }
                                }
                                else {
                                    arr_v1 = arr_v;
                                    arr_object1 = arr_object;
                                    z2 = z1;
                                }
                                z1 = z2;
                            label_36:
                                v4 >>= 8;
                                ++v5;
                                arr_v = arr_v1;
                                arr_object = arr_object1;
                            }
                            arr_v2 = arr_v;
                            arr_object2 = arr_object;
                            if(v6 == 8) {
                                z1 = z1;
                                goto label_49;
                            }
                            return z1;
                        }
                    label_49:
                        if(v3 == v2) {
                            break;
                        }
                        ++v3;
                        arr_v = arr_v2;
                        arr_object = arr_object2;
                    }
                    return z1;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean C(int v) {
        return this.e == v;
    }

    public final boolean D() {
        AccessibilityManager accessibilityManager0 = this.E;
        if(accessibilityManager0.isEnabled()) {
            List list0 = this.G;
            if(list0 == null) {
                list0 = accessibilityManager0.getEnabledAccessibilityServiceList(-1);
                this.G = list0;
            }
            return !list0.isEmpty();
        }
        return false;
    }

    public final boolean E() {
        if(ibuq.m(null, Boolean.valueOf(true))) {
            return true;
        }
        if(ibuq.m(null, Boolean.valueOf(false))) {
            return false;
        }
        return Build.VERSION.SDK_INT < 34 ? true : this.E.isRequestFromAccessibilityTool();
    }

    public final boolean F() {
        return this.E.isEnabled() && this.E.isTouchExplorationEnabled();
    }

    public static final boolean G(itu itu0, float f) {
        if(Float.compare(f, 0.0f) < 0) {
            return ((Number)itu0.a.a()).floatValue() > 0.0f ? true : Float.compare(f, 0.0f) > 0 && ((Number)itu0.a.a()).floatValue() < ((Number)itu0.b.a()).floatValue();
        }
        return Float.compare(f, 0.0f) > 0 && ((Number)itu0.a.a()).floatValue() < ((Number)itu0.b.a()).floatValue();
    }

    public static final boolean H(itu itu0) {
        return Float.compare(((Number)itu0.a.a()).floatValue(), 0.0f) <= 0 || itu0.c ? Float.compare(((Number)itu0.a.a()).floatValue(), ((Number)itu0.b.a()).floatValue()) < 0 && itu0.c : true;
    }

    public static final boolean I(itu itu0) {
        return Float.compare(((Number)itu0.a.a()).floatValue(), ((Number)itu0.b.a()).floatValue()) >= 0 || itu0.c ? Float.compare(((Number)itu0.a.a()).floatValue(), 0.0f) > 0 && itu0.c : true;
    }

    public final boolean J(iug iug0, int v, int v1, boolean z) {
        ity ity0 = iug0.b;
        ivi ivi0 = itw.i;
        boolean z1 = false;
        if(ity0.f(ivi0) && ilx.d(iug0)) {
            ibtx ibtx0 = (ibtx)((itj)ity0.c(ivi0)).b;
            return ibtx0 == null ? false : ((Boolean)ibtx0.a(Integer.valueOf(v), Integer.valueOf(v1), Boolean.valueOf(z))).booleanValue();
        }
        if(v != v1 || v1 != this.l) {
            String s = ilt.O(iug0);
            if(s != null) {
                if(v < 0 || v != v1 || v1 > s.length()) {
                    v = -1;
                }
                this.l = v;
                if(s.length() > 0) {
                    z1 = true;
                }
                int v2 = iug0.d;
                int v3 = this.m(v2);
                Integer integer0 = null;
                Integer integer1 = z1 ? ((int)this.l) : null;
                Integer integer2 = z1 ? ((int)this.l) : null;
                if(z1) {
                    integer0 = s.length();
                }
                this.P(this.p(v3, integer1, integer2, integer0, s));
                this.y(v2);
                return true;
            }
        }
        return false;
    }

    static void K(ilt ilt0, int v, int v1, Integer integer0, int v2) {
        if((v2 & 4) != 0) {
            integer0 = null;
        }
        ilt0.M(v, v1, integer0, null);
    }

    public static final iwj L(ity ity0) {
        return (iwj)itz.a(ity0, iuz.E);
    }

    public final void M(int v, int v1, Integer integer0, List list0) {
        if(v != 0x80000000 && this.D()) {
            AccessibilityEvent accessibilityEvent0 = this.o(v, v1);
            if(integer0 != null) {
                accessibilityEvent0.setContentChangeTypes(integer0.intValue());
            }
            if(list0 != null) {
                accessibilityEvent0.setContentDescription(jlz.c(list0, ",", null, null, null, 62));
            }
            this.P(accessibilityEvent0);
        }
    }

    public static final CharSequence N(CharSequence charSequence0) {
        int v = 100000;
        if(charSequence0 != null && charSequence0.length() != 0 && charSequence0.length() > 100000) {
            if(Character.isHighSurrogate(charSequence0.charAt(0x1869F)) && Character.isLowSurrogate(charSequence0.charAt(100000))) {
                v = 0x1869F;
            }
            charSequence0 = charSequence0.subSequence(0, v);
            ibuq.d(charSequence0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        }
        return charSequence0;
    }

    public static final String O(iug iug0) {
        iwj iwj0;
        if(iug0 != null) {
            ity ity0 = iug0.b;
            ivi ivi0 = iuz.a;
            if(ity0.f(ivi0)) {
                return jlz.c(((List)ity0.c(ivi0)), ",", null, null, null, 62);
            }
            if(ity0.f(iuz.E)) {
                iwj0 = ilt.L(ity0);
                return iwj0 == null ? null : iwj0.b;
            }
            List list0 = (List)itz.a(ity0, iuz.A);
            if(list0 != null) {
                iwj0 = (iwj)ibpo.T(list0);
                return iwj0 == null ? null : iwj0.b;
            }
        }
        return null;
    }

    public final void P(AccessibilityEvent accessibilityEvent0) {
        if(!this.D()) {
            return;
        }
        switch(accessibilityEvent0.getEventType()) {
            case 0x800: 
            case 0x8000: {
                this.i = true;
            }
        }
        try {
            Boolean boolean0 = (Boolean)this.D.a(accessibilityEvent0);
            this.i = false;
        }
        catch(Throwable throwable0) {
            this.i = false;
            throw throwable0;
        }
    }

    private final Rect R(float f, float f1, float f2, float f3) {
        long v = this.b.f(((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20);
        long v1 = this.b.f(((long)Float.floatToRawIntBits(f3)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f2)) << 0x20);
        int v2 = (int)(v1 >> 0x20);
        int v3 = (int)(v >> 0x20);
        int v4 = (int)(v1 & 0xFFFFFFFFL);
        int v5 = (int)(v & 0xFFFFFFFFL);
        return new Rect(((int)(((float)Math.floor(Math.min(Float.intBitsToFloat(v3), Float.intBitsToFloat(v2)))))), ((int)(((float)Math.floor(Math.min(Float.intBitsToFloat(v5), Float.intBitsToFloat(v4)))))), ((int)(((float)Math.ceil(Math.max(Float.intBitsToFloat(v3), Float.intBitsToFloat(v2)))))), ((int)(((float)Math.ceil(Math.max(Float.intBitsToFloat(v5), Float.intBitsToFloat(v4)))))));
    }

    private final hka S(iug iug0, Rect rect0, hmu hmu0) {
        iln iln0 = new iln(hmu0);
        ify ify0 = iug0.a;
        ihl ihl0 = ify0.u;
        hfb hfb0 = null;
        if((ihl0.a() & 8) != 0) {
            hfb hfb1 = ihl0.f;
        alab1:
            while(hfb1 != null) {
                if((hfb1.s & 8) != 0) {
                    hfb hfb2 = hfb1;
                    gwq gwq0 = null;
                    while(hfb2 != null) {
                        if((hfb2 instanceof ije)) {
                            ((ije)hfb2).dJ(iln0);
                            if(iln0.a) {
                                hfb0 = hfb2;
                                break alab1;
                            }
                        }
                        else if((hfb2.s & 8) != 0 && (hfb2 instanceof iep)) {
                            hfb hfb3 = ((iep)hfb2).D;
                            int v = 0;
                            while(hfb3 != null) {
                                if((hfb3.s & 8) != 0) {
                                    ++v;
                                    if(v == 1) {
                                        hfb2 = hfb3;
                                    }
                                    else {
                                        if(gwq0 == null) {
                                            gwq0 = new gwq(new hfb[16]);
                                        }
                                        if(hfb2 != null) {
                                            gwq0.n(hfb2);
                                        }
                                        gwq0.n(hfb3);
                                        hfb2 = null;
                                    }
                                }
                                hfb3 = hfb3.v;
                            }
                            if(v != 1) {
                                goto label_34;
                            }
                            continue;
                        }
                    label_34:
                        hfb2 = ien.a(gwq0);
                    }
                }
                if((hfb1.t & 8) == 0) {
                    break;
                }
                hfb1 = hfb1.v;
            }
        }
        if(((ije)hfb0) != null) {
            hfb hfb4 = ((ije)hfb0).I();
            if(hfb4 != null && hfb4.B) {
                hka hka0 = hzl.e(ien.b(((ije)hfb0)));
                Rect rect1 = this.R(hka0.b, hka0.c, hka0.d, hka0.e);
                int v1 = rect1.left - rect0.left;
                int v2 = rect1.top - rect0.top;
                return new hka(((float)v1), ((float)v2), ((float)rect1.width()) + ((float)v1), ((float)rect1.height()) + ((float)v2));
            }
        }
        return hzl.f(ify0.s(), false);
    }

    private final hmg T(hmu hmu0, long v, jlm jlm0) {
        return hmu0.a(v, jlm0, this.b.k());
    }

    private final void U() {
        this.G = null;
    }

    private static final Rect V(khb khb0) {
        Rect rect0 = new Rect();
        khb0.r(rect0);
        return rect0;
    }

    private static final Rect W(hka hka0, float f, float f1) {
        return new Rect(((int)(hka0.b + f)), ((int)(hka0.c + f1)), ((int)(hka0.d + f)), ((int)(hka0.e + f1)));
    }

    private static final float[] X(hmg hmg0) {
        return (hmg0 instanceof hmf) ? new float[]{Float.intBitsToFloat(((int)(((hmf)hmg0).a.e >> 0x20))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.e & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.f >> 0x20))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.f & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.g >> 0x20))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.g & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(((hmf)hmg0).a.h >> 0x20))), Float.intBitsToFloat(((int)(0xFFFFFFFFL & ((hmf)hmg0).a.h)))} : null;
    }

    private static final Rect Y(hmg hmg0, float f, float f1) {
        return (hmg0 instanceof hme) || (hmg0 instanceof hmf) ? ilt.W(hmg0.a(), f, f1) : null;
    }

    private static final Region Z(hmg hmg0, float f, float f1) {
        if((hmg0 instanceof hmd)) {
            Region region0 = new Region(ilt.W(((hmd)hmg0).a().e(f, f1), 0.0f, 0.0f));
            Region region1 = new Region();
            hks hks0 = ((hmd)hmg0).a;
            if(!(hks0 instanceof hks)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            hks0.a.offset(f, f1);
            region1.setPath(hks0.a, region0);
            return region1;
        }
        return null;
    }

    @Override  // kdl
    public final khe a(View view0) {
        return this.H;
    }

    public static final float j(float f, float f1) {
        if(Math.signum(f) == Math.signum(f1)) {
            return Math.abs(f) < Math.abs(f1) ? f : f1;
        }
        return 0.0f;
    }

    public final int k(iug iug0) {
        ity ity0 = iug0.b;
        if(!ity0.f(iuz.a)) {
            return ity0.f(iuz.F) ? jbk.a(((jbk)ity0.c(iuz.F)).b) : this.l;
        }
        return this.l;
    }

    public final int l(iug iug0) {
        ity ity0 = iug0.b;
        if(!ity0.f(iuz.a)) {
            return ity0.f(iuz.F) ? jbk.e(((jbk)ity0.c(iuz.F)).b) : this.l;
        }
        return this.l;
    }

    public final int m(int v) {
        return v == this.b.m.a().d ? -1 : v;
    }

    public final Rect n(iui iui0) {
        return this.R(((float)iui0.b.b), ((float)iui0.b.c), ((float)iui0.b.d), ((float)iui0.b.e));
    }

    public final AccessibilityEvent o(int v, int v1) {
        AccessibilityEvent accessibilityEvent0 = AccessibilityEvent.obtain(v1);
        accessibilityEvent0.setEnabled(true);
        accessibilityEvent0.setClassName("android.view.View");
        accessibilityEvent0.setPackageName("com.google.android.gms");
        accessibilityEvent0.setSource(this.b, v);
        if(this.D()) {
            iui iui0 = (iui)this.q().a(v);
            if(iui0 != null) {
                accessibilityEvent0.setPassword(iui0.a.b.f(iuz.J));
                boolean z = ibuq.m(itz.a(iui0.a.b, iuz.n), Boolean.valueOf(true));
                if(Build.VERSION.SDK_INT >= 34) {
                    accessibilityEvent0.setAccessibilityDataSensitive(z);
                }
            }
        }
        return accessibilityEvent0;
    }

    @Override  // android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.U();
    }

    @Override  // android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.U();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        AccessibilityManager accessibilityManager0 = this.E;
        if(accessibilityManager0.isEnabled()) {
            this.U();
        }
        accessibilityManager0.addAccessibilityStateChangeListener(this);
        accessibilityManager0.addTouchExplorationStateChangeListener(this);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.d.removeCallbacks(this.t);
        this.E.removeAccessibilityStateChangeListener(this);
        this.E.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int v, Integer integer0, Integer integer1, Integer integer2, CharSequence charSequence0) {
        AccessibilityEvent accessibilityEvent0 = this.o(v, 0x2000);
        if(integer0 != null) {
            accessibilityEvent0.setFromIndex(integer0.intValue());
        }
        if(integer1 != null) {
            accessibilityEvent0.setToIndex(integer1.intValue());
        }
        if(integer2 != null) {
            accessibilityEvent0.setItemCount(integer2.intValue());
        }
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
        return accessibilityEvent0;
    }

    public final bxv q() {
        if(this.n) {
            this.n = false;
            ili ili0 = this.b;
            this.K = iuk.c(ili0.m);
            if(!this.D()) {
                return this.K;
            }
            bxv bxv0 = this.K;
            bxq bxq0 = this.y;
            bxq bxq1 = this.z;
            Resources resources0 = ili0.getContext().getResources();
            bxq0.b();
            bxq1.b();
            iui iui0 = (iui)bxv0.a(-1);
            iug iug0 = iui0 == null ? null : iui0.a;
            ibuq.c(iug0);
            List list0 = ivr.a(iug0, new ilv(bxv0), new ilw(resources0), ibpo.b(iug0));
            int v = ibpo.d(list0);
            if(v <= 0) {
                return this.K;
            }
            for(int v1 = 1; true; ++v1) {
                int v2 = ((iug)list0.get(v1 - 1)).d;
                int v3 = ((iug)list0.get(v1)).d;
                bxq0.c(v2, v3);
                bxq1.c(v3, v2);
                if(v1 == v) {
                    break;
                }
            }
        }
        return this.K;
    }

    public final khb r() {
        return this.E.isEnabled() ? null : khb.d();
    }

    public final Object s(ibrl ibrl0) {
        Object object1;
        Object object0;
        ilm ilm0;
        if((ibrl0 instanceof ilm)) {
            ilm0 = (ilm)ibrl0;
            int v = ilm0.c;
            if((v & 0x80000000) == 0) {
                ilm0 = new ilm(this, ibrl0);
            }
            else {
                ilm0.c = v - 0x80000000;
            }
        }
        else {
            ilm0 = new ilm(this, ibrl0);
        }
        try {
            object0 = ilm0.a;
            object1 = ibrx.a;
            switch(ilm0.c) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_17;
                }
                case 2: {
                    goto label_21;
                }
            }
        }
        catch(Throwable throwable0) {
            this.I.clear();
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_13:
        ibnx.b(object0);
        try {
            bxx bxx0 = new bxx(null);
            icgh icgh0 = this.J.A();
            goto label_24;
        label_17:
            icgh0 = ilm0.e;
            bxx0 = ilm0.d;
            ibnx.b(object0);
            goto label_29;
        label_21:
            icgh0 = ilm0.e;
            bxx0 = ilm0.d;
            ibnx.b(object0);
            while(true) {
            label_24:
                ilm0.d = bxx0;
                ilm0.e = icgh0;
                ilm0.c = 1;
                object0 = icgh0.a(ilm0);
                if(object0 != object1) {
                label_29:
                    if(!((Boolean)object0).booleanValue()) {
                        break;
                    }
                    icgh0.b();
                    if(this.D()) {
                        bxf bxf0 = this.I;
                        int v1 = bxf0.c;
                        for(int v2 = 0; v2 < v1; ++v2) {
                            ify ify0 = (ify)bxf0.b(v2);
                            if(ify0.am() && !this.b.D().b.containsKey(ify0)) {
                                ify ify1 = ify0.u.j(8) ? ify0 : ilx.a(ify0, ils.a);
                                if(ify1 != null) {
                                    ity ity0 = ify1.u();
                                    if(ity0 != null) {
                                        if(!ity0.a) {
                                            ify ify2 = ilx.a(ify1, ilr.a);
                                            if(ify2 != null) {
                                                ify1 = ify2;
                                            }
                                        }
                                        if(ify1 != null) {
                                            int v3 = ify1.c;
                                            if(bxx0.d(v3)) {
                                                ilt.K(this, this.m(v3), 0x800, Integer.valueOf(1), 8);
                                            }
                                        }
                                    }
                                }
                            }
                            if(ify0.am() && !this.b.D().b.containsKey(ify0)) {
                                int v4 = ify0.c;
                                itu itu0 = (itu)this.v.a(v4);
                                itu itu1 = (itu)this.w.a(v4);
                                if(itu0 != null || itu1 != null) {
                                    AccessibilityEvent accessibilityEvent0 = this.o(v4, 0x1000);
                                    if(itu0 != null) {
                                        accessibilityEvent0.setScrollX(((int)((Number)itu0.a.a()).floatValue()));
                                        accessibilityEvent0.setMaxScrollX(((int)((Number)itu0.b.a()).floatValue()));
                                    }
                                    if(itu1 != null) {
                                        accessibilityEvent0.setScrollY(((int)((Number)itu1.a.a()).floatValue()));
                                        accessibilityEvent0.setMaxScrollY(((int)((Number)itu1.b.a()).floatValue()));
                                    }
                                    this.P(accessibilityEvent0);
                                }
                            }
                        }
                        bxx0.d = 0;
                        if(bxx0.a != bzl.a) {
                            ibpg.aj(bxx0.a, 0x8080808080808080L);
                            int v5 = bxx0.c >> 3;
                            long v6 = 0xFFL << ((bxx0.c & 7) << 3);
                            bxx0.a[v5] = bxx0.a[v5] & ~v6 | v6;
                        }
                        bxx0.b();
                        if(!this.s) {
                            this.s = true;
                            this.d.post(this.t);
                        }
                    }
                    this.I.clear();
                    this.v.f();
                    this.w.f();
                    ilm0.d = bxx0;
                    ilm0.e = icgh0;
                    ilm0.c = 2;
                    if(iccv.c(this.F, ilm0) != object1) {
                        continue;
                    }
                }
                return object1;
            }
        }
        catch(Throwable throwable0) {
            this.I.clear();
            throw throwable0;
        }
        this.I.clear();
        return ibom.a;
    }

    public final void t(int v, khb khb0, String s, Bundle bundle0) {
        int v7;
        jbe jbe1;
        iui iui0 = (iui)this.q().a(v);
        if(iui0 != null) {
            iug iug0 = iui0.a;
            if(iug0 != null) {
                String s1 = ilt.O(iug0);
                if(ibuq.m(s, this.p)) {
                    int v1 = this.y.d(v);
                    if(v1 != -1) {
                        khb0.c().putInt(s, v1);
                    }
                }
                else if(ibuq.m(s, this.q)) {
                    int v2 = this.z.d(v);
                    if(v2 != -1) {
                        khb0.c().putInt(s, v2);
                    }
                }
                else {
                    ity ity0 = iug0.b;
                    if(ity0.f(itw.a) && bundle0 != null && ibuq.m(s, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                        int v3 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                        int v4 = bundle0.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                        if(v4 <= 0 || v3 < 0 || v3 >= (s1 == null ? 0x7FFFFFFF : s1.length())) {
                            goto label_50;
                        }
                        jbe jbe0 = iql.c(ity0);
                        if(jbe0 != null) {
                            ArrayList arrayList0 = new ArrayList();
                            int v5 = 0;
                            while(v5 < v4) {
                                int v6 = v3 + v5;
                                RectF rectF0 = null;
                                if(v6 >= jbe0.a.a.b()) {
                                    arrayList0.add(null);
                                    jbe1 = jbe0;
                                    v7 = v5;
                                }
                                else {
                                    hka hka0 = jbe0.l(v6).f(iug0.a());
                                    hka hka1 = iug0.b();
                                    hka hka2 = hka0.i(hka1) ? hka0.d(hka1) : null;
                                    if(hka2 == null) {
                                        jbe1 = jbe0;
                                        v7 = v5;
                                    }
                                    else {
                                        long v8 = this.b.f(((long)Float.floatToRawIntBits(hka2.b)) << 0x20 | ((long)Float.floatToRawIntBits(hka2.c)) & 0xFFFFFFFFL);
                                        v7 = v5;
                                        long v9 = this.b.f(((long)Float.floatToRawIntBits(hka2.d)) << 0x20 | ((long)Float.floatToRawIntBits(hka2.e)) & 0xFFFFFFFFL);
                                        jbe1 = jbe0;
                                        rectF0 = new RectF(Math.min(Float.intBitsToFloat(((int)(v8 >> 0x20))), Float.intBitsToFloat(((int)(v9 >> 0x20)))), Math.min(Float.intBitsToFloat(((int)(v8 & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(v9 & 0xFFFFFFFFL)))), Math.max(Float.intBitsToFloat(((int)(v8 >> 0x20))), Float.intBitsToFloat(((int)(v9 >> 0x20)))), Math.max(Float.intBitsToFloat(((int)(v8 & 0xFFFFFFFFL))), Float.intBitsToFloat(((int)(v9 & 0xFFFFFFFFL)))));
                                    }
                                    arrayList0.add(rectF0);
                                }
                                v5 = v7 + 1;
                                jbe0 = jbe1;
                            }
                            khb0.c().putParcelableArray(s, ((Parcelable[])arrayList0.toArray(new RectF[0])));
                            return;
                        label_50:
                            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                        }
                    }
                    else {
                        ivi ivi0 = iuz.y;
                        if(ity0.f(ivi0) && bundle0 != null && ibuq.m(s, "androidx.compose.ui.semantics.testTag")) {
                            String s2 = (String)itz.a(ity0, ivi0);
                            if(s2 != null) {
                                khb0.c().putCharSequence(s, s2);
                            }
                        }
                        else {
                            if(ibuq.m(s, "androidx.compose.ui.semantics.id")) {
                                khb0.c().putInt(s, iug0.d);
                                return;
                            }
                            if(ibuq.m(s, "androidx.compose.ui.semantics.shapeType")) {
                                hmu hmu0 = (hmu)itz.a(ity0, iuz.O);
                                if(hmu0 != null) {
                                    hka hka3 = this.S(iug0, ilt.V(khb0), hmu0);
                                    hmg hmg0 = this.T(hmu0, hka3.b(), iug0.a.r);
                                    if((hmg0 instanceof hme)) {
                                        khb0.c().putInt("androidx.compose.ui.semantics.shapeType", 0);
                                        khb0.c().putParcelable("androidx.compose.ui.semantics.shapeRect", ilt.Y(hmg0, hka3.b, hka3.c));
                                        return;
                                    }
                                    if((hmg0 instanceof hmf)) {
                                        khb0.c().putInt("androidx.compose.ui.semantics.shapeType", 1);
                                        khb0.c().putParcelable("androidx.compose.ui.semantics.shapeRect", ilt.Y(hmg0, hka3.b, hka3.c));
                                        khb0.c().putFloatArray("androidx.compose.ui.semantics.shapeCorners", ilt.X(hmg0));
                                        return;
                                    }
                                    if(!(hmg0 instanceof hmd)) {
                                        throw new ibnq();
                                    }
                                    khb0.c().putInt("androidx.compose.ui.semantics.shapeType", 2);
                                    khb0.c().putParcelable("androidx.compose.ui.semantics.shapeRegion", ilt.Z(hmg0, hka3.b, hka3.c));
                                }
                            }
                            else if(ibuq.m(s, "androidx.compose.ui.semantics.shapeRect")) {
                                hmu hmu1 = (hmu)itz.a(ity0, iuz.O);
                                if(hmu1 != null) {
                                    hka hka4 = this.S(iug0, ilt.V(khb0), hmu1);
                                    Rect rect0 = ilt.Y(this.T(hmu1, hka4.b(), iug0.a.r), hka4.b, hka4.c);
                                    if(rect0 != null) {
                                        khb0.c().putParcelable("androidx.compose.ui.semantics.shapeRect", rect0);
                                    }
                                }
                            }
                            else if(ibuq.m(s, "androidx.compose.ui.semantics.shapeCorners")) {
                                hmu hmu2 = (hmu)itz.a(ity0, iuz.O);
                                if(hmu2 != null) {
                                    float[] arr_f = ilt.X(this.T(hmu2, this.S(iug0, ilt.V(khb0), hmu2).b(), iug0.a.r));
                                    if(arr_f != null) {
                                        khb0.c().putFloatArray("androidx.compose.ui.semantics.shapeCorners", arr_f);
                                    }
                                }
                            }
                            else if(ibuq.m(s, "androidx.compose.ui.semantics.shapeRegion")) {
                                hmu hmu3 = (hmu)itz.a(ity0, iuz.O);
                                if(hmu3 != null) {
                                    hka hka5 = this.S(iug0, ilt.V(khb0), hmu3);
                                    Region region0 = ilt.Z(this.T(hmu3, hka5.b(), iug0.a.r), hka5.b, hka5.c);
                                    if(region0 != null) {
                                        khb0.c().putParcelable("androidx.compose.ui.semantics.shapeRegion", region0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void u(ify ify0) {
        if(this.I.add(ify0)) {
            this.J.b(ibom.a);
        }
    }

    public final void v(iqj iqj0) {
        if(!iqj0.A()) {
            return;
        }
        ilp ilp0 = new ilp(iqj0, this);
        this.b.z.a.c(iqj0, this.M, ilp0);
    }

    public final void w(iug iug0, iqk iqk0) {
        int v9;
        List list1;
        bxx bxx0 = new bxx(null);
        List list0 = iug0.i();
        int v = list0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            iug iug1 = (iug)list0.get(v2);
            bxv bxv0 = this.q();
            int v3 = iug1.d;
            if(bxv0.b(v3)) {
                if(!iqk0.b.a(v3)) {
                    this.u(iug0.a);
                    return;
                }
                bxx0.d(v3);
            }
        }
        int[] arr_v = iqk0.b.b;
        long[] arr_v1 = iqk0.b.a;
        int v4 = arr_v1.length - 2;
        if(v4 >= 0) {
            int v5 = 0;
            while(true) {
                long v6 = arr_v1[v5];
                if((~v6 << 7 & v6 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_36;
                }
                for(int v7 = 0; true; ++v7) {
                    int v8 = 8 - (~(v5 - v4) >>> 0x1F);
                    if(v7 >= v8) {
                        break;
                    }
                    if((0xFFL & v6) < 0x80L && !bxx0.a(arr_v[(v5 << 3) + v7])) {
                        this.u(iug0.a);
                        return;
                    }
                    v6 >>= 8;
                }
                if(v8 == 8) {
                label_36:
                    if(v5 != v4) {
                        ++v5;
                        continue;
                    }
                    break;
                }
                else {
                    list1 = iug0.i();
                    v9 = list1.size();
                }
                goto label_44;
            }
        }
        list1 = iug0.i();
        v9 = list1.size();
    label_44:
        for(int v1 = 0; v1 < v9; ++v1) {
            iug iug2 = (iug)list1.get(v1);
            iqk iqk1 = (iqk)this.A.a(iug2.d);
            if(iqk1 != null && this.q().b(iug2.d)) {
                this.w(iug2, iqk1);
            }
        }
    }

    public final void x(int v, int v1, String s) {
        AccessibilityEvent accessibilityEvent0 = this.o(this.m(v), 0x20);
        accessibilityEvent0.setContentChangeTypes(v1);
        if(s != null) {
            accessibilityEvent0.getText().add(s);
        }
        this.P(accessibilityEvent0);
    }

    public final void y(int v) {
        ill ill0 = this.o;
        if(ill0 != null) {
            iug iug0 = ill0.a;
            int v1 = iug0.d;
            if(v != v1) {
                return;
            }
            if(SystemClock.uptimeMillis() - ill0.f <= 1000L) {
                AccessibilityEvent accessibilityEvent0 = this.o(this.m(v1), 0x20000);
                accessibilityEvent0.setFromIndex(ill0.d);
                accessibilityEvent0.setToIndex(ill0.e);
                accessibilityEvent0.setAction(ill0.b);
                accessibilityEvent0.setMovementGranularity(ill0.c);
                accessibilityEvent0.getText().add(ilt.O(iug0));
                this.P(accessibilityEvent0);
            }
        }
        this.o = null;
    }

    public final void z(iug iug0, khb khb0) {
        ArrayList arrayList1;
        ArrayList arrayList0;
        int v5;
        iwj iwj0 = ilx.b(iug0);
        CharSequence charSequence0 = null;
        if(iwj0 != null) {
            jjb jjb0 = this.L;
            jed jed0 = this.b.z();
            jks jks0 = this.b.k();
            SpannableString spannableString0 = new SpannableString(iwj0.b);
            List list0 = iwj0.c;
            if(list0 != null) {
                int v = list0.size();
                int v1 = 0;
                while(v1 < v) {
                    iwh iwh0 = (iwh)list0.get(v1);
                    int v2 = iwh0.b;
                    int v3 = iwh0.c;
                    jat jat0 = jat.g(((jat)iwh0.a), 0L, null, 0xFFDF);
                    jjd.e(spannableString0, jat0.b(), v2, v3);
                    jjd.f(spannableString0, jat0.b, jks0, v2, v3);
                    jeu jeu0 = jat0.c;
                    if(jeu0 != null || jat0.d != null) {
                        if(jeu0 == null) {
                            jeu0 = jeu.h;
                        }
                        int v4 = jat0.d == null ? 0 : jat0.d.a;
                        boolean z = jeu0.a(jeu.c) >= 0;
                        if(v4 != 1) {
                            if(z) {
                                v5 = 1;
                                goto label_32;
                            }
                        }
                        else if(z) {
                            v5 = 3;
                            goto label_32;
                        }
                        v5 = v4 == 1 ? 2 : 0;
                    label_32:
                        spannableString0.setSpan(new StyleSpan(v5), v2, v3, 33);
                    }
                    jdz jdz0 = jat0.f;
                    if(jdz0 != null) {
                        if((jdz0 instanceof jew)) {
                            spannableString0.setSpan(new TypefaceSpan(((jew)jdz0).f), v2, v3, 33);
                        }
                        else {
                            Object object0 = jed0.b(jdz0, jeu.h, 0, (jat0.e == null ? 0xFFFF : jat0.e.a)).a();
                            ibuq.d(object0, "null cannot be cast to non-null type android.graphics.Typeface");
                            spannableString0.setSpan(new TypefaceSpan(((Typeface)object0)), v2, v3, 33);
                        }
                    }
                    jjz jjz0 = jat0.m;
                    if(jjz0 != null) {
                        if(jjz0.a(jjz.b)) {
                            spannableString0.setSpan(new UnderlineSpan(), v2, v3, 33);
                        }
                        if(jjz0.a(jjz.c)) {
                            spannableString0.setSpan(new StrikethroughSpan(), v2, v3, 33);
                        }
                    }
                    jkh jkh0 = jat0.j;
                    if(jkh0 != null) {
                        spannableString0.setSpan(new ScaleXSpan(jkh0.b), v2, v3, 33);
                    }
                    jjd.g(spannableString0, jat0.k, v2, v3);
                    jjd.d(spannableString0, jat0.l, v2, v3);
                    ++v1;
                    v = v;
                }
            }
            int v6 = iwj0.b();
            List list1 = iwj0.a;
            if(list1 == null) {
                arrayList0 = ibps.a;
            }
            else {
                arrayList0 = new ArrayList(list1.size());
                int v7 = list1.size();
                for(int v8 = 0; v8 < v7; ++v8) {
                    Object object1 = list1.get(v8);
                    iwh iwh1 = (iwh)object1;
                    if((iwh1.a instanceof jbp) && iwm.b(0, v6, iwh1.b, iwh1.c)) {
                        arrayList0.add(object1);
                    }
                }
            }
            int v9 = arrayList0.size();
            int v10 = 0;
            while(v10 < v9) {
                iwh iwh2 = (iwh)arrayList0.get(v10);
                jbp jbp0 = (jbp)iwh2.a;
                int v11 = iwh2.b;
                int v12 = iwh2.c;
                if(!(jbp0 instanceof jbp)) {
                    throw new ibnq();
                }
                spannableString0.setSpan(new TtsSpan.VerbatimBuilder(jbp0.a).build(), v11, v12, 33);
                ++v10;
                continue;
            }
            int v13 = iwj0.b();
            if(list1 == null) {
                arrayList1 = ibps.a;
            }
            else {
                arrayList1 = new ArrayList(list1.size());
                int v14 = list1.size();
                for(int v15 = 0; v15 < v14; ++v15) {
                    Object object2 = list1.get(v15);
                    iwh iwh3 = (iwh)object2;
                    if((iwh3.a instanceof jbq) && iwm.b(0, v13, iwh3.b, iwh3.c)) {
                        arrayList1.add(object2);
                    }
                }
            }
            int v16 = arrayList1.size();
            for(int v17 = 0; v17 < v16; ++v17) {
                iwh iwh4 = (iwh)arrayList1.get(v17);
                jbq jbq0 = (jbq)iwh4.a;
                int v18 = iwh4.b;
                int v19 = iwh4.c;
                WeakHashMap weakHashMap0 = jjb0.a;
                Object object3 = weakHashMap0.get(jbq0);
                if(object3 == null) {
                    URLSpan uRLSpan0 = new URLSpan(jbq0.a);
                    weakHashMap0.put(jbq0, uRLSpan0);
                    object3 = uRLSpan0;
                }
                spannableString0.setSpan(((URLSpan)object3), v18, v19, 33);
            }
            List list2 = iwj0.g(iwj0.b());
            int v20 = list2.size();
            for(int v21 = 0; v21 < v20; ++v21) {
                iwh iwh5 = (iwh)list2.get(v21);
                int v22 = iwh5.b;
                int v23 = iwh5.c;
                if(v22 != v23) {
                    Object object4 = iwh5.a;
                    ixa ixa0 = (ixa)object4;
                    if((ixa0 instanceof iwz) && ((iwz)ixa0).c == null) {
                        ibuq.d(object4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        iwh iwh6 = new iwh(((iwz)object4), v22, v23);
                        WeakHashMap weakHashMap1 = jjb0.b;
                        Object object5 = weakHashMap1.get(iwh6);
                        if(object5 == null) {
                            URLSpan uRLSpan1 = new URLSpan(((iwz)iwh6.a).a);
                            weakHashMap1.put(iwh6, uRLSpan1);
                            object5 = uRLSpan1;
                        }
                        spannableString0.setSpan(((URLSpan)object5), v22, v23, 33);
                    }
                    else {
                        WeakHashMap weakHashMap2 = jjb0.c;
                        Object object6 = weakHashMap2.get(iwh5);
                        if(object6 == null) {
                            object6 = new jit(ixa0);
                            weakHashMap2.put(iwh5, object6);
                        }
                        spannableString0.setSpan(((ClickableSpan)object6), v22, v23, 33);
                    }
                }
            }
            charSequence0 = (SpannableString)ilt.N(spannableString0);
        }
        khb0.ab(charSequence0);
    }
}

