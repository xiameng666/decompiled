import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.data.DeviceStatus;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public abstract class epwu {
    public final baun a;
    public final AtomicBoolean b;
    public final Handler c;
    public final epwt d;
    public final epxf e;
    private boolean f;
    private eqgv g;

    public epwu(baun baun0, Handler handler0, epwt epwt0) {
        this.b = new AtomicBoolean(false);
        this.f = false;
        this.e = new epxf();
        this.a = baun0;
        this.c = handler0;
        this.d = epwt0;
    }

    protected final BootstrapCompletionResult a() {
        return this.e.a();
    }

    protected abstract epyj b();

    public void c() {
        this.f = false;
        this.g = null;
    }

    protected final void d() {
        epyj epyj0 = this.b();
        if(epyj0 != null) {
            this.a.j("Disconnecting DeviceMessageSender.", new Object[0]);
            ((eqgo)epyj0).b.r(((eqgo)epyj0).a);
            return;
        }
        this.a.d("DeviceMessageSender has already been disconnected.", new Object[0]);
    }

    protected final void e(int v) {
        this.a.j("Packet mode enabled", new Object[0]);
        this.f = true;
        if(this.g == null) {
            this.g = new eqgv(new epws(this), v);
        }
    }

    public final void f(byte[] arr_b) {
        baun baun0 = this.a;
        baun0.j("Received " + arr_b.length + " bytes of data.", new Object[0]);
        if(this.f) {
            eqgv eqgv0 = this.g;
            if(eqgv0 != null) {
                eqgv0.b(arr_b);
                baun0.j("processed data as a packet", new Object[0]);
                return;
            }
        }
        this.h(arr_b);
    }

    public abstract void g(int arg1, eqoc arg2);

    public final void h(byte[] arr_b) {
        eqoc eqoc1;
        MessagePayload messagePayload0;
        try {
            messagePayload0 = eqrj.a(arr_b);
        }
        catch(erpd unused_ex) {
            this.g(10589, null);
            this.d.d(10589, null);
            return;
        }
        if(messagePayload0 == null) {
            this.g(10555, null);
            this.d.d(10555, null);
            return;
        }
        if(hyid.d()) {
            Object[] arr_object = {messagePayload0.q()};
            this.a.h("Received payload: %s", arr_object);
        }
        else {
            this.a.h("Received payload: %s", new Object[]{messagePayload0});
        }
        int v = messagePayload0.c;
        if(eqgs.a(v)) {
            switch(v) {
                case 2: {
                    break;
                }
                case 4: {
                    v = 4;
                    break;
                }
                default: {
                    goto label_20;
                }
            }
            if(this.b.getAndSet(true)) {
            label_20:
                if(v == 1) {
                    this.g(10564, null);
                    this.d.d(10564, null);
                    return;
                }
                if(v == 3) {
                    DeviceStatus deviceStatus0 = messagePayload0.l;
                    if(deviceStatus0 == null) {
                        this.g(0x294F, null);
                        this.d.d(0x294F, null);
                        return;
                    }
                    if(deviceStatus0.d.contains(Integer.valueOf(2)) && deviceStatus0.d.contains(Integer.valueOf(3))) {
                        int v1 = eqob.a(deviceStatus0.b);
                        if(v1 == 0) {
                            eqoc1 = eqoc.a;
                        }
                        else {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp0.b_message;
                            ((eqoc)hftv0).c = v1 - 1;
                            ((eqoc)hftv0).b |= 1;
                            int v2 = deviceStatus0.c;
                            if(!hftv0.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            eqoc eqoc0 = (eqoc)hftp0.b_message;
                            eqoc0.b |= 2;
                            eqoc0.d = v2;
                            eqoc1 = (eqoc)hftp0.N_build();
                        }
                    }
                    else {
                        eqoc1 = eqoc.a;
                    }
                    this.g(deviceStatus0.a, eqoc1);
                    this.d.d(deviceStatus0.a, eqoc1);
                }
                return;
            }
            this.i(messagePayload0);
            return;
        }
        this.j(messagePayload0);
    }

    protected void i(MessagePayload messagePayload0) {
        BootstrapCompletionResult bootstrapCompletionResult0 = this.a();
        this.d.b(bootstrapCompletionResult0);
    }

    protected abstract void j(MessagePayload arg1);

    protected final void k(int v) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.x(v);
        this.n(messagePayload0);
    }

    public final void l(int v) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.x(3);
        DeviceStatus deviceStatus0 = new DeviceStatus();
        deviceStatus0.p(v);
        messagePayload0.y(deviceStatus0);
        this.n(messagePayload0);
    }

    public final void m(int v, eqoc eqoc0) {
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.x(3);
        DeviceStatus deviceStatus0 = new DeviceStatus();
        deviceStatus0.p(v);
        if(eqoc0 != null) {
            deviceStatus0.r((eqob.a(eqoc0.c) == 0 ? 1 : eqob.a(eqoc0.c)) - 1);
            deviceStatus0.q(eqoc0.d);
        }
        messagePayload0.y(deviceStatus0);
        this.n(messagePayload0);
    }

    public final void n(MessagePayload messagePayload0) {
        epyj epyj0 = this.b();
        if(epyj0 == null) {
            this.a.f("Tried to send message while DeviceMessageSender is null.", new Object[0]);
            this.g(10563, null);
            this.d.d(10563, null);
            return;
        }
        if(hyid.d()) {
            Object[] arr_object = {messagePayload0.q()};
            this.a.d("Sending payload: %s", arr_object);
        }
        else {
            this.a.d("Sending payload: %s", new Object[]{messagePayload0});
        }
        try {
            byte[] arr_b = messagePayload0.ax();
            if(this.f) {
                eqgv eqgv0 = this.g;
                if(eqgv0 != null) {
                    List list0 = eqgv0.a(arr_b);
                    this.a.j("Encoded message of %d bytes", new Object[]{((int)arr_b.length)});
                    for(Object object0: list0) {
                        epyj0.a(((byte[])object0));
                    }
                    return;
                }
            }
            this.a.j("Plain message of %d bytes", new Object[]{((int)arr_b.length)});
            epyj0.a(arr_b);
        }
        catch(IOException iOException0) {
            this.a.g("Error sending MessagePayload.", iOException0, new Object[0]);
            this.g(10563, null);
            this.d.d(10563, null);
        }
    }

    public final void o(JSONObject jSONObject0) {
        if(!hyid.d()) {
            this.a.d("Sending QuickStartPayload: %s", new Object[]{jSONObject0.toString()});
        }
        MessagePayload messagePayload0 = new MessagePayload();
        messagePayload0.al(jSONObject0.toString().getBytes(StandardCharsets.UTF_8));
        this.n(messagePayload0);
    }
}

