import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.List;

public final class fmof extends tk {
    private final List a;
    private final fmqf e;
    private final fmrq f;
    private final fmid g;
    private final ue h;
    private final AccountContext i;
    private final fmga j;

    public fmof(List list0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, ue ue0, AccountContext accountContext0, fmga fmga0) {
        this.a = list0;
        this.e = fmqf0;
        this.f = fmrq0;
        this.g = fmid0;
        this.h = ue0;
        this.i = accountContext0;
        this.j = fmga0;
    }

    @Override  // tk
    public final int b() {
        return this.a.size();
    }

    @Override  // tk
    public final int dx(int v) {
        switch(((fmmo)this.a.get(v)).b().ordinal()) {
            case 0: {
                return 10;
            }
            case 2: {
                return 14;
            }
            case 3: {
                return 9;
            }
            case 4: {
                return 13;
            }
            case 5: {
                return 11;
            }
            case 6: {
                return 12;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        int v1 = fmrk.a(v);
        Context context0 = viewGroup0.getContext();
        if(v1 != 0) {
            switch(v1 - 1) {
                case 9: {
                    fmnm fmnm0 = new fmnm(context0);
                    fmnm0.aq(this.h);
                    return new fmob(fmnm0, new fmnl(this.e, this.f, false), new fmnx(this));
                }
                case 10: {
                    TextView textView0 = new TextView(context0);
                    textView0.setFocusable(true);
                    return new fmoc(textView0);
                }
                case 11: {
                    fmmt fmmt0 = new fmmt(context0);
                    fmmt0.aq(this.h);
                    return new fmny(fmmt0, new fmms(this.e, this.f), new GridLayoutManager(5));
                }
                case 12: {
                    return new fmoa(new fmnc(context0));
                }
                case 13: {
                    return new fmnz(new fmmv(context0));
                }
                case 14: {
                    fmok fmok0 = new fmok(context0);
                    fmok0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    return new fmod(fmok0);
                }
                default: {
                    throw new IllegalArgumentException("UIElement type is unknown, cannot create ViewHolder");
                }
            }
        }
        throw null;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        int v7;
        fmmo fmmo0 = (fmmo)this.a.get(v);
        int v1 = fmrk.a(uq0.f);
        if(v1 == 0) {
            throw null;
        }
        int v2 = 8;
        int v3 = 0;
        switch(v1 - 1) {
            case 9: {
                fmnm fmnm0 = ((fmob)uq0).t;
                fmnl fmnl0 = ((fmob)uq0).u;
                LinearLayoutManager linearLayoutManager0 = ((fmob)uq0).v;
                int v4 = fmmo0.a.f().c;
                linearLayoutManager0.ab((v4 == 1 ? 0 : 1));
                linearLayoutManager0.ac(flbb.b(fmnm0.getContext()) && v4 == 1);
                linearLayoutManager0.s(v4 == 1);
                gfsx gfsx0 = fmmo0.a.f().d;
                boolean z = gfsx0.i() && ((int)(((Integer)gfsx0.d()))) == 1;
                fmnl0.a = z;
                fmnl0.f(fmmo0.a.f().b);
                if(!fmnl0.n() && v4 != 0) {
                    fmnm0.setVisibility(0);
                }
                else {
                    fmnm0.setVisibility(8);
                }
                if(z) {
                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)fmnm0.getLayoutParams();
                    frameLayout$LayoutParams0.width = -1;
                    fmnm0.setLayoutParams(frameLayout$LayoutParams0);
                }
                fmnm0.an(fmnl0);
                fmnm0.ap(linearLayoutManager0);
                fmnm0.A(new fmnw(fmnm0.getContext().getResources().getDimensionPixelSize((v4 == 1 ? 0x7F070FBF : 0x7F070FC3))));  // dimen:rich_card_button_horizontal_spacing
                break;
            }
            case 10: {
                TextView textView0 = ((fmoc)uq0).t;
                int v5 = 0x7F0402F7;  // attr:colorOnSurface
                if(fmmo0.f) {
                    switch(this.j.r) {
                        case 0: {
                            throw null;
                        }
                        case 2: {
                            v5 = 0x7F0402DC;  // attr:colorOnPrimary
                        }
                    }
                }
                int v6 = fyho.b(textView0, v5);
                SpannableStringBuilder spannableStringBuilder0 = fmrm.b(textView0.getContext(), fmmo0.a.g(), gfsx.m(Integer.valueOf(v6)));
                if(((URLSpan[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), URLSpan.class)).length > 0) {
                    textView0.setMovementMethod(LinkMovementMethod.getInstance());
                }
                else {
                    textView0.setAutoLinkMask(1);
                }
                textView0.setText(spannableStringBuilder0, TextView.BufferType.SPANNABLE);
                break;
            }
            case 11: {
                fmmt fmmt0 = ((fmny)uq0).t;
                fmms fmms0 = ((fmny)uq0).u;
                GridLayoutManager gridLayoutManager0 = ((fmny)uq0).v;
                fmms0.f(fmmo0.a.b().a);
                if(!fmms0.n()) {
                    v2 = 0;
                }
                fmmt0.setVisibility(v2);
                fmmt0.an(fmms0);
                fmmt0.ap(gridLayoutManager0);
                break;
            }
            case 12: {
                ((fmoa)uq0).t.a = new fmna(((fmoa)uq0).t, this.g, this.i);
                fmlr fmlr0 = fmmo0.a.d();
                ((fmoa)uq0).t.a(fmlr0, this.j);
                break;
            }
            case 13: {
                fmlp fmlp0 = fmmo0.a.c();
                ((fmnz)uq0).t.a(fmlp0);
                break;
            }
            case 14: {
                String s = fmmo0.a.h().a;
                ((fmod)uq0).t.a(s);
            }
        }
        FrameLayout frameLayout0 = ((fmoe)uq0).w;
        frameLayout0.setPaddingRelative(fmro.a(frameLayout0.getContext(), ((float)fmmo0.b)), fmro.a(frameLayout0.getContext(), ((float)fmmo0.c)), fmro.a(frameLayout0.getContext(), ((float)fmmo0.d)), fmro.a(frameLayout0.getContext(), ((float)fmmo0.e)));
        if(fmmo0.f) {
            switch(this.j.r) {
                case 0: {
                    throw null;
                }
                case 1: {
                    v7 = 0x7F0402F9;  // attr:colorOnSurfaceInverse
                    break;
                }
                default: {
                    v7 = 0x7F04030C;  // attr:colorPrimary
                }
            }
            v3 = fyho.b(frameLayout0, v7);
        }
        frameLayout0.setBackgroundColor(v3);
    }
}

