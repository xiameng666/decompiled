import android.content.Context;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.gms.pay.pass.valuable.model.prompt.UserDataPrompt;
import com.google.android.gms.pay.widget.validation.ValidatedEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;

public final class dvna {
    static final ggeo a;
    private final Context b;
    private final LayoutInflater c;

    static {
        ggek ggek0 = new ggek();
        Integer integer0 = (int)0x60;
        ggek0.i("firstName", integer0);
        ggek0.i("lastName", integer0);
        ggek0.i("email", Integer.valueOf(0x20));
        ggek0.i("phone", Integer.valueOf(3));
        Integer integer1 = (int)0x70;
        ggek0.i("streetAddress", integer1);
        ggek0.i("addressLine1", integer1);
        ggek0.i("addressLine2", integer1);
        ggek0.i("addressLine3", integer1);
        ggek0.i("city", integer1);
        ggek0.i("state", integer1);
        ggek0.i("country", integer1);
        ggek0.i("zipcode", integer1);
        dvna.a = ggek0.b();
    }

    public dvna(Context context0, LayoutInflater layoutInflater0) {
        this.b = context0.getApplicationContext();
        this.c = layoutInflater0;
    }

    public final dvmy a(UserDataPrompt userDataPrompt0, ViewGroup viewGroup0, int v, edpq edpq0, boolean z, String s) {
        ValidatedEditText validatedEditText0;
        if(viewGroup0 != null && viewGroup0.getContext() != null) {
            Context context0 = viewGroup0.getContext();
            new TextInputLayout(context0);
            validatedEditText0 = new ValidatedEditText(context0);
        }
        else {
            validatedEditText0 = (ValidatedEditText)this.c.inflate(0x7F0E0816, viewGroup0, false);  // layout:prompt_entry
        }
        validatedEditText0.setId((gfta.b(userDataPrompt0.c) + ((int)userDataPrompt0.a)).hashCode() & 0xFFFFFF);
        String s1 = userDataPrompt0.d;
        if(!gfta.c(s1) && edpq0.b(s1, this.b.getResources())) {
            validatedEditText0.setText(gfta.b(s1));
        }
        validatedEditText0.setInputType(v);
        if(!userDataPrompt0.g) {
            edpq0 = new edpr(edpq0);
        }
        validatedEditText0.a.b = edpq0;
        validatedEditText0.a.f = false;
        validatedEditText0.setSingleLine(z);
        if(!gfta.c(s)) {
            Currency currency0 = Currency.getInstance(s);
            DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance();
            decimalFormatSymbols0.setCurrency(currency0);
            NumberFormat numberFormat0 = NumberFormat.getInstance();
            numberFormat0.setCurrency(currency0);
            StringBuilder stringBuilder0 = new StringBuilder("0123456789");
            if(currency0.getDefaultFractionDigits() > 0) {
                stringBuilder0.append(decimalFormatSymbols0.getDecimalSeparator());
            }
            if(numberFormat0.isGroupingUsed()) {
                stringBuilder0.append(decimalFormatSymbols0.getGroupingSeparator());
            }
            validatedEditText0.setKeyListener(DigitsKeyListener.getInstance(stringBuilder0.toString()));
        }
        String s2 = userDataPrompt0.e;
        if(!TextUtils.isEmpty(s2)) {
            Integer integer0 = (Integer)dvna.a.get(s2);
            if(integer0 != null) {
                validatedEditText0.setInputType(integer0.intValue());
            }
        }
        return new dvmy(validatedEditText0);
    }
}

