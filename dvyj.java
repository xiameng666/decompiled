import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.pay.pass.common.template.getpass.GetPassCardTemplate;

public final class dvyj extends FrameLayout {
    public static final bboh a;
    public final GetPassCardTemplate b;
    dspv c;
    public gfsx d;

    static {
        dvyj.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvyj(Context context0) {
        super(context0, null, 0);
        this.d = gfqx.a;
        dvyj.inflate(context0, 0x7F0E075E, this);  // layout:pay_valuable_get_pass_card
        this.b = (GetPassCardTemplate)this.findViewById(0x7F0B0428);  // id:GetPassCardTemplate
    }
}

