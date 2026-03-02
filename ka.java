import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater.Factory2;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class ka extends jg implements LayoutInflater.Factory2, my {
    public jy A;
    public boolean B;
    boolean C;
    public int D;
    boolean E;
    int F;
    public Rect G;
    public Rect H;
    private static final bzs I;
    private static final int[] J;
    private js K;
    private CharSequence L;
    private jn M;
    private jz N;
    private boolean O;
    private TextView P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private jy[] T;
    private boolean U;
    private boolean V;
    private Configuration W;
    private int X;
    private int Y;
    private boolean Z;
    private jv aa;
    private jv ab;
    private final Runnable ac;
    private boolean ad;
    private AppCompatViewInflater ae;
    private OnBackInvokedDispatcher af;
    private OnBackInvokedCallback ag;
    public static final boolean h;
    final Object i;
    final Context j;
    public Window k;
    im l;
    MenuInflater m;
    public qt n;
    lz o;
    ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    kfs s;
    public boolean t;
    ViewGroup u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    static {
        ka.I = new bzs();
        ka.J = new int[]{0x1010054};
        ka.h = "robolectric".equals(Build.FINGERPRINT) ^ 1;
    }

    public ka(Context context0, Activity activity0) {
        this(context0, null, activity0);
    }

    public ka(Context context0, Window window0, Object object0) {
        iz iz0 = null;
        this.s = null;
        this.t = true;
        this.X = -100;
        this.ac = new jh(this);
        this.j = context0;
        this.i = object0;
        if((object0 instanceof Dialog)) {
            while(context0 != null) {
                if((context0 instanceof iz)) {
                    iz0 = (iz)context0;
                }
                else if((context0 instanceof ContextWrapper)) {
                    context0 = ((ContextWrapper)context0).getBaseContext();
                    continue;
                }
                break;
            }
            if(iz0 != null) {
                this.X = ((ka)iz0.e()).X;
            }
        }
        if(this.X == -100) {
            bzs bzs0 = ka.I;
            Integer integer0 = (Integer)bzs0.get(this.i.getClass().getName());
            if(integer0 != null) {
                this.X = (int)integer0;
                bzs0.remove(this.i.getClass().getName());
            }
        }
        if(window0 != null) {
            this.ac(window0);
        }
        pc.f();
    }

    @Override  // jg
    public final void A() {
        if(this.v && this.O) {
            im im0 = this.b();
            if(im0 != null) {
                im0.L();
            }
        }
        pc.d().e(this.j);
        this.W = new Configuration(this.j.getResources().getConfiguration());
        this.aj(false, false);
    }

    @Override  // jg
    public final void B(int v) {
        switch(v) {
            case 8: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
                v = 108;
                break;
            }
            case 9: {
                Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
                v = 109;
            }
        }
        if(this.z && v == 108) {
            return;
        }
        if(this.v && v == 1) {
            this.v = false;
        }
        switch(v) {
            case 1: {
                this.ah();
                this.z = true;
                return;
            }
            case 2: {
                this.ah();
                this.Q = true;
                return;
            }
            case 5: {
                this.ah();
                this.R = true;
                return;
            }
            case 10: {
                this.ah();
                this.x = true;
                return;
            }
            case 108: {
                this.ah();
                this.v = true;
                return;
            }
            case 109: {
                this.ah();
                this.w = true;
                return;
            }
            default: {
                this.k.requestFeature(v);
            }
        }
    }

    public final int C() {
        return this.X == -100 ? jg.b : this.X;
    }

    final int D(Context context0, int v) {
        long v5;
        switch(v) {
            case -100: {
                return -1;
            }
            case 0: {
                if(((UiModeManager)context0.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    ko ko0 = ((jw)this.ab(context0)).a;
                    kn kn0 = ko0.c;
                    if(kn0.b > System.currentTimeMillis()) {
                        return kn0.a ? 2 : 1;
                    }
                    Location location0 = null;
                    Location location1 = jwl.a(ko0.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? ko0.a("network") : null;
                    if(jwl.a(ko0.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location0 = ko0.a("gps");
                    }
                    if(location0 == null || location1 == null) {
                        if(location0 != null) {
                            location1 = location0;
                        }
                    }
                    else if(location0.getTime() > location1.getTime()) {
                        location1 = location0;
                    }
                    if(location1 != null) {
                        long v1 = System.currentTimeMillis();
                        if(km.a == null) {
                            km.a = new km();
                        }
                        km km0 = km.a;
                        km0.a(v1 - 86400000L, location1.getLatitude(), location1.getLongitude());
                        km0.a(v1, location1.getLatitude(), location1.getLongitude());
                        boolean z = km0.d;
                        long v2 = km0.c;
                        long v3 = km0.b;
                        km0.a(v1 + 86400000L, location1.getLatitude(), location1.getLongitude());
                        long v4 = km0.c;
                        if(v2 != -1L && v3 != -1L) {
                            if(v1 > v3) {
                                v2 = v4;
                            }
                            else if(v1 > v2) {
                                v2 = v3;
                            }
                            v5 = v2 + 60000L;
                        }
                        else {
                            v5 = v1 + 43200000L;
                        }
                        kn0.a = z;
                        kn0.b = v5;
                        return z ? 2 : 1;
                    }
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int v6 = Calendar.getInstance().get(11);
                    return v6 < 6 || v6 >= 22 ? 2 : 1;
                }
                return -1;
            }
            case -1: 
            case 1: 
            case 2: {
                return v;
            }
            default: {
                if(v == 3) {
                    return ((jt)this.aa(context0)).a.isPowerSaveMode() ? 2 : 1;
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
    }

    public final Context E() {
        im im0 = this.b();
        Context context0 = im0 == null ? null : im0.c();
        return context0 == null ? this.j : context0;
    }

    public final Configuration F(Context context0, int v, jzd jzd0, Configuration configuration0, boolean z) {
        int v1;
        switch(v) {
            case 1: {
                v1 = 16;
                break;
            }
            case 2: {
                v1 = 0x20;
                break;
            }
            default: {
                v1 = z ? 0 : context0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
            }
        }
        Configuration configuration1 = new Configuration();
        configuration1.fontScale = 0.0f;
        if(configuration0 != null) {
            configuration1.setTo(configuration0);
        }
        configuration1.uiMode = v1 | configuration1.uiMode & -49;
        if(jzd0 != null) {
            jq.b(configuration1, jzd0);
        }
        return configuration1;
    }

    final jy G(Menu menu0) {
        jy[] arr_jy = this.T;
        int v1 = arr_jy == null ? 0 : arr_jy.length;
        for(int v = 0; v < v1; ++v) {
            jy jy0 = arr_jy[v];
            if(jy0 != null && jy0.h == menu0) {
                return jy0;
            }
        }
        return null;
    }

    final Window.Callback H() {
        return this.k.getCallback();
    }

    final jzd I(Context context0) {
        if(Build.VERSION.SDK_INT < 33) {
            jzd jzd0 = jg.c;
            if(jzd0 == null) {
                return null;
            }
            jzd jzd1 = jq.a(context0.getApplicationContext().getResources().getConfiguration());
            if(jzd0.h()) {
                return jzd.a.h() ? jzd1 : jzd.a;
            }
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            for(int v = 0; v < jzd0.a() + jzd1.a(); ++v) {
                Locale locale0 = v >= jzd0.a() ? jzd1.g(v - jzd0.a()) : jzd0.g(v);
                if(locale0 != null) {
                    linkedHashSet0.add(locale0);
                }
            }
            jzd jzd2 = jzd.b(((Locale[])linkedHashSet0.toArray(new Locale[linkedHashSet0.size()])));
            return jzd2.h() ? jzd1 : jzd2;
        }
        return null;
    }

    final CharSequence J() {
        return (this.i instanceof Activity) ? ((Activity)this.i).getTitle() : this.L;
    }

    final void K(int v, jy jy0, Menu menu0) {
        if(menu0 == null) {
            menu0 = jy0.h;
        }
        if(jy0.m && !this.C) {
            js js0 = this.K;
            Window.Callback window$Callback0 = this.k.getCallback();
            try {
                js0.b = true;
                window$Callback0.onPanelClosed(v, menu0);
                js0.b = false;
            }
            catch(Throwable throwable0) {
                js0.b = false;
                throw throwable0;
            }
        }
    }

    final void L(na na0) {
        if(this.S) {
            return;
        }
        this.S = true;
        this.n.b();
        Window.Callback window$Callback0 = this.H();
        if(window$Callback0 != null && !this.C) {
            window$Callback0.onPanelClosed(108, na0);
        }
        this.S = false;
    }

    final void M(jy jy0, boolean z) {
        if(z && jy0.a == 0 && (this.n != null && this.n.t())) {
            this.L(jy0.h);
            return;
        }
        WindowManager windowManager0 = (WindowManager)this.j.getSystemService("window");
        if(windowManager0 != null && jy0.m) {
            ViewGroup viewGroup0 = jy0.e;
            if(viewGroup0 != null) {
                windowManager0.removeView(viewGroup0);
                if(z) {
                    this.K(jy0.a, jy0, null);
                }
            }
        }
        jy0.k = false;
        jy0.l = false;
        jy0.m = false;
        jy0.f = null;
        jy0.n = true;
        if(this.A == jy0) {
            this.A = null;
        }
        if(jy0.a == 0) {
            this.R();
        }
    }

    final void N(int v) {
        jy jy0 = this.Y(v);
        if(jy0.h != null) {
            Bundle bundle0 = new Bundle();
            jy0.h.q(bundle0);
            if(bundle0.size() > 0) {
                jy0.p = bundle0;
            }
            jy0.h.u();
            jy0.h.clear();
        }
        jy0.o = true;
        jy0.n = true;
        if((v == 0 || v == 108) && this.n != null) {
            jy jy1 = this.Y(0);
            jy1.k = false;
            this.V(jy1, null);
        }
    }

    public final void O() {
        kfs kfs0 = this.s;
        if(kfs0 != null) {
            kfs0.a();
        }
    }

    public final void P() {
        ViewGroup viewGroup0;
        if(!this.O) {
            Context context0 = this.j;
            TypedArray typedArray0 = context0.obtainStyledAttributes(ku.j);
            if(!typedArray0.hasValue(0x75)) {
                typedArray0.recycle();
                throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            }
            if(typedArray0.getBoolean(0x7E, false)) {
                this.B(1);
            }
            else if(typedArray0.getBoolean(0x75, false)) {
                this.B(108);
            }
            if(typedArray0.getBoolean(0x76, false)) {
                this.B(109);
            }
            if(typedArray0.getBoolean(0x77, false)) {
                this.B(10);
            }
            this.y = typedArray0.getBoolean(0, false);
            typedArray0.recycle();
            this.ad();
            this.k.getDecorView();
            LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
            if(this.z) {
                viewGroup0 = this.x ? ((ViewGroup)layoutInflater0.inflate(0x7F0E001A, null)) : ((ViewGroup)layoutInflater0.inflate(0x7F0E0019, null));  // layout:abc_screen_simple_overlay_action_mode
            }
            else if(this.y) {
                viewGroup0 = (ViewGroup)layoutInflater0.inflate(0x7F0E0010, null);  // layout:abc_dialog_title_material
                this.w = false;
                this.v = false;
            }
            else if(this.v) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(0x7F040083, typedValue0, true);  // attr:actionBarTheme
                if(typedValue0.resourceId != 0) {
                    context0 = new adv(context0, typedValue0.resourceId);
                }
                viewGroup0 = (ViewGroup)LayoutInflater.from(context0).inflate(0x7F0E001B, null);  // layout:abc_screen_toolbar
                qt qt0 = (qt)viewGroup0.findViewById(0x7F0B10BE);  // id:decor_content_parent
                this.n = qt0;
                qt0.o(this.H());
                if(this.w) {
                    this.n.d(109);
                }
                if(this.Q) {
                    this.n.d(2);
                }
                if(this.R) {
                    this.n.d(5);
                }
            }
            else {
                viewGroup0 = null;
            }
            if(viewGroup0 == null) {
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.v + ", windowActionBarOverlay: " + this.w + ", android:windowIsFloating: " + this.y + ", windowActionModeOverlay: " + this.x + ", windowNoTitle: " + this.z + " }");
            }
            kex.b(viewGroup0, new ji(this));
            if(this.n == null) {
                this.P = (TextView)viewGroup0.findViewById(0x7F0B22B8);  // id:title
            }
            try {
                Method method0 = viewGroup0.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                if(!method0.isAccessible()) {
                    method0.setAccessible(true);
                }
                method0.invoke(viewGroup0, null);
            }
            catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException unused_ex) {
            }
            ContentFrameLayout contentFrameLayout0 = (ContentFrameLayout)viewGroup0.findViewById(0x7F0B0AC0);  // id:action_bar_activity_content
            ViewGroup viewGroup1 = (ViewGroup)this.k.findViewById(0x1020002);
            if(viewGroup1 != null) {
                while(viewGroup1.getChildCount() > 0) {
                    View view0 = viewGroup1.getChildAt(0);
                    viewGroup1.removeViewAt(0);
                    contentFrameLayout0.addView(view0);
                }
                viewGroup1.setId(-1);
                contentFrameLayout0.setId(0x1020002);
                if((viewGroup1 instanceof FrameLayout)) {
                    ((FrameLayout)viewGroup1).setForeground(null);
                }
            }
            this.k.setContentView(viewGroup0);
            contentFrameLayout0.i = new jj(this);
            this.u = viewGroup0;
            CharSequence charSequence0 = this.J();
            if(!TextUtils.isEmpty(charSequence0)) {
                qt qt1 = this.n;
                if(qt1 == null) {
                    im im0 = this.l;
                    if(im0 == null) {
                        TextView textView0 = this.P;
                        if(textView0 != null) {
                            textView0.setText(charSequence0);
                        }
                    }
                    else {
                        im0.C(charSequence0);
                    }
                }
                else {
                    qt1.p(charSequence0);
                }
            }
            ContentFrameLayout contentFrameLayout1 = (ContentFrameLayout)this.u.findViewById(0x1020002);
            View view1 = this.k.getDecorView();
            int v = view1.getPaddingLeft();
            int v1 = view1.getPaddingTop();
            int v2 = view1.getPaddingRight();
            int v3 = view1.getPaddingBottom();
            contentFrameLayout1.h.set(v, v1, v2, v3);
            if(contentFrameLayout1.isLaidOut()) {
                contentFrameLayout1.requestLayout();
            }
            TypedArray typedArray1 = this.j.obtainStyledAttributes(ku.j);
            if(contentFrameLayout1.b == null) {
                contentFrameLayout1.b = new TypedValue();
            }
            typedArray1.getValue(0x7C, contentFrameLayout1.b);
            if(contentFrameLayout1.c == null) {
                contentFrameLayout1.c = new TypedValue();
            }
            typedArray1.getValue(0x7D, contentFrameLayout1.c);
            if(typedArray1.hasValue(0x7A)) {
                if(contentFrameLayout1.d == null) {
                    contentFrameLayout1.d = new TypedValue();
                }
                typedArray1.getValue(0x7A, contentFrameLayout1.d);
            }
            if(typedArray1.hasValue(0x7B)) {
                if(contentFrameLayout1.e == null) {
                    contentFrameLayout1.e = new TypedValue();
                }
                typedArray1.getValue(0x7B, contentFrameLayout1.e);
            }
            if(typedArray1.hasValue(120)) {
                if(contentFrameLayout1.f == null) {
                    contentFrameLayout1.f = new TypedValue();
                }
                typedArray1.getValue(120, contentFrameLayout1.f);
            }
            if(typedArray1.hasValue(0x79)) {
                if(contentFrameLayout1.g == null) {
                    contentFrameLayout1.g = new TypedValue();
                }
                typedArray1.getValue(0x79, contentFrameLayout1.g);
            }
            typedArray1.recycle();
            contentFrameLayout1.requestLayout();
            this.O = true;
            jy jy0 = this.Y(0);
            if(!this.C && jy0.h == null) {
                this.af(108);
            }
        }
    }

    @Override  // my
    public final void Q(na na0) {
        if(this.n != null && this.n.q() && (!ViewConfiguration.get(this.j).hasPermanentMenuKey() || this.n.s())) {
            Window.Callback window$Callback0 = this.H();
            if(this.n.t()) {
                this.n.r();
                if(!this.C) {
                    window$Callback0.onPanelClosed(108, this.Y(0).h);
                    return;
                }
            }
            else if(window$Callback0 != null && !this.C) {
                if(this.E && (1 & this.F) != 0) {
                    this.k.getDecorView().removeCallbacks(this.ac);
                    this.ac.run();
                }
                jy jy0 = this.Y(0);
                if(jy0.h != null && !jy0.o && window$Callback0.onPreparePanel(0, jy0.g, jy0.h)) {
                    window$Callback0.onMenuOpened(108, jy0.h);
                    this.n.v();
                }
            }
            return;
        }
        jy jy1 = this.Y(0);
        jy1.n = true;
        this.M(jy1, false);
        this.ag(jy1, null);
    }

    final void R() {
        if(Build.VERSION.SDK_INT >= 33) {
            if(this.af == null || !this.Y(0).m && this.o == null) {
                OnBackInvokedCallback onBackInvokedCallback0 = this.ag;
                if(onBackInvokedCallback0 != null) {
                    this.af.unregisterOnBackInvokedCallback(onBackInvokedCallback0);
                    this.ag = null;
                }
            }
            else if(this.ag == null) {
                OnBackInvokedDispatcher onBackInvokedDispatcher0 = this.af;
                Objects.requireNonNull(this);
                jr jr0 = new jr(this);
                onBackInvokedDispatcher0.registerOnBackInvokedCallback(1000000, jr0);
                this.ag = jr0;
            }
        }
    }

    final boolean S(KeyEvent keyEvent0) {
        boolean z3;
        if((this.i instanceof kdr) || (this.i instanceof kc)) {
            boolean z = this.k.getDecorView() == null;
        }
        boolean z1 = true;
        if(keyEvent0.getKeyCode() == 82) {
            js js0 = this.K;
            Window.Callback window$Callback0 = this.k.getCallback();
            try {
                js0.a = true;
                boolean z2 = window$Callback0.dispatchKeyEvent(keyEvent0);
                js0.a = false;
            }
            catch(Throwable throwable0) {
                js0.a = false;
                throw throwable0;
            }
            if(z2) {
                return true;
            }
        }
        int v = keyEvent0.getKeyCode();
        if(keyEvent0.getAction() == 0) {
            switch(v) {
                case 4: {
                    if((keyEvent0.getFlags() & 0x80) == 0) {
                        z1 = false;
                    }
                    this.U = z1;
                    return false;
                }
                case 82: {
                    if(keyEvent0.getRepeatCount() == 0) {
                        jy jy0 = this.Y(0);
                        if(jy0.m) {
                            return true;
                        }
                        this.V(jy0, keyEvent0);
                    }
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        switch(v) {
            case 4: {
                return this.T();
            }
            case 82: {
                if(this.o != null) {
                    return true;
                }
                jy jy1 = this.Y(0);
                if(this.n == null || !this.n.q() || ViewConfiguration.get(this.j).hasPermanentMenuKey()) {
                    boolean z4 = jy1.m;
                    if(!z4 && !jy1.l) {
                        if(jy1.k) {
                            if(jy1.o) {
                                jy1.k = false;
                                if(!this.V(jy1, keyEvent0)) {
                                    return true;
                                }
                            }
                            this.ag(jy1, keyEvent0);
                            goto label_56;
                        }
                        return true;
                    }
                    else {
                        this.M(jy1, true);
                        z3 = z4;
                    label_55:
                        if(z3) {
                        label_56:
                            AudioManager audioManager0 = (AudioManager)this.j.getApplicationContext().getSystemService("audio");
                            if(audioManager0 != null) {
                                audioManager0.playSoundEffect(0);
                                return true;
                            }
                            Log.w("AppCompatDelegate", "Couldn\'t get audio manager");
                        }
                    }
                }
                else if(!this.n.t()) {
                    if(!this.C && this.V(jy1, keyEvent0)) {
                        z3 = this.n.v();
                        goto label_55;
                    }
                    return true;
                }
                else {
                    z3 = this.n.r();
                    goto label_55;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    final boolean T() {
        boolean z = this.U;
        this.U = false;
        jy jy0 = this.Y(0);
        if(jy0.m) {
            if(!z) {
                this.M(jy0, true);
            }
            return true;
        }
        lz lz0 = this.o;
        if(lz0 != null) {
            lz0.f();
            return true;
        }
        im im0 = this.b();
        return im0 != null && im0.F();
    }

    @Override  // my
    public final boolean U(na na0, MenuItem menuItem0) {
        Window.Callback window$Callback0 = this.H();
        if(window$Callback0 != null && !this.C) {
            jy jy0 = this.G(na0.a());
            return jy0 == null ? false : window$Callback0.onMenuItemSelected(jy0.a, menuItem0);
        }
        return false;
    }

    public final boolean V(jy jy0, KeyEvent keyEvent0) {
        Resources.Theme resources$Theme1;
        if(this.C) {
            return false;
        }
        if(jy0.k) {
            return true;
        }
        jy jy1 = this.A;
        if(jy1 != null && jy1 != jy0) {
            this.M(jy1, false);
        }
        Window.Callback window$Callback0 = this.H();
        if(window$Callback0 != null) {
            jy0.g = window$Callback0.onCreatePanelView(jy0.a);
        }
        int v = jy0.a;
        boolean z = v == 0 || v == 108;
        if(z) {
            qt qt0 = this.n;
            if(qt0 != null) {
                qt0.n();
            }
        }
        if(jy0.g == null && (!z || !(this.l instanceof kl))) {
            na na0 = jy0.h;
            if(na0 == null || jy0.o) {
                if(na0 == null) {
                    Context context0 = this.j;
                    if((v == 0 || v == 108) && this.n != null) {
                        TypedValue typedValue0 = new TypedValue();
                        Resources.Theme resources$Theme0 = context0.getTheme();
                        resources$Theme0.resolveAttribute(0x7F040083, typedValue0, true);  // attr:actionBarTheme
                        if(typedValue0.resourceId == 0) {
                            resources$Theme0.resolveAttribute(0x7F040084, typedValue0, true);  // attr:actionBarWidgetTheme
                            resources$Theme1 = null;
                        }
                        else {
                            resources$Theme1 = context0.getResources().newTheme();
                            resources$Theme1.setTo(resources$Theme0);
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                            resources$Theme1.resolveAttribute(0x7F040084, typedValue0, true);  // attr:actionBarWidgetTheme
                        }
                        if(typedValue0.resourceId != 0) {
                            if(resources$Theme1 == null) {
                                resources$Theme1 = context0.getResources().newTheme();
                                resources$Theme1.setTo(resources$Theme0);
                            }
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                        }
                        if(resources$Theme1 != null) {
                            adv adv0 = new adv(context0, 0);
                            adv0.getTheme().setTo(resources$Theme1);
                            context0 = adv0;
                        }
                    }
                    na na1 = new na(context0);
                    na1.b = this;
                    jy0.a(na1);
                    if(jy0.h == null) {
                        return false;
                    }
                }
                if(z) {
                    qt qt1 = this.n;
                    if(qt1 != null) {
                        if(this.M == null) {
                            this.M = new jn(this);
                        }
                        qt1.m(jy0.h, this.M);
                    }
                }
                jy0.h.u();
                if(!window$Callback0.onCreatePanelMenu(v, jy0.h)) {
                    jy0.a(null);
                    if(z) {
                        qt qt2 = this.n;
                        if(qt2 != null) {
                            qt2.m(null, this.M);
                        }
                    }
                    return false;
                }
                jy0.o = false;
            }
            jy0.h.u();
            Bundle bundle0 = jy0.p;
            if(bundle0 != null) {
                jy0.h.p(bundle0);
                jy0.p = null;
            }
            if(!window$Callback0.onPreparePanel(0, jy0.g, jy0.h)) {
                if(z) {
                    qt qt3 = this.n;
                    if(qt3 != null) {
                        qt3.m(null, this.M);
                    }
                }
                jy0.h.t();
                return false;
            }
            boolean z1 = KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1;
            jy0.h.setQwertyMode(z1);
            jy0.h.t();
        }
        jy0.k = true;
        jy0.l = false;
        this.A = jy0;
        return true;
    }

    final boolean W() {
        return this.O && (this.u != null && this.u.isLaidOut());
    }

    public final View X(String s, Context context0, AttributeSet attributeSet0) {
        View view3;
        View view2;
        Object[] arr_object;
        View view1;
        View view0 = null;
        if(this.ae == null) {
            Context context1 = this.j;
            TypedArray typedArray0 = context1.obtainStyledAttributes(ku.j);
            String s1 = typedArray0.getString(0x74);
            typedArray0.recycle();
            if(s1 == null) {
                this.ae = new AppCompatViewInflater();
            }
            else {
                try {
                    this.ae = (AppCompatViewInflater)context1.getClassLoader().loadClass(s1).getDeclaredConstructor(null).newInstance(null);
                }
                catch(Throwable throwable0) {
                    Log.i("AppCompatDelegate", a.a(s1, "Failed to instantiate custom view inflater ", ". Falling back to default."), throwable0);
                    this.ae = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater0 = this.ae;
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, ku.A, 0, 0);
        int v = typedArray1.getResourceId(4, 0);
        if(v != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArray1.recycle();
        Context context2 = v != 0 && (!(context0 instanceof adv) || ((adv)context0).a != v) ? new adv(context0, v) : context0;
        switch(s) {
            case "AutoCompleteTextView": {
                view1 = appCompatViewInflater0.a(context2, attributeSet0);
                break;
            }
            case "Button": {
                view1 = appCompatViewInflater0.b(context2, attributeSet0);
                break;
            }
            case "CheckBox": {
                view1 = appCompatViewInflater0.c(context2, attributeSet0);
                break;
            }
            case "CheckedTextView": {
                view1 = new oy(context2, attributeSet0);
                break;
            }
            case "EditText": {
                view1 = new pf(context2, attributeSet0);
                break;
            }
            case "ImageButton": {
                view1 = new AppCompatImageButton(context2, attributeSet0);
                break;
            }
            case "ImageView": {
                view1 = new AppCompatImageView(context2, attributeSet0);
                break;
            }
            case "MultiAutoCompleteTextView": {
                view1 = new pk(context2, attributeSet0);
                break;
            }
            case "RadioButton": {
                view1 = appCompatViewInflater0.d(context2, attributeSet0);
                break;
            }
            case "RatingBar": {
                view1 = new po(context2, attributeSet0);
                break;
            }
            case "SeekBar": {
                view1 = new pp(context2, attributeSet0);
                break;
            }
            case "Spinner": {
                view1 = new AppCompatSpinner(context2, attributeSet0);
                break;
            }
            case "TextView": {
                view1 = appCompatViewInflater0.e(context2, attributeSet0);
                break;
            }
            case "ToggleButton": {
                view1 = new qm(context2, attributeSet0);
                break;
            }
            default: {
                view1 = null;
            }
        }
        if(view1 == null && context0 != context2) {
            if(s.equals("view")) {
                s = attributeSet0.getAttributeValue(null, "class");
            }
            try {
                arr_object = appCompatViewInflater0.c;
                arr_object[0] = context2;
                arr_object[1] = attributeSet0;
                if(s.indexOf(46) == -1) {
                    for(int v1 = 0; true; ++v1) {
                        if(v1 >= 3) {
                            arr_object[0] = null;
                            arr_object[1] = null;
                            break;
                        }
                        view2 = appCompatViewInflater0.f(context2, s, AppCompatViewInflater.b[v1]);
                        if(view2 != null) {
                            arr_object[0] = null;
                            arr_object[1] = null;
                            view0 = view2;
                            break;
                        }
                    }
                }
                else {
                    goto label_74;
                }
                goto label_86;
            }
            catch(Exception unused_ex) {
                appCompatViewInflater0.c[0] = null;
                appCompatViewInflater0.c[1] = null;
                goto label_86;
            }
            catch(Throwable throwable1) {
                appCompatViewInflater0.c[0] = null;
                appCompatViewInflater0.c[1] = null;
                throw throwable1;
            }
            arr_object[0] = null;
            arr_object[1] = null;
            view0 = view2;
            goto label_86;
            try {
            label_74:
                view3 = appCompatViewInflater0.f(context2, s, null);
            }
            catch(Exception unused_ex) {
                appCompatViewInflater0.c[0] = null;
                appCompatViewInflater0.c[1] = null;
                goto label_86;
            }
            catch(Throwable throwable1) {
                appCompatViewInflater0.c[0] = null;
                appCompatViewInflater0.c[1] = null;
                throw throwable1;
            }
            appCompatViewInflater0.c[0] = null;
            appCompatViewInflater0.c[1] = null;
            view0 = view3;
        label_86:
            view1 = view0;
        }
        if(view1 != null) {
            Context context3 = view1.getContext();
            if((context3 instanceof ContextWrapper) && view1.hasOnClickListeners()) {
                TypedArray typedArray2 = context3.obtainStyledAttributes(attributeSet0, AppCompatViewInflater.a);
                String s2 = typedArray2.getString(0);
                if(s2 != null) {
                    view1.setOnClickListener(new ke(view1, s2));
                }
                typedArray2.recycle();
            }
        }
        return view1;
    }

    public final jy Y(int v) {
        jy[] arr_jy = this.T;
        if(arr_jy == null || arr_jy.length <= v) {
            jy[] arr_jy1 = new jy[v + 1];
            if(arr_jy != null) {
                System.arraycopy(arr_jy, 0, arr_jy1, 0, arr_jy.length);
            }
            this.T = arr_jy1;
            arr_jy = arr_jy1;
        }
        jy jy0 = arr_jy[v];
        if(jy0 == null) {
            jy0 = new jy(v);
            arr_jy[v] = jy0;
        }
        return jy0;
    }

    public final boolean Z(jy jy0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.isSystem()) {
            return false;
        }
        if(jy0.k || this.V(jy0, keyEvent0)) {
            return jy0.h == null ? false : jy0.h.performShortcut(v, keyEvent0, 1);
        }
        return false;
    }

    @Override  // jg
    public final Context a() {
        return this.j;
    }

    private final jv aa(Context context0) {
        if(this.ab == null) {
            this.ab = new jt(this, context0);
        }
        return this.ab;
    }

    private final jv ab(Context context0) {
        if(this.aa == null) {
            if(ko.a == null) {
                Context context1 = context0.getApplicationContext();
                ko.a = new ko(context1, ((LocationManager)context1.getSystemService("location")));
            }
            this.aa = new jw(this, ko.a);
        }
        return this.aa;
    }

    private final void ac(Window window0) {
        if(this.k != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback window$Callback0 = window0.getCallback();
        if((window$Callback0 instanceof js)) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        js js0 = new js(this, window$Callback0);
        this.K = js0;
        window0.setCallback(js0);
        wi wi0 = wi.k(this.j, null, ka.J);
        Drawable drawable0 = wi0.i(0);
        if(drawable0 != null) {
            window0.setBackgroundDrawable(drawable0);
        }
        wi0.o();
        this.k = window0;
        if(Build.VERSION.SDK_INT >= 33 && this.af == null) {
            Object object0 = this.i;
            this.af = (object0 instanceof Activity) && ((Activity)object0).getWindow() != null ? ((Activity)object0).getOnBackInvokedDispatcher() : null;
            this.R();
        }
    }

    private final void ad() {
        if(this.k == null) {
            Object object0 = this.i;
            if((object0 instanceof Activity)) {
                this.ac(((Activity)object0).getWindow());
            }
        }
        if(this.k != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private final void ae() {
        this.P();
        if(this.v && this.l == null) {
            Object object0 = this.i;
            if((object0 instanceof Activity)) {
                this.l = new kt(((Activity)object0), this.w);
            }
            else if((object0 instanceof Dialog)) {
                this.l = new kt(((Dialog)object0));
            }
            im im0 = this.l;
            if(im0 != null) {
                im0.n(this.ad);
            }
        }
    }

    private final void af(int v) {
        this.F |= 1 << v;
        if(!this.E) {
            this.k.getDecorView().postOnAnimation(this.ac);
            this.E = true;
        }
    }

    private final void ag(jy jy0, KeyEvent keyEvent0) {
        int v1;
        if(!jy0.m && !this.C) {
            int v = jy0.a;
            if(v != 0 || (this.j.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback window$Callback0 = this.H();
                if(window$Callback0 != null && !window$Callback0.onMenuOpened(v, jy0.h)) {
                    this.M(jy0, true);
                    return;
                }
                WindowManager windowManager0 = (WindowManager)this.j.getSystemService("window");
                if(windowManager0 != null && this.V(jy0, keyEvent0)) {
                    ViewGroup viewGroup0 = jy0.e;
                    if(viewGroup0 != null && !jy0.n) {
                        View view0 = jy0.g;
                        if(view0 == null) {
                            v1 = -2;
                        }
                        else {
                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                            v1 = viewGroup$LayoutParams0 != null && viewGroup$LayoutParams0.width == -1 ? -1 : -2;
                        }
                        goto label_81;
                    }
                    else if(viewGroup0 == null) {
                        Context context0 = this.E();
                        TypedValue typedValue0 = new TypedValue();
                        Resources.Theme resources$Theme0 = context0.getResources().newTheme();
                        resources$Theme0.setTo(context0.getTheme());
                        resources$Theme0.resolveAttribute(0x7F040076, typedValue0, true);  // attr:actionBarPopupTheme
                        if(typedValue0.resourceId != 0) {
                            resources$Theme0.applyStyle(typedValue0.resourceId, true);
                        }
                        resources$Theme0.resolveAttribute(0x7F040990, typedValue0, true);  // attr:panelMenuListTheme
                        if(typedValue0.resourceId == 0) {
                            resources$Theme0.applyStyle(0x7F160BF8, true);  // style:Theme.AppCompat.CompactMenu
                        }
                        else {
                            resources$Theme0.applyStyle(typedValue0.resourceId, true);
                        }
                        adv adv0 = new adv(context0, 0);
                        adv0.getTheme().setTo(resources$Theme0);
                        jy0.j = adv0;
                        TypedArray typedArray0 = adv0.obtainStyledAttributes(ku.j);
                        jy0.b = typedArray0.getResourceId(86, 0);
                        jy0.d = typedArray0.getResourceId(1, 0);
                        typedArray0.recycle();
                        jy0.e = new jx(this, jy0.j);
                        jy0.c = 81;
                        if(jy0.e != null) {
                            goto label_47;
                        }
                    }
                    else {
                        if(jy0.n && viewGroup0.getChildCount() > 0) {
                            jy0.e.removeAllViews();
                        }
                    label_47:
                        View view1 = jy0.g;
                        if(view1 != null) {
                            jy0.f = view1;
                            goto label_69;
                        }
                        else if(jy0.h == null) {
                            jy0.n = true;
                        }
                        else {
                            if(this.N == null) {
                                this.N = new jz(this);
                            }
                            jz jz0 = this.N;
                            if(jy0.i == null) {
                                jy0.i = new mw(jy0.j);
                                jy0.i.e = jz0;
                                jy0.h.g(jy0.i);
                            }
                            mw mw0 = jy0.i;
                            ViewGroup viewGroup1 = jy0.e;
                            if(mw0.d == null) {
                                mw0.d = (ExpandedMenuView)mw0.b.inflate(0x7F0E0011, viewGroup1, false);  // layout:abc_expanded_menu_layout
                                if(mw0.f == null) {
                                    mw0.f = new mv(mw0);
                                }
                                mw0.d.setAdapter(mw0.f);
                                mw0.d.setOnItemClickListener(mw0);
                            }
                            jy0.f = mw0.d;
                            if(jy0.f == null) {
                                goto label_92;
                            }
                        label_69:
                            if(jy0.f == null || jy0.g == null && jy0.i.k().getCount() <= 0) {
                                jy0.n = true;
                                return;
                            }
                            ViewGroup.LayoutParams viewGroup$LayoutParams1 = jy0.f.getLayoutParams();
                            if(viewGroup$LayoutParams1 == null) {
                                viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            jy0.e.setBackgroundResource(jy0.b);
                            ViewParent viewParent0 = jy0.f.getParent();
                            if((viewParent0 instanceof ViewGroup)) {
                                ((ViewGroup)viewParent0).removeView(jy0.f);
                            }
                            jy0.e.addView(jy0.f, viewGroup$LayoutParams1);
                            if(!jy0.f.hasFocus()) {
                                jy0.f.requestFocus();
                            }
                            v1 = -2;
                        label_81:
                            jy0.l = false;
                            WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams(v1, -2, 0, 0, 1002, 0x820000, -3);
                            windowManager$LayoutParams0.gravity = jy0.c;
                            windowManager$LayoutParams0.windowAnimations = jy0.d;
                            windowManager0.addView(jy0.e, windowManager$LayoutParams0);
                            jy0.m = true;
                            if(v == 0) {
                                this.R();
                                return;
                            label_92:
                                jy0.n = true;
                            }
                        }
                    }
                }
            }
        }
    }

    private final void ah() {
        if(!this.O) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private final void ai(boolean z) {
        this.aj(z, true);
    }

    private final void aj(boolean z, boolean z1) {
        int v2;
        if(!this.C) {
            int v = this.C();
            Context context0 = this.j;
            int v1 = this.D(context0, v);
            jzd jzd0 = Build.VERSION.SDK_INT >= 33 ? null : this.I(context0);
            if(!z1 && jzd0 != null) {
                jzd0 = jq.a(context0.getResources().getConfiguration());
            }
            Configuration configuration0 = this.F(context0, v1, jzd0, null, false);
            boolean z2 = false;
            if(this.Z) {
                this.Z = true;
                v2 = this.Y;
            }
            else {
                Object object0 = this.i;
                if((object0 instanceof Activity)) {
                    PackageManager packageManager0 = context0.getPackageManager();
                    if(packageManager0 == null) {
                        v2 = 0;
                    }
                    else {
                        try {
                            ActivityInfo activityInfo0 = packageManager0.getActivityInfo(new ComponentName(context0, object0.getClass()), 0x100C0000);
                            if(activityInfo0 != null) {
                                this.Y = activityInfo0.configChanges;
                            }
                        }
                        catch(PackageManager.NameNotFoundException unused_ex) {
                            this.Y = 0;
                        }
                        this.Z = true;
                        v2 = this.Y;
                    }
                }
                else {
                    this.Z = true;
                    v2 = this.Y;
                }
            }
            Configuration configuration1 = this.W == null ? this.j.getResources().getConfiguration() : this.W;
            int v3 = configuration1.uiMode & 0x30;
            int v4 = configuration0.uiMode & 0x30;
            jzd jzd1 = jq.a(configuration1);
            jzd jzd2 = jzd0 == null ? null : jq.a(configuration0);
            int v5 = v3 == v4 ? 0 : 0x200;
            if(jzd2 != null && !jzd1.equals(jzd2)) {
                v5 |= 0x2004;
            }
            if((~v2 & v5) != 0 && z && this.B && (ka.h || this.V)) {
                Object object1 = this.i;
                if((object1 instanceof Activity) && !((Activity)object1).isChild()) {
                    if((v5 & 0x2000) != 0) {
                        ((Activity)object1).getWindow().getDecorView().setLayoutDirection(configuration0.getLayoutDirection());
                    }
                    ((Activity)object1).recreate();
                    z2 = true;
                }
            }
            if(!z2 && v5 != 0) {
                Context context1 = this.j;
                Resources resources0 = context1.getResources();
                Configuration configuration2 = new Configuration(resources0.getConfiguration());
                configuration2.uiMode = resources0.getConfiguration().uiMode & -49 | v4;
                if(jzd2 != null) {
                    jq.b(configuration2, jzd2);
                }
                resources0.updateConfiguration(configuration2, null);
                int v6 = this.D;
                if(v6 != 0) {
                    context1.setTheme(v6);
                    context1.getTheme().applyStyle(this.D, true);
                }
                if((v5 & v2) == v5) {
                    Object object2 = this.i;
                    if(!(object2 instanceof Activity)) {
                    }
                    else if(!(((Activity)object2) instanceof lps)) {
                        if(this.V && !this.C) {
                            ((Activity)object2).onConfigurationChanged(configuration2);
                            this.k.getDecorView().dispatchConfigurationChanged(configuration2);
                        }
                    }
                    else if(((lps)(((Activity)object2))).getLifecycle().a().a(lpf.c)) {
                        ((Activity)object2).onConfigurationChanged(configuration2);
                        this.k.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                }
                goto label_69;
            }
            else if(z2) {
            label_69:
                Object object3 = this.i;
                if((object3 instanceof iz)) {
                    if((v5 & 0x200) != 0) {
                        iz iz0 = (iz)object3;
                    }
                    if((v5 & 4) != 0) {
                        iz iz1 = (iz)object3;
                    }
                }
            }
            if(jzd2 != null) {
                LocaleList.setDefault(LocaleList.forLanguageTags(jq.a(this.j.getResources().getConfiguration()).f()));
            }
            if(v == 0) {
                this.ab(this.j).d();
            }
            else {
                jv jv0 = this.aa;
                if(jv0 != null) {
                    jv0.c();
                }
                if(v == 3) {
                    this.aa(this.j).d();
                    return;
                }
            }
            jv jv1 = this.ab;
            if(jv1 != null) {
                jv1.c();
            }
        }
    }

    @Override  // jg
    public final im b() {
        this.ae();
        return this.l;
    }

    @Override  // jg
    public final MenuInflater c() {
        if(this.m == null) {
            this.ae();
            this.m = new mg((this.l == null ? this.j : this.l.c()));
        }
        return this.m;
    }

    @Override  // jg
    public final View d(int v) {
        this.P();
        return this.k.findViewById(v);
    }

    @Override  // jg
    public final void f(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.P();
        ((ViewGroup)this.u.findViewById(0x1020002)).addView(view0, viewGroup$LayoutParams0);
        this.K.a(this.k.getCallback());
    }

    @Override  // jg
    public final void g() {
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.j);
        if(layoutInflater0.getFactory() == null) {
            layoutInflater0.setFactory2(this);
            return;
        }
        if(!(layoutInflater0.getFactory2() instanceof ka)) {
            Log.i("AppCompatDelegate", "The Activity\'s LayoutInflater already has a Factory installed so we can not install AppCompat\'s");
        }
    }

    @Override  // jg
    public final void h() {
        if(this.l != null && !this.b().G()) {
            this.af(0);
        }
    }

    @Override  // jg
    public final void i() {
        String s1;
        if((this.i instanceof Activity)) {
            synchronized(jg.g) {
                jg.m(this);
            }
        }
        if(this.E) {
            this.k.getDecorView().removeCallbacks(this.ac);
        }
        this.C = true;
        if(this.X == -100) {
            s1 = this.i.getClass().getName();
            ka.I.remove(s1);
        }
        else {
            Object object0 = this.i;
            if((object0 instanceof Activity) && ((Activity)object0).isChangingConfigurations()) {
                String s = object0.getClass().getName();
                ka.I.put(s, Integer.valueOf(this.X));
            }
            else {
                s1 = this.i.getClass().getName();
                ka.I.remove(s1);
            }
        }
        im im0 = this.l;
        if(im0 != null) {
            im0.i();
        }
        jv jv0 = this.aa;
        if(jv0 != null) {
            jv0.c();
        }
        jv jv1 = this.ab;
        if(jv1 != null) {
            jv1.c();
        }
    }

    @Override  // jg
    public final void j() {
        im im0 = this.b();
        if(im0 != null) {
            im0.y(true);
        }
    }

    @Override  // jg
    public final void k() {
        this.aj(true, false);
    }

    @Override  // jg
    public final void l() {
        im im0 = this.b();
        if(im0 != null) {
            im0.y(false);
        }
    }

    @Override  // jg
    public final void o(int v) {
        this.P();
        ViewGroup viewGroup0 = (ViewGroup)this.u.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        LayoutInflater.from(this.j).inflate(v, viewGroup0);
        this.K.a(this.k.getCallback());
    }

    @Override  // android.view.LayoutInflater$Factory2
    public final View onCreateView(View view0, String s, Context context0, AttributeSet attributeSet0) {
        return this.X(s, context0, attributeSet0);
    }

    @Override  // android.view.LayoutInflater$Factory
    public final View onCreateView(String s, Context context0, AttributeSet attributeSet0) {
        return this.X(s, context0, attributeSet0);
    }

    @Override  // jg
    public final void p(View view0) {
        this.P();
        ViewGroup viewGroup0 = (ViewGroup)this.u.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0);
        this.K.a(this.k.getCallback());
    }

    @Override  // jg
    public final void q(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.P();
        ViewGroup viewGroup0 = (ViewGroup)this.u.findViewById(0x1020002);
        viewGroup0.removeAllViews();
        viewGroup0.addView(view0, viewGroup$LayoutParams0);
        this.K.a(this.k.getCallback());
    }

    @Override  // jg
    public final void s(int v) {
        if(this.X != v) {
            this.X = v;
            if(this.B) {
                this.y();
            }
        }
    }

    @Override  // jg
    public final void t(Toolbar toolbar0) {
        if(!(this.i instanceof Activity)) {
            return;
        }
        im im0 = this.b();
        if((im0 instanceof kt)) {
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
        this.m = null;
        if(im0 != null) {
            im0.i();
        }
        this.l = null;
        if(toolbar0 == null) {
            this.K.d = null;
        }
        else {
            kl kl0 = new kl(toolbar0, this.J(), this.K);
            this.l = kl0;
            this.K.d = kl0.d;
            if(!toolbar0.x) {
                toolbar0.x = true;
                toolbar0.H();
            }
        }
        this.h();
    }

    @Override  // jg
    public final void u(CharSequence charSequence0) {
        this.L = charSequence0;
        qt qt0 = this.n;
        if(qt0 == null) {
            im im0 = this.l;
            if(im0 != null) {
                im0.C(charSequence0);
                return;
            }
            TextView textView0 = this.P;
            if(textView0 != null) {
                textView0.setText(charSequence0);
            }
            return;
        }
        qt0.p(charSequence0);
    }

    @Override  // jg
    public final void x() {
        Context context0 = this.j;
        if(ka.w(context0) && (jg.c != null && !jg.c.equals(jg.d))) {
            ja ja0 = new ja(context0);
            jg.a.execute(ja0);
        }
        this.ai(true);
    }

    @Override  // jg
    public final void y() {
        this.ai(true);
    }

    @Override  // jg
    public final void z() {
        this.B = true;
        this.ai(false);
        this.ad();
        Object object0 = this.i;
        if((object0 instanceof Activity)) {
            try {
                String s = null;
                s = jua.c(((Activity)object0));
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(s != null) {
                im im0 = this.l;
                if(im0 == null) {
                    this.ad = true;
                }
                else {
                    im0.n(true);
                }
            }
            synchronized(jg.g) {
                jg.m(this);
                WeakReference weakReference0 = new WeakReference(this);
                jg.f.add(weakReference0);
            }
        }
        this.W = new Configuration(this.j.getResources().getConfiguration());
        this.V = true;
    }
}

