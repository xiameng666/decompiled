import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;
import com.google.android.gms.pay.widget.validation.ValidatedEditText;
import com.google.android.material.textfield.TextInputLayout;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dvnd {
    public final List a;
    private final dvna b;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public dvnd(xni xni0) {
        this.a = new ArrayList();
        this.b = new dvna(xni0, LayoutInflater.from(xni0));
    }

    public final void a(efmu efmu0, boolean z, ViewGroup viewGroup0, String s, List list0) {
        dvmy dvmy0;
        UserDataPrompt userDataPrompt1;
        List list1 = this.a;
        list1.clear();
        Iterator iterator0 = list0.iterator();
        while(true) {
            boolean z1 = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            UserDataPrompt userDataPrompt0 = (UserDataPrompt)object0;
            dvna dvna0 = this.b;
            switch(userDataPrompt0.b.ordinal()) {
                case 0: {
                    userDataPrompt1 = userDataPrompt0;
                    dvmy0 = dvna0.a(userDataPrompt1, viewGroup0, 2, edps.a, true, null);
                    break;
                }
                case 2: {
                    userDataPrompt1 = userDataPrompt0;
                    dvmy0 = dvna0.a(userDataPrompt1, viewGroup0, 1, edps.a, false, null);
                    break;
                }
                case 3: {
                    userDataPrompt1 = userDataPrompt0;
                    dvmy0 = dvna0.a(userDataPrompt1, viewGroup0, 0x2000, new edom(), true, s);
                    break;
                }
                default: {
                    userDataPrompt1 = userDataPrompt0;
                    dvmy0 = dvna0.a(userDataPrompt1, viewGroup0, 1, edps.a, true, null);
                }
            }
            if(!z && userDataPrompt1.f) {
                z1 = true;
            }
            View view0 = dvmy0.a;
            view0.setEnabled(z1);
            dvmy0.b = userDataPrompt1;
            if(!gfta.c(userDataPrompt1.h)) {
                ((ValidatedEditText)view0).setText(userDataPrompt1.h);
            }
            Objects.requireNonNull(userDataPrompt1);
            dvmy0.c = new dvnc(userDataPrompt1);
            list1.add(dvmy0);
            efmu0.a.add(view0);
        }
        for(Object object1: list1) {
            dvmy dvmy1 = (dvmy)object1;
            if(((int)dvmy1.b.a) != 3) {
                Context context0 = viewGroup0.getContext();
                if(context0 == null || context0.getResources() == null) {
                    break;
                }
                int v = hwev.c() ? context0.getResources().getDimensionPixelSize(0x7F071366) : 24;  // dimen:text_input_layout_bottom_padding
                View view1 = dvmy1.a;
                if((view1 instanceof EditText)) {
                    TextInputLayout textInputLayout0 = new TextInputLayout(context0);
                    ((EditText)view1).setBackground(null);
                    ((EditText)view1).setPadding(24, 0, 24, 0);
                    textInputLayout0.setPadding(0, 0, 0, v);
                    ((EditText)view1).setHint(dvmy1.a());
                    ((EditText)view1).setMinHeight(context0.getResources().getDimensionPixelSize(0x7F070DFE));  // dimen:pay_minimum_touch_target
                    textInputLayout0.addView(view1);
                    textInputLayout0.P(dvmy1.a());
                    textInputLayout0.setImportantForAccessibility(2);
                    ((EditText)view1).setContentDescription(dvmy1.a());
                    dvnb dvnb0 = new dvnb(context0);
                    dvnb0.a.removeAllViews();
                    dvnb0.a.addView(textInputLayout0);
                    viewGroup0.addView(dvnb0);
                }
                else {
                    TextView textView0 = (TextView)LayoutInflater.from(context0).inflate(0x7F0E0762, viewGroup0, false);  // layout:pay_valuable_input_label_text
                    textView0.setText(dvmy1.a());
                    viewGroup0.addView(textView0);
                    viewGroup0.addView(view1);
                }
            }
        }
    }
}

