import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import com.google.android.gms.googlesettings.entryprovider.GoogleSettingsEntryChimeraContentProvider;
import java.util.concurrent.TimeUnit;

public final class buwa extends ibsl implements ibts {
    final GoogleSettingsEntryChimeraContentProvider a;
    final foec b;
    final long c;

    public buwa(GoogleSettingsEntryChimeraContentProvider googleSettingsEntryChimeraContentProvider0, foec foec0, long v, ibrl ibrl0) {
        this.a = googleSettingsEntryChimeraContentProvider0;
        this.b = foec0;
        this.c = v;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new buwa(this.a, this.b, this.c, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ibuq.e(this.b.a, "accountName(...)");
        Bitmap bitmap0 = (Bitmap)this.a.a().g(this.b.a, 0x30).get(this.c, TimeUnit.MILLISECONDS);
        float f = (float)htvb.a.c().c();
        Object object1 = Icon.createWithBitmap(bbrs.a(this.a.getContext(), bbrs.b(bitmap0, ((int)kbc.b(f, this.a.getContext().getResources().getDisplayMetrics()))), null));
        ibuq.e(object1, "createWithBitmap(...)");
        return object1;
    }
}

