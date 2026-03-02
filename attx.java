import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.cast.activity.CastPopupChimeraActivity;

public final class attx extends attp {
    iw e;
    de f;
    private final avjh g;
    private final gful_cronetEngineProvider h;
    private int i;

    public attx(CastPopupChimeraActivity castPopupChimeraActivity0) {
        super(castPopupChimeraActivity0);
        this.g = new avjh("CastConnectionActivity");
        this.h = gfus.a(((gful_cronetEngineProvider)new attq()));
        this.e = null;
        this.f = null;
        this.i = -1;
    }

    @Override  // attp
    public final void d() {
        de de0 = this.f;
        if(de0 != null) {
            if(!((Boolean)this.h.mr()).booleanValue()) {
                de0.dismissAllowingStateLoss();
            }
            else if(!this.o().au()) {
                de0.dismissNow();
            }
            this.f = null;
            this.g.m("Dismissed prior dialog fragment");
        }
        iw iw0 = this.e;
        if(iw0 != null) {
            iw0.dismiss();
            this.e = null;
            this.g.m("Dismissed prior dialog");
        }
    }

    @Override  // attp
    public final void e(Intent intent0) {
        this.d();
        this.b = intent0.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_OPERATION", 0);
        this.d = gfta.b(intent0.getStringExtra("com.google.android.gms.cast.session.DIALOG_KEY_REMOTE_DEVICE_NAME"));
        this.i = intent0.getIntExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", -1);
    }

    // Detected as a lambda impl.
    @Override  // attp
    public final void f(int v) {
        this.c = v;
        Intent intent0 = new Intent("com.google.android.gms.cast.activity.DIALOG_ACTION_STATE_CHANGE");
        intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", v);
        intent0.putExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", this.i);
        intent0.setPackage("com.google.android.gms");
        this.j.sendBroadcast(intent0);
    }

    @Override  // attp
    public final void g(Bundle bundle0) {
        super.g(bundle0);
        this.b();
    }

    @Override  // attp
    public final void h() {
        if(avij.e().D()) {
            this.c();
            super.h();
            return;
        }
        super.h();
        this.c();
    }

    @Override  // attp
    public final void k() {
        if(this.c == 0) {
            int v = attx.n(this.b);
            if(v != -1) {
                this.l(v);
            }
        }
        super.k();
    }

    @Override  // attp
    protected final void l(int v) {
        this.g.n("Cast connection dialog dismissed with action result %d", Integer.valueOf(v));
        super.l(v);
    }

    @Override  // attp
    public final void m() {
        iw iw0;
        Drawable drawable0;
        int v = this.b;
        if(v == 0) {
            this.g.m("Close Cast connection dialog and exit the activity");
            this.f(1);
            this.j.finish();
            return;
        }
        avjh avjh0 = this.g;
        avjh0.p("Show Cast connection dialog (operation=%d) for device \'%s\'", Integer.valueOf(v), this.a());
        CastPopupChimeraActivity castPopupChimeraActivity0 = this.j;
        this.a = castPopupChimeraActivity0.getRequestedOrientation();
        castPopupChimeraActivity0.setRequestedOrientation(14);
        if(sku.a(castPopupChimeraActivity0.getApplicationContext())) {
            du du0 = this.o().h("CastConnectionDialogFragment");
            if(((Boolean)this.h.mr()).booleanValue()) {
                if(du0 != null && this.f != null) {
                    avjh0.m("There is an existing dialog");
                    return;
                }
            }
            else if(du0 != null) {
                return;
            }
            String s = this.d;
            int v1 = this.b;
            Bundle bundle0 = new Bundle();
            bundle0.putString("DEVICE_NAME_KEY", s);
            bundle0.putInt("DIALOG_OPERATION_KEY", v1);
            atud atud0 = new atud();
            atud0.setArguments(bundle0);
            this.f = atud0;
            castPopupChimeraActivity0.getSupportFragmentManager().af("CAST_CONNECTION_DIALOG_OPERATION_REQUEST_KEY", castPopupChimeraActivity0, new attu(this));
            castPopupChimeraActivity0.getSupportFragmentManager().af("CAST_CONNECTION_DIALOG_OPENED_REQUEST_KEY", castPopupChimeraActivity0, (/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
                this.c = 0;
                Intent intent0 = new Intent("com.google.android.gms.cast.activity.DIALOG_ACTION_STATE_CHANGE");
                intent0.putExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 0);
                intent0.putExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", this.i);
                intent0.setPackage("com.google.android.gms");
                this.j.sendBroadcast(intent0);
            });
            atud0.show(castPopupChimeraActivity0.getSupportFragmentManager(), "CastConnectionDialogFragment");
            return;
        }
        int v2 = castPopupChimeraActivity0.getResources().getColor(0x7F060000);  // color:CastPopupUserDialogColor
        CharSequence charSequence0 = null;
        View view0 = castPopupChimeraActivity0.getLayoutInflater().inflate(0x7F0E01DB, null);  // layout:cast_popup_user_dialog
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B0E6B);  // id:castUserDialogIcon
        if(this.b == 1) {
            drawable0 = (AnimationDrawable)this.p(0x7F08080F);  // drawable:ic_notification_cast_connecting
            if(drawable0 == null) {
                drawable0 = null;
            }
            else {
                ((AnimationDrawable)drawable0).start();
            }
        }
        else {
            drawable0 = this.p(0x7F080570);  // drawable:gs_error_vd_theme_48
        }
        if(drawable0 != null) {
            drawable0.mutate().setTint(v2);
            imageView0.setImageDrawable(drawable0);
        }
        int v3 = this.b;
        ((TextView)view0.findViewById(0x7F0B0E6D)).setText(castPopupChimeraActivity0.getString((v3 == 1 ? 0x7F1506DB : 0x7F1506D9), new Object[]{this.d}));  // id:castUserDialogTitle
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0E69);  // id:castMessage
        int v4 = this.b;
        if(v4 == 1) {
            charSequence0 = castPopupChimeraActivity0.getString(0x7F1506DA, new Object[]{this.d});  // string:cast_connection_wait_dialog_body "Accept cast request on your %1$s"
        }
        else {
            switch(v4) {
                case 2: {
                    charSequence0 = castPopupChimeraActivity0.getString(0x7F1506D8, new Object[]{this.d});  // string:cast_connection_denied_dialog_body_user_cancelled "Make sure to accept the 
                                                                                                            // cast request on your %1$s."
                    break;
                }
                case 3: {
                    charSequence0 = castPopupChimeraActivity0.getString(0x7F1506D6, new Object[]{this.d});  // string:cast_connection_denied_dialog_body_notification_disabled "Make sure your 
                                                                                                            // notifications are turned on on your %1$s."
                    break;
                }
                case 4: {
                    charSequence0 = castPopupChimeraActivity0.getText(0x7F1506D7);  // string:cast_connection_denied_dialog_body_profile_disabled "Make sure you select 
                                                                                    // Allow Cast in your profile in your tablet\'s settings.\n\nOn your tablet, go to 
                                                                                    // Settings > Google > Devices & sharing > Cast to this device and Allow Cast in your 
                                                                                    // profile."
                }
            }
        }
        if(charSequence0 != null) {
            textView0.setText(charSequence0);
        }
        int v5 = this.b;
        if(v5 == 1) {
            iv iv0 = new iv(castPopupChimeraActivity0, 0x7F1602B3);  // style:Cast_PopupUserDialog
            iv0.c(false);
            iv0.r("Cancel", new attw(this));
            iw0 = iv0.create();
        }
        else {
            iv iv1 = new iv(castPopupChimeraActivity0, 0x7F1602B3);  // style:Cast_PopupUserDialog
            iv1.c(true);
            int v6 = attx.n(v5);
            iv1.o("Close", new attr(this, v6));
            iv1.r("Try again", new atts(this));
            iv1.h(new attt(this, v6));
            iw0 = iv1.create();
        }
        iw0.f(view0);
        iw0.show();
        iw0.b(-2).setTextColor(v2);
        iw0.b(-1).setTextColor(v2);
        this.f(0);
        this.e = iw0;
    }

    // String Decryptor: 1 succeeded, 0 failed
    static final int n(int v) {
        if(v == 1) {
            return 3;
        }
        return v == 2 || v == 3 || v == 4 ? 2 : -1;
    }

    private final Drawable p(int v) {
        return this.j.getApplicationContext().getDrawable(v);
    }
}

