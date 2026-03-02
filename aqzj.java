import android.accounts.Account;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Process;
import android.text.TextUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public final class aqzj implements Runnable {
    public final aqzk a;
    public final Account b;
    public final Runnable c;

    public aqzj(aqzk aqzk0, Account account0, Runnable runnable0) {
        this.a = aqzk0;
        this.b = account0;
        this.c = runnable0;
    }

    @Override
    public final void run() {
        gssw gssw0;
        byte[] arr_b;
        Account account0;
        aqzk aqzk0;
        try {
            aqzk0 = this.a;
            aqsh aqsh0 = aqzk0.a;
            account0 = this.b;
            arr_b = null;
            gssy gssy0 = gssy.a;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gssy0).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gssy)hftp0.b_message).c = 2;
            String s = acso.e(aqsh0.c, account0.name);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy gssy1 = (gssy)hftp0.b_message;
            s.getClass();
            gssy1.d = s;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gstx.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gstx)hftv0).b = 0xC0;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gstx)hftp1.b_message).c = 0xC0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy gssy2 = (gssy)hftp0.b_message;
            gstx gstx0 = (gstx)hftp1.N_build();
            gstx0.getClass();
            gssy2.e = gstx0;
            gssy2.b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gssy.b(((gssy)hftp0.b_message));
            gssy gssy3 = (gssy)hftp0.N_build();
            String s1 = hqmr.a.b().a();
            if(TextUtils.isEmpty(s1)) {
                s1 = "https://www.googleapis.com/auth/peopleapi.legacy.readwrite";
            }
            baqr baqr0 = new baqr();
            baqr0.a = Process.myUid();
            baqr0.c = account0;
            baqr0.b = account0;
            baqr0.d = "com.google.android.gms";
            baqr0.e = "com.google.android.gms";
            baqr0.l(s1);
            baqr0.m("social_client_app_id", "80");
            baun baun0 = aqsh.a;
            if(baun0.b(2)) {
                baun0.j("getPersonPhotoEncoded request = %s clientContext = %s", new Object[]{gssy3, baqr0});
            }
            baun0.h("Calling InternalPeopleServiceGrpc#getPersonPhotoEncoded grpc withOption", new Object[0]);
            aqsg aqsg0 = new aqsg(aqsh0.b, cmlp.a, ckba.c);
            if(aqsg.a == null) {
                ibjh ibjh0 = new ibjh(((MessageLite)gssy0));
                ibjh ibjh1 = new ibjh(((MessageLite)gssx.a));
                aqsg.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/GetPersonPhotoEncoded", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
            }
            gssx gssx0 = (gssx)aqsg0.b.callUnaryWithAuth(aqsg.a, baqr0, gssy3, 10000L, TimeUnit.MILLISECONDS, aqsg0.c);
            if(baun0.b(2)) {
                switch(gssx0.b) {
                    case 0: {
                        gssw0 = gssw.a;
                        break;
                    }
                    case 1: {
                        gssw0 = gssw.b;
                        break;
                    }
                    case 2: {
                        gssw0 = gssw.c;
                        break;
                    }
                    default: {
                        gssw0 = null;
                    }
                }
                if(gssw0 == null) {
                    gssw0 = gssw.d;
                }
                baun0.j("Got photo with format=%s size=%d", new Object[]{gssw0, gssx0.c.size()});
            }
            arr_b = gssx0.c.toByteArray();
        }
        catch(iapl iapl0) {
            if(iapl0.a.t.equals(iaph.f)) {
                aqsh.a.h("Profile image was not found for account %s", new Object[]{account0.name});
            }
            else {
                aqsh.a.g("Error making gRPC request.", iapl0, new Object[0]);
            }
        }
        catch(acse | IOException exception0) {
            aqsh.a.g("Error making gRPC request.", exception0, new Object[0]);
        }
        if(arr_b != null) {
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
            aqzk0.b.putIfAbsent(account0.name, bitmap0);
        }
        this.c.run();
    }
}

