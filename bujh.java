import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class bujh extends buii implements buje {
    public bujj a;
    public static final int b;
    private static final bboh c;

    static {
        bujh.c = bboh.b("SmuiRootFragment", bbcu.hd);
    }

    public final bujj A() {
        bujj bujj0 = this.a;
        if(bujj0 != null) {
            return bujj0;
        }
        ibuq.j("accountInfo");
        return null;
    }

    @Override  // buje
    public final void a(hiwr hiwr0) {
        ibuq.f(hiwr0, "smuiCta");
        int v = hiwr0.b;
        if(v == 1) {
            hiwh hiwh0 = (hiwh)hiwr0.c;
            ibuq.e(hiwh0, "getOpenDetailsPage(...)");
            buhp buhp0 = buho.a(((ProtoLiteMessage)buhn.a).v_newBuilder());
            hiwq hiwq0 = hiwh0.b == null ? hiwq.a : hiwh0.b;
            ibuq.e(hiwq0, "getCategory(...)");
            buhp0.b(hiwq0);
            hiwv hiwv0 = hiwh0.c == null ? hiwv.a : hiwh0.c;
            ibuq.e(hiwv0, "getSorting(...)");
            buhp0.c(hiwv0);
            bukv bukv0 = bukv.y(buhp0.a(), this.A().a);
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.z(0x7F0B14C5, bukv0, "detailsPageFragment");  // id:fragment_container
            ca0.w("detailsPageFragment");
            ca0.b();
            return;
        }
        if(v == 2) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)buht.a).v_newBuilder();
            ibuq.f(hftp0, "builder");
            if(((hiwr0.b == 2 ? ((hiwk)hiwr0.c) : hiwk.a).b & 4) != 0) {
                String s = (hiwr0.b == 2 ? ((hiwk)hiwr0.c) : hiwk.a).e;
                ibuq.e(s, "getPageTitle(...)");
                ibuq.f(s, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                buht buht0 = (buht)hftp0.b_message;
                s.getClass();
                buht0.c = s;
            }
            hiwk hiwk0 = hiwr0.b == 2 ? ((hiwk)hiwr0.c) : hiwk.a;
            ghip ghip0 = hiwk0.c == null ? ghip.a : hiwk0.c;
            ibuq.e(ghip0, "getWebviewUrl(...)");
            ibuq.f(ghip0, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            buht buht1 = (buht)hftp0.b_message;
            ghip0.getClass();
            buht1.d = ghip0;
            buht1.b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            String s1 = this.A().a;
            ibuq.f(((buht)hftv0), "fragmentArgs");
            butr butr0 = new butr();
            butr0.setArguments(jyu.a(new ibns[]{new ibns("account_name_key", s1), new ibns("webViewFragmentArgs", ((buht)hftv0).toBytesArray())}));
            ca ca1 = new ca(this.getChildFragmentManager());
            ca1.z(0x7F0B14C5, butr0, "webViewFragment");  // id:fragment_container
            ca1.w("webViewFragment");
            ca1.b();
        }
    }

    @Override  // buje
    public final void b(hiwu hiwu0, hiwq hiwq0, String s) {
        ibuq.f(hiwu0, "smuiItem");
        ibuq.f(hiwq0, "smuiCategory");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)buhr.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(hiwu0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        buhr buhr0 = (buhr)hftp0.b_message;
        hiwu0.getClass();
        buhr0.c = hiwu0;
        buhr0.b |= 1;
        ibuq.f(hiwq0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hiwq0.getClass();
        ((buhr)hftv0).d = hiwq0;
        ((buhr)hftv0).b |= 2;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((buhr)hftp0.b_message).e = s;
        }
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        String s1 = this.A().a;
        Bundle bundle0 = new Bundle(2);
        hfxk.m(bundle0, "smuiMediaViewerFragmentArgs", ((MessageLite)(((buhr)hftv1))));
        bundle0.putString("account_name_key", s1);
        buqw buqw0 = new buqw();
        buqw0.setArguments(bundle0);
        du du0 = this.getChildFragmentManager().h("detailsPageFragment");
        if(du0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ca ca0 = new ca(this.getChildFragmentManager());
        ca0.n(du0);
        ca0.u(0x7F0B14C5, buqw0, "mediaViewerFragment");  // id:fragment_container
        ca0.w("mediaViewerFragment");
        ca0.b();
    }

    @Override  // buje
    public final void c(boolean z) {
        if(z) {
            this.getChildFragmentManager().ax("LandingPageFragment", 1);
        }
        ca ca0 = new ca(this.getChildFragmentManager());
        String s = this.A().a;
        bupl bupl0 = new bupl();
        bupl0.setArguments(jyu.a(new ibns[]{new ibns("account_name_key", s)}));
        ca0.z(0x7F0B14C5, bupl0, "LandingPageFragment");  // id:fragment_container
        ca0.w("LandingPageFragment");
        ca0.b();
    }

    @Override  // buje
    public final void d() {
        if(this.getChildFragmentManager().b() > 1) {
            int v = this.getChildFragmentManager().b();
            ca ca0 = this.getChildFragmentManager().az(v - 1);
            ibuq.e(ca0, "getBackStackEntryAt(...)");
            if(ibuq.m(ca0.m, "mediaViewerFragment")) {
                du du0 = this.getChildFragmentManager().h("detailsPageFragment");
                if(du0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.getChildFragmentManager().av();
                ca ca1 = new ca(this.getChildFragmentManager());
                ca1.r(du0);
                ca1.b();
                return;
            }
            this.getChildFragmentManager().av();
            return;
        }
        Context context0 = this.getContext();
        ibuq.d(context0, "null cannot be cast to non-null type com.google.android.chimerax.fragment.app.internal.FragmentActivity");
        ((xoi)context0).finish();
    }

    @Override  // buje
    public final void e(hiwr hiwr0) {
        ibuq.f(hiwr0, "smuiCta");
        if(hiwr0.b == 1) {
            hiwh hiwh0 = (hiwh)hiwr0.c;
            ibuq.e(hiwh0, "getOpenDetailsPage(...)");
            buhp buhp0 = buho.a(((ProtoLiteMessage)buhn.a).v_newBuilder());
            hiwq hiwq0 = hiwh0.b == null ? hiwq.a : hiwh0.b;
            ibuq.e(hiwq0, "getCategory(...)");
            buhp0.b(hiwq0);
            hiwv hiwv0 = hiwh0.c == null ? hiwv.a : hiwh0.c;
            ibuq.e(hiwv0, "getSorting(...)");
            buhp0.c(hiwv0);
            bukv bukv0 = bukv.y(buhp0.a(), this.A().a);
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.z(0x7F0B14C5, bukv0, "detailsPageFragment");  // id:fragment_container
            ca0.w("detailsPageFragment");
            ca0.b();
            return;
        }
        ((ggtj)bujh.c.i()).x("SmuiCta does not contain details page data");
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        ((xoi)this.requireContext()).getOnBackPressedDispatcher().c(this, new bujg(this));
        return layoutInflater0.inflate(0x7F0E09F9, viewGroup0, false);  // layout:smui_root_fragment
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        kex.b(view0, new bujf());
        if(bundle0 == null) {
            this.c(false);
        }
    }
}

