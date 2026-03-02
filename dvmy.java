import android.content.Context;
import android.view.View;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;
import com.google.android.gms.pay.widget.validation.ValidatedEditText;

public final class dvmy {
    public final View a;
    public UserDataPrompt b;
    public dvnc c;

    public dvmy(ValidatedEditText validatedEditText0) {
        this.a = validatedEditText0;
        validatedEditText0.addTextChangedListener(new dvmz(this));
    }

    public final String a() {
        UserDataPrompt userDataPrompt0 = this.b;
        Context context0 = this.a.getContext();
        String s = userDataPrompt0.c;
        if(!gfta.c(s)) {
            return s;
        }
        gftb.f(((int)userDataPrompt0.a) >= 0 && ((int)userDataPrompt0.a) < 24, "No prompt label for prompt id %s", userDataPrompt0.a);
        return context0.getString(new int[]{0x7F150011, 0x7F151C3E, 0x7F15000E, 0x7F151C11, 0x7F150010, 0x7F152039, 0x7F151DE2, 0x7F151C05, 0x7F151FCF, 0x7F15000A, 0x7F15000D, 0x7F150013, 0x7F150000, 0x7F150001, 0x7F150002, 0x7F150006, 0x7F150012, 0x7F150014, 0x7F150007, 0x7F150009, 0x7F15000F, 0x7F150003, 0x7F15000B, 0x7F150004}[((int)userDataPrompt0.a)]);  // string:PROMPT_UNKNOWN_label ""
    }
}

