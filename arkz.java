import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

public final class arkz implements Runnable {
    public final arla a;
    public final List b;

    public arkz(arla arla0, List list0) {
        this.a = arla0;
        this.b = list0;
    }

    @Override
    public final void run() {
        arla arla0 = this.a;
        List list0 = this.b;
        if(list0.size() <= 0) {
            arlf.d.j("No accounts found", new Object[0]);
            arim arim0 = arla0.m;
            if(arim0.a) {
                arin.a.d("Listener.onError called after abortRequest", new Object[0]);
            }
            else {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
                ascl ascl0 = ascl.d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((ascm)hftp0.b_message).c = ascl0.g;
                ((ascm)hftp0.b_message).b |= 1;
                ascm ascm0 = (ascm)hftp0.N_build();
                ascj ascj0 = arin.k(2, 3, "No accounts found");
                arim0.b.h(ascm0, ascj0);
            }
            arla0.c();
            return;
        }
        try {
            ParcelFileDescriptor[] arr_parcelFileDescriptor = arla0.h;
            if(arr_parcelFileDescriptor != null) {
                arr_parcelFileDescriptor[0].close();
                arla0.h[1].close();
            }
            ParcelFileDescriptor[] arr_parcelFileDescriptor1 = arla0.g;
            if(arr_parcelFileDescriptor1 != null) {
                arr_parcelFileDescriptor1[0].close();
                arla0.g[1].close();
            }
            arla0.h = ParcelFileDescriptor.createPipe();
            arla0.g = ParcelFileDescriptor.createPipe();
            arla0.e = new ParcelFileDescriptor[]{arla0.h[0], arla0.g[1]};
            ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(arla0.g[0]);
            arkt arkt0 = new arkt(arla0, arla0.k, arla0.m, parcelFileDescriptor$AutoCloseInputStream0);
            Future future0 = arla0.j;
            if(future0 != null) {
                future0.cancel(true);
            }
            arla0.j = arla0.l.f(arkt0, null);
            arla0.f = new ParcelFileDescriptor.AutoCloseOutputStream(arla0.h[1]);
            arle arle0 = new arle(arla0, arla0.k);
            ArrayList arrayList0 = new ArrayList(list0);
            epxi epxi0 = new epxi();
            epxi0.a = arrayList0;
            epxi0.b("directTransferConfirmationBodyText", "Your data, including your Google Account and apps, will be transferred to your new device");
            epxi0.b("directTransfer3pConfirmationBodyText", "Your Google Accounts, other accounts, apps, and data will be transferred to your new device");
            epxi0.b("directTransferConfirmationTitleText", "Copy data to your new device?");
            BootstrapConfigurations bootstrapConfigurations0 = epxi0.a();
            evql evql0 = arla0.c.h(bootstrapConfigurations0, arla0.e, arle0);
            evql0.b(new arkx());
            evql0.A(new arky());
            batl.s(arla0.f);
            if(arla0.i.size() != 0) {
                try {
                    try {
                        arla0.f.write(arla0.i.toByteArray(), 0, arla0.i.size());
                    }
                    catch(IOException iOException1) {
                        arlf.d.f("Could not deliver pending data to API", new Object[0]);
                        arla0.d(2, iOException1.getMessage());
                    }
                }
                catch(Throwable throwable0) {
                    arla0.i = null;
                    throw throwable0;
                }
                arla0.i = null;
            }
            arim arim1 = arla0.m;
            if(arim1.a) {
                arin.a.d("Listener.onInitialized called after abortRequest", new Object[0]);
                return;
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ascm.a).v_newBuilder();
            ascl ascl1 = ascl.b;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((ascm)hftp1.b_message).c = ascl1.g;
            ((ascm)hftp1.b_message).b |= 1;
            ascm ascm1 = (ascm)hftp1.N_build();
            arim1.b.h(ascm1, null);
        }
        catch(IOException iOException0) {
            arla.a.g("IoException in creating file descriptors", iOException0, new Object[0]);
            arla0.d(2, iOException0.getMessage());
        }
    }
}

