import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class epfv {
    public static epfv a;
    private static final baun b;
    private final Context c;

    static {
        epfv.b = new baun("SetupServices", new String[]{"AuthHelper"});
    }

    private epfv(Context context0) {
        this.c = context0.getApplicationContext();
    }

    public static epfv a(Context context0) {
        if(epfv.a == null) {
            epfv.a = new epfv(context0);
        }
        return epfv.a;
    }

    public final void b(Account account0, evqp evqp0) {
        BitmapDrawable bitmapDrawable0;
        Bundle bundle1;
        evql evql0;
        if(account0 == null) {
            epfv.b.h("getAccountAvatar: account is null", new Object[0]);
            evql0 = null;
        }
        else {
            evqp evqp1 = new evqp();
            Context context0 = this.c;
            String s = account0.name;
            Bundle bundle0 = new Bundle();
            try {
                Uri uri0 = new Uri.Builder().scheme("content").authority("com.google.android.setupwizard.account").appendPath("getAccountFeature").build();
                bundle1 = context0.getContentResolver().call(uri0, "getAccountFeature", s, bundle0);
            }
            catch(IllegalArgumentException unused_ex) {
                epfv.b.m("Fail to get config from account provider", new Object[0]);
                bundle1 = null;
            }
            if(bundle1 == null) {
                bitmapDrawable0 = null;
            }
            else {
                Bitmap bitmap0 = (Bitmap)bundle1.getParcelable(s);
                bitmapDrawable0 = bitmap0 == null ? null : new BitmapDrawable(context0.getResources(), bitmap0);
            }
            evqp1.c(bitmapDrawable0);
            evql0 = evqp1.a;
        }
        if(evql0 == null) {
            evqp0.c(null);
            return;
        }
        try {
            evrg.o(evql0, 3000L, TimeUnit.MILLISECONDS);
            evqp0.c(((Drawable)evql0.j()));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            epfv.b.m("getAccountAvatarAsync: unable to query account avatar message=" + exception0.getMessage(), new Object[0]);
            evqp0.c(null);
        }
    }

    public final void c(Account account0, evqp evqp0) {
        evql evql0;
        Integer integer0 = (int)3;
        if(account0 == null) {
            epfv.b.h("getMinorCapability: account is null", new Object[0]);
            evql0 = evrg.d(Integer.valueOf(2));
        }
        else {
            evqp evqp1 = new evqp();
            try {
                String s = TextUtils.isEmpty(hydh.d()) ? "gm2dclldmfya" : hydh.d();
                epfv.b.h("getMinorCapability: minorCapabilityAlias=" + s, new Object[0]);
                HasCapabilitiesRequest hasCapabilitiesRequest0 = new HasCapabilitiesRequest(account0, new String[]{s});
                int v = acso.c(this.c, hasCapabilitiesRequest0);
                epfv.b.h("getMinorCapability: hasCapabilities=" + v, new Object[0]);
                evqp1.c(Integer.valueOf(v));
            }
            catch(acse | IOException exception0) {
                epfv.b.m("getMinorCapability: unable to query capability message=" + exception0.getMessage(), new Object[0]);
                evqp1.c(integer0);
            }
            evql0 = evqp1.a;
        }
        try {
            evrg.o(evql0, (hydh.b() <= 0L ? 1500L : hydh.b()), TimeUnit.MILLISECONDS);
            evqp0.c(((Integer)evql0.j()));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            epfv.b.m("getMinorCapabilityAsync: unable to query capability message=" + exception1.getMessage(), new Object[0]);
            evqp0.c(integer0);
        }
    }
}

