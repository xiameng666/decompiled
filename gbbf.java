import android.content.Intent;
import android.util.Log;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gbbf extends gaok {
    private final gbap b;
    private final gcsk c;

    public gbbf(gamx gamx0, gbap gbap0, gcsk gcsk0) {
        super(gamx0);
        this.b = gbap0;
        this.c = gcsk0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        ibuq.f(gano0, "request");
        ibuq.f(gano0, "<this>");
        hdva hdva0 = (hdva)gawi.d(gano0.a, "lazyDataRequestExtra", ((MessageLite)hdva.a));
        gavr.d(hdva0, "BE_LDA_01", this.f(), null, null, 24);
        try {
            gamx gamx0 = this.d();
            String s = gbbh.a(this.d().d.b);
            String s1 = this.b.c(gamx0, gamx0.a, gamx0.d.a, s, true);
            WidgetConfig widgetConfig0 = this.d().d;
            gcsg gcsg0 = new gbbm("lazydataservice/load", ckzp.b).a(widgetConfig0);
            byte[] arr_b = hdva0.toBytesArray();
            ibuq.c(s1);
            Object object0 = ((gbbg)this.c).a(gcsg0, arr_b, s1, null).a().b();
            if(object0 != null) {
                Intent intent0 = ganp.e(0);
                intent0.putExtra("lazyDataResponseExtra", ((byte[])object0));
                return new ganp(intent0);
            }
            return new ganp(ganp.d(0));
        }
        catch(gcqz gcqz0) {
            Log.e("LoadLazyDataAction", "Network Error: " + gcqz0.toString());
            return new ganp(ganp.d(0));
        }
        catch(gcqt gcqt0) {
            Log.e("LoadLazyDataAction", "Auth Error: " + gcqt0.toString());
            return gcqt0.a == null ? new ganp(ganp.d(0)) : new ganp(ganp.f(gcqt0.a));
        }
    }
}

