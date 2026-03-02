import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import com.google.android.gms.chimera.modules.accountsettings.AppContextProvider;
import com.google.android.gms.feedback.ThemeSettings;
import j..util.Objects;
import java.io.IOException;

public final class aaei extends aadr {
    private final grwv c;
    private final aatb d;
    private final du e;

    public aaei(grwv grwv0, aatb aatb0, du du0, aahq aahq0, aaej aaej0) {
        super(aahq0, aaej0);
        this.c = grwv0;
        this.d = aatb0;
        this.e = du0;
    }

    @Override  // aady
    public final void a() {
        try {
            grwv grwv0 = this.c;
            int v = 2;
            switch(grwv0.c) {
                case 2: {
                    String s = aaua.b(this.d);
                    Uri uri0 = Uri.parse(hojn.a.g().A()).buildUpon().appendQueryParameter("hl", aaus.a()).build();
                    Context context0 = this.e.requireContext();
                    fyju fyju0 = new fyju(this.e.requireContext(), 0x7F160060);  // style:AsCenteredMaterialDialogTheme
                    fyju0.x(true);
                    fyju0.N(0x7F1500F9);  // string:accountsettings_set_avatar_dialog_title "Profile photo"
                    fyju0.D(Html.fromHtml(context0.getString(0x7F1500F7, new Object[]{uri0.toString()})));  // string:accountsettings_set_avatar_dialog_message "Your profile photo is visible 
                                                                                                            // to everyone, across Google products. <a href=%s>Learn more</a>"
                    fyju0.F(0x1040000, new aaec(this));
                    fyju0.L(0x7F1500F8, new aaed(this, s));  // string:accountsettings_set_avatar_dialog_positive_button "Set Profile Photo"
                    iw iw0 = fyju0.create();
                    iw0.setOnShowListener(new aaee(this, iw0, uri0));
                    iw0.setOnCancelListener(new aaef(this));
                    iw0.show();
                    return;
                }
                case 4: {
                    this.f(aaei.b(aaua.b(this.d)), 5);
                    return;
                }
                case 5: {
                    this.f(aaei.c(aaua.b(this.d)), 8);
                    return;
                }
                case 7: {
                    grvv grvv0 = grwv0.d == null ? grvv.a : grwv0.d;
                    aatb aatb0 = this.d;
                    xob xob0 = (xob)this.e.requireContext();
                    bkyf bkyf0 = new bkyf();
                    if(grvv0.c) {
                        Bitmap bitmap0 = azts.Z(xob0.getContainerActivity());
                        if(bitmap0 != null) {
                            bkyf0.a = bitmap0;
                        }
                    }
                    if(aaua.c(aatb0)) {
                        bkyf0.b = aatb0.b;
                    }
                    if(!bbqr.d(grvv0.b)) {
                        bkyf0.d = grvv0.b;
                    }
                    ThemeSettings themeSettings0 = new ThemeSettings();
                    if(!cchl.d()) {
                        v = 0;
                    }
                    themeSettings0.a = v;
                    bkyf0.e = themeSettings0;
                    evql evql0 = new azts(xob0.getContainerActivity(), null).ab(bkyf0.a());
                    evql0.x(xob0, new aadz(this));
                    aaej aaej0 = this.a;
                    Objects.requireNonNull(aaej0);
                    evql0.u(xob0, new aaea(aaej0));
                    return;
                }
                case 10: {
                    cchj.b(this.e.requireContext()).s("com.google", null, null, (AccountManagerFuture accountManagerFuture0) -> try {
                        Intent intent0 = (Intent)((Bundle)accountManagerFuture0.getResult()).getParcelable("intent");
                        if(intent0 == null) {
                            this.a.a(new IllegalArgumentException("Add account intent was null."));
                            return;
                        }
                        this.f(intent0, 13);
                    }
                    catch(AuthenticatorException | IOException | OperationCanceledException exception0) {
                        this.a.a(exception0);
                    }, null);
                    return;
                }
                case 19: {
                    if((grwv0.b & 16) != 0) {
                        cchp.a(((xob)this.e.requireContext()), (grwv0.e == null ? grwc.a : grwv0.e), this.d.b);
                        this.b.a(true);
                        return;
                    }
                    this.a.a(new IllegalArgumentException("Unknown Google Help State"));
                    return;
                }
                default: {
                    this.a.a(new IllegalArgumentException("Unknown native action ID"));
                }
            }
        }
        catch(aatz aatz0) {
            this.a.a(aatz0);
        }
    }

    public static Intent b(String s) {
        return new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", null)).setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity")).putExtra("account_name", s);
    }

    public static Intent c(String s) {
        return new Intent().setClassName(AppContextProvider.a().getApplicationContext(), "com.google.android.gms.auth.account.otp.OtpActivity").putExtra("account_name", s);
    }

    public static Intent d(String s) {
        return new Intent("com.google.android.gms.people.profile.ACTION_SET_AVATAR").putExtra("com.google.android.gms.people.profile.EXTRA_ACCOUNT", s).setPackage("com.google.android.gms");
    }

    public final void f(Intent intent0, int v) {
        try {
            this.e.startActivityForResult(intent0, v);
            this.b.a(true);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            this.a.a(activityNotFoundException0);
        }
    }

    public static boolean g(Intent intent0) {
        return bbmq.ae(AppContextProvider.a().getApplicationContext(), intent0);
    }
}

