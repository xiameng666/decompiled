import android.content.Context;
import android.content.res.TypedArray;

public final class fcam extends fcaq {
    public fcam(Context context0) {
        super(context0);
    }

    @Override  // gdbk
    public final CharSequence a() {
        return this.getResources().getString(0x7F153525, new Object[]{this.a.getText()});  // string:wallet_customer_selected "%1$s selected"
    }

    @Override  // fcaq
    protected final void e(Context context0) {
        super.e(context0);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F040486});  // attr:drawableWalletAdd
        this.c.setImageResource(typedArray0.getResourceId(0, 0));
        typedArray0.recycle();
    }
}

