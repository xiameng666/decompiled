import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;
import java.util.concurrent.TimeUnit;

public final class ahjj extends du {
    public static final long a;
    private Handler b;
    private Runnable c;

    static {
        ahjj.a = TimeUnit.SECONDS.toMillis(3L);
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        ahjh ahjh0 = new ahjh(this);
        this.c = ahjh0;
        this.b.postDelayed(ahjh0, ahjj.a);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        xob xob0 = (xob)this.requireContext();
        View view0 = layoutInflater0.cloneInContext(new ContextThemeWrapper(xob0, 0x7F16081C)).inflate(0x7F0E0252, viewGroup0, false);  // style:SignInSnackbar
        SnackbarLayout snackbarLayout0 = (SnackbarLayout)view0.findViewById(0x7F0B2073);  // id:snackbar
        snackbarLayout0.a(xob0.getWindow());
        this.b = new clht(Looper.getMainLooper());
        Intent intent0 = xob0.getIntent();
        Credential credential0 = (Credential)bauc.b(intent0, "com.google.android.gms.credentials.Credential", Credential.CREATOR);
        gftb.check(credential0);
        ahka.a(xob0, snackbarLayout0, credential0);
        aemr.a(snackbarLayout0);
        snackbarLayout0.setAccessibilityDelegate(new ahji(this, credential0));
        bxod bxod0 = bxoc.a(xob0, null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = intent0.getStringExtra("log_session_id");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixr)hftp0.b_message).d = 6;
        ((gixr)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixf.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gixf)hftp1.b_message).c = 510;
        ((gixf)hftp1.b_message).b |= 1;
        gixf gixf0 = (gixf)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp0.b_message;
        gixf0.getClass();
        gixr0.j = gixf0;
        gixr0.b |= 0x40;
        bxod0.a(((gixr)hftp0.N_build()));
        return view0;
    }

    @Override  // du
    public final void onDestroy() {
        super.onDestroy();
        if(!((xob)this.requireContext()).isFinishing()) {
            Runnable runnable0 = this.c;
            if(runnable0 != null) {
                this.b.removeCallbacks(runnable0);
                this.c = null;
            }
        }
    }
}

