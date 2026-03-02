import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.NotificationChimeraBroadcastReceiver;
import j..util.Objects;

public final class dccw implements gmbg {
    final int a;
    final NearbySharingChimeraService b;

    public dccw(NearbySharingChimeraService nearbySharingChimeraService0, int v) {
        this.a = v;
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.b = nearbySharingChimeraService0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        throw new IllegalStateException(throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        int v = this.a;
        if(v == 2) {
            if(((int)(((Integer)object0))) != 0) {
                v = 2;
                goto label_6;
            }
            return;
        }
    label_6:
        NearbySharingChimeraService nearbySharingChimeraService0 = this.b;
        dcii dcii0 = nearbySharingChimeraService0.L;
        int v1 = (int)(((Integer)object0));
        Context context0 = dcii0.a;
        if(!dcww.b(context0).d() && v != 0) {
            CharSequence charSequence0 = context0.getText(0x7F152C92);  // string:sharing_notification_privacy_title_v3 "Your Quick Share visibility"
            CharSequence charSequence1 = v == 3 ? context0.getText(0x7F152C8B) : ((adv)context0).a().getString(0x7F152C89, new Object[]{((Integer)object0), ((adv)context0).a().getQuantityString(0x7F13007D, v1)});  // string:sharing_notification_privacy_description_everyone_v3 "Your device is visible 
                                                                                                                                                                                                                      // to anyone nearby using Quick Share. Tap to review."
            cuqi cuqi0 = new cuqi(context0, "nearby_sharing_privacy");
            cuqi0.ag(new juk());
            cuqi0.Z(charSequence0);
            cuqi0.Y(charSequence1);
            cuqi0.h = dcii0.b();
            cuqi0.al();
            Intent intent0 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("channel_id", "nearby_sharing_privacy");
            PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent0, 0x3F0, 0xC000000, false);
            gftb.check(pendingIntent0);
            cuqi0.aa(pendingIntent0);
            cuqi0.m = 0;
            cuqi0.ak();
            cuqi0.ad(true);
            cuqi0.X(true);
            cuqi0.D = djbm.a(context0);
            cuqi0.ao();
            cuqi0.an();
            cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
            cuqi0.aj("Quick Share");
            dcii.w(cuqi0);
            CharSequence charSequence2 = context0.getText(0x7F152C4D);  // string:sharing_notification_action_do_not_show_again "@com.google.android.gms:string/common_dont_show_again"
            Intent intent1 = new Intent("com.google.android.gms.nearby.sharing.ACTION_STOP_SHOW_PRIVACY_NOTIFICATION").setPackage("com.google.android.gms").putExtra("channel_id", "nearby_sharing_privacy").putExtra("notification_id", 4);
            PendingIntent pendingIntent1 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent1, 1010, 0xC000000, false);
            gftb.check(pendingIntent1);
            cuqi0.W(0, charSequence2, pendingIntent1);
            dcii0.u(4, cuqi0.a());
        }
        dcpn dcpn0 = nearbySharingChimeraService0.P;
        ProtoLiteBuilder hftp0 = dcpt.L(54);
        gyqs gyqs0 = gyqs.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqs0.getClass();
        gysp0.Z = gyqs0;
        gysp0.c |= 0x10000000;
        dcpn0.i(new dcou(((gysp)hftp0.N_build())));
    }
}

