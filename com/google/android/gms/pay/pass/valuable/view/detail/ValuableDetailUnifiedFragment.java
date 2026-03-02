package com.google.android.gms.pay.pass.valuable.view.detail;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adt;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import azts;
import bbcu;
import bboh;
import bbqr;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.SetWalletItemSurfacingEnabledRequest;
import com.google.android.gms.pay.pass.valuable.view.detail.template.ValuableDetailTemplate;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.GiftCard;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.LoyaltyCard;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.ui.disclaimer.DisclaimerText;
import com.google.android.libraries.tapandpay.ui.rowsecondary.RowSecondary;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import com.google.android.material.appbar.AppBarLayout;
import dagger.internal.Preconditions;
import dlnd;
import dlnf;
import dokz;
import dolg;
import doly;
import dolz;
import domu;
import domv;
import done;
import donh;
import douf;
import douj;
import douk;
import dsik;
import dsio;
import dskj;
import dskk;
import dsoo;
import dsop;
import dsor;
import dvfu;
import dvkx;
import dvqm;
import dvsx;
import dvth;
import dvva;
import dvvb;
import dvvc;
import dvvd;
import dvve;
import dvvf;
import dvvg;
import dvvh;
import dvvi;
import dvvj;
import dvvk;
import dvvl;
import dvvm;
import dvvn;
import dvvp;
import dvvq;
import dvvu;
import dvvv;
import dvvw;
import dvvz;
import dxed;
import dxee;
import dyab;
import ednc;
import edon;
import edrp;
import eeej;
import eflx;
import efma;
import efmj;
import efmo;
import evql;
import fhvo;
import fhwk;
import fipw;
import frxp;
import frxu;
import fryh;
import fryk;
import fryr;
import fryu;
import fryv;
import fsce;
import fshg;
import fshh;
import fshi;
import fshk;
import ftgd;
import ftjq;
import ftwn;
import ftwo;
import fuat;
import fuaw;
import fuaz;
import fugt;
import fugv;
import fugw;
import fuhm;
import fule;
import fuok;
import fuop;
import fuor;
import fuot;
import gfqx;
import gfsx;
import ggaf;
import gged_interceptors;
import ggfp;
import ggna;
import ggtj;
import gjdw;
import gkbe;
import gkbg;
import gtzk;
import guag;
import gubi;
import gucj;
import gucl;
import gucn;
import gucv;
import guez;
import gukv;
import gunw;
import guut;
import guvj;
import guwf;
import guzc;
import guzd;
import gveu;
import hwev;
import hwik;
import hwkw;
import hwuz;
import hwvp;
import ibth;
import j..util.Objects;
import j..util.stream.IntStream.-CC;
import j..util.stream.IntStream;
import j..util.stream.Stream;
import java.util.ArrayList;
import kij;
import xob;

public class ValuableDetailUnifiedFragment extends dokz implements douk, dskk, ednc, eflx, fshg, fshi {
    public static final bboh a;
    public azts aA;
    private static final ggfp aB;
    private gfsx aC;
    private boolean aD;
    private boolean aE;
    private RelativeLayout aF;
    private Button aG;
    private AppBarLayout aH;
    private ImageButton aI;
    private View aJ;
    private View aK;
    private View aL;
    private TextView aM;
    private ImageView aN;
    private RowSecondary aO;
    private RowSecondary aP;
    private RowSecondary aQ;
    private RowSecondary aR;
    private DisclaimerText aS;
    private ComposeViewHeader aT;
    private gfsx aU;
    private gfsx aV;
    private NestedScrollView aW;
    private kij aX;
    private acp aY;
    private acp aZ;
    public edon ag;
    public efma ah;
    public eeej ai;
    public dvfu aj;
    public fuot ak;
    public dsio al;
    public Boolean am;
    public fhwk an;
    public fuok ao;
    public dsor ap;
    public edrp aq;
    dvth ar;
    dvsx as;
    public gucj at;
    public gubi au;
    public gfsx av;
    public ValuableDetailTemplate aw;
    public TextView ax;
    public fshi ay;
    final gfsx az;
    public Account b;
    private gged_interceptors ba;
    public String c;
    public fshk d;

    static {
        ValuableDetailUnifiedFragment.a = bboh.b("Pay", bbcu.cZ);
        ValuableDetailUnifiedFragment.aB = ggfp.M(guzd.b, guzd.c, guzd.e, guzd.d);
    }

    public ValuableDetailUnifiedFragment() {
        this.av = gfqx.a;
        this.aC = gfqx.a;
        this.aD = false;
        this.aU = gfqx.a;
        this.aV = gfqx.a;
        this.az = gfqx.a;
    }

    @Override  // douk
    public final douj A() {
        return douj.c;
    }

    // Detected as a lambda impl.
    public final void B() {
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete absent valuable.");
            return;
        }
        this.H(((Valuable)this.av.d()), gfqx.a);
    }

    // Detected as a lambda impl.
    public final void D() {
        if(this.N()) {
            this.as.P(((Valuable)this.av.d()), this.aC);
            return;
        }
        this.as.P(((Valuable)this.av.d()), gfqx.a);
    }

    public final void E(gged_interceptors gged0, dvth dvth0, dvsx dvsx0, kij kij0, fshi fshi0) {
        this.ba = gged0;
        this.aX = kij0;
        this.ar = dvth0;
        this.ay = fshi0;
        this.as = dvsx0;
    }

    @Override  // ednc
    public final boolean F() {
        return hwik.o();
    }

    // Detected as a lambda impl.
    public final void G() {
        xob xob0 = (xob)this.getContext();
        if(xob0 != null) {
            if(!this.ag.a()) {
                this.ah.d(xob0.getSupportFragmentManager());
                ((ggtj)ValuableDetailUnifiedFragment.a.h()).x("Attempted to edit valuable with no network connection");
                return;
            }
            if(!this.av.i()) {
                ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit absent valuable");
            }
            Valuable valuable0 = (Valuable)this.av.d();
            switch(valuable0.R.ordinal()) {
                case 1: {
                    this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_LOYALTY_CARD").putExtra("VALUABLE", ((LoyaltyCard)valuable0)).putExtra("window_soft_input_mode", 16).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                    return;
                }
                case 2: {
                    this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_GIFT_CARD").putExtra("VALUABLE", ((GiftCard)valuable0)).putExtra("window_soft_input_mode", 16).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                    return;
                }
                case 9: 
                case 11: {
                    hwuz.d();
                    if(hwuz.c() && dvkx.f(valuable0)) {
                        this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_USER_CREATED_PASS").putExtra("VALUABLE", valuable0).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                    }
                    break;
                }
                default: {
                    ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Editing is not supported for this valuable type");
                }
            }
        }
    }

    final void H(Valuable valuable0, gfsx gfsx0) {
        if((!((Valuable)this.av.d()).i || gfsx0.i() && !((gged_interceptors)gfsx0.d()).isEmpty()) && !this.ag.a()) {
            this.ah.d(this.getChildFragmentManager());
            return;
        }
        dvth dvth0 = this.ar;
        if(dvth0 != null) {
            dvth0.D(valuable0, gfsx0);
        }
    }

    @Override  // dskk
    public final void I() {
    }

    @Override  // dskk
    public final void J(View view0, gtzk gtzk0) {
        dskj.n(this);
    }

    @Override  // dskk
    public final void K() {
    }

    private final gucl L() {
        gucv gucv0 = ((Valuable)this.av.d()).q.j;
        if(gucv0 == null) {
            gucv0 = gucv.a;
        }
        for(Object object0: gucv0.c) {
            gucn gucn0 = (gucn)object0;
            if(gucn0.b == 1) {
                return (gucl)gucn0.c;
            }
        }
        return null;
    }

    @Override  // dskk
    public final void M() {
    }

    private final boolean N() {
        return this.av.i() && !((Valuable)this.av.d()).i && this.aC.i() && !((gged_interceptors)this.aC.d()).isEmpty() && ((gged_interceptors)this.aC.d()).size() > 1;
    }

    private static final boolean O() {
        return hwik.o() && hwev.c();
    }

    @Override  // dskk
    public final void P(View view0, int v) {
    }

    @Override  // dskk
    public final void Q() {
    }

    private static final gfsx R(Context context0, gukv gukv0, gfsx gfsx0) {
        if(!bbqr.d(gukv0.d)) {
            String s = efmo.c(new String[]{gukv0.d});
            if(!bbqr.d(s)) {
                efmj efmj0 = new efmj(context0.getResources(), s);
                int v = context0.getResources().getDimensionPixelSize(0x7F070E3F);  // dimen:pay_wallet_header_logo_size
                Bitmap bitmap0 = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
                Canvas canvas0 = new Canvas(bitmap0);
                efmj0.setBounds(0, 0, v, v);
                efmj0.draw(canvas0);
                frxu frxu0 = new frxu(bitmap0);
                fryv fryv0 = (fryv)gfsx0.g();
                frxp frxp0 = new frxp(0);
                return gfsx.m(new fugt(frxu0, fryv0, null, fugw.c, frxp0));
            }
        }
        return gfqx.a;
    }

    private static final fuat S(int v, int v1, ibth ibth0) {
        return new fuat(new fryr(v), null, new fuaz(new fryh(v1), null, null, fuaw.a), null, 0, null, ibth0, null, null, false, false, true, fule.a);
    }

    @Override  // dskk
    public final void Y() {
    }

    @Override  // dskk
    public final void aC(View view0) {
    }

    @Override  // dskk
    public final void aE() {
    }

    @Override  // dskk
    public final void aF() {
    }

    @Override  // fshi
    public final boolean aI() {
        return this.av.i() && ((Valuable)this.av.d()).M;
    }

    @Override  // fshi
    public final boolean aJ() {
        return true;
    }

    @Override  // fshi
    public final boolean aK() {
        return this.av.i() && ((Valuable)this.av.d()).m;
    }

    @Override  // fshi
    public final boolean aL() {
        return this.av.i() && ((Valuable)this.av.d()).n;
    }

    @Override  // dskk
    public final void aM() {
    }

    @Override  // dskk
    public final void aN() {
    }

    @Override  // dskk
    public final void aO() {
    }

    @Override  // dskk
    public final void aP() {
    }

    @Override  // dskk
    public final void aQ() {
        String s;
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit nickname when no valuable is present.");
            return;
        }
        if(this.bP()) {
            if(!hwvp.c()) {
                ((ggtj)ValuableDetailUnifiedFragment.a.h()).x("Nickname flag is off");
                return;
            }
            Context context0 = this.getContext();
            if(context0 != null && this.an() != null) {
                acp acp0 = this.aZ;
                Valuable valuable0 = (Valuable)this.av.d();
                gucl gucl0 = this.L();
                if(gucl0 == null) {
                    s = null;
                }
                else {
                    guag guag0 = gucl0.c == null ? guag.a : gucl0.c;
                    if(bbqr.d((guag0.e == null ? gunw.a : guag0.e).d)) {
                        s = ((Valuable)this.av.d()).p.e;
                    }
                    else {
                        guag guag1 = gucl0.c == null ? guag.a : gucl0.c;
                        s = (guag1.e == null ? gunw.a : guag1.e).d;
                    }
                }
                acp0.b(new Intent("com.google.android.gms.pay.pass.valuable.view.detail.VIEW_UPDATE_NICKNAME").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("VALUABLE", valuable0).putExtra("VALUABLE_TITLE", s));
            }
            return;
        }
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit nickname when nickname is not supported.");
    }

    @Override  // dskk
    public final void aR() {
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit pass when no valuable is present.");
            return;
        }
        if(!((Valuable)this.av.d()).t) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit pass when editing is not supported.");
            return;
        }
        this.G();
    }

    @Override  // dskk
    public final void aS() {
    }

    @Override  // dskk
    public final void aU() {
    }

    @Override  // dskk
    public final void aV(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void aW() {
    }

    @Override  // dskk
    public final void aY(Parcelable parcelable0) {
    }

    @Override  // dskk
    public final void aZ() {
    }

    @Override  // dskk
    public final void aa(gtzk gtzk0) {
    }

    @Override  // dskk
    public final void ab() {
    }

    @Override  // dskk
    public final void ac(View view0, gtzk gtzk0) {
        dskj.o(this);
    }

    @Override  // dskk
    public final void ad(View view0, gtzk gtzk0) {
    }

    @Override  // fshi
    public final void af(boolean z, fshh fshh0) {
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to set notifications enabled/disabled when no valuable is present.");
            return;
        }
        Valuable valuable0 = (Valuable)this.av.d();
        azts azts0 = this.aA;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjq.a).v_newBuilder();
        String s = this.b.name;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq0 = (ftjq)hftp0.b_message;
        s.getClass();
        ftjq0.d = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftgd.a).v_newBuilder();
        String s1 = valuable0.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s1.getClass();
        ((ftgd)hftv0).b = s1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ftgd)hftp1.b_message).c = (z ? 3 : 4) - 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftjq ftjq1 = (ftjq)hftp0.b_message;
        ftgd ftgd0 = (ftgd)hftp1.N_build();
        ftgd0.getClass();
        ftjq1.c = ftgd0;
        ftjq1.b = 10;
        evql evql0 = azts0.bf(((ftjq)hftp0.N_build()).toBytesArray());
        evql0.b(new dvvg(this, valuable0, z, fshh0));
        evql0.A(new dvvh(valuable0));
    }

    @Override  // dskk
    public final void ag() {
    }

    @Override  // fshi
    public final void ah(boolean z, fshh fshh0) {
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to set wallet surfacing state when no valuable is present.");
            return;
        }
        if(!this.ag.a()) {
            xob xob0 = this.an();
            if(xob0 != null) {
                this.ah.d(xob0.getSupportFragmentManager());
            }
            ((ggtj)ValuableDetailUnifiedFragment.a.h()).x("Attempted to set wallet surfacing state with no network connection");
            return;
        }
        Valuable valuable0 = (Valuable)this.av.d();
        if(!valuable0.n) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to set wallet surfacing state when it\'s not supported, this shouldn\'t happen!");
            return;
        }
        boolean z1 = valuable0.m;
        SetWalletItemSurfacingEnabledRequest setWalletItemSurfacingEnabledRequest0 = new SetWalletItemSurfacingEnabledRequest();
        setWalletItemSurfacingEnabledRequest0.a = this.b;
        setWalletItemSurfacingEnabledRequest0.b = z;
        setWalletItemSurfacingEnabledRequest0.c = valuable0.b;
        valuable0.m = z;
        fshh0.f(z);
        this.aA.bu(setWalletItemSurfacingEnabledRequest0).A(new dvvu(this, valuable0, z1, fshh0));
    }

    @Override  // dskk
    public final void ai() {
    }

    @Override  // dskk
    public final void aj() {
    }

    @Override  // dskk
    public final void ax(gtzk gtzk0) {
        if(!hwkw.d()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Default showDetail implementation; taking no action");
            return;
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        ((xob)context0).startActivity(dlnf.be(context0, (gtzk0.b == 2 ? ((String)gtzk0.c) : ""), dlnd.d));
    }

    @Override  // fshg
    public final gfsx bA() {
        return this.av.i() ? gfsx.m(((Valuable)this.av.d()).c) : gfqx.a;
    }

    @Override  // fshi
    public final boolean bB() {
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("requireAuthForTransitPurchaseSupported implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshi
    public final boolean bC() {
        return this.av.i() && ((Valuable)this.av.d()).F;
    }

    @Override  // fshi
    public final boolean bD() {
        return this.av.i() && ((Valuable)this.av.d()).z();
    }

    @Override  // fshi
    public final boolean bE() {
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("unlockToTapEnabled implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshi
    public final boolean bF() {
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("unlockToTapSupported implementation in valuable detail bottom sheet not supported, returning false");
        return false;
    }

    @Override  // fshg
    public final gfsx bG() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bH() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gged_interceptors bI() {
        return ggna.a;
    }

    @Override  // fshg
    public final gged_interceptors bJ() {
        return this.aq.b ? this.ba : ggna.a;
    }

    @Override  // fshg
    public final guut bK() {
        return guut.a;
    }

    @Override  // fshg
    public final String bL() {
        return this.av.i() ? ((Valuable)this.av.d()).b : "";
    }

    @Override  // fshg
    public final boolean bN() {
        return true;
    }

    @Override  // fshg
    public final boolean bO() {
        return hwvp.c() && this.av.i() && ((Valuable)this.av.d()).q().booleanValue();
    }

    @Override  // fshg
    public final boolean bP() {
        return hwvp.c() && this.av.i() && ((Valuable)this.av.d()).P != 10;
    }

    @Override  // fshg
    public final boolean bQ() {
        return hwvp.c() && this.av.i() && ((Valuable)this.av.d()).t;
    }

    @Override  // fshg
    public final boolean bR() {
        return this.av.i() && ((Valuable)this.av.d()).G;
    }

    @Override  // fshg
    public final boolean bS() {
        return this.av.i() && ((Valuable)this.av.d()).F;
    }

    @Override  // fshg
    public final boolean bT() {
        return this.av.i() && ((Valuable)this.av.d()).z();
    }

    @Override  // dskk
    public final void ba() {
    }

    @Override  // dskk
    public final void bb() {
    }

    @Override  // dskk
    public final void bc() {
    }

    @Override  // dskk
    public final void bd() {
    }

    @Override  // dskk
    public final void be() {
    }

    @Override  // dskk
    public final void bf() {
        dskj.a(this);
    }

    @Override  // dskk
    public final void bg(gtzk gtzk0) {
        dskj.b(this);
    }

    @Override  // dskk
    public final void bh() {
        dskj.c(this);
    }

    @Override  // dskk
    public final void bi() {
        dskj.d(this);
    }

    @Override  // dskk
    public final void bj() {
        dskj.e(this);
    }

    @Override  // dskk
    public final void bk(gtzk gtzk0) {
        dskj.f(this, gtzk0);
    }

    @Override  // dskk
    public final void bl() {
        dskj.g(this);
    }

    @Override  // dskk
    public final void bm() {
        dskj.h(this);
    }

    @Override  // dskk
    public final void bn() {
        dskj.i(this);
    }

    @Override  // dskk
    public final void bo() {
        dskj.j(this);
    }

    @Override  // dskk
    public final void bp(gtzk gtzk0) {
        dskj.k(this, gtzk0);
    }

    @Override  // dskk
    public final void bq() {
    }

    @Override  // dskk
    public final void br() {
        dskj.l(this);
    }

    @Override  // dskk
    public final void bs() {
        dskj.m(this);
    }

    @Override  // fshg
    public final gfsx bt() {
        return this.av.i() ? ((Valuable)this.av.d()).bt() : gfqx.a;
    }

    @Override  // fshg
    public final gfsx bu() {
        return this.av.i() ? ((Valuable)this.av.d()).bu() : gfqx.a;
    }

    @Override  // fshi
    public final void bv(boolean z, fshh fshh0) {
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("requireAuthForTransitPurchaseSupported implementation in valuable detail bottom sheet not supported, calling error callback");
        fshh0.g();
    }

    @Override  // fshi
    public final void bw(boolean z, fshh fshh0) {
        if(!this.av.i()) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to set smart tap enabled/disabled when no valuable is present.");
            fshh0.f(false);
            return;
        }
        Valuable valuable0 = (Valuable)this.av.d();
        boolean z1 = valuable0.F;
        evql evql0 = this.aA.bt(this.b, valuable0.b, z);
        evql0.b(new dvvv(this, valuable0, z, fshh0));
        evql0.A(new dvvw(valuable0, fshh0, z1));
    }

    @Override  // fshi
    public final void bx(boolean z, fshh fshh0) {
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("setUnlockToTapEnabled implementation in valuable detail bottom sheet not supported, calling error callback");
        fshh0.g();
    }

    @Override  // fshg
    public final gfsx by() {
        return gfqx.a;
    }

    @Override  // fshg
    public final gfsx bz() {
        return gfqx.a;
    }

    @Override  // eflx
    public final void g(int v, int v1, Parcelable parcelable0) {
        switch(v1) {
            case 1000: {
                break;
            }
            case 1001: {
                dsio dsio0 = this.al;
                dsik dsik0 = new dsik("share_education_dialog");
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)donh.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((donh)hftp0.b_message).c = true;
                dsio0.b(dsik0, ((donh)hftp0.N_build()));
                break;
            }
            default: {
                ((ggtj)ValuableDetailUnifiedFragment.a.i()).z("Received unexpected request code: %d", v1);
            }
        }
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dxed dxed0 = dxee.a(doly0);
        done done0 = new done();
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        dvqm dvqm0 = new dvqm(dolg0, dxed0, done0, doly0, domv0);
        this.az.f(dvqm0);
        dvqm0.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        Object object1;
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Valuable detail sheet args were null. Set template info and pass color profile");
            this.aE = true;
        }
        else {
            if(bundle1.getParcelable("VALUABLE") != null) {
                this.av = gfsx.l(((Valuable)bundle1.getParcelable("VALUABLE")));
            }
            this.aC = gfsx.l(gged_interceptors.i(bundle1.getStringArrayList("GROUP_ID")));
            this.aD = bundle1.getBoolean("VALUABLE_DETAIL_UNIFIED_SHOULD_SHOW_APP_BAR");
            this.au = fsce.a(this.getContext()) ? ((Valuable)this.av.d()).c() : ((Valuable)this.av.d()).b();
            gucv gucv0 = ((Valuable)this.av.d()).q.j;
            if(gucv0 == null) {
                gucv0 = gucv.a;
            }
            this.at = gucv0.f == null ? gucj.a : gucv0.f;
            if(this.ak.a.a.equals(fuor.b)) {
                gucl gucl0 = this.L();
                Object object0 = null;
                if(gucl0 == null) {
                    object1 = null;
                }
                else {
                    guag guag0 = gucl0.c == null ? guag.a : gucl0.c;
                    if(bbqr.d((guag0.g == null ? gunw.a : guag0.g).d)) {
                        object1 = ((Valuable)this.av.d()).p.e;
                    }
                    else {
                        guag guag1 = gucl0.c == null ? guag.a : gucl0.c;
                        object1 = (guag1.g == null ? gunw.a : guag1.g).d;
                    }
                }
                this.aU = gfsx.l(object1);
                gucl gucl1 = this.L();
                if(gucl1 != null) {
                    object0 = (gucl1.c == null ? guag.a : gucl1.c).c;
                    if(object0 == null) {
                        object0 = gukv.a;
                    }
                }
                this.aV = gfsx.l(object0);
            }
        }
        this.aY = this.registerForActivityResult(new adt(), new dvvz(this));
        this.aZ = this.registerForActivityResult(new adt(), new dvvb(this));
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        guzd guzd0;
        fule fule0;
        int v5;
        gfsx gfsx1;
        int v;
        if(ValuableDetailUnifiedFragment.O()) {
            v = 0x7F0E0DED;  // layout:wallet_valuable_detail_unified_fragment
        }
        else {
            v = hwik.o() ? 0x7F0E0DEE : 0x7F0E0DEF;  // layout:wallet_valuable_detail_unified_fragment_pre_bc25
        }
        View view0 = layoutInflater0.inflate(v, viewGroup0, false);
        this.aw = (ValuableDetailTemplate)view0.findViewById(0x7F0B032C);  // id:DetailTemplate
        this.aF = (RelativeLayout)view0.findViewById(0x7F0B03BB);  // id:ErrorLayout
        this.aG = (Button)view0.findViewById(0x7F0B03BD);  // id:ErrorPositiveButton
        this.aW = (NestedScrollView)view0.findViewById(0x7F0B0274);  // id:DetailBackdrop
        this.ax = (TextView)view0.findViewById(0x7F0B0965);  // id:UpdateNoticeDetails
        this.aT = (ComposeViewHeader)view0.findViewById(0x7F0B0995);  // id:ViewHeader
        if(this.aD) {
            AppBarLayout appBarLayout0 = (AppBarLayout)view0.findViewById(0x7F0B0080);  // id:AppBar
            this.aH = appBarLayout0;
            appBarLayout0.setVisibility(0);
            ImageButton imageButton0 = (ImageButton)view0.findViewById(0x7F0B00AF);  // id:BackButton
            this.aI = imageButton0;
            imageButton0.setVisibility(0);
            this.aI.setOnClickListener(new dvvi(this));
            Context context0 = this.getContext();
            if(context0 != null) {
                int v1 = fipw.a.a(context0);
                int v2 = fipw.c.a(context0);
                this.aH.setBackgroundColor(v1);
                AppBarLayout appBarLayout1 = this.aH;
                ColorStateList colorStateList0 = ColorStateList.valueOf(v2);
                if(appBarLayout1.h != colorStateList0) {
                    appBarLayout1.h = colorStateList0;
                    appBarLayout1.setBackground(appBarLayout1.getBackground());
                }
            }
            NestedScrollView nestedScrollView0 = this.aW;
            nestedScrollView0.e = new dvvj(context0);
            fryu fryu0 = this.aU.i() ? new fryu(((String)this.aU.d())) : new fryu("");
            ComposeViewHeader composeViewHeader0 = this.aT;
            Context context1 = this.getContext();
            if(context1 != null && this.aV.i()) {
                gukv gukv0 = (gukv)this.aV.d();
                if((gukv0.b & 1) == 0) {
                    gfsx gfsx2 = bbqr.d(gukv0.e) ? gfqx.a : gfsx.m(new fryu(gukv0.e));
                    gfsx1 = ValuableDetailUnifiedFragment.R(context1, gukv0, gfsx2);
                }
                else {
                    guez guez0 = gukv0.f == null ? guez.a : gukv0.f;
                    gfsx gfsx0 = bbqr.d(guez0.e) ? gfqx.a : gfsx.m(new fryu(guez0.e));
                    dsop dsop0 = this.ap.a(guez0, context1, new dsoo());
                    fryk fryk0 = dsop0.a;
                    if(fryk0 == new fryh(0)) {
                        gfsx1 = ValuableDetailUnifiedFragment.R(context1, gukv0, gfsx0);
                    }
                    else {
                        fryv fryv0 = (fryv)gfsx0.g();
                        frxp frxp0 = new frxp(-1);
                        gfsx1 = gfsx.m(new fugt(fryk0, fryv0, dsop0.b, fugw.c, frxp0));
                    }
                }
            }
            else {
                gfsx1 = gfqx.a;
            }
            composeViewHeader0.b(new fuhm(((fugv)gfsx1.g()), fryu0, null));
            this.aT.setVisibility(0);
        }
        else {
            this.aW.e = this.aX;
            this.aT.setVisibility(8);
        }
        if(this.av.i()) {
            if(hwvp.c() || !((Valuable)this.av.d()).t) {
                Valuable valuable0 = (Valuable)this.av.d();
                hwuz.d();
                if(hwuz.c() && dvkx.f(valuable0)) {
                    goto label_68;
                }
            }
            else {
            label_68:
                if(ValuableDetailUnifiedFragment.O()) {
                    RowSecondary rowSecondary0 = (RowSecondary)view0.findViewById(0x7F0B037E);  // id:EditRowSecondary
                    this.aO = rowSecondary0;
                    rowSecondary0.h(ValuableDetailUnifiedFragment.S(0x7F150823, 0x7F080561, new dvvn(this)));  // string:common_edit "Edit"
                    this.aO.setVisibility(0);
                }
                else {
                    View view1 = view0.findViewById(0x7F0B0379);  // id:EditButton
                    view1.setVisibility(0);
                    view1.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                        xob xob0 = (xob)this.getContext();
                        if(xob0 != null) {
                            if(!this.ag.a()) {
                                this.ah.d(xob0.getSupportFragmentManager());
                                ((ggtj)ValuableDetailUnifiedFragment.a.h()).x("Attempted to edit valuable with no network connection");
                                return;
                            }
                            if(!this.av.i()) {
                                ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to edit absent valuable");
                            }
                            Valuable valuable0 = (Valuable)this.av.d();
                            switch(valuable0.R.ordinal()) {
                                case 1: {
                                    this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_LOYALTY_CARD").putExtra("VALUABLE", ((LoyaltyCard)valuable0)).putExtra("window_soft_input_mode", 16).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                                    return;
                                }
                                case 2: {
                                    this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_GIFT_CARD").putExtra("VALUABLE", ((GiftCard)valuable0)).putExtra("window_soft_input_mode", 16).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                                    return;
                                }
                                case 9: 
                                case 11: {
                                    hwuz.d();
                                    if(hwuz.c() && dvkx.f(valuable0)) {
                                        this.aY.b(new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.edit.VIEW_VALUABLE_EDIT_USER_CREATED_PASS").putExtra("VALUABLE", valuable0).setClassName(xob0, "com.google.android.gms.pay.main.PayActivity"));
                                    }
                                    break;
                                }
                                default: {
                                    ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Editing is not supported for this valuable type");
                                }
                            }
                        }
                    });
                }
            }
            Valuable valuable1 = (Valuable)this.av.d();
            if(valuable1.P != 10) {
                switch(valuable1.R.ordinal()) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: {
                        boolean z = ((Valuable)this.av.d()).u;
                        int v3 = 0x7F15231E;  // string:pay_valuable_archive_all "Archive all"
                        int v4 = 0x7F15231D;  // string:pay_valuable_archive "Archive"
                        if(ValuableDetailUnifiedFragment.O()) {
                            if(!this.N()) {
                                if(z) {
                                    v5 = 1;
                                    v3 = 0x7F15231D;  // string:pay_valuable_archive "Archive"
                                }
                                else {
                                    v5 = 0;
                                    v3 = 0x7F152349;  // string:pay_valuable_unarchive "Unarchive"
                                }
                            }
                            else if(z) {
                                v5 = 1;
                            }
                            else {
                                v5 = 0;
                                v3 = 0x7F15234A;  // string:pay_valuable_unarchive_all "Unarchive all"
                            }
                            RowSecondary rowSecondary1 = (RowSecondary)view0.findViewById(0x7F0B0092);  // id:ArchiveRowSecondary
                            this.aP = rowSecondary1;
                            rowSecondary1.h(ValuableDetailUnifiedFragment.S(v3, (1 == v5 ? 0x7F0804CE : 0x7F080667), new dvvq(this)));  // drawable:gs_archive_vd_theme_48
                            this.aP.setVisibility(0);
                        }
                        else {
                            this.aL = view0.findViewById(0x7F0B008F);  // id:ArchiveButton
                            this.aM = (TextView)view0.findViewById(0x7F0B0091);  // id:ArchiveButtonText
                            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B0090);  // id:ArchiveButtonImage
                            this.aN = imageView0;
                            imageView0.setImageResource((z ? 0x7F0804CE : 0x7F080667));  // drawable:gs_archive_vd_theme_48
                            if(this.N()) {
                                TextView textView0 = this.aM;
                                if(!z) {
                                    v3 = 0x7F15234A;  // string:pay_valuable_unarchive_all "Unarchive all"
                                }
                                textView0.setText(this.getString(v3));
                                this.aL.setContentDescription(this.getString((z ? 0x7F15231F : 0x7F15234B)));  // string:pay_valuable_archive_all_content_description "Archive all button"
                            }
                            else {
                                TextView textView1 = this.aM;
                                if(!z) {
                                    v4 = 0x7F152349;  // string:pay_valuable_unarchive "Unarchive"
                                }
                                textView1.setText(this.getString(v4));
                                this.aL.setContentDescription(this.getString((z ? 0x7F152320 : 0x7F15234C)));  // string:pay_valuable_archive_content_description "Archive button"
                            }
                            this.aL.setVisibility(0);
                            this.aL.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                                if(this.N()) {
                                    this.as.P(((Valuable)this.av.d()), this.aC);
                                    return;
                                }
                                this.as.P(((Valuable)this.av.d()), gfqx.a);
                            });
                        }
                    }
                }
            }
            if(ValuableDetailUnifiedFragment.O()) {
                RowSecondary rowSecondary2 = (RowSecondary)view0.findViewById(0x7F0B071F);  // id:RemoveRowSecondary
                this.aQ = rowSecondary2;
                rowSecondary2.h(ValuableDetailUnifiedFragment.S(0x7F1508C6, 0x7F08053D, new dvva(this)));  // string:common_remove "Remove"
                if(this.N()) {
                    RowSecondary rowSecondary3 = (RowSecondary)view0.findViewById(0x7F0B0719);  // id:RemoveAllRowSecondary
                    this.aR = rowSecondary3;
                    rowSecondary3.h(ValuableDetailUnifiedFragment.S(0x7F15232A, 0x7F08053D, new dvvl(this)));  // string:pay_valuable_delete_all "Remove all"
                    this.aR.setVisibility(0);
                }
            }
            else {
                View view2 = view0.findViewById(0x7F0B071A);  // id:RemoveButton
                this.aJ = view2;
                view2.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                    if(!this.av.i()) {
                        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete absent valuable.");
                        return;
                    }
                    this.H(((Valuable)this.av.d()), gfqx.a);
                });
                if(this.N()) {
                    View view3 = view0.findViewById(0x7F0B0717);  // id:RemoveAllButton
                    this.aK = view3;
                    view3.setVisibility(0);
                    this.aK.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                        if(this.aC.i() && !((gged_interceptors)this.aC.d()).isEmpty()) {
                            if(!this.av.i()) {
                                ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete absent valuable.");
                                return;
                            }
                            this.H(((Valuable)this.av.d()), this.aC);
                            return;
                        }
                        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete all valuables when none are present.");
                    });
                }
            }
            if(ValuableDetailUnifiedFragment.O()) {
                LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B0129);  // id:ButtonsContainer
                IntStream intStream0 = IntStream.-CC.range(0, linearLayout0.getChildCount());
                Objects.requireNonNull(linearLayout0);
                Stream stream0 = intStream0.mapToObj(new dvvc(linearLayout0)).filter(new dvvd());
                Objects.requireNonNull(RowSecondary.class);
                Stream stream1 = stream0.filter(new dvve(RowSecondary.class));
                Objects.requireNonNull(RowSecondary.class);
                gged_interceptors gged0 = (gged_interceptors)stream1.map(new dvvf(RowSecondary.class)).collect(ggaf.a);
                for(int v6 = 0; v6 < gged0.size(); ++v6) {
                    RowSecondary rowSecondary4 = (RowSecondary)gged0.get(v6);
                    fuat fuat0 = rowSecondary4.g();
                    if(v6 != 0) {
                        fule0 = v6 == gged0.size() - 1 ? fule.d : fule.c;
                    }
                    else if(gged0.size() == 1) {
                        fule0 = fule.a;
                    }
                    else {
                        fule0 = fule.b;
                    }
                    rowSecondary4.h(new fuat(fuat0.a, fuat0.b, fuat0.c, fuat0.d, fuat0.e, fuat0.f, fuat0.g, fuat0.h, fuat0.i, fuat0.j, fuat0.k, fuat0.l, fule0));
                }
                this.aS = (DisclaimerText)view0.findViewById(0x7F0B0362);  // id:DisclaimerText
                if(((Valuable)this.av.d()).P == 9) {
                    fryr fryr0 = new fryr((((Valuable)this.av.d()).y() ? 0x7F152362 : 0x7F15232D));  // string:pay_visual_inspection_valuable_disclaimer "The transit agency activates your 
                                                                                                     // pass. If there are any issues activating or accessing your pass, contact the transit 
                                                                                                     // agency."
                    this.aS.a(new ftwn(fryr0, ftwo.c));
                    this.aS.setVisibility(0);
                }
                else if(((Valuable)this.av.d()).P == 10 && ((Valuable)this.av.d()).w()) {
                    this.aS.a(new ftwn(new fryr(0x7F151E76), ftwo.c));  // string:pay_gmail_imported_flight_reservation_pass_disclaimer "The flights listed 
                                                                        // are based on information provided in your email. There may be other flights associated 
                                                                        // with this reservation. Refer to the original reservation for full details."
                    this.aS.setVisibility(0);
                }
                else {
                    this.aS.setVisibility(8);
                }
            }
            Context context2 = this.requireContext();
            if(((Valuable)this.av.d()).R == guwf.k) {
                new dyab(this.b, this.c).a(((Valuable)this.av.d()).b, new dvvk(this, context2));
            }
            if(this.am.booleanValue() && ((Valuable)this.av.d()).R == guwf.m) {
                gveu gveu0 = ((Valuable)this.av.d()).a;
                switch((gveu0.b == 12 ? ((guzc)gveu0.c) : guzc.a).h) {
                    case 0: {
                        guzd0 = guzd.a;
                        break;
                    }
                    case 1: {
                        guzd0 = guzd.b;
                        break;
                    }
                    case 2: {
                        guzd0 = guzd.c;
                        break;
                    }
                    case 3: {
                        guzd0 = guzd.d;
                        break;
                    }
                    case 4: {
                        guzd0 = guzd.e;
                        break;
                    }
                    default: {
                        guzd0 = null;
                    }
                }
                if(guzd0 == null) {
                    guzd0 = guzd.f;
                }
                if(ValuableDetailUnifiedFragment.aB.contains(guzd0)) {
                    View view4 = view0.findViewById(0x7F0B0554);  // id:LogoutButton
                    ((TextView)view0.findViewById(0x7F0B0555)).setText(this.getString(0x7F152339));  // id:LogoutButtonText
                    view4.setVisibility(0);
                    view4.setOnClickListener(new dvvm());
                }
            }
        }
        if(hwik.o()) {
            int v7 = this.getResources().getDimensionPixelSize(0x7F070DED);  // dimen:pay_large_spacing
            fuop.c(this.ao, this.aW, v7);
        }
        fhvo fhvo0 = this.an.a.a(214809);
        if(this.av.i()) {
            Valuable valuable2 = (Valuable)this.av.d();
            guvj guvj0 = valuable2.r;
            if(guvj0 == guvj.f || guvj0 == guvj.g) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkbg.a).v_newBuilder();
                String s = valuable2.b;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                s.getClass();
                ((gkbg)hftv0).b |= 4;
                ((gkbg)hftv0).e = s;
                String s1 = valuable2.p.c;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                s1.getClass();
                ((gkbg)hftv1).b |= 8;
                ((gkbg)hftv1).f = s1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkbg gkbg0 = (gkbg)hftp0.b_message;
                gkbg0.d = guvj0.a();
                gkbg0.b |= 2;
                if(valuable2.k().i()) {
                    int v8 = (int)(((Integer)valuable2.k().d()));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gkbg gkbg1 = (gkbg)hftp0.b_message;
                    gkbg1.b |= 1;
                    gkbg1.c = v8;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjdw.a).v_newBuilder();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gkbe.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gkbe gkbe0 = (gkbe)hftp2.b_message;
                gkbg gkbg2 = (gkbg)hftp0.N_build();
                gkbg2.getClass();
                gkbe0.k = gkbg2;
                gkbe0.b |= 0x100;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjdw gjdw0 = (gjdw)hftp1.b_message;
                gkbe gkbe1 = (gkbe)hftp2.N_build();
                gkbe1.getClass();
                gjdw0.m = gkbe1;
                gjdw0.b |= 0x8000;
                fhvo0.d(douf.b(((gjdw)hftp1.N_build())));
            }
        }
        this.an.h(view0, fhvo0);
        return view0;
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        gucj gucj0 = this.at;
        if(gucj0 != null) {
            bundle0.putByteArray("pass_detail_template_info", gucj0.toBytesArray());
        }
        gubi gubi0 = this.au;
        if(gubi0 != null) {
            bundle0.putByteArray("pass_color_profile", gubi0.toBytesArray());
        }
        if(this.aV.i()) {
            bundle0.putByteArray("pass_logo", ((gukv)this.aV.d()).toBytesArray());
        }
        if(this.aU.i()) {
            bundle0.putString("pass_title", ((String)this.aU.d()));
        }
    }

    @Override  // du
    public final void onStart() {
        super.onStart();
        if(this.aE) {
            this.aw.setVisibility(8);
            this.aF.setVisibility(0);
            this.aG.setOnClickListener(new dvvp(this));
            return;
        }
        this.aw.i(this, gfqx.a);
        this.aw.l(gged_interceptors.i(this.at.c), this.au, this, this, this, this.d);
    }

    public static ValuableDetailUnifiedFragment y(gged_interceptors gged0, Valuable valuable0, boolean z) {
        ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0 = new ValuableDetailUnifiedFragment();
        Bundle bundle0 = new Bundle();
        bundle0.putStringArrayList("GROUP_ID", new ArrayList(gged0));
        bundle0.putParcelable("VALUABLE", valuable0);
        bundle0.putBoolean("VALUABLE_DETAIL_UNIFIED_SHOULD_SHOW_APP_BAR", z);
        valuableDetailUnifiedFragment0.setArguments(bundle0);
        return valuableDetailUnifiedFragment0;
    }

    // Detected as a lambda impl.
    public final void z() {
        if(this.aC.i() && !((gged_interceptors)this.aC.d()).isEmpty()) {
            if(!this.av.i()) {
                ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete absent valuable.");
                return;
            }
            this.H(((Valuable)this.av.d()), this.aC);
            return;
        }
        ((ggtj)ValuableDetailUnifiedFragment.a.i()).x("Attempted to delete all valuables when none are present.");
    }
}

