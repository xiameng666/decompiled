import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import j..util.Objects;

public final class aahd extends aala {
    public final aahb a;
    public fntt ag;
    final aaha ah;
    public SwipeRefreshLayout ai;
    acp aj;
    acn ak;
    acp al;
    acn am;
    public aauk an;
    public aamn b;
    public AccessibilityManager c;
    public fnlf d;

    public aahd() {
        this.ah = new aaha(this);
        if(hoju.o()) {
            this.am = new aagj(this);
            this.ak = new aagr(this);
        }
        this.a = new aahb(this);
    }

    final aape A() {
        int v = ((CardDeckView)this.aq).aM().L();
        View view0 = ((CardDeckView)this.aq).aM().S(v);
        return view0 == null ? aape.a : new aape(v, view0.getTop());
    }

    @Override  // aalb
    public final boolean E(grul grul0) {
        return (grul0.b & 0x20) != 0;
    }

    @Override  // aakz
    public final grxw fT() {
        return this.b.c();
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        switch(v) {
            case 9: {
                this.b.g();
                return;
            }
            case 10: {
                if(v1 == -1) {
                    if(intent0 != null && intent0.hasExtra("authAccount")) {
                        String s = intent0.getStringExtra("authAccount");
                        aamn aamn0 = this.b;
                        gftb.check(s);
                        aamn0.e(s);
                        return;
                    }
                    v1 = -1;
                }
                v = 10;
            }
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        ((aahc)zgm.a(aahc.class, this)).b(this);
        if(hoju.j() || aald.b(context0) || !aabu.q(this.requireContext())) {
            this.b.d.g(this, new aagt(this));
        }
        this.b.j.g(this, new aagw(this));
        this.b.l.g(this, new aagx(this));
        this.b.m.g(this, new aagy(this));
        this.b.c.g(this, new aafz(this));
        this.b.b.d.g(this, new aaga(this));
        this.b.h.g(this, new aagb(this));
        if(!hoju.j()) {
            this.b.e.g(this, new aagc(this));
        }
        this.b.f.g(this, new aagd(this));
        this.b.g.g(this, new aage(this));
        fhrx.b(this.b.i, this, new aagu(this));
        if(hoju.p()) {
            lsa.a(this.b.k).g(this, new aagv(this));
        }
        if(hoju.k()) {
            this.getLifecycle().c(this.ag);
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate((hoju.j() ? 0x7F0E00C9 : 0x7F0E00CA), viewGroup0, false);  // layout:as_card_screen_fragment
        SwipeRefreshLayout swipeRefreshLayout0 = (SwipeRefreshLayout)view0.findViewById(0x7F0B21F4);  // id:swipe_refresh_layout
        this.ai = swipeRefreshLayout0;
        cchs.g(swipeRefreshLayout0, 0x1010031);
        SwipeRefreshLayout swipeRefreshLayout1 = this.ai;
        aamn aamn0 = this.b;
        Objects.requireNonNull(aamn0);
        swipeRefreshLayout1.a = new aagf(aamn0);
        this.ai.o(this.ai.i);
        this.aq = (aabx)view0.findViewById(0x7F0B0E57);  // id:cards_list
        CardDeckView cardDeckView0 = (CardDeckView)this.aq;
        cardDeckView0.ac = new aagg(this);
        cardDeckView0.ad = new aagh(this);
        cardDeckView0.ai = new aagi(this);
        cardDeckView0.ae = new aagk(this);
        aamn aamn1 = this.b;
        Objects.requireNonNull(aamn1);
        cardDeckView0.af = new aagl(aamn1);
        CardDeckView cardDeckView1 = (CardDeckView)this.aq;
        aamn aamn2 = this.b;
        Objects.requireNonNull(aamn2);
        cardDeckView1.ag = new aagm(aamn2);
        CardDeckView cardDeckView2 = (CardDeckView)this.aq;
        aamn aamn3 = this.b;
        Objects.requireNonNull(aamn3);
        cardDeckView2.ah = new aagn(aamn3);
        ((CardDeckView)this.aq).ao(new aafx());
        if(hoju.k()) {
            CardDeckView cardDeckView3 = (CardDeckView)this.aq;
            cardDeckView3.av = this;
            aamn aamn4 = this.b;
            Objects.requireNonNull(aamn4);
            cardDeckView3.ak = new aago(aamn4);
        }
        ccho.a(this.aq);
        this.F(bundle0);
        return view0;
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        if(hoju.k()) {
            this.d.d(this.ah);
        }
    }

    @Override  // aakz
    public final void onResume() {
        super.onResume();
        if(hoju.k()) {
            this.d.c(this.ah);
            gged_interceptors gged0 = this.d.f();
            this.ah.a(gged0);
        }
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        if(hoju.o()) {
            acn acn0 = this.am;
            if(acn0 != null && this.ak != null) {
                this.al = this.registerForActivityResult(new aabo(), ((acn)Objects.requireNonNull(acn0)));
                this.aj = this.registerForActivityResult(new aacj(), ((acn)Objects.requireNonNull(this.ak)));
            }
        }
    }

    @Override  // aala
    protected final int y() {
        return ((CardDeckView)this.aq).getResources().getDimensionPixelSize(0x7F07017B);  // dimen:as_card_deck_vertical_padding
    }

    public static aahd z(aami aami0) {
        aahd aahd0 = new aahd();
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("screenKey", aami0.a.toBytesArray());
        aahd0.setArguments(bundle0);
        return aahd0;
    }
}

