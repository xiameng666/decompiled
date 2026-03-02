import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ezog {
    public final ezoh a;
    private final ezok b;
    private final Set c;

    public ezog(Context context0, Account account0) {
        HashSet hashSet0 = new HashSet();
        ezoh ezoh0 = new ezoh(context0, account0);
        this.a = ezoh0;
        ezok ezok0 = new ezok(context0, account0);
        this.b = ezok0;
        hashSet0.addAll(ezok0.b());
        hashSet0.addAll(ezoh0.c());
        this.c = DesugarCollections.unmodifiableSet(hashSet0);
    }

    public final ezof a() {
        return this.b(true, this.c);
    }

    public final ezof b(boolean z, Set set0) {
        if(set0 == null || set0.isEmpty()) {
            set0 = this.c;
        }
        ArrayList arrayList0 = new ArrayList();
        if(z) {
            ezoh ezoh0 = this.a;
            if(ezoh0.e() && set0 != null && (set0.contains(Integer.valueOf(10)) || set0.contains(Integer.valueOf(9)))) {
                arrayList0.addAll(ezog.e(set0, ezoh0.b(), ezoh0.c()));
            }
        }
        ezok ezok0 = this.b;
        if(ezok0.c() && set0 != null && (set0.contains(Integer.valueOf(2)) || set0.contains(Integer.valueOf(15)))) {
            arrayList0.addAll(ezog.e(set0, this.f(), ezok0.b()));
        }
        HashSet hashSet0 = new HashSet();
        for(Object object0: arrayList0) {
            hashSet0.add(Integer.valueOf(((hfqj)object0).c));
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: set0) {
            Integer integer0 = (Integer)object1;
            if(!hashSet0.contains(integer0)) {
                arrayList1.add(ezog.d(integer0.intValue()));
            }
        }
        arrayList0.addAll(arrayList1);
        return new ezof(Status.b, arrayList0);
    }

    public final hfqx c() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqx hfqx0 = (hfqx)hftp0.b_message;
        hfuf hfuf0 = hfqx0.b;
        if(!hfuf0.c()) {
            hfqx0.b = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(this.c, hfqx0.b);
        return (hfqx)hftp0.N_build();
    }

    static hfqj d(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfqj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfqj)hftv0).d = 2;
        ((hfqj)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfqj hfqj0 = (hfqj)hftp0.b_message;
        hfqj0.b |= 1;
        hfqj0.c = v;
        return (hfqj)hftp0.N_build();
    }

    private static List e(Set set0, List list0, Set set1) {
        List list1 = new ArrayList();
        HashSet hashSet0 = new HashSet(set0);
        for(Object object0: list0) {
            hfqj hfqj0 = (hfqj)object0;
            if(set1.contains(Integer.valueOf(hfqj0.c)) && set0.contains(Integer.valueOf(hfqj0.c))) {
                list1.add(hfqj0);
                hashSet0.remove(Integer.valueOf(hfqj0.c));
            }
        }
        for(Object object1: hashSet0) {
            Integer integer0 = (Integer)object1;
            if(set1.contains(integer0)) {
                list1.add(ezog.d(integer0.intValue()));
            }
        }
        return list1;
    }

    private final List f() {
        long v = hzdc.a.b().a();
        try {
            return (List)evrg.o(this.b.b.ag(this.b.a).g(new ezoj()), v, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return ggna.a;
        }
    }
}

