import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;
import java.util.Locale;

public final class fefl {
    private fefp a;
    private long b;
    private int c;
    private String d;
    private fefk e;
    private fefk f;

    public fefl(fefp fefp0, Message message0, fefk fefk0, fefk fefk1) {
        this.a(fefp0, message0, fefk0, fefk1);
    }

    public final void a(fefp fefp0, Message message0, fefk fefk0, fefk fefk1) {
        this.a = fefp0;
        this.b = System.currentTimeMillis();
        this.c = message0 == null ? 0 : message0.what;
        this.d = "";
        this.e = fefk0;
        this.f = fefk1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("time=");
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(this.b);
        stringBuilder0.append(String.format(Locale.US, "%tm-%td %tH:%tM:%tS.%tL", calendar0, calendar0, calendar0, calendar0, calendar0, calendar0));
        stringBuilder0.append(" processed=");
        String s = "<null>";
        stringBuilder0.append((this.e == null ? "<null>" : this.e.a()));
        stringBuilder0.append(" dest=");
        fefk fefk0 = this.f;
        if(fefk0 != null) {
            s = fefk0.a();
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" what=");
        String s1 = this.a == null ? "" : this.a.a(this.c);
        if(TextUtils.isEmpty(s1)) {
            stringBuilder0.append(this.c);
            stringBuilder0.append("(0x");
            stringBuilder0.append(Integer.toHexString(this.c));
            stringBuilder0.append(")");
        }
        else {
            stringBuilder0.append(s1);
        }
        if(!TextUtils.isEmpty(this.d)) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.d);
        }
        return stringBuilder0.toString();
    }
}

