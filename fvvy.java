import android.content.Context;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import j..util.Objects;

final class fvvy implements View.OnClickListener {
    final fvvz a;
    final EAlertUxArgs b;
    final fvwa c;

    public fvvy(fvwa fvwa0, fvvz fvvz0, EAlertUxArgs eAlertUxArgs0) {
        this.a = fvvz0;
        this.b = eAlertUxArgs0;
        Objects.requireNonNull(fvwa0);
        this.c = fvwa0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        String s;
        if(huqb.I()) {
            EAlertUxArgs eAlertUxArgs0 = this.b;
            if(eAlertUxArgs0 == null) {
                ((ggtj)fvwj.a.i()).x("Feedback suvey feature is not enabled");
            }
            else {
                int v = eAlertUxArgs0.k;
                switch(v) {
                    case 3: {
                        s = huqb.a.s().ae();
                        break;
                    }
                    case 4: {
                        s = huqb.a.s().ad();
                        break;
                    }
                    case 5: {
                        s = huqb.a.s().af();
                        break;
                    }
                    default: {
                        s = huqb.a.s().ac();
                    }
                }
                fvwj fvwj0 = (fvwj)this.a;
                Context context0 = fvwj0.d;
                if(context0 == null) {
                    throw new IllegalArgumentException("Client context is not set.");
                }
                if(TextUtils.isEmpty(s)) {
                    throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
                }
                frqm.b(new frqx(context0, s, new fvwh(fvwj0, eAlertUxArgs0), huqb.a.s().ab(), null, false));
                fxmt.b().a(eAlertUxArgs0.h, eAlertUxArgs0.i, v, 9);
            }
        }
        else {
            ((ggtj)fvwj.a.i()).x("Feedback suvey feature is not enabled");
        }
        new fvvx(this, huqb.a.s().T()).start();
    }
}

