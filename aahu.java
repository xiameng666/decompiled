import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public final class aahu extends du {
    public aaor a;
    public ibnf b;
    public aavf c;
    private grxw d;

    public aahu() {
        this.d = zhp.c;
    }

    public final void A(aakz aakz0, boolean z) {
        if(z) {
            aakz0.G(0L);
            return;
        }
        aakz0.G(((long)this.getResources().getInteger(0x7F0C0010)));  // integer:as_screen_transition_duration
    }

    public static final aakz B(aanx aanx0) {
        boolean z6;
        boolean z5;
        boolean z3;
        grxw grxw0 = aanx0.a.a.e == null ? grxw.a : aanx0.a.a.e;
        boolean z = false;
        grul grul0 = aanx0.a.a();
        if(hoju.j() && hoju.f() && (grul0.b & 0x80) != 0) {
            aapx aapx0 = new aapx(grxw0);
            aakz aakz0 = new aajq();
            aakz0.setArguments(aapx0.a());
            return aakz0;
        }
        if((grul0.b & 0x80) != 0) {
            aapx aapx1 = new aapx(grxw0);
            aakz aakz1 = new aajp();
            aakz1.setArguments(aapx1.a());
            return aakz1;
        }
        if(hoju.j()) {
            grvg grvg0 = grul0.g == null ? grvg.a : grul0.g;
            grut grut0 = grvg0.i == null ? grut.a : grvg0.i;
            int v = grul0.b;
            boolean z1 = (v & 0x800) != 0;
            grvg grvg1 = grul0.g;
            boolean z2 = ((grvg1 == null ? grvg.a : grvg1).b & 0x800) != 0;
            if((v & 4) != 0) {
                z3 = true;
            }
            else if((v & 16) == 0 && (v & 0x100) == 0) {
                z3 = false;
            }
            else {
                z3 = true;
            }
            if(grvg1 == null) {
                grvg1 = grvg.a;
            }
            if((grvg1.b & 0x400) != 0) {
                z = true;
            }
            aarq aarq0 = new aarq(grut0, z1, !z2 && z1 || z3, z);
            ibuq.f(aanx0, "initialNavStack");
            aakz aakz2 = new aafw();
            Bundle bundle0 = new Bundle();
            bundle0.putByteArray("appBarKey", aarq0.a.toBytesArray());
            bundle0.putBoolean("isPlaceholder", aarq0.b);
            bundle0.putBoolean("isTrampoline", aarq0.c);
            bundle0.putBoolean("animateParticleDisc", aarq0.d);
            aakz2.setArguments(bundle0);
            aakz2.ag = aanx0;
            return aakz2;
        }
        grxw grxw1 = zhp.e(grul0);
        boolean z4 = true;
        grxw grxw2 = zhp.c(grul0);
        if(zhp.n(grul0) == 3) {
            z5 = true;
        }
        else {
            z5 = true;
            z4 = false;
        }
        if(zhp.n(grul0) == 4) {
            z6 = true;
        }
        else {
            z6 = true;
            z5 = false;
        }
        if(!zhp.l(grul0) && !zhp.k(grul0)) {
            z6 = false;
        }
        aaqk aaqk0 = new aaqk(grxw1, grxw2, z4, z5, z6);
        ibuq.f(aanx0, "initialNavStack");
        aakz aakz3 = new aakt();
        Bundle bundle1 = new Bundle();
        bundle1.putByteArray("welcomeHeaderKey", zhp.m(aaqk0.a));
        bundle1.putByteArray("simpleHeaderKey", zhp.m(aaqk0.b));
        bundle1.putBoolean("isPlaceholder", aaqk0.c);
        bundle1.putBoolean("isTrampoline", aaqk0.d);
        bundle1.putBoolean("hasNav", aaqk0.e);
        aakz3.setArguments(bundle1);
        aakz3.ag = aanx0;
        return aakz3;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(intent0 != null && intent0.hasExtra("extra.consistencyToken")) {
            String s = intent0.getStringExtra("extra.consistencyToken");
            if(s != null) {
                ((zed)this.b.get()).a(ggnj.a, s);
            }
        }
        aaor aaor0 = this.a;
        grxw grxw0 = this.z().fT();
        aauf aauf0 = aaor0.a.l;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwj.a).v_newBuilder();
        int v2 = grxw0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqwj gqwj0 = (gqwj)hftp0.b_message;
        gqwj0.b |= 1;
        gqwj0.c = v2;
        int v3 = grxw0.c;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqvy gqvy0 = (gqvy)hftp2.b_message;
        gqwj gqwj1 = (gqwj)hftp0.N_build();
        gqwj1.getClass();
        gqvy0.e = gqwj1;
        gqvy0.b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvy gqvy1 = (gqvy)hftp2.N_build();
        gqvy1.getClass();
        gqxs0.k = gqvy1;
        gqxs0.b |= 0x1000;
        gqvx gqvx0 = aauf0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs1.i = gqvx0;
        gqxs1.b |= 0x80;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp1.b_message;
        gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs2.getClass();
        gqxt0.c = gqxs2;
        gqxt0.b |= 1;
        aauf0.e(v3, ((gqxt)hftp1.N_build()));
        this.a.a.k();
        if(v == 13) {
            List list0 = bbmn.h(this.requireContext(), "com.google.android.gms");
            if(!list0.isEmpty() && !bbqr.d(((Account)list0.get(0)).name)) {
                aaor aaor1 = this.a;
                String s1 = ((Account)list0.get(0)).name;
                aaor1.a.m(s1);
                grxw grxw1 = aaor1.b.b();
                aaor1.a.i(grxw1);
            }
            v = 13;
        }
        if((v == 6 || v == 12) && v1 == -1 && intent0 != null && intent0.hasExtra("authAccount")) {
            String s2 = intent0.getStringExtra("authAccount");
            aaor aaor2 = this.a;
            gftb.check(s2);
            aaln aaln0 = aaor2.a;
            if(!aaln0.d().b.equals(s2)) {
                aaln0.m(s2);
                aaln0.j();
                aaln0.i(aaor2.b.b());
            }
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aaht)zgm.a(aaht.class, this)).d(this);
        if(hoju.p()) {
            fhrx.b(this.a.c, this, new aahm(this));
        }
        this.a.b.j.g(this, new aahn(this));
        fhrx.b(this.a.b.g, this, new aaho(this));
        fhrx.b(this.a.b.h, this, new aahp(this));
        ((xob)context0).getOnBackPressedDispatcher().c(this, new aahs(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E00D5, viewGroup0, false);  // layout:as_main_fragment
        if(bundle0 == null) {
            aanx aanx0 = this.a.b.a();
            aakz aakz0 = aahu.B(aanx0);
            aakv.a(aakz0, aanx0.b);
            this.A(aakz0, true);
            aakv.d(this, aakz0, "inner", aaku.a);
        }
        return view0;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        aaon aaon0 = this.a.b;
        aaon0.a.l.b();
        aaon0.f = SystemClock.elapsedRealtime();
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        aaon aaon0 = this.a.b;
        grxw grxw0 = this.d;
        aaon0.d();
        grxw grxw1 = aaon0.b();
        long v = SystemClock.elapsedRealtime() - aaon0.f;
        if(aaon0.f >= 0L && !aaon0.e && v > 700L) {
            aaon0.a.j();
            aaon0.a.i(grxw1);
        }
        aaon0.e = false;
        aaon0.f = -1L;
        aaon0.a.l.f(grxw0, grxw1);
        this.d = zhp.c;
    }

    public static aahu y(grxw grxw0) {
        aahu aahu0 = new aahu();
        aahu0.d = grxw0;
        return aahu0;
    }

    public final aakz z() {
        aakz aakz0 = (aakz)this.getChildFragmentManager().h("inner");
        gftb.check(aakz0);
        return aakz0;
    }
}

