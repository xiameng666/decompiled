import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

final class kl extends im {
    final Window.Callback a;
    boolean b;
    final ww c;
    final kk d;
    private boolean e;
    private boolean f;
    private final ArrayList g;
    private final Runnable h;
    private final ws i;

    public kl(Toolbar toolbar0, CharSequence charSequence0, Window.Callback window$Callback0) {
        this.g = new ArrayList();
        this.h = new kg(this);
        kh kh0 = new kh(this);
        this.i = kh0;
        ww ww0 = new ww(toolbar0, false);
        this.c = ww0;
        kay.i(window$Callback0);
        this.a = window$Callback0;
        ww0.e = window$Callback0;
        toolbar0.s = kh0;
        ww0.q(charSequence0);
        this.d = new kk(this);
    }

    @Override  // im
    public final void A(int v) {
        CharSequence charSequence0 = v == 0 ? null : this.c.a().getText(v);
        this.c.o(charSequence0);
    }

    @Override  // im
    public final void B(CharSequence charSequence0) {
        this.c.o(charSequence0);
    }

    @Override  // im
    public final void C(CharSequence charSequence0) {
        this.c.q(charSequence0);
    }

    @Override  // im
    public final void D() {
        this.c.p(0);
    }

    @Override  // im
    public final boolean E() {
        return this.c.s();
    }

    @Override  // im
    public final boolean F() {
        ww ww0 = this.c;
        if(ww0.r()) {
            ww0.d();
            return true;
        }
        return false;
    }

    @Override  // im
    public final boolean G() {
        this.c.a.removeCallbacks(this.h);
        this.c.a.postOnAnimation(this.h);
        return true;
    }

    @Override  // im
    public final boolean H() {
        return this.c.a.getVisibility() == 0;
    }

    @Override  // im
    public final boolean I(int v, KeyEvent keyEvent0) {
        Menu menu0 = this.P();
        if(menu0 != null) {
            menu0.setQwertyMode(KeyCharacterMap.load((keyEvent0 == null ? -1 : keyEvent0.getDeviceId())).getKeyboardType() != 1);
            return menu0.performShortcut(v, keyEvent0, 0);
        }
        return false;
    }

    @Override  // im
    public final boolean J(KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1) {
            this.K();
        }
        return true;
    }

    @Override  // im
    public final boolean K() {
        return this.c.u();
    }

    @Override  // im
    public final void L() {
    }

    @Override  // im
    public final void M() {
        this.q(16, 16);
    }

    @Override  // im
    public final void N() {
        this.c.h(null);
    }

    @Override  // im
    public final void O() {
    }

    public final Menu P() {
        if(!this.e) {
            ki ki0 = new ki(this);
            kj kj0 = new kj(this);
            this.c.a.v = ki0;
            this.c.a.w = kj0;
            ActionMenuView actionMenuView0 = this.c.a.a;
            if(actionMenuView0 != null) {
                actionMenuView0.i(ki0, kj0);
            }
            this.e = true;
        }
        return this.c.a.g();
    }

    @Override  // im
    public final float a() {
        return this.c.a.getElevation();
    }

    @Override  // im
    public final int b() {
        return this.c.b;
    }

    @Override  // im
    public final Context c() {
        return this.c.a();
    }

    @Override  // im
    public final View e() {
        return this.c.c;
    }

    @Override  // im
    public final CharSequence f() {
        return this.c.c();
    }

    @Override  // im
    public final void g(boolean z) {
        if(z != this.f) {
            this.f = z;
            ArrayList arrayList0 = this.g;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((il)arrayList0.get(v1)).a();
            }
        }
    }

    @Override  // im
    public final void h() {
        this.c.p(8);
    }

    @Override  // im
    public final void i() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override  // im
    public final void j(Drawable drawable0) {
        this.c.a.setBackground(drawable0);
    }

    @Override  // im
    public final void k(int v) {
        this.l(LayoutInflater.from(this.c.a()).inflate(v, this.c.a, false));
    }

    @Override  // im
    public final void l(View view0) {
        this.m(view0, new ik(-2, -2));
    }

    @Override  // im
    public final void m(View view0, ik ik0) {
        if(view0 != null) {
            view0.setLayoutParams(ik0);
        }
        this.c.f(view0);
    }

    @Override  // im
    public final void n(boolean z) {
    }

    @Override  // im
    public final void o(boolean z) {
        this.q((z ? 4 : 0), 4);
    }

    @Override  // im
    public final void p(int v) {
        this.q(v, -1);
    }

    @Override  // im
    public final void q(int v, int v1) {
        this.c.g(v & v1 | this.c.b & ~v1);
    }

    @Override  // im
    public final void r(boolean z) {
        this.q((z ? 2 : 0), 2);
    }

    @Override  // im
    public final void s(boolean z) {
        this.q((z ? 8 : 0), 8);
    }

    @Override  // im
    public final void t(float f) {
        this.c.a.setElevation(f);
    }

    @Override  // im
    public final void u(int v) {
        this.c.j(v);
    }

    @Override  // im
    public final void v(CharSequence charSequence0) {
        this.c.k(charSequence0);
    }

    @Override  // im
    public final void w(int v) {
        this.c.l(v);
    }

    @Override  // im
    public final void x(Drawable drawable0) {
        this.c.m(drawable0);
    }

    @Override  // im
    public final void y(boolean z) {
    }

    @Override  // im
    public final void z(CharSequence charSequence0) {
        this.c.n(charSequence0);
    }
}

