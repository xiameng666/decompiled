import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import j..util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class fm {
    public boolean A;
    public boolean B;
    public fp C;
    private boolean D;
    private ArrayList E;
    private final kar F;
    private final kar G;
    private final kar H;
    private final kar I;
    private final kdz J;
    private final eg K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private final Runnable P;
    private final ew Q;
    public final ArrayList a;
    public final fx b;
    ArrayList c;
    public final ej d;
    public abc e;
    ca f;
    boolean g;
    public final aaw h;
    public final AtomicInteger i;
    public final Map j;
    public final Map k;
    public final Map l;
    final ArrayList m;
    public final el n;
    public final CopyOnWriteArrayList o;
    int p;
    public eh q;
    public ee r;
    public du s;
    public du t;
    public acp u;
    public acp v;
    public acp w;
    ArrayDeque x;
    public boolean y;
    public boolean z;

    public fm() {
        this.a = new ArrayList();
        this.b = new fx();
        this.c = new ArrayList();
        this.d = new ej(this);
        this.f = null;
        this.g = false;
        this.h = new et(this);
        this.i = new AtomicInteger();
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedMap(new HashMap());
        this.m = new ArrayList();
        this.n = new el(this);
        this.o = new CopyOnWriteArrayList();
        this.F = new eo(this);
        this.G = new ep(this);
        this.H = new eq(this);
        this.I = new er(this);
        this.J = new eu(this);
        this.p = -1;
        this.K = new ev(this);
        this.Q = new ew();
        this.x = new ArrayDeque();
        this.P = new ex(this);
    }

    final void A() {
        Iterator iterator0;
        boolean z;
        this.B = true;
        this.ap(true);
        this.N();
        eh eh0 = this.q;
        if((eh0 instanceof lsq)) {
            z = this.b.d.f;
            goto label_10;
        }
        else {
            Context context0 = eh0.c;
            if((context0 instanceof Activity)) {
                z = 1 ^ ((Activity)context0).isChangingConfigurations();
            label_10:
                if(z) {
                    iterator0 = this.j.values().iterator();
                    goto label_14;
                }
            }
            else {
                iterator0 = this.j.values().iterator();
            label_14:
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    for(Object object1: ((BackStackState)object0).a) {
                        this.b.d.c(((String)object1), false);
                    }
                }
            }
        }
        this.K(-1);
        eh eh1 = this.q;
        if((eh1 instanceof jwk)) {
            ((jwk)eh1).removeOnTrimMemoryListener(this.G);
        }
        eh eh2 = this.q;
        if((eh2 instanceof jwj)) {
            ((jwj)eh2).removeOnConfigurationChangedListener(this.F);
        }
        eh eh3 = this.q;
        if((eh3 instanceof jvs)) {
            ((jvs)eh3).removeOnMultiWindowModeChangedListener(this.H);
        }
        eh eh4 = this.q;
        if((eh4 instanceof jvt)) {
            ((jvt)eh4).removeOnPictureInPictureModeChangedListener(this.I);
        }
        eh eh5 = this.q;
        if((eh5 instanceof kdt) && this.s == null) {
            ((kdt)eh5).removeMenuProvider(this.J);
        }
        this.q = null;
        this.r = null;
        this.s = null;
        if(this.e != null) {
            this.h.f();
            this.e = null;
        }
        acp acp0 = this.u;
        if(acp0 != null) {
            acp0.a();
            this.v.a();
            this.w.a();
        }
    }

    public final void B(boolean z) {
        if(z && (this.q instanceof jwk)) {
            this.ai(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null) {
                du0.onLowMemory();
                if(z) {
                    du0.C.B(true);
                }
            }
        }
    }

    final void C(boolean z, boolean z1) {
        if(z1 && (this.q instanceof jvs)) {
            this.ai(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && z1) {
                du0.C.C(z, true);
            }
        }
    }

    final void D() {
        for(Object object0: this.b.f()) {
            du du0 = (du)object0;
            if(du0 != null) {
                du0.onHiddenChanged(du0.isHidden());
                du0.C.D();
            }
        }
    }

    public final void E(Menu menu0) {
        if(this.p > 0) {
            for(Object object0: this.b.g()) {
                du du0 = (du)object0;
                if(du0 != null && !du0.H) {
                    if(du0.L && du0.M) {
                        du0.onOptionsMenuClosed(menu0);
                    }
                    du0.C.E(menu0);
                }
            }
        }
    }

    public final void F(du du0) {
        if(du0 != null && du0.equals(this.e(du0.k))) {
            boolean z = du0.A.at(du0);
            if(du0.p == null || du0.p.booleanValue() != z) {
                du0.p = Boolean.valueOf(z);
                fm fm0 = du0.C;
                fm0.ak();
                fm0.F(fm0.t);
            }
        }
    }

    final void G() {
        this.K(5);
    }

    final void H(boolean z, boolean z1) {
        if(z1 && (this.q instanceof jvt)) {
            this.ai(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && z1) {
                du0.C.H(z, true);
            }
        }
    }

    final void I() {
        this.z = false;
        this.A = false;
        this.C.g = false;
        this.K(7);
    }

    final void J() {
        this.z = false;
        this.A = false;
        this.C.g = false;
        this.K(5);
    }

    public final void K(int v) {
        try {
            this.D = true;
            for(Object object0: this.b.b.values()) {
                fv fv0 = (fv)object0;
                if(fv0 != null) {
                    fv0.b = v;
                }
            }
            this.R(v, false);
            for(Object object1: this.aG()) {
                ((gx)object1).h();
            }
        }
        finally {
            this.D = false;
        }
        this.ap(true);
    }

    final void L() {
        this.A = true;
        this.C.g = true;
        this.K(4);
    }

    public final void M(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        fx fx0 = this.b;
        HashMap hashMap0 = fx0.b;
        if(!hashMap0.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Active Fragments:");
            for(Object object0: hashMap0.values()) {
                fv fv0 = (fv)object0;
                printWriter0.print(s);
                if(fv0 == null) {
                    printWriter0.println("null");
                }
                else {
                    printWriter0.println(fv0.a);
                    fv0.a.dump(s + "    ", fileDescriptor0, printWriter0, arr_s);
                }
            }
        }
        ArrayList arrayList0 = fx0.a;
        int v = arrayList0.size();
        if(v > 0) {
            printWriter0.print(s);
            printWriter0.println("Added Fragments:");
            for(int v2 = 0; v2 < v; ++v2) {
                du du0 = (du)arrayList0.get(v2);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v2);
                printWriter0.print(": ");
                printWriter0.println(du0.toString());
            }
        }
        ArrayList arrayList1 = this.E;
        if(arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 > 0) {
                printWriter0.print(s);
                printWriter0.println("Fragments Created Menus:");
                for(int v4 = 0; v4 < v3; ++v4) {
                    du du1 = (du)this.E.get(v4);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v4);
                    printWriter0.print(": ");
                    printWriter0.println(du1.toString());
                }
            }
        }
        int v5 = this.c.size();
        if(v5 > 0) {
            printWriter0.print(s);
            printWriter0.println("Back Stack:");
            for(int v6 = 0; v6 < v5; ++v6) {
                ca ca0 = (ca)this.c.get(v6);
                printWriter0.print(s);
                printWriter0.print("  #");
                printWriter0.print(v6);
                printWriter0.print(": ");
                printWriter0.println(ca0.toString());
                ca0.i(s + "    ", printWriter0);
            }
        }
        printWriter0.print(s);
        printWriter0.println("Back Stack Index: " + this.i.get());
        ArrayList arrayList2 = this.a;
        synchronized(arrayList2) {
            int v8 = arrayList2.size();
            if(v8 > 0) {
                printWriter0.print(s);
                printWriter0.println("Pending Actions:");
                for(int v1 = 0; v1 < v8; ++v1) {
                    fh fh0 = (fh)arrayList2.get(v1);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v1);
                    printWriter0.print(": ");
                    printWriter0.println(fh0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("FragmentManager misc state:");
        printWriter0.print(s);
        printWriter0.print("  mHost=");
        printWriter0.println(this.q);
        printWriter0.print(s);
        printWriter0.print("  mContainer=");
        printWriter0.println(this.r);
        if(this.s != null) {
            printWriter0.print(s);
            printWriter0.print("  mParent=");
            printWriter0.println(this.s);
        }
        printWriter0.print(s);
        printWriter0.print("  mCurState=");
        printWriter0.print(this.p);
        printWriter0.print(" mStateSaved=");
        printWriter0.print(this.z);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.A);
        printWriter0.print(" mDestroyed=");
        printWriter0.println(this.B);
        if(this.y) {
            printWriter0.print(s);
            printWriter0.print("  mNeedMenuInvalidate=");
            printWriter0.println(this.y);
        }
    }

    public final void N() {
        for(Object object0: this.aG()) {
            ((gx)object0).h();
        }
    }

    public final void O(fh fh0, boolean z) {
        if(!z) {
            if(this.q == null) {
                throw this.B ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.aH();
        }
        ArrayList arrayList0 = this.a;
        synchronized(arrayList0) {
            if(this.q == null) {
                if(!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                FIN.finallyExec$NT(v);
                return;
            }
            arrayList0.add(fh0);
            synchronized(arrayList0) {
                if(arrayList0.size() == 1) {
                    this.q.d.removeCallbacks(this.P);
                    this.q.d.post(this.P);
                    this.ak();
                }
            }
        }
    }

    final void P(fh fh0, boolean z) {
        if(z && (this.q == null || this.B)) {
            return;
        }
        this.aK(z);
        ca ca0 = this.f;
        if(ca0 != null) {
            ca0.b = false;
            ca0.e();
            if(fm.ar(3)) {
                Objects.toString(this.f);
                Objects.toString(fh0);
            }
            this.f.c(false, false);
            this.f.k(this.M, this.N);
            ArrayList arrayList0 = this.f.e;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                du du0 = ((fy)arrayList0.get(v1)).b;
                if(du0 != null) {
                    du0.s = false;
                }
            }
            this.f = null;
        }
        fh0.k(this.M, this.N);
        this.D = true;
        try {
            this.aN(this.M, this.N);
        }
        finally {
            this.aI();
        }
        this.ak();
        this.aJ();
        this.b.i();
    }

    final void Q(du du0) {
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        if(!du0.H) {
            du0.H = true;
            du0.V ^= 1;
            this.aO(du0);
        }
    }

    final void R(int v, boolean z) {
        if(this.q == null && v != -1) {
            throw new IllegalStateException("No activity");
        }
        if(z || v != this.p) {
            this.p = v;
            fx fx0 = this.b;
            ArrayList arrayList0 = fx0.a;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                du du0 = (du)arrayList0.get(v2);
                fv fv0 = (fv)fx0.b.get(du0.k);
                if(fv0 != null) {
                    fv0.e();
                }
            }
            for(Object object0: fx0.b.values()) {
                fv fv1 = (fv)object0;
                if(fv1 != null) {
                    fv1.e();
                    du du1 = fv1.a;
                    if(du1.r && !du1.kY()) {
                        if(du1.t && !fx0.c.containsKey(du1.k)) {
                            fx0.a(du1.k, fv1.a());
                        }
                        fx0.k(fv1);
                    }
                }
            }
            this.aP();
            if(this.y) {
                eh eh0 = this.q;
                if(eh0 != null && this.p == 7) {
                    eh0.e();
                    this.y = false;
                }
            }
        }
    }

    public final void S(FragmentContainerView fragmentContainerView0) {
        for(Object object0: this.b.e()) {
            fv fv0 = (fv)object0;
            du du0 = fv0.a;
            if(du0.F == fragmentContainerView0.getId() && (du0.P != null && du0.P.getParent() == null)) {
                du0.O = fragmentContainerView0;
                fv0.b();
                fv0.e();
            }
        }
    }

    final void T(fv fv0) {
        du du0 = fv0.a;
        if(du0.Q) {
            if(this.D) {
                this.L = true;
                return;
            }
            du0.Q = false;
            fv0.e();
        }
    }

    public final void U() {
        this.O(new fi(this, null, -1, 0), false);
    }

    public final void V(int v, int v1) {
        this.X(v, v1, false);
    }

    public final void W(String s, int v) {
        this.O(new fi(this, s, -1, v), false);
    }

    final void X(int v, int v1, boolean z) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        this.O(new fi(this, null, v, v1), z);
    }

    public final void Y(Bundle bundle0, String s, du du0) {
        if(du0.A != this) {
            this.ai(new IllegalStateException(a.i(du0, "Fragment ", " is not currently in the FragmentManager")));
        }
        bundle0.putString(s, du0.k);
    }

    public final void Z(fd fd0, boolean z) {
        ibuq.f(fd0, "cb");
        ek ek0 = new ek(fd0, z);
        this.n.a.add(ek0);
    }

    public final int a(String s, int v, boolean z) {
        if(this.c.isEmpty()) {
            return -1;
        }
        if(s == null && v < 0) {
            return z ? 0 : this.c.size() - 1;
        }
        int v1;
        for(v1 = this.c.size() - 1; v1 >= 0; --v1) {
            ca ca0 = (ca)this.c.get(v1);
            if(s != null && s.equals(ca0.m) || v >= 0 && v == ca0.c) {
                break;
            }
        }
        if(v1 < 0) {
            return v1;
        }
        if(!z) {
            return v1 == this.c.size() - 1 ? -1 : v1 + 1;
        }
        while(v1 > 0) {
            ca ca1 = (ca)this.c.get(v1 - 1);
            if((s == null || !s.equals(ca1.m)) && (v < 0 || v != ca1.c)) {
                break;
            }
            --v1;
        }
        return v1;
    }

    final ew aA() {
        return this.s == null ? this.Q : this.s.A.aA();
    }

    static final Set aB(ca ca0) {
        Set set0 = new HashSet();
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = ca0.e;
            if(v >= arrayList0.size()) {
                break;
            }
            du du0 = ((fy)arrayList0.get(v)).b;
            if(du0 != null && ca0.k) {
                set0.add(du0);
            }
        }
        return set0;
    }

    public static final boolean aC(du du0) {
        if(!du0.L || !du0.M) {
            boolean z = false;
            for(Object object0: du0.C.b.f()) {
                du du1 = (du)object0;
                if(du1 != null) {
                    z = fm.aC(du1);
                }
                if(!z) {
                    continue;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    static final boolean aD(du du0) {
        return du0 == null ? true : du0.isMenuVisible();
    }

    static final void aE(du du0) {
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        if(du0.H) {
            du0.H = false;
            du0.V ^= 1;
        }
    }

    private final ViewGroup aF(du du0) {
        ViewGroup viewGroup0 = du0.O;
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        if(du0.F > 0 && this.r.b()) {
            View view0 = this.r.a(du0.F);
            return (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
        }
        return null;
    }

    private final Set aG() {
        Set set0 = new HashSet();
        for(Object object0: this.b.e()) {
            ViewGroup viewGroup0 = ((fv)object0).a.O;
            if(viewGroup0 != null) {
                set0.add(gq.a(viewGroup0, this.aA()));
            }
        }
        return set0;
    }

    private final void aH() {
        if(!this.au()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private final void aI() {
        this.D = false;
        this.N.clear();
        this.M.clear();
    }

    private final void aJ() {
        if(this.L) {
            this.L = false;
            this.aP();
        }
    }

    private final void aK(boolean z) {
        if(this.D) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if(this.q == null) {
            throw this.B ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if(Looper.myLooper() != this.q.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if(!z) {
            this.aH();
        }
        if(this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    private final void aL(ArrayList arrayList0, ArrayList arrayList1, int v, int v1) {
        int v13;
        int v12;
        boolean z2;
        int v8;
        int v11;
        int v7;
        int v2 = v;
        boolean z = ((ca)arrayList0.get(v2)).t;
        ArrayList arrayList2 = this.O;
        if(arrayList2 == null) {
            this.O = new ArrayList();
        }
        else {
            arrayList2.clear();
        }
        fx fx0 = this.b;
        this.O.addAll(fx0.g());
        du du0 = this.t;
        int v3 = v2;
        int v4 = 0;
        while(v3 < v1) {
            ca ca0 = (ca)arrayList0.get(v3);
            if(((Boolean)arrayList1.get(v3)).booleanValue()) {
                z2 = z;
                v12 = v3;
                v13 = v4;
                ArrayList arrayList5 = this.O;
                ArrayList arrayList6 = ca0.e;
                for(int v14 = arrayList6.size() - 1; v14 >= 0; --v14) {
                    fy fy2 = (fy)arrayList6.get(v14);
                    switch(fy2.a) {
                        case 3: 
                        case 6: {
                            arrayList5.add(fy2.b);
                            break;
                        }
                        case 1: 
                        case 7: {
                            arrayList5.remove(fy2.b);
                            break;
                        }
                        case 8: {
                            du0 = null;
                            break;
                        }
                        case 9: {
                            du0 = fy2.b;
                            break;
                        }
                        case 10: {
                            fy2.i = fy2.h;
                        }
                    }
                }
            }
            else {
                ArrayList arrayList3 = this.O;
                int v5 = 0;
                while(true) {
                    ArrayList arrayList4 = ca0.e;
                    if(v5 >= arrayList4.size()) {
                        break;
                    }
                    fy fy0 = (fy)arrayList4.get(v5);
                    int v6 = fy0.a;
                    if(v6 == 1) {
                        v7 = v3;
                    }
                    else {
                        v7 = v3;
                        switch(v6) {
                            case 2: {
                                du du1 = fy0.b;
                                int v9 = du1.F;
                                int v10 = arrayList3.size() - 1;
                                boolean z1 = false;
                                while(v10 >= 0) {
                                    du du2 = (du)arrayList3.get(v10);
                                    if(du2.F != v9) {
                                        v11 = v9;
                                    }
                                    else if(du2 == du1) {
                                        v11 = v9;
                                        z1 = true;
                                    }
                                    else {
                                        if(du2 == du0) {
                                            v11 = v9;
                                            arrayList4.add(v5, new fy(9, du2, null));
                                            ++v5;
                                            du0 = null;
                                        }
                                        else {
                                            v11 = v9;
                                        }
                                        fy fy1 = new fy(3, du2, null);
                                        fy1.d = fy0.d;
                                        fy1.f = fy0.f;
                                        fy1.e = fy0.e;
                                        fy1.g = fy0.g;
                                        arrayList4.add(v5, fy1);
                                        arrayList3.remove(du2);
                                        ++v5;
                                        du0 = du0;
                                    }
                                    --v10;
                                    v9 = v11;
                                    v4 = v4;
                                }
                                v8 = v4;
                                if(z1) {
                                    arrayList4.remove(v5);
                                    --v5;
                                }
                                else {
                                    fy0.a = 1;
                                    fy0.c = true;
                                    arrayList3.add(du1);
                                }
                                goto label_87;
                            }
                            case 3: 
                            case 6: {
                                arrayList3.remove(fy0.b);
                                du du3 = fy0.b;
                                if(du3 == du0) {
                                    arrayList4.add(v5, new fy(9, du3));
                                    ++v5;
                                    v8 = v4;
                                    du0 = null;
                                }
                                else {
                                    v8 = v4;
                                }
                                goto label_87;
                            }
                            case 7: {
                                break;
                            }
                            case 8: {
                                arrayList4.add(v5, new fy(9, du0, null));
                                fy0.c = true;
                                du0 = fy0.b;
                                v8 = v4;
                                ++v5;
                                goto label_87;
                            }
                            default: {
                                v8 = v4;
                                goto label_87;
                            }
                        }
                    }
                    v8 = v4;
                    arrayList3.add(fy0.b);
                label_87:
                    ++v5;
                    z = z;
                    v3 = v7;
                    v4 = v8;
                }
                z2 = z;
                v12 = v3;
                v13 = v4;
            }
            v4 = v13 != 0 || ca0.k ? 1 : 0;
            v3 = v12 + 1;
            z = z2;
        }
        this.O.clear();
        if(!z && this.p > 0) {
            for(int v15 = v2; v15 < v1; ++v15) {
                ArrayList arrayList7 = ((ca)arrayList0.get(v15)).e;
                int v16 = arrayList7.size();
                for(int v17 = 0; v17 < v16; ++v17) {
                    du du4 = ((fy)arrayList7.get(v17)).b;
                    if(du4 != null && du4.A != null) {
                        fx0.j(this.n(du4));
                    }
                }
            }
        }
        for(int v18 = v2; v18 < v1; ++v18) {
            ca ca1 = (ca)arrayList0.get(v18);
            if(((Boolean)arrayList1.get(v18)).booleanValue()) {
                ca1.d(-1);
                ArrayList arrayList8 = ca1.e;
                for(int v19 = arrayList8.size() - 1; v19 >= 0; --v19) {
                    fy fy3 = (fy)arrayList8.get(v19);
                    du du5 = fy3.b;
                    if(du5 != null) {
                        du5.t = ca1.d;
                        du5.kV(true);
                        int v20 = ca1.j;
                        int v21 = 0x2002;
                        int v22 = 0x1001;
                        switch(v20) {
                            case 0x1001: {
                                break;
                            }
                            case 0x2002: {
                                v21 = v22;
                                break;
                            }
                            default: {
                                v21 = 4100;
                                v22 = 0x2005;
                                if(v20 != 0x2005) {
                                    switch(v20) {
                                        case 0x1003: {
                                            v21 = 0x1003;
                                            break;
                                        }
                                        case 4100: {
                                            v21 = v22;
                                            break;
                                        }
                                        default: {
                                            v21 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        du5.jd(v21);
                        du5.kW(ca1.s, ca1.r);
                    }
                    switch(fy3.a) {
                        case 1: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            ca1.a.ad(du5, true);
                            ca1.a.aa(du5);
                            break;
                        }
                        case 3: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            ca1.a.m(du5);
                            break;
                        }
                        case 4: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            fm.aE(du5);
                            break;
                        }
                        case 5: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            ca1.a.ad(du5, true);
                            ca1.a.Q(du5);
                            break;
                        }
                        case 6: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            ca1.a.t(du5);
                            break;
                        }
                        case 7: {
                            du5.jb(fy3.d, fy3.e, fy3.f, fy3.g);
                            ca1.a.ad(du5, true);
                            ca1.a.w(du5);
                            break;
                        }
                        case 8: {
                            ca1.a.ah(null);
                            break;
                        }
                        case 9: {
                            ca1.a.ah(du5);
                            break;
                        }
                        case 10: {
                            fy3.i = du5.Y;
                            ca1.a.ag(du5, fy3.h);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown cmd: " + fy3.a);
                        }
                    }
                }
            }
            else {
                ca1.d(1);
                ArrayList arrayList9 = ca1.e;
                int v23 = arrayList9.size();
                for(int v24 = 0; v24 < v23; ++v24) {
                    fy fy4 = (fy)arrayList9.get(v24);
                    du du6 = fy4.b;
                    if(du6 != null) {
                        du6.t = ca1.d;
                        du6.kV(false);
                        du6.jd(ca1.j);
                        du6.kW(ca1.r, ca1.s);
                    }
                    switch(fy4.a) {
                        case 1: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.ad(du6, false);
                            ca1.a.m(du6);
                            break;
                        }
                        case 3: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.aa(du6);
                            break;
                        }
                        case 4: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.Q(du6);
                            break;
                        }
                        case 5: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.ad(du6, false);
                            fm.aE(du6);
                            break;
                        }
                        case 6: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.w(du6);
                            break;
                        }
                        case 7: {
                            du6.jb(fy4.d, fy4.e, fy4.f, fy4.g);
                            ca1.a.ad(du6, false);
                            ca1.a.t(du6);
                            break;
                        }
                        case 8: {
                            ca1.a.ah(du6);
                            break;
                        }
                        case 9: {
                            ca1.a.ah(null);
                            break;
                        }
                        case 10: {
                            fy4.h = du6.Y;
                            ca1.a.ag(du6, fy4.i);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown cmd: " + fy4.a);
                        }
                    }
                }
            }
        }
        boolean z3 = ((Boolean)arrayList1.get(v1 - 1)).booleanValue();
        if(v4 != 0 && !this.m.isEmpty()) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            int v25 = arrayList0.size();
            for(int v26 = 0; v26 < v25; ++v26) {
                linkedHashSet0.addAll(fm.aB(((ca)arrayList0.get(v26))));
            }
            if(this.f == null) {
                ArrayList arrayList10 = this.m;
                int v27 = arrayList10.size();
                for(int v28 = 0; v28 < v27; ++v28) {
                    fg fg0 = (fg)arrayList10.get(v28);
                    for(Object object0: linkedHashSet0) {
                        fg0.c(((du)object0), z3);
                    }
                }
                ArrayList arrayList11 = this.m;
                int v29 = arrayList11.size();
                for(int v30 = 0; v30 < v29; ++v30) {
                    fg fg1 = (fg)arrayList11.get(v30);
                    for(Object object1: linkedHashSet0) {
                        fg1.b(((du)object1), z3);
                    }
                }
            }
        }
        for(int v31 = v2; v31 < v1; ++v31) {
            ca ca2 = (ca)arrayList0.get(v31);
            if(z3) {
                ArrayList arrayList12 = ca2.e;
                for(int v32 = arrayList12.size() - 1; v32 >= 0; --v32) {
                    du du7 = ((fy)arrayList12.get(v32)).b;
                    if(du7 != null) {
                        this.n(du7).e();
                    }
                }
            }
            else {
                ArrayList arrayList13 = ca2.e;
                int v33 = arrayList13.size();
                for(int v34 = 0; v34 < v33; ++v34) {
                    du du8 = ((fy)arrayList13.get(v34)).b;
                    if(du8 != null) {
                        this.n(du8).e();
                    }
                }
            }
        }
        this.R(this.p, true);
        for(Object object2: this.p(arrayList0, v2, v1)) {
            ((gx)object2).d = z3;
            ((gx)object2).i();
            ((gx)object2).g();
        }
        while(v2 < v1) {
            ca ca3 = (ca)arrayList0.get(v2);
            if(((Boolean)arrayList1.get(v2)).booleanValue() && ca3.c >= 0) {
                ca3.c = -1;
            }
            if(ca3.u != null) {
                for(int v35 = 0; v35 < ca3.u.size(); ++v35) {
                    ((Runnable)ca3.u.get(v35)).run();
                }
                ca3.u = null;
            }
            ++v2;
        }
        if(v4 != 0) {
            for(int v36 = 0; v36 < this.m.size(); ++v36) {
                ((fg)this.m.get(v36)).d();
            }
        }
    }

    private final void aM() {
        for(Object object0: this.aG()) {
            gx gx0 = (gx)object0;
            if(gx0.e) {
                fm.ar(2);
                gx0.e = false;
                gx0.g();
            }
        }
    }

    private final void aN(ArrayList arrayList0, ArrayList arrayList1) {
        if(!arrayList0.isEmpty()) {
            if(arrayList0.size() != arrayList1.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            int v = arrayList0.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                if(!((ca)arrayList0.get(v1)).t) {
                    if(v2 != v1) {
                        this.aL(arrayList0, arrayList1, v2, v1);
                    }
                    v2 = v1 + 1;
                    if(((Boolean)arrayList1.get(v1)).booleanValue()) {
                        while(v2 < v && ((Boolean)arrayList1.get(v2)).booleanValue() && !((ca)arrayList0.get(v2)).t) {
                            ++v2;
                        }
                    }
                    this.aL(arrayList0, arrayList1, v1, v2);
                    v1 = v2 - 1;
                }
            }
            if(v2 != v) {
                this.aL(arrayList0, arrayList1, v2, v);
            }
        }
    }

    private final void aO(du du0) {
        ViewGroup viewGroup0 = this.aF(du0);
        if(viewGroup0 != null && du0.gj() + du0.gk() + du0.iT() + du0.gZ() > 0) {
            if(viewGroup0.getTag(0x7F0B2471) == null) {  // id:visible_removing_fragment_view_tag
                viewGroup0.setTag(0x7F0B2471, du0);  // id:visible_removing_fragment_view_tag
            }
            ((du)viewGroup0.getTag(0x7F0B2471)).kV(du0.kX());  // id:visible_removing_fragment_view_tag
        }
    }

    private final void aP() {
        for(Object object0: this.b.e()) {
            this.T(((fv)object0));
        }
    }

    private final boolean aQ(String s, int v, int v1) {
        this.ap(false);
        this.aK(true);
        if(this.t != null && v < 0 && s == null && this.t.getChildFragmentManager().av()) {
            return true;
        }
        boolean z = this.ay(this.M, this.N, s, v, v1);
        if(z) {
            try {
                this.D = true;
                this.aN(this.M, this.N);
            }
            finally {
                this.aI();
            }
        }
        this.ak();
        this.aJ();
        this.b.i();
        return z;
    }

    final void aa(du du0) {
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        if(du0.I && du0.kY()) {
            return;
        }
        this.b.l(du0);
        if(fm.aC(du0)) {
            this.y = true;
        }
        du0.r = true;
        this.aO(du0);
    }

    public final void ab(fg fg0) {
        this.m.remove(fg0);
    }

    final void ac(Parcelable parcelable0) {
        fv fv0;
        for(Object object0: ((Bundle)parcelable0).keySet()) {
            String s = (String)object0;
            if(s.startsWith("result_")) {
                Bundle bundle0 = ((Bundle)parcelable0).getBundle(s);
                if(bundle0 != null) {
                    bundle0.setClassLoader(this.q.c.getClassLoader());
                    this.k.put(s.substring(7), bundle0);
                }
            }
        }
        HashMap hashMap0 = new HashMap();
        for(Object object1: ((Bundle)parcelable0).keySet()) {
            String s1 = (String)object1;
            if(s1.startsWith("fragment_")) {
                Bundle bundle1 = ((Bundle)parcelable0).getBundle(s1);
                if(bundle1 != null) {
                    bundle1.setClassLoader(this.q.c.getClassLoader());
                    hashMap0.put(s1.substring(9), bundle1);
                }
            }
        }
        fx fx0 = this.b;
        fx0.c.clear();
        fx0.c.putAll(hashMap0);
        FragmentManagerState fragmentManagerState0 = (FragmentManagerState)((Bundle)parcelable0).getParcelable("state");
        if(fragmentManagerState0 == null) {
            return;
        }
        fx0.b.clear();
        ArrayList arrayList0 = fragmentManagerState0.a;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            Bundle bundle2 = fx0.a(((String)arrayList0.get(v2)), null);
            if(bundle2 != null) {
                FragmentState fragmentState0 = (FragmentState)bundle2.getParcelable("state");
                du du0 = (du)this.C.b.get(fragmentState0.b);
                if(du0 == null) {
                    ClassLoader classLoader0 = this.q.c.getClassLoader();
                    fv0 = new fv(this.n, fx0, classLoader0, this.l(), bundle2);
                }
                else {
                    if(fm.ar(2)) {
                        Objects.toString(du0);
                    }
                    fv0 = new fv(this.n, fx0, du0, bundle2);
                }
                du du1 = fv0.a;
                du1.g = bundle2;
                du1.A = this;
                if(fm.ar(2)) {
                    Objects.toString(du1);
                }
                fv0.f(this.q.c.getClassLoader());
                fx0.j(fv0);
                fv0.b = this.p;
            }
        }
        for(Object object2: new ArrayList(this.C.b.values())) {
            du du2 = (du)object2;
            if(!fx0.m(du2.k)) {
                if(fm.ar(2)) {
                    Objects.toString(du2);
                    Objects.toString(fragmentManagerState0.a);
                }
                this.C.e(du2);
                du2.A = this;
                fv fv1 = new fv(this.n, fx0, du2);
                fv1.b = 1;
                fv1.e();
                du2.r = true;
                fv1.e();
            }
        }
        ArrayList arrayList1 = fragmentManagerState0.b;
        fx0.a.clear();
        if(arrayList1 != null) {
            for(Object object3: arrayList1) {
                String s2 = (String)object3;
                du du3 = fx0.b(s2);
                if(du3 == null) {
                    throw new IllegalStateException(a.a(s2, "No instantiated fragment for (", ")"));
                }
                if(fm.ar(2)) {
                    Objects.toString(du3);
                }
                fx0.h(du3);
                continue;
            }
        }
        BackStackRecordState[] arr_backStackRecordState = fragmentManagerState0.c;
        if(arr_backStackRecordState == null) {
            this.c = new ArrayList();
        }
        else {
            this.c = new ArrayList(arr_backStackRecordState.length);
            for(int v3 = 0; true; ++v3) {
                BackStackRecordState[] arr_backStackRecordState1 = fragmentManagerState0.c;
                if(v3 >= arr_backStackRecordState1.length) {
                    break;
                }
                BackStackRecordState backStackRecordState0 = arr_backStackRecordState1[v3];
                ca ca0 = new ca(this);
                backStackRecordState0.a(ca0);
                ca0.c = backStackRecordState0.g;
                for(int v4 = 0; true; ++v4) {
                    ArrayList arrayList2 = backStackRecordState0.b;
                    if(v4 >= arrayList2.size()) {
                        break;
                    }
                    String s3 = (String)arrayList2.get(v4);
                    if(s3 != null) {
                        fy fy0 = (fy)ca0.e.get(v4);
                        fy0.b = this.e(s3);
                    }
                }
                ca0.d(1);
                if(fm.ar(2)) {
                    PrintWriter printWriter0 = new PrintWriter(new gn());
                    ca0.j("  ", printWriter0, false);
                    printWriter0.close();
                }
                this.c.add(ca0);
            }
        }
        this.i.set(fragmentManagerState0.d);
        String s4 = fragmentManagerState0.e;
        if(s4 != null) {
            du du4 = this.e(s4);
            this.t = du4;
            this.F(du4);
        }
        ArrayList arrayList3 = fragmentManagerState0.f;
        if(arrayList3 != null) {
            for(int v1 = 0; v1 < arrayList3.size(); ++v1) {
                String s5 = (String)arrayList3.get(v1);
                BackStackState backStackState0 = (BackStackState)fragmentManagerState0.g.get(v1);
                this.j.put(s5, backStackState0);
            }
        }
        this.x = new ArrayDeque(fragmentManagerState0.h);
    }

    final void ad(du du0, boolean z) {
        ViewGroup viewGroup0 = this.aF(du0);
        if(viewGroup0 != null && (viewGroup0 instanceof FragmentContainerView)) {
            ((FragmentContainerView)viewGroup0).a = ((int)z) ^ 1;
        }
    }

    public final void ae(String s, Bundle bundle0) {
        ff ff0 = (ff)this.l.get(s);
        if(ff0 != null && ff0.a.a().a(lpf.d)) {
            ff0.a(s, bundle0);
        }
        else {
            this.k.put(s, bundle0);
        }
        if(fm.ar(2)) {
            Objects.toString(bundle0);
        }
    }

    public final void af(String s, lps lps0, fs fs0) {
        lpg lpg0 = lps0.getLifecycle();
        if(lpg0.a() == lpf.a) {
            return;
        }
        ey ey0 = new ey(this, s, fs0, lpg0);
        ff ff0 = new ff(lpg0, fs0, ey0);
        ff ff1 = (ff)this.l.put(s, ff0);
        if(ff1 != null) {
            ff1.b();
        }
        if(fm.ar(2)) {
            Objects.toString(lpg0);
            Objects.toString(fs0);
        }
        lpg0.c(ey0);
    }

    final void ag(du du0, lpf lpf0) {
        if(!du0.equals(this.e(du0.k)) || du0.B != null && du0.A != this) {
            throw new IllegalArgumentException(a.m(this, du0, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        du0.Y = lpf0;
    }

    final void ah(du du0) {
        if(du0 != null && (!du0.equals(this.e(du0.k)) || du0.B != null && du0.A != this)) {
            throw new IllegalArgumentException(a.m(this, du0, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        du du1 = this.t;
        this.t = du0;
        this.F(du1);
        this.F(this.t);
    }

    public final void ai(RuntimeException runtimeException0) {
        Log.e("FragmentManager", runtimeException0.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter0 = new PrintWriter(new gn());
        eh eh0 = this.q;
        if(eh0 == null) {
            try {
                this.M("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception1) {
                Log.e("FragmentManager", "Failed dumping state", exception1);
            }
        }
        else {
            try {
                eh0.h(printWriter0, new String[0]);
            }
            catch(Exception exception0) {
                Log.e("FragmentManager", "Failed dumping state", exception0);
            }
        }
        throw runtimeException0;
    }

    public final void aj(fd fd0) {
        ibuq.f(fd0, "cb");
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.n.a;
        synchronized(copyOnWriteArrayList0) {
            int v1 = copyOnWriteArrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((ek)copyOnWriteArrayList0.get(v2)).a == fd0) {
                    copyOnWriteArrayList0.remove(v2);
                    break;
                }
            }
        }
    }

    public final void ak() {
        boolean z = true;
        ArrayList arrayList0 = this.a;
        synchronized(arrayList0) {
            if(!arrayList0.isEmpty()) {
                this.h.g(true);
                boolean z1 = !fm.ar(3);
                return;
            }
        }
        if(this.b() <= 0 || !this.at(this.s)) {
            z = false;
        }
        boolean z2 = !fm.ar(3);
        this.h.g(z);
    }

    final boolean al(MenuItem menuItem0) {
        if(this.p <= 0) {
            return false;
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && !du0.H && (du0.onContextItemSelected(menuItem0) || du0.C.al(menuItem0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean am(Menu menu0, MenuInflater menuInflater0) {
        int v1;
        if(this.p <= 0) {
            return false;
        }
        ArrayList arrayList0 = null;
        boolean z = false;
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && fm.aD(du0) && !du0.H) {
                if(du0.L && du0.M) {
                    du0.onCreateOptionsMenu(menu0, menuInflater0);
                    v1 = 1;
                }
                else {
                    v1 = 0;
                }
                if((v1 | du0.C.am(menu0, menuInflater0)) != 0) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                    }
                    arrayList0.add(du0);
                    z = true;
                }
            }
        }
        if(this.E != null) {
            for(int v = 0; v < this.E.size(); ++v) {
                du du1 = (du)this.E.get(v);
                if(arrayList0 == null || !arrayList0.contains(du1)) {
                    du1.onDestroyOptionsMenu();
                }
            }
        }
        this.E = arrayList0;
        return z;
    }

    public final boolean an(MenuItem menuItem0) {
        if(this.p <= 0) {
            return false;
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && !du0.H && (du0.L && du0.M && du0.onOptionsItemSelected(menuItem0) || du0.C.an(menuItem0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean ao(Menu menu0) {
        int v;
        if(this.p <= 0) {
            return false;
        }
        boolean z = false;
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null && fm.aD(du0) && !du0.H) {
                if(du0.L && du0.M) {
                    du0.onPrepareOptionsMenu(menu0);
                    v = 1;
                }
                else {
                    v = 0;
                }
                if((du0.C.ao(menu0) | v) != 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    final boolean ap(boolean z) {
        this.aK(z);
        if(!this.g) {
            ca ca0 = this.f;
            if(ca0 != null) {
                ca0.b = false;
                ca0.e();
                if(fm.ar(3)) {
                    Objects.toString(this.f);
                    Objects.toString(this.a);
                }
                this.f.c(false, false);
                this.a.add(0, this.f);
                ArrayList arrayList0 = this.f.e;
                int v = arrayList0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    du du0 = ((fy)arrayList0.get(v1)).b;
                    if(du0 != null) {
                        du0.s = false;
                    }
                }
                this.f = null;
            }
        }
        boolean z1 = false;
        while(true) {
            ArrayList arrayList1 = this.M;
            ArrayList arrayList2 = this.N;
            ArrayList arrayList3 = this.a;
            synchronized(arrayList3) {
                try {
                    if(!arrayList3.isEmpty()) {
                        int v3 = arrayList3.size();
                        int v4 = 0;
                        int v5 = 0;
                        while(true) {
                            if(v4 >= v3) {
                                goto label_39;
                            }
                            v5 |= ((fh)arrayList3.get(v4)).k(arrayList1, arrayList2);
                            ++v4;
                        }
                    }
                    break;
                }
                catch(Throwable throwable0) {
                    this.a.clear();
                    this.q.d.removeCallbacks(this.P);
                    throw throwable0;
                }
            }
        label_39:
            arrayList3.clear();
            this.q.d.removeCallbacks(this.P);
            if(v5 == 0) {
                break;
            }
            try {
                z1 = true;
                this.D = true;
                this.aN(this.M, this.N);
            }
            finally {
                this.aI();
            }
            continue;
        }
        this.ak();
        this.aJ();
        this.b.i();
        return z1;
    }

    public final boolean aq() {
        boolean z = this.ap(true);
        this.aM();
        return z;
    }

    public static boolean ar(int v) {
        return Log.isLoggable("FragmentManager", v);
    }

    public final boolean as() {
        return this.s == null ? true : this.s.isAdded() && this.s.getParentFragmentManager().as();
    }

    final boolean at(du du0) {
        if(du0 == null) {
            return true;
        }
        fm fm0 = du0.A;
        return du0.equals(fm0.t) && this.at(fm0.s);
    }

    public final boolean au() {
        return this.z || this.A;
    }

    public final boolean av() {
        return this.aQ(null, -1, 0);
    }

    public final boolean aw(int v, int v1) {
        if(v >= 0) {
            return this.aQ(null, v, v1);
        }
        throw new IllegalArgumentException("Bad id: " + v);
    }

    public final boolean ax(String s, int v) {
        return this.aQ(s, -1, v);
    }

    final boolean ay(ArrayList arrayList0, ArrayList arrayList1, String s, int v, int v1) {
        int v2 = this.a(s, v, 1 == (v1 & 1));
        if(v2 < 0) {
            return false;
        }
        int v3 = this.c.size();
        while(true) {
            --v3;
            if(v3 < v2) {
                break;
            }
            arrayList0.add(((ca)this.c.remove(v3)));
            arrayList1.add(Boolean.valueOf(true));
        }
        return true;
    }

    public final ca az(int v) {
        if(v == this.c.size()) {
            ca ca0 = this.f;
            if(ca0 != null) {
                return ca0;
            }
            throw new IndexOutOfBoundsException();
        }
        return (ca)this.c.get(v);
    }

    public final int b() {
        int v = this.c.size();
        return this.f == null ? v : v + 1;
    }

    // Detected as a lambda impl.
    final Bundle c() {
        ArrayList arrayList2;
        Bundle bundle0 = new Bundle();
        this.aM();
        this.N();
        this.ap(true);
        this.z = true;
        this.C.g = true;
        fx fx0 = this.b;
        ArrayList arrayList0 = new ArrayList(fx0.b.size());
        for(Object object0: fx0.b.values()) {
            fv fv0 = (fv)object0;
            if(fv0 != null) {
                du du0 = fv0.a;
                fx0.a(du0.k, fv0.a());
                arrayList0.add(du0.k);
                if(fm.ar(2)) {
                    Objects.toString(du0);
                    Objects.toString(du0.g);
                }
            }
        }
        HashMap hashMap0 = fx0.c;
        if(hashMap0.isEmpty()) {
            fm.ar(2);
            return bundle0;
        }
        BackStackRecordState[] arr_backStackRecordState = null;
        ArrayList arrayList1 = fx0.a;
        synchronized(arrayList1) {
            if(arrayList1.isEmpty()) {
                goto label_39;
            }
            else {
                arrayList2 = new ArrayList(arrayList1.size());
                for(Object object1: arrayList1) {
                    du du1 = (du)object1;
                    arrayList2.add(du1.k);
                    if(fm.ar(2)) {
                        Objects.toString(du1);
                    }
                }
            }
        }
        goto label_45;
    label_39:
        arrayList2 = null;
    label_45:
        int v = this.c.size();
        if(v > 0) {
            arr_backStackRecordState = new BackStackRecordState[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_backStackRecordState[v1] = new BackStackRecordState(((ca)this.c.get(v1)));
                if(fm.ar(2)) {
                    Objects.toString(this.c.get(v1));
                }
            }
        }
        FragmentManagerState fragmentManagerState0 = new FragmentManagerState();
        fragmentManagerState0.a = arrayList0;
        fragmentManagerState0.b = arrayList2;
        fragmentManagerState0.c = arr_backStackRecordState;
        fragmentManagerState0.d = this.i.get();
        du du2 = this.t;
        if(du2 != null) {
            fragmentManagerState0.e = du2.k;
        }
        fragmentManagerState0.f.addAll(this.j.keySet());
        fragmentManagerState0.g.addAll(this.j.values());
        fragmentManagerState0.h = new ArrayList(this.x);
        bundle0.putParcelable("state", fragmentManagerState0);
        Map map0 = this.k;
        for(Object object2: map0.keySet()) {
            bundle0.putBundle("result_" + ((String)object2), ((Bundle)map0.get(((String)object2))));
        }
        for(Object object3: hashMap0.keySet()) {
            bundle0.putBundle("fragment_" + ((String)object3), ((Bundle)hashMap0.get(((String)object3))));
        }
        return bundle0;
    }

    public final Fragment.SavedState d(du du0) {
        fv fv0 = this.b.d(du0.k);
        if(fv0 == null || !fv0.a.equals(du0)) {
            this.ai(new IllegalStateException(a.i(du0, "Fragment ", " is not currently in the FragmentManager")));
        }
        return fv0.a.f < 0 ? null : new Fragment.SavedState(fv0.a());
    }

    final du e(String s) {
        return this.b.b(s);
    }

    public static du f(View view0) {
        du du0 = fm.i(view0);
        if(du0 != null) {
            return du0;
        }
        throw new IllegalStateException(a.i(view0, "View ", " does not have a Fragment set"));
    }

    public final du g(int v) {
        fx fx0 = this.b;
        ArrayList arrayList0 = fx0.a;
        int v1 = arrayList0.size();
        while(true) {
            --v1;
            if(v1 < 0) {
                break;
            }
            du du0 = (du)arrayList0.get(v1);
            if(du0 != null && du0.E == v) {
                return du0;
            }
        }
        for(Object object0: fx0.b.values()) {
            fv fv0 = (fv)object0;
            if(fv0 != null) {
                du du1 = fv0.a;
                if(du1.E == v) {
                    return du1;
                }
            }
        }
        return null;
    }

    public final du h(String s) {
        fx fx0 = this.b;
        if(s == null) {
        label_10:
            if(s != null) {
                for(Object object0: fx0.b.values()) {
                    fv fv0 = (fv)object0;
                    if(fv0 != null) {
                        du du1 = fv0.a;
                        if(s.equals(du1.G)) {
                            return du1;
                        }
                    }
                }
            }
        }
        else {
            ArrayList arrayList0 = fx0.a;
            int v = arrayList0.size();
            while(true) {
                --v;
                if(v < 0) {
                    goto label_10;
                }
                du du0 = (du)arrayList0.get(v);
                if(du0 != null && s.equals(du0.G)) {
                    return du0;
                }
            }
        }
        return null;
    }

    public static du i(View view0) {
        while(view0 != null) {
            du du0 = fm.k(view0);
            if(du0 != null) {
                return du0;
            }
            ViewParent viewParent0 = view0.getParent();
            view0 = (viewParent0 instanceof View) ? ((View)viewParent0) : null;
        }
        return null;
    }

    public final du j(Bundle bundle0, String s) {
        String s1 = bundle0.getString(s);
        if(s1 == null) {
            return null;
        }
        du du0 = this.e(s1);
        if(du0 == null) {
            this.ai(new IllegalStateException(a.l(s1, s, "Fragment no longer exists for key ", ": unique id ")));
        }
        return du0;
    }

    public static du k(View view0) {
        Object object0 = view0.getTag(0x7F0B14C7);  // id:fragment_container_view_tag
        return (object0 instanceof du) ? ((du)object0) : null;
    }

    public final eg l() {
        return this.s == null ? this.K : this.s.A.l();
    }

    final fv m(du du0) {
        String s = du0.mPreviousWho;
        if(s != null) {
            lln.a(du0, s);
        }
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        fv fv0 = this.n(du0);
        du0.A = this;
        fx fx0 = this.b;
        fx0.j(fv0);
        if(!du0.I) {
            fx0.h(du0);
            du0.r = false;
            if(du0.P == null) {
                du0.V = false;
            }
            if(fm.aC(du0)) {
                this.y = true;
            }
        }
        return fv0;
    }

    final fv n(du du0) {
        fx fx0 = this.b;
        fv fv0 = fx0.d(du0.k);
        if(fv0 != null) {
            return fv0;
        }
        fv fv1 = new fv(this.n, fx0, du0);
        fv1.f(this.q.c.getClassLoader());
        fv1.b = this.p;
        return fv1;
    }

    public void noteStateNotSaved() {
        if(this.q != null) {
            this.z = false;
            this.A = false;
            this.C.g = false;
            for(Object object0: this.b.g()) {
                du du0 = (du)object0;
                if(du0 != null) {
                    du0.C.noteStateNotSaved();
                }
            }
        }
    }

    public final List o() {
        return this.b.g();
    }

    final Set p(ArrayList arrayList0, int v, int v1) {
        Set set0 = new HashSet();
        while(v < v1) {
            ArrayList arrayList1 = ((ca)arrayList0.get(v)).e;
            int v2 = arrayList1.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                du du0 = ((fy)arrayList1.get(v3)).b;
                if(du0 != null) {
                    ViewGroup viewGroup0 = du0.O;
                    if(viewGroup0 != null) {
                        set0.add(gx.c(viewGroup0, this));
                    }
                }
            }
            ++v;
        }
        return set0;
    }

    public final void q(fq fq0) {
        this.o.add(fq0);
    }

    public final void r(fg fg0) {
        this.m.add(fg0);
    }

    final void s(eh eh0, ee ee0, du du0) {
        if(this.q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.q = eh0;
        this.r = ee0;
        this.s = du0;
        if(du0 != null) {
            this.q(new ez(du0));
        }
        else if((eh0 instanceof fq)) {
            this.q(((fq)eh0));
        }
        if(this.s != null) {
            this.ak();
        }
        if((eh0 instanceof abf)) {
            abf abf0 = (abf)eh0;
            abc abc0 = abf0.getOnBackPressedDispatcher();
            this.e = abc0;
            if(du0 != null) {
                abf0 = du0;
            }
            abc0.c(abf0, this.h);
        }
        if(du0 == null) {
            du0 = null;
            this.C = (eh0 instanceof lsq) ? ((fp)new lso(((lsq)eh0).getViewModelStore(), fp.a).a(fp.class)) : new fp(false);
        }
        else {
            fp fp0 = du0.A.C;
            HashMap hashMap0 = fp0.c;
            fp fp1 = (fp)hashMap0.get(du0.k);
            if(fp1 == null) {
                fp1 = new fp(fp0.e);
                hashMap0.put(du0.k, fp1);
            }
            this.C = fp1;
        }
        this.C.g = this.au();
        this.b.d = this.C;
        eh eh1 = this.q;
        if((eh1 instanceof orl) && du0 == null) {
            orh orh0 = ((orl)eh1).getSavedStateRegistry();
            orh0.b("android:support:fragments", () -> {
                ArrayList arrayList2;
                Bundle bundle0 = new Bundle();
                this.aM();
                this.N();
                this.ap(true);
                this.z = true;
                this.C.g = true;
                fx fx0 = this.b;
                ArrayList arrayList0 = new ArrayList(fx0.b.size());
                for(Object object0: fx0.b.values()) {
                    fv fv0 = (fv)object0;
                    if(fv0 != null) {
                        du du0 = fv0.a;
                        fx0.a(du0.k, fv0.a());
                        arrayList0.add(du0.k);
                        if(fm.ar(2)) {
                            Objects.toString(du0);
                            Objects.toString(du0.g);
                        }
                    }
                }
                HashMap hashMap0 = fx0.c;
                if(hashMap0.isEmpty()) {
                    fm.ar(2);
                    return bundle0;
                }
                BackStackRecordState[] arr_backStackRecordState = null;
                ArrayList arrayList1 = fx0.a;
                synchronized(arrayList1) {
                    if(arrayList1.isEmpty()) {
                        goto label_39;
                    }
                    else {
                        arrayList2 = new ArrayList(arrayList1.size());
                        for(Object object1: arrayList1) {
                            du du1 = (du)object1;
                            arrayList2.add(du1.k);
                            if(fm.ar(2)) {
                                Objects.toString(du1);
                            }
                        }
                    }
                }
                goto label_45;
            label_39:
                arrayList2 = null;
            label_45:
                int v = this.c.size();
                if(v > 0) {
                    arr_backStackRecordState = new BackStackRecordState[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_backStackRecordState[v1] = new BackStackRecordState(((ca)this.c.get(v1)));
                        if(fm.ar(2)) {
                            Objects.toString(this.c.get(v1));
                        }
                    }
                }
                FragmentManagerState fragmentManagerState0 = new FragmentManagerState();
                fragmentManagerState0.a = arrayList0;
                fragmentManagerState0.b = arrayList2;
                fragmentManagerState0.c = arr_backStackRecordState;
                fragmentManagerState0.d = this.i.get();
                du du2 = this.t;
                if(du2 != null) {
                    fragmentManagerState0.e = du2.k;
                }
                fragmentManagerState0.f.addAll(this.j.keySet());
                fragmentManagerState0.g.addAll(this.j.values());
                fragmentManagerState0.h = new ArrayList(this.x);
                bundle0.putParcelable("state", fragmentManagerState0);
                Map map0 = this.k;
                for(Object object2: map0.keySet()) {
                    bundle0.putBundle("result_" + ((String)object2), ((Bundle)map0.get(((String)object2))));
                }
                for(Object object3: hashMap0.keySet()) {
                    bundle0.putBundle("fragment_" + ((String)object3), ((Bundle)hashMap0.get(((String)object3))));
                }
                return bundle0;
            });
            Bundle bundle0 = orh0.a("android:support:fragments");
            if(bundle0 != null) {
                this.ac(bundle0);
            }
        }
        eh eh2 = this.q;
        if((eh2 instanceof acx)) {
            acw acw0 = ((acx)eh2).getActivityResultRegistry();
            String s = du0 == null ? "" : du0.k + ":";
            this.u = acw0.b("FragmentManager:" + s + "StartActivityForResult", new adt(), new fa(this));
            this.v = acw0.b("FragmentManager:" + s + "StartIntentSenderForResult", new fc(), new fb(this));
            this.w = acw0.b("FragmentManager:" + s + "RequestPermissions", new adr(), new es(this));
        }
        eh eh3 = this.q;
        if((eh3 instanceof jwj)) {
            ((jwj)eh3).addOnConfigurationChangedListener(this.F);
        }
        eh eh4 = this.q;
        if((eh4 instanceof jwk)) {
            ((jwk)eh4).addOnTrimMemoryListener(this.G);
        }
        eh eh5 = this.q;
        if((eh5 instanceof jvs)) {
            ((jvs)eh5).addOnMultiWindowModeChangedListener(this.H);
        }
        eh eh6 = this.q;
        if((eh6 instanceof jvt)) {
            ((jvt)eh6).addOnPictureInPictureModeChangedListener(this.I);
        }
        eh eh7 = this.q;
        if((eh7 instanceof kdt) && du0 == null) {
            ((kdt)eh7).addMenuProvider(this.J);
        }
    }

    final void t(du du0) {
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        if(du0.I) {
            du0.I = false;
            if(!du0.q) {
                this.b.h(du0);
                if(fm.ar(2)) {
                    Objects.toString(du0);
                }
                if(fm.aC(du0)) {
                    this.y = true;
                }
            }
        }
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        du du0 = this.s;
        if(du0 == null) {
            eh eh0 = this.q;
            if(eh0 == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(eh0.getClass().getSimpleName());
                stringBuilder0.append("{");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.q)));
                stringBuilder0.append("}");
            }
        }
        else {
            stringBuilder0.append(du0.getClass().getSimpleName());
            stringBuilder0.append("{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.s)));
            stringBuilder0.append("}");
        }
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }

    public final void u(String s) {
        this.k.remove(s);
        fm.ar(2);
    }

    public final void v(String s) {
        ff ff0 = (ff)this.l.remove(s);
        if(ff0 != null) {
            ff0.b();
        }
        fm.ar(2);
    }

    final void w(du du0) {
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
        if(!du0.I) {
            du0.I = true;
            if(du0.q) {
                if(fm.ar(2)) {
                    Objects.toString(du0);
                }
                this.b.l(du0);
                if(fm.aC(du0)) {
                    this.y = true;
                }
                this.aO(du0);
            }
        }
    }

    final void x() {
        this.z = false;
        this.A = false;
        this.C.g = false;
        this.K(4);
    }

    public final void y(Configuration configuration0, boolean z) {
        if(z && (this.q instanceof jwj)) {
            this.ai(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for(Object object0: this.b.g()) {
            du du0 = (du)object0;
            if(du0 != null) {
                du0.onConfigurationChanged(configuration0);
                if(z) {
                    du0.C.y(configuration0, true);
                }
            }
        }
    }

    final void z() {
        this.z = false;
        this.A = false;
        this.C.g = false;
        this.K(1);
    }
}

