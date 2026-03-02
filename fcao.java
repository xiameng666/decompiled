import android.content.Context;

public final class fcao extends fcaq {
    public fcao(Context context0) {
        super(context0);
    }

    @Override  // gdbk
    public final CharSequence a() {
        String s = String.format("%s %s", this.a.getText(), this.b.getText());
        return this.getResources().getString(0x7F153525, new Object[]{s});  // string:wallet_customer_selected "%1$s selected"
    }

    @Override  // fcaq
    public final void c(boolean z, boolean z1) {
        super.c(((boolean)(((int)z))), z1);
        if(((int)z)) {
            this.d.setOrientation(1);
        }
        else {
            this.d.setOrientation(0);
        }
        this.b.setSingleLine(((boolean)(((int)z) ^ 1)));
    }

    @Override  // fcaq
    public final boolean d() {
        return !((gexl)this.p).g;
    }

    @Override  // gdbm
    public final void setEnabled(boolean z) {
        super.setEnabled(z && this.d());
    }
}

