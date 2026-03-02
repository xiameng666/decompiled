import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public final class egxg extends egsx {
    public static final bboh a;
    public eguv b;

    static {
        egxg.a = bboh.b("TrashContactsFragment", bbcu.f);
    }

    @Override  // egsx
    public final int D() {
        return 7;
    }

    @Override  // egsx
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.b = (eguv)new lso(this.J(), this.K()).a(eguv.class);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0BE5, viewGroup0, false);  // layout:trash_contacts_fragment
        WebView webView0 = (WebView)view0.findViewById(0x7F0B24EE);  // id:webview
        webView0.getSettings().setJavaScriptEnabled(true);
        webView0.setWebViewClient(new egxe(this, fpyt.b(ggna.a), fpyt.b(hwyp.a.c().e().b)));
        this.J().getOnBackPressedDispatcher().b(new egxf(this, webView0));
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        Account account0 = (Account)this.requireArguments().getParcelable("account");
        if(account0 == null) {
            throw new IllegalStateException("Trash opened without setting account");
        }
        eguv eguv0 = this.b;
        Account account1 = (Account)eguv0.o.ij();
        if(account1 == null || !account1.equals(account0)) {
            eguj eguj0 = new eguj(eguv0, account0);
            gmbu.t(eguv0.g.e(eguj0), new egus(eguv0), gmap.a);
        }
        this.b.o.g(this.getViewLifecycleOwner(), new egxd(this));
    }
}

