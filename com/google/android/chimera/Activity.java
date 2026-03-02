package com.google.android.chimera;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import gfuy;
import hrjq;
import wwb;
import wwu;
import wxp;
import xja;
import xjb;
import xmm;

@ChimeraApiVersion(added = 0L)
@Deprecated
public abstract class Activity extends xjb implements Window.Callback, xmm {
    public static final int DEFAULT_KEYS_DIALER = 1;
    public static final int DEFAULT_KEYS_DISABLE = 0;
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
    public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
    public static final int DEFAULT_KEYS_SHORTCUT = 2;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_FIRST_USER = 1;
    public static final int RESULT_OK = -1;
    private static final ClassLoader a;
    private wwb b;
    private FragmentManager c;
    private LoaderManager d;

    static ClassLoader -$$Nest$sfgetCONTAINER_CLASS_LOADER() {
        return Activity.a;
    }

    static {
        ClassLoader classLoader0 = Activity.class.getClassLoader();
        gfuy.e(classLoader0);
        Activity.a = classLoader0;
    }

    private final void gP(Bundle bundle0, ClassLoader classLoader0) {
        if(this.b != null && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if(bundle1 != null) {
                bundle1.setClassLoader(classLoader0);
            }
        }
    }

    final wwb gT() {
        wwb wwb0 = this.b;
        if(wwb0 != null) {
            return wwb0;
        }
        throw new UnsupportedOperationException("FragmentActivity functionality no longer supported");
    }

    @Override  // xmm
    public com.google.android.chimera.android.Activity getChimeraXActivity() {
        wwb wwb0 = this.b;
        return wwb0 != null ? ((com.google.android.chimera.android.Activity)wwb0) : this;
    }

    @Override  // xjb
    protected final xja getDelegation() {
        return this.b;
    }

    @Override  // xjb
    public final android.app.FragmentManager getFragmentManager() {
        return super.getFragmentManager();
    }

    @Override  // xjb
    public Object getLastCustomNonConfigurationInstance() {
        return this.b == null ? super.getLastNonConfigurationInstance() : super.getLastCustomNonConfigurationInstance();
    }

    @Override  // xjb
    public Object getLastNonConfigurationInstance() {
        return this.b == null ? null : super.getLastNonConfigurationInstance();
    }

    @Override  // xjb
    public final android.app.LoaderManager getLoaderManager() {
        return super.getLoaderManager();
    }

    public FragmentManager getSupportFragmentManager() {
        Fragment.deprecationCheck();
        if(this.c == null) {
            this.c = FragmentManager.get(this.gT().getSupportFragmentManager());
        }
        return this.c;
    }

    public LoaderManager getSupportLoaderManager() {
        Fragment.deprecationCheck();
        if(this.d == null) {
            this.d = LoaderManager.get(this.gT().getSupportLoaderManager());
        }
        return this.d;
    }

    @Override  // xjb
    public final void onAttachFragment(android.app.Fragment fragment0) {
        super.onAttachFragment(fragment0);
    }

    public void onAttachFragment(Fragment fragment0) {
        this.gT();
        fragment0.getSupportContainerFragment();
    }

    @Override  // xjb
    @Deprecated
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
    }

    @Override  // xjb
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration0) {
        super.onMultiWindowModeChanged(z, configuration0);
    }

    @Override  // xjb
    @Deprecated
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
    }

    @Override  // xjb
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration0) {
        super.onPictureInPictureModeChanged(z, configuration0);
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view0, Menu menu0) {
        return super.onPreparePanel(0, view0, menu0);
    }

    @Override  // xjb
    protected void onResumeFragments() {
        if(this.b == null) {
            return;
        }
        super.onResumeFragments();
    }

    @Override  // xjb
    public Object onRetainCustomNonConfigurationInstance() {
        if(this.b == null) {
            return super.onRetainNonConfigurationInstance();
        }
        super.onRetainCustomNonConfigurationInstance();
        return null;
    }

    @Override  // xjb
    public final Object onRetainNonConfigurationInstance() {
        return this.b == null ? this.onRetainCustomNonConfigurationInstance() : super.onRetainNonConfigurationInstance();
    }

    @Override  // xjb, android.view.Window$Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return super.onWindowStartingActionMode(actionMode$Callback0);
    }

    @Override  // xjb, android.view.Window$Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        return super.onWindowStartingActionMode(actionMode$Callback0, v);
    }

    @Override  // xiy
    public void public_onCreate(Bundle bundle0) {
        this.gP(bundle0, Activity.a);
        super.public_onCreate(bundle0);
    }

    @Override  // xiy
    public void public_onCreate(Bundle bundle0, PersistableBundle persistableBundle0) {
        this.gP(bundle0, Activity.a);
        super.public_onCreate(bundle0, persistableBundle0);
    }

    @Override  // xiy
    public void public_onRestoreInstanceState(Bundle bundle0) {
        this.gP(bundle0, Activity.a);
        super.public_onRestoreInstanceState(bundle0);
    }

    @Override  // xiy
    public void public_onRestoreInstanceState(Bundle bundle0, PersistableBundle persistableBundle0) {
        this.gP(bundle0, Activity.a);
        super.public_onRestoreInstanceState(bundle0, persistableBundle0);
    }

    @Override  // xjb
    public final void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        super.registerActivityLifecycleCallbacks(application$ActivityLifecycleCallbacks0);
    }

    @Override  // xjb
    public void setProxyCallbacks(Object object0, Context context0) {
        this.setProxyCallbacks(((wwu)object0), context0);
    }

    @Override  // xjb
    public void setProxyCallbacks(wwu wwu0, Context context0) {
        wxp.b();
        if(!hrjq.a.c().k()) {
            Activity.ChimeraXChimeraActivity activity$ChimeraXChimeraActivity0 = new Activity.ChimeraXChimeraActivity();
            activity$ChimeraXChimeraActivity0.setImpl(this);
            activity$ChimeraXChimeraActivity0.setProxyCallbacks(wwu0, context0);
            this.b = activity$ChimeraXChimeraActivity0;
        }
        super.setProxyCallbacks(wwu0, context0);
    }

    @Override  // com.google.android.chimera.ContextThemeWrapper
    public void setTheme(int v) {
        super.setTheme(v);
        wwb wwb0 = this.b;
        if(wwb0 != null) {
            wwb0.setTheme(v);
        }
    }

    @Override  // xjb
    public final void startActivityFromFragment(android.app.Fragment fragment0, Intent intent0, int v) {
        super.startActivityFromFragment(fragment0, intent0, v);
    }

    public void startActivityFromFragment(Fragment fragment0, Intent intent0, int v) {
        this.gT().support_startActivityFromFragment(fragment0.getSupportContainerFragment(), intent0, v);
    }

    @Override  // xjb
    public void supportFinishAfterTransition() {
        super.supportFinishAfterTransition();
    }

    @Override  // xjb
    public void supportInvalidateOptionsMenu() {
        super.supportInvalidateOptionsMenu();
    }

    @Override  // xjb
    public void supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
    }

    @Override  // xjb
    public void supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @Override  // xjb
    public final void unregisterActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
        super.unregisterActivityLifecycleCallbacks(application$ActivityLifecycleCallbacks0);
    }
}

