import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView.BufferType;
import android.widget.TextView;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;
import java.security.InvalidParameterException;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class fmyi extends fmrt {
    public final Map g;
    public final gged_interceptors h;
    public boolean i;
    int j;
    public final Handler k;
    public final tm l;
    public static final int m;
    private static final Handler n;
    private fmwt o;
    private final fmxf p;
    private final AccountContext q;
    private final ConversationId r;
    private gged_interceptors s;
    private final fmxu t;
    private final flen u;
    private final flkh v;

    static {
        fmyi.n = new Handler(Looper.getMainLooper());
    }

    public fmyi(fmwt fmwt0, gged_interceptors gged0, fmxu fmxu0, fmxf fmxf0, AccountContext accountContext0, ConversationId conversationId0, flen flen0, flkh flkh0) {
        super(new fmxg());
        this.g = new EnumMap(fmxd.class);
        this.j = -1;
        this.k = new Handler();
        this.l = new fmyf(this);
        this.o = fmwt0;
        this.t = fmxu0;
        this.p = fmxf0;
        this.q = accountContext0;
        this.r = conversationId0;
        this.u = flen0;
        this.v = flkh0;
        this.h = gged0;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            fmwu fmwu0 = (fmwu)gged0.get(v1);
            ggqk ggqk0 = ((gged_interceptors)fmwu0.d()).E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                this.g.put(((fmxd)object0), fmwu0);
            }
        }
    }

    @Override  // fmrt
    public final uq G(ViewGroup viewGroup0, int v) {
        if(iaea.i()) {
            int v1 = fmrk.a(v);
            if(v1 != 0) {
                switch(v1 - 1) {
                    case 0: {
                        return ((fmwu)this.g.get(fmxd.b)).a(viewGroup0, fmxd.b);
                    }
                    case 1: {
                        return ((fmwu)this.g.get(fmxd.c)).a(viewGroup0, fmxd.c);
                    }
                    case 2: {
                        return ((fmwu)this.g.get(fmxd.d)).a(viewGroup0, fmxd.d);
                    }
                    case 3: {
                        fmzl fmzl0 = new fmzl(viewGroup0.getContext());
                        return new fmyh(fmzl0, new fmzi(fmzl0, this.q, this.r, this.u, this.v));
                    }
                    case 4: 
                    case 5: 
                    case 6: {
                        fmvz fmvz0 = new fmvz(viewGroup0.getContext());
                        fmws fmws0 = this.o.b(fmvz0, v);
                        fmvz0.c(fmws0.a);
                        fmvz0.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        fmvx fmvx0 = new fmvx(fmvz0);
                        fmvx0.d = this.t;
                        return new fmyg(fmvz0, fmws0, fmvx0);
                    }
                    default: {
                        throw new IllegalArgumentException("Unsupported viewType: " + v);
                    }
                }
            }
            throw null;
        }
        if(v < 0x400) {
            fmvz fmvz1 = new fmvz(viewGroup0.getContext());
            fmws fmws1 = this.o.b(fmvz1, v);
            fmvz1.c(fmws1.a);
            fmvz1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            fmvx fmvx1 = new fmvx(fmvz1);
            fmvx1.d = this.t;
            return new fmyg(fmvz1, fmws1, fmvx1);
        }
        fmxd fmxd0 = fmxd.e;
        if(v - 0x400 == fmxd0.f) {
            fmzl fmzl1 = new fmzl(viewGroup0.getContext());
            return new fmyh(fmzl1, new fmzi(fmzl1, this.q, this.r, this.u, this.v));
        }
        switch(v - 0x400) {
            case 0: {
                return ((fmwu)this.g.get(fmxd.a)).a(viewGroup0, fmxd.a);
            }
            case 1: {
                return ((fmwu)this.g.get(fmxd.b)).a(viewGroup0, fmxd.b);
            }
            case 2: {
                return ((fmwu)this.g.get(fmxd.c)).a(viewGroup0, fmxd.c);
            }
            case 3: {
                return ((fmwu)this.g.get(fmxd.d)).a(viewGroup0, fmxd.d);
            }
            case 4: {
                return ((fmwu)this.g.get(fmxd0)).a(viewGroup0, fmxd0);
            }
            default: {
                throw new InvalidParameterException("Invalid MessageListCellViewModel type.");
            }
        }
    }

    @Override  // fmrt
    public final void H(uq uq0, int v) {
        int v1;
        fmwd fmwd0;
        String s;
        fmxe fmxe0 = (fmxe)this.c(v);
        fmxd fmxd0 = fmxe0.b();
        View view0 = uq0.a;
        Context context0 = view0.getContext();
        switch(fmxe0.b().ordinal()) {
            case 0: {
                s = ((fmga)fmxe0.a().a.d()).f.a() != 3 || !((fmga)fmxe0.a().a.d()).f.b().a.equals("photos") ? fmxe0.a().a(context0, 0x7F15097A, 0x7F15097B, 0x7F15097E) : fmxe0.a().a(context0, 0x7F15097C, 0x7F15097D, 0x7F15097F);  // string:content_description_incoming_default_message "%1$s said %2$s.\n\n%3$s"
                break;
            }
            case 2: {
                s = fmxe0.c().a(context0, 0x7F15097A, 0x7F15097B, 0x7F15097E);  // string:content_description_incoming_default_message "%1$s said %2$s.\n\n%3$s"
                break;
            }
            case 3: {
                s = fmxe0.e().a(context0, 0x7F150982, 0x7F150982, 0x7F150982);  // string:content_description_tombstone_message "%2$s.\n\n%3$s"
                break;
            }
            default: {
                s = null;
            }
        }
        view0.setContentDescription(s);
        switch(fmxe0.b().ordinal()) {
            case 0: {
                fmwd0 = fmxe0.a();
                break;
            }
            case 2: {
                fmwd0 = fmxe0.c();
                break;
            }
            case 3: {
                fmwd0 = fmxe0.e();
                break;
            }
            default: {
                fmwd0 = null;
            }
        }
        if(fmxd0.equals(fmxd.a)) {
            View view1 = ((fmyg)uq0).t.a;
            fmga fmga0 = (fmga)fmwd0.a.d();
            switch(fmga0.r) {
                case 0: {
                    throw null;
                }
                case 1: {
                    ((TextView)view1).setTextAppearance(((fmwi)view1).i);
                    v1 = ((fmwi)view1).k;
                    ((fmwi)view1).f = ((fmwi)view1).d;
                    ((fmwi)view1).g = ((fmwi)view1).d;
                    ((fmwi)view1).h = ((fmwi)view1).d;
                    ((fmwi)view1).q = ((fmwi)view1).o;
                    ((fmwi)view1).setHighlightColor(((fmwi)view1).m);
                    break;
                }
                default: {
                    ((TextView)view1).setTextAppearance(((fmwi)view1).j);
                    v1 = ((fmwi)view1).l;
                    ((fmwi)view1).setHighlightColor(((fmwi)view1).n);
                    ((fmwi)view1).f = ((fmwi)view1).e;
                    if(!iaea.h()) {
                        ((fmwi)view1).l = fyho.b(view1, 0x7F0402DB);  // attr:colorOnMessageBubbleOutgoingRcs
                    }
                    ((fmwi)view1).setTextColor(((fmwi)view1).l);
                    ((fmwi)view1).setLinkTextColor(((fmwi)view1).l);
                    ((fmwi)view1).g = fyho.b(view1, 0x7F0402C7);  // attr:colorMessageBubbleOutgoingRcsGradientStart
                    ((fmwi)view1).h = fyho.b(view1, 0x7F0402C6);  // attr:colorMessageBubbleOutgoingRcsGradientEnd
                    ((fmwi)view1).q = ((fmwi)view1).p;
                }
            }
            ((fmwi)view1).c();
            if(((fmwi)view1).c) {
                ((fmwi)view1).setTextIsSelectable(true);
                fmrn.a(((TextView)view1), ((fmwi)view1).q);
            }
            ((fmwi)view1).setLinksClickable(false);
            if(((fmwi)view1).b) {
                ((fmwi)view1).setMovementMethod(new fmwk(new fmwh(((fmwi)view1))));
            }
            else {
                ((fmwi)view1).setMovementMethod(new fmwj());
            }
            fmfr fmfr0 = fmga0.f;
            switch(fmfr0.a() - 1) {
                case 1: {
                    ((fmwi)view1).setAutoLinkMask(15);
                    ((fmwi)view1).setText(fmfr0.d());
                    break;
                }
                case 3: {
                    if(((fmwi)view1).a) {
                        SpannableStringBuilder spannableStringBuilder0 = fmrm.b(((fmwi)view1).getContext(), fmfr0.c(), gfsx.m(Integer.valueOf(v1)));
                        boolean z = ((URLSpan[])spannableStringBuilder0.getSpans(0, spannableStringBuilder0.length(), URLSpan.class)).length > 0;
                        ((fmwi)view1).s = z;
                        if(z) {
                            ((fmuw)((fmwi)view1).r).g.b(((fmuw)((fmwi)view1).r).b(0x7C).a());
                        }
                        else {
                            ((fmwi)view1).setAutoLinkMask(15);
                        }
                        ((fmwi)view1).setText(spannableStringBuilder0, TextView.BufferType.SPANNABLE);
                    }
                    else {
                        ((fmwi)view1).setAutoLinkMask(15);
                        ((fmwi)view1).setText(((CharSequence)fmga0.e.f("")));
                    }
                    break;
                }
                default: {
                    ((fmwi)view1).setAutoLinkMask(15);
                    ((fmwi)view1).setText(((CharSequence)fmga0.e.f("")));
                }
            }
            CharSequence charSequence0 = ((fmwi)view1).getText();
            URLSpan[] arr_uRLSpan = (URLSpan[])new SpannableStringBuilder(charSequence0).getSpans(0, charSequence0.length(), URLSpan.class);
            HashSet hashSet0 = new HashSet();
            for(int v2 = 0; v2 < arr_uRLSpan.length; ++v2) {
                hashSet0.add(Uri.parse(arr_uRLSpan[v2].getURL()).getScheme());
            }
            for(Object object0: hashSet0) {
                fmre fmre0 = ((fmwi)view1).r;
                Integer integer0 = (Integer)fmuw.a.get(((String)object0));
                fmai fmai0 = ((fmuw)fmre0).b(0x7C);
                fmai0.k((integer0 == null ? 0 : ((int)integer0)));
                ((fmuw)fmre0).g.b(fmai0.a());
            }
            fmvx fmvx0 = ((fmyg)uq0).u;
            fmvx0.a = fmwd0;
            fmvz fmvz0 = fmvx0.b;
            ContactAvatarView contactAvatarView0 = fmvz0.k;
            fmvx0.c = new fmqq(contactAvatarView0, fmwd0.b);
            fmqq fmqq0 = fmvx0.c;
            if(fmvx0.a == null) {
                flbj.c("BubbleCellPresenter", "Call presenter.setmessage(message) before calling start()");
            }
            else {
                fmqq0.a();
                fmwd fmwd1 = fmvx0.a;
                gfsx gfsx0 = fmwd1.a;
                if(gfsx0.i()) {
                    fmvz0.a = (fmga)gfsx0.d();
                    int v3 = fmvz0.a.r - 1;
                    if(fmvz0.a.r == 0) {
                        throw null;
                    }
                    switch(v3) {
                        case 0: {
                            contactAvatarView0.setVisibility(0);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
                            relativeLayout$LayoutParams0.addRule(flbb.a(fmvz0.getContext()) ^ 1, contactAvatarView0.getId());
                            relativeLayout$LayoutParams0.addRule(3, fmvz0.f.getId());
                            fmvz0.e.setLayoutParams(relativeLayout$LayoutParams0);
                            fmvz0.b.setGravity(0x800003);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
                            relativeLayout$LayoutParams1.addRule((flbb.a(fmvz0.getContext()) ? 7 : 5), fmvz0.e.getId());
                            relativeLayout$LayoutParams1.addRule(3, fmvz0.e.getId());
                            fmvz0.c.setLayoutParams(relativeLayout$LayoutParams1);
                            break;
                        }
                        case 1: {
                            contactAvatarView0.setVisibility(8);
                            fmvz0.f.setVisibility(8);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                            relativeLayout$LayoutParams2.addRule((flbb.a(fmvz0.getContext()) ? 9 : 11));
                            relativeLayout$LayoutParams2.addRule(3, fmvz0.f.getId());
                            fmvz0.e.setLayoutParams(relativeLayout$LayoutParams2);
                            fmvz0.b.setGravity(0x800005);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                            relativeLayout$LayoutParams3.addRule((flbb.a(fmvz0.getContext()) ? 5 : 7), fmvz0.e.getId());
                            relativeLayout$LayoutParams3.addRule(3, fmvz0.e.getId());
                            fmvz0.c.setLayoutParams(relativeLayout$LayoutParams3);
                        }
                    }
                    fmeo fmeo0 = fmwd1.b;
                    RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    relativeLayout$LayoutParams4.addRule((flbb.a(fmvz0.getContext()) ? 7 : 5), fmvz0.e.getId());
                    TopLabelView topLabelView0 = fmvz0.f;
                    topLabelView0.setLayoutParams(relativeLayout$LayoutParams4);
                    gfsx gfsx1 = fmeo0.k;
                    if(gfsx1.i()) {
                        switch(((fmfl)gfsx1.d()).b) {
                            case 0: {
                                topLabelView0.a.setTextAppearance(fmvz0.g);
                                topLabelView0.a(8);
                                break;
                            }
                            case 1: {
                                topLabelView0.a.setTextAppearance(fmvz0.h);
                                topLabelView0.a(8);
                                break;
                            }
                            case 2: {
                                topLabelView0.a.setTextAppearance(fmvz0.i);
                                if(fmeo0.b.i()) {
                                    topLabelView0.a(0);
                                }
                            }
                        }
                    }
                    else {
                        topLabelView0.a.setTextAppearance(fmvz0.g);
                    }
                    topLabelView0.b(((String)fmeo0.b.f("")));
                    CharSequence charSequence1 = (CharSequence)fmeo0.c.f("");
                    topLabelView0.a.setContentDescription(charSequence1);
                    int v4 = fmwd1.c;
                    int v5 = fmvz0.a.r;
                    if(v4 == 0) {
                        switch(v5) {
                            case 0: {
                                throw null;
                            }
                            case 1: {
                                contactAvatarView0.setVisibility(0);
                                topLabelView0.setVisibility(0);
                            }
                        }
                        fmvz0.j.d(20.0f, 20.0f, 20.0f, 20.0f);
                    }
                    else {
                    alab1:
                        switch(v4) {
                            case 1: {
                                switch(v5) {
                                    case 0: {
                                        throw null;
                                    }
                                    case 1: {
                                        contactAvatarView0.setVisibility(4);
                                        topLabelView0.setVisibility(0);
                                        fmvz0.j.d(20.0f, 20.0f, 20.0f, 4.0f);
                                        break alab1;
                                    }
                                    default: {
                                        fmvz0.j.d(20.0f, 20.0f, 4.0f, 20.0f);
                                        break alab1;
                                    }
                                }
                            }
                            case 2: {
                                switch(v5) {
                                    case 0: {
                                        throw null;
                                    }
                                    case 1: {
                                        contactAvatarView0.setVisibility(4);
                                        fmvz0.j.d(4.0f, 20.0f, 20.0f, 4.0f);
                                        break;
                                    }
                                    default: {
                                        fmvz0.j.d(20.0f, 4.0f, 4.0f, 20.0f);
                                    }
                                }
                                topLabelView0.setVisibility(8);
                                break;
                            }
                            default: {
                                switch(v5) {
                                    case 0: {
                                        throw null;
                                    }
                                    case 1: {
                                        contactAvatarView0.setVisibility(0);
                                        fmvz0.j.d(4.0f, 20.0f, 20.0f, 20.0f);
                                        topLabelView0.setVisibility(8);
                                        break;
                                    }
                                    default: {
                                        fmvz0.j.d(20.0f, 4.0f, 20.0f, 20.0f);
                                        topLabelView0.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                    fmvz0.c.a(fmwd1);
                    fmvz0.d.a(fmwd1);
                }
            }
        }
        else if(fmxd0.equals(fmxd.e)) {
            ((fmyh)uq0).t.b.l(((fmyh)uq0).t);
            ((fmyh)uq0).t.b();
            ((fmyh)uq0).t.b.j(((fmyh)uq0).t);
            ((fmyh)uq0).t.c.a = (int)iadx.a.d().b();
        }
        else {
            ((fmwu)this.g.get(fmxd0)).e(uq0, fmxe0, this.q);
        }
        if(fmwd0 != null) {
            gfsx gfsx2 = fmwd0.a;
            if(gfsx2.i()) {
                Object object1 = gfsx2.d();
                fmxf fmxf0 = ((fmxv)this.p).a.u;
                if(fmxf0 != null) {
                    ((fmtv)fmxf0).a.e(((fmga)object1));
                }
                Context context1 = view0.getContext();
                if(flav.c(context1) && ((fmga)gfsx2.d()).r == 1) {
                    fmft fmft0 = ((fmga)gfsx2.d()).g;
                    if(fmft.b.equals(fmft0)) {
                        fmyb fmyb0 = new fmyb(context1, "New message arrived.");
                        fmyi.n.post(fmyb0);
                    }
                }
            }
        }
    }

    public final void J() {
        gged_interceptors gged0 = this.s;
        if(gged0 != null) {
            this.jQ(gged0);
        }
    }

    @Override  // tk
    public final void j(uq uq0) {
        if(this.j != -1 && this.j == ((fmrs)uq0).fq()) {
            ((fmrs)uq0).a.postDelayed(new fmyd(this, ((fmrs)uq0)), 750L);
        }
    }

    @Override  // fmrt
    public final void jQ(List list0) {
        this.s = gged_interceptors.i(list0);
        super.jQ(gged_interceptors.i(ggch.j(list0).i(new fmyc(this)).n()));
    }

    @Override  // fmrt
    public final int n(int v) {
        fmxe fmxe0 = (fmxe)this.c(v);
        boolean z = false;
        if(iaea.i()) {
            switch(fmxe0.b().ordinal()) {
                case 0: {
                    return this.o.a(((fmga)fmxe0.a().a.d()));
                }
                case 1: {
                    return 0;
                }
                case 2: {
                    return 1;
                }
                case 3: {
                    return 2;
                }
                case 4: {
                    return 3;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        if(fmxe0.b().equals(fmxd.a)) {
            int v1 = this.o.a(((fmga)fmxe0.a().a.d()));
            if(v1 < 0x400) {
                z = true;
            }
            gftb.q(z);
            return v1;
        }
        return fmxe0.b().f + 0x400;
    }
}

