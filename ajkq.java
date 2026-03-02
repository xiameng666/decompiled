import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class ajkq implements Callable {
    public final gmcd a;
    public final gmcd b;
    public final Bundle c;
    public final Context d;
    public final Account e;
    public final String f;

    public ajkq(gmcd gmcd0, gmcd gmcd1, Bundle bundle0, Context context0, Account account0, String s) {
        this.a = gmcd0;
        this.b = gmcd1;
        this.c = bundle0;
        this.d = context0;
        this.e = account0;
        this.f = s;
    }

    @Override
    public final Object call() {
        Object object2;
        Context context0;
        List list0 = (List)gmbu.r(this.a);
        ByteString hfsf0 = (ByteString)gmbu.r(this.b);
        gmkj gmkj0 = gmkj.b(this.c.getInt("invocation_reason"));
        gmkw gmkw0 = (gmkw)((ProtoLiteMessage)gmkz.a).v_newBuilder();
        if(!gmkw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmkw0).ensureMutable();
        }
        ((gmkz)gmkw0.b_message).c = "com.google.android.gms";
        if(!gmkw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmkw0).ensureMutable();
        }
        gmkz.b(((gmkz)gmkw0.b_message));
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmkk.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmkk gmkk0 = (gmkk)hftp0.b_message;
        gmkk0.b = gmkj0.a();
        if(!gmkw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmkw0).ensureMutable();
        }
        gmkz gmkz0 = (gmkz)gmkw0.b_message;
        gmkk gmkk1 = (gmkk)hftp0.N_build();
        gmkk1.getClass();
        gmkz0.e = gmkk1;
        gmkz0.b |= 2;
        if(!gmkw0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)gmkw0).ensureMutable();
        }
        gmkz gmkz1 = (gmkz)gmkw0.b_message;
        hfsf0.getClass();
        gmkz1.f = hfsf0;
        Iterator iterator0 = list0.iterator();
        while(true) {
            context0 = this.d;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            String s = ((ygr)object0).a;
            List list1 = ((ygr)object0).d;
            gmkx gmkx0 = (gmkx)((ProtoLiteMessage)gmky.a).v_newBuilder();
            if(!gmkx0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gmkx0).ensureMutable();
            }
            gmky gmky0 = (gmky)gmkx0.b_message;
            s.getClass();
            gmky0.b = s;
            for(Object object1: list1) {
                gmkx0.a(ByteString.copyFrom(((ygq)object1).a));
            }
            byte[] arr_b = new ajfq(context0).a(this.f, s);
            if(arr_b != null) {
                ByteString hfsf1 = ByteString.copyFrom(arr_b);
                if(!gmkx0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gmkx0).ensureMutable();
                }
                ((gmky)gmkx0.b_message).d = hfsf1;
            }
            gmkw0.a(((gmky)((ProtoLiteBuilder)gmkx0).N_build()));
        }
        gmkz gmkz2 = (gmkz)((ProtoLiteBuilder)gmkw0).N_build();
        ajit ajit0 = new ajit(context0, 0, 6);
        ajjc ajjc0 = new ajjc(context0, this.e, ajit0);
        try {
            object2 = ajjc0.a(gmkz2);
        }
        finally {
            ajjc0.b();
        }
        return object2;
    }
}

