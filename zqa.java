import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ProgressBar;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public final class zqa implements ibth {
    public final AdviceCardView a;

    public zqa(AdviceCardView adviceCardView0) {
        this.a = adviceCardView0;
    }

    @Override  // ibth
    public final Object a() {
        Object object0 = new pat();
        ((pat)object0).U(0);
        ((pat)object0).T(300L);
        ((pat)object0).h(new ozd(2));
        oyw oyw0 = new oyw();
        oyw0.c = new OvershootInterpolator();
        AdviceCardView adviceCardView0 = this.a;
        oyw0.K(adviceCardView0.m());
        oyw0.K(adviceCardView0.o());
        ((pat)object0).h(oyw0);
        oyw oyw1 = new oyw();
        oyw1.L(adviceCardView0.o());
        oyw1.L(adviceCardView0.m());
        oyw1.L(adviceCardView0.k());
        ProgressBar progressBar0 = adviceCardView0.p();
        if(progressBar0 != null) {
            oyw1.L(progressBar0);
        }
        LinearProgressIndicator linearProgressIndicator0 = adviceCardView0.A();
        if(linearProgressIndicator0 != null) {
            oyw1.L(linearProgressIndicator0);
        }
        Object object1 = adviceCardView0.i.a();
        ibuq.e(object1, "getValue(...)");
        oyw1.L(((ViewGroup)object1));
        oyw1.L(adviceCardView0.n());
        ((pat)object0).h(oyw1);
        ((pat)object0).h(new ozd(1));
        return object0;
    }
}

