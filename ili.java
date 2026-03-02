import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode.VmPolicy;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.InputDevice.MotionRange;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver.OnTouchModeChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest.Builder;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.key.KeyInputElement;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.layout.RulerProviderModifierElement;
import androidx.compose.ui.platform.AndroidComposeView.bringIntoViewNode.1;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class ili extends ViewGroup implements hjq, hvp, iik, iio, lom {
    public final igv A;
    public final float[] B;
    public final float[] C;
    public long D;
    public final gra E;
    public ibts F;
    public final jhm G;
    public final htz H;
    public final hud I;
    public final idj J;
    public MotionEvent K;
    public long L;
    public final irb M;
    public final ilb N;
    public boolean O;
    public final itg P;
    public boolean Q;
    public final hio R;
    public final ipc S;
    public final imv T;
    public final inc U;
    public final ikx V;
    public static final bzd W;
    public static Class a;
    private final gui aA;
    private final ViewTreeObserver.OnGlobalLayoutListener aB;
    private final ViewTreeObserver.OnScrollChangedListener aC;
    private final ViewTreeObserver.OnTouchModeChangeListener aD;
    private final jhv aE;
    private final AtomicReference aF;
    private final gra aG;
    private int aH;
    private final gra aI;
    private float aJ;
    private float aK;
    private final Runnable aL;
    private boolean aM;
    private final ipo aN;
    private final ibth aO;
    private boolean aP;
    private final ibth aQ;
    private View aR;
    private final inw aS;
    private final bzd aT;
    public final bxv aa;
    public final hkm ab;
    public final hfv ac;
    private long ad;
    private final boolean ae;
    private final gra af;
    private View ag;
    private final ito ah;
    private final EmptySemanticsElement ai;
    private final AndroidComposeView.bringIntoViewNode.1 aj;
    private final hfc ak;
    private final hfc al;
    private final hlj am;
    private final hze an;
    private boolean ao;
    private final hvq ap;
    private final hwk aq;
    private final ibnn ar;
    private inq as;
    private jkp at;
    private boolean au;
    private long av;
    private final int[] aw;
    private final float[] ax;
    private boolean ay;
    private long az;
    public static Method b;
    public static Runnable c;
    public static Method d;
    public final igb e;
    public final boolean f;
    public ibrt g;
    public final hgr h;
    public final ipz i;
    public final iqy j;
    public final ify k;
    public final ivv l;
    public final iuj m;
    public final ilt n;
    public final hgo o;
    public final ijz p;
    public final hfx q;
    public final List r;
    public List s;
    public boolean t;
    public ibts u;
    public final hfn v;
    public boolean w;
    public final ikb x;
    public final ika y;
    public final iiy z;

    static {
        ili.W = new bzd(null);
    }

    public ili(Context context0, ibrt ibrt0) {
        super(context0);
        this.ad = 0x7FC000007FC00000L;
        this.ae = true;
        this.e = new igb(null);
        jks jks0 = jkm.a(context0);
        gsv gsv0 = gsv.a;
        this.af = new ParcelableSnapshotMutableState(jks0, gsv0);
        boolean z = Build.VERSION.SDK_INT >= 35;
        this.f = z;
        ito ito0 = new ito();
        this.ah = ito0;
        EmptySemanticsElement emptySemanticsElement0 = new EmptySemanticsElement(ito0);
        this.ai = emptySemanticsElement0;
        AndroidComposeView.bringIntoViewNode.1 androidComposeView$bringIntoViewNode$10 = new AndroidComposeView.bringIntoViewNode.1(this);
        this.aj = androidComposeView$bringIntoViewNode$10;
        hio hio0 = new hio(this, this);
        this.R = hio0;
        this.g = ibrt0;
        hgr hgr0 = new hgr();
        this.h = hgr0;
        this.i = new ipz();
        KeyInputElement keyInputElement0 = new KeyInputElement(new iku(this), null);
        this.ak = keyInputElement0;
        RotaryInputElement rotaryInputElement0 = new RotaryInputElement(ilc.a);
        this.al = rotaryInputElement0;
        this.am = new hlj();
        inp inp0 = new inp(ViewConfiguration.get(context0));
        this.j = inp0;
        hze hze0 = new hze();
        this.an = hze0;
        ify ify0 = new ify(false, 3, null);
        ify0.ad(ibz.a);
        ify0.ab(this.k());
        ify0.af(inp0);
        ify0.ae(hex.a(new RulerProviderModifierElement(hze0), emptySemanticsElement0).a(rotaryInputElement0).a(keyInputElement0).a(hio0.c).a(hgr0.c).a(androidComposeView$bringIntoViewNode$10));
        this.k = ify0;
        bxv bxv0 = new bxv(null);
        this.aa = bxv0;
        ivv ivv0 = new ivv(null);
        this.l = ivv0;
        iuj iuj0 = new iuj(ify0, ito0, bxv0);
        this.m = iuj0;
        ilt ilt0 = new ilt(this);
        this.n = ilt0;
        hgo hgo0 = new hgo(this, new ikm(this));
        this.o = hgo0;
        this.p = new ijz(context0);
        this.ab = new hkm(this);
        hfx hfx0 = new hfx();
        this.q = hfx0;
        this.r = new ArrayList();
        this.ap = new hvq();
        this.aq = new hwk(ify0);
        ikw ikw0 = new ikw(this);
        this.ar = ibno.a(ibnp.c, ikw0);
        this.u = ikl.a;
        this.v = new hfn(this, hfx0);
        AutofillManager autofillManager0 = (AutofillManager)context0.getSystemService(AutofillManager.class);
        if(autofillManager0 != null) {
            this.ac = new hfv(new hgc(autofillManager0), iuj0, this, ivv0, "com.google.android.gms");
            Object object0 = context0.getSystemService("clipboard");
            ibuq.d(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
            ikb ikb0 = new ikb(((ClipboardManager)object0));
            this.x = ikb0;
            this.y = new ika(ikb0);
            this.z = new iiy(new ile(this));
            this.A = new igv(ify0);
            this.av = 0x7FFFFFFF7FFFFFFFL;
            this.aw = new int[]{0, 0};
            this.ax = hmb.f();
            this.B = hmb.f();
            this.C = hmb.f();
            this.D = -1L;
            this.az = 0x7F8000007F800000L;
            gul gul0 = gul.a;
            this.E = new ParcelableSnapshotMutableState(null, gul0);
            this.aA = new gpx(new ilh(this), null);
            this.aB = new ikc(this);
            this.aC = () -> {
                int v7;
                boolean z1;
                int[] arr_v = this.aw;
                this.getLocationOnScreen(arr_v);
                int v = jlf.a(this.av);
                int v1 = jlf.b(this.av);
                boolean z = false;
                int v2 = arr_v[0];
                if(v != v2 || v1 != arr_v[1] || this.D < 0L) {
                    this.av = ((long)v2) << 0x20 | ((long)arr_v[1]) & 0xFFFFFFFFL;
                    if(v != 0x7FFFFFFF && v1 != 0x7FFFFFFF) {
                        this.k.v.o.B();
                        z1 = true;
                    }
                    else {
                        z1 = false;
                    }
                }
                else {
                    z1 = false;
                }
                this.G();
                View view0 = this.aR;
                if(view0 == null) {
                    view0 = this.getRootView();
                    this.aR = view0;
                }
                ivv ivv0 = this.l;
                long v3 = this.av;
                long v4 = jlg.b(this.az);
                float[] arr_f = this.B;
                int v5 = view0.getWidth();
                int v6 = view0.getHeight();
                if((ivw.a(arr_f) & 2) != 0) {
                    arr_f = null;
                }
                ivy ivy0 = ivv0.b;
                if(jlf.f(v4, ivy0.b)) {
                    v7 = 0;
                }
                else {
                    ivy0.b = v4;
                    v7 = 1;
                }
                if(!jlf.f(v3, ivy0.c)) {
                    ivy0.c = v3;
                    v7 = 1;
                }
                long v8 = ((long)v5) << 0x20 | ((long)v6) & 0xFFFFFFFFL;
                if(v8 != ivy0.d) {
                    ivy0.d = v8;
                    z = true;
                }
                else if(((arr_f == null ? 1 : 0) ^ 1 | v7) != 0 || ivv0.c) {
                    z = true;
                }
                ivv0.c = z;
                this.A.b(z1);
                ivv0.a();
            };
            this.aD = new ike(this);
            jhv jhv0 = new jhv(this, this);
            this.aE = jhv0;
            jhm jhm0 = new jhm(jhv0);
            this.G = jhm0;
            this.aF = new AtomicReference(null);
            this.S = new ipc(jhm0);
            this.T = new imv();
            this.aG = new ParcelableSnapshotMutableState(jef.a(context0), gsv0);
            this.aH = context0.getResources().getConfiguration().fontWeightAdjustment;
            jlm jlm0 = hie.c(context0.getResources().getConfiguration().getLayoutDirection());
            if(jlm0 == null) {
                jlm0 = jlm.a;
            }
            this.aI = new ParcelableSnapshotMutableState(jlm0, gul0);
            this.H = new hub(this);
            this.I = new hud((this.isInTouchMode() ? 1 : 2));
            this.J = new idj(this);
            this.U = new inc();
            this.M = new irb();
            this.aT = new bzd(null);
            this.N = new ilb(this);
            this.aL = new ikf(this);
            this.aN = new ipo(context0, new iks(this));
            this.aO = new ila(this);
            this.aS = new inw();
            this.addOnAttachStateChangeListener(hgo0);
            this.setWillNotDraw(false);
            this.setFocusable(true);
            imc.a.a(this, 1, false);
            this.setFocusableInTouchMode(true);
            this.setClipChildren(false);
            kfe.j(this, ilt0);
            this.setOnDragListener(hgr0);
            ify0.B(this);
            ily.a.a(this);
            if(z) {
                View view0 = new View(context0);
                view0.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
                view0.setTag(0x7F0B167B, Boolean.valueOf(true));  // id:hide_in_inspector_tag
                this.ag = view0;
                this.addView(view0);
            }
            this.P = new itg();
            this.aQ = new ikk(this);
            this.V = new ikx(this);
            return;
        }
        hxt.b("Autofill service could not be located.");
        throw new ibnm();
    }

    @Override  // iio
    public final void A() {
        this.ao = true;
    }

    public final int B(MotionEvent motionEvent0) {
        Object object1;
        if(this.aP) {
            this.aP = false;
            ipz.e(motionEvent0.getMetaState());
        }
        hvq hvq0 = this.ap;
        hwh hwh0 = hvq0.a(motionEvent0, this);
        if(hwh0 != null) {
            List list0 = hwh0.a;
            int v = list0.size() - 1;
            if(v >= 0) {
                while(true) {
                    Object object0 = list0.get(v);
                    if(((hwj)object0).e) {
                        object1 = object0;
                        goto label_19;
                    }
                    if(v - 1 < 0) {
                        break;
                    }
                    --v;
                }
            }
            object1 = null;
        label_19:
            if(((hwj)object1) != null) {
                this.ad = ((hwj)object1).d;
            }
            boolean z = this.V(motionEvent0);
            int v1 = this.aq.a(hwh0, this, z);
            hwh0.b = null;
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    if((v1 & 1) == 0) {
                        hvq0.b(motionEvent0.getPointerId(motionEvent0.getActionIndex()));
                    }
                    return v1;
                }
                default: {
                    return v1;
                }
            }
        }
        this.aq.b();
        return 0;
    }

    public final iki C() {
        return (iki)this.aA.a();
    }

    public final inq D() {
        if(this.as == null) {
            inq inq0 = new inq(this.getContext());
            this.as = inq0;
            this.addView(inq0);
            this.requestLayout();
        }
        inq inq1 = this.as;
        ibuq.c(inq1);
        return inq1;
    }

    public final void E(int v, AccessibilityNodeInfo accessibilityNodeInfo0, String s) {
        ilt ilt0 = this.n;
        if(ibuq.m(s, ilt0.p)) {
            int v1 = ilt0.y.d(v);
            if(v1 != -1) {
                accessibilityNodeInfo0.getExtras().putInt(s, v1);
            }
        }
        else if(ibuq.m(s, ilt0.q)) {
            int v2 = ilt0.z.d(v);
            if(v2 != -1) {
                accessibilityNodeInfo0.getExtras().putInt(s, v2);
            }
        }
    }

    public final void F(ify ify0) {
        ify0.K();
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            this.F(((ify)arr_object[v1]));
        }
    }

    public final void G() {
        if(!this.ay) {
            long v = AnimationUtils.currentAnimationTimeMillis();
            if(v != this.D) {
                this.D = v;
                this.R();
                ViewParent viewParent0 = this.getParent();
                View view0 = this;
                while((viewParent0 instanceof ViewGroup)) {
                    view0 = (View)viewParent0;
                    viewParent0 = ((ViewGroup)view0).getParent();
                }
                view0.getLocationOnScreen(this.aw);
                float f = (float)this.aw[0];
                float f1 = (float)this.aw[1];
                view0.getLocationInWindow(this.aw);
                this.az = ((long)Float.floatToRawIntBits(f - ((float)this.aw[0]))) << 0x20 | ((long)Float.floatToRawIntBits(f1 - ((float)this.aw[1]))) & 0xFFFFFFFFL;
            }
        }
    }

    public final void H(MotionEvent motionEvent0, int v, long v1, boolean z) {
        int v2 = -1;
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                if(v != 9 && v != 10) {
                    v2 = 0;
                }
                break;
            }
            case 6: {
                v2 = motionEvent0.getActionIndex();
            }
        }
        int v3 = motionEvent0.getPointerCount() - (v2 < 0 ? 0 : 1);
        if(v3 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] arr_motionEvent$PointerProperties = new MotionEvent.PointerProperties[v3];
        for(int v4 = 0; v4 < v3; ++v4) {
            arr_motionEvent$PointerProperties[v4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] arr_motionEvent$PointerCoords = new MotionEvent.PointerCoords[v3];
        for(int v5 = 0; v5 < v3; ++v5) {
            arr_motionEvent$PointerCoords[v5] = new MotionEvent.PointerCoords();
        }
        for(int v6 = 0; v6 < v3; ++v6) {
            int v7 = (v2 < 0 || v6 < v2 ? 0 : 1) + v6;
            motionEvent0.getPointerProperties(v7, arr_motionEvent$PointerProperties[v6]);
            MotionEvent.PointerCoords motionEvent$PointerCoords0 = arr_motionEvent$PointerCoords[v6];
            motionEvent0.getPointerCoords(v7, motionEvent$PointerCoords0);
            long v8 = this.f(((long)Float.floatToRawIntBits(motionEvent$PointerCoords0.y)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(motionEvent$PointerCoords0.x)) << 0x20);
            motionEvent$PointerCoords0.x = Float.intBitsToFloat(((int)(v8 >> 0x20)));
            motionEvent$PointerCoords0.y = Float.intBitsToFloat(((int)(v8 & 0xFFFFFFFFL)));
        }
        int v9 = z ? 0 : motionEvent0.getButtonState();
        MotionEvent motionEvent1 = MotionEvent.obtain((motionEvent0.getDownTime() == motionEvent0.getEventTime() ? v1 : motionEvent0.getDownTime()), v1, v, v3, arr_motionEvent$PointerProperties, arr_motionEvent$PointerCoords, motionEvent0.getMetaState(), v9, motionEvent0.getXPrecision(), motionEvent0.getYPrecision(), motionEvent0.getDeviceId(), motionEvent0.getEdgeFlags(), motionEvent0.getSource(), motionEvent0.getFlags());
        hwh hwh0 = this.ap.a(motionEvent1, this);
        ibuq.c(hwh0);
        this.aq.a(hwh0, this, true);
        motionEvent1.recycle();
    }

    // Detected as a lambda impl.
    public final void I() {
        int v7;
        boolean z1;
        int[] arr_v = this.aw;
        this.getLocationOnScreen(arr_v);
        int v = jlf.a(this.av);
        int v1 = jlf.b(this.av);
        boolean z = false;
        int v2 = arr_v[0];
        if(v != v2 || v1 != arr_v[1] || this.D < 0L) {
            this.av = ((long)v2) << 0x20 | ((long)arr_v[1]) & 0xFFFFFFFFL;
            if(v != 0x7FFFFFFF && v1 != 0x7FFFFFFF) {
                this.k.v.o.B();
                z1 = true;
            }
            else {
                z1 = false;
            }
        }
        else {
            z1 = false;
        }
        this.G();
        View view0 = this.aR;
        if(view0 == null) {
            view0 = this.getRootView();
            this.aR = view0;
        }
        ivv ivv0 = this.l;
        long v3 = this.av;
        long v4 = jlg.b(this.az);
        float[] arr_f = this.B;
        int v5 = view0.getWidth();
        int v6 = view0.getHeight();
        if((ivw.a(arr_f) & 2) != 0) {
            arr_f = null;
        }
        ivy ivy0 = ivv0.b;
        if(jlf.f(v4, ivy0.b)) {
            v7 = 0;
        }
        else {
            ivy0.b = v4;
            v7 = 1;
        }
        if(!jlf.f(v3, ivy0.c)) {
            ivy0.c = v3;
            v7 = 1;
        }
        long v8 = ((long)v5) << 0x20 | ((long)v6) & 0xFFFFFFFFL;
        if(v8 != ivy0.d) {
            ivy0.d = v8;
            z = true;
        }
        else if(((arr_f == null ? 1 : 0) ^ 1 | v7) != 0 || ivv0.c) {
            z = true;
        }
        ivv0.c = z;
        this.A.b(z1);
        ivv0.a();
    }

    public static final boolean J(ili ili0, MotionEvent motionEvent0) {
        return ili0.super.dispatchGenericMotionEvent(motionEvent0);
    }

    public static final boolean K(ili ili0, KeyEvent keyEvent0) {
        return ili0.super.dispatchKeyEvent(keyEvent0);
    }

    public static void L(ili ili0) {
        ili0.S(null);
    }

    static void M(ili ili0, MotionEvent motionEvent0, int v, long v1) {
        ili0.H(motionEvent0, v, v1, true);
    }

    private final int N(MotionEvent motionEvent0) {
        int v5;
        this.removeCallbacks(this.N);
        try {
            this.D = AnimationUtils.currentAnimationTimeMillis();
            this.R();
            float f = motionEvent0.getX();
            long v = ((long)Float.floatToRawIntBits(motionEvent0.getY())) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
            long v1 = hmb.a(this.B, v);
            this.az = ((long)Float.floatToRawIntBits(motionEvent0.getRawX() - Float.intBitsToFloat(((int)(v1 >> 0x20))))) << 0x20 | ((long)Float.floatToRawIntBits(motionEvent0.getRawY() - Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))))) & 0xFFFFFFFFL;
            boolean z = true;
            this.ay = true;
            this.o(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int v3 = motionEvent0.getActionMasked();
                MotionEvent motionEvent1 = this.K;
                boolean z1 = motionEvent1 != null && motionEvent1.getToolType(0) == 3;
                if(motionEvent1 != null && ili.X(motionEvent0, motionEvent1)) {
                    if(motionEvent1.getButtonState() == 0) {
                        switch(motionEvent1.getActionMasked()) {
                            case 0: 
                            case 2: 
                            case 6: {
                                this.aq.b();
                                break;
                            }
                            default: {
                                if(motionEvent1.getActionMasked() != 10 && z1) {
                                    ili.M(this, motionEvent1, 10, motionEvent1.getEventTime());
                                }
                            }
                        }
                    }
                    else {
                        this.aq.b();
                    }
                }
                if(!z1 && motionEvent0.getToolType(0) == 3 && (v3 != 3 && v3 != 9) && this.V(motionEvent0)) {
                    ili.M(this, motionEvent0, 9, motionEvent0.getEventTime());
                }
                if(motionEvent1 != null) {
                    motionEvent1.recycle();
                }
                if(this.K != null && this.K.getAction() == 10) {
                    int v4 = this.K == null ? -1 : this.K.getPointerId(0);
                    if(motionEvent0.getAction() != 9 || motionEvent0.getHistorySize() != 0) {
                        if(motionEvent0.getAction() == 0 && motionEvent0.getHistorySize() == 0) {
                            float f1 = NaNf;
                            float f2 = this.K == null ? NaNf : this.K.getX();
                            MotionEvent motionEvent2 = this.K;
                            if(motionEvent2 != null) {
                                f1 = motionEvent2.getY();
                            }
                            if(f2 == motionEvent0.getX() && f1 == motionEvent0.getY()) {
                                z = false;
                            }
                            if(z || (this.K == null ? -1L : this.K.getEventTime()) != motionEvent0.getEventTime()) {
                                if(v4 >= 0) {
                                    this.ap.b(v4);
                                }
                                this.aq.a.a();
                            }
                        }
                    }
                    else if(v4 >= 0) {
                        this.ap.b(v4);
                    }
                }
                this.K = MotionEvent.obtainNoHistory(motionEvent0);
                v5 = this.B(motionEvent0);
            }
            finally {
                Trace.endSection();
            }
            this.ay = false;
            return v5;
        }
        catch(Throwable throwable0) {
            this.ay = false;
            throw throwable0;
        }
    }

    private final void O(ViewGroup viewGroup0) {
        int v = viewGroup0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = viewGroup0.getChildAt(v1);
            if((view0 instanceof ili)) {
                ((ili)view0).q();
            }
            else if((view0 instanceof ViewGroup)) {
                this.O(((ViewGroup)view0));
            }
        }
    }

    private final void P() {
        if(this.ao) {
            this.getViewTreeObserver().dispatchOnGlobalLayout();
            this.ao = false;
        }
    }

    private final void Q(ify ify0) {
        this.A.j(ify0, false);
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        for(int v = 0; v < v1; ++v) {
            this.Q(((ify)arr_object[v]));
        }
    }

    private final void R() {
        this.aS.a(this, this.B);
        ipx.a(this.B, this.C);
    }

    private final void S(ify ify0) {
        if(!this.isLayoutRequested() && this.isAttachedToWindow()) {
            if(ify0 != null) {
                while(ify0 != null && ify0.aD() == 1) {
                    if(this.au) {
                        ify0 = ify0.n();
                        continue;
                    }
                    else {
                        ify ify1 = ify0.n();
                        if(ify1 != null) {
                            long v = ify1.r().d;
                            if(!jkp.l(v) || !jkp.k(v)) {
                                ify0 = ify0.n();
                                continue;
                            }
                        }
                    }
                    break;
                }
                if(ify0 == this.k) {
                    this.requestLayout();
                    return;
                }
            }
            if(this.getWidth() != 0 && this.getHeight() != 0) {
                this.invalidate();
                return;
            }
            this.requestLayout();
        }
    }

    private final void T() {
        if(this.isAttachedToWindow() && (this.o.n() && (this.o.i.b != 0 || this.o.j.b != 0 || !this.o.b.isEmpty()) && !this.Q)) {
            this.h(this.aQ);
            this.Q = true;
        }
    }

    private final void U() {
        gra gra0 = this.i.a;
        if(gra0 != null) {
            gra0.b(new jlk(inr.a(this)));
        }
    }

    private final boolean V(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        return Float.compare(f, 0.0f) >= 0 && f <= ((float)this.getWidth()) && f1 >= 0.0f && f1 <= ((float)this.getHeight());
    }

    private final boolean W(MotionEvent motionEvent0) {
        if(motionEvent0.getPointerCount() != 1) {
            return true;
        }
        MotionEvent motionEvent1 = this.K;
        return motionEvent1 == null || motionEvent1.getPointerCount() != motionEvent0.getPointerCount() || motionEvent0.getRawX() != motionEvent1.getRawX() || motionEvent0.getRawY() != motionEvent1.getRawY();
    }

    private static final boolean X(MotionEvent motionEvent0, MotionEvent motionEvent1) {
        return motionEvent1.getSource() != motionEvent0.getSource() || motionEvent1.getToolType(0) != motionEvent0.getToolType(0);
    }

    private static final boolean Y(MotionEvent motionEvent0) {
        boolean z = (Float.floatToRawIntBits(motionEvent0.getX()) & 0x7FFFFFFF) >= 0x7F800000 || (Float.floatToRawIntBits(motionEvent0.getY()) & 0x7FFFFFFF) >= 0x7F800000 || (Float.floatToRawIntBits(motionEvent0.getRawX()) & 0x7FFFFFFF) >= 0x7F800000 || (Float.floatToRawIntBits(motionEvent0.getRawY()) & 0x7FFFFFFF) >= 0x7F800000;
        if(!z) {
            int v = motionEvent0.getPointerCount();
            for(int v1 = 1; v1 < v; ++v1) {
                z = (Float.floatToRawIntBits(motionEvent0.getX(v1)) & 0x7FFFFFFF) >= 0x7F800000 || (Float.floatToRawIntBits(motionEvent0.getY(v1)) & 0x7FFFFFFF) >= 0x7F800000 || !iqb.a.a(motionEvent0, v1);
                if(z) {
                    break;
                }
            }
        }
        return z;
    }

    // String Decryptor: 1 succeeded, 0 failed
    private static final long Z(int v, int v1) {
        return ((long)v1) | ((long)v) << 0x20;
    }

    @Override  // hjq
    public final hka a() {
        if(this.isFocused()) {
            return this.R.c();
        }
        View view0 = this.findFocus();
        return view0 == null ? null : hie.b(view0, this);
    }

    private static final long aa(int v) {
        int v1 = View.MeasureSpec.getMode(v);
        int v2 = View.MeasureSpec.getSize(v);
        switch(v1) {
            case 0x80000000: {
                return ili.Z(0, v2);
            }
            case 0: {
                return 0x7FFFFFFFL;
            }
            default: {
                if(v1 == 0x40000000) {
                    return ili.Z(v2, v2);
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void addFocusables(ArrayList arrayList0, int v, int v1) {
        hji hji0 = this.R.a;
        if(hji0.B) {
            if(!hji0.r.B) {
                hxt.d("visitSubtreeIf called on an unattached node");
            }
            gwq gwq0 = new gwq(new hfb[16]);
            hfb hfb0 = hji0.r;
            hfb hfb1 = hfb0.v;
            if(hfb1 == null) {
                ien.j(gwq0, hfb0);
            }
            else {
                gwq0.n(hfb1);
            }
        alab1:
            int v2;
            while((v2 = gwq0.b) != 0) {
                hfb hfb2 = (hfb)gwq0.c(v2 - 1);
                if((hfb2.t & 0x400) != 0) {
                    hfb hfb3 = hfb2;
                    while(hfb3 != null && hfb3.B) {
                        if((hfb3.s & 0x400) != 0) {
                            hfb hfb4 = hfb3;
                            gwq gwq1 = null;
                            while(true) {
                                int v3 = 0;
                                if(hfb4 == null) {
                                    break;
                                }
                                if((hfb4 instanceof hji)) {
                                    if(((hji)hfb4).B && ((hiu)((hji)hfb4).a()).a) {
                                        super.addFocusables(arrayList0, v, v1);
                                        if(hji0.B) {
                                            if(!hji0.r.B) {
                                                hxt.d("visitSubtreeIf called on an unattached node");
                                            }
                                            gwq gwq2 = new gwq(new hfb[16]);
                                            hfb hfb5 = hji0.r;
                                            hfb hfb6 = hfb5.v;
                                            if(hfb6 == null) {
                                                ien.j(gwq2, hfb5);
                                            }
                                            else {
                                                gwq2.n(hfb6);
                                            }
                                            while(true) {
                                                int v4 = gwq2.b;
                                                if(v4 == 0) {
                                                    goto label_74;
                                                }
                                                hfb hfb7 = (hfb)gwq2.c(v4 - 1);
                                                if((hfb7.t & 0x400) != 0) {
                                                    hfb hfb8 = hfb7;
                                                    while(hfb8 != null && hfb8.B) {
                                                        if((hfb8.s & 0x400) != 0) {
                                                            hfb hfb9 = hfb8;
                                                            gwq gwq3 = null;
                                                            while(hfb9 != null) {
                                                                if(!(hfb9 instanceof hji)) {
                                                                    if((hfb9.s & 0x400) != 0 && (hfb9 instanceof iep)) {
                                                                        hfb hfb10 = ((iep)hfb9).D;
                                                                        int v5 = 0;
                                                                        while(hfb10 != null) {
                                                                            if((hfb10.s & 0x400) != 0) {
                                                                                ++v5;
                                                                                if(v5 == 1) {
                                                                                    hfb9 = hfb10;
                                                                                }
                                                                                else {
                                                                                    if(gwq3 == null) {
                                                                                        gwq3 = new gwq(new hfb[16]);
                                                                                    }
                                                                                    if(hfb9 != null) {
                                                                                        gwq3.n(hfb9);
                                                                                    }
                                                                                    gwq3.n(hfb10);
                                                                                    hfb9 = null;
                                                                                }
                                                                            }
                                                                            hfb10 = hfb10.v;
                                                                        }
                                                                        if(v5 != 1) {
                                                                            goto label_68;
                                                                        }
                                                                        continue;
                                                                    }
                                                                }
                                                                else if(((hji)hfb9).B) {
                                                                    hir hir0 = ((hji)hfb9).a();
                                                                    if(((hji)hfb9).B && !((hji)hfb9).a && ((hiu)hir0).a) {
                                                                        break alab1;
                                                                    }
                                                                }
                                                            label_68:
                                                                hfb9 = ien.a(gwq3);
                                                            }
                                                        }
                                                        hfb8 = hfb8.v;
                                                    }
                                                }
                                                ien.j(gwq2, hfb7);
                                            }
                                        }
                                        else {
                                        label_74:
                                            if(arrayList0 != null) {
                                                goto label_75;
                                            }
                                            break alab1;
                                        }
                                    label_75:
                                        arrayList0.remove(this);
                                        return;
                                    }
                                }
                                else if((hfb4.s & 0x400) != 0 && (hfb4 instanceof iep)) {
                                    hfb hfb11;
                                    for(hfb11 = ((iep)hfb4).D; hfb11 != null; hfb11 = hfb11.v) {
                                        if((hfb11.s & 0x400) != 0) {
                                            ++v3;
                                            if(v3 == 1) {
                                                hfb4 = hfb11;
                                            }
                                            else {
                                                if(gwq1 == null) {
                                                    gwq1 = new gwq(new hfb[16]);
                                                }
                                                if(hfb4 != null) {
                                                    gwq1.n(hfb4);
                                                }
                                                gwq1.n(hfb11);
                                                hfb4 = null;
                                            }
                                        }
                                    }
                                    if(v3 != 1) {
                                        goto label_94;
                                    }
                                    continue;
                                }
                            label_94:
                                hfb4 = ien.a(gwq1);
                            }
                        }
                        hfb3 = hfb3.v;
                    }
                }
                ien.j(gwq0, hfb2);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0) {
        this.addView(view0, -1);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v) {
        ibuq.c(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
        }
        this.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, int v1) {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.generateDefaultLayoutParams();
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v1;
        this.addView(view0, -1, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.addViewInLayout(view0, v, viewGroup$LayoutParams0, true);
    }

    @Override  // android.view.ViewGroup
    public final void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.addView(view0, -1, viewGroup$LayoutParams0);
    }

    @Override  // android.view.View
    public final void autofill(SparseArray sparseArray0) {
        hfv hfv0 = this.ac;
        int v = 0;
        if(hfv0 != null) {
            int v1 = sparseArray0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = sparseArray0.keyAt(v2);
                AutofillValue autofillValue0 = (AutofillValue)sparseArray0.get(v3);
                if(autofillValue0.isText()) {
                    ify ify0 = (ify)hfv0.a.b.a(v3);
                    if(ify0 != null) {
                        ity ity0 = ify0.u();
                        if(ity0 != null) {
                            itj itj0 = (itj)itz.a(ity0, itw.g);
                            if(itj0 != null) {
                                ibts ibts0 = (ibts)itj0.b;
                                if(ibts0 != null) {
                                    Boolean boolean0 = (Boolean)ibts0.a(new iwj(autofillValue0.getTextValue().toString()));
                                }
                            }
                        }
                    }
                }
                else if(autofillValue0.isDate()) {
                    Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                }
                else if(autofillValue0.isList()) {
                    Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                }
                else if(autofillValue0.isToggle()) {
                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                }
            }
        }
        hfn hfn0 = this.v;
        if(hfn0 != null) {
            Map map0 = hfn0.b.a;
            if(!map0.isEmpty()) {
                int v4 = sparseArray0.size();
                while(v < v4) {
                    int v5 = sparseArray0.keyAt(v);
                    AutofillValue autofillValue1 = (AutofillValue)sparseArray0.get(v5);
                    if(autofillValue1.isText()) {
                        autofillValue1.getTextValue();
                        if(((hfw)map0.get(Integer.valueOf(v5))) != null) {
                            throw null;
                        }
                        ++v;
                        continue;
                    }
                    if(autofillValue1.isDate()) {
                        throw new ibnr("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if(autofillValue1.isList()) {
                        throw new ibnr("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if(autofillValue1.isToggle()) {
                        throw new ibnr("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                    ++v;
                    continue;
                }
            }
        }
    }

    @Override  // hjq
    public final void b() {
        if(!this.isFocused() && !this.hasFocus()) {
            if(this.hasFocus()) {
                View view0 = this.findFocus();
                if(view0 != null) {
                    view0.clearFocus();
                }
                super.clearFocus();
            }
            return;
        }
        super.clearFocus();
    }

    @Override  // hjq
    public final boolean c(int v) {
        if(v != 7 && v != 8) {
            Integer integer0 = hie.d(v);
            if(integer0 != null) {
                int v1 = integer0.intValue();
                hji hji0 = this.R.b();
                if(hji0 == null) {
                    throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
                }
                Integer integer1 = hie.d(v);
                if(integer1 != null) {
                    int v2 = integer1.intValue();
                    View view0 = ien.d(hji0).i();
                    View view1 = this.findFocus();
                    FocusFinder focusFinder0 = FocusFinder.getInstance();
                    View view2 = this.getRootView();
                    ibuq.d(view2, "null cannot be cast to non-null type android.view.ViewGroup");
                    View view3 = focusFinder0.findNextFocus(((ViewGroup)view2), view1, v2);
                    if(view3 == null || view0 == null || !imd.b(view0, view3)) {
                        view3 = null;
                    }
                    return view3 == null ? false : hie.e(view3, Integer.valueOf(v1), null);
                }
                hxt.b("Invalid focus direction");
                throw new ibnm();
            }
            hxt.b("Invalid focus direction");
            throw new ibnm();
        }
        return false;
    }

    @Override  // android.view.View
    public final boolean canScrollHorizontally(int v) {
        return this.n.B(false, v, this.ad);
    }

    @Override  // android.view.View
    public final boolean canScrollVertically(int v) {
        return this.n.B(true, v, this.ad);
    }

    @Override  // hjq
    public final boolean d() {
        return this.isFocused() ? true : super.requestFocus(130, null);
    }

    @Override  // android.view.ViewGroup
    protected final void dispatchDraw(Canvas canvas0) {
        if(!this.isAttachedToWindow()) {
            this.F(this.k);
        }
        iim.a(this);
        hbl.c();
        this.t = true;
        Canvas canvas1 = this.am.a.a;
        this.am.a.a = canvas0;
        View view0 = null;
        this.k.F(this.am.a, null);
        this.am.a.a = canvas1;
        List list0 = this.r;
        if(!list0.isEmpty()) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((iil)list0.get(v1)).j();
            }
        }
        list0.clear();
        this.t = false;
        List list1 = this.s;
        if(list1 != null) {
            list0.addAll(list1);
            list1.clear();
        }
        if(this.f) {
            inu.a(this, this.aJ);
            View view1 = this.ag;
            if(view1 == null) {
                ibuq.j("frameRateCategoryView");
                view1 = null;
            }
            inu.a(view1, this.aK);
            if(!Float.isNaN(this.aK)) {
                View view2 = this.ag;
                if(view2 == null) {
                    ibuq.j("frameRateCategoryView");
                    view2 = null;
                }
                view2.invalidate();
                View view3 = this.ag;
                if(view3 == null) {
                    ibuq.j("frameRateCategoryView");
                }
                else {
                    view0 = view3;
                }
                this.drawChild(canvas0, view0, this.getDrawingTime());
            }
            this.aJ = NaNf;
            this.aK = NaNf;
        }
        this.l.a();
    }

    @Override  // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        if(this.O) {
            Runnable runnable0 = this.aL;
            this.removeCallbacks(runnable0);
            if(motionEvent0.getActionMasked() == 8) {
                this.O = false;
            }
            else {
                runnable0.run();
            }
        }
        if(!ili.Y(motionEvent0) && this.isAttachedToWindow()) {
            if(motionEvent0.getActionMasked() == 8) {
                if(motionEvent0.isFromSource(0x400000)) {
                    ViewConfiguration viewConfiguration0 = ViewConfiguration.get(this.getContext());
                    float f = -motionEvent0.getAxisValue(26);
                    this.getContext();
                    float f1 = f * viewConfiguration0.getScaledVerticalScrollFactor();
                    this.getContext();
                    hxs hxs0 = new hxs(f1, f * viewConfiguration0.getScaledHorizontalScrollFactor(), motionEvent0.getEventTime(), motionEvent0.getDeviceId());
                    hio hio0 = this.R;
                    ikr ikr0 = new ikr(this, motionEvent0);
                    if(hio0.b.a) {
                        System.out.println("FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                        return false;
                    }
                    hji hji0 = hio0.a();
                    if(hji0 == null) {
                        iem0 = null;
                    }
                    else {
                        if(!hji0.r.B) {
                            hxt.d("visitAncestors called on an unattached node");
                        }
                        hfb hfb0 = hji0.r;
                        ify ify0 = ien.d(hji0);
                    alab1:
                        while(true) {
                            hfb hfb1 = null;
                            if(ify0 != null) {
                                if((ify0.u.f.t & 0x4000) != 0) {
                                    while(hfb0 != null) {
                                        if((hfb0.s & 0x4000) != 0) {
                                            hfb1 = hfb0;
                                            gwq gwq0 = null;
                                            while(hfb1 != null) {
                                                if((hfb1 instanceof hxq)) {
                                                    break alab1;
                                                }
                                                if((hfb1.s & 0x4000) != 0 && (hfb1 instanceof iep)) {
                                                    hfb hfb2 = ((iep)hfb1).D;
                                                    int v = 0;
                                                    while(hfb2 != null) {
                                                        if((hfb2.s & 0x4000) != 0) {
                                                            ++v;
                                                            if(v == 1) {
                                                                hfb1 = hfb2;
                                                            }
                                                            else {
                                                                if(gwq0 == null) {
                                                                    gwq0 = new gwq(new hfb[16]);
                                                                }
                                                                if(hfb1 != null) {
                                                                    gwq0.n(hfb1);
                                                                }
                                                                gwq0.n(hfb2);
                                                                hfb1 = null;
                                                            }
                                                        }
                                                        hfb2 = hfb2.v;
                                                    }
                                                    if(v != 1) {
                                                        goto label_54;
                                                    }
                                                    continue;
                                                }
                                            label_54:
                                                hfb1 = ien.a(gwq0);
                                            }
                                        }
                                        hfb0 = hfb0.u;
                                    }
                                }
                                ify0 = ify0.n();
                                if(ify0 != null) {
                                    ihl ihl0 = ify0.u;
                                    if(ihl0 != null) {
                                        hfb0 = ihl0.e;
                                        continue;
                                    }
                                }
                                hfb0 = null;
                                continue;
                            }
                            break;
                        }
                        iem iem0 = (hxq)hfb1;
                    }
                    if(iem0 != null) {
                        if(!iem0.I().B) {
                            hxt.d("visitAncestors called on an unattached node");
                        }
                        hfb hfb3 = iem0.I().u;
                        ify ify1 = ien.d(iem0);
                        Collection collection0 = null;
                        while(ify1 != null) {
                            if((ify1.u.f.t & 0x4000) != 0) {
                                while(hfb3 != null) {
                                    if((hfb3.s & 0x4000) != 0) {
                                        hfb hfb4 = hfb3;
                                        gwq gwq1 = null;
                                        while(hfb4 != null) {
                                            if((hfb4 instanceof hxq)) {
                                                if(collection0 == null) {
                                                    collection0 = new ArrayList();
                                                }
                                                ((List)collection0).add(hfb4);
                                            }
                                            else if((hfb4.s & 0x4000) != 0 && (hfb4 instanceof iep)) {
                                                hfb hfb5 = ((iep)hfb4).D;
                                                int v1 = 0;
                                                while(hfb5 != null) {
                                                    if((hfb5.s & 0x4000) != 0) {
                                                        ++v1;
                                                        if(v1 == 1) {
                                                            hfb4 = hfb5;
                                                        }
                                                        else {
                                                            if(gwq1 == null) {
                                                                gwq1 = new gwq(new hfb[16]);
                                                            }
                                                            if(hfb4 != null) {
                                                                gwq1.n(hfb4);
                                                            }
                                                            gwq1.n(hfb5);
                                                            hfb4 = null;
                                                        }
                                                    }
                                                    hfb5 = hfb5.v;
                                                }
                                                if(v1 != 1) {
                                                    goto label_106;
                                                }
                                                continue;
                                            }
                                        label_106:
                                            hfb4 = ien.a(gwq1);
                                        }
                                    }
                                    hfb3 = hfb3.u;
                                }
                            }
                            ify1 = ify1.n();
                            if(ify1 != null) {
                                ihl ihl1 = ify1.u;
                                if(ihl1 != null) {
                                    hfb3 = ihl1.e;
                                    continue;
                                }
                            }
                            hfb3 = null;
                        }
                        if(collection0 == null) {
                        label_126:
                            hfb hfb6 = iem0.I();
                            gwq gwq2 = null;
                        }
                        else {
                            int v2 = collection0.size() - 1;
                            if(v2 >= 0) {
                                while(true) {
                                    if(((hxq)((List)collection0).get(v2)).a(hxs0)) {
                                        return true;
                                    }
                                    if(v2 - 1 < 0) {
                                        goto label_126;
                                    }
                                    --v2;
                                }
                            }
                            else {
                                goto label_126;
                            }
                        }
                        while(hfb6 != null) {
                            if((hfb6 instanceof hxq)) {
                                if(((hxq)hfb6).a(hxs0)) {
                                    return true;
                                }
                            }
                            else if((hfb6.s & 0x4000) != 0 && (hfb6 instanceof iep)) {
                                hfb hfb7 = ((iep)hfb6).D;
                                int v3 = 0;
                                while(hfb7 != null) {
                                    if((hfb7.s & 0x4000) != 0) {
                                        ++v3;
                                        if(v3 == 1) {
                                            hfb6 = hfb7;
                                        }
                                        else {
                                            if(gwq2 == null) {
                                                gwq2 = new gwq(new hfb[16]);
                                            }
                                            if(hfb6 != null) {
                                                gwq2.n(hfb6);
                                            }
                                            gwq2.n(hfb7);
                                            hfb6 = null;
                                        }
                                    }
                                    hfb7 = hfb7.v;
                                }
                                if(v3 != 1) {
                                    goto label_150;
                                }
                                continue;
                            }
                        label_150:
                            hfb6 = ien.a(gwq2);
                        }
                        if(((Boolean)ikr0.a()).booleanValue()) {
                            return true;
                        }
                        hfb hfb8 = iem0.I();
                        gwq gwq3 = null;
                        while(hfb8 != null) {
                            if((hfb8 instanceof hxq)) {
                                ((hxq)hfb8).b(hxs0);
                            }
                            else if((hfb8.s & 0x4000) != 0 && (hfb8 instanceof iep)) {
                                hfb hfb9 = ((iep)hfb8).D;
                                int v4 = 0;
                                while(hfb9 != null) {
                                    if((hfb9.s & 0x4000) != 0) {
                                        ++v4;
                                        if(v4 == 1) {
                                            hfb8 = hfb9;
                                        }
                                        else {
                                            if(gwq3 == null) {
                                                gwq3 = new gwq(new hfb[16]);
                                            }
                                            if(hfb8 != null) {
                                                gwq3.n(hfb8);
                                            }
                                            gwq3.n(hfb9);
                                            hfb8 = null;
                                        }
                                    }
                                    hfb9 = hfb9.v;
                                }
                                if(v4 != 1) {
                                    goto label_178;
                                }
                                continue;
                            }
                        label_178:
                            hfb8 = ien.a(gwq3);
                        }
                        if(collection0 != null) {
                            int v5 = collection0.size();
                            for(int v6 = 0; v6 < v5; ++v6) {
                                ((hxq)((List)collection0).get(v6)).b(hxs0);
                            }
                        }
                    }
                    return false;
                }
                return (this.N(motionEvent0) & 1) != 0;
            }
            if(motionEvent0.isFromSource(0x200000)) {
                if(motionEvent0.isFromSource(0x200000)) {
                    InputDevice inputDevice0 = motionEvent0.getDevice();
                    if(inputDevice0 == null) {
                        v7 = 0;
                    }
                    else {
                        InputDevice.MotionRange inputDevice$MotionRange0 = inputDevice0.getMotionRange(0);
                        InputDevice.MotionRange inputDevice$MotionRange1 = inputDevice0.getMotionRange(1);
                        if(inputDevice$MotionRange0 != null && inputDevice$MotionRange1 == null) {
                            v7 = 1;
                        }
                        else if(inputDevice$MotionRange1 != null && inputDevice$MotionRange0 == null) {
                            v7 = 2;
                        }
                        else if(inputDevice$MotionRange0 != null) {
                            float f2 = inputDevice$MotionRange0.getRange();
                            float f3 = inputDevice$MotionRange1.getRange();
                            if(Float.compare(f2, f3) <= 0 || f2 / f3 < 5.0f) {
                                if(!(f3 > f2)) {
                                    v7 = 0;
                                }
                                else if(f2 == 0.0f) {
                                    v7 = 2;
                                }
                                else if(f3 / f2 < 5.0f) {
                                    v7 = 0;
                                }
                                else {
                                    v7 = 2;
                                }
                            }
                            else if(f3 == 0.0f) {
                                int v7 = 1;
                            }
                            else {
                                v7 = 1;
                            }
                        }
                        else {
                            v7 = 0;
                        }
                    }
                    float f4 = motionEvent0.getX();
                    long v8 = (long)Float.floatToRawIntBits(motionEvent0.getY());
                    long v9 = (long)Float.floatToRawIntBits(f4);
                    long v10 = motionEvent0.getEventTime();
                    switch(motionEvent0.getActionMasked()) {
                        case 0: {
                            v11 = 1;
                            break;
                        }
                        case 1: {
                            v11 = 2;
                            break;
                        }
                        case 2: {
                            v11 = 3;
                            break;
                        }
                        default: {
                            int v11 = 0;
                        }
                    }
                    hue hue0 = new hue(v8 & 0xFFFFFFFFL | v9 << 0x20, v10, v11, v7, motionEvent0);
                    MotionEvent motionEvent1 = hue0.e;
                    hio hio1 = this.R;
                    ikq ikq0 = new ikq(this, motionEvent1);
                    if(hio1.b.a) {
                        System.out.println("FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                    }
                    else {
                        hji hji1 = hio1.a();
                        if(hji1 == null) {
                            iem1 = null;
                        }
                        else {
                            if(!hji1.r.B) {
                                hxt.d("visitAncestors called on an unattached node");
                            }
                            hfb hfb10 = hji1.r;
                            ify ify2 = ien.d(hji1);
                        alab2:
                            while(true) {
                                hfb hfb11 = null;
                                if(ify2 != null) {
                                    if((ify2.u.f.t & 0x200000) != 0) {
                                        while(hfb10 != null) {
                                            if((hfb10.s & 0x200000) != 0) {
                                                hfb11 = hfb10;
                                                gwq gwq4 = null;
                                                while(hfb11 != null) {
                                                    if((hfb11 instanceof huh)) {
                                                        break alab2;
                                                    }
                                                    if((hfb11.s & 0x200000) != 0 && (hfb11 instanceof iep)) {
                                                        hfb hfb12 = ((iep)hfb11).D;
                                                        int v12 = 0;
                                                        while(hfb12 != null) {
                                                            if((hfb12.s & 0x200000) != 0) {
                                                                ++v12;
                                                                if(v12 == 1) {
                                                                    hfb11 = hfb12;
                                                                }
                                                                else {
                                                                    if(gwq4 == null) {
                                                                        gwq4 = new gwq(new hfb[16]);
                                                                    }
                                                                    if(hfb11 != null) {
                                                                        gwq4.n(hfb11);
                                                                    }
                                                                    gwq4.n(hfb12);
                                                                    hfb11 = null;
                                                                }
                                                            }
                                                            hfb12 = hfb12.v;
                                                        }
                                                        if(v12 != 1) {
                                                            goto label_278;
                                                        }
                                                        continue;
                                                    }
                                                label_278:
                                                    hfb11 = ien.a(gwq4);
                                                }
                                            }
                                            hfb10 = hfb10.u;
                                        }
                                    }
                                    ify2 = ify2.n();
                                    if(ify2 != null) {
                                        ihl ihl2 = ify2.u;
                                        if(ihl2 != null) {
                                            hfb10 = ihl2.e;
                                            continue;
                                        }
                                    }
                                    hfb10 = null;
                                    continue;
                                }
                                break;
                            }
                            iem iem1 = (huh)hfb11;
                        }
                        if(iem1 != null) {
                            if(!iem1.I().B) {
                                hxt.d("visitAncestors called on an unattached node");
                            }
                            hfb hfb13 = iem1.I().u;
                            ify ify3 = ien.d(iem1);
                            Collection collection1 = null;
                            while(ify3 != null) {
                                if((ify3.u.f.t & 0x200000) != 0) {
                                    while(hfb13 != null) {
                                        if((hfb13.s & 0x200000) != 0) {
                                            hfb hfb14 = hfb13;
                                            gwq gwq5 = null;
                                            while(hfb14 != null) {
                                                if((hfb14 instanceof huh)) {
                                                    if(collection1 == null) {
                                                        collection1 = new ArrayList();
                                                    }
                                                    ((List)collection1).add(hfb14);
                                                }
                                                else if((hfb14.s & 0x200000) != 0 && (hfb14 instanceof iep)) {
                                                    hfb hfb15 = ((iep)hfb14).D;
                                                    int v13 = 0;
                                                    while(hfb15 != null) {
                                                        if((hfb15.s & 0x200000) != 0) {
                                                            ++v13;
                                                            if(v13 == 1) {
                                                                hfb14 = hfb15;
                                                            }
                                                            else {
                                                                if(gwq5 == null) {
                                                                    gwq5 = new gwq(new hfb[16]);
                                                                }
                                                                if(hfb14 != null) {
                                                                    gwq5.n(hfb14);
                                                                }
                                                                gwq5.n(hfb15);
                                                                hfb14 = null;
                                                            }
                                                        }
                                                        hfb15 = hfb15.v;
                                                    }
                                                    if(v13 != 1) {
                                                        goto label_330;
                                                    }
                                                    continue;
                                                }
                                            label_330:
                                                hfb14 = ien.a(gwq5);
                                            }
                                        }
                                        hfb13 = hfb13.u;
                                    }
                                }
                                ify3 = ify3.n();
                                if(ify3 != null) {
                                    ihl ihl3 = ify3.u;
                                    if(ihl3 != null) {
                                        hfb13 = ihl3.e;
                                        continue;
                                    }
                                }
                                hfb13 = null;
                            }
                            if(collection1 == null) {
                                hfb16 = iem1.I();
                                gwq6 = null;
                            }
                            else {
                                int v14 = collection1.size() - 1;
                                if(v14 >= 0) {
                                    while(true) {
                                        ((huh)((List)collection1).get(v14)).H();
                                        if(v14 - 1 < 0) {
                                            break;
                                        }
                                        --v14;
                                    }
                                    hfb hfb16 = iem1.I();
                                    gwq gwq6 = null;
                                }
                                else {
                                    hfb16 = iem1.I();
                                    gwq6 = null;
                                }
                            }
                            while(hfb16 != null) {
                                if((hfb16 instanceof huh)) {
                                    huh huh0 = (huh)hfb16;
                                }
                                else if((hfb16.s & 0x200000) != 0 && (hfb16 instanceof iep)) {
                                    hfb hfb17 = ((iep)hfb16).D;
                                    int v15 = 0;
                                    while(hfb17 != null) {
                                        if((hfb17.s & 0x200000) != 0) {
                                            ++v15;
                                            if(v15 == 1) {
                                                hfb16 = hfb17;
                                            }
                                            else {
                                                if(gwq6 == null) {
                                                    gwq6 = new gwq(new hfb[16]);
                                                }
                                                if(hfb16 != null) {
                                                    gwq6.n(hfb16);
                                                }
                                                gwq6.n(hfb17);
                                                hfb16 = null;
                                            }
                                        }
                                        hfb17 = hfb17.v;
                                    }
                                    if(v15 != 1) {
                                        goto label_379;
                                    }
                                    continue;
                                }
                            label_379:
                                hfb16 = ien.a(gwq6);
                            }
                            if(((Boolean)ikq0.a()).booleanValue()) {
                                goto label_416;
                            }
                            hfb hfb18 = iem1.I();
                            gwq gwq7 = null;
                            while(hfb18 != null) {
                                if((hfb18 instanceof huh)) {
                                    if(((huh)hfb18).D(hue0)) {
                                        goto label_416;
                                    }
                                }
                                else if((hfb18.s & 0x200000) != 0 && (hfb18 instanceof iep)) {
                                    hfb hfb19 = ((iep)hfb18).D;
                                    int v16 = 0;
                                    while(hfb19 != null) {
                                        if((hfb19.s & 0x200000) != 0) {
                                            ++v16;
                                            if(v16 == 1) {
                                                hfb18 = hfb19;
                                            }
                                            else {
                                                if(gwq7 == null) {
                                                    gwq7 = new gwq(new hfb[16]);
                                                }
                                                if(hfb18 != null) {
                                                    gwq7.n(hfb18);
                                                }
                                                gwq7.n(hfb19);
                                                hfb18 = null;
                                            }
                                        }
                                        hfb19 = hfb19.v;
                                    }
                                    if(v16 != 1) {
                                        goto label_406;
                                    }
                                    continue;
                                }
                            label_406:
                                hfb18 = ien.a(gwq7);
                            }
                            if(collection1 != null) {
                                int v17 = collection1.size();
                                int v18 = 0;
                                while(v18 < v17) {
                                    if(((huh)((List)collection1).get(v18)).D(hue0)) {
                                        goto label_416;
                                    }
                                    ++v18;
                                }
                                goto label_419;
                            label_416:
                                this.aM = false;
                                this.aN.b = 0;
                                return true;
                            }
                        }
                    }
                label_419:
                    if(motionEvent1.getAction() == 0) {
                        this.aM = true;
                        this.aN.b = hue0.d;
                    }
                    if(this.aM) {
                        this.aN.c.onTouchEvent(motionEvent1);
                    }
                    return true;
                }
                throw new IllegalArgumentException("MotionEvent must be a touch navigation source");
            }
            return super.dispatchGenericMotionEvent(motionEvent0);
        }
        return super.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        int v3;
        if(this.O) {
            this.removeCallbacks(this.aL);
            this.aL.run();
        }
        if(!ili.Y(motionEvent0) && this.isAttachedToWindow()) {
            ilt ilt0 = this.n;
            if(ilt0.F()) {
                int v = motionEvent0.getAction();
                if(v == 7) {
                label_15:
                    float f = motionEvent0.getX();
                    float f1 = motionEvent0.getY();
                    ili ili0 = ilt0.b;
                    iim.a(ili0);
                    ifb ifb0 = new ifb();
                    ili0.k.as(((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20, ifb0, true);
                    int v1 = ibpo.d(ifb0);
                    while(true) {
                        if(v1 >= 0) {
                            ify ify0 = ien.d(ifb0.c(v1));
                            if(((jmw)ili0.D().b.get(ify0)) == null) {
                                if(ify0.u.j(8)) {
                                    int v2 = ilt0.m(ify0.c);
                                    iug iug0 = iuh.a(ify0, false);
                                    if(iuk.b(iug0) && !iug0.e().f(iuz.z)) {
                                        v3 = v2;
                                        break;
                                    }
                                }
                                --v1;
                                continue;
                            }
                        }
                        v3 = 0x80000000;
                        break;
                    }
                    ili0.D().dispatchGenericMotionEvent(motionEvent0);
                    ilt0.A(v3);
                }
                else {
                    switch(v) {
                        case 9: {
                            goto label_15;
                        }
                        case 10: {
                            if(ilt0.c == 0x80000000) {
                                ilt0.b.D().dispatchGenericMotionEvent(motionEvent0);
                            }
                            else {
                                ilt0.A(0x80000000);
                            }
                        }
                    }
                }
            }
            switch(motionEvent0.getActionMasked()) {
                case 7: {
                    return this.W(motionEvent0) ? (this.N(motionEvent0) & 1) != 0 : false;
                }
                case 10: {
                    if(this.V(motionEvent0)) {
                        if(motionEvent0.getToolType(0) == 3 && motionEvent0.getButtonState() != 0) {
                            return false;
                        }
                        MotionEvent motionEvent1 = this.K;
                        if(motionEvent1 != null) {
                            motionEvent1.recycle();
                        }
                        this.K = MotionEvent.obtainNoHistory(motionEvent0);
                        this.O = true;
                        this.postDelayed(this.aL, 8L);
                        return false;
                    }
                    return (this.N(motionEvent0) & 1) != 0;
                }
                default: {
                    return (this.N(motionEvent0) & 1) != 0;
                }
            }
        }
        return false;
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(this.isFocused()) {
            ipz.e(keyEvent0.getMetaState());
            return this.R.i(keyEvent0, hij.a) ? true : super.dispatchKeyEvent(keyEvent0);
        }
        ikn ikn0 = new ikn(this, keyEvent0);
        return this.R.i(keyEvent0, ikn0);
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent0) {
        if(this.isFocused()) {
            hio hio0 = this.R;
            if(hio0.b.a) {
                System.out.println("FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
                return super.dispatchKeyEventPreIme(keyEvent0);
            }
            hji hji0 = hjl.a(hio0.a);
            if(hji0 == null) {
                iem0 = null;
            }
            else {
                if(!hji0.r.B) {
                    hxt.d("visitAncestors called on an unattached node");
                }
                hfb hfb0 = hji0.r;
                ify ify0 = ien.d(hji0);
            alab1:
                while(true) {
                    hfb hfb1 = null;
                    if(ify0 != null) {
                        if((ify0.u.f.t & 0x20000) != 0) {
                            while(hfb0 != null) {
                                if((hfb0.s & 0x20000) != 0) {
                                    gwq gwq0 = null;
                                    hfb1 = hfb0;
                                    while(hfb1 != null) {
                                        if((hfb1 instanceof huq)) {
                                            break alab1;
                                        }
                                        if((hfb1.s & 0x20000) != 0 && (hfb1 instanceof iep)) {
                                            hfb hfb2 = ((iep)hfb1).D;
                                            int v = 0;
                                            while(hfb2 != null) {
                                                if((hfb2.s & 0x20000) != 0) {
                                                    ++v;
                                                    if(v == 1) {
                                                        hfb1 = hfb2;
                                                    }
                                                    else {
                                                        if(gwq0 == null) {
                                                            gwq0 = new gwq(new hfb[16]);
                                                        }
                                                        if(hfb1 != null) {
                                                            gwq0.n(hfb1);
                                                        }
                                                        gwq0.n(hfb2);
                                                        hfb1 = null;
                                                    }
                                                }
                                                hfb2 = hfb2.v;
                                            }
                                            if(v != 1) {
                                                goto label_38;
                                            }
                                            continue;
                                        }
                                    label_38:
                                        hfb1 = ien.a(gwq0);
                                    }
                                }
                                hfb0 = hfb0.u;
                            }
                        }
                        ify0 = ify0.n();
                        if(ify0 != null) {
                            ihl ihl0 = ify0.u;
                            if(ihl0 != null) {
                                hfb0 = ihl0.e;
                                continue;
                            }
                        }
                        hfb0 = null;
                        continue;
                    }
                    break;
                }
                iem iem0 = (huq)hfb1;
            }
            if(iem0 != null) {
                if(!iem0.I().B) {
                    hxt.d("visitAncestors called on an unattached node");
                }
                hfb hfb3 = iem0.I().u;
                ify ify1 = ien.d(iem0);
                Collection collection0 = null;
                while(ify1 != null) {
                    if((ify1.u.f.t & 0x20000) != 0) {
                        while(hfb3 != null) {
                            if((hfb3.s & 0x20000) != 0) {
                                hfb hfb4 = hfb3;
                                gwq gwq1 = null;
                                while(hfb4 != null) {
                                    if((hfb4 instanceof huq)) {
                                        if(collection0 == null) {
                                            collection0 = new ArrayList();
                                        }
                                        ((List)collection0).add(hfb4);
                                    }
                                    else if((hfb4.s & 0x20000) != 0 && (hfb4 instanceof iep)) {
                                        hfb hfb5 = ((iep)hfb4).D;
                                        int v1 = 0;
                                        while(hfb5 != null) {
                                            if((hfb5.s & 0x20000) != 0) {
                                                ++v1;
                                                if(v1 == 1) {
                                                    hfb4 = hfb5;
                                                }
                                                else {
                                                    if(gwq1 == null) {
                                                        gwq1 = new gwq(new hfb[16]);
                                                    }
                                                    if(hfb4 != null) {
                                                        gwq1.n(hfb4);
                                                    }
                                                    gwq1.n(hfb5);
                                                    hfb4 = null;
                                                }
                                            }
                                            hfb5 = hfb5.v;
                                        }
                                        if(v1 != 1) {
                                            goto label_90;
                                        }
                                        continue;
                                    }
                                label_90:
                                    hfb4 = ien.a(gwq1);
                                }
                            }
                            hfb3 = hfb3.u;
                        }
                    }
                    ify1 = ify1.n();
                    if(ify1 != null) {
                        ihl ihl1 = ify1.u;
                        if(ihl1 != null) {
                            hfb3 = ihl1.e;
                            continue;
                        }
                    }
                    hfb3 = null;
                }
                if(collection0 != null) {
                    int v2 = collection0.size() - 1;
                    if(v2 >= 0) {
                        while(!((huq)((List)collection0).get(v2)).b()) {
                            if(v2 - 1 < 0) {
                                goto label_110;
                            }
                            --v2;
                        }
                        return true;
                    }
                }
            label_110:
                hfb hfb6 = iem0.I();
                gwq gwq2 = null;
                while(hfb6 != null) {
                    if((hfb6 instanceof huq)) {
                        if(((huq)hfb6).b()) {
                            goto label_169;
                        }
                    }
                    else if((hfb6.s & 0x20000) != 0 && (hfb6 instanceof iep)) {
                        hfb hfb7 = ((iep)hfb6).D;
                        int v3 = 0;
                        while(hfb7 != null) {
                            if((hfb7.s & 0x20000) != 0) {
                                ++v3;
                                if(v3 == 1) {
                                    hfb6 = hfb7;
                                }
                                else {
                                    if(gwq2 == null) {
                                        gwq2 = new gwq(new hfb[16]);
                                    }
                                    if(hfb6 != null) {
                                        gwq2.n(hfb6);
                                    }
                                    gwq2.n(hfb7);
                                    hfb6 = null;
                                }
                            }
                            hfb7 = hfb7.v;
                        }
                        if(v3 != 1) {
                            goto label_134;
                        }
                        continue;
                    }
                label_134:
                    hfb6 = ien.a(gwq2);
                }
                hfb hfb8 = iem0.I();
                gwq gwq3 = null;
                while(hfb8 != null) {
                    if((hfb8 instanceof huq)) {
                        if(((huq)hfb8).a()) {
                            goto label_169;
                        }
                    }
                    else if((hfb8.s & 0x20000) != 0 && (hfb8 instanceof iep)) {
                        hfb hfb9 = ((iep)hfb8).D;
                        int v4 = 0;
                        while(hfb9 != null) {
                            if((hfb9.s & 0x20000) != 0) {
                                ++v4;
                                if(v4 == 1) {
                                    hfb8 = hfb9;
                                }
                                else {
                                    if(gwq3 == null) {
                                        gwq3 = new gwq(new hfb[16]);
                                    }
                                    if(hfb8 != null) {
                                        gwq3.n(hfb8);
                                    }
                                    gwq3.n(hfb9);
                                    hfb8 = null;
                                }
                            }
                            hfb9 = hfb9.v;
                        }
                        if(v4 != 1) {
                            goto label_160;
                        }
                        continue;
                    }
                label_160:
                    hfb8 = ien.a(gwq3);
                }
                if(collection0 != null) {
                    int v5 = collection0.size();
                    int v6 = 0;
                    while(v6 < v5) {
                        if(!((huq)((List)collection0).get(v6)).a()) {
                            ++v6;
                            continue;
                        }
                    label_169:
                        return true;
                    }
                    return super.dispatchKeyEventPreIme(keyEvent0);
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        boolean z;
        if(this.O) {
            Runnable runnable0 = this.aL;
            this.removeCallbacks(runnable0);
            MotionEvent motionEvent1 = this.K;
            ibuq.c(motionEvent1);
            if(motionEvent0.getActionMasked() == 0 && !ili.X(motionEvent0, motionEvent1)) {
                this.O = false;
            }
            else {
                runnable0.run();
            }
        }
        if(!ili.Y(motionEvent0) && this.isAttachedToWindow()) {
            if(motionEvent0.getActionMasked() == 2 && !this.W(motionEvent0)) {
                return false;
            }
            int v = this.N(motionEvent0);
            if((v & 2) != 0) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
            }
            switch(motionEvent0.getActionMasked()) {
                case 0: 
                case 5: {
                    z = true;
                    break;
                }
                default: {
                    z = false;
                }
            }
            if(z && (motionEvent0.isFromSource(0x2002) || motionEvent0.isFromSource(0x100008))) {
                ijr ijr0 = (ijr)this.ar.a();
            }
            return (v & 1) != 0;
        }
        return false;
    }

    @Override  // hvp
    public final void e(float[] arr_f) {
        this.G();
        hmb.e(arr_f, this.B);
        float f = Float.intBitsToFloat(((int)(this.az >> 0x20)));
        float f1 = Float.intBitsToFloat(((int)(this.az & 0xFFFFFFFFL)));
        hmb.c(this.ax);
        hmb.i(this.ax, f, f1);
        float f2 = imd.a(this.ax, 0, arr_f, 1);
        float f3 = imd.a(this.ax, 0, arr_f, 2);
        float f4 = imd.a(this.ax, 0, arr_f, 3);
        float f5 = imd.a(this.ax, 1, arr_f, 0);
        float f6 = imd.a(this.ax, 1, arr_f, 1);
        float f7 = imd.a(this.ax, 1, arr_f, 2);
        float f8 = imd.a(this.ax, 1, arr_f, 3);
        float f9 = imd.a(this.ax, 2, arr_f, 0);
        float f10 = imd.a(this.ax, 2, arr_f, 1);
        float f11 = imd.a(this.ax, 2, arr_f, 2);
        float f12 = imd.a(this.ax, 2, arr_f, 3);
        float f13 = imd.a(this.ax, 3, arr_f, 0);
        float f14 = imd.a(this.ax, 3, arr_f, 1);
        float f15 = imd.a(this.ax, 3, arr_f, 2);
        float f16 = imd.a(this.ax, 3, arr_f, 3);
        arr_f[0] = imd.a(this.ax, 0, arr_f, 0);
        arr_f[1] = f2;
        arr_f[2] = f3;
        arr_f[3] = f4;
        arr_f[4] = f5;
        arr_f[5] = f6;
        arr_f[6] = f7;
        arr_f[7] = f8;
        arr_f[8] = f9;
        arr_f[9] = f10;
        arr_f[10] = f11;
        arr_f[11] = f12;
        arr_f[12] = f13;
        arr_f[13] = f14;
        arr_f[14] = f15;
        arr_f[15] = f16;
    }

    @Override  // hwy
    public final long f(long v) {
        this.G();
        long v1 = hmb.a(this.B, v);
        return ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))) + Float.intBitsToFloat(((int)(this.az & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v1 >> 0x20))) + Float.intBitsToFloat(((int)(this.az >> 0x20))))) << 0x20;
    }

    public final View findViewByAccessibilityIdTraversal(int v) {
        try {
            Method method0 = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            method0.setAccessible(true);
            Object object0 = method0.invoke(this, v);
            return (object0 instanceof View) ? ((View)object0) : null;
        }
        catch(NoSuchMethodException unused_ex) {
        }
        return null;
    }

    @Override  // android.view.ViewGroup
    public final View focusSearch(View view0, int v) {
        hka hka0;
        if(view0 != null && !this.A.c) {
            View view1 = this.getRootView();
            ibuq.d(view1, "null cannot be cast to non-null type android.view.ViewGroup");
            View view2 = FocusFinder.getInstance().findNextFocus(((ViewGroup)view1), view0, v);
            if(view2 == null || !imd.b(this, view2)) {
                view2 = null;
            }
            if(view0 == this) {
                hka0 = this.R.c();
                if(hka0 == null) {
                    hka0 = hie.b(view0, this);
                }
            }
            else {
                hka0 = hie.b(view0, this);
            }
            hib hib0 = hie.a(v);
            int v1 = hib0 == null ? 6 : hib0.a;
            ibvd ibvd0 = new ibvd();
            iko iko0 = new iko(ibvd0);
            if(this.R.d(v1, hka0, iko0) == null) {
                return view0;
            }
            Object object0 = ibvd0.a;
            if(object0 == null) {
                return view2 == null ? super.focusSearch(view0, v) : view2;
            }
            return view2 != null && !hip.a(v1) && !hjs.c(hjl.c(((hji)object0)), hie.b(view2, this), hka0, v1) ? view2 : this;
        }
        return super.focusSearch(view0, v);
    }

    @Override  // hwy
    public final long g(long v) {
        this.G();
        return hmb.a(this.C, ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) - Float.intBitsToFloat(((int)(this.az & 0xFFFFFFFFL))))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Float.intBitsToFloat(((int)(v >> 0x20))) - Float.intBitsToFloat(((int)(this.az >> 0x20))))) << 0x20);
    }

    @Override  // android.view.View
    public final void getFocusedRect(Rect rect0) {
        hka hka0 = this.a();
        if(hka0 == null) {
            if(!ibuq.m(this.R.d(6, null, ikp.a), Boolean.valueOf(true))) {
                rect0.set(0x80000000, 0x80000000, 0x80000000, 0x80000000);
                return;
            }
            super.getFocusedRect(rect0);
            return;
        }
        rect0.left = Math.round(hka0.b);
        rect0.top = Math.round(hka0.c);
        rect0.right = Math.round(hka0.d);
        rect0.bottom = Math.round(hka0.e);
    }

    @Override  // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override  // iik
    public final void h(ibth ibth0) {
        Handler handler0 = this.getHandler();
        if(handler0 == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler0.postAtFrontOfQueue(new ikg(ibth0));
    }

    @Override  // iio
    public final iil i(ibtw ibtw0, ibth ibth0, hpn hpn0) {
        Object object0;
        if(hpn0 != null) {
            return new ipm(hpn0, null, this, ibtw0, ibth0);
        }
        irb irb0 = this.M;
        irb0.a();
        do {
            gwq gwq0 = irb0.a;
            int v = gwq0.b;
            if(v == 0) {
                goto label_10;
            }
            object0 = ((Reference)gwq0.c(v - 1)).get();
        }
        while(object0 == null);
        goto label_11;
    label_10:
        object0 = null;
    label_11:
        if(((iil)object0) != null) {
            ((iil)object0).h(ibtw0, ibth0);
            return (iil)object0;
        }
        return new ipm(this.ab.a(), this.ab, this, ibtw0, ibth0);
    }

    @Override  // iio
    public final iiy j() {
        return this.z;
    }

    @Override  // iio
    public final jks k() {
        return (jks)this.af.a();
    }

    @Override  // iio
    public final jlm l() {
        return (jlm)this.aI.a();
    }

    @Override  // iio
    public final Object m(ibtw ibtw0, ibrl ibrl0) {
        ilf ilf0;
        if((ibrl0 instanceof ilf)) {
            ilf0 = (ilf)ibrl0;
            int v = ilf0.c;
            if((v & 0x80000000) == 0) {
                ilf0 = new ilf(this, ibrl0);
            }
            else {
                ilf0.c = v - 0x80000000;
            }
        }
        else {
            ilf0 = new ilf(this, ibrl0);
        }
        Object object0 = ilf0.a;
        Object object1 = ibrx.a;
        switch(ilf0.c) {
            case 0: {
                ibnx.b(object0);
                ilg ilg0 = new ilg(this);
                ilf0.c = 1;
                if(hfj.b(this.aF, ilg0, ibtw0, ilf0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new ibnm();
    }

    @Override  // iio
    public final void n(ify ify0, boolean z) {
        this.A.e(ify0, z);
    }

    @Override  // iio
    public final void o(boolean z) {
        igv igv0 = this.A;
        if(igv0.h() || igv0.e.c()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if(igv0.i((z ? this.aO : null))) {
                    this.requestLayout();
                }
                igv.k(igv0);
                this.P();
            }
            finally {
                Trace.endSection();
            }
        }
        this.T();
    }

    @Override  // android.view.ViewGroup
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.an.onViewAttachedToWindow(this);
        lpg lpg0 = null;
        if(ili.c == null) {
            ikh ikh0 = new ikh();
            ili.c = ikh0;
            StrictMode.VmPolicy strictMode$VmPolicy0 = StrictMode.getVmPolicy();
            try {
                if(ili.a == null) {
                    ili.a = Class.forName("android.os.SystemProperties");
                }
                if(ili.b == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    ili.b = ili.a == null ? null : ili.a.getDeclaredMethod("addChangeCallback", Runnable.class);
                }
                Method method0 = ili.b;
                if(method0 != null) {
                    method0.invoke(null, ikh0);
                }
            }
            catch(Throwable unused_ex) {
            }
            StrictMode.setVmPolicy(strictMode$VmPolicy0);
        }
        synchronized(ili.W) {
            ili.W.p(this);
        }
        boolean z = this.hasWindowFocus();
        this.i.c(z);
        ikv ikv0 = new ikv(this);
        this.i.b(ikv0);
        this.U();
        this.Q(this.k);
        this.F(this.k);
        this.z.a.d();
        hfn hfn0 = this.v;
        if(hfn0 != null) {
            hfn0.c.registerCallback(hfu.a);
        }
        lps lps0 = lsr.a(this);
        orl orl0 = oro.a(this);
        iki iki0 = this.C();
        if(iki0 == null || lps0 != null && orl0 != null && (lps0 != iki0.a || orl0 != iki0.a)) {
            if(lps0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!");
            }
            if(orl0 == null) {
                throw new IllegalStateException("Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!");
            }
            if(iki0 != null) {
                lpg lpg1 = iki0.a.getLifecycle();
                if(lpg1 != null) {
                    lpg1.d(this);
                }
            }
            lps0.getLifecycle().c(this);
            iki iki1 = new iki(lps0, orl0);
            this.E.b(iki1);
            ibts ibts0 = this.F;
            if(ibts0 != null) {
                ibts0.a(iki1);
            }
            this.F = null;
        }
        int v1 = this.isInTouchMode() ? 1 : 2;
        this.I.a(v1);
        iki iki2 = this.C();
        if(iki2 != null) {
            lpg0 = iki2.a.getLifecycle();
        }
        if(lpg0 != null) {
            lpg0.c(this);
            hgo hgo0 = this.o;
            lpg0.c(hgo0);
            this.getViewTreeObserver().addOnGlobalLayoutListener(this.aB);
            this.getViewTreeObserver().addOnScrollChangedListener(this.aC);
            this.getViewTreeObserver().addOnTouchModeChangeListener(this.aD);
            ima.a.b(this);
            hfv hfv0 = this.ac;
            if(hfv0 != null) {
                this.R.d.p(hfv0);
                this.m.c.p(hfv0);
            }
            this.m.c.p(hgo0);
            return;
        }
        hxt.b("No lifecycle owner exists");
        throw new ibnm();
    }

    @Override  // android.view.View
    public final boolean onCheckIsTextEditor() {
        inb inb0 = (inb)hfj.a(this.aF);
        if(inb0 == null) {
            return this.aE.b;
        }
        ipt ipt0 = (ipt)hfj.a(inb0.d);
        return ipt0 != null && !ipt0.d;
    }

    @Override  // android.view.View
    protected final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        jks jks0 = jkm.a(this.getContext());
        this.af.b(jks0);
        this.U();
        if(configuration0.fontWeightAdjustment != this.aH) {
            this.aH = configuration0.fontWeightAdjustment;
            jed jed0 = jef.a(this.getContext());
            this.aG.b(jed0);
        }
        this.u.a(configuration0);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection1;
        int v9;
        int v7;
        inb inb0 = (inb)hfj.a(this.aF);
        int v = 0;
        if(inb0 == null) {
            jhv jhv0 = this.aE;
            if(!jhv0.b) {
                return null;
            }
            jgm jgm0 = jhv0.f;
            jhk jhk0 = jhv0.e;
            int v1 = jgm0.f;
            if(v1 != 1) {
                switch(v1) {
                    case 0: {
                        v = 1;
                        break;
                    }
                    case 2: {
                        v = 2;
                        break;
                    }
                    case 3: {
                        v = 3;
                        break;
                    }
                    case 4: {
                        v = 4;
                        break;
                    }
                    case 5: {
                        v = 7;
                        break;
                    }
                    case 6: {
                        v = 5;
                        break;
                    }
                    case 7: {
                        v = 6;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
            }
            else if(jgm0.b) {
                v = 6;
            }
            editorInfo0.imeOptions = v;
            jhc jhc0 = jgm0.g;
            if(jhc0 != null) {
                String s = jhc0.a;
                if(s != null) {
                    editorInfo0.privateImeOptions = s;
                }
            }
            int v2 = jgm0.e;
            if(v2 == 1) {
                editorInfo0.inputType = 1;
            }
            else {
                switch(v2) {
                    case 2: {
                        editorInfo0.inputType = 1;
                        editorInfo0.imeOptions |= 0x80000000;
                        break;
                    }
                    case 3: {
                        editorInfo0.inputType = 2;
                        break;
                    }
                    case 4: {
                        editorInfo0.inputType = 3;
                        break;
                    }
                    case 5: {
                        editorInfo0.inputType = 17;
                        break;
                    }
                    case 6: {
                        editorInfo0.inputType = 33;
                        break;
                    }
                    case 7: {
                        editorInfo0.inputType = 0x81;
                        break;
                    }
                    case 8: {
                        editorInfo0.inputType = 18;
                        break;
                    }
                    case 9: {
                        editorInfo0.inputType = 0x2002;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                }
            }
            if(!jgm0.b && jhy.a(editorInfo0.inputType)) {
                editorInfo0.inputType |= 0x20000;
                if(v1 == 1) {
                    editorInfo0.imeOptions |= 0x40000000;
                }
            }
            if(jhy.a(editorInfo0.inputType)) {
                int v3 = jgm0.c;
                if(v3 == 1) {
                    editorInfo0.inputType |= 0x1000;
                }
                else {
                    switch(v3) {
                        case 2: {
                            editorInfo0.inputType |= 0x2000;
                            break;
                        }
                        case 3: {
                            editorInfo0.inputType |= 0x4000;
                        }
                    }
                }
                if(jgm0.d) {
                    editorInfo0.inputType |= 0x8000;
                }
            }
            editorInfo0.initialSelStart = jbk.e(jhk0.c);
            editorInfo0.initialSelEnd = jbk.a(jhk0.c);
            khp.a(editorInfo0, jhk0.a());
            editorInfo0.imeOptions |= 0x2000000;
            boolean z = jhv0.f.d;
            InputConnection inputConnection0 = new jhe(jhv0.e, new jhq(jhv0), z);
            WeakReference weakReference0 = new WeakReference(inputConnection0);
            jhv0.g.add(weakReference0);
            return inputConnection0;
        }
        ipt ipt0 = (ipt)hfj.a(inb0.d);
        if(ipt0 != null) {
            synchronized(ipt0.b) {
                if(ipt0.d) {
                    return null;
                }
                epb epb0 = ipt0.e;
                String s1 = epb0.g.a();
                long v5 = epb0.g.c;
                jgm jgm1 = epb0.h;
                int v6 = jgm1.f;
                if(v6 != 1) {
                    switch(v6) {
                        case 0: {
                            v7 = 1;
                            break;
                        }
                        case 2: {
                            v7 = 2;
                            break;
                        }
                        case 3: {
                            v7 = 3;
                            break;
                        }
                        case 4: {
                            v7 = 4;
                            break;
                        }
                        case 5: {
                            v7 = 7;
                            break;
                        }
                        case 6: {
                            v7 = 5;
                            break;
                        }
                        case 7: {
                            v7 = 6;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("invalid ImeAction");
                        }
                    }
                }
                else if(!jgm1.b) {
                    v7 = 0;
                }
                else {
                    v7 = 6;
                }
                editorInfo0.imeOptions = v7;
                jhc jhc1 = jgm1.g;
                if(jhc1 != null) {
                    String s2 = jhc1.a;
                    if(s2 != null) {
                        editorInfo0.privateImeOptions = s2;
                    }
                }
                jii jii0 = jgm1.h;
                if(ibuq.m(jii0, jii.a)) {
                    editorInfo0.hintLocales = null;
                }
                else {
                    ArrayList arrayList0 = new ArrayList(ibpo.q(jii0, 10));
                    for(Object object1: jii0) {
                        arrayList0.add(((jig)object1).a);
                    }
                    Locale[] arr_locale = (Locale[])arrayList0.toArray(new Locale[0]);
                    editorInfo0.hintLocales = new LocaleList(((Locale[])Arrays.copyOf(arr_locale, arr_locale.length)));
                }
                int v8 = jgm1.e;
                if(v8 == 1) {
                    v9 = 1;
                }
                else {
                    switch(v8) {
                        case 2: {
                            editorInfo0.imeOptions |= 0x80000000;
                            v9 = 1;
                            break;
                        }
                        case 3: {
                            v9 = 2;
                            break;
                        }
                        case 4: {
                            v9 = 3;
                            break;
                        }
                        case 5: {
                            v9 = 17;
                            break;
                        }
                        case 6: {
                            v9 = 33;
                            break;
                        }
                        case 7: {
                            v9 = 0x81;
                            break;
                        }
                        case 8: {
                            v9 = 18;
                            break;
                        }
                        case 9: {
                            v9 = 0x2002;
                            break;
                        }
                        default: {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                    }
                }
                editorInfo0.inputType = v9;
                if(!jgm1.b && eoi.a(editorInfo0.inputType)) {
                    editorInfo0.inputType |= 0x20000;
                    if(v6 == 1) {
                        editorInfo0.imeOptions |= 0x40000000;
                    }
                }
                if(eoi.a(editorInfo0.inputType)) {
                    int v10 = jgm1.c;
                    if(v10 == 1) {
                        editorInfo0.inputType |= 0x1000;
                    }
                    else {
                        switch(v10) {
                            case 2: {
                                editorInfo0.inputType |= 0x2000;
                                break;
                            }
                            case 3: {
                                editorInfo0.inputType |= 0x4000;
                            }
                        }
                    }
                    if(jgm1.d) {
                        editorInfo0.inputType |= 0x8000;
                    }
                }
                editorInfo0.initialSelStart = jbk.e(v5);
                editorInfo0.initialSelEnd = jbk.a(v5);
                khp.a(editorInfo0, s1);
                editorInfo0.imeOptions |= 0x2000000;
                if(eng.a && (v8 != 7 && v8 != 8)) {
                    khp.b(editorInfo0, true);
                    editorInfo0.setSupportedHandwritingGestures(ibpo.g(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class, JoinOrSplitGesture.class, InsertGesture.class, RemoveSpaceGesture.class}));
                    editorInfo0.setSupportedHandwritingGesturePreviews(ibqg.c(new Class[]{SelectGesture.class, DeleteGesture.class, SelectRangeGesture.class, DeleteRangeGesture.class}));
                }
                else {
                    khp.b(editorInfo0, false);
                }
                boolean z1 = epb0.h.d;
                epd epd0 = new epd(epb0.g, new epa(epb0), z1, epb0.d, epb0.e, epb0.f);
                WeakReference weakReference1 = new WeakReference(epd0);
                epb0.i.add(weakReference1);
                ips ips0 = new ips(ipt0);
                inputConnection1 = Build.VERSION.SDK_INT >= 34 ? new jgw(epd0, ips0) : new jgv(epd0, ips0);
                ijp ijp0 = new ijp(inputConnection1);
                ipt0.c.n(ijp0);
            }
            return inputConnection1;
        }
        return null;
    }

    @Override  // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] arr_v, int[] arr_v1, Consumer consumer0) {
        new iwj("");
        for(int v = 0; v < arr_v.length; ++v) {
            ili ili0 = this.o.a;
            ify ify0 = (ify)ili0.aa.a(((int)arr_v[v]));
            if(ify0 != null) {
                ity ity0 = ify0.u();
                if(ity0 != null) {
                    List list0 = (List)itz.a(ity0, iuz.A);
                    if(list0 != null) {
                        String s = jlz.c(list0, "\n", null, null, null, 62);
                        int v1 = ify0.c;
                        iwj iwj0 = new iwj(s);
                        ViewTranslationRequest.Builder viewTranslationRequest$Builder0 = new ViewTranslationRequest.Builder(ili0.getAutofillId(), ((long)v1));
                        viewTranslationRequest$Builder0.setValue("android:text", TranslationRequestValue.forText(iwj0));
                        consumer0.accept(viewTranslationRequest$Builder0.build());
                    }
                }
            }
        }
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.an.onViewDetachedFromWindow(this);
        lpg lpg0 = null;
        if(this.f) {
            View view0 = this.ag;
            if(view0 == null) {
                ibuq.j("frameRateCategoryView");
                view0 = null;
            }
            this.removeView(view0);
        }
        synchronized(ili.W) {
            ili.W.o(this);
        }
        this.z.a.e();
        this.z.a.a();
        this.i.b(null);
        iki iki0 = this.C();
        if(iki0 != null) {
            lpg0 = iki0.a.getLifecycle();
        }
        if(lpg0 != null) {
            lpg0.d(this.o);
            lpg0.d(this);
            hfn hfn0 = this.v;
            if(hfn0 != null) {
                hfn0.c.unregisterCallback(hfu.a);
            }
            this.getViewTreeObserver().removeOnGlobalLayoutListener(this.aB);
            this.getViewTreeObserver().removeOnScrollChangedListener(this.aC);
            this.getViewTreeObserver().removeOnTouchModeChangeListener(this.aD);
            ima.a.a(this);
            hfv hfv0 = this.ac;
            if(hfv0 != null) {
                this.m.c.o(hfv0);
                this.R.d.o(hfv0);
            }
            return;
        }
        hxt.b("No lifecycle owner exists");
        throw new ibnm();
    }

    @Override  // android.view.View
    protected final void onDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    protected final void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(!z && !this.hasFocus()) {
            hjk.b(this.R.a, true);
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.D = 0L;
        this.A.i(this.aO);
        this.at = null;
        this.I();
        if(this.as != null) {
            this.D().layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if(!this.isAttachedToWindow()) {
                this.Q(this.k);
            }
            long v3 = ili.aa(v);
            long v4 = ili.aa(v1);
            long v5 = jko.a(((int)(v3 >>> 0x20)), ((int)(v3 & 0xFFFFFFFFL)), ((int)(v4 >>> 0x20)), ((int)(0xFFFFFFFFL & v4)));
            jkp jkp0 = this.at;
            if(jkp0 == null) {
                this.at = new jkp(v5);
                this.au = false;
            }
            else if(!jkp.h(jkp0.a, v5)) {
                this.au = true;
            }
            igv igv0 = this.A;
            if(igv0.h == null || !jkp.h(igv0.h.a, v5)) {
                if(igv0.c) {
                    hxt.c("updateRootConstraints called while measuring");
                }
                igv0.h = new jkp(v5);
                ify ify0 = igv0.a;
                if(ify0.i != null) {
                    ify0.Q();
                }
                ify0.R();
                igv0.b.d(ify0, (ify0.i == null ? 3 : 1));
            }
            iet iet0 = igv0.b;
            if(iet0.a()) {
                ify ify1 = igv0.a;
                if(!ify1.am()) {
                    hxt.c("performMeasureAndLayout called with unattached root");
                }
                if(!ify1.an()) {
                    hxt.c("performMeasureAndLayout called with unplaced root");
                }
                if(igv0.c) {
                    hxt.c("performMeasureAndLayout called during measure layout");
                }
                if(igv0.h != null) {
                    igv0.c = true;
                    igv0.d = false;
                    try {
                        if(!iet0.c.d() && !iet0.a.d()) {
                            if(ify1.i == null) {
                                igv0.f(ify1);
                            }
                            else {
                                igv0.g(ify1, true);
                            }
                        }
                        igv0.g(ify1, false);
                    }
                    finally {
                        igv0.c = false;
                        igv0.d = false;
                    }
                }
            }
            ify ify2 = this.k;
            this.setMeasuredDimension(ify2.h(), ify2.f());
            if(this.as != null) {
                this.D().measure(View.MeasureSpec.makeMeasureSpec(ify2.h(), 0x40000000), View.MeasureSpec.makeMeasureSpec(ify2.f(), 0x40000000));
            }
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure0, int v) {
        if(viewStructure0 != null) {
            hfv hfv0 = this.ac;
            if(hfv0 != null) {
                String s = hfv0.d;
                ivv ivv0 = hfv0.c;
                hge.a(viewStructure0, hfv0.a.a, hfv0.f, s, ivv0);
                bzd bzd0 = bze.c(hfv0.a.a, viewStructure0);
                while(bzd0.g()) {
                    Object object0 = bzd0.h(bzd0.b - 1);
                    ibuq.d(object0, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure1 = (ViewStructure)object0;
                    Object object1 = bzd0.h(bzd0.b - 1);
                    ibuq.d(object1, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    List list0 = ((ify)object1).y();
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ify ify0 = (ify)list0.get(v2);
                        if(!ify0.C && ify0.am() && ify0.an()) {
                            ity ity0 = ify0.u();
                            if(ity0 != null && (ity0.c.b(itw.g) || ity0.c.b(iuz.q) || ity0.c.b(iuz.r))) {
                                ViewStructure viewStructure2 = viewStructure1.newChild(viewStructure1.addChildCount(1));
                                hge.a(viewStructure2, ify0, hfv0.f, s, ivv0);
                                bzd0.p(ify0);
                                bzd0.p(viewStructure2);
                            }
                            else {
                                bzd0.p(ify0);
                                bzd0.p(viewStructure1);
                            }
                        }
                    }
                }
            }
            hfn hfn0 = this.v;
            if(hfn0 != null) {
                Map map0 = hfn0.b.a;
                if(!map0.isEmpty()) {
                    int v3 = viewStructure0.addChildCount(map0.size());
                    Iterator iterator0 = map0.entrySet().iterator();
                    if(iterator0.hasNext()) {
                        Object object2 = iterator0.next();
                        int v4 = ((Number)((Map.Entry)object2).getKey()).intValue();
                        hfw hfw0 = (hfw)((Map.Entry)object2).getValue();
                        ViewStructure viewStructure3 = viewStructure0.newChild(v3);
                        viewStructure3.setAutofillId(hfn0.d, v4);
                        hft.b(viewStructure3, v4, "com.google.android.gms");
                        viewStructure3.setAutofillType(1);
                        throw null;
                    }
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent0, int v) {
        int v1 = motionEvent0.getToolType(v);
        if(!motionEvent0.isFromSource(0x2002) && motionEvent0.isFromSource(0x4002) && (v1 == 2 || v1 == 4)) {
            hwa hwa0 = this.V.b;
            return hwa0 == null ? super.onResolvePointerIcon(motionEvent0, v) : imb.b(this.getContext(), hwa0);
        }
        return super.onResolvePointerIcon(motionEvent0, v);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
    }

    @Override  // android.view.View
    public final void onRtlPropertiesChanged(int v) {
        if(this.ae) {
            jlm jlm0 = hie.c(v) == null ? jlm.a : hie.c(v);
            this.aI.b(jlm0);
        }
    }

    @Override  // android.view.View
    public final void onScrollCaptureSearch(Rect rect0, Point point0, Consumer consumer0) {
        itg itg0 = this.P;
        if(itg0 != null) {
            ibrt ibrt0 = this.g;
            gwq gwq0 = new gwq(new ith[16]);
            iti.b(this.m.a(), 0, new itd(gwq0));
            gwq0.j(new ibrb(new ibts[]{ite.a, itf.a}));
            Object object0 = gwq0.b == 0 ? null : gwq0.a[gwq0.b - 1];
            if(((ith)object0) != null) {
                icck icck0 = iccl.b(ibrt0);
                isx isx0 = new isx(((ith)object0).a, ((ith)object0).c, icck0, itg0, this);
                hka hka0 = hzl.e(((ith)object0).d);
                long v = ((ith)object0).c.d();
                ScrollCaptureTarget scrollCaptureTarget0 = new ScrollCaptureTarget(this, hmn.a(jli.b(hka0)), new Point(jlf.a(v), jlf.b(v)), isx0);
                scrollCaptureTarget0.setScrollBounds(hmn.a(((ith)object0).c));
                consumer0.accept(scrollCaptureTarget0);
            }
        }
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }

    @Override  // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray0) {
        boolean z = ibuq.m(Looper.getMainLooper().getThread(), Thread.currentThread());
        hgo hgo0 = this.o;
        if(z) {
            hgh.a(hgo0, longSparseArray0);
            return;
        }
        hgg hgg0 = new hgg(hgo0, longSparseArray0);
        hgo0.a.post(hgg0);
    }

    @Override  // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.i.c(z);
        this.aP = true;
        super.onWindowFocusChanged(z);
    }

    @Override  // iio
    public final void p(ify ify0, long v) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            igv igv0 = this.A;
            if(!ify0.C) {
                ify ify1 = igv0.a;
                if(ibuq.m(ify0, ify1)) {
                    hxt.c("measureAndLayout called on root");
                }
                if(!ify1.am()) {
                    hxt.c("performMeasureAndLayout called with unattached root");
                }
                if(!ify1.an()) {
                    hxt.c("performMeasureAndLayout called with unplaced root");
                }
                if(igv0.c) {
                    hxt.c("performMeasureAndLayout called during measure layout");
                }
                if(igv0.h != null) {
                    try {
                        igv0.c = true;
                        igv0.d = false;
                        igv0.b.c(ify0);
                        if((igv.l(ify0, new jkp(v)) || ify0.aj()) && ibuq.m(ify0.v(), Boolean.valueOf(true))) {
                            ify0.O();
                        }
                        igv0.d(ify0);
                        igv.m(ify0, new jkp(v));
                        if(ify0.ai() && ify0.an()) {
                            ify0.W();
                            igv0.e.b(ify0);
                        }
                        igv0.c();
                        igv0.c = false;
                        igv0.d = false;
                    }
                    catch(Throwable throwable0) {
                        igv0.c = false;
                        igv0.d = false;
                        throw throwable0;
                    }
                }
                igv0.a();
            }
            igv igv1 = this.A;
            if(!igv1.h()) {
                igv.k(igv1);
                this.P();
            }
            this.l.a();
            this.T();
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // iio
    public final void q() {
        long[] arr_v;
        long v21;
        long v17;
        int v14;
        int v13;
        iiq iiq1;
        int v11;
        int v10;
        Object object1;
        long v5;
        int v4;
        int v3;
        bzk bzk0;
        hct hct0;
        int v2;
        int v1;
        int v;
        gwq gwq0;
        if(this.w) {
            Object object0 = this.z.a.e;
            iiq iiq0 = iiq.a;
            __monitor_enter(object0);
            try {
                gwq0 = this.z.a.d;
                v = gwq0.b;
                v1 = 0;
                v2 = 0;
            alab1:
                while(true) {
                label_8:
                    if(v1 >= v) {
                        goto label_114;
                    }
                    hct0 = (hct)gwq0.a[v1];
                    bzk0 = hct0.j;
                    arr_v = bzk0.a;
                    v3 = arr_v.length - 2;
                    if(v3 >= 0) {
                        v4 = 0;
                        while(true) {
                            v5 = arr_v[v4];
                            object1 = object0;
                            break alab1;
                        }
                    }
                    else {
                        goto label_100;
                    }
                    goto label_104;
                }
            }
            catch(Throwable throwable0) {
                object1 = object0;
                __monitor_exit(object1);
                throw throwable0;
            }
            if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                goto label_90;
            }
            int v6 = v4 - v3;
            int v7 = 0;
            while(true) {
                int v8 = 8 - (~v6 >>> 0x1F);
                if(v7 >= v8) {
                    goto label_85;
                }
                try {
                    if((v5 & 0xFFL) < 0x80L) {
                        int v9 = (v4 << 3) + v7;
                        v10 = v6;
                        Object object2 = bzk0.b[v9];
                        v11 = v7;
                        bza bza0 = (bza)bzk0.c[v9];
                        Object object3 = iiq0.a(object2);
                        if(((Boolean)object3).booleanValue()) {
                            iiq1 = iiq0;
                            Object[] arr_object = bza0.b;
                            long[] arr_v1 = bza0.a;
                            int[] arr_v2 = bza0.c;
                            int v12 = arr_v1.length - 2;
                            if(v12 >= 0) {
                                v13 = v1;
                                v14 = v2;
                                int v15 = 0;
                                while(true) {
                                    long v16 = arr_v1[v15];
                                    v17 = v5;
                                    if((~v16 << 7 & v16 & 0x8080808080808080L) == 0x8080808080808080L) {
                                        goto label_61;
                                    }
                                    int v18 = 8 - (~(v15 - v12) >>> 0x1F);
                                    for(int v19 = 0; v19 < v18; ++v19) {
                                        if((v16 & 0xFFL) < 0x80L) {
                                            int v20 = (v15 << 3) + v19;
                                            v21 = v16;
                                            Object object4 = arr_object[v20];
                                            int v22 = arr_v2[v20];
                                            hct0.a(object2, object4);
                                        }
                                        else {
                                            v21 = v16;
                                        }
                                        v16 = v21 >> 8;
                                    }
                                    if(v18 == 8) {
                                    label_61:
                                        if(v15 != v12) {
                                            ++v15;
                                            v5 = v17;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                            }
                            else {
                                v13 = v1;
                                v14 = v2;
                                v17 = v5;
                            }
                        }
                        else {
                            iiq1 = iiq0;
                            v13 = v1;
                            v14 = v2;
                            v17 = v5;
                        }
                        if(((Boolean)object3).booleanValue()) {
                            bzk0.i(v9);
                        }
                    }
                    else {
                        v10 = v6;
                        v11 = v7;
                        iiq1 = iiq0;
                        v13 = v1;
                        v14 = v2;
                        v17 = v5;
                    }
                    v5 = v17 >> 8;
                    v7 = v11 + 1;
                    v6 = v10;
                    iiq0 = iiq1;
                    v1 = v13;
                    v2 = v14;
                    continue;
                label_85:
                    iiq iiq2 = iiq0;
                    int v23 = v1;
                    int v24 = v2;
                    if(v8 == 8) {
                        goto label_93;
                    label_90:
                        iiq2 = iiq0;
                        v23 = v1;
                        v24 = v2;
                    label_93:
                        if(v4 != v3) {
                            ++v4;
                            object0 = object1;
                            iiq0 = iiq2;
                            v1 = v23;
                            v2 = v24;
                            v5 = arr_v[v4];
                            object1 = object0;
                            break alab1;
                        label_100:
                            object1 = object0;
                            iiq2 = iiq0;
                            v23 = v1;
                            v24 = v2;
                        }
                    }
                label_104:
                    if(hct0.b()) {
                        if(v24 > 0) {
                            gwq0.a[v23 - v24] = gwq0.a[v23];
                        }
                        v2 = v24;
                    }
                    else {
                        v2 = v24 + 1;
                    }
                    v1 = v23 + 1;
                    object0 = object1;
                    iiq0 = iiq2;
                    goto label_8;
                label_114:
                    object1 = object0;
                    int v25 = v - v2;
                    ibpg.f(gwq0.a, null, v25, v);
                    gwq0.b = v25;
                    goto label_122;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            __monitor_exit(object1);
            throw throwable0;
        label_122:
            __monitor_exit(object1);
            this.w = false;
        }
        inq inq0 = this.as;
        if(inq0 != null) {
            this.O(inq0);
        }
        hfv hfv0 = this.ac;
        if(hfv0 != null) {
            if(hfv0.i.d == 0 && hfv0.g) {
                hfv0.h.a.commit();
                hfv0.g = false;
            }
            if(hfv0.i.d != 0) {
                hfv0.g = true;
            }
        }
        while(true) {
            bzd bzd0 = this.aT;
            if(!bzd0.g() || bzd0.c(0) == null) {
                break;
            }
            int v26 = bzd0.b;
            for(int v27 = 0; v27 < v26; ++v27) {
                ibth ibth0 = (ibth)bzd0.c(v27);
                bzd0.i(v27, null);
                if(ibth0 != null) {
                    ibth0.a();
                }
            }
            bzd0.l(0, v26);
        }
    }

    @Override  // iio
    public final void r(ify ify0) {
        ilt ilt0 = this.n;
        ilt0.n = true;
        if(!ilt0.D()) {
            return;
        }
        ilt0.u(ify0);
    }

    @Override  // android.view.ViewGroup
    public final boolean requestFocus(int v, Rect rect0) {
        if(this.isFocused()) {
            return true;
        }
        hib hib0 = hie.a(v);
        int v1 = hib0 == null ? 7 : hib0.a;
        hio hio0 = this.R;
        Boolean boolean0 = Boolean.valueOf(true);
        if(ibuq.m(hio0.d(v1, (rect0 == null ? null : hmn.c(rect0)), new iky(v1)), boolean0)) {
            return true;
        }
        if(ibuq.m(hio0.d(v1, null, new ikz(v1)), boolean0)) {
            return true;
        }
        if(this.hasFocus()) {
            return hip.a(v1) ? hio0.k(v1) : false;
        }
        return false;
    }

    @Override  // iio
    public final void s(ify ify0, boolean z, boolean z1, boolean z2) {
        if(z) {
            igv igv0 = this.A;
            if(ify0.i == null) {
                hxt.d("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int v = ify0.aC();
            if(v == 0) {
                throw null;
            }
            switch(v - 1) {
                case 0: {
                label_25:
                    igu igu0 = new igu(ify0, true, z1);
                    igv0.g.n(igu0);
                    return;
                }
                case 1: {
                    break;
                }
                default: {
                    switch(v - 1) {
                        case 2: 
                        case 3: {
                            goto label_25;
                        }
                        case 4: {
                            goto label_9;
                        }
                    }
                    throw new ibnq();
                label_9:
                    if(!ify0.ak() || z1) {
                        ify0.Q();
                        ify0.R();
                        if(!ify0.C) {
                            if(ibuq.m(ify0.v(), Boolean.valueOf(true)) || igv.n(ify0)) {
                                ify ify1 = ify0.n();
                                if(ify1 == null || !ify1.ak()) {
                                    igv0.b.d(ify0, 1);
                                    goto label_22;
                                }
                                goto label_18;
                            }
                            else {
                            label_18:
                                if(ify0.an() || igv.o(ify0)) {
                                    ify ify2 = ify0.n();
                                    if(ify2 == null || !ify2.al()) {
                                        igv0.b.d(ify0, 3);
                                    }
                                }
                            }
                        label_22:
                            if(!igv0.d && z2) {
                                this.S(ify0);
                            }
                        }
                    }
                }
            }
        }
        else if(this.A.j(ify0, z1) && z2) {
            this.S(ify0);
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override  // iio
    public final void t(ify ify0, boolean z, boolean z1) {
        if(z) {
            igv igv0 = this.A;
            int v = ify0.aC();
            if(v != 0) {
                switch(v - 1) {
                    case 1: 
                    case 3: {
                        return;
                    }
                    case 0: 
                    case 2: 
                    case 4: {
                        if(!ify0.ak() && !ify0.aj() || z1) {
                            ify0.v.e();
                            ify0.P();
                            if(ify0.C) {
                                return;
                            }
                            ify ify1 = ify0.n();
                            if(ibuq.m(ify0.v(), Boolean.valueOf(true)) && (ify1 == null || !ify1.ak()) && (ify1 == null || !ify1.aj())) {
                                igv0.b.d(ify0, 2);
                            }
                            else if(ify0.an() && (ify1 == null || !ify1.ai()) && (ify1 == null || !ify1.al())) {
                                igv0.b.d(ify0, 4);
                            }
                            if(igv0.d) {
                                return;
                            }
                            ili.L(this);
                            return;
                        }
                        return;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
            }
            throw null;
        }
        igv igv1 = this.A;
        int v1 = ify0.aC();
        if(v1 == 0) {
            throw null;
        }
        switch(v1 - 1) {
            case 0: 
            case 1: 
            case 2: 
            case 3: {
                return;
            }
            case 4: {
                ify ify2 = ify0.n();
                boolean z2 = ify2 == null || ify2.an();
                if(!z1 && (ify0.al() || ify0.ai() && ify0.an() == z2 && ify0.an() == ify0.ao())) {
                    return;
                }
                ify0.P();
                if(!ify0.C && ify0.ao() && z2) {
                    if((ify2 == null || !ify2.ai()) && (ify2 == null || !ify2.al())) {
                        igv1.b.d(ify0, 4);
                    }
                    if(!igv1.d) {
                        ili.L(this);
                    }
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
    }

    @Override  // iio
    public final void u() {
        ilt ilt0 = this.n;
        ilt0.n = true;
        if(ilt0.D() && !ilt0.s) {
            ilt0.s = true;
            ilt0.d.post(ilt0.t);
        }
    }

    @Override  // iio
    public final void v(ibth ibth0) {
        bzd bzd0 = this.aT;
        if(!bzd0.e(ibth0)) {
            bzd0.p(ibth0);
        }
    }

    @Override  // iio
    public final void w(ify ify0) {
        this.A.e.b(ify0);
        ili.L(this);
    }

    @Override  // iio
    public final void x(float f) {
        if(this.f) {
            if((f > 0.0f)) {
                if(Float.isNaN(this.aJ) || (f > this.aJ)) {
                    this.aJ = f;
                }
            }
            else if((f < 0.0f) && (Float.isNaN(this.aK) || (f < this.aK))) {
                this.aK = f;
            }
        }
    }

    @Override  // iio
    public final boolean y() {
        return ins.a.a(this);
    }

    @Override  // iio
    public final jed z() {
        return (jed)this.aG.a();
    }
}

