import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class aao extends gz implements aau, abf, aco, acx, jvs, jvt, jwj, jwk, kdt, loz, lps, lsq, nzd, orl {
    private final kdw a;
    private final ork b;
    private lsp c;
    private final ibnn d;
    private final AtomicInteger e;
    public final ack g;
    public final acw h;
    public final CopyOnWriteArrayList i;
    public final aak j;
    private final CopyOnWriteArrayList k;
    private final CopyOnWriteArrayList l;
    private final CopyOnWriteArrayList m;
    private final CopyOnWriteArrayList n;
    private final CopyOnWriteArrayList o;
    private boolean p;
    private boolean q;
    private final ibnn r;
    private final ibnn s;
    private final ibnn t;

    public aao() {
        this.g = new ack();
        this.a = new kdw(new zv(this));
        ork ork0 = orj.a(this);
        this.b = ork0;
        this.j = new aak(this);
        this.d = new ibnz(new zy(this));
        this.e = new AtomicInteger();
        this.h = new aan(this);
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.r = new ibnz(new zz(this));
        lpw lpw0 = this.f;
        if(lpw0 == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        lpw0.c(new aaa(this));
        aab aab0 = new aab(this);
        this.f.c(aab0);
        aah aah0 = new aah(this);
        this.f.c(aah0);
        ork0.a();
        lrm.c(this);
        this.getSavedStateRegistry().b("android:support:activity-result", new aac(this));
        this.i(new aad(this));
        this.s = new ibnz(new aae(this));
        this.t = new ibnz(new aaf(this));
    }

    @Override  // android.app.Activity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        View view1 = this.getWindow().getDecorView();
        ibuq.e(view1, "getDecorView(...)");
        this.j.a(view1);
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // kdt
    public final void addMenuProvider(kdz kdz0) {
        ibuq.f(kdz0, "provider");
        this.a.a(kdz0);
    }

    @Override  // jwj
    public final void addOnConfigurationChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.k.add(kar0);
    }

    @Override  // jvs
    public final void addOnMultiWindowModeChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.m.add(kar0);
    }

    @Override  // jvt
    public final void addOnPictureInPictureModeChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.n.add(kar0);
    }

    @Override  // jwk
    public final void addOnTrimMemoryListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.l.add(kar0);
    }

    public final aat g() {
        return (aat)this.d.a();
    }

    @Override  // acx
    public final acw getActivityResultRegistry() {
        return this.h;
    }

    @Override  // loz
    public final ltx getDefaultViewModelCreationExtras() {
        Bundle bundle0 = null;
        ltx ltx0 = new lua(null);
        if(this.getApplication() != null) {
            Application application0 = this.getApplication();
            ((lua)ltx0).b(lsg.b, application0);
        }
        ((lua)ltx0).b(lrm.a, this);
        ((lua)ltx0).b(lrm.b, this);
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            bundle0 = intent0.getExtras();
        }
        if(bundle0 != null) {
            ((lua)ltx0).b(lrm.c, bundle0);
        }
        return ltx0;
    }

    @Override  // loz
    public final lsk getDefaultViewModelProviderFactory() {
        return (lsk)this.s.a();
    }

    @Override  // abf
    public final abc getOnBackPressedDispatcher() {
        return (abc)this.t.a();
    }

    @Override  // orl
    public final orh getSavedStateRegistry() {
        return this.b.a;
    }

    @Override  // lsq
    public final lsp getViewModelStore() {
        if(this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        }
        this.j();
        lsp lsp0 = this.c;
        ibuq.c(lsp0);
        return lsp0;
    }

    public final void h(abc abc0) {
        aag aag0 = new aag(abc0, this);
        this.f.c(aag0);
    }

    public final void i(acl acl0) {
        this.g.a(acl0);
    }

    public final void j() {
        if(this.c == null) {
            aai aai0 = (aai)this.getLastNonConfigurationInstance();
            if(aai0 != null) {
                this.c = aai0.a;
            }
            if(this.c == null) {
                this.c = new lsp();
            }
        }
    }

    public final void k() {
        View view0 = this.getWindow().getDecorView();
        ibuq.e(view0, "getDecorView(...)");
        lsr.b(view0, this);
        View view1 = this.getWindow().getDecorView();
        ibuq.e(view1, "getDecorView(...)");
        lss.b(view1, this);
        View view2 = this.getWindow().getDecorView();
        ibuq.e(view2, "getDecorView(...)");
        oro.b(view2, this);
        View view3 = this.getWindow().getDecorView();
        ibuq.e(view3, "getDecorView(...)");
        abh.a(view3, this);
        View view4 = this.getWindow().getDecorView();
        ibuq.e(view4, "getDecorView(...)");
        abg.a(view4, this);
        View view5 = this.getWindow().getDecorView();
        ibuq.e(view5, "getDecorView(...)");
        nzq.a(view5, this);
    }

    public static final void l(aao aao0) {
        try {
            aao0.super.onBackPressed();
        }
        catch(IllegalStateException illegalStateException0) {
            if(!ibuq.m(illegalStateException0.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw illegalStateException0;
            }
        }
        catch(NullPointerException nullPointerException0) {
            if(!ibuq.m(nullPointerException0.getMessage(), "Attempt to invoke virtual method \'android.os.Handler android.app.FragmentHostCallback.getHandler()\' on a null object reference")) {
                throw nullPointerException0;
            }
        }
    }

    @Override  // android.app.Activity
    @ibni
    protected void onActivityResult(int v, int v1, Intent intent0) {
        if(!this.h.g(v, v1, intent0)) {
            super.onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Activity
    @ibni
    public final void onBackPressed() {
        ((nzg)this.r.a()).a();
    }

    @Override  // android.app.Activity
    public void onConfigurationChanged(Configuration configuration0) {
        ibuq.f(configuration0, "newConfig");
        super.onConfigurationChanged(configuration0);
        Iterator iterator0 = this.k.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((kar)object0).accept(configuration0);
        }
    }

    @Override  // gz
    protected void onCreate(Bundle bundle0) {
        this.b.b(bundle0);
        this.g.c(this);
        super.onCreate(bundle0);
        lqz.b(this);
    }

    @Override  // android.app.Activity
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        ibuq.f(menu0, "menu");
        if(v == 0) {
            super.onCreatePanelMenu(0, menu0);
            MenuInflater menuInflater0 = this.getMenuInflater();
            this.a.b(menu0, menuInflater0);
        }
        return true;
    }

    @Override  // android.app.Activity
    public boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        ibuq.f(menuItem0, "item");
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        return v == 0 ? this.a.f(menuItem0) : false;
    }

    @Override  // android.app.Activity
    @ibni
    public final void onMultiWindowModeChanged(boolean z) {
        if(!this.p) {
            Iterator iterator0 = this.m.iterator();
            ibuq.e(iterator0, "iterator(...)");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ((kar)object0).accept(new jtz(z));
            }
        }
    }

    @Override  // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration0) {
        ibuq.f(configuration0, "newConfig");
        this.p = true;
        try {
            super.onMultiWindowModeChanged(z, configuration0);
        }
        finally {
            this.p = false;
        }
        Iterator iterator0 = this.m.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((kar)object0).accept(new jtz(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    protected void onNewIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        super.onNewIntent(intent0);
        Iterator iterator0 = this.i.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((kar)object0).accept(intent0);
        }
    }

    @Override  // android.app.Activity
    public final void onPanelClosed(int v, Menu menu0) {
        ibuq.f(menu0, "menu");
        this.a.c(menu0);
        super.onPanelClosed(v, menu0);
    }

    @Override  // android.app.Activity
    @ibni
    public final void onPictureInPictureModeChanged(boolean z) {
        if(!this.q) {
            Iterator iterator0 = this.n.iterator();
            ibuq.e(iterator0, "iterator(...)");
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ((kar)object0).accept(new jvy(z));
            }
        }
    }

    @Override  // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration0) {
        ibuq.f(configuration0, "newConfig");
        this.q = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration0);
        }
        finally {
            this.q = false;
        }
        Iterator iterator0 = this.n.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((kar)object0).accept(new jvy(z, configuration0));
        }
    }

    @Override  // android.app.Activity
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        ibuq.f(menu0, "menu");
        if(v == 0) {
            super.onPreparePanel(0, view0, menu0);
            this.a.d(menu0);
        }
        return true;
    }

    @Override  // android.app.Activity
    @ibni
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        ibuq.f(arr_s, "permissions");
        ibuq.f(arr_v, "grantResults");
        Intent intent0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arr_v);
        if(!this.h.g(v, -1, intent0)) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
        }
    }

    @Override  // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        lsp lsp0 = this.c;
        if(lsp0 == null) {
            aai aai0 = (aai)this.getLastNonConfigurationInstance();
            if(aai0 != null) {
                lsp0 = aai0.a;
            }
        }
        if(lsp0 == null) {
            return null;
        }
        Object object0 = new aai();
        object0.a = lsp0;
        return object0;
    }

    @Override  // gz
    protected void onSaveInstanceState(Bundle bundle0) {
        ibuq.f(bundle0, "outState");
        lpw lpw0 = this.f;
        if((lpw0 instanceof lpw)) {
            ibuq.d(lpw0, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            lpw0.g(lpf.c);
        }
        super.onSaveInstanceState(bundle0);
        this.b.c(bundle0);
    }

    @Override  // android.app.Activity
    public final void onTrimMemory(int v) {
        super.onTrimMemory(v);
        Iterator iterator0 = this.l.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((kar)object0).accept(Integer.valueOf(v));
        }
    }

    @Override  // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator iterator0 = this.o.iterator();
        ibuq.e(iterator0, "iterator(...)");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            ((Runnable)object0).run();
        }
    }

    @Override  // aco
    public final acp registerForActivityResult(adc adc0, acn acn0) {
        ibuq.f(this.h, "registry");
        return this.h.c("activity_rq#" + this.e.getAndIncrement(), this, adc0, acn0);
    }

    @Override  // kdt
    public final void removeMenuProvider(kdz kdz0) {
        ibuq.f(kdz0, "provider");
        this.a.e(kdz0);
    }

    @Override  // jwj
    public final void removeOnConfigurationChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.k.remove(kar0);
    }

    @Override  // jvs
    public final void removeOnMultiWindowModeChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.m.remove(kar0);
    }

    @Override  // jvt
    public final void removeOnPictureInPictureModeChangedListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.n.remove(kar0);
    }

    @Override  // jwk
    public final void removeOnTrimMemoryListener(kar kar0) {
        ibuq.f(kar0, "listener");
        this.l.remove(kar0);
    }

    @Override  // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if(Trace.isEnabled()) {
                oyn.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.g().a();
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // android.app.Activity
    public void setContentView(int v) {
        this.k();
        View view0 = this.getWindow().getDecorView();
        ibuq.e(view0, "getDecorView(...)");
        this.j.a(view0);
        super.setContentView(v);
    }

    @Override  // android.app.Activity
    public void setContentView(View view0) {
        this.k();
        View view1 = this.getWindow().getDecorView();
        ibuq.e(view1, "getDecorView(...)");
        this.j.a(view1);
        super.setContentView(view0);
    }

    @Override  // android.app.Activity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        View view1 = this.getWindow().getDecorView();
        ibuq.e(view1, "getDecorView(...)");
        this.j.a(view1);
        super.setContentView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    @ibni
    public final void startActivityForResult(Intent intent0, int v) {
        ibuq.f(intent0, "intent");
        super.startActivityForResult(intent0, v);
    }

    @Override  // android.app.Activity
    @ibni
    public final void startActivityForResult(Intent intent0, int v, Bundle bundle0) {
        ibuq.f(intent0, "intent");
        super.startActivityForResult(intent0, v, bundle0);
    }

    @Override  // android.app.Activity
    @ibni
    public final void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3) {
        ibuq.f(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3);
    }

    @Override  // android.app.Activity
    @ibni
    public final void startIntentSenderForResult(IntentSender intentSender0, int v, Intent intent0, int v1, int v2, int v3, Bundle bundle0) {
        ibuq.f(intentSender0, "intent");
        super.startIntentSenderForResult(intentSender0, v, intent0, v1, v2, v3, bundle0);
    }
}

