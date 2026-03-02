import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.telephony.euicc.EuiccManager;
import j..util.Objects;

final class csay extends BroadcastReceiver {
    final csaz a;

    public csay(csaz csaz0) {
        Objects.requireNonNull(csaz0);
        this.a = csaz0;
        super();
    }

    private final void a(int v, Intent intent0) {
        switch(v) {
            case 0: {
                ((ggtj)csaz.a.h()).x("Successful call back from EuiccManager on eSIM request");
                ((ggtj)csaz.a.h()).x("Continuing to eSIM success screen");
                this.a.d.k();
                this.a.d.v(this.a.b, 8, false);
                csdd csdd0 = new csdd();
                ca ca0 = new ca(this.a.b.getSupportFragmentManager());
                ca0.j = 0x1003;
                ca0.C();
                ca0.z(0x7F0B0FCE, csdd0, "EsimSuccessFragment");  // id:container
                ca0.a();
                this.a.b.getSupportFragmentManager().aq();
                return;
            }
            case 1: {
                ((ggtj)csaz.a.h()).x("Got resolvable error on eSIM callback.");
                try {
                    Object object0 = this.a.b.getApplicationContext().getSystemService("euicc");
                    batl.s(object0);
                    String s = this.a.c.getString("esim_activation_code");
                    batl.s(s);
                    ((EuiccManager)object0).startResolutionActivity(this.a.b.getContainerActivity(), 0, intent0, this.a.y(intent0, s));
                }
                catch(IntentSender.SendIntentException | NullPointerException unused_ex) {
                    ((ggtj)csaz.a.j()).x("Could not start resolution activity on eSIM callback.");
                    this.a.d.v(this.a.b, 9, false);
                    this.a.c.putLong("ESIM_RPC_STATUS_KEY", 27062L);
                    cscb.B(this.a.b, this.a.c, hhct.dC, this.a.d.b);
                }
                return;
            }
            case 2: {
                int v1 = intent0.getIntExtra("android.telephony.euicc.extra.EMBEDDED_SUBSCRIPTION_DETAILED_CODE", 0);
                ((ggtj)csaz.a.j()).z("Got an error when fetching eSIM profile metadata with detail code: %s", v1);
            }
        }
        this.a.d.v(this.a.b, 9, false);
        ((ggtj)csaz.a.j()).x("eSIM download using EuiccManager failed.");
        this.a.c.putLong("ESIM_RPC_STATUS_KEY", 27063L);
        cscb.B(this.a.b, this.a.c, hhct.dC, this.a.d.b);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.mobiledataplan.esim.DOWNLOAD_CALLBACK")) {
            ((ggtj)csaz.a.h()).x("Received call back from EuiccManager on eSIM request");
            this.a(this.getResultCode(), intent0);
        }
    }
}

