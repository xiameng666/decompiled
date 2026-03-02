import com.google.android.gms.pay.PayIntentArgs;
import com.google.android.gms.pay.SecureElementPrepaidTosSection;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Arrays;

public final class dmra extends dmqc {
    private final dlir b;

    public dmra() {
        super("com.google.android.gms.pay.secard.view.account.VIEW_SECURE_ELEMENT_PREPAID_TOS");
        this.b = new dlir();
    }

    @Override  // dmqc
    protected final void a(PayIntentArgs payIntentArgs0) {
    }

    @Override  // dmqc
    protected final void b(dlhd dlhd0) {
        dlhd0.a.B = this.b.a;
    }

    public final void h(SecureElementPrepaidTosSection secureElementPrepaidTosSection0) {
        SecureElementPrepaidTosSection[] arr_secureElementPrepaidTosSection = this.b.a.a;
        ArrayList arrayList0 = arr_secureElementPrepaidTosSection == null ? new ArrayList() : new ArrayList(Arrays.asList(arr_secureElementPrepaidTosSection));
        arrayList0.add(secureElementPrepaidTosSection0);
        this.b.a.a = (SecureElementPrepaidTosSection[])Objects.requireNonNull(((SecureElementPrepaidTosSection[])arrayList0.toArray(new SecureElementPrepaidTosSection[arrayList0.size()])));
    }
}

