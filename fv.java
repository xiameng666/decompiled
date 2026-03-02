import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentState;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Objects;

final class fv {
    public final du a;
    public int b;
    private final el c;
    private final fx d;
    private boolean e;

    public fv(el el0, fx fx0, du du0) {
        this.e = false;
        this.b = -1;
        this.c = el0;
        this.d = fx0;
        this.a = du0;
    }

    public fv(el el0, fx fx0, du du0, Bundle bundle0) {
        this.e = false;
        this.b = -1;
        this.c = el0;
        this.d = fx0;
        this.a = du0;
        du0.h = null;
        du0.i = null;
        du0.z = 0;
        du0.v = false;
        du0.q = false;
        du0.n = du0.m == null ? null : du0.m.k;
        du0.m = null;
        du0.g = bundle0;
        du0.l = bundle0.getBundle("arguments");
    }

    public fv(el el0, fx fx0, ClassLoader classLoader0, eg eg0, Bundle bundle0) {
        this.e = false;
        this.b = -1;
        this.c = el0;
        this.d = fx0;
        du du0 = ((FragmentState)bundle0.getParcelable("state")).a(eg0);
        this.a = du0;
        du0.g = bundle0;
        Bundle bundle1 = bundle0.getBundle("arguments");
        if(bundle1 != null) {
            bundle1.setClassLoader(classLoader0);
        }
        du0.setArguments(bundle1);
        if(fm.ar(2)) {
            Objects.toString(du0);
        }
    }

    final Bundle a() {
        Bundle bundle0 = new Bundle();
        du du0 = this.a;
        if(du0.f == -1) {
            Bundle bundle1 = du0.g;
            if(bundle1 != null) {
                bundle0.putAll(bundle1);
            }
        }
        bundle0.putParcelable("state", new FragmentState(du0));
        if(du0.f > 0) {
            Bundle bundle2 = new Bundle();
            du0.onSaveInstanceState(bundle2);
            if(!bundle2.isEmpty()) {
                bundle0.putBundle("savedInstanceState", bundle2);
            }
            this.c.j(du0, bundle2, false);
            Bundle bundle3 = new Bundle();
            du0.ad.c(bundle3);
            if(!bundle3.isEmpty()) {
                bundle0.putBundle("registryState", bundle3);
            }
            Bundle bundle4 = du0.C.c();
            if(!bundle4.isEmpty()) {
                bundle0.putBundle("childFragmentManager", bundle4);
            }
            if(du0.P != null) {
                this.g();
            }
            SparseArray sparseArray0 = du0.h;
            if(sparseArray0 != null) {
                bundle0.putSparseParcelableArray("viewState", sparseArray0);
            }
            Bundle bundle5 = du0.i;
            if(bundle5 != null) {
                bundle0.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = du0.l;
        if(bundle6 != null) {
            bundle0.putBundle("arguments", bundle6);
        }
        return bundle0;
    }

    final void b() {
        du du0 = this.a;
        du du1 = fm.i(du0.O);
        if(du1 != null && !du1.equals(du0.getParentFragment())) {
            int v = du0.F;
            ibuq.f(du0, "fragment");
            llz llz0 = new llz(du0, du1, v);
            lln.d(llz0);
            llm llm0 = lln.b(du0);
            if(llm0.b.contains(lll.e) && lln.e(llm0, du0.getClass(), llz0.getClass())) {
                lln.c(llm0, llz0);
            }
        }
        fx fx0 = this.d;
        ViewGroup viewGroup0 = du0.O;
        int v1 = -1;
        if(viewGroup0 != null) {
            ArrayList arrayList0 = fx0.a;
            int v2 = arrayList0.indexOf(du0);
            int v3 = v2 - 1;
        alab1:
            while(true) {
                if(v3 >= 0) {
                    du du2 = (du)arrayList0.get(v3);
                    if(du2.O == viewGroup0) {
                        View view0 = du2.P;
                        if(view0 != null) {
                            v1 = viewGroup0.indexOfChild(view0) + 1;
                            break;
                        }
                    }
                    --v3;
                }
                else {
                    while(true) {
                        while(true) {
                            ++v2;
                            if(v2 >= arrayList0.size()) {
                                break alab1;
                            }
                            du du3 = (du)arrayList0.get(v2);
                            if(du3.O != viewGroup0) {
                                break;
                            }
                            View view1 = du3.P;
                            if(view1 == null) {
                                break;
                            }
                            v1 = viewGroup0.indexOfChild(view1);
                            break alab1;
                        }
                    }
                }
            }
        }
        du0.O.addView(du0.P, v1);
    }

    final void c() {
        String s;
        du du0 = this.a;
        if(du0.u) {
            return;
        }
        if(fm.ar(3)) {
            Objects.toString(du0);
        }
        ViewGroup viewGroup0 = null;
        Bundle bundle0 = du0.g == null ? null : du0.g.getBundle("savedInstanceState");
        LayoutInflater layoutInflater0 = du0.iU(bundle0);
        ViewGroup viewGroup1 = du0.O;
        if(viewGroup1 == null) {
            int v = du0.F;
            switch(v) {
                case -1: {
                    throw new IllegalArgumentException(a.i(du0, "Cannot create fragment ", " for a container view with no id"));
                }
                case 0: {
                    break;
                }
                default: {
                    viewGroup0 = (ViewGroup)du0.A.r.a(v);
                    if(viewGroup0 == null) {
                        if(!du0.x && !du0.w) {
                            try {
                                s = "unknown";
                                s = du0.getResources().getResourceName(du0.F);
                            }
                            catch(Resources.NotFoundException unused_ex) {
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.a.F) + " (" + s + ") for fragment " + this.a);
                        }
                    }
                    else if(!(viewGroup0 instanceof FragmentContainerView)) {
                        ibuq.f(this.a, "fragment");
                        lly lly0 = new lly(this.a, viewGroup0);
                        lln.d(lly0);
                        llm llm0 = lln.b(this.a);
                        if(llm0.b.contains(lll.i) && lln.e(llm0, this.a.getClass(), lly0.getClass())) {
                            lln.c(llm0, lly0);
                        }
                    }
                }
            }
        }
        else {
            viewGroup0 = viewGroup1;
        }
        du du1 = this.a;
        du1.O = viewGroup0;
        du1.gl(layoutInflater0, viewGroup0, bundle0);
        if(du1.P != null) {
            if(fm.ar(3)) {
                Objects.toString(du1);
            }
            du1.P.setSaveFromParentEnabled(false);
            du1.P.setTag(0x7F0B14C7, du1);  // id:fragment_container_view_tag
            if(viewGroup0 != null) {
                this.b();
            }
            if(du1.H) {
                du1.P.setVisibility(8);
            }
            if(du1.P.isAttachedToWindow()) {
                du1.P.requestApplyInsets();
            }
            else {
                du1.P.addOnAttachStateChangeListener(new fu(du1.P));
            }
            du1.ja();
            this.c.m(du1, du1.P, bundle0, false);
            int v1 = du1.P.getVisibility();
            du1.ha().s = du1.P.getAlpha();
            if(du1.O != null && v1 == 0) {
                View view0 = du1.P.findFocus();
                if(view0 != null) {
                    du1.jc(view0);
                    if(fm.ar(2)) {
                        Objects.toString(view0);
                        Objects.toString(du1);
                    }
                }
                du1.P.setAlpha(0.0f);
            }
        }
        du1.f = 2;
    }

    final void d() {
        du du0 = this.a;
        if(du0.u && du0.v && !du0.y) {
            if(fm.ar(3)) {
                Objects.toString(du0);
            }
            Bundle bundle0 = du0.g == null ? null : du0.g.getBundle("savedInstanceState");
            du0.gl(du0.iU(bundle0), null, bundle0);
            View view0 = du0.P;
            if(view0 != null) {
                view0.setSaveFromParentEnabled(false);
                du0.P.setTag(0x7F0B14C7, du0);  // id:fragment_container_view_tag
                if(du0.H) {
                    du0.P.setVisibility(8);
                }
                du0.ja();
                this.c.m(du0, du0.P, bundle0, false);
                du0.f = 2;
            }
        }
    }

    final void e() {
        boolean z2;
        gt gt0;
        int v1;
        du du0;
        if(this.e) {
            if(fm.ar(2)) {
                Objects.toString(this.a);
            }
            return;
        }
        try {
            this.e = true;
            boolean z = false;
            while(true) {
                du0 = this.a;
                Bundle bundle0 = null;
                if(du0.A == null) {
                    v1 = du0.f;
                }
                else {
                    v1 = this.b;
                    switch(du0.Y.ordinal()) {
                        case 1: {
                            v1 = Math.min(v1, 0);
                            break;
                        }
                        case 2: {
                            v1 = Math.min(v1, 1);
                            break;
                        }
                        case 3: {
                            v1 = Math.min(v1, 5);
                            break;
                        }
                        case 4: {
                            break;
                        }
                        default: {
                            v1 = Math.min(v1, -1);
                        }
                    }
                    if(du0.u) {
                        if(du0.v) {
                            v1 = Math.max(this.b, 2);
                            if(du0.P != null && du0.P.getParent() == null) {
                                v1 = Math.min(v1, 2);
                            }
                        }
                        else {
                            v1 = this.b >= 4 ? Math.min(v1, 1) : Math.min(v1, du0.f);
                        }
                    }
                    if(du0.w && du0.O == null) {
                        v1 = Math.min(v1, 4);
                    }
                    if(!du0.q) {
                        v1 = Math.min(v1, 1);
                    }
                    ViewGroup viewGroup0 = du0.O;
                    if(viewGroup0 == null) {
                        gt0 = null;
                    }
                    else {
                        gx gx0 = gx.c(viewGroup0, du0.getParentFragmentManager());
                        ibuq.e(du0, "getFragment(...)");
                        gw gw0 = gx0.a(du0);
                        gt0 = gw0 == null ? null : gw0.b;
                        gw gw1 = gx0.b(du0);
                        gt gt1 = gw1 == null ? null : gw1.b;
                        if(gt0 == null || gt0.ordinal() == 0) {
                            gt0 = gt1;
                        }
                    }
                    if(gt0 == gt.b) {
                        v1 = Math.min(v1, 6);
                    }
                    else if(gt0 == gt.c) {
                        v1 = Math.max(v1, 3);
                    }
                    else if(du0.r) {
                        v1 = du0.kY() ? Math.min(v1, 1) : Math.min(v1, -1);
                    }
                    if(du0.Q && du0.f < 5) {
                        v1 = Math.min(v1, 4);
                    }
                    if(du0.s) {
                        v1 = Math.max(v1, 3);
                    }
                    if(fm.ar(2)) {
                        Objects.toString(du0);
                    }
                }
                int v2 = du0.f;
                if(v1 == v2) {
                    break;
                }
                if(v1 > v2) {
                    switch(v2 + 1) {
                        case 0: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            du du1 = du0.m;
                            if(du1 == null) {
                                String s = du0.n;
                                if(s != null) {
                                    bundle0 = this.d.d(s);
                                    if(bundle0 == null) {
                                        throw new IllegalStateException("Fragment " + du0 + " declared target fragment " + du0.n + " that does not belong to this FragmentManager!");
                                    }
                                }
                            }
                            else {
                                fv fv0 = this.d.d(du1.k);
                                if(fv0 == null) {
                                    throw new IllegalStateException("Fragment " + du0 + " declared target fragment " + du0.m + " that does not belong to this FragmentManager!");
                                }
                                du0.n = du0.m.k;
                                du0.m = null;
                                bundle0 = fv0;
                            }
                            if(bundle0 != null) {
                                ((fv)bundle0).e();
                            }
                            du0.B = du0.A.q;
                            du0.D = du0.A.s;
                            el el0 = this.c;
                            el0.g(du0, false);
                            ArrayList arrayList0 = du0.af;
                            int v3 = arrayList0.size();
                            for(int v4 = 0; v4 < v3; ++v4) {
                                ((ds)arrayList0.get(v4)).a();
                            }
                            arrayList0.clear();
                            du0.C.s(du0.B, du0.eS(), du0);
                            du0.f = 0;
                            du0.N = false;
                            du0.onAttach(du0.B.c);
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onAttach()"));
                            }
                            for(Object object0: du0.A.o) {
                                ((fq)object0).jR(du0);
                            }
                            du0.C.z = false;
                            du0.C.A = false;
                            du0.C.C.g = false;
                            du0.C.K(0);
                            el0.b(du0, false);
                            break;
                        }
                        case 1: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            Bundle bundle1 = du0.g;
                            if(bundle1 != null) {
                                bundle0 = bundle1.getBundle("savedInstanceState");
                            }
                            if(du0.X) {
                                du0.f = 1;
                                du0.iR();
                            }
                            else {
                                el el1 = this.c;
                                el1.h(du0, bundle0, false);
                                du0.C.noteStateNotSaved();
                                du0.f = 1;
                                du0.N = false;
                                du0.Z.c(new dm(du0));
                                du0.onCreate(bundle0);
                                du0.X = true;
                                if(!du0.N) {
                                    throw new gy(a.i(du0, "Fragment ", " did not call through to super.onCreate()"));
                                }
                                du0.Z.f(lpe.ON_CREATE);
                                el1.c(du0, bundle0, false);
                            }
                            break;
                        }
                        case 2: {
                            this.d();
                            this.c();
                            break;
                        }
                        case 3: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            Bundle bundle2 = du0.g == null ? null : du0.g.getBundle("savedInstanceState");
                            du0.C.noteStateNotSaved();
                            du0.f = 3;
                            du0.N = false;
                            du0.onActivityCreated(bundle2);
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onActivityCreated()"));
                            }
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            if(du0.P != null) {
                                Bundle bundle3 = du0.g == null ? null : du0.g.getBundle("savedInstanceState");
                                SparseArray sparseArray0 = du0.h;
                                if(sparseArray0 != null) {
                                    du0.P.restoreHierarchyState(sparseArray0);
                                    du0.h = null;
                                }
                                du0.N = false;
                                du0.onViewStateRestored(bundle3);
                                if(!du0.N) {
                                    throw new gy(a.i(du0, "Fragment ", " did not call through to super.onViewStateRestored()"));
                                }
                                if(du0.P != null) {
                                    du0.aa.a(lpe.ON_CREATE);
                                }
                            }
                            du0.g = null;
                            du0.C.x();
                            this.c.a(du0, bundle2, false);
                            break;
                        }
                        case 4: {
                            if(du0.P != null) {
                                ViewGroup viewGroup1 = du0.O;
                                if(viewGroup1 != null) {
                                    gx gx1 = gx.c(viewGroup1, du0.getParentFragmentManager());
                                    gv gv0 = gu.a(du0.P.getVisibility());
                                    ibuq.f(gv0, "finalState");
                                    if(fm.ar(2)) {
                                        Objects.toString(du0);
                                    }
                                    gx1.f(gv0, gt.b, this);
                                }
                            }
                            du0.f = 4;
                            break;
                        }
                        case 5: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            du0.C.noteStateNotSaved();
                            du0.C.ap(true);
                            du0.f = 5;
                            du0.N = false;
                            du0.onStart();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onStart()"));
                            }
                            du0.Z.f(lpe.ON_START);
                            if(du0.P != null) {
                                du0.aa.a(lpe.ON_START);
                            }
                            du0.C.J();
                            this.c.k(du0, false);
                            break;
                        }
                        case 6: {
                            du0.f = 6;
                            break;
                        }
                        case 7: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            View view0 = du0.S == null ? null : du0.S.t;
                            if(view0 != null) {
                                if(view0 != du0.P) {
                                    ViewParent viewParent0 = view0.getParent();
                                    while(viewParent0 != null) {
                                        if(viewParent0 == du0.P) {
                                            goto label_202;
                                        }
                                        viewParent0 = viewParent0.getParent();
                                    }
                                    goto label_207;
                                }
                            label_202:
                                view0.requestFocus();
                                if(fm.ar(2)) {
                                    Objects.toString(view0);
                                    Objects.toString(du0);
                                    Objects.toString(du0.P.findFocus());
                                }
                            }
                        label_207:
                            du0.jc(null);
                            du0.C.noteStateNotSaved();
                            du0.C.ap(true);
                            du0.f = 7;
                            du0.N = false;
                            du0.onResume();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onResume()"));
                            }
                            du0.Z.f(lpe.ON_RESUME);
                            if(du0.P != null) {
                                du0.aa.a(lpe.ON_RESUME);
                            }
                            du0.C.I();
                            this.c.i(du0, false);
                            this.d.a(du0.k, null);
                            du0.g = null;
                            du0.h = null;
                            du0.i = null;
                            break;
                        }
                    }
                }
                else {
                    switch(v2 - 1) {
                        case -1: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            du0.f = -1;
                            du0.N = false;
                            du0.onDetach();
                            du0.W = null;
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onDetach()"));
                            }
                            fm fm0 = du0.C;
                            if(!fm0.B) {
                                fm0.A();
                                du0.C = new fm();
                            }
                            this.c.e(du0, false);
                            du0.f = -1;
                            du0.B = null;
                            du0.D = null;
                            du0.A = null;
                            if(du0.r && !du0.kY() || this.d.d.f(du0)) {
                                if(fm.ar(3)) {
                                    Objects.toString(du0);
                                }
                                du0.iZ();
                                break;
                            }
                            break;
                        }
                        case 0: {
                            if(du0.t) {
                                fx fx0 = this.d;
                                if(((Bundle)fx0.c.get(du0.k)) == null) {
                                    fx0.a(du0.k, this.a());
                                }
                            }
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            boolean z1 = du0.r && !du0.kY();
                            if(z1 && !du0.t) {
                                this.d.a(du0.k, null);
                            }
                            if(!z1) {
                                fx fx1 = this.d;
                                if(!fx1.d.f(du0)) {
                                    String s1 = du0.n;
                                    if(s1 != null) {
                                        du du2 = fx1.b(s1);
                                        if(du2 != null && du2.J) {
                                            du0.m = du2;
                                        }
                                    }
                                    du0.f = 0;
                                    break;
                                }
                            }
                            eh eh0 = du0.B;
                            if((eh0 instanceof lsq)) {
                                z2 = this.d.d.f;
                            }
                            else {
                                Context context0 = eh0.c;
                                z2 = (context0 instanceof Activity) ? ((Activity)context0).isChangingConfigurations() ^ 1 : true;
                            }
                            if(z1 && !du0.t || z2) {
                                this.d.d.b(du0, false);
                            }
                            du0.C.A();
                            du0.Z.f(lpe.ON_DESTROY);
                            du0.f = 0;
                            du0.N = false;
                            du0.X = false;
                            du0.onDestroy();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onDestroy()"));
                            }
                            this.c.d(du0, false);
                            fx fx2 = this.d;
                            for(Object object1: fx2.e()) {
                                fv fv1 = (fv)object1;
                                if(fv1 != null) {
                                    du du3 = fv1.a;
                                    if(du0.k.equals(du3.n)) {
                                        du3.m = du0;
                                        du3.n = null;
                                    }
                                }
                            }
                            String s2 = du0.n;
                            if(s2 != null) {
                                du0.m = fx2.b(s2);
                            }
                            fx2.k(this);
                            break;
                        }
                        case 1: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            ViewGroup viewGroup2 = du0.O;
                            if(viewGroup2 != null) {
                                View view1 = du0.P;
                                if(view1 != null) {
                                    viewGroup2.removeView(view1);
                                }
                            }
                            du0.C.K(1);
                            if(du0.P != null && ((lpw)du0.aa.getLifecycle()).b.a(lpf.c)) {
                                du0.aa.a(lpe.ON_DESTROY);
                            }
                            du0.f = 1;
                            du0.N = false;
                            du0.onDestroyView();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onDestroyView()"));
                            }
                            bzt bzt0 = ((luu)lup.a(du0)).a.b;
                            int v5 = bzt0.c();
                            for(int v6 = 0; v6 < v5; ++v6) {
                                ((luq)bzt0.e(v6)).p();
                            }
                            du0.y = false;
                            this.c.n(du0, false);
                            du0.O = null;
                            du0.P = null;
                            du0.aa = null;
                            du0.ab.l(null);
                            du0.v = false;
                            du0.f = 1;
                            break;
                        }
                        case 2: {
                            du0.v = false;
                            du0.f = 2;
                            break;
                        }
                        case 3: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            if(du0.t) {
                                String s3 = du0.k;
                                Bundle bundle4 = this.a();
                                this.d.a(s3, bundle4);
                            }
                            else if(du0.P != null && du0.h == null) {
                                this.g();
                            }
                            if(du0.P != null) {
                                ViewGroup viewGroup3 = du0.O;
                                if(viewGroup3 != null) {
                                    gx gx2 = gx.c(viewGroup3, du0.getParentFragmentManager());
                                    if(fm.ar(2)) {
                                        Objects.toString(du0);
                                    }
                                    gx2.f(gv.a, gt.c, this);
                                }
                            }
                            du0.f = 3;
                            break;
                        }
                        case 4: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            du0.C.L();
                            if(du0.P != null) {
                                du0.aa.a(lpe.ON_STOP);
                            }
                            du0.Z.f(lpe.ON_STOP);
                            du0.f = 4;
                            du0.N = false;
                            du0.onStop();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onStop()"));
                            }
                            this.c.l(du0, false);
                            break;
                        }
                        case 5: {
                            du0.f = 5;
                            break;
                        }
                        case 6: {
                            if(fm.ar(3)) {
                                Objects.toString(du0);
                            }
                            du0.C.G();
                            if(du0.P != null) {
                                du0.aa.a(lpe.ON_PAUSE);
                            }
                            du0.Z.f(lpe.ON_PAUSE);
                            du0.f = 6;
                            du0.N = false;
                            du0.onPause();
                            if(!du0.N) {
                                throw new gy(a.i(du0, "Fragment ", " did not call through to super.onPause()"));
                            }
                            this.c.f(du0, false);
                        }
                    }
                }
                z = true;
                continue;
            }
            if(!z && v2 == -1 && du0.r && !du0.kY() && !du0.t) {
                if(fm.ar(3)) {
                    Objects.toString(du0);
                }
                this.d.d.b(du0, true);
                this.d.k(this);
                if(fm.ar(3)) {
                    Objects.toString(du0);
                }
                du0.iZ();
            }
            if(du0.V) {
                if(du0.P != null) {
                    ViewGroup viewGroup4 = du0.O;
                    if(viewGroup4 != null) {
                        gx gx3 = gx.c(viewGroup4, du0.getParentFragmentManager());
                        if(du0.H) {
                            if(fm.ar(2)) {
                                Objects.toString(du0);
                            }
                            gx3.f(gv.c, gt.a, this);
                        }
                        else {
                            if(fm.ar(2)) {
                                Objects.toString(du0);
                            }
                            gx3.f(gv.b, gt.a, this);
                        }
                    }
                }
                fm fm1 = du0.A;
                if(fm1 != null && du0.q && fm.aC(du0)) {
                    fm1.y = true;
                }
                du0.V = false;
                du0.onHiddenChanged(du0.H);
                du0.C.D();
            }
        }
        finally {
            this.e = false;
        }
    }

    final void f(ClassLoader classLoader0) {
        du du0 = this.a;
        Bundle bundle0 = du0.g;
        if(bundle0 != null) {
            bundle0.setClassLoader(classLoader0);
            if(du0.g.getBundle("savedInstanceState") == null) {
                du0.g.putBundle("savedInstanceState", new Bundle());
            }
            try {
                du0.h = du0.g.getSparseParcelableArray("viewState");
            }
            catch(BadParcelableException badParcelableException0) {
                Objects.toString(this.a);
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + this.a, badParcelableException0);
            }
            du du1 = this.a;
            du1.i = du1.g.getBundle("viewRegistryState");
            FragmentState fragmentState0 = (FragmentState)du1.g.getParcelable("state");
            if(fragmentState0 != null) {
                du1.n = fragmentState0.m;
                du1.o = fragmentState0.n;
                Boolean boolean0 = du1.j;
                if(boolean0 == null) {
                    du1.R = fragmentState0.o;
                }
                else {
                    du1.R = boolean0.booleanValue();
                    du1.j = null;
                }
            }
            if(!du1.R) {
                du1.Q = true;
            }
        }
    }

    final void g() {
        du du0 = this.a;
        if(du0.P != null) {
            if(fm.ar(2)) {
                Objects.toString(du0);
                Objects.toString(du0.P);
            }
            SparseArray sparseArray0 = new SparseArray();
            du0.P.saveHierarchyState(sparseArray0);
            if(sparseArray0.size() > 0) {
                du0.h = sparseArray0;
            }
            Bundle bundle0 = new Bundle();
            du0.aa.b.c(bundle0);
            if(!bundle0.isEmpty()) {
                du0.i = bundle0;
            }
        }
    }
}

