import android.util.Log;
import com.google.android.gms.wearable.MessageOptions;
import j..util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;

public final class fdud implements fduj, fduo, fdyv {
    public final fdso a;
    public final Object b;
    int c;
    boolean d;
    private final fdpl e;
    private final fdvl f;
    private final fdxu g;
    private final fdyu h;
    private final boolean i;
    private final Object j;
    private long k;
    private final frli l;

    public fdud(fdpl fdpl0, fdvl fdvl0, fdxu fdxu0, fdyu fdyu0, fdso fdso0, frli frli0, boolean z) {
        this.j = new Object();
        this.b = new Object();
        this.c = 0;
        this.e = fdpl0;
        this.f = fdvl0;
        this.g = fdxu0;
        this.h = fdyu0;
        this.a = fdso0;
        this.i = z;
        this.l = frli0;
    }

    @Override  // fdyv
    public final boolean a(int v, fdpl fdpl0, String s, byte[] arr_b, String s1, boolean z) {
        fest fest1;
        fess fess0;
        if(!Objects.equals(s, "/cloudsync/keymanager/")) {
            return false;
        }
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Received cloud sync key request from watch.");
        }
        try {
            fess0 = this.a.a();
        }
        catch(IOException iOException0) {
            Log.e("CloudSync", "Failed to get CloudNodeCrypto keys", iOException0);
            fess0 = null;
        }
        if(fess0 == null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fest.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hebz.a).v_newBuilder();
            int v1 = heby.o.s;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hebz hebz0 = (hebz)hftp1.b_message;
            hebz0.b |= 1;
            hebz0.c = v1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fest fest0 = (fest)hftp0.b_message;
            hebz hebz1 = (hebz)hftp1.N_build();
            hebz1.getClass();
            fest0.c = hebz1;
            fest0.b |= 1;
            fest1 = (fest)hftp0.N_build();
        }
        else {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fest.a).v_newBuilder();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hebz.a).v_newBuilder();
            int v2 = heby.a.s;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            hebz hebz2 = (hebz)hftp3.b_message;
            hebz2.b |= 1;
            hebz2.c = v2;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            fest fest2 = (fest)hftp2.b_message;
            hebz hebz3 = (hebz)hftp3.N_build();
            hebz3.getClass();
            fest2.c = hebz3;
            fest2.b |= 1;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((fest)hftp2.b_message).d = fess0;
            ((fest)hftp2.b_message).b |= 2;
            fest1 = (fest)hftp2.N_build();
        }
        byte[] arr_b1 = fest1.toBytesArray();
        fdyr fdyr0 = new fdyr(v, new byte[0]);
        MessageOptions messageOptions0 = new MessageOptions(0);
        this.h.g(fdpl0, s1, s, arr_b1, null, fdyr0, messageOptions0);
        if((fest1.c == null ? hebz.a : fest1.c).c == heby.a.s) {
            try {
                fess fess1 = fest1.d == null ? fess.a : fest1.d;
                fdtz fdtz0 = new fdtz((fess1.f == null ? hfwn.a : fess1.f));
                ((glyq)this.l.b(fdtz0, gmap.a)).u();
            }
            catch(ExecutionException | InterruptedException exception0) {
                Log.w("CloudSync", "Failed setting cloud sync keys have been synchronized between phone and watch", exception0);
            }
            this.a.h = true;
        }
        return true;
    }

    public final gmcd b() {
        return new bblp(1, 9).e(() -> try {
            this.e();
            return Boolean.valueOf(true);
        }
        catch(GeneralSecurityException | IOException exception0) {
            Log.e("CloudSync", "Failed to initialize CloudSync E2EE", exception0);
            return Boolean.valueOf(false);
        });
    }

    public final void d(byte[] arr_b) {
        long v1;
        fess fess0;
        hebz hebz0;
        fest fest0;
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Received cloud sync keys from phone");
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)fest.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            fest0 = (fest)hftv0;
            hebz0 = fest0.c;
        }
        catch(hfur unused_ex) {
            Log.w("CloudSync", "Invalid cloud sync e2ee proto received");
            return;
        }
        if(hebz0 == null) {
            hebz0 = hebz.a;
        }
        if(hebz0.c != heby.a.s) {
            Log.w("CloudSync", "Invalid status received: " + (fest0.c == null ? hebz.a : fest0.c).c);
            return;
        }
        try {
            this.a.k((fest0.d == null ? fess.a : fest0.d));
            this.a.l();
            this.a.h = true;
            fess0 = fest0.d;
        }
        catch(GeneralSecurityException | IOException exception0) {
            Log.w("CloudSync", "Failed to set cloud sync e2ee keys in crypto engine", exception0);
            return;
        }
        if(fess0 == null) {
            fess0 = fess.a;
        }
        long v = hfyn.b((fess0.f == null ? hfwn.a : fess0.f));
        synchronized(this.j) {
            v1 = this.k;
        }
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", a.J(v1, v, "Key creation time: ", " expected time: "));
        }
        if(v == v1) {
            this.g.d(this);
        }
    }

    public final void e() {
        boolean z1;
        fess fess0;
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Preparing for Cloud Sync E2EE encryption");
        }
        gmuq.a();
        gnoy.a();
        gmnr.a();
        try {
            fdso fdso0 = this.a;
            try {
                fess0 = (fess)fdso0.i.a().get();
            }
            catch(ExecutionException executionException0) {
                throw new IOException(executionException0.getCause());
            }
            catch(InterruptedException interruptedException0) {
                throw new IOException("Interrupted while loading key data", interruptedException0);
            }
            if((fess0.b & 1) != 0 && (fess0.b & 2) != 0 && (fess0.b & 4) != 0) {
                fdso0.k(fess0);
            }
        }
        catch(GeneralSecurityException | IOException exception0) {
            Log.w("CloudSync", "Failed to load CloudNodeCrypto keys", exception0);
        }
        boolean z = this.i;
        if(z) {
        label_32:
            if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "Not generating keys. isWatch = " + z + ", isReady = " + this.a.m());
            }
            if(z) {
                synchronized(this.j) {
                    this.f.D(this);
                    fcez fcez0 = fdur.c(this.f, "*", "/cloudsync_key_timestamp");
                    if(fcez0 == null) {
                        z1 = false;
                    }
                    else {
                        this.k = fcez0.A("creation_time");
                        if(Log.isLoggable("CloudSync", 3)) {
                            Log.d("CloudSync", "Key creation time: " + this.k);
                        }
                        z1 = true;
                    }
                    fdso fdso2 = this.a;
                    if(fdso2.m()) {
                        fdso2.h = true;
                        if(!this.h(this.k)) {
                            this.g();
                        }
                    }
                    else if(z1) {
                        this.g();
                    }
                }
                return;
            }
        }
        else {
            fdso fdso1 = this.a;
            if(!fdso1.m()) {
                if(Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", "Attempting Cloud Sync E2EE key generation...");
                }
                Log.d("CloudNodeCrypto", "Generating keys...");
                fdso1.a = gmnb.g(((gmms)gnby.a(new gmul())));
                fdso1.c = gmnb.g(gnok.a());
                fdso1.e = gmnb.g(((gmms)gnby.a(new gmpg())));
                fdso1.j();
                fdso1.g = System.currentTimeMillis();
                fdso1.l();
                Log.d("CloudNodeCrypto", "Keys generated");
                goto label_59;
            }
            goto label_32;
        }
    label_59:
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Listening for cloud sync key requests from the watch");
        }
        this.h.e(this);
        fdso fdso3 = this.a;
        if(fdso3.m()) {
            fess fess1 = fdso3.a();
            if(fess1 == null) {
                throw new IOException("Failed to read CloudNodeCrypto keys");
            }
            fcez fcez1 = new fcez();
            fcez1.r("creation_time", hfyn.b((fess1.f == null ? hfwn.a : fess1.f)));
            String s = this.g.a().a;
            fdur.j(this.f, s, "/cloudsync_key_timestamp", fcez1);
            fdso3.h = true;
        }
    }

    public final void f() {
        for(Object object0: this.g.b()) {
            fdxn fdxn0 = ((fdyo)object0).a;
            if(fdxu.v(fdxn0, ((fdyo)object0).b)) {
                if(Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", "Found connected node, requesting cloud sync key from phone");
                }
                Object object1 = this.b;
                synchronized(object1) {
                    if(this.d) {
                        if(Log.isLoggable("CloudSync", 3)) {
                            Log.d("CloudSync", "Key request in progress, not requesting a new key.");
                        }
                        return;
                    }
                    this.d = true;
                }
                fdub fdub0 = new fdub(this);
                MessageOptions messageOptions0 = new MessageOptions(0);
                this.h.g(this.e, fdxn0.a, "/cloudsync/keymanager/", new byte[0], fdub0, null, messageOptions0);
                return;
            }
        }
    }

    private final void g() {
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Waiting for BT connection to request cloud sync key");
        }
        this.g.c(this);
        this.f();
    }

    private final boolean h(long v) {
        fess fess0;
        try {
            fess0 = this.a.a();
        }
        catch(IOException unused_ex) {
            Log.e("CloudSync", "CloudNodeCrypto keys are no longer valid, initiate key sync with the watch");
            return false;
        }
        if(fess0 == null) {
            Log.e("CloudSync", "Failed to read CloudNodeCrypto keys");
            return false;
        }
        long v1 = hfyn.b((fess0.f == null ? hfwn.a : fess0.f));
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", String.format("last key creation time: %d, new creation time: %d", v, v1));
        }
        return v1 == v;
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(this.e.equals(fduq0.a) && Objects.equals(fduq0.b.b, "/cloudsync_key_timestamp")) {
                fcez fcez0 = fdur.b(fduq0, fduq0.b.a, "/cloudsync_key_timestamp");
                if(fcez0 == null) {
                    Log.w("CloudSync", "Received data item without any data");
                }
                else {
                    long v2 = fcez0.A("creation_time");
                    synchronized(this.j) {
                        this.k = v2;
                    }
                    if(this.h(v2)) {
                        this.g.d(this);
                    }
                    else {
                        this.g();
                    }
                }
            }
        }
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Connected nodes changed; checking if we can request E2EE keys...");
        }
        this.f();
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
    }
}

