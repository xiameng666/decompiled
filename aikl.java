import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.auth.authzen.transaction.AuthzenBaseLayoutActivity.1;

public class aikl extends aiko {
    private aiky A;
    private BroadcastReceiver B;
    protected Bundle j;
    public final ailf k;
    private String y;
    private aikx z;

    public aikl() {
        this.k = ailf.b(this);
    }

    protected static Intent a(hhqx hhqx0, String s, byte[] arr_b) {
        batl.s(hhqx0);
        batl.q(s);
        Intent intent0 = new Intent();
        intent0.putExtra("account", s);
        intent0.putExtra("tx_request", hhqx0.toBytesArray());
        intent0.putExtra("encryption_key_handle", arr_b);
        intent0.addFlags(0x10000000).addFlags(0x8000000).addFlags(0x200000).addFlags(0x800000).addFlags(4).addFlags(0x10000).addFlags(0x40000);
        return intent0;
    }

    protected ailt b() {
        Bundle bundle0 = this.j;
        ailt ailt0 = new ailp();
        ailt0.setArguments(bundle0);
        return ailt0;
    }

    protected final void c(ailt ailt0) {
        this.s(hhqj.c, 3);
        Bundle bundle0 = this.j;
        if(bundle0.containsKey(ailj.b) && bundle0.containsKey(ailj.c)) {
            this.l(ailt0, ailj.y(this.j));
            return;
        }
        String s = this.j.getString(ailx.i);
        if(!bbqr.d(s)) {
            this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(s)));
        }
        this.setResult(-1);
        this.finish();
    }

    protected final void f(String s) {
        String s1 = this.j.getString(ailx.j);
        if(!bbqr.d(s1)) {
            this.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(s1)));
        }
        this.i(s);
        this.setResult(-1);
        this.finish();
    }

    @Override  // aiko
    protected final void g(Bundle bundle0) {
        ailt ailt0;
        aiky aiky0;
        aikl aikl0;
        this.z = aikx.a(this);
        if(!aiir.a().booleanValue()) {
            this.setRequestedOrientation(1);
        }
        this.j = ailz.a(this.m).a();
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        AuthzenBaseLayoutActivity.1 authzenBaseLayoutActivity$10 = new AuthzenBaseLayoutActivity.1(this);
        this.B = authzenBaseLayoutActivity$10;
        jwe.b(this, authzenBaseLayoutActivity$10, intentFilter0, 2);
        this.requestWindowFeature(1);
        this.setContentView((aiir.a().booleanValue() ? 0x7F0E00FD : 0x7F0E00FC));  // layout:auth_authzen_gm_fragment_layout_activity
        new aikr(this.getApplicationContext(), this.l, this).a(new aikt(((ImageView)this.findViewById(0x7F0B1D2C))).a);  // id:profile_image
        ((TextView)this.findViewById(0x7F0B11F3)).setText(this.l);  // id:email
        aikx aikx0 = this.z;
        if(((this.m.e == null ? hhqw.b : this.m.e).c & 0x100) != 0 && (aikx0.a.a() && aikx0.a.b())) {
            aikl0 = this;
            aiky0 = new aiky(aikl0, (this.m.e == null ? hhqw.b : this.m.e), this.j, this.q, new aikk(this));
        }
        else {
            aikl0 = this;
            aiky0 = null;
        }
        aikl0.A = aiky0;
        if(bundle0 == null) {
            if(aiky0 == null) {
                aikl0.b();
            }
            else {
                aiky0.a();
            }
            if(aikl0.A == null) {
                aikl.x.h("Showing recovery verification fragment.", new Object[0]);
                ailt0 = aikl0.b();
            }
            else {
                aikl.x.h("Showing screen locker fragment.", new Object[0]);
                ailt0 = aikl0.A.a();
            }
            ailt0.E();
            aikl0.l(null, ailt0);
            return;
        }
        aikl0.y = bundle0.getString("current_fragment");
    }

    public final void h() {
        hhsk hhsk0;
        hhqy hhqy0 = this.n;
        if((hhqy0.b & 16) == 0) {
            hhsk0 = hhsk.a;
        }
        else {
            hhsk0 = hhqy0.h;
            if(hhsk0 == null) {
                hhsk0 = hhsk.a;
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhsk.a).w(((ProtoLiteMessage)hhsk0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhsk hhsk1 = (hhsk)hftp0.b_message;
        hhsk1.b |= 0x40;
        hhsk1.i = true;
        hhsk hhsk2 = (hhsk)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hhqy.a).w(((ProtoLiteMessage)this.n));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hhqy hhqy1 = (hhqy)hftp1.b_message;
        hhsk2.getClass();
        hhqy1.h = hhsk2;
        hhqy1.b |= 16;
        this.n = (hhqy)hftp1.N_build();
    }

    protected final void i(String s) {
        if(!bbqr.d(s)) {
            aikl.x.h("Showing toast: %s", new Object[]{s});
            Toast.makeText(this, s, 1).show();
        }
    }

    protected final void l(ailt ailt0, ailt ailt1) {
        if(ailt0 != null) {
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.o(ailt0);
            ca0.a();
        }
        this.y = ailt1.z();
        fm fm0 = this.getSupportFragmentManager();
        ca ca1 = new ca(fm0);
        if(fm0.h(ailt1.z()) == null) {
            ca1.u(0x7F0B14CA, ailt1, ailt1.z());  // id:fragments_layout
        }
        if(!ca1.l()) {
            ca1.a();
        }
    }

    protected final void m(String s, ailt ailt0) {
        if(!this.y.equals(s)) {
            if(!hpqx.a.c().o()) {
                throw new RuntimeException("Current fragment doesn\'t match the one to be swapped");
            }
            if(this.y.equals(ailt0.getTag())) {
                return;
            }
            this.u(ailt0);
            return;
        }
        this.u(ailt0);
    }

    @Override  // aili
    public boolean n(ailt ailt0, int v) {
        int v1;
        aiky aiky0 = this.A;
        if(aiky0 != null) {
            String s = ailt0.z();
            if(ailq.a.equals(s)) {
                if(v == 0) {
                    xob xob0 = aiky0.a;
                    Intent intent0 = ((KeyguardManager)xob0.getSystemService("keyguard")).createConfirmDeviceCredentialIntent(aiky0.c.getString(ailq.ah), aiky0.c.getString(ailq.ai));
                    if(intent0 == null) {
                        v1 = 3;
                    }
                    else {
                        aiky.f.h("Locking via ConfirmDeviceCredentialIntent", new Object[0]);
                        aiky0.e = true;
                        xob0.startActivityForResult(intent0, 1);
                        v1 = 1;
                    }
                    aiky0.b();
                    switch(v1) {
                        case 1: {
                            break;
                        }
                        case 2: {
                            this.l(ailt0, this.b());
                            this.h();
                            break;
                        }
                        default: {
                            aikl.x.f("Failed to lock the screen.", new Object[0]);
                            this.l(ailt0, this.b());
                            return true;
                        }
                    }
                    return true;
                }
                this.c(ailt0);
                return true;
            }
        }
        return false;
    }

    @Override  // xoi
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1 && v1 == -1) {
            this.m(this.y, this.b());
            this.h();
        }
    }

    @Override  // xnb
    public final void onBackPressed() {
        super.onBackPressed();
        this.t();
    }

    @Override  // aiko
    public final void onDestroy() {
        super.onDestroy();
        aiky aiky0 = this.A;
        if(aiky0 != null) {
            aiky0.b();
        }
        BroadcastReceiver broadcastReceiver0 = this.B;
        if(broadcastReceiver0 != null) {
            this.unregisterReceiver(broadcastReceiver0);
        }
    }

    @Override  // aiko
    protected final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("current_fragment", this.y);
    }

    @Override  // com.google.android.chimera.android.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        if(this.A != null && this.y.equals(ailq.a)) {
            aiky aiky0 = this.A;
            if(aiky0.e) {
                aiky0.e = false;
                aikl.x.d("Ignoring onUserLeaveHint due to screen locker", new Object[0]);
                return;
            }
        }
        this.t();
    }

    private final void t() {
        if(!this.u) {
            this.s(hhqj.g, 201);
        }
        this.setResult(0);
        this.finish();
    }

    private final void u(ailt ailt0) {
        fm fm0 = this.getSupportFragmentManager();
        ca ca0 = new ca(fm0);
        if(fm0.h(ailt0.z()) == null) {
            ca0.z(0x7F0B14CA, ailt0, ailt0.z());  // id:fragments_layout
        }
        if(!ca0.l()) {
            ca0.b();
        }
    }
}

