import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager.LaunchedFragmentInfo;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class du implements aco, ComponentCallbacks, View.OnCreateContextMenuListener, loz, lps, lsq, orl {
    public fm A;
    public eh B;
    fm C;
    du D;
    public int E;
    public int F;
    public String G;
    public boolean H;
    public boolean I;
    public boolean J;
    boolean K;
    boolean L;
    boolean M;
    public boolean N;
    ViewGroup O;
    View P;
    boolean Q;
    public boolean R;
    dq S;
    Handler T;
    Runnable U;
    boolean V;
    private int Vc;
    private final ds Vo;
    LayoutInflater W;
    boolean X;
    public lpf Y;
    lpw Z;
    gj aa;
    lqi ab;
    lsk ac;
    ork ad;
    public final AtomicInteger ae;
    public final ArrayList af;
    static final Object e;
    int f;
    Bundle g;
    SparseArray h;
    Bundle i;
    Boolean j;
    public String k;
    Bundle l;
    du m;
    public String mPreviousWho;
    public String n;
    public int o;
    public Boolean p;
    boolean q;
    public boolean r;
    boolean s;
    boolean t;
    public boolean u;
    boolean v;
    public boolean w;
    public boolean x;
    boolean y;
    int z;

    static {
        du.e = new Object();
    }

    public du() {
        this.f = -1;
        this.k = UUID.randomUUID().toString();
        this.n = null;
        this.p = null;
        this.C = new fm();
        this.M = true;
        this.R = true;
        this.U = new dh(this);
        this.Y = lpf.e;
        this.ab = new lqi();
        this.ae = new AtomicInteger();
        this.af = new ArrayList();
        this.Vo = new di(this);
        this.kf();
    }

    public du(int v) {
        this.Vc = v;
    }

    public void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.print(s);
        printWriter0.print("mFragmentId=#");
        printWriter0.print(Integer.toHexString(this.E));
        printWriter0.print(" mContainerId=#");
        printWriter0.print(Integer.toHexString(this.F));
        printWriter0.print(" mTag=");
        printWriter0.println(this.G);
        printWriter0.print(s);
        printWriter0.print("mState=");
        printWriter0.print(this.f);
        printWriter0.print(" mWho=");
        printWriter0.print(this.k);
        printWriter0.print(" mBackStackNesting=");
        printWriter0.println(this.z);
        printWriter0.print(s);
        printWriter0.print("mAdded=");
        printWriter0.print(this.q);
        printWriter0.print(" mRemoving=");
        printWriter0.print(this.r);
        printWriter0.print(" mFromLayout=");
        printWriter0.print(this.u);
        printWriter0.print(" mInLayout=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("mHidden=");
        printWriter0.print(this.H);
        printWriter0.print(" mDetached=");
        printWriter0.print(this.I);
        printWriter0.print(" mMenuVisible=");
        printWriter0.print(this.M);
        printWriter0.print(" mHasMenu=");
        printWriter0.println(this.L);
        printWriter0.print(s);
        printWriter0.print("mRetainInstance=");
        printWriter0.print(this.J);
        printWriter0.print(" mUserVisibleHint=");
        printWriter0.println(this.R);
        if(this.A != null) {
            printWriter0.print(s);
            printWriter0.print("mFragmentManager=");
            printWriter0.println(this.A);
        }
        if(this.B != null) {
            printWriter0.print(s);
            printWriter0.print("mHost=");
            printWriter0.println(this.B);
        }
        if(this.D != null) {
            printWriter0.print(s);
            printWriter0.print("mParentFragment=");
            printWriter0.println(this.D);
        }
        if(this.l != null) {
            printWriter0.print(s);
            printWriter0.print("mArguments=");
            printWriter0.println(this.l);
        }
        if(this.g != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedFragmentState=");
            printWriter0.println(this.g);
        }
        if(this.h != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewState=");
            printWriter0.println(this.h);
        }
        if(this.i != null) {
            printWriter0.print(s);
            printWriter0.print("mSavedViewRegistryState=");
            printWriter0.println(this.i);
        }
        du du0 = this.fV(false);
        if(du0 != null) {
            printWriter0.print(s);
            printWriter0.print("mTarget=");
            printWriter0.print(du0);
            printWriter0.print(" mTargetRequestCode=");
            printWriter0.println(this.o);
        }
        printWriter0.print(s);
        printWriter0.print("mPopDirection=");
        printWriter0.println(this.kX());
        if(this.gj() != 0) {
            printWriter0.print(s);
            printWriter0.print("getEnterAnim=");
            printWriter0.println(this.gj());
        }
        if(this.gk() != 0) {
            printWriter0.print(s);
            printWriter0.print("getExitAnim=");
            printWriter0.println(this.gk());
        }
        if(this.iT() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopEnterAnim=");
            printWriter0.println(this.iT());
        }
        if(this.gZ() != 0) {
            printWriter0.print(s);
            printWriter0.print("getPopExitAnim=");
            printWriter0.println(this.gZ());
        }
        if(this.O != null) {
            printWriter0.print(s);
            printWriter0.print("mContainer=");
            printWriter0.println(this.O);
        }
        if(this.P != null) {
            printWriter0.print(s);
            printWriter0.print("mView=");
            printWriter0.println(this.P);
        }
        if(this.getContext() != null) {
            lup.a(this).f(s, fileDescriptor0, printWriter0, arr_s);
        }
        printWriter0.print(s);
        printWriter0.println("Child " + this.C + ":");
        this.C.M(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    private final int eR() {
        return this.Y == lpf.b || this.D == null ? this.Y.ordinal() : Math.min(this.Y.ordinal(), this.D.eR());
    }

    public ee eS() {
        return new dl(this);
    }

    @Override
    public final boolean equals(Object object0) {
        return super.equals(object0);
    }

    private final du fV(boolean z) {
        if(z) {
            llr llr0 = new llr(this);
            lln.d(llr0);
            llm llm0 = lln.b(this);
            if(llm0.b.contains(lll.h) && lln.e(llm0, this.getClass(), llr0.getClass())) {
                lln.c(llm0, llr0);
            }
        }
        du du0 = this.m;
        if(du0 != null) {
            return du0;
        }
        fm fm0 = this.A;
        if(fm0 != null) {
            return this.n == null ? null : fm0.e(this.n);
        }
        return null;
    }

    final jwb gC() {
        return this.S == null ? null : this.S.r;
    }

    final int gZ() {
        return this.S == null ? 0 : this.S.e;
    }

    public final ea getActivity() {
        return this.B == null ? null : ((ea)this.B.b);
    }

    public boolean getAllowEnterTransitionOverlap() {
        dq dq0 = this.S;
        if(dq0 != null) {
            return dq0.p == null ? true : dq0.p.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        dq dq0 = this.S;
        if(dq0 != null) {
            return dq0.o == null ? true : dq0.o.booleanValue();
        }
        return true;
    }

    public final Bundle getArguments() {
        return this.l;
    }

    public final fm getChildFragmentManager() {
        if(this.B != null) {
            return this.C;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        return this.B == null ? null : this.B.c;
    }

    @Override  // loz
    public ltx getDefaultViewModelCreationExtras() {
        Application application0;
        for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if((context0 instanceof Application)) {
                application0 = (Application)context0;
                break;
            }
        }
        if(application0 == null && fm.ar(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ltx ltx0 = new lua();
        if(application0 != null) {
            ((lua)ltx0).b(lsg.b, application0);
        }
        ((lua)ltx0).b(lrm.a, this);
        ((lua)ltx0).b(lrm.b, this);
        if(this.getArguments() != null) {
            Bundle bundle0 = this.getArguments();
            ((lua)ltx0).b(lrm.c, bundle0);
        }
        return ltx0;
    }

    @Override  // loz
    public lsk getDefaultViewModelProviderFactory() {
        Application application0;
        if(this.A == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.ac == null) {
            for(Context context0 = this.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if((context0 instanceof Application)) {
                    application0 = (Application)context0;
                    break;
                }
            }
            if(application0 == null && fm.ar(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + this.requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.ac = new lrq(application0, this, this.getArguments());
        }
        return this.ac;
    }

    public Object getEnterTransition() {
        return this.S == null ? null : this.S.i;
    }

    public Object getExitTransition() {
        return this.S == null ? null : this.S.k;
    }

    @Deprecated
    public final fm getFragmentManager() {
        return this.A;
    }

    public final Object getHost() {
        return this.B == null ? null : this.B.d();
    }

    public final int getId() {
        return this.E;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.W == null ? this.iU(null) : this.W;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle0) {
        eh eh0 = this.B;
        if(eh0 == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflater0 = eh0.c();
        layoutInflater0.setFactory2(this.C.d);
        return layoutInflater0;
    }

    @Override  // lps
    public lpg getLifecycle() {
        return this.Z;
    }

    @Deprecated
    public lup getLoaderManager() {
        return lup.a(this);
    }

    public final du getParentFragment() {
        return this.D;
    }

    public final fm getParentFragmentManager() {
        fm fm0 = this.A;
        if(fm0 != null) {
            return fm0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not associated with a fragment manager."));
    }

    public Object getReenterTransition() {
        dq dq0 = this.S;
        if(dq0 == null) {
            return null;
        }
        return dq0.l == du.e ? this.getExitTransition() : dq0.l;
    }

    public final Resources getResources() {
        return this.requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        llp llp0 = new llp(this);
        lln.d(llp0);
        llm llm0 = lln.b(this);
        if(llm0.b.contains(lll.f) && lln.e(llm0, this.getClass(), llp0.getClass())) {
            lln.c(llm0, llp0);
        }
        return this.J;
    }

    public Object getReturnTransition() {
        dq dq0 = this.S;
        if(dq0 == null) {
            return null;
        }
        return dq0.j == du.e ? this.getEnterTransition() : dq0.j;
    }

    @Override  // orl
    public final orh getSavedStateRegistry() {
        return this.ad.a;
    }

    public Object getSharedElementEnterTransition() {
        return this.S == null ? null : this.S.m;
    }

    public Object getSharedElementReturnTransition() {
        dq dq0 = this.S;
        if(dq0 == null) {
            return null;
        }
        return dq0.n == du.e ? this.getSharedElementEnterTransition() : dq0.n;
    }

    public final String getString(int v) {
        return this.getResources().getString(v);
    }

    public final String getString(int v, Object[] arr_object) {
        return this.getResources().getString(v, arr_object);
    }

    public final String getTag() {
        return this.G;
    }

    @Deprecated
    public final du getTargetFragment() {
        return this.fV(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        llq llq0 = new llq(this);
        lln.d(llq0);
        llm llm0 = lln.b(this);
        if(llm0.b.contains(lll.h) && lln.e(llm0, this.getClass(), llq0.getClass())) {
            lln.c(llm0, llq0);
        }
        return this.o;
    }

    public final CharSequence getText(int v) {
        return this.getResources().getText(v);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.R;
    }

    public View getView() {
        return this.P;
    }

    public lps getViewLifecycleOwner() {
        lps lps0 = this.aa;
        if(lps0 != null) {
            return lps0;
        }
        throw new IllegalStateException(a.i(this, "Can\'t access the Fragment View\'s LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public lqd getViewLifecycleOwnerLiveData() {
        return this.ab;
    }

    @Override  // lsq
    public lsp getViewModelStore() {
        if(this.A == null) {
            throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
        }
        if(this.eR() == lpf.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap0 = this.A.C.d;
        lsp lsp0 = (lsp)hashMap0.get(this.k);
        if(lsp0 == null) {
            lsp0 = new lsp();
            hashMap0.put(this.k, lsp0);
        }
        return lsp0;
    }

    final float gi() {
        return this.S == null ? 1.0f : this.S.s;
    }

    final int gj() {
        return this.S == null ? 0 : this.S.b;
    }

    final int gk() {
        return this.S == null ? 0 : this.S.c;
    }

    public void gl(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.C.noteStateNotSaved();
        this.y = true;
        this.aa = new gj(this, this.getViewModelStore(), new df(this));
        View view0 = this.onCreateView(layoutInflater0, viewGroup0, bundle0);
        this.P = view0;
        if(view0 != null) {
            this.aa.b();
            if(fm.ar(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.P + " for Fragment " + this);
            }
            lsr.b(this.P, this.aa);
            lss.b(this.P, this.aa);
            oro.b(this.P, this.aa);
            this.ab.l(this.aa);
            return;
        }
        if(this.aa.a != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.aa = null;
    }

    public final dq ha() {
        if(this.S == null) {
            this.S = new dq();
        }
        return this.S;
    }

    public final boolean hasOptionsMenu() {
        return this.L;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    final void iR() {
        Bundle bundle0 = this.g;
        if(bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("childFragmentManager");
            if(bundle1 != null) {
                this.C.ac(bundle1);
                this.C.z();
            }
        }
    }

    final int iT() {
        return this.S == null ? 0 : this.S.d;
    }

    final LayoutInflater iU(Bundle bundle0) {
        LayoutInflater layoutInflater0 = this.onGetLayoutInflater(bundle0);
        this.W = layoutInflater0;
        return layoutInflater0;
    }

    final jwb iV() {
        return this.S == null ? null : this.S.q;
    }

    final ArrayList iW() {
        dq dq0 = this.S;
        if(dq0 != null) {
            ArrayList arrayList0 = dq0.g;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    final ArrayList iX() {
        dq dq0 = this.S;
        if(dq0 != null) {
            ArrayList arrayList0 = dq0.h;
            return arrayList0 == null ? new ArrayList() : arrayList0;
        }
        return new ArrayList();
    }

    final void iY(boolean z) {
        dq dq0 = this.S;
        if(dq0 != null) {
            dq0.u = false;
        }
        if(this.P != null) {
            ViewGroup viewGroup0 = this.O;
            if(viewGroup0 != null) {
                fm fm0 = this.A;
                if(fm0 != null) {
                    gx gx0 = gx.c(viewGroup0, fm0);
                    gx0.i();
                    if(z) {
                        this.B.d.post(new dk(gx0));
                    }
                    else {
                        gx0.g();
                    }
                    Handler handler0 = this.T;
                    if(handler0 != null) {
                        handler0.removeCallbacks(this.U);
                        this.T = null;
                    }
                }
            }
        }
    }

    final void iZ() {
        this.kf();
        this.mPreviousWho = this.k;
        this.k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.z = 0;
        this.A = null;
        this.C = new fm();
        this.B = null;
        this.E = 0;
        this.F = 0;
        this.G = null;
        this.H = false;
        this.I = false;
    }

    private final void if(ds ds0) {
        if(this.f >= 0) {
            ds0.a();
            return;
        }
        this.af.add(ds0);
    }

    @Deprecated
    public static du instantiate(Context context0, String s) {
        return du.instantiate(context0, s, null);
    }

    @Deprecated
    public static du instantiate(Context context0, String s, Bundle bundle0) {
        Class class0;
        try {
            ClassLoader classLoader0 = context0.getClassLoader();
            try {
                class0 = eg.a(classLoader0, s);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new dr("Unable to instantiate fragment " + s + ": make sure class name exists", classNotFoundException0);
            }
            catch(ClassCastException classCastException0) {
                throw new dr("Unable to instantiate fragment " + s + ": make sure class is a valid subclass of Fragment", classCastException0);
            }
            du du0 = (du)class0.getConstructor(null).newInstance(null);
            if(bundle0 != null) {
                bundle0.setClassLoader(du0.getClass().getClassLoader());
                du0.setArguments(bundle0);
            }
            return du0;
        }
        catch(InstantiationException instantiationException0) {
            throw new dr(a.a(s, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new dr(a.a(s, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), illegalAccessException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new dr(a.a(s, "Unable to instantiate fragment ", ": could not find Fragment constructor"), noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new dr(a.a(s, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), invocationTargetException0);
        }
    }

    public final boolean isAdded() {
        return this.B != null && this.q;
    }

    public final boolean isDetached() {
        return this.I;
    }

    public final boolean isHidden() {
        return this.H ? true : this.A != null && (this.D != null && this.D.isHidden());
    }

    public final boolean isInLayout() {
        return this.v;
    }

    public final boolean isMenuVisible() {
        return this.M ? this.A == null || fm.aD(this.D) : false;
    }

    public final boolean isRemoving() {
        return this.r;
    }

    public final boolean isResumed() {
        return this.f >= 7;
    }

    public final boolean isStateSaved() {
        return this.A == null ? false : this.A.au();
    }

    public final boolean isVisible() {
        return this.isAdded() && !this.isHidden() && (this.P != null && this.P.getWindowToken() != null && this.P.getVisibility() == 0);
    }

    final void ja() {
        Bundle bundle0 = this.g == null ? null : this.g.getBundle("savedInstanceState");
        this.onViewCreated(this.P, bundle0);
        this.C.K(2);
    }

    final void jb(int v, int v1, int v2, int v3) {
        if(this.S == null && v == 0) {
            v = 0;
            if(v1 == 0) {
                if(v2 == 0) {
                    if(v3 != 0) {
                        v1 = 0;
                        v2 = 0;
                        goto label_10;
                    }
                    return;
                }
                else {
                    v1 = 0;
                }
            }
        }
    label_10:
        this.ha().b = v;
        this.ha().c = v1;
        this.ha().d = v2;
        this.ha().e = v3;
    }

    final void jc(View view0) {
        this.ha().t = view0;
    }

    final void jd(int v) {
        if(this.S == null && v == 0) {
            return;
        }
        this.ha();
        this.S.f = v;
    }

    final void kV(boolean z) {
        if(this.S == null) {
            return;
        }
        this.ha().a = z;
    }

    final void kW(ArrayList arrayList0, ArrayList arrayList1) {
        this.ha();
        this.S.g = arrayList0;
        this.S.h = arrayList1;
    }

    final boolean kX() {
        return this.S == null ? false : this.S.a;
    }

    final boolean kY() {
        return this.z > 0;
    }

    private final acp ke(adc adc0, akp akp0, acn acn0) {
        if(this.f > 1) {
            throw new IllegalStateException(a.i(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference0 = new AtomicReference();
        this.if(new dp(this, akp0, atomicReference0, adc0, acn0));
        return new dg(atomicReference0);
    }

    private final void kf() {
        this.Z = new lpw(this);
        this.ad = orj.a(this);
        this.ac = null;
        ds ds0 = this.Vo;
        if(!this.af.contains(ds0)) {
            this.if(ds0);
        }
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle0) {
        this.N = true;
    }

    @Deprecated
    public void onActivityResult(int v, int v1, Intent intent0) {
        if(fm.ar(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + v + " resultCode: " + v1 + " data: " + intent0);
        }
    }

    @Deprecated
    public void onAttach(Activity activity0) {
        this.N = true;
    }

    public void onAttach(Context context0) {
        this.N = true;
        Activity activity0 = this.B == null ? null : this.B.b;
        if(activity0 != null) {
            this.N = false;
            this.onAttach(activity0);
        }
    }

    @Deprecated
    public void onAttachFragment(du du0) {
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
        this.N = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem0) {
        return false;
    }

    public void onCreate(Bundle bundle0) {
        this.N = true;
        this.iR();
        fm fm0 = this.C;
        if(fm0.p > 0) {
            return;
        }
        fm0.z();
    }

    public Animation onCreateAnimation(int v, boolean z, int v1) {
        return null;
    }

    public Animator onCreateAnimator(int v, boolean z, int v1) {
        return null;
    }

    @Override  // android.view.View$OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu0, View view0, ContextMenu.ContextMenuInfo contextMenu$ContextMenuInfo0) {
        this.requireActivity().onCreateContextMenu(contextMenu0, view0, contextMenu$ContextMenuInfo0);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
    }

    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return this.Vc == 0 ? null : layoutInflater0.inflate(this.Vc, viewGroup0, false);
    }

    public void onDestroy() {
        this.N = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.N = true;
    }

    public void onDetach() {
        this.N = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle0) {
        return this.getLayoutInflater(bundle0);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity0, AttributeSet attributeSet0, Bundle bundle0) {
        this.N = true;
    }

    public void onInflate(Context context0, AttributeSet attributeSet0, Bundle bundle0) {
        this.N = true;
        Activity activity0 = this.B == null ? null : this.B.b;
        if(activity0 != null) {
            this.N = false;
            this.onInflate(activity0, attributeSet0, bundle0);
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.N = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem0) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu0) {
    }

    public void onPause() {
        this.N = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu0) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
    }

    public void onResume() {
        this.N = true;
    }

    public void onSaveInstanceState(Bundle bundle0) {
    }

    public void onStart() {
        this.N = true;
    }

    public void onStop() {
        this.N = true;
    }

    public void onViewCreated(View view0, Bundle bundle0) {
    }

    public void onViewStateRestored(Bundle bundle0) {
        this.N = true;
    }

    public void postponeEnterTransition() {
        this.ha().u = true;
    }

    public final void postponeEnterTransition(long v, TimeUnit timeUnit0) {
        this.ha().u = true;
        Handler handler0 = this.T;
        if(handler0 != null) {
            handler0.removeCallbacks(this.U);
        }
        fm fm0 = this.A;
        this.T = fm0 == null ? new Handler(Looper.getMainLooper()) : fm0.q.d;
        this.T.removeCallbacks(this.U);
        this.T.postDelayed(this.U, timeUnit0.toMillis(v));
    }

    @Override  // aco
    public final acp registerForActivityResult(adc adc0, acn acn0) {
        return this.ke(adc0, new dn(this), acn0);
    }

    public final acp registerForActivityResult(adc adc0, acw acw0, acn acn0) {
        return this.ke(adc0, new do(acw0), acn0);
    }

    public void registerForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] arr_s, int v) {
        if(this.B == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        fm fm0 = this.getParentFragmentManager();
        if(fm0.w != null) {
            FragmentManager.LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new FragmentManager.LaunchedFragmentInfo(this.k, v);
            fm0.x.addLast(fragmentManager$LaunchedFragmentInfo0);
            fm0.w.b(arr_s);
            return;
        }
        ibuq.f(arr_s, "permissions");
    }

    public final ea requireActivity() {
        ea ea0 = this.getActivity();
        if(ea0 != null) {
            return ea0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            return bundle0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context0 = this.getContext();
        if(context0 != null) {
            return context0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final fm requireFragmentManager() {
        return this.getParentFragmentManager();
    }

    public final Object requireHost() {
        Object object0 = this.getHost();
        if(object0 != null) {
            return object0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " not attached to a host."));
    }

    public final du requireParentFragment() {
        du du0 = this.getParentFragment();
        if(du0 == null) {
            throw this.getContext() == null ? new IllegalStateException(a.i(this, "Fragment ", " is not attached to any Fragment or host")) : new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + this.getContext());
        }
        return du0;
    }

    public final View requireView() {
        View view0 = this.getView();
        if(view0 != null) {
            return view0;
        }
        throw new IllegalStateException(a.i(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        this.ha().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        this.ha().o = Boolean.valueOf(z);
    }

    public void setArguments(Bundle bundle0) {
        if(this.A != null && this.isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.l = bundle0;
    }

    public void setEnterSharedElementCallback(jwb jwb0) {
        this.ha().q = jwb0;
    }

    public void setEnterTransition(Object object0) {
        this.ha().i = object0;
    }

    public void setExitSharedElementCallback(jwb jwb0) {
        this.ha().r = jwb0;
    }

    public void setExitTransition(Object object0) {
        this.ha().k = object0;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if(this.L != z) {
            this.L = z;
            if(this.isAdded() && !this.isHidden()) {
                this.B.e();
            }
        }
    }

    public void setInitialSavedState(Fragment.SavedState fragment$SavedState0) {
        Bundle bundle0 = null;
        if(this.A != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if(fragment$SavedState0 != null) {
            Bundle bundle1 = fragment$SavedState0.a;
            if(bundle1 != null) {
                bundle0 = bundle1;
            }
        }
        this.g = bundle0;
    }

    public void setMenuVisibility(boolean z) {
        if(this.M != z) {
            this.M = z;
            if(this.L && this.isAdded() && !this.isHidden()) {
                this.B.e();
            }
        }
    }

    public void setReenterTransition(Object object0) {
        this.ha().l = object0;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        llt llt0 = new llt(this);
        lln.d(llt0);
        llm llm0 = lln.b(this);
        if(llm0.b.contains(lll.f) && lln.e(llm0, this.getClass(), llt0.getClass())) {
            lln.c(llm0, llt0);
        }
        this.J = z;
        fm fm0 = this.A;
        if(fm0 != null) {
            if(z) {
                fm0.C.a(this);
                return;
            }
            fm0.C.e(this);
            return;
        }
        this.K = true;
    }

    public void setReturnTransition(Object object0) {
        this.ha().j = object0;
    }

    public void setSharedElementEnterTransition(Object object0) {
        this.ha().m = object0;
    }

    public void setSharedElementReturnTransition(Object object0) {
        this.ha().n = object0;
    }

    @Deprecated
    public void setTargetFragment(du du0, int v) {
        if(du0 != null) {
            llu llu0 = new llu(this, du0, v);
            lln.d(llu0);
            llm llm0 = lln.b(this);
            if(llm0.b.contains(lll.h) && lln.e(llm0, this.getClass(), llu0.getClass())) {
                lln.c(llm0, llu0);
            }
        }
        fm fm0 = du0 == null ? null : du0.A;
        if(this.A != null && fm0 != null && this.A != fm0) {
            throw new IllegalArgumentException(a.i(du0, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        du du1 = du0;
        while(du1 != null) {
            if(du1.equals(this)) {
                throw new IllegalArgumentException(a.j(this, du0, "Setting ", " as the target of ", " would create a target cycle"));
            }
            du1 = du1.fV(false);
            continue;
        }
        if(du0 == null) {
            this.n = null;
            this.m = null;
        }
        else if(this.A != null && du0.A != null) {
            this.n = du0.k;
            this.m = null;
        }
        else {
            this.n = null;
            this.m = du0;
        }
        this.o = v;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        llv llv0 = new llv(this, z);
        lln.d(llv0);
        llm llm0 = lln.b(this);
        if(llm0.b.contains(lll.g) && lln.e(llm0, this.getClass(), llv0.getClass())) {
            lln.c(llm0, llv0);
        }
        if(!this.R && z && this.f < 5) {
            fm fm0 = this.A;
            if(fm0 != null && this.isAdded() && this.X) {
                fm0.T(fm0.n(this));
            }
        }
        this.R = z;
        this.Q = this.f < 5 && !z;
        if(this.g != null) {
            this.j = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String s) {
        return this.B == null ? false : this.B.f(s);
    }

    public void startActivity(Intent intent0) {
        this.startActivity(intent0, null);
    }

    public void startActivity(Intent intent0, Bundle bundle0) {
        eh eh0 = this.B;
        if(eh0 == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        eh0.i(intent0, -1, bundle0);
    }

    @Deprecated
    public void startActivityForResult(Intent intent0, int v) {
        this.startActivityForResult(intent0, v, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        if(this.B == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        fm fm0 = this.getParentFragmentManager();
        if(fm0.u != null) {
            FragmentManager.LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new FragmentManager.LaunchedFragmentInfo(this.k, v);
            fm0.x.addLast(fragmentManager$LaunchedFragmentInfo0);
            if(bundle0 != null) {
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            fm0.u.b(intent0);
            return;
        }
        fm0.q.i(intent0, v, bundle0);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        if(this.B == null) {
            throw new IllegalStateException(a.i(this, "Fragment ", " not attached to Activity"));
        }
        if(fm.ar(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + v + " IntentSender: " + intentSender0 + " fillInIntent: " + intent0 + " options: " + bundle0);
        }
        fm fm0 = this.getParentFragmentManager();
        if(fm0.v != null) {
            if(bundle0 != null) {
                if(intent0 == null) {
                    intent0 = new Intent();
                    intent0.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if(fm.ar(2)) {
                    Objects.toString(bundle0);
                    Objects.toString(intent0);
                }
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            acy acy0 = new acy(intentSender0);
            acy0.a = intent0;
            acy0.b(v2, v1);
            IntentSenderRequest intentSenderRequest0 = acy0.a();
            FragmentManager.LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new FragmentManager.LaunchedFragmentInfo(this.k, v);
            fm0.x.addLast(fragmentManager$LaunchedFragmentInfo0);
            boolean z = !fm.ar(2);
            fm0.v.b(intentSenderRequest0);
            return;
        }
        eh eh0 = fm0.q;
        ibuq.f(intentSender0, "intent");
        if(v != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity0 = eh0.b;
        if(activity0 == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        activity0.startIntentSenderForResult(intentSender0, -1, intent0, v1, v2, v3, bundle0);
    }

    public void startPostponedEnterTransition() {
        if(this.S != null && this.ha().u) {
            if(this.B == null) {
                this.ha().u = false;
                return;
            }
            if(Looper.myLooper() != this.B.d.getLooper()) {
                this.B.d.postAtFrontOfQueue(new dj(this));
                return;
            }
            this.iY(true);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("} (");
        stringBuilder0.append(this.k);
        if(this.E != 0) {
            stringBuilder0.append(" id=0x");
            stringBuilder0.append(Integer.toHexString(this.E));
        }
        if(this.G != null) {
            stringBuilder0.append(" tag=");
            stringBuilder0.append(this.G);
        }
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public void unregisterForContextMenu(View view0) {
        view0.setOnCreateContextMenuListener(null);
    }
}

