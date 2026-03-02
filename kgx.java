import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public final class kgx {
    public static final kgx A;
    public static final kgx B;
    public static final kgx C;
    public static final kgx D;
    public static final kgx E;
    public static final kgx F;
    public static final kgx G;
    public static final kgx H;
    public static final kgx I;
    public static final kgx J;
    public static final kgx K;
    public static final kgx L;
    public static final kgx M;
    final Object N;
    public final int O;
    public final Class P;
    public final kho Q;
    public static final kgx a;
    public static final kgx b;
    public static final kgx c;
    public static final kgx d;
    public static final kgx e;
    public static final kgx f;
    public static final kgx g;
    public static final kgx h;
    public static final kgx i;
    public static final kgx j;
    public static final kgx k;
    public static final kgx l;
    public static final kgx m;
    public static final kgx n;
    public static final kgx o;
    public static final kgx p;
    public static final kgx q;
    public static final kgx r;
    public static final kgx s;
    public static final kgx t;
    public static final kgx u;
    public static final kgx v;
    public static final kgx w;
    public static final kgx x;
    public static final kgx y;
    public static final kgx z;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityNodeInfo$AccessibilityAction0 = null;
        kgx.a = new kgx(1, null);
        kgx.b = new kgx(2, null);
        kgx.c = new kgx(4, null);
        kgx.d = new kgx(8, null);
        kgx.e = new kgx(16, null);
        kgx.f = new kgx(0x20, null);
        kgx.g = new kgx(0x40, null);
        kgx.h = new kgx(0x80, null);
        kgx.i = new kgx(0x100, khh.class);
        kgx.j = new kgx(0x200, khh.class);
        kgx.k = new kgx(0x400, khi.class);
        kgx.l = new kgx(0x800, khi.class);
        kgx.m = new kgx(0x1000, null);
        kgx.n = new kgx(0x2000, null);
        kgx.o = new kgx(0x4000, null);
        kgx.p = new kgx(0x8000, null);
        kgx.q = new kgx(0x10000, null);
        kgx.r = new kgx(0x20000, khm.class);
        kgx.s = new kgx(0x40000, null);
        kgx.t = new kgx(0x80000, null);
        kgx.u = new kgx(0x100000, null);
        kgx.v = new kgx(0x200000, khn.class);
        kgx.w = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 0x1020036, null, null, null);
        kgx.x = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 0x1020037, null, null, khk.class);
        kgx.y = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 0x1020038, null, null, null);
        kgx.z = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 0x1020039, null, null, null);
        kgx.A = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 0x102003A, null, null, null);
        kgx.B = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 0x102003B, null, null, null);
        kgx.C = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, 0x1020046, null, null, null);
        kgx.D = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, 0x1020047, null, null, null);
        kgx.E = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, 0x1020048, null, null, null);
        kgx.F = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, 0x1020049, null, null, null);
        kgx.G = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 0x102003C, null, null, null);
        kgx.H = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 0x102003D, null, null, khl.class);
        kgx.I = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 0x1020042, null, null, khj.class);
        kgx.J = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 0x1020044, null, null, null);
        kgx.K = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 0x1020045, null, null, null);
        kgx.L = new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD, 0x102004A, null, null, null);
        new kgx(AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER, 0x1020054, null, null, null);
        new kgx((Build.VERSION.SDK_INT < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START), 0x1020055, null, null, null);
        new kgx((Build.VERSION.SDK_INT < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP), 0x1020056, null, null, null);
        new kgx((Build.VERSION.SDK_INT < 0x20 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL), 0x1020057, null, null, null);
        new kgx((Build.VERSION.SDK_INT < 33 ? null : AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS), 0x1020058, null, null, null);
        if(Build.VERSION.SDK_INT >= 34) {
            accessibilityNodeInfo$AccessibilityAction0 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
        kgx.M = new kgx(accessibilityNodeInfo$AccessibilityAction0, 0x102005E, null, null, null);
    }

    public kgx(int v, CharSequence charSequence0) {
        this(null, v, charSequence0, null, null);
    }

    private kgx(int v, Class class0) {
        this(null, v, null, null, class0);
    }

    public kgx(Object object0, int v, CharSequence charSequence0, kho kho0, Class class0) {
        this.O = v;
        this.Q = kho0;
        if(object0 == null) {
            object0 = new AccessibilityNodeInfo.AccessibilityAction(v, charSequence0);
        }
        this.N = object0;
        this.P = class0;
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.N).getId();
    }

    public final CharSequence b() {
        return ((AccessibilityNodeInfo.AccessibilityAction)this.N).getLabel();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        return (object0 instanceof kgx) ? this.N.equals(((kgx)object0).N) : false;
    }

    @Override
    public final int hashCode() {
        return this.N.hashCode();
    }

    @Override
    public final String toString() {
        return "AccessibilityActionCompat: " + (!khb.k(this.O).equals("ACTION_UNKNOWN") || this.b() == null ? khb.k(this.O) : this.b().toString());
    }
}

