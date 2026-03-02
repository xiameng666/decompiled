import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.os.Bundle;
import android.os.LocaleList;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class iz extends ea implements jwc {
    private jg k;

    public iz() {
        this.getSavedStateRegistry().b("androidx:appcompat", new ix(this));
        this.i(new iy(this));
    }

    @Override  // aao
    public final void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        this.e().f(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    protected final void attachBaseContext(Context context0) {
        Context context2;
        Configuration configuration5;
        Context context1;
        ka ka0 = (ka)this.e();
        ka0.B = true;
        int v = ka0.D(context0, ka0.C());
        if(ka.w(context0)) {
            ka.v(context0);
        }
        jzd jzd0 = ka0.I(context0);
        if((context0 instanceof ContextThemeWrapper)) {
            context1 = context0;
            Configuration configuration0 = ka0.F(context1, v, jzd0, null, false);
            try {
                ((ContextThemeWrapper)context1).applyOverrideConfiguration(configuration0);
                goto label_84;
            }
            catch(IllegalStateException unused_ex) {
            }
            goto label_12;
        }
        else {
            context1 = context0;
        label_12:
            if((context1 instanceof adv)) {
                Configuration configuration1 = ka0.F(context1, v, jzd0, null, false);
                try {
                    ((adv)context1).b(configuration1);
                    goto label_84;
                }
                catch(IllegalStateException unused_ex) {
                }
                goto label_16;
            }
            else {
            label_16:
                if(ka.h) {
                    Configuration configuration2 = new Configuration();
                    configuration2.uiMode = -1;
                    configuration2.fontScale = 0.0f;
                    Configuration configuration3 = context1.createConfigurationContext(configuration2).getResources().getConfiguration();
                    Configuration configuration4 = context1.getResources().getConfiguration();
                    configuration3.uiMode = configuration4.uiMode;
                    if(configuration3.equals(configuration4)) {
                        configuration5 = null;
                    }
                    else {
                        configuration5 = new Configuration();
                        configuration5.fontScale = 0.0f;
                        if(configuration4 != null && configuration3.diff(configuration4) != 0) {
                            if(configuration3.fontScale != configuration4.fontScale) {
                                configuration5.fontScale = configuration4.fontScale;
                            }
                            if(configuration3.mcc != configuration4.mcc) {
                                configuration5.mcc = configuration4.mcc;
                            }
                            if(configuration3.mnc != configuration4.mnc) {
                                configuration5.mnc = configuration4.mnc;
                            }
                            LocaleList localeList0 = configuration3.getLocales();
                            LocaleList localeList1 = configuration4.getLocales();
                            if(!localeList0.equals(localeList1)) {
                                configuration5.setLocales(localeList1);
                                configuration5.locale = configuration4.locale;
                            }
                            if(configuration3.touchscreen != configuration4.touchscreen) {
                                configuration5.touchscreen = configuration4.touchscreen;
                            }
                            if(configuration3.keyboard != configuration4.keyboard) {
                                configuration5.keyboard = configuration4.keyboard;
                            }
                            if(configuration3.keyboardHidden != configuration4.keyboardHidden) {
                                configuration5.keyboardHidden = configuration4.keyboardHidden;
                            }
                            if(configuration3.navigation != configuration4.navigation) {
                                configuration5.navigation = configuration4.navigation;
                            }
                            if(configuration3.navigationHidden != configuration4.navigationHidden) {
                                configuration5.navigationHidden = configuration4.navigationHidden;
                            }
                            if(configuration3.orientation != configuration4.orientation) {
                                configuration5.orientation = configuration4.orientation;
                            }
                            if((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                                configuration5.screenLayout |= configuration4.screenLayout & 15;
                            }
                            if((configuration3.screenLayout & 0xC0) != (configuration4.screenLayout & 0xC0)) {
                                configuration5.screenLayout |= configuration4.screenLayout & 0xC0;
                            }
                            if((configuration3.screenLayout & 0x30) != (configuration4.screenLayout & 0x30)) {
                                configuration5.screenLayout |= configuration4.screenLayout & 0x30;
                            }
                            if((configuration3.screenLayout & 0x300) != (configuration4.screenLayout & 0x300)) {
                                configuration5.screenLayout |= configuration4.screenLayout & 0x300;
                            }
                            if((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                                configuration5.colorMode |= configuration4.colorMode & 3;
                            }
                            if((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                                configuration5.colorMode |= configuration4.colorMode & 12;
                            }
                            if((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                                configuration5.uiMode |= configuration4.uiMode & 15;
                            }
                            if((configuration3.uiMode & 0x30) != (configuration4.uiMode & 0x30)) {
                                configuration5.uiMode |= configuration4.uiMode & 0x30;
                            }
                            if(configuration3.screenWidthDp != configuration4.screenWidthDp) {
                                configuration5.screenWidthDp = configuration4.screenWidthDp;
                            }
                            if(configuration3.screenHeightDp != configuration4.screenHeightDp) {
                                configuration5.screenHeightDp = configuration4.screenHeightDp;
                            }
                            if(configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                                configuration5.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                            }
                            if(configuration3.densityDpi != configuration4.densityDpi) {
                                configuration5.densityDpi = configuration4.densityDpi;
                            }
                        }
                    }
                    Configuration configuration6 = ka0.F(context1, v, jzd0, configuration5, true);
                    adv adv0 = new adv(context1, 0x7F160C04);  // style:Theme.AppCompat.Empty
                    adv0.b(configuration6);
                    try {
                        Resources.Theme resources$Theme0 = context1.getTheme();
                    }
                    catch(NullPointerException unused_ex) {
                        goto label_82;
                    }
                    if(resources$Theme0 != null) {
                        adv0.getTheme().rebase();
                    }
                label_82:
                    context2 = adv0;
                }
                else {
                label_84:
                    context2 = context1;
                }
            }
        }
        super.attachBaseContext(context2);
    }

    @Override  // android.app.Activity
    public final void closeOptionsMenu() {
        im im0 = this.d();
        if(this.getWindow().hasFeature(0) && (im0 == null || !im0.E())) {
            super.closeOptionsMenu();
        }
    }

    public final im d() {
        return this.e().b();
    }

    @Override  // gz
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        im im0 = this.d();
        return v != 82 || im0 == null || !im0.J(keyEvent0) ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    public final jg e() {
        if(this.k == null) {
            this.k = new ka(this, null, this);
        }
        return this.k;
    }

    public final void f(Toolbar toolbar0) {
        this.e().t(toolbar0);
    }

    @Override  // android.app.Activity
    public final View findViewById(int v) {
        return this.e().d(v);
    }

    @Override  // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return this.e().c();
    }

    @Override  // jwc
    public final Intent hN() {
        return jua.a(this);
    }

    @Override  // android.app.Activity
    public final void invalidateOptionsMenu() {
        this.e().h();
    }

    @Override  // aao
    public final void onConfigurationChanged(Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        this.e().A();
    }

    @Override  // android.app.Activity
    public final void onContentChanged() {
    }

    @Override  // ea
    protected void onDestroy() {
        super.onDestroy();
        this.e().i();
    }

    @Override  // ea
    public final boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        if(super.onMenuItemSelected(v, menuItem0)) {
            return true;
        }
        im im0 = this.d();
        if(menuItem0.getItemId() == 0x102002C && im0 != null && (im0.b() & 4) != 0) {
            Intent intent0 = jua.a(this);
            if(intent0 != null) {
                if(this.shouldUpRecreateTask(intent0)) {
                    jwd jwd0 = new jwd(this);
                    jwd0.e(this);
                    jwd0.b();
                    try {
                        this.finishAffinity();
                    }
                    catch(IllegalStateException unused_ex) {
                        this.finish();
                    }
                    return true;
                }
                this.navigateUpTo(intent0);
                return true;
            }
        }
        return false;
    }

    @Override  // android.app.Activity
    protected final void onPostCreate(Bundle bundle0) {
        super.onPostCreate(bundle0);
        ((ka)this.e()).P();
    }

    @Override  // ea
    protected final void onPostResume() {
        super.onPostResume();
        this.e().j();
    }

    @Override  // ea
    protected final void onStart() {
        super.onStart();
        this.e().k();
    }

    @Override  // ea
    protected final void onStop() {
        super.onStop();
        this.e().l();
    }

    @Override  // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence0, int v) {
        super.onTitleChanged(charSequence0, v);
        this.e().u(charSequence0);
    }

    @Override  // android.app.Activity
    public final void openOptionsMenu() {
        im im0 = this.d();
        if(this.getWindow().hasFeature(0) && (im0 == null || !im0.K())) {
            super.openOptionsMenu();
        }
    }

    @Override  // aao
    public final void setContentView(int v) {
        this.k();
        this.e().o(v);
    }

    @Override  // aao
    public final void setContentView(View view0) {
        this.k();
        this.e().p(view0);
    }

    @Override  // aao
    public final void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.k();
        this.e().q(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.app.Activity
    public final void setTheme(int v) {
        super.setTheme(v);
        ((ka)this.e()).D = v;
    }
}

