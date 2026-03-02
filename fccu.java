import android.accounts.Account;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader.ImageContainer;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public final class fccu implements ImageLoader.ImageListener, Runnable {
    private final Context a;
    private final Intent b;
    private final String c;
    private final String d;
    private final String e;
    private NotificationChannel f;

    public fccu(Context context0, Intent intent0, String s, String s1, String s2) {
        this.a = context0;
        this.b = intent0;
        this.e = s;
        this.c = s1;
        this.d = s2;
    }

    public static Intent a(Context context0, Account account0, int v, hcfx hcfx0, BuyFlowConfig buyFlowConfig0) {
        fbjk fbjk0 = new fbjk(context0, null);
        if((hcfx0.b & 4) != 0) {
            fbjk0.i(hcfx0.e.toByteArray());
        }
        WalletCustomTheme walletCustomTheme0 = new WalletCustomTheme();
        walletCustomTheme0.e(2);
        fbjk0.d(walletCustomTheme0);
        fbjk0.c(account0);
        fbjk0.e(v);
        fbjk0.g(3);
        Intent intent0 = fbjk0.a();
        intent0.addFlags(0x4000000);
        return fble.k(context0, intent0, buyFlowConfig0);
    }

    @Override  // com.android.volley.Response$ErrorListener
    public final void onErrorResponse(VolleyError volleyError0) {
    }

    @Override  // com.android.volley.toolbox.ImageLoader$ImageListener
    public final void onResponse(ImageLoader.ImageContainer imageLoader$ImageContainer0, boolean z) {
        Context context0 = this.a;
        if(this.f == null) {
            this.f = new NotificationChannel("wallet.ui.notification.default_channel_id", "wallet notification channel", 4);
            bayn.f(context0).p(this.f);
        }
        juo juo0 = new juo(context0, this.f.getId());
        juo0.s(0x1080078);
        juo0.H(imageLoader$ImageContainer0.getBitmap());
        juo0.D(this.c);
        juo0.k(this.d);
        juo0.m = 1;
        juo0.x(new long[0]);
        juo0.h(true);
        juo0.h = bbmq.g(context0, this.b, 0x42000000);
        bayo bayo0 = bayo.a(context0);
        bayo0.b(1);
        bayo0.d(1, juo0.a());
    }

    @Override
    public final void run() {
        int v = (int)(((Integer)gcjg.b.a()));
        gcio.b(this.a, v).get(this.e, this);
    }
}

