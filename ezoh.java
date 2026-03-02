import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class ezoh {
    private static final ggfp a;
    private final Context b;
    private final Account c;
    private final ezoi d;

    static {
        ezoh.a = ggfp.K(Integer.valueOf(9), Integer.valueOf(10));
    }

    public ezoh(Context context0, Account account0) {
        this.b = context0;
        this.c = account0;
        this.d = ezoi.a(context0);
    }

    static hfqj a(hfqt hfqt0, boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfqj)hftv0).d = 1;
        ((hfqj)hftv0).b |= 2;
        int v = hfqt0.l;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hfqj)hftv1).b |= 1;
        ((hfqj)hftv1).c = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfqj)hftp0.b_message).e = (z ? 3 : 4) - 1;
        ((hfqj)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfqg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((hfqg)hftv2).b |= 1;
        ((hfqg)hftv2).c = true;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((hfqg)hftv3).b |= 2;
        ((hfqg)hftv3).d = true;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfqg hfqg0 = (hfqg)hftp1.b_message;
        hfqg0.b |= 4;
        hfqg0.e = true;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqj hfqj0 = (hfqj)hftp0.b_message;
        hfqg hfqg1 = (hfqg)hftp1.N_build();
        hfqg1.getClass();
        hfqj0.f = hfqg1;
        hfqj0.b |= 8;
        return (hfqj)hftp0.N_build();
    }

    public final List b() {
        List list0 = new ArrayList();
        boolean z = this.d.i(this.c.name, 10);
        list0.add(ezoh.a(hfqt.i, z));
        boolean z1 = this.d.i(this.c.name, 9);
        list0.add(ezoh.a(hfqt.c, z1));
        return list0;
    }

    public final Set c() {
        return this.e() ? ezoh.a : Collections.EMPTY_SET;
    }

    public final void d(hfqn[] arr_hfqn) {
        Integer integer0;
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_hfqn.length; ++v) {
            hfqn hfqn0 = arr_hfqn[v];
            if((hfqn0.c == 9 || hfqn0.c == 10) && (hfqv.a(hfqn0.d) == 3 || hfqv.a(hfqn0.d) == 4)) {
                String s = this.c.name;
                int v1 = hfqn0.c;
                boolean z = hfqv.a(hfqn0.d) == 3;
                SharedPreferences sharedPreferences0 = this.d.b;
                synchronized(sharedPreferences0) {
                    if(this.d.h(s, v1) != z) {
                        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                        sharedPreferences$Editor0.putBoolean(ezoi.c(s, v1), z);
                        sharedPreferences$Editor0.putLong(ezoi.d(s, v1), System.currentTimeMillis());
                        sharedPreferences$Editor0.apply();
                    }
                }
                arrayList0.add(Integer.valueOf(hfqn0.c));
                switch(hfqn0.c) {
                    case 9: {
                        integer0 = (int)7;
                        break;
                    }
                    case 10: {
                        integer0 = (int)8;
                        break;
                    }
                    default: {
                        integer0 = null;
                    }
                }
                if(integer0 != null) {
                    arrayList0.add(integer0);
                }
            }
        }
        int[] arr_v = new int[arrayList0.size()];
        for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
            arr_v[v3] = (int)(((Integer)arrayList0.get(v3)));
        }
        bars.f(this.b, this.c.name, arr_v);
    }

    public final boolean e() {
        return !bbnp.d(this.b);
    }
}

