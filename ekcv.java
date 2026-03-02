import android.accounts.Account;
import android.content.Context;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Stream;

public final class ekcv {
    public static final bboh a;
    public final ekck b;
    public final ekcx c;
    public final ejzb d;
    private final ejyu e;
    private final Context f;

    static {
        ekcv.a = bboh.b("DCU_RequestGen", bbcu.bN);
    }

    public ekcv(Context context0, ekck ekck0, ejyu ejyu0, ekcx ekcx0, ejzb ejzb0) {
        this.c = ekcx0;
        this.f = context0;
        this.b = ekck0;
        this.e = ejyu0;
        this.d = ejzb0;
    }

    public final gged_interceptors a(String s, String s1) {
        gged_interceptors gged0 = this.b.a(s1);
        gged_interceptors gged1 = new ekdq(this.f, s, gged0, this.b, this.e).a();
        Account[] arr_account = ejyr.b(this.f);
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(account0 != null && this.d.a(account0.name)) {
                gged1 = (gged_interceptors)Collection.-EL.stream(gged1).filter(new ekcs(this)).collect(ggaf.a);
                break;
            }
        }
        Stream stream0 = Collection.-EL.stream(gged1);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssk.a).v_newBuilder();
        Objects.requireNonNull(hftp0);
        return (gged_interceptors)stream0.map(new ekct(hftp0)).map(new ekcu()).collect(ggaf.a);
    }
}

