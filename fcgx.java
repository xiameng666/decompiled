import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.backup.phone.BackupOptInChimeraActivity;
import j..util.Objects;
import j..util.Optional;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcgx implements Consumer {
    public final BackupOptInChimeraActivity a;

    public fcgx(BackupOptInChimeraActivity backupOptInChimeraActivity0) {
        this.a = backupOptInChimeraActivity0;
    }

    @Override
    public final void accept(Object object0) {
        Optional optional0;
        BackupOptInChimeraActivity backupOptInChimeraActivity0 = this.a;
        backupOptInChimeraActivity0.w = (AppTheme)object0;
        fczo.g(((AppTheme)object0), backupOptInChimeraActivity0.getIntent(), backupOptInChimeraActivity0);
        backupOptInChimeraActivity0.setContentView(fczo.c(((AppTheme)object0), backupOptInChimeraActivity0.getLayoutInflater()).inflate(0x7F0E021D, null, false));  // layout:companion_backup_opt_in_activity
        Context context0 = ((AppTheme)object0).b() == 1 ? fyhn.a(backupOptInChimeraActivity0) : backupOptInChimeraActivity0;
        int v = fyho.d(context0, 0x1010031, "Background color");
        View view0 = backupOptInChimeraActivity0.findViewById(0x7F0B0CEA);  // id:bottom_app_bar
        view0.getBackground().setTint(v);
        view0.getBackground().setAlpha(backupOptInChimeraActivity0.getResources().getInteger(0x7F0C0022));  // integer:companion_backup_opt_in_button_bar_alpha
        LottieAnimationView lottieAnimationView0 = (LottieAnimationView)backupOptInChimeraActivity0.findViewById(0x7F0B1672);  // id:hero_animation
        qli qli0 = qkm.j(backupOptInChimeraActivity0, 0x7F140283);  // raw:wearable_companion_opt_in_animation_circular_dark
        Objects.requireNonNull(lottieAnimationView0);
        qli0.d(new fchi(lottieAnimationView0));
        backupOptInChimeraActivity0.v = (Button)backupOptInChimeraActivity0.findViewById(0x7F0B1A33);  // id:not_now_button
        backupOptInChimeraActivity0.v.setOnClickListener(new fchj(backupOptInChimeraActivity0));
        backupOptInChimeraActivity0.getOnBackPressedDispatcher().c(backupOptInChimeraActivity0, new fchn(backupOptInChimeraActivity0));
        ((Button)backupOptInChimeraActivity0.findViewById(0x7F0B20F4)).setOnClickListener(new fchk(backupOptInChimeraActivity0, ((AppTheme)object0)));  // id:storage_more_details
        byte[] arr_b = backupOptInChimeraActivity0.getIntent().getByteArrayExtra("backup_status");
        if(arr_b == null) {
            optional0 = Optional.empty();
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fext.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                optional0 = Optional.of(((fext)hftv0));
            }
            catch(hfur hfur0) {
                BackupOptInChimeraActivity.j.n("BackupStatus extra proto was invalid.", hfur0, new Object[0]);
                optional0 = Optional.empty();
            }
        }
        if(optional0.isPresent()) {
            backupOptInChimeraActivity0.g(((fext)optional0.get()));
        }
        else {
            evql evql0 = backupOptInChimeraActivity0.t.f();
            evql0.b(new fcgy(backupOptInChimeraActivity0));
            evql0.A(new fcgz(backupOptInChimeraActivity0));
        }
        LinearLayout linearLayout0 = (LinearLayout)backupOptInChimeraActivity0.findViewById(0x7F0B1649);  // id:header
        fczo.h(linearLayout0, ((AppTheme)object0), new TextView[]{((TextView)linearLayout0.findViewById(0x7F0B22B8))});  // id:title
        fcge.a(((TextView)backupOptInChimeraActivity0.findViewById(0x7F0B20E9)));  // id:storage_body
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

