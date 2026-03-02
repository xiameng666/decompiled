import android.content.Context;

public final class fcag extends fcai {
    public static String a;
    public String b;
    public String c;

    public fcag(Context context0) {
        super(context0);
    }

    @Override  // gdbk
    public final CharSequence a() {
        String s = String.format("%s %s", this.e.getText(), this.f.getText());
        return this.getResources().getString(0x7F153512, new Object[]{s});  // string:wallet_address_selected "%1$s selected"
    }

    @Override  // fcai
    public final void c(boolean z, boolean z1) {
        super.c(((boolean)(((int)z))), z1);
        int v = 0;
        if(((int)z)) {
            this.f.setText(this.b);
            this.h.setOrientation(1);
        }
        else {
            this.f.setText(this.c);
            this.h.setOrientation(0);
        }
        this.f.setSingleLine(((boolean)(((int)z) ^ 1)));
        if(this.k.isChecked() && ((int)z) == 0) {
            v = 8;
        }
        if(!((geuq)this.p).f.isEmpty()) {
            this.g.setVisibility(v);
        }
        if(geup.a(((geuq)this.p).e) == 4) {
            this.i.setVisibility(v);
        }
    }

    @Override  // fcai
    public final boolean d() {
        return geup.a(((geuq)this.p).e) != 2;
    }

    @Override  // gdbm
    public final void setEnabled(boolean z) {
        super.setEnabled(z && this.d());
    }
}

