import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.backup.g1.notifications.msa.EnableMmsAndNotifyUserGcmTaskChimeraService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class aryz {
    private static final baun a;
    private final Context b;
    private final aryi c;

    static {
        aryz.a = new aqql(new String[]{"NotificationSpecialActionHelper"});
    }

    public aryz(Context context0) {
        this.b = context0;
        this.c = new aryi(context0);
    }

    public final void a(aryt aryt0) {
        if(aryt0 == null || (aryv.a(aryt0.c) == 0 ? 1 : aryv.a(aryt0.c)) - 1 != 1) {
            return;
        }
        boolean z = false;
        aryz.a.j("execute special action: TURN_MMS_ON_IN_DAYS_VALUE", new Object[0]);
        aqpn aqpn0 = new aqpn(this.b);
        try {
            aqpm aqpm0 = new aqpm();
            ((glyq)aqpn0.a.b(aqpm0, gmap.a)).u();
        }
        catch(ExecutionException | InterruptedException exception0) {
            aryz.a.g("Error saving MSA record", exception0, new Object[0]);
        }
        Context context0 = this.b;
        String s = (String)aryt0.d.get("days");
        if(s == null) {
            throw new IllegalArgumentException();
        }
        int v = Integer.parseInt(s);
        String s1 = (String)aryt0.d.get("title");
        if(s1 == null) {
            throw new IllegalArgumentException();
        }
        String s2 = (String)aryt0.d.get("text");
        if(s2 == null) {
            throw new IllegalArgumentException();
        }
        if(v > 0) {
            z = true;
        }
        batl.c(z, "Number of days to wait must be positive");
        Bundle bundle0 = new Bundle();
        bundle0.putString("title", s1);
        bundle0.putString("text", s2);
        clkn clkn0 = new clkn();
        clkn0.w(EnableMmsAndNotifyUserGcmTaskChimeraService.class.getName());
        clkn0.e(TimeUnit.DAYS.toSeconds(((long)v)), TimeUnit.DAYS.toSeconds(((long)v)) + TimeUnit.HOURS.toSeconds(12L));
        clkn0.u = bundle0;
        clkn0.q("com.google.android.gms.backup.g1.notifications.msa.ENABLE_MMS_AND_NOTIFY_USER_SERVICE");
        clkn0.p = true;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
        aryi aryi0 = this.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gidu)hftp0.b_message).c = 1;
        ((gidu)hftp0.b_message).b |= 1;
        gidu gidu0 = (gidu)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidu0.getClass();
        ghys0.X = gidu0;
        ghys0.c |= 0x8000000;
        aryi0.a(((ghys)hftp1.N_build()));
    }
}

