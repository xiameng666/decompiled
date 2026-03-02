import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class fcad extends gdak implements gdbp {
    SelectorView a;
    public fcac ag;
    private final gdew ah;
    private String ai;
    private final gamj aj;
    TextView b;
    ImageWithCaptionView c;
    getn d;

    public fcad() {
        this.ah = new gdew();
        this.aj = new gamj(9);
    }

    @Override  // gami
    public final gamj B() {
        return this.aj;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((getu)this.aA).d;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)getu.b).jf(7, null);
    }

    public static fcad G(getu getu0, Account account0, int v, String s, LogContext logContext0) {
        fcad fcad0 = new fcad();
        Bundle bundle0 = fcad.al(v, ((MessageLite)getu0), logContext0);
        bundle0.putParcelable("currentAccount", account0);
        bundle0.putString("analyticsSessionId", s);
        fcad0.setArguments(bundle0);
        return fcad0;
    }

    @Override  // gdcm
    protected final void M() {
        SelectorView selectorView0 = this.a;
        if(selectorView0 != null) {
            selectorView0.setEnabled(this.ca);
        }
        ImageWithCaptionView imageWithCaptionView0 = this.c;
        if(imageWithCaptionView0 != null) {
            imageWithCaptionView0.setEnabled(this.ca);
        }
    }

    private final void Q(Context context0, getn getn0) {
        gfgo gfgo1;
        gfgo gfgo0;
        getu getu0 = (getu)this.aA;
        if((getu0.c & 2) == 0) {
            gfgo0 = null;
        }
        else {
            gfgo0 = getu0.e;
            if(gfgo0 == null) {
                gfgo0 = gfgo.a;
            }
        }
        hfuh hfuh0 = new hfuh(((getu)this.aA).j, getu.a);
        fcae fcae0 = new fcae(context0);
        for(Object object0: hfuh0) {
            int v = ((gett)object0).ordinal();
            switch(v) {
                case 1: {
                    fcae0.a = true;
                    break;
                }
                case 2: {
                    fcae0.b = true;
                    break;
                }
                default: {
                    if(v != 3) {
                        continue;
                    }
                    fcae0.c = true;
                }
            }
        }
        fcae0.d = gfgo0;
        fcae0.p = getn0;
        int[] arr_v = {0x7F040064, 0x7F040065, 0x7F040067};  // attr:accountOptionTextPrimary
        Arrays.sort(arr_v);
        TypedArray typedArray0 = fcae0.getContext().obtainStyledAttributes(null, arr_v);
        int v1 = typedArray0.getResourceId(Arrays.binarySearch(arr_v, 0x7F040064), 0);  // attr:accountOptionTextPrimary
        int v2 = typedArray0.getResourceId(Arrays.binarySearch(arr_v, 0x7F040065), 0);  // attr:accountOptionTextPrimaryGoogleSans
        int v3 = typedArray0.getResourceId(Arrays.binarySearch(arr_v, 0x7F040067), 0);  // attr:accountOptionTextSecondaryGoogleSans
        typedArray0.recycle();
        if(fcae0.a && !getn0.d.isEmpty()) {
            TextView textView0 = fcae0.f;
            textView0.setText(getn0.d);
            if(gdcb.W(fcae0.getContext())) {
                textView0.setTextAppearance(fcae0.getContext(), v2);
                Context context1 = fcae0.getContext();
                fcae0.g.setTextAppearance(context1, v3);
            }
        }
        else {
            fcae0.f.setVisibility(8);
            TextView textView1 = fcae0.g;
            Context context2 = fcae0.getContext();
            if(gdcb.W(fcae0.getContext())) {
                v1 = v2;
            }
            textView1.setTextAppearance(context2, v1);
        }
        fcae0.g.setText(getn0.e);
        if(fcae0.b) {
            ImageWithCaptionView imageWithCaptionView0 = fcae0.e;
            getn getn1 = (getn)fcae0.p;
            if((getn1.b & 8) == 0) {
                gfgo1 = fcae0.d;
            }
            else {
                gfgo1 = getn1.f;
                if(gfgo1 == null) {
                    gfgo1 = gfgo.a;
                }
            }
            imageWithCaptionView0.o(gfgo1, fbgn.o(fcae0.getContext()));
            imageWithCaptionView0.setVisibility(0);
        }
        if(fcae0.c) {
            fcae0.k.setVisibility(0);
        }
        if(!fcae0.b && !fcae0.c) {
            fcae0.findViewById(0x7F0B16E6).setVisibility(8);  // id:image_and_radio_button_container
        }
        fcae0.q(getn0.c);
        if((((getu)this.aA).c & 4) == 0) {
            fcae0.findViewById(0x7F0B0D36).setVisibility(8);  // id:brand_image_spacer
        }
        this.a.addView(fcae0);
    }

    @Override  // gdbp
    public final void aF(Object object0, Object object1) {
        if(((getn)object1) == null || ((getn)object0).c != ((getn)object1).c) {
            if(((getn)object1) != null) {
                String s = this.ai;
                OrchestrationViewEvent.c(this.getContext(), s, this.aj);
            }
            this.d = (getn)object0;
            fcac fcac0 = this.ag;
            if(fcac0 != null) {
                fcac0.aw(new Account(this.d.e, "com.google"));
            }
        }
    }

    @Override  // gdbp
    public final void ar(View view0) {
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setVisibility(8);
        }
    }

    @Override  // gdbp
    public final void as(View view0) {
        TextView textView0 = this.b;
        if(textView0 != null) {
            textView0.setVisibility(0);
        }
    }

    @Override  // gdbp
    public final void av() {
    }

    @Override  // gdbp
    public final boolean aw() {
        int v = this.a.getChildCount();
        Resources resources0 = this.getResources();
        gdcb.z(this.a, resources0.getQuantityString(0x7F1300B1, v, new Object[]{v}));  // plurals:wallet_expanding_account_selector
        return true;
    }

    @Override  // gdak
    public final String lL(String s) {
        return this.d.e;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return new ArrayList();
    }

    @Override  // gami
    public final List li() {
        return new ArrayList(0);
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ah;
    }

    @Override  // gcyg
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.ai = this.getArguments().getString("analyticsSessionId");
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        gciq.j(bundle0, "selectedAccount", ((MessageLite)this.d));
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        gfgo gfgo0;
        View view0 = layoutInflater0.inflate(0x7F0E0D1D, null, false);  // layout:wallet_fragment_account_selector
        SelectorView selectorView0 = (SelectorView)view0.findViewById(0x7F0B0A93);  // id:account_selector_view
        this.a = selectorView0;
        this.ah.d(selectorView0);
        SelectorView selectorView1 = this.a;
        selectorView1.e = this;
        selectorView1.f = this;
        selectorView1.h = this.cM();
        selectorView1.g = this.bs();
        gewg gewg0 = this.C();
        if(gewg0 != null && !gewg0.f.isEmpty()) {
            TextView textView0 = (TextView)view0.findViewById(0x7F0B0A92);  // id:account_selector_header
            this.b = textView0;
            textView0.setText(gewg0.f);
            this.b.setTag(0x7F0B218C, "expandedField");  // id:summary_expander_transition_name
        }
        if((((getu)this.aA).c & 4) != 0) {
            ImageWithCaptionView imageWithCaptionView0 = (ImageWithCaptionView)view0.findViewById(0x7F0B0D35);  // id:brand_icon
            this.c = imageWithCaptionView0;
            getu getu0 = (getu)this.aA;
            if((getu0.c & 4) == 0) {
                gfgo0 = null;
            }
            else {
                gfgo0 = getu0.f;
                if(gfgo0 == null) {
                    gfgo0 = gfgo.a;
                }
            }
            imageWithCaptionView0.o(gfgo0, fbgn.o(this.getContext()));
            this.c.setVisibility(0);
        }
        if(!this.aC) {
            view0.findViewById(0x7F0B0CFC).setVisibility(8);  // id:bottom_separator
        }
        if(bundle0 == null) {
            Account account0 = (Account)this.getArguments().getParcelable("currentAccount");
            Iterator iterator0 = ((getu)this.aA).g.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    throw new IllegalStateException("Invalid account" + account0);
                }
                Object object0 = iterator0.next();
                getn getn0 = (getn)object0;
                if(account0.name.equals(getn0.e) && account0.type.equals("com.google")) {
                    this.d = getn0;
                    break;
                }
            }
        }
        else {
            this.d = (getn)gciq.a(bundle0, "selectedAccount", ((Parser)((ProtoLiteMessage)getn.a).jf(7, null)));
        }
        getn getn1 = this.d;
        this.a.removeAllViews();
        Context context0 = this.getContext();
        int v1 = ((getu)this.aA).g.size();
        int v2;
        for(v2 = 0; true; ++v2) {
            if(v2 >= v1) {
                v2 = -1;
                break;
            }
            getn getn2 = (getn)((getu)this.aA).g.get(v2);
            if(getn2.e.equals(getn1.e)) {
                this.Q(context0, getn2);
                break;
            }
        }
        for(int v = 0; v < v1; ++v) {
            if(v != v2) {
                this.Q(context0, ((getn)((getu)this.aA).g.get(v)));
            }
        }
        this.a.h(getn1.c);
        return view0;
    }
}

