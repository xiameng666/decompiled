import android.content.ComponentName;
import android.os.SystemClock;
import java.util.HashSet;

public final class cajx implements Runnable {
    public final String a;

    public cajx(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        cajs cajs0 = cajs.c();
        if(cajs0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).b = 2;
            long v = SystemClock.elapsedRealtime();
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet();
            caju caju0 = cajs0.d;
            for(Object object0: caju0.a()) {
                ComponentName componentName0 = (ComponentName)object0;
                String s = componentName0.getPackageName();
                if(this.a.equals(s)) {
                    hashSet1.add(cajt.b(componentName0));
                }
                else {
                    hashSet0.add(componentName0);
                }
            }
            int v1 = hashSet1.size();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).e = v1;
            evql evql0 = cajs0.c.e(((String[])hashSet1.toArray(new String[hashSet1.size()])));
            evql0.A(new cajr(0x20, ((gisx)hftp0.N_build()), v));
            evql0.b(new cajq(((gisx)hftp0.N_build()), v));
            caju0.b(hashSet0);
        }
    }
}

