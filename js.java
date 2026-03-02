import android.content.Context;
import android.content.res.Resources.Theme;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import android.widget.PopupWindow;
import java.util.List;

final class js extends mj {
    public boolean a;
    public boolean b;
    final ka c;
    public kk d;
    private boolean f;

    public js(ka ka0, Window.Callback window$Callback0) {
        this.c = ka0;
        super(window$Callback0);
    }

    public final void a(Window.Callback window$Callback0) {
        try {
            this.f = true;
            window$Callback0.onContentChanged();
            this.f = false;
        }
        catch(Throwable throwable0) {
            this.f = false;
            throw throwable0;
        }
    }

    @Override  // mj
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent0) : this.c.S(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // mj
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        if(!super.dispatchKeyShortcutEvent(keyEvent0)) {
            ka ka0 = this.c;
            int v = keyEvent0.getKeyCode();
            im im0 = ka0.b();
            if(im0 == null || !im0.I(v, keyEvent0)) {
                if(ka0.A == null || !ka0.Z(ka0.A, keyEvent0.getKeyCode(), keyEvent0)) {
                    goto label_10;
                }
                jy jy0 = ka0.A;
                if(jy0 != null) {
                    jy0.l = true;
                    return true;
                label_10:
                    if(ka0.A == null) {
                        jy jy1 = ka0.Y(0);
                        ka0.V(jy1, keyEvent0);
                        boolean z = ka0.Z(jy1, keyEvent0.getKeyCode(), keyEvent0);
                        jy1.k = false;
                        return z;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override  // mj
    public final void onContentChanged() {
        if(this.f) {
            this.e.onContentChanged();
        }
    }

    @Override  // mj
    public final boolean onCreatePanelMenu(int v, Menu menu0) {
        if(v == 0) {
            return (menu0 instanceof na) ? super.onCreatePanelMenu(0, menu0) : false;
        }
        return super.onCreatePanelMenu(v, menu0);
    }

    @Override  // mj
    public final View onCreatePanelView(int v) {
        kk kk0 = this.d;
        if(kk0 != null) {
            if(v == 0) {
                View view0 = new View(kk0.a.c.a());
                return view0 == null ? super.onCreatePanelView(0) : view0;
            }
            return super.onCreatePanelView(v);
        }
        return super.onCreatePanelView(v);
    }

    @Override  // mj
    public final boolean onMenuOpened(int v, Menu menu0) {
        super.onMenuOpened(v, menu0);
        if(v == 108) {
            im im0 = this.c.b();
            if(im0 != null) {
                im0.g(true);
            }
        }
        return true;
    }

    @Override  // mj
    public final void onPanelClosed(int v, Menu menu0) {
        if(this.b) {
            this.e.onPanelClosed(v, menu0);
            return;
        }
        super.onPanelClosed(v, menu0);
        ka ka0 = this.c;
        if(v == 108) {
            im im0 = ka0.b();
            if(im0 != null) {
                im0.g(false);
            }
        }
        else if(v == 0) {
            jy jy0 = ka0.Y(0);
            if(jy0.m) {
                ka0.M(jy0, false);
            }
        }
    }

    @Override  // mj
    public final boolean onPreparePanel(int v, View view0, Menu menu0) {
        na na0 = (menu0 instanceof na) ? ((na)menu0) : null;
        if(v == 0) {
            if(na0 != null) {
                v = 0;
                goto label_6;
            }
            return false;
        }
    label_6:
        if(na0 != null) {
            na0.k = true;
        }
        kk kk0 = this.d;
        if(kk0 != null && v == 0) {
            kl kl0 = kk0.a;
            if(!kl0.b) {
                kl0.c.i();
                kl0.b = true;
            }
            v = 0;
        }
        boolean z = super.onPreparePanel(v, view0, menu0);
        if(na0 != null) {
            na0.k = false;
        }
        return z;
    }

    @Override  // mj
    public final void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        na na0 = this.c.Y(0).h;
        if(na0 != null) {
            super.onProvideKeyboardShortcuts(list0, na0, v);
            return;
        }
        super.onProvideKeyboardShortcuts(list0, menu0, v);
    }

    @Override  // mj
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return null;
    }

    @Override  // mj
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        ka ka0 = this.c;
        if(ka0.t && v == 0) {
            Context context0 = ka0.j;
            mc mc0 = new mc(context0, actionMode$Callback0);
            lz lz0 = ka0.o;
            if(lz0 != null) {
                lz0.f();
            }
            jp jp0 = new jp(ka0, mc0);
            im im0 = ka0.b();
            if(im0 != null) {
                ka0.o = im0.d(jp0);
            }
            if(ka0.o == null) {
                ka0.O();
                lz lz1 = ka0.o;
                if(lz1 != null) {
                    lz1.f();
                }
                if(ka0.p == null) {
                    if(ka0.y) {
                        TypedValue typedValue0 = new TypedValue();
                        Resources.Theme resources$Theme0 = context0.getTheme();
                        resources$Theme0.resolveAttribute(0x7F040083, typedValue0, true);  // attr:actionBarTheme
                        if(typedValue0.resourceId != 0) {
                            Resources.Theme resources$Theme1 = context0.getResources().newTheme();
                            resources$Theme1.setTo(resources$Theme0);
                            resources$Theme1.applyStyle(typedValue0.resourceId, true);
                            adv adv0 = new adv(context0, 0);
                            adv0.getTheme().setTo(resources$Theme1);
                            context0 = adv0;
                        }
                        ka0.p = new ActionBarContextView(context0);
                        ka0.q = new PopupWindow(context0, null, 0x7F040094);  // attr:actionModePopupWindowStyle
                        ka0.q.setWindowLayoutType(2);
                        ka0.q.setContentView(ka0.p);
                        ka0.q.setWidth(-1);
                        context0.getTheme().resolveAttribute(0x7F04007A, typedValue0, true);  // attr:actionBarSize
                        ka0.p.e = TypedValue.complexToDimensionPixelSize(typedValue0.data, context0.getResources().getDisplayMetrics());
                        ka0.q.setHeight(-2);
                        ka0.r = new jl(ka0);
                    }
                    else {
                        ViewStubCompat viewStubCompat0 = (ViewStubCompat)ka0.u.findViewById(0x7F0B0AE8);  // id:action_mode_bar_stub
                        if(viewStubCompat0 != null) {
                            viewStubCompat0.a = LayoutInflater.from(ka0.E());
                            ka0.p = (ActionBarContextView)viewStubCompat0.a();
                        }
                    }
                }
                if(ka0.p != null) {
                    ka0.O();
                    ka0.p.i();
                    mb mb0 = new mb(ka0.p.getContext(), ka0.p, jp0);
                    if(jp0.c(mb0, mb0.a)) {
                        mb0.g();
                        ka0.p.h(mb0);
                        ka0.o = mb0;
                        if(ka0.W()) {
                            ka0.p.setAlpha(0.0f);
                            kfs kfs0 = kfe.c(ka0.p);
                            kfs0.c(1.0f);
                            ka0.s = kfs0;
                            ka0.s.h(new jm(ka0));
                        }
                        else {
                            ka0.p.setAlpha(1.0f);
                            ka0.p.setVisibility(0);
                            if((ka0.p.getParent() instanceof View)) {
                                ((View)ka0.p.getParent()).requestApplyInsets();
                            }
                        }
                        if(ka0.q != null) {
                            ka0.k.getDecorView().post(ka0.r);
                        }
                    }
                    else {
                        ka0.o = null;
                    }
                }
                ka0.R();
            }
            ka0.R();
            return ka0.o == null ? null : mc0.e(ka0.o);
        }
        return super.onWindowStartingActionMode(actionMode$Callback0, v);
    }
}

