import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Callable;

public final class aqlx {
    private final aqmj a;

    public aqlx(aqmj aqmj0) {
        this.a = aqmj0;
    }

    public final Callable a(Account account0) {
        Context context0 = ((ejaz)this.a.a).a();
        aqlj aqlj0 = ((aqlu)this.a.b).a();
        aqys aqys0 = ((aqls)this.a.c).a();
        aqle aqle0 = ((aqlv)this.a.d).a();
        aqlm aqlm0 = ((aqlw)this.a.e).a();
        aqld aqld0 = ((aqlt)this.a.f).a();
        return new aqmi(context0, aqle0, aqlm0, aqys0, new aqmf(context0, aqle0, aqlm0, aqlj0, aqys0, account0), new aqmk(aqld0, aqle0, aqlm0));
    }
}

