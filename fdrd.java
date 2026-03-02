import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.selector.NativeOsCompat;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class fdrd extends fdrc {
    final fdri a;

    public fdrd(fdri fdri0) {
        Objects.requireNonNull(fdri0);
        this.a = fdri0;
        super(fdri0);
    }

    @Override  // fdrc
    public final void a() {
        int v8;
        Set set0;
        int v4;
        int v;
        if(Log.isLoggable("ChannelManager", 2)) {
            Log.v("ChannelManager", "Running selector.");
        }
        try {
            fdri fdri0 = this.a;
            ffdl ffdl0 = fdri0.b;
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            batl.m(((boolean)(((ffdm)ffdl0).c ^ 1)), "should not call select() after close()");
            batl.s(timeUnit0);
            Map map0 = ((ffdm)ffdl0).a;
            v = 1;
            Iterator iterator0 = map0.values().iterator();
            while(true) {
            label_10:
                if(iterator0.hasNext()) {
                    goto label_169;
                }
                ffdn[] arr_ffdn = new ffdn[v];
                arr_ffdn[0] = ffdm.h(((ffdm)ffdl0).b[0]);
                int v1 = 1;
                for(Object object0: map0.entrySet()) {
                    ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)((Map.Entry)object0).getKey();
                    switch(((ffdk)((Map.Entry)object0).getValue()).ordinal()) {
                        case 1: {
                            arr_ffdn[v1] = ffdm.h(parcelFileDescriptor0);
                            goto label_26;
                        }
                        case 2: {
                            ffdn ffdn0 = new ffdn();
                            ffdn0.a = parcelFileDescriptor0;
                            ffdn0.b = 2;
                            arr_ffdn[v1] = ffdn0;
                        label_26:
                            ++v1;
                        }
                    }
                }
                try {
                    int v2 = (int)timeUnit0.toMillis(900L);
                    int[] arr_v = new int[v];
                    short[] arr_v1 = new short[v];
                    short[] arr_v2 = new short[v];
                    for(int v3 = 0; v3 < v; ++v3) {
                        ffdn ffdn1 = arr_ffdn[v3];
                        batl.s(ffdn1);
                        batl.s(ffdn1.a);
                        arr_v[v3] = ffdn1.a.getFd();
                        arr_v1[v3] = ffdn1.b;
                        arr_v2[v3] = 0;
                    }
                    try {
                        v4 = NativeOsCompat.nativePoll(arr_v, arr_v1, arr_v2, v2);
                        NativeOsCompat.a(v4, "poll");
                    }
                    catch(Throwable throwable0) {
                        for(int v6 = 0; v6 < v; ++v6) {
                            arr_ffdn[v6].c = arr_v2[v6];
                        }
                        throw throwable0;
                    }
                    for(int v5 = 0; v5 < v; ++v5) {
                        arr_ffdn[v5].c = arr_v2[v5];
                    }
                }
                catch(ffdh ffdh0) {
                    Log.w("Selector", "error within poll()", ffdh0);
                    set0 = Collections.EMPTY_SET;
                    goto label_77;
                }
                if(v4 == 0) {
                    throw new TimeoutException();
                }
                HashSet hashSet0 = ggog.i(v4);
                for(int v7 = 0; v7 < v; ++v7) {
                    ffdn ffdn2 = arr_ffdn[v7];
                    if(ffdn2.c != 0) {
                        ParcelFileDescriptor parcelFileDescriptor1 = ffdn2.a;
                        if(parcelFileDescriptor1 == ((ffdm)ffdl0).b[0]) {
                            ((ffdm)ffdl0).i();
                        }
                        else {
                            hashSet0.add(parcelFileDescriptor1);
                        }
                    }
                }
                set0 = DesugarCollections.unmodifiableSet(hashSet0);
            label_77:
                for(Object object1: set0) {
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor)object1;
                    batl.s(parcelFileDescriptor2);
                    fdrq fdrq0 = (fdrq)fdri0.c.a.get(parcelFileDescriptor2);
                    if(fdrq0 == null) {
                        throw new IllegalStateException("Untracked fd returned from selector");
                    }
                    fdro fdro0 = (fdro)fdri0.d.a(fdrq0);
                    if(fdro0 == null) {
                        Log.w("ChannelManager", a.ab(fdrq0, "Selector has a reference to a non-existent channel: "));
                        throw new IllegalStateException("Selector has a reference to a non-existent channel");
                    }
                    this.g = fdro0;
                    try {
                        batl.s(parcelFileDescriptor2);
                        if(parcelFileDescriptor2 == fdro0.k) {
                            if(fdro0.g == 10 && fdro0.n != null) {
                                try {
                                    do {
                                        v8 = fdro0.a(fdro0.k, fdro0.n);
                                    }
                                    while(v8 > 0);
                                }
                                catch(ffdh ffdh1) {
                                    throw new IllegalStateException("Failed to do non-blocking write", ffdh1);
                                }
                                if(v8 == -1 && Log.isLoggable("ChannelStateMachine", 2)) {
                                    Log.v("ChannelStateMachine", "Client closed input stream for channel: " + fdro0.a.toString());
                                }
                                if(!fdro0.n.hasRemaining() || v8 == -1) {
                                    boolean z = v8 == -1 || fdro0.o;
                                    long v9 = fdro0.i;
                                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)feyf.a).v_newBuilder();
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    feyf feyf0 = (feyf)hftp0.b_message;
                                    feyf0.b |= 2;
                                    feyf0.d = z;
                                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)feyg.a).v_newBuilder();
                                    if(!hftp1.b_message.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv0 = hftp1.b_message;
                                    feyg feyg0 = (feyg)hftv0;
                                    feyg0.b |= 4;
                                    feyg0.e = v9;
                                    fdrq fdrq1 = fdro0.a;
                                    long v10 = fdrq1.c;
                                    if(!hftv0.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    ProtoLiteMessage hftv1 = hftp1.b_message;
                                    feyg feyg1 = (feyg)hftv1;
                                    feyg1.b |= 1;
                                    feyg1.c = v10;
                                    boolean z1 = fdrq1.d;
                                    if(!hftv1.isImmutable()) {
                                        hftp1.ensureMutable();
                                    }
                                    feyg feyg2 = (feyg)hftp1.b_message;
                                    feyg2.b |= 2;
                                    feyg2.d = z1;
                                    if(!hftp0.b_message.isImmutable()) {
                                        hftp0.ensureMutable();
                                    }
                                    feyf feyf1 = (feyf)hftp0.b_message;
                                    feyg feyg3 = (feyg)hftp1.N_build();
                                    feyg3.getClass();
                                    feyf1.c = feyg3;
                                    feyf1.b |= 1;
                                    feyf feyf2 = (feyf)hftp0.N_build();
                                    feyj feyj0 = fdro0.b();
                                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)feyj0).jf(5, null);
                                    hftp2.X(((ProtoLiteMessage)feyj0));
                                    if(!hftp2.b_message.isImmutable()) {
                                        hftp2.ensureMutable();
                                    }
                                    feyj feyj1 = (feyj)hftp2.b_message;
                                    feyf2.getClass();
                                    feyj1.g = feyf2;
                                    feyj1.b |= 16;
                                    feak feak0 = new feak(fdrq1, ((feyj)hftp2.N_build()));
                                    fdro0.r.a(feak0);
                                    ++fdro0.i;
                                    if(z) {
                                        fdro0.e(0, 0);
                                    }
                                    else {
                                        fdro0.c.d(fdro0.k, ffdk.a);
                                        fdro0.k(9);
                                    }
                                    fdro0.n.clear();
                                }
                            }
                        }
                        else if(parcelFileDescriptor2 == fdro0.l) {
                            fdro0.h();
                        }
                        else {
                            Log.w("ChannelStateMachine", "doNonBlockingIo called with unknown key");
                        }
                    }
                    catch(fdrm fdrm0) {
                        this.c(fdrm0.a);
                    }
                    this.g = null;
                }
                if(Log.isLoggable("ChannelManager", 2)) {
                    Log.v("ChannelManager", "selector runnable finished.");
                    return;
                label_169:
                    Object object2 = iterator0.next();
                    if(((ffdk)object2) == ffdk.a) {
                        continue;
                    }
                    break;
                }
                return;
            }
        }
        catch(TimeoutException timeoutException0) {
            if(Log.isLoggable("ChannelManager", 2)) {
                Log.v("ChannelManager", "select timed out after 900 seconds", timeoutException0);
            }
            return;
        }
        catch(RuntimeException runtimeException0) {
            Log.w("ChannelManager", "Unexpected exception in SelectorRunnable. Cleaning up.", runtimeException0);
            try {
                this.h = false;
                this.b();
            }
            catch(RuntimeException unused_ex) {
                Log.w("ChannelManager", "Wasn\'t able to clean up.", runtimeException0);
            }
            return;
        }
        ++v;
        goto label_10;
    }
}

