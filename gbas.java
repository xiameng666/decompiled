import android.content.Intent;
import android.net.Uri.Builder;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.util.Map;

public final class gbas extends gaok {
    private final gbap b;
    private final gcsk c;

    public gbas(gamx gamx0, gbap gbap0, gcsk gcsk0) {
        super(gamx0);
        this.b = gbap0;
        this.c = gcsk0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        byte[] arr_b;
        WidgetConfig widgetConfig0 = this.e(gano0);
        Intent intent0 = gano0.a;
        String s = intent0.getStringExtra("requestPostBody");
        String s1 = intent0.getStringExtra("cookie");
        int v = intent0.getIntExtra("retryAttempts", 3);
        String s2 = intent0.getStringExtra("url");
        gavr.b(s2, "BE_DDA_01", this.f(), gavs.a, "Document endpoint url required.");
        try {
            gamx gamx0 = this.d();
            String s3 = this.b.c(gamx0, this.a, widgetConfig0.a, gbbh.a(widgetConfig0.b), true);
            gcsg gcsg0 = new gcsg(s2, ckzv.b);
            ibuq.f(s3, "authToken");
            gbbc gbbc0 = ((gbbg)this.c).a;
            ibuq.f(s3, "authToken");
            if(s == null) {
                arr_b = new byte[0];
            }
            else {
                Uri.Builder uri$Builder0 = new Uri.Builder();
                uri$Builder0.appendQueryParameter("request", s);
                String s4 = uri$Builder0.appendQueryParameter("requestContentType", "application/byte-data").build().getEncodedQuery();
                arr_b = s4 == null ? new byte[0] : s4.getBytes();
            }
            gcsn gcsn0 = new gcsi(new gcsl(gcsg0, null, arr_b, s3, s1), new gbau(gbbc0.a, s)).a();
            Object object0 = gcsn0.b();
            if(object0 == null) {
                return ganp.j();
            }
            Intent intent1 = ganp.e(0);
            intent1.putExtra("downloadedFileData", ((byte[])object0));
            String s5 = "text/html";
            Map map0 = gcsn0.c();
            if(map0 != null) {
                if(map0.containsKey("Content-Type")) {
                    s5 = (String)map0.get("Content-Type");
                }
                else if(map0.containsKey("content-type")) {
                    s5 = (String)map0.get("content-type");
                }
            }
            intent1.putExtra("mimeType", s5);
            return new ganp(intent1);
        }
        catch(gcqt | gcqz exception0) {
            if((exception0.getCause() instanceof gcrc) && v > 0) {
                gcrc gcrc0 = (gcrc)exception0.getCause();
                intent0.putExtra("cookie", gcrc0.b);
                intent0.putExtra("url", gcrc0.a);
                intent0.putExtra("retryAttempts", v - 1);
                return this.d().a(new gano(intent0));
            }
            Intent intent2 = (exception0 instanceof gcqt) ? ((gcqt)exception0).a : null;
            return intent2 == null ? ganp.j() : ganp.i(intent2);
        }
    }
}

