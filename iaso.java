import android.os.Parcel;
import j..util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

abstract class iaso {
    public final ibfn a;
    private final iarm b;
    private final int c;
    private boolean d;
    private InputStream e;
    private Queue f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;

    public iaso(iarm iarm0, int v, ibfn ibfn0) {
        this.k = 1;
        this.b = iarm0;
        this.c = v;
        this.a = ibfn0;
    }

    protected abstract int a(Parcel arg1);

    private final void b(int v) {
        int v1 = this.k;
        boolean z = false;
        switch(v - 1) {
            case 1: {
                if(v1 == 1) {
                    z = true;
                }
                gftb.q(z);
                break;
            }
            case 2: {
                if(v1 == 2) {
                    z = true;
                }
                gftb.q(z);
                break;
            }
            case 3: {
                if(v1 == 3) {
                    z = true;
                }
                gftb.q(z);
            }
        }
        this.k = v;
    }

    final void c(InputStream inputStream0) {
        this.d();
        Queue queue0 = this.f;
        if(queue0 != null) {
            queue0.add(inputStream0);
            return;
        }
        if(this.e == null) {
            this.e = inputStream0;
            return;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
        this.f = concurrentLinkedQueue0;
        concurrentLinkedQueue0.add(inputStream0);
    }

    protected final void d() {
        this.d = true;
    }

    protected final void e() {
        this.g = true;
    }

    // This method was un-flattened
    final void f() {
        int v5;
        int v4;
        while(true) {
            int v = this.k - 1;
            InputStream inputStream0 = null;
            if(this.k == 0) {
                throw null;
            }
            switch(v) {
                case 0: {
                    if(!this.d) {
                        return;
                    }
                    break;
                }
                case 1: {
                    if(!this.h() && !this.g) {
                        return;
                    }
                    break;
                }
                case 2: {
                    if(!this.g) {
                        return;
                    }
                    break;
                }
                default: {
                    return;
                }
            }
            if(!this.g()) {
                return;
            }
            try {
                try {
                    iasp iasp0 = iasp.c();
                    try {
                        int v1 = 0;
                        iasp0.a().writeInt(0);
                        Parcel parcel0 = iasp0.a();
                        int v2 = this.h;
                        this.h = v2 + 1;
                        parcel0.writeInt(v2);
                        int v3 = this.k - 1;
                        if(this.k == 0) {
                            throw null;
                        }
                        switch(v3) {
                            case 0: {
                                v4 = this.a(iasp0.a()) | 1;
                                this.b(2);
                                if(this.h() || this.g) {
                                    goto label_29;
                                }
                                break;
                            }
                            case 1: {
                                v4 = 0;
                            label_29:
                                if(this.i == 0) {
                                    inputStream0 = this.e;
                                }
                                else {
                                    Queue queue0 = this.f;
                                    if(queue0 != null) {
                                        inputStream0 = (InputStream)queue0.peek();
                                    }
                                }
                                if(inputStream0 == null) {
                                    gftb.q(this.g);
                                    v1 = v4;
                                }
                                else {
                                    Parcel parcel1 = iasp0.a();
                                    if((inputStream0 instanceof iasq)) {
                                        this.j = ((iasq)inputStream0).a(parcel1);
                                        v5 = 0x40;
                                        goto label_60;
                                    }
                                    else {
                                        byte[] arr_b = iaro.b();
                                        try {
                                            int v6 = inputStream0.read(arr_b);
                                            if(v6 <= 0) {
                                                parcel1.writeInt(0);
                                                v5 = 0;
                                                goto label_59;
                                            }
                                            else {
                                                parcel1.writeInt(v6);
                                                parcel1.writeByteArray(arr_b, 0, v6);
                                                this.j += v6;
                                                if(v6 == arr_b.length) {
                                                    goto label_69;
                                                }
                                                else {
                                                    v5 = 0;
                                                    goto label_59;
                                                }
                                            }
                                            goto label_71;
                                        }
                                        catch(Throwable throwable1) {
                                            iaro.a(arr_b);
                                            throw throwable1;
                                        }
                                    label_59:
                                        FIN.finallyExec$NT(v7);
                                    label_60:
                                        inputStream0.close();
                                        int v8 = this.i;
                                        this.i = v8 + 1;
                                        if(v8 > 0) {
                                            Queue queue1 = this.f;
                                            gftb.check(queue1);
                                            queue1.poll();
                                        }
                                        this.j = 0;
                                        goto label_71;
                                    label_69:
                                        v5 = 0x80;
                                        iaro.a(arr_b);
                                    }
                                label_71:
                                    v1 = v4 | 2 | v5;
                                }
                                if(this.g && !this.h()) {
                                    this.b(3);
                                }
                                else {
                                    v4 = v1;
                                    break;
                                }
                                goto label_77;
                            }
                            case 2: {
                            label_77:
                                iasp0.a();
                                v4 = v1 | 4;
                                this.b(4);
                                break;
                            }
                            default: {
                                throw new AssertionError();
                            }
                        }
                        iasy.b(iasp0.a(), v4);
                        int v9 = iasp0.a().dataSize();
                        this.b.t(this.c, iasp0);
                        this.a.c(((long)v9));
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(iasp0, throwable0);
                        throw throwable0;
                    }
                    iasp0.close();
                }
                catch(IOException iOException0) {
                    throw new iapl(iapk.p.e(iOException0));
                }
            }
            catch(iapl iapl0) {
                break;
            }
        }
        this.b(5);
        throw iapl0;
    }

    final boolean g() {
        return this.b.v();
    }

    protected final boolean h() {
        return this.f == null ? this.e != null && this.i == 0 : !this.f.isEmpty();
    }

    @Override
    public final String toString() {
        int v1;
        String s;
        String s1;
        synchronized(this) {
            s = this.getClass().getSimpleName();
            switch(this.k) {
                case 1: {
                    s1 = "INITIAL";
                    break;
                }
                case 2: {
                    s1 = "PREFIX_SENT";
                    break;
                }
                case 3: {
                    s1 = "ALL_MESSAGES_SENT";
                    break;
                }
                case 4: {
                    s1 = "SUFFIX_SENT";
                    break;
                }
                case 5: {
                    s1 = "CLOSED";
                    break;
                }
                default: {
                    s1 = "null";
                }
            }
            v1 = this.i;
        }
        return s + "[S=" + s1 + "/NDM=" + v1 + "]";
    }
}

