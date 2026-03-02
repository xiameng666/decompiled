import android.os.RemoteException;
import android.os.WorkSource;
import com.google.android.gms.nearby.common.ble.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import java.util.Set;

public final class gygg implements gygc {
    private final gyit a;

    public gygg(gyit gyit0) {
        this.a = gyit0;
    }

    @Override  // gygc
    public final gyhu a(gygl gygl0, gyim gyim0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyiu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyiu)hftv0).c = 4;
        ((gyiu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyiu gyiu0 = (gyiu)hftp0.b_message;
        gygl0.getClass();
        gyiu0.f = gygl0;
        gyiu0.b |= 8;
        gyiu gyiu1 = (gyiu)hftp0.N_build();
        gygd gygd0 = new gygd(this, gyim0);
        try {
            OperationRequest operationRequest0 = new OperationRequest(gyiu1, gygd0);
            return gygg.i(this.a.b(operationRequest0));
        }
        catch(RemoteException unused_ex) {
            return gygg.h();
        }
    }

    @Override  // gygc
    public final gyhu b(gyhx gyhx0, gyim gyim0, WorkSource workSource0, Set set0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyiu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyiu)hftv0).c = 5;
        ((gyiu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyiu gyiu0 = (gyiu)hftp0.b_message;
        gyhx0.getClass();
        gyiu0.g = gyhx0;
        gyiu0.b |= 16;
        gyiu gyiu1 = (gyiu)hftp0.N_build();
        gyge gyge0 = new gyge(this, gyim0);
        try {
            BleFilter[] arr_bleFilter = set0 == null ? null : ((BleFilter[])set0.toArray(new BleFilter[0]));
            return gygg.i(this.a.b(new OperationRequest(gyiu1, gyge0, workSource0, arr_bleFilter)));
        }
        catch(RemoteException unused_ex) {
            return gygg.h();
        }
    }

    @Override  // gygc
    public final boolean c(gygl gygl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyiu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyiu)hftv0).c = 4;
        ((gyiu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyiu gyiu0 = (gyiu)hftp0.b_message;
        gygl0.getClass();
        gyiu0.f = gygl0;
        gyiu0.b |= 8;
        return this.g(((gyiu)hftp0.N_build()));
    }

    @Override  // gygc
    public final boolean d(gyhx gyhx0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyiu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyiu)hftv0).c = 5;
        ((gyiu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyiu gyiu0 = (gyiu)hftp0.b_message;
        gyhx0.getClass();
        gyiu0.g = gyhx0;
        gyiu0.b |= 16;
        return this.g(((gyiu)hftp0.N_build()));
    }

    @Override  // gygc
    public final void e(String s) {
        try {
            gygg.i(this.a.a(s));
        }
        catch(RemoteException unused_ex) {
            gygg.h();
        }
    }

    @Override  // gygc
    public final void f(gyih gyih0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyiu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyiu)hftv0).c = 7;
        ((gyiu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyiu gyiu0 = (gyiu)hftp0.b_message;
        gyih0.getClass();
        gyiu0.i = gyih0;
        gyiu0.b |= 0x40;
        gyiu gyiu1 = (gyiu)hftp0.N_build();
        try {
            OperationRequest operationRequest0 = new OperationRequest(gyiu1, null);
            this.a.e(operationRequest0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    private final boolean g(gyiu gyiu0) {
        gygf gygf0 = new gygf(this);
        try {
            OperationRequest operationRequest0 = new OperationRequest(gyiu0, gygf0);
            return this.a.d(operationRequest0);
        }
        catch(RemoteException unused_ex) {
            return false;
        }
    }

    private static final gyhu h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gyhu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gyhu)hftv0).b |= 1;
        ((gyhu)hftv0).c = "";
        gyhw gyhw0 = gyhw.a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyhu)hftp0.b_message).d = gyhw0.j;
        ((gyhu)hftp0.b_message).b |= 2;
        return (gyhu)hftp0.N_build();
    }

    private static final gyhu i(OperationResponse operationResponse0) {
        return operationResponse0 == null ? gygg.h() : operationResponse0.b;
    }
}

