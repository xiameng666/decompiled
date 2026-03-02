import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Toast;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.widget.phone.SnackbarLayout;

public final class ahjl extends du implements View.OnClickListener {
    private Handler a;
    private String b;
    private bxod c;

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        switch(view0.getId()) {
            case 0x7F0B0F5A: {  // id:common_got_it
                this.a.postDelayed(new ahjk(this), 400L);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghqd.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ghqd)hftv0).c = 302;
                ((ghqd)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghqd ghqd0 = (ghqd)hftp0.b_message;
                ghqd0.b |= 16;
                ghqd0.g = true;
                ghqd ghqd1 = (ghqd)hftp0.N_build();
                aggh.a().c(ghqd1);
                this.y(304);
                return;
            }
            case 0x7F0B1047: {  // id:credentials_learn_more
                Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(hpjs.c())).addFlags(0x10000000);
                if(intent0.resolveActivity(((xob)this.requireContext()).getPackageManager()) == null) {
                    Toast.makeText(this.requireContext(), "No browser found to open this link.", 1).show();
                }
                else {
                    this.startActivity(intent0);
                }
                this.y(303);
            }
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        xob xob0 = (xob)this.requireContext();
        View view0 = layoutInflater0.cloneInContext(new ContextThemeWrapper(xob0, 0x7F16081C)).inflate(0x7F0E0253, viewGroup0, false);  // style:SignInSnackbar
        SnackbarLayout snackbarLayout0 = (SnackbarLayout)view0.findViewById(0x7F0B2073);  // id:snackbar
        snackbarLayout0.a(xob0.getWindow());
        snackbarLayout0.setBackgroundColor(0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = xob0.getWindow().getAttributes();
        windowManager$LayoutParams0.dimAmount = 0.7f;
        windowManager$LayoutParams0.flags |= 2;
        xob0.getWindow().setAttributes(windowManager$LayoutParams0);
        xob0.getWindow().getDecorView().setBackgroundColor(0);
        this.a = new clht(Looper.getMainLooper());
        Intent intent0 = xob0.getIntent();
        Credential credential0 = (Credential)bauc.b(intent0, "com.google.android.gms.credentials.Credential", Credential.CREATOR);
        batl.s(credential0);
        String s = intent0.getStringExtra("log_session_id");
        batl.s(s);
        this.b = s;
        ahka.a(xob0, snackbarLayout0, credential0);
        snackbarLayout0.findViewById(0x7F0B0F5A).setOnClickListener(this);  // id:common_got_it
        View view1 = snackbarLayout0.findViewById(0x7F0B1047);  // id:credentials_learn_more
        if(view1 != null) {
            view1.setOnClickListener(this);
        }
        String s1 = this.b;
        batl.s(s1);
        new adwo(xob0, new agft(s1)).e();
        this.c = bxoc.a(xob0, null);
        this.y(302);
        return view0;
    }

    private final void y(int v) {
        bxod bxod0 = this.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.b;
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
        ((gixf)hftp1.b_message).c = v - 1;
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
    }
}

