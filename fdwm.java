import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import jeb.synthetic.FIN;

public final class fdwm implements fdwj {
    public final String a;
    private final HashMap b;

    public fdwm(String s) {
        this.b = new HashMap();
        this.a = s;
    }

    @Override  // fdwj
    public final fdyj a(ffau ffau0, int v) {
        int v2;
        if((ffau0.b & 0x800) != 0) {
            HashMap hashMap0 = this.b;
            __monitor_enter(hashMap0);
            int v1 = FIN.finallyOpen$NT();
            fdwl fdwl0 = (fdwl)hashMap0.get((ffau0.n == null ? fezo.a : ffau0.n).c);
            if(fdwl0 != null) {
                try {
                    fezo fezo0 = ffau0.n == null ? fezo.a : ffau0.n;
                    if(fdwl0.c == null) {
                        fdwl0.c = fdwm.c(fdwl0.f.a, fezo0.c);
                        fdwl0.d = new FileOutputStream(fdwl0.c);
                    }
                    byte[] arr_b = fezo0.e.toByteArray();
                    fdwl0.b.update(arr_b);
                    FileOutputStream fileOutputStream0 = fdwl0.d;
                    if(fileOutputStream0 == null) {
                        fdwl0.a();
                        Log.w("wearable", "IncomingMessageBuffer: FileOutputStream unexpectedly null. Returning.");
                        goto label_26;
                    }
                    fezo0.e.p(fileOutputStream0);
                    v2 = fdwl0.e + v;
                    fdwl0.e = v2;
                    if(fezo0.d) {
                        fdwl0.a();
                        goto label_26;
                    }
                    goto label_37;
                }
                catch(IOException iOException0) {
                    Log.w("wearable", "IncomingMessageBuffer: IOException encountered when writing file.", iOException0);
                    fdwl0.a();
                }
            label_26:
                String s = fdvl.v(fdwl0.b.digest());
                if(!s.equals((ffau0.n == null ? fezo.a : ffau0.n).f)) {
                    Log.e("wearable", a.l((ffau0.n == null ? fezo.a : ffau0.n).f, s, "Received file digest did not match original digest; received: ", " ; original: "));
                }
                this.b.remove((ffau0.n == null ? fezo.a : ffau0.n).c);
                File file0 = fdwl0.c;
                batl.s(file0);
                fdwt fdwt0 = new fdwt(s, file0);
                FIN.finallyCodeBegin$NT(v1);
                return new fdyj(fdwl0.a, fdwt0, fdwl0.e);
            label_37:
                FIN.finallyExec$NT(v1);
                return new fdyj(fdwl0.a, null, false, v2);
            }
            throw new IllegalStateException("Message is a FilePiece but there was no preceding Message that owns this FilePiece");
        }
        if(!ffau0.o) {
            return new fdyj(ffau0, null, v);
        }
        String s1 = fdvl.s(ffau0.toBytesArray());
        __monitor_enter(this.b);
        int v3 = FIN.finallyOpen$NT();
        this.f(s1);
        this.b.put(s1, new fdwl(this, ffau0, v));
        FIN.finallyCodeBegin$NT(v3);
        __monitor_exit(this.b);
        FIN.finallyCodeEnd$NT(v3);
        if(Log.isLoggable("wearable", 3)) {
            Log.d("wearable", "Buffering message: " + ffau0.toString());
        }
        return new fdyj(ffau0, null, false, v);
    }

    @Override  // fdwj
    public final void b() {
        HashMap hashMap0 = this.b;
        synchronized(hashMap0) {
            for(Object object0: hashMap0.keySet()) {
                this.f(((String)object0));
            }
        }
    }

    static File c(String s, String s1) {
        return hrnt.i() ? new File(ccsb.a.b(fdwm.d(s, s1), s1 + ".tmp")) : new File(fdwm.d(s, s1), s1 + ".tmp");
    }

    private static File d(String s, String s1) {
        ccsg ccsg0 = ccsb.a;
        File file0 = hrnt.i() ? new File(ccsg0.d(ccsg0.d(s, "incomingmessages"), s1)) : new File(new File(s, "incomingmessages"), s1);
        if(!file0.mkdirs() && Log.isLoggable("wearable", 3)) {
            Log.d("wearable", String.format("%s already existed", file0));
        }
        return file0;
    }

    private static String e(String s) {
        return s + ".tmp";
    }

    private final void f(String s) {
        fdwl fdwl0 = (fdwl)this.b.get(s);
        if(fdwl0 == null) {
            return;
        }
        fdwl0.a();
    }
}

