import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.gms.wallet.ui.common.PageDetails;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.gms.wallet.webview.WebViewWidgetFragment.WebViewWidgetPageDetails;
import com.google.android.gms.wallet.webview.WebViewWidgetResult;

public final class fcdl extends fbzp {
    boolean a;
    final fbnw b;
    private byte[] c;
    private byte[] d;

    public fcdl() {
        this.b = new fcdj(this);
    }

    @Override  // fbzp
    protected final PageDetails A() {
        return new WebViewWidgetFragment.WebViewWidgetPageDetails();
    }

    @Override  // gami
    public final gamj B() {
        throw null;
    }

    @Override  // fbzp
    protected final gfet C() {
        return null;
    }

    @Override  // fbzp
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)hcib.a).jf(7, null);
    }

    @Override  // fbzp
    protected final Parser E() {
        return (Parser)((ProtoLiteMessage)hcid.a).jf(7, null);
    }

    @Override  // fbzp
    protected final void L(boolean z) {
    }

    @Override  // fbzp
    protected final void R() {
        throw new UnsupportedOperationException("makeResponseContextOnlySubmitRequest() is not supported by WebViewWidget.");
    }

    @Override  // fbzp
    protected final void V() {
    }

    @Override  // fbzp
    public final void W(int v) {
        super.W(v);
        if(v == 1) {
            this.aJ.setVisibility(0);
        }
    }

    @Override  // fbzp
    protected final void Z(Object object0) {
        if((object0 instanceof hcib)) {
            this.cC(2);
            this.bx().b.D(((hcib)object0));
            this.ll(false);
        }
    }

    @Override  // fbzp
    protected final PageDetails ae(Intent intent0) {
        byte[] arr_b = intent0.getBundleExtra("webViewComponentCallbackData").getByteArray("EventListener.EXTRA_WEBVIEW_COMPONENT_COMPLETE_WITH_CALLBACK_DATA");
        PageDetails pageDetails0 = new WebViewWidgetFragment.WebViewWidgetPageDetails();
        pageDetails0.c = hcdu.f;
        pageDetails0.o = new WebViewWidgetResult(arr_b);
        return pageDetails0;
    }

    @Override  // fbzp
    protected final MessageLite al(long v) {
        return null;
    }

    @Override  // fbzp
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.c = bundle1.getByteArray("parameters");
        this.d = bundle1.getByteArray("productAuthToken");
        if(bundle0 != null) {
            this.a = bundle0.getBoolean("shouldMakeInitializeRequest");
            return;
        }
        if(bundle1.containsKey("initializationToken")) {
            this.aU = 1;
            hcic hcic0 = (hcic)gciq.a(bundle1, "initializationToken", ((Parser)((ProtoLiteMessage)hcic.a).jf(7, null)));
            WebViewWidgetFragment.WebViewWidgetPageDetails webViewWidgetFragment$WebViewWidgetPageDetails0 = new WebViewWidgetFragment.WebViewWidgetPageDetails();
            if((hcic0.b & 8) != 0) {
                webViewWidgetFragment$WebViewWidgetPageDetails0.i = hcic0.f == null ? hcid.a : hcic0.f;
                hcid hcid0 = hcic0.f;
                if(((hcid0 == null ? hcid.a : hcid0).b & 4) != 0) {
                    if(hcid0 == null) {
                        hcid0 = hcid.a;
                    }
                    webViewWidgetFragment$WebViewWidgetPageDetails0.l = hcid0.c == null ? gfdq.a : hcid0.c;
                }
            }
            webViewWidgetFragment$WebViewWidgetPageDetails0.n = hcic0.d == null ? gete.c : hcic0.d;
            if((hcic0.b & 1) != 0) {
                webViewWidgetFragment$WebViewWidgetPageDetails0.q = hcic0.c == null ? getj.a : hcic0.c;
            }
            webViewWidgetFragment$WebViewWidgetPageDetails0.c = hcdu.b(hcic0.e) == null ? hcdu.a : hcdu.b(hcic0.e);
            this.bz = webViewWidgetFragment$WebViewWidgetPageDetails0;
        }
        else {
            this.a = true;
        }
        String s = this.aL;
        OrchestrationViewEvent.d(this.getContext(), s, new gamj(0x1F));
    }

    @Override  // fbzp
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putBoolean("shouldMakeInitializeRequest", this.a);
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.aJ = layoutInflater0.inflate(0x7F0E0D4A, viewGroup0, false);  // layout:wallet_fragment_web_view_widget
        this.cg(((ProgressSpinnerView)this.aJ.findViewById(0x7F0B1D4C)));  // id:progress_spinner_container
        if(this.a) {
            this.ll(false);
            this.a = false;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcib.a).v_newBuilder();
            gesx gesx0 = this.ct(null, this.d);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcib hcib0 = (hcib)hftp0.b_message;
            gesx0.getClass();
            hcib0.c = gesx0;
            hcib0.b |= 1;
            byte[] arr_b = this.c;
            if(arr_b != null) {
                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hcib hcib1 = (hcib)hftp0.b_message;
                hcib1.b |= 2;
                hcib1.d = hfsf0;
            }
            this.cp(hftp0.N_build(), 2);
            this.ce(new fcdi(this, hftp0));
            return this.aJ;
        }
        if(this.aU == 1) {
            this.cx();
        }
        return this.aJ;
    }

    @Override  // fbzp
    protected final fbnw z() {
        return this.b;
    }
}

