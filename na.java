import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class na implements jyb {
    public final Context a;
    public my b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public boolean h;
    public nd i;
    public boolean j;
    public boolean k;
    private static final int[] l;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private final CopyOnWriteArrayList y;

    static {
        na.l = new int[]{1, 4, 5, 3, 2, 0};
    }

    public na(Context context0) {
        boolean z = false;
        this.t = 0;
        this.h = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = new ArrayList();
        this.y = new CopyOnWriteArrayList();
        this.j = false;
        this.a = context0;
        Resources resources0 = context0.getResources();
        this.m = resources0;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        if(resources0.getConfiguration().keyboard != 1 && ViewConfiguration.get(context0).shouldShowMenuShortcutsWhenKeyboardPresent()) {
            z = true;
        }
        this.o = z;
    }

    public boolean A() {
        return this.o;
    }

    public final boolean B(MenuItem menuItem0, int v) {
        return this.C(menuItem0, null, v);
    }

    public final boolean C(MenuItem menuItem0, nn nn0, int v) {
        int v2;
        if(((nd)menuItem0) != null && ((nd)menuItem0).isEnabled()) {
            int v1 = ((nd)menuItem0).n();
            kdm kdm0 = ((nd)menuItem0).o;
            boolean z = kdm0 != null && kdm0.c();
            if(((nd)menuItem0).m()) {
                boolean z1 = ((nd)menuItem0).expandActionView() | v1;
                if(!z1) {
                    return z1;
                }
                this.i(true);
                return true;
            }
            if(!((nd)menuItem0).hasSubMenu() && !z) {
                if((v & 1) != 0) {
                    return v1 != 0;
                }
                this.i(true);
                return v1 != 0;
            }
            if((v & 4) == 0) {
                this.i(false);
            }
            if(!((nd)menuItem0).hasSubMenu()) {
                ((nd)menuItem0).l(new nv(this.a, this, ((nd)menuItem0)));
            }
            nv nv0 = ((nd)menuItem0).k;
            if(z) {
                kdm0.b(nv0);
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
            if(copyOnWriteArrayList0.isEmpty()) {
                v2 = 0;
            }
            else {
                v2 = nn0 == null ? 0 : nn0.h(nv0);
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    nn nn1 = (nn)weakReference0.get();
                    if(nn1 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        if(v2 != 0) {
                            continue;
                        }
                        v2 = nn1.h(nv0);
                    }
                }
            }
            boolean z2 = v1 | v2;
            if(z2) {
                return z2;
            }
            this.i(true);
        }
        return false;
    }

    final void D() {
        this.s = true;
        this.n(true);
    }

    final void E() {
        this.q = true;
        this.n(true);
    }

    public final void F() {
        this.t = 1;
    }

    private final void G(int v, boolean z) {
        if(v >= 0) {
            ArrayList arrayList0 = this.c;
            if(v < arrayList0.size()) {
                arrayList0.remove(v);
                if(z) {
                    this.n(true);
                }
            }
        }
    }

    public na a() {
        return this;
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v) {
        return this.c(0, 0, 0, this.m.getString(v));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, int v3) {
        return this.c(v, v1, v2, this.m.getString(v3));
    }

    @Override  // android.view.Menu
    public final MenuItem add(int v, int v1, int v2, CharSequence charSequence0) {
        return this.c(v, v1, v2, charSequence0);
    }

    @Override  // android.view.Menu
    public final MenuItem add(CharSequence charSequence0) {
        return this.c(0, 0, 0, charSequence0);
    }

    @Override  // android.view.Menu
    public final int addIntentOptions(int v, int v1, int v2, ComponentName componentName0, Intent[] arr_intent, Intent intent0, int v3, MenuItem[] arr_menuItem) {
        PackageManager packageManager0 = this.a.getPackageManager();
        List list0 = packageManager0.queryIntentActivityOptions(componentName0, arr_intent, intent0, 0);
        int v5 = list0 == null ? 0 : list0.size();
        if((v3 & 1) == 0) {
            this.removeGroup(v);
        }
        for(int v4 = 0; v4 < v5; ++v4) {
            ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(v4);
            Intent intent1 = new Intent((resolveInfo0.specificIndex >= 0 ? arr_intent[resolveInfo0.specificIndex] : intent0));
            intent1.setComponent(new ComponentName(resolveInfo0.activityInfo.applicationInfo.packageName, resolveInfo0.activityInfo.name));
            MenuItem menuItem0 = this.c(v, v1, v2, resolveInfo0.loadLabel(packageManager0));
            menuItem0.setIcon(resolveInfo0.loadIcon(packageManager0));
            ((nd)menuItem0).e = intent1;
            if(arr_menuItem != null && resolveInfo0.specificIndex >= 0) {
                arr_menuItem[resolveInfo0.specificIndex] = menuItem0;
            }
        }
        return v5;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v) {
        return this.addSubMenu(0, 0, 0, this.m.getString(v));
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(int v, int v1, int v2, int v3) {
        return this.addSubMenu(v, v1, v2, this.m.getString(v3));
    }

    @Override  // android.view.Menu
    public SubMenu addSubMenu(int v, int v1, int v2, CharSequence charSequence0) {
        nd nd0 = (nd)this.c(v, v1, v2, charSequence0);
        SubMenu subMenu0 = new nv(this.a, this, nd0);
        nd0.l(((nv)subMenu0));
        return subMenu0;
    }

    @Override  // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence0) {
        return this.addSubMenu(0, 0, 0, charSequence0);
    }

    final nd b(int v, KeyEvent keyEvent0) {
        ArrayList arrayList0 = this.x;
        arrayList0.clear();
        this.l(arrayList0, v, keyEvent0);
        if(arrayList0.isEmpty()) {
            return null;
        }
        int v1 = keyEvent0.getMetaState();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        keyEvent0.getKeyData(keyCharacterMap$KeyData0);
        int v2 = arrayList0.size();
        if(v2 == 1) {
            return (nd)arrayList0.get(0);
        }
        boolean z = this.z();
        for(int v3 = 0; v3 < v2; ++v3) {
            nd nd0 = (nd)arrayList0.get(v3);
            int v4 = z ? nd0.h : nd0.f;
            if(v4 == keyCharacterMap$KeyData0.meta[0] && (v1 & 2) == 0 || v4 == keyCharacterMap$KeyData0.meta[2] && (v1 & 2) != 0 || z && v4 == 8 && v == 67) {
                return nd0;
            }
        }
        return null;
    }

    public MenuItem c(int v, int v1, int v2, CharSequence charSequence0) {
        if(v2 >> 16 < 0 || v2 >> 16 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int v3 = 0;
        int v4 = this.t;
        int v5 = na.l[v2 >> 16] << 16 | ((char)v2);
        MenuItem menuItem0 = new nd(this, v, v1, v2, v5, charSequence0, v4);
        ArrayList arrayList0 = this.c;
        int v6 = arrayList0.size();
        while(true) {
            --v6;
            if(v6 < 0) {
                break;
            }
            if(((nd)arrayList0.get(v6)).c <= v5) {
                v3 = v6 + 1;
                break;
            }
        }
        arrayList0.add(v3, menuItem0);
        this.n(true);
        return menuItem0;
    }

    @Override  // android.view.Menu
    public final void clear() {
        nd nd0 = this.i;
        if(nd0 != null) {
            this.v(nd0);
        }
        this.c.clear();
        this.n(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        this.n(false);
    }

    @Override  // android.view.Menu
    public final void close() {
        this.i(true);
    }

    // String Decryptor: 2 succeeded, 0 failed
    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        this.m();
        return this.r;
    }

    public final ArrayList f() {
        if(!this.q) {
            return this.p;
        }
        ArrayList arrayList0 = this.p;
        arrayList0.clear();
        ArrayList arrayList1 = this.c;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            nd nd0 = (nd)arrayList1.get(v1);
            if(nd0.isVisible()) {
                arrayList0.add(nd0);
            }
        }
        this.q = false;
        this.s = true;
        return arrayList0;
    }

    @Override  // android.view.Menu
    public final MenuItem findItem(int v) {
        int v1 = this.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            MenuItem menuItem0 = (nd)this.c.get(v2);
            if(menuItem0.a == v) {
                return menuItem0;
            }
            if(((nd)menuItem0).hasSubMenu()) {
                MenuItem menuItem1 = menuItem0.k.findItem(v);
                if(menuItem1 != null) {
                    return menuItem1;
                }
            }
        }
        return null;
    }

    public final void g(nn nn0) {
        this.h(nn0, this.a);
    }

    @Override  // android.view.Menu
    public final MenuItem getItem(int v) {
        return (MenuItem)this.c.get(v);
    }

    public final void h(nn nn0, Context context0) {
        WeakReference weakReference0 = new WeakReference(nn0);
        this.y.add(weakReference0);
        nn0.c(context0, this);
        this.s = true;
    }

    @Override  // android.view.Menu
    public final boolean hasVisibleItems() {
        if(this.k) {
            return true;
        }
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((nd)this.c.get(v1)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if(this.w) {
            return;
        }
        this.w = true;
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            nn nn0 = (nn)weakReference0.get();
            if(nn0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                nn0.d(this, z);
            }
        }
        this.w = false;
    }

    @Override  // android.view.Menu
    public final boolean isShortcutKey(int v, KeyEvent keyEvent0) {
        return this.b(v, keyEvent0) != null;
    }

    public final void j(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:presenters");
        if(sparseArray0 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
            if(!copyOnWriteArrayList0.isEmpty()) {
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    nn nn0 = (nn)weakReference0.get();
                    if(nn0 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        int v = nn0.a();
                        if(v <= 0) {
                            continue;
                        }
                        Parcelable parcelable0 = (Parcelable)sparseArray0.get(v);
                        if(parcelable0 == null) {
                            continue;
                        }
                        nn0.n(parcelable0);
                    }
                }
            }
        }
    }

    public final void k(Bundle bundle0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        if(copyOnWriteArrayList0.isEmpty()) {
            return;
        }
        SparseArray sparseArray0 = new SparseArray();
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            nn nn0 = (nn)weakReference0.get();
            if(nn0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                int v = nn0.a();
                if(v <= 0) {
                    continue;
                }
                Parcelable parcelable0 = nn0.dA();
                if(parcelable0 == null) {
                    continue;
                }
                sparseArray0.put(v, parcelable0);
            }
        }
        bundle0.putSparseParcelableArray("android:menu:presenters", sparseArray0);
    }

    final void l(List list0, int v, KeyEvent keyEvent0) {
        boolean z = this.z();
        int v1 = keyEvent0.getModifiers();
        KeyCharacterMap.KeyData keyCharacterMap$KeyData0 = new KeyCharacterMap.KeyData();
        if(keyEvent0.getKeyData(keyCharacterMap$KeyData0)) {
        label_6:
            ArrayList arrayList0 = this.c;
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                nd nd0 = (nd)arrayList0.get(v3);
                if(nd0.hasSubMenu()) {
                    nd0.k.l(list0, v, keyEvent0);
                }
                int v4 = z ? nd0.h : nd0.f;
                if((v1 & 0x1100F) == ((z ? nd0.i : nd0.g) & 0x1100F) && v4 != 0 && (v4 == keyCharacterMap$KeyData0.meta[0] || v4 == keyCharacterMap$KeyData0.meta[2] || z && v4 == 8 && v == 67) && nd0.isEnabled()) {
                    list0.add(nd0);
                }
            }
        }
        else if(v == 67) {
            v = 67;
            goto label_6;
        }
    }

    public final void m() {
        ArrayList arrayList0 = this.f();
        if(!this.s) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        int v = 0;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            nn nn0 = (nn)weakReference0.get();
            if(nn0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                v |= nn0.g();
            }
        }
        if(v == 0) {
            this.d.clear();
            this.r.clear();
            ArrayList arrayList3 = this.f();
            this.r.addAll(arrayList3);
        }
        else {
            ArrayList arrayList1 = this.d;
            arrayList1.clear();
            ArrayList arrayList2 = this.r;
            arrayList2.clear();
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                nd nd0 = (nd)arrayList0.get(v2);
                if(nd0.o()) {
                    arrayList1.add(nd0);
                }
                else {
                    arrayList2.add(nd0);
                }
            }
        }
        this.s = false;
    }

    public void n(boolean z) {
        boolean z1 = true;
        if(this.h) {
            this.u = true;
            if(z) {
                this.v = true;
            }
        }
        else {
            if(z) {
                this.q = true;
                this.s = true;
            }
            else {
                z1 = false;
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
            if(!copyOnWriteArrayList0.isEmpty()) {
                this.u();
                for(Object object0: copyOnWriteArrayList0) {
                    WeakReference weakReference0 = (WeakReference)object0;
                    nn nn0 = (nn)weakReference0.get();
                    if(nn0 == null) {
                        copyOnWriteArrayList0.remove(weakReference0);
                    }
                    else {
                        nn0.f(z1);
                    }
                }
                this.t();
            }
        }
    }

    public final void o(nn nn0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            nn nn1 = (nn)weakReference0.get();
            if(nn1 == null || nn1 == nn0) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
        }
    }

    public final void p(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:actionviewstates");
        int v = this.size();
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                view0.restoreHierarchyState(sparseArray0);
            }
            if(menuItem0.hasSubMenu()) {
                ((nv)menuItem0.getSubMenu()).p(bundle0);
            }
        }
        int v2 = bundle0.getInt("android:menu:expandedactionview");
        if(v2 > 0) {
            MenuItem menuItem1 = this.findItem(v2);
            if(menuItem1 != null) {
                menuItem1.expandActionView();
            }
        }
    }

    @Override  // android.view.Menu
    public final boolean performIdentifierAction(int v, int v1) {
        return this.B(this.findItem(v), v1);
    }

    @Override  // android.view.Menu
    public final boolean performShortcut(int v, KeyEvent keyEvent0, int v1) {
        nd nd0 = this.b(v, keyEvent0);
        boolean z = nd0 == null ? false : this.B(nd0, v1);
        if((v1 & 2) != 0) {
            this.i(true);
        }
        return z;
    }

    public final void q(Bundle bundle0) {
        int v = this.size();
        SparseArray sparseArray0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            MenuItem menuItem0 = this.getItem(v1);
            View view0 = menuItem0.getActionView();
            if(view0 != null && view0.getId() != -1) {
                if(sparseArray0 == null) {
                    sparseArray0 = new SparseArray();
                }
                view0.saveHierarchyState(sparseArray0);
                if(menuItem0.isActionViewExpanded()) {
                    bundle0.putInt("android:menu:expandedactionview", menuItem0.getItemId());
                }
            }
            if(menuItem0.hasSubMenu()) {
                ((nv)menuItem0.getSubMenu()).q(bundle0);
            }
        }
        if(sparseArray0 != null) {
            bundle0.putSparseParcelableArray("android:menu:actionviewstates", sparseArray0);
        }
    }

    public void r(my my0) {
        this.b = my0;
    }

    @Override  // android.view.Menu
    public final void removeGroup(int v) {
        int v1 = this.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            if(((nd)this.c.get(v2)).b == v) {
                break;
            }
        }
        if(v2 >= 0) {
            ArrayList arrayList0 = this.c;
            int v3 = arrayList0.size() - v2;
            for(int v4 = 0; v4 < v3 && ((nd)arrayList0.get(v2)).b == v; ++v4) {
                this.G(v2, false);
            }
            this.n(true);
        }
    }

    @Override  // android.view.Menu
    public final void removeItem(int v) {
        int v1 = this.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            if(((nd)this.c.get(v2)).a == v) {
                break;
            }
        }
        this.G(v2, true);
    }

    public final void s(int v, CharSequence charSequence0, int v1, Drawable drawable0, View view0) {
        if(view0 == null) {
            if(v > 0) {
                this.e = this.m.getText(v);
            }
            else if(charSequence0 != null) {
                this.e = charSequence0;
            }
            if(v1 > 0) {
                this.f = this.a.getDrawable(v1);
            }
            else if(drawable0 != null) {
                this.f = drawable0;
            }
            this.g = null;
        }
        else {
            this.g = view0;
            this.e = null;
            this.f = null;
        }
        this.n(false);
    }

    @Override  // android.view.Menu
    public final void setGroupCheckable(int v, boolean z, boolean z1) {
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            nd nd0 = (nd)arrayList0.get(v2);
            if(nd0.b == v) {
                nd0.j(z1);
                nd0.setCheckable(z);
            }
        }
    }

    @Override  // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.j = z;
    }

    @Override  // android.view.Menu
    public final void setGroupEnabled(int v, boolean z) {
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            nd nd0 = (nd)arrayList0.get(v2);
            if(nd0.b == v) {
                nd0.setEnabled(z);
            }
        }
    }

    @Override  // android.view.Menu
    public final void setGroupVisible(int v, boolean z) {
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        boolean z1 = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            nd nd0 = (nd)arrayList0.get(v2);
            if(nd0.b == v && nd0.s(z)) {
                z1 = true;
            }
        }
        if(z1) {
            this.n(true);
        }
    }

    @Override  // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        this.n(false);
    }

    @Override  // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public final void t() {
        this.h = false;
        if(this.u) {
            this.u = false;
            this.n(this.v);
        }
    }

    public final void u() {
        if(!this.h) {
            this.h = true;
            this.u = false;
            this.v = false;
        }
    }

    public boolean v(nd nd0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        boolean z = false;
        if(!copyOnWriteArrayList0.isEmpty() && this.i == nd0) {
            this.u();
            for(Object object0: copyOnWriteArrayList0) {
                WeakReference weakReference0 = (WeakReference)object0;
                nn nn0 = (nn)weakReference0.get();
                if(nn0 == null) {
                    copyOnWriteArrayList0.remove(weakReference0);
                }
                else {
                    z = nn0.i(nd0);
                    if(z) {
                        break;
                    }
                }
            }
            this.t();
            if(z) {
                this.i = null;
            }
        }
        return z;
    }

    public boolean w(na na0, MenuItem menuItem0) {
        return this.b != null && this.b.U(na0, menuItem0);
    }

    public boolean x(nd nd0) {
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.y;
        boolean z = false;
        if(copyOnWriteArrayList0.isEmpty()) {
            return false;
        }
        this.u();
        for(Object object0: copyOnWriteArrayList0) {
            WeakReference weakReference0 = (WeakReference)object0;
            nn nn0 = (nn)weakReference0.get();
            if(nn0 == null) {
                copyOnWriteArrayList0.remove(weakReference0);
            }
            else {
                z = nn0.j(nd0);
                if(z) {
                    break;
                }
            }
        }
        this.t();
        if(z) {
            this.i = nd0;
        }
        return z;
    }

    public boolean y() {
        return this.j;
    }

    public boolean z() {
        return this.n;
    }
}

