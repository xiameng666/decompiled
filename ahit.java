import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcelable;

public final class ahit implements gfsi {
    public final ahiw a;
    public final gged_interceptors b;

    public ahit(ahiw ahiw0, gged_interceptors gged0) {
        this.a = ahiw0;
        this.b = gged0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ahiw ahiw0 = this.a;
        ahie ahie0 = new ahie(ahiw0);
        gfsx gfsx0 = gggq.c(this.b, ahie0);
        boolean z = ((Boolean)object0).booleanValue();
        ahin ahin0 = new ahin();
        gged_interceptors gged0 = gged_interceptors.h(gggq.j(this.b, ahin0));
        gfsx gfsx1 = gfsx0.i() ? gfsx.m(((bxie)gfsx0.d()).a()) : gfqx.a;
        Intent intent0 = new Intent().setClassName(ahiw0.a, "com.google.android.gms.auth.api.credentials.ui.CredentialsSaveConfirmationActivity").putExtra("app_id", ahiw0.c).putExtra("is_first_use", z).putExtra("available_accounts", ((Parcelable[])gged0.toArray(new Account[0]))).putExtra("selected_account", ((Parcelable)gfsx1.g())).putExtra("key_log_session_id", ahiw0.e);
        bauc.l(ahiw0.d, intent0, "extra_credentials");
        PendingIntent pendingIntent0 = cjok.a(ahiw0.a, 0, intent0, 0xA000000);
        bxly bxly0 = new bxly();
        bxly0.a = 0x6F07;
        bxly0.d = pendingIntent0;
        throw new gmdd(bxly0.a());
    }
}

