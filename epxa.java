import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class epxa implements eqhn, erpt {
    public static final erqc a;
    public final ExecutorService b;
    public eqhl c;
    public eqhk d;
    public boolean e;
    protected final Handler f;
    public eqgv g;
    private final Executor h;
    private final gmbg i;
    private final gmbg j;
    private final Runnable k;

    static {
        epxa.a = new erqc(new String[]{"D2D", "BaseDirectTransferController"});
    }

    public epxa(Handler handler0) {
        this.b = new bblp(0x7FFFFFFF, 9);
        this.d = eqhk.a;
        this.e = false;
        this.j = new epwx(this);
        this.k = new epwy(this);
        this.f = handler0;
        this.h = new bbre(handler0);
        this.i = new epwv(this);
    }

    protected abstract erpy a();

    public void b() {
        this.c();
        this.e = false;
        this.g = null;
    }

    public final void c() {
        this.c = null;
    }

    protected final void d(int v) {
        this.e = true;
        if(this.g == null) {
            this.g = new eqgv(new epwz(this), v);
        }
    }

    protected abstract void e();

    protected abstract void f(int arg1, String arg2, eqoc arg3);

    @Override  // erpt
    public void g(byte[] arr_b) {
        epww epww0 = new epww(this, arr_b);
        this.f.post(epww0);
    }

    public final void h(byte[] arr_b) {
        MessagePayload messagePayload1;
        byte[] arr_b4;
        byte[] arr_b3;
        boolean z;
        eqhl eqhl0 = this.c;
        eqhk eqhk0 = null;
        if(eqhl0 != null) {
            if(arr_b.length == 0) {
            label_9:
                z = false;
            }
            else {
                MessagePayload messagePayload0 = new MessagePayload();
                try {
                    messagePayload0.aw(arr_b);
                    if(messagePayload0.b > 0) {
                        z = true;
                        goto label_10;
                    }
                }
                catch(erpd unused_ex) {
                }
                goto label_9;
            }
        label_10:
            if(!eqhl0.e && z && (eqhl0.b.d & 1) != 0) {
                epxa.a.m("A bootstrap message was sent during the encryption phase. As unencrypted communications are supported, we are aborting the encryption process.", new Object[0]);
                this.c();
                this.o();
                goto label_82;
            }
            Future future0 = eqhl0.d;
            if(future0 != null) {
                future0.cancel(true);
                eqhl0.d = null;
            }
            try {
                eqhm eqhm0 = eqhl0.b;
                if(eqhm0.e < 0) {
                    if(arr_b.length != 1) {
                        throw new hhti("Expected first encryption message to be one byte in length");
                    }
                    int v = Integer.highestOneBit(arr_b[0] & eqhm0.d);
                    eqhm0.e = v;
                    int v1 = eqhm0.c;
                    if(v1 == 11) {
                        eqhm0.b.l(new byte[]{((byte)v)});
                    }
                    int v2 = eqhm0.e;
                    switch(v2) {
                        case 1: {
                            eqhm.a.j("Negotiated no encryption", new Object[0]);
                            eqhk0 = eqhk.a;
                            break;
                        }
                        case 8: {
                            eqhm.a.j("Negotiated and starting Ukey2 encryption", new Object[0]);
                            eqhm0.f = new eqhp(eqhm0.b, v1);
                            eqhp eqhp0 = eqhm0.f;
                            if(eqhp0.d == 11) {
                                eqhp0.e = new hhtx(1, hhtv.a);
                                byte[] arr_b1 = eqhp0.e.d();
                                eqhp0.c.l(arr_b1);
                            }
                            else {
                                eqhp0.e = new hhtx(4, hhtv.a);
                            }
                            break;
                        }
                        default: {
                            throw new hhti("Unknown encryption type " + v2);
                        }
                    }
                }
                else {
                    eqhp eqhp1 = eqhm0.f;
                    if(eqhp1 == null) {
                        throw new hhti("Unexpected message");
                    }
                    if(eqhp1.f != null && eqhp1.d == 11) {
                        byte[] arr_b2 = eqhp.b;
                        if(Arrays.equals(arr_b, arr_b2)) {
                            goto label_67;
                        }
                        String s = "Unexpected message during final step of Ukey2HandshakeHandler. Expected: " + Arrays.toString(arr_b2) + " but received: " + Arrays.toString(arr_b);
                        eqhp.a.f(s, new Object[0]);
                        throw new SecurityException(s);
                    }
                    else if(eqhp1.e.f() == 1) {
                        eqhp1.e.b(arr_b);
                        if(eqhp1.e.f() == 1) {
                            arr_b3 = eqhp1.e.d();
                            if(eqhp1.e.f() == 1) {
                                eqhp1.c.l(arr_b3);
                            }
                            else {
                            label_60:
                                eqhp1.e.e(4);
                                eqhp1.e.c();
                                eqhp1.f = eqhp1.e.a();
                                if(arr_b3 != null) {
                                    eqhp1.c.l(arr_b3);
                                }
                                if(eqhp1.d == 12) {
                                    eqhp1.c.l(eqhp.b);
                                label_67:
                                    eqhk0 = new eqho(eqhp1.f);
                                }
                            }
                        }
                        else {
                            arr_b3 = null;
                            goto label_60;
                        }
                    }
                }
            }
            catch(hhti | hhtu exception0) {
                eqhl0.e = true;
                gmbg gmbg0 = eqhl0.c;
                if(gmbg0 != null) {
                    gmbg0.a(exception0);
                }
            }
            if(eqhk0 != null) {
                eqhl0.e = true;
                gmbg gmbg1 = eqhl0.c;
                if(gmbg1 != null) {
                    gmbg1.b(eqhk0);
                }
            }
            return;
        }
        try {
        label_82:
            arr_b4 = this.d.a(arr_b);
        }
        catch(SecurityException securityException0) {
            this.f(10587, securityException0.toString(), null);
            return;
        }
        try {
            messagePayload1 = eqrj.a(arr_b4);
        }
        catch(erpd erpd0) {
            this.f(10589, erpd0.toString(), null);
            return;
        }
        if(messagePayload1 == null) {
            epxa.a.f("MessagePayload is null", new Object[0]);
            this.f(10555, "MessagePayload is null", null);
            return;
        }
        if(hyid.d()) {
            Object[] arr_object = {messagePayload1.q()};
            epxa.a.d("Received payload: %s", arr_object);
        }
        else {
            epxa.a.d("Received payload: %s", new Object[]{messagePayload1});
        }
        int v3 = messagePayload1.c;
        if(eqgs.a(v3)) {
            switch(v3) {
                case 1: {
                    this.f((messagePayload1.l == null ? 10564 : messagePayload1.l.a), "Bootstrap canceled", null);
                    return;
                }
                case 2: {
                    this.e();
                    return;
                }
                case 3: {
                    DeviceStatus deviceStatus0 = messagePayload1.l;
                    if(deviceStatus0 == null) {
                        this.f(0x294F, "Remote device error", null);
                        return;
                    }
                    this.f(deviceStatus0.a, "Remote device error", null);
                    return;
                }
                default: {
                    epxa.a.f("Unknown state from remote device: " + v3, new Object[0]);
                    this.f(0x294F, "Unknown remote device error", null);
                    return;
                }
            }
        }
        this.i(messagePayload1);
    }

    protected abstract void i(MessagePayload arg1);

    protected final void j(int v) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.x(v);
        this.m(messagePayload0);
    }

    protected final void k(int v) {
        int v1 = 1;
        switch(v) {
            case 10564: {
                break;
            }
            case 10598: {
                v = 10598;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        DeviceStatus deviceStatus0 = new DeviceStatus();
        deviceStatus0.p(v);
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.x(v1);
        messagePayload0.y(deviceStatus0);
        this.m(messagePayload0);
    }

    @Override  // eqhn
    public void l(byte[] arr_b) {
        byte[] arr_b1;
        try {
            arr_b1 = this.d.b(arr_b);
        }
        catch(SecurityException securityException0) {
            epxa.a.g("Error encrypting MessagePayload.", securityException0, new Object[0]);
            this.f(10588, "Error encrypting MessagePayload.", null);
            return;
        }
        gmbu.t(this.s(arr_b1), this.i, this.h);
    }

    protected final void m(MessagePayload messagePayload0) {
        if(hyid.d()) {
            Object[] arr_object = {messagePayload0.q()};
            epxa.a.d("Sending payload: %s", arr_object);
        }
        else {
            epxa.a.d("Sending payload: %s", new Object[]{messagePayload0});
        }
        this.l(messagePayload0.ax());
    }

    final void n(gmbg gmbg0, MessagePayload[] arr_messagePayload) {
        byte[] arr_b1;
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_messagePayload.length; ++v) {
            MessagePayload messagePayload0 = arr_messagePayload[v];
            if(hyid.d()) {
                Object[] arr_object = {messagePayload0.q()};
                epxa.a.d("Sending %s", arr_object);
            }
            byte[] arr_b = messagePayload0.ax();
            try {
                arr_b1 = this.d.b(arr_b);
            }
            catch(SecurityException securityException0) {
                epxa.a.g("Error encrypting MessagePayload.", securityException0, new Object[0]);
                this.f(10588, "Error encrypting MessagePayload.", null);
                return;
            }
            arrayList0.add(this.s(arr_b1));
        }
        gmbu.t(gmbu.e(arrayList0), gmbg0, this.h);
    }

    protected abstract void o();

    protected final void p(eqhl eqhl0, boolean z) {
        epxa.a.j("startEncryptionNegotiation", new Object[0]);
        this.c = eqhl0;
        eqhl0.c = this.j;
        eqhl0.e = false;
        eqhm eqhm0 = eqhl0.b;
        if(eqhm0.c == 12) {
            eqhm0.b.l(new byte[]{eqhm0.d});
        }
        if(z) {
            long v = (long)(((int)hyim.a.e().h()));
            eqhl0.d = ((bbll)eqhl.a).g(this.k, v, TimeUnit.MILLISECONDS);
        }
    }

    static ResultReceiver q(Bundle bundle0) {
        bundle0.setClassLoader(ProxyResultReceiver.class.getClassLoader());
        return (ResultReceiver)bundle0.getParcelable("resultReceiver");
    }

    @Override  // erpt
    public final void r(String s) {
        epxa.a.j("pipe read error %s", new Object[]{s});
        this.f(0x2950, "Error thrown in the reading pipe: " + s, null);
    }

    private final gmcd s(byte[] arr_b) {
        erpy erpy0 = this.a();
        if(this.e) {
            eqgv eqgv0 = this.g;
            if(eqgv0 != null) {
                List list0 = eqgv0.a(arr_b);
                epxa.a.j("Split message of %d bytes into %d packets", new Object[]{((int)arr_b.length), list0.size()});
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    arrayList0.add(erpy0.a(((byte[])object0)));
                }
                return gmbu.e(arrayList0);
            }
        }
        return erpy0.a(arr_b);
    }
}

