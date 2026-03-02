import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Objects;
import java.util.UUID;

public final class jqc extends ijr {
    public final View a;
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public jqe d;
    public jlm e;
    public final gra f;
    public final gra g;
    public final gui h;
    public final int[] i;
    private static final ibts j;
    private ibth k;
    private jqg l;
    private jlh m;
    private final float n;
    private final Rect o;
    private final hcu p;
    private Object q;
    private final gra r;
    private boolean s;

    static {
        jqc.j = jpw.a;
    }

    public jqc(ibth ibth0, jqg jqg0, View view0, jks jks0, jqe jqe0, UUID uUID0) {
        super(view0.getContext(), null, 0, 6, null);
        this.k = ibth0;
        this.l = jqg0;
        this.a = view0;
        Object object0 = view0.getContext().getSystemService("window");
        ibuq.d(object0, "null cannot be cast to non-null type android.view.WindowManager");
        this.b = (WindowManager)object0;
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        windowManager$LayoutParams0.flags = jpe.a(this.l, jpe.b(view0));
        windowManager$LayoutParams0.type = 1002;
        windowManager$LayoutParams0.token = view0.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.setTitle("Pop-Up Window");
        this.c = windowManager$LayoutParams0;
        this.d = jqe0;
        this.e = jlm.a;
        this.f = new ParcelableSnapshotMutableState(null, gul.a);
        this.g = new ParcelableSnapshotMutableState(null, gul.a);
        this.h = new gpx(new jpy(this), null);
        this.n = 8.0f;
        this.o = new Rect();
        this.p = new hcu(new jqa(this));
        this.setId(0x1020002);
        lsr.b(this, lsr.a(view0));
        lss.b(this, lss.a(view0));
        oro.b(this, oro.a(view0));
        Objects.toString(uUID0);
        this.setTag(0x7F0B0F7D, "Popup:" + uUID0);  // id:compose_view_saveable_id_tag
        this.setClipChildren(false);
        this.setElevation(jks0.eg(8.0f));
        this.setOutlineProvider(new jpv());
        this.r = new ParcelableSnapshotMutableState(jpl.a, gul.a);
        this.i = new int[2];
    }

    public final hzk a() {
        return (hzk)this.g.a();
    }

    public final jlk b() {
        return (jlk)this.f.a();
    }

    @Override  // ijr
    protected final boolean c() {
        return this.s;
    }

    @Override  // ijr
    public final void d(goz goz0, int v) {
        goz goz1 = goz0.ao(-857613600);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if(goz1.ad((v1 & 3) != 2, v1 & 1)) {
            ((ibtw)this.r.a()).a(goz1, Integer.valueOf(0));
        }
        else {
            goz1.G();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new jpx(this, v);
        }
    }

    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(!this.l.c) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        switch(keyEvent0.getKeyCode()) {
            case 4: 
            case 0x6F: {
                KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
                if(keyEvent$DispatcherState0 == null) {
                    return super.dispatchKeyEvent(keyEvent0);
                }
                if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
                    keyEvent$DispatcherState0.startTracking(keyEvent0, this);
                    return true;
                }
                if(keyEvent0.getAction() == 1 && keyEvent$DispatcherState0.isTracking(keyEvent0) && !keyEvent0.isCanceled()) {
                    ibth ibth0 = this.k;
                    if(ibth0 != null) {
                        ibth0.a();
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent0);
            }
            default: {
                return super.dispatchKeyEvent(keyEvent0);
            }
        }
    }

    @Override  // ijr
    public final void g(boolean z, int v, int v1, int v2, int v3) {
        super.g(z, v, v1, v2, v3);
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.c.width = view0.getMeasuredWidth();
        this.c.height = view0.getMeasuredHeight();
        jqd.a(this.b, this, this.c);
    }

    @Override  // ijr
    public final void h(int v, int v1) {
        jlh jlh0 = this.o();
        super.h(View.MeasureSpec.makeMeasureSpec(jlh0.b(), 0x80000000), View.MeasureSpec.makeMeasureSpec(jlh0.a(), 0x80000000));
    }

    public final void k(gpg gpg0, ibtw ibtw0) {
        super.i(gpg0);
        this.r.b(ibtw0);
        this.s = true;
    }

    public final void l() {
        hzk hzk0 = this.a();
        if(hzk0 != null) {
            if(!hzk0.t()) {
                hzk0 = null;
            }
            if(hzk0 != null) {
                long v = hzk0.g();
                long v1 = hzl.b(hzk0);
                jlh jlh0 = jli.a(((long)Math.round(Float.intBitsToFloat(((int)(v1 >> 0x20))))) << 0x20 | ((long)Math.round(Float.intBitsToFloat(((int)(v1 & 0xFFFFFFFFL))))) & 0xFFFFFFFFL, v);
                if(!ibuq.m(jlh0, this.m)) {
                    this.m = jlh0;
                    this.m();
                }
            }
        }
    }

    public final void m() {
        jlh jlh0 = this.m;
        if(jlh0 != null) {
            jlk jlk0 = this.b();
            if(jlk0 != null) {
                jlh jlh1 = this.o();
                ibvc ibvc0 = new ibvc();
                ibvc0.a = 0L;
                long v = ((long)jlh1.b()) << 0x20 | ((long)jlh1.a()) & 0xFFFFFFFFL;
                jqb jqb0 = new jqb(ibvc0, this, jlh0, v, jlk0.a);
                this.p.c(this, jqc.j, jqb0);
                this.c.x = jlf.a(ibvc0.a);
                this.c.y = jlf.b(ibvc0.a);
                this.setSystemGestureExclusionRects(ibpo.i(new Rect[]{new Rect(0, 0, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)))}));
                jqd.a(this.b, this, this.c);
            }
        }
    }

    public final void n(ibth ibth0, jqg jqg0, jlm jlm0) {
        this.k = ibth0;
        if(!ibuq.m(this.l, jqg0)) {
            this.l = jqg0;
            this.c.flags = jpe.a(jqg0, jpe.b(this.a));
            jqd.a(this.b, this, this.c);
        }
        if(jlm0.ordinal() != 0 && jlm0.ordinal() != 1) {
            throw new ibnq();
        }
    }

    private final jlh o() {
        this.a.getWindowVisibleDisplayFrame(this.o);
        return new jlh(this.o.left, this.o.top, this.o.right, this.o.bottom);
    }

    @Override  // ijr
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.d();
        if(this.l.c && Build.VERSION.SDK_INT >= 33) {
            if(this.q == null) {
                this.q = new jph(this.k);
            }
            Object object0 = this.q;
            if(jb..ExternalSyntheticApiModelOutline0.m$2(object0)) {
                OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.findOnBackInvokedDispatcher();
                if(onBackInvokedDispatcher0 != null) {
                    onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, ((OnBackInvokedCallback)object0));
                }
            }
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.e();
        this.p.a();
        if(Build.VERSION.SDK_INT >= 33) {
            Object object0 = this.q;
            if(jb..ExternalSyntheticApiModelOutline0.m$2(object0)) {
                OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.findOnBackInvokedDispatcher();
                if(onBackInvokedDispatcher0 != null) {
                    onBackInvokedDispatcher0.unregisterOnBackInvokedCallback(((OnBackInvokedCallback)object0));
                }
            }
        }
        this.q = null;
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.l.d) {
            return super.onTouchEvent(motionEvent0);
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 0 && ((motionEvent0.getX() < 0.0f || motionEvent0.getX() >= ((float)this.getWidth()) || motionEvent0.getY() < 0.0f) || (motionEvent0.getY() >= ((float)this.getHeight())))) {
            ibth ibth0 = this.k;
            if(ibth0 == null) {
                return true;
            }
            ibth0.a();
            return true;
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 4) {
            ibth ibth1 = this.k;
            if(ibth1 != null) {
                ibth1.a();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final void setLayoutDirection(int v) {
    }
}

