import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import com.google.android.gms.pay.pass.common.template.globalaction.GlobalActionCardTemplate;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvyo extends FrameLayout {
    public static final bboh a;
    public final GlobalActionCardTemplate b;
    dspv c;
    public gfsx d;

    static {
        dvyo.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvyo(Context context0) {
        super(context0, null, 0);
        this.d = gfqx.a;
        dvyo.inflate(context0, 0x7F0E0760, this);  // layout:pay_valuable_global_action_card
        this.b = (GlobalActionCardTemplate)this.findViewById(0x7F0B0447);  // id:GlobalActionCardTemplate
    }

    public static Bitmap a(Context context0, String s, String s1, ValuableGroup valuableGroup0, int v, int v1) {
        gubi gubi0;
        if(hwev.c()) {
            context0.setTheme(0x7F160D73);  // style:Theme.Wallet.Expressive
        }
        else {
            context0.setTheme(0x7F1605A4);  // style:PayActivityStyle
        }
        if(hwfk.ax()) {
            gumi gumi0 = valuableGroup0.i();
            Object object0 = valuableGroup0.d().d();
            ibuq.f(gumi0, "passTemplateInfo");
            guem guem0 = ((gueo)object0).e;
            if(guem0 == null) {
                guem0 = guem.a;
            }
            ibuq.e(guem0, "getGlobalActionCardInfo(...)");
            guag guag0 = guem0.c == null ? guag.a : guem0.c;
            gukv gukv0 = guag0.c == null ? gukv.a : guag0.c;
            ibuq.e(gukv0, "getLogo(...)");
            if(fsce.a(context0)) {
                gubi0 = gumi0.d == null ? gubi.a : gumi0.d;
                ibuq.c(gubi0);
                return dvpf.a(context0, gukv0, gubi0, v, v1);
            }
            gubi0 = gumi0.c == null ? gubi.a : gumi0.c;
            ibuq.c(gubi0);
            return dvpf.a(context0, gukv0, gubi0, v, v1);
        }
        float f = context0.getResources().getDisplayMetrics().density * 180.0f;
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        int v2 = (int)(((float)v) / ((float)v1) * ((float)(((int)f))));
        gmcd gmcd0 = bblp0.e(new dvyn(context0, s, s1, valuableGroup0, v2, ((int)f)));
        Bitmap bitmap0 = Bitmap.createBitmap(v2, ((int)f), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap0);
        ((dvyo)gmcd0.get()).draw(canvas0);
        return Bitmap.createScaledBitmap(bitmap0, v, v1, true);
    }
}

