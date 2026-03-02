import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

public final class ca extends fz implements fh {
    public final fm a;
    boolean b;
    public int c;
    boolean d;

    public ca(ca ca0) {
        eh eh0 = ca0.a.q;
        ClassLoader classLoader0 = eh0 == null ? null : eh0.c.getClassLoader();
        super(ca0.a.l(), classLoader0);
        ArrayList arrayList0 = ca0.e;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fy fy0 = new fy(((fy)arrayList0.get(v1)));
            this.e.add(fy0);
        }
        this.f = ca0.f;
        this.g = ca0.g;
        this.h = ca0.h;
        this.i = ca0.i;
        this.j = ca0.j;
        this.k = ca0.k;
        this.l = ca0.l;
        this.m = ca0.m;
        this.p = ca0.p;
        this.q = ca0.q;
        this.n = ca0.n;
        this.o = ca0.o;
        if(ca0.r != null) {
            this.r = new ArrayList();
            this.r.addAll(ca0.r);
        }
        if(ca0.s != null) {
            this.s = new ArrayList();
            this.s.addAll(ca0.s);
        }
        this.t = ca0.t;
        this.c = -1;
        this.d = false;
        this.a = ca0.a;
        this.b = ca0.b;
        this.c = ca0.c;
        this.d = ca0.d;
    }

    public ca(fm fm0) {
        super(fm0.l(), (fm0.q == null ? null : fm0.q.c.getClassLoader()));
        this.c = -1;
        this.d = false;
        this.a = fm0;
    }

    @Override  // fz
    public final int a() {
        return this.c(false, true);
    }

    @Override  // fz
    public final int b() {
        return this.c(true, true);
    }

    final int c(boolean z, boolean z1) {
        if(this.b) {
            throw new IllegalStateException("commit already called");
        }
        if(fm.ar(2)) {
            PrintWriter printWriter0 = new PrintWriter(new gn());
            this.i("  ", printWriter0);
            printWriter0.close();
        }
        this.b = true;
        this.c = this.k ? this.a.i.getAndIncrement() : -1;
        if(z1) {
            this.a.O(this, z);
        }
        return this.c;
    }

    final void d(int v) {
        if(this.k) {
            boolean z = !fm.ar(2);
            ArrayList arrayList0 = this.e;
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                fy fy0 = (fy)arrayList0.get(v2);
                du du0 = fy0.b;
                if(du0 != null) {
                    du0.z += v;
                    if(fm.ar(2)) {
                        Objects.toString(fy0.b);
                    }
                }
            }
        }
    }

    final void e() {
        int v1;
        ArrayList arrayList0 = this.e;
        int v = arrayList0.size();
    alab1:
        while(true) {
            while(true) {
                --v;
                if(v < 0) {
                    break alab1;
                }
                fy fy0 = (fy)arrayList0.get(v);
                if(!fy0.c) {
                    continue alab1;
                }
                v1 = v - 1;
                if(fy0.a == 8) {
                    fy0.c = false;
                    arrayList0.remove(v1);
                    v = v1;
                }
                else {
                    int v2 = fy0.b.F;
                    fy0.a = 2;
                    fy0.c = false;
                label_15:
                    if(v1 >= 0) {
                        break;
                    }
                }
            }
            fy fy1 = (fy)arrayList0.get(v1);
            if(fy1.c && fy1.b.F == v2) {
                arrayList0.remove(v1);
                --v;
            }
            --v1;
            goto label_15;
        }
    }

    @Override  // fz
    public final void f() {
        this.y();
        this.a.P(this, false);
    }

    @Override  // fz
    public final void g() {
        this.y();
        this.a.P(this, true);
    }

    @Override  // fz
    public final void h(int v, du du0, String s, int v1) {
        String s1 = du0.mPreviousWho;
        if(s1 != null) {
            lln.a(du0, s1);
        }
        Class class0 = du0.getClass();
        int v2 = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v2) || class0.isMemberClass() && !Modifier.isStatic(v2)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(du0.G != null && !s.equals(du0.G)) {
                throw new IllegalStateException("Can\'t change tag of fragment " + du0 + ": was " + du0.G + " now " + s);
            }
            du0.G = s;
        }
        switch(v) {
            case -1: {
                throw new IllegalArgumentException("Can\'t add fragment " + du0 + " with tag " + s + " to container view with no id");
            }
            case 0: {
                break;
            }
            default: {
                if(du0.E != 0 && du0.E != v) {
                    throw new IllegalStateException("Can\'t change container ID of fragment " + du0 + ": was " + du0.E + " now " + v);
                }
                du0.E = v;
                du0.F = v;
            }
        }
        this.s(new fy(v1, du0));
        du0.A = this.a;
    }

    public final void i(String s, PrintWriter printWriter0) {
        this.j(s, printWriter0, true);
    }

    public final void j(String s, PrintWriter printWriter0, boolean z) {
        String s1;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.m);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.c);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.b);
            if(this.j != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.j));
            }
            if(this.f != 0 || this.g != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.f));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.g));
            }
            if(this.h != 0 || this.i != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.h));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.i));
            }
            if(this.n != 0 || this.o != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.n));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.o);
            }
            if(this.p != 0 || this.q != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.p));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.q);
            }
        }
        ArrayList arrayList0 = this.e;
        if(!arrayList0.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                fy fy0 = (fy)arrayList0.get(v1);
                switch(fy0.a) {
                    case 0: {
                        s1 = "NULL";
                        break;
                    }
                    case 1: {
                        s1 = "ADD";
                        break;
                    }
                    case 2: {
                        s1 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s1 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s1 = "HIDE";
                        break;
                    }
                    case 5: {
                        s1 = "SHOW";
                        break;
                    }
                    case 6: {
                        s1 = "DETACH";
                        break;
                    }
                    case 7: {
                        s1 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s1 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s1 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s1 = "cmd=" + fy0.a;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s1);
                printWriter0.print(" ");
                printWriter0.println(fy0.b);
                if(z) {
                    if(fy0.d != 0 || fy0.e != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(fy0.d));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(fy0.e));
                    }
                    if(fy0.f != 0 || fy0.g != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(fy0.f));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(fy0.g));
                    }
                }
            }
        }
    }

    @Override  // fh
    public final boolean k(ArrayList arrayList0, ArrayList arrayList1) {
        boolean z = !fm.ar(2);
        arrayList0.add(this);
        arrayList1.add(Boolean.valueOf(false));
        if(this.k) {
            this.a.c.add(this);
        }
        return true;
    }

    @Override  // fz
    public final boolean l() {
        return this.e.isEmpty();
    }

    @Override  // fz
    public final void m(du du0) {
        if(du0.A != null && du0.A != this.a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + du0.toString() + " is already attached to a FragmentManager.");
        }
        this.s(new fy(6, du0));
    }

    @Override  // fz
    public final void n(du du0) {
        if(du0.A != null && du0.A != this.a) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + du0.toString() + " is already attached to a FragmentManager.");
        }
        this.s(new fy(4, du0));
    }

    @Override  // fz
    public final void o(du du0) {
        if(du0.A != null && du0.A != this.a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + du0.toString() + " is already attached to a FragmentManager.");
        }
        this.s(new fy(3, du0));
    }

    @Override  // fz
    public final void p(du du0, lpf lpf0) {
        fm fm0 = this.a;
        if(du0.A == fm0) {
            if(lpf0 == lpf.b && du0.f >= 0) {
                throw new IllegalArgumentException(a.i(lpf0, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
            }
            if(lpf0 == lpf.a) {
                throw new IllegalArgumentException(a.i(lpf0, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
            }
            this.s(new fy(du0, lpf0));
            return;
        }
        Objects.toString(fm0);
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fm0.toString());
    }

    @Override  // fz
    public final void q(du du0) {
        if(du0 != null && (du0.A != null && du0.A != this.a)) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + du0.toString() + " is already attached to a FragmentManager.");
        }
        this.s(new fy(8, du0));
    }

    @Override  // fz
    public final void r(du du0) {
        if(du0.A != null && du0.A != this.a) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + du0.toString() + " is already attached to a FragmentManager.");
        }
        this.s(new fy(5, du0));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.c >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.c);
        }
        if(this.m != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.m);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }
}

