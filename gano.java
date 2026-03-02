import android.content.Intent;
import android.os.Parcelable;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;

public final class gano {
    public final Intent a;
    public gamx b;

    public gano(Intent intent0) {
        this.a = intent0;
        intent0.setExtrasClassLoader(gano.class.getClassLoader());
    }

    public final int a() {
        return this.a.getIntExtra("timeOut", -1);
    }

    public static Intent b(String s, WidgetConfig widgetConfig0) {
        return gano.h(s, widgetConfig0, -1, null);
    }

    public static Intent c(String s, WidgetConfig widgetConfig0, int v) {
        return gano.h(s, widgetConfig0, v, null);
    }

    public static Intent d(String s, WidgetConfig widgetConfig0, Intent intent0) {
        return gano.h(s, widgetConfig0, -1, intent0);
    }

    public final gamx e() {
        gamx gamx0 = this.b;
        gftb.z(gamx0, "Should only get ActionContext from ActionRequest within Action#perform");
        return gamx0;
    }

    public final WidgetConfig f() {
        ibuq.f(this.a, "<this>");
        Parcelable parcelable0 = this.a.getParcelableExtra("widgetConfig");
        gftb.B(parcelable0, "A non-null %s is required from the Intent.", "widgetConfig");
        return (WidgetConfig)parcelable0;
    }

    public final String g() {
        ibuq.f(this.a, "<this>");
        String s = this.a.getStringExtra("requestAction");
        gftb.B(s, "A non-null %s is required from the Intent.", "requestAction");
        return s;
    }

    private static Intent h(String s, WidgetConfig widgetConfig0, int v, Intent intent0) {
        if(intent0 == null) {
            intent0 = new Intent();
        }
        intent0.putExtra("requestAction", s);
        intent0.putExtra("widgetConfig", widgetConfig0);
        if(v != -1) {
            intent0.putExtra("timeOut", v);
        }
        return intent0;
    }
}

