import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.pay.pass.valuable.view.ucp.ProcessUcpAnimationView;
import com.google.android.libraries.tapandpay.ui.actionbar.ActionBar;
import com.google.android.libraries.tapandpay.ui.actionbar.ComposeActionBar;

public final class dwds implements icih {
    final dwef a;

    public dwds(dwef dwef0) {
        this.a = dwef0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        boolean z1;
        dwef dwef0 = this.a;
        boolean z = true;
        Button button0 = null;
        if(hwfk.av()) {
            ActionBar actionBar0 = dwef0.ak;
            if(actionBar0 == null) {
                ibuq.j("actionBar");
                actionBar0 = null;
            }
            actionBar0.setVisibility(8);
            ComposeActionBar composeActionBar0 = dwef0.al;
            if(composeActionBar0 == null) {
                ibuq.j("composeActionBar");
                composeActionBar0 = null;
            }
            fryy fryy0 = ((dweg)object0).a;
            composeActionBar0.setVisibility(fryy0.a);
            ComposeActionBar composeActionBar1 = dwef0.al;
            if(composeActionBar1 == null) {
                ibuq.j("composeActionBar");
                composeActionBar1 = null;
            }
            fhxi fhxi0 = dwef0.c;
            if(fhxi0 == null) {
                ibuq.j("composeVisualElements");
                fhxi0 = null;
            }
            composeActionBar1.e(new fufz(fhxi0, dwef0.B()));
            ComposeActionBar composeActionBar2 = dwef0.al;
            if(composeActionBar2 == null) {
                ibuq.j("composeActionBar");
                composeActionBar2 = null;
            }
            fryv fryv0 = fryy0.b;
            if(!hwvf.d()) {
                z1 = ((dweg)object0).f.a == 8;
            }
            else if(((dweg)object0).f.a == 8 && fryy0.c) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            ftts ftts0 = new ftts(fryv0, null, z1, null, null, null, 210094, null, null, new dwdn(((dweg)object0)), 442);
            dwdo dwdo0 = new dwdo(((dweg)object0));
            composeActionBar2.d(new ftuw(ftts0, new ftts(((dweg)object0).b.b, null, false, null, null, null, 210095, null, null, dwdo0, 446), false, null, null, null, null, hwik.n(), 0x7C));
        }
        else {
            ActionBar actionBar1 = dwef0.ak;
            if(actionBar1 == null) {
                ibuq.j("actionBar");
                actionBar1 = null;
            }
            fryy fryy1 = ((dweg)object0).a;
            actionBar1.setVisibility(fryy1.a);
            ComposeActionBar composeActionBar3 = dwef0.al;
            if(composeActionBar3 == null) {
                ibuq.j("composeActionBar");
                composeActionBar3 = null;
            }
            composeActionBar3.setVisibility(8);
            ActionBar actionBar2 = dwef0.ak;
            if(actionBar2 == null) {
                ibuq.j("actionBar");
                actionBar2 = null;
            }
            Context context0 = dwef0.requireContext();
            ftrz ftrz0 = new ftrz(fryy1.b.a(context0), new dwdp(dwef0, ((dweg)object0)));
            Context context1 = dwef0.requireContext();
            actionBar2.l(ftrz0, new ftrz(((dweg)object0).b.b.a(context1), new dwdq(dwef0, ((dweg)object0))));
            actionBar2.o();
            actionBar2.post(new dwdr(dwef0));
            if(hwvf.d()) {
                Button button1 = dwef0.am;
                if(button1 == null) {
                    ibuq.j("acceptButton");
                    button1 = null;
                }
                button1.setEnabled(((dweg)object0).f.a == 8 && fryy1.c);
            }
            else {
                Button button2 = dwef0.am;
                if(button2 == null) {
                    ibuq.j("acceptButton");
                    button2 = null;
                }
                button2.setEnabled(((dweg)object0).f.a == 8);
            }
        }
        NestedScrollView nestedScrollView0 = dwef0.ai;
        if(nestedScrollView0 == null) {
            ibuq.j("noticeTextContainer");
            nestedScrollView0 = null;
        }
        frzg.a(nestedScrollView0, ((dweg)object0).c);
        TextView textView0 = dwef0.aj;
        if(textView0 == null) {
            ibuq.j("noticeText");
            textView0 = null;
        }
        frze.b(textView0, ((dweg)object0).d);
        ProcessUcpAnimationView processUcpAnimationView0 = dwef0.ap;
        if(processUcpAnimationView0 == null) {
            ibuq.j("animationView");
            processUcpAnimationView0 = null;
        }
        frzg.a(processUcpAnimationView0, ((dweg)object0).e);
        if(((dweg)object0).e.a == 8) {
            ProcessUcpAnimationView processUcpAnimationView1 = dwef0.ap;
            if(processUcpAnimationView1 == null) {
                ibuq.j("animationView");
                processUcpAnimationView1 = null;
            }
            if(hwfk.av()) {
                processUcpAnimationView1.b.setVisibility(8);
                processUcpAnimationView1.b.e();
            }
            else {
                Drawable drawable0 = processUcpAnimationView1.c.getDrawable();
                ibuq.d(drawable0, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable)drawable0).stop();
            }
        }
        ProgressBar progressBar0 = dwef0.ao;
        if(progressBar0 == null) {
            ibuq.j("progressBar");
            progressBar0 = null;
        }
        frzf frzf0 = ((dweg)object0).f;
        frzg.a(progressBar0, frzf0);
        Button button3 = dwef0.an;
        if(button3 == null) {
            ibuq.j("cancelButton");
        }
        else {
            button0 = button3;
        }
        if(frzf0.a != 8) {
            z = false;
        }
        button0.setEnabled(z);
        return ibom.a;
    }
}

