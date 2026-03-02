import android.content.Context;
import java.io.File;

public final class dvbk implements evqf {
    public final dvcl a;
    public final Context b;

    public dvbk(dvcl dvcl0, Context context0) {
        this.a = dvcl0;
        this.b = context0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        dvcl dvcl0 = this.a;
        Context context0 = this.b;
        if(hwev.c()) {
            dvcd dvcd0 = new dvcd(dvcl0);
            ftuy ftuy0 = new ftuy();
            ftuy0.h(ftts.a(new fryr(0x7F151B8D), new dvce(dvcl0, context0, ((File)object0), dvcd0)).a());  // string:pay_activity_history_export_success_view_button_text "View File"
            ftux ftux0 = ftts.a(new fryr(0x7F150820), dvcd0);  // string:common_done "Done"
            ftux0.c(ftvc.a);
            ftuy0.i(ftux0.a());
            ftuy0.c(true);
            ftuw ftuw0 = ftuy0.a();
            ftvr ftvr0 = ftvq.a(new fryu(context0.getString(0x7F151B8B, new Object[]{dvcl0.A()})), new fryh(0x7F08038B), ftuw0, dvcd0);  // string:pay_activity_history__export_success_dialog_title "%1$s activity history 
                                                                                                                                         // has been saved to Downloads"
            dvcl0.ao().runOnUiThread(new dvcf(dvcl0, ftvr0));
            return;
        }
        dvcl0.ao().runOnUiThread(new dvcc(dvcl0, context0, ((File)object0)));
    }
}

