import android.accounts.Account;
import android.net.Uri;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

public final class egky implements Callable {
    public final PeopleGalChimeraProvider a;
    public final Uri b;
    public final Account c;
    public final ProtoLiteBuilder d;

    public egky(PeopleGalChimeraProvider peopleGalChimeraProvider0, Uri uri0, Account account0, ProtoLiteBuilder hftp0) {
        this.a = peopleGalChimeraProvider0;
        this.b = uri0;
        this.c = account0;
        this.d = hftp0;
    }

    @Override
    public final Object call() {
        byte[] arr_b;
        Uri uri0 = this.b;
        ProtoLiteBuilder hftp0 = this.d;
        String s = uri0.getQueryParameter("lookup");
        if(s == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gipi)hftp0.b_message).d = 6;
            ((gipi)hftp0.b_message).b |= 2;
            egig.b("PeopleGalProvider", "Lookup key cannot be null");
            return null;
        }
        PeopleGalChimeraProvider peopleGalChimeraProvider0 = this.a;
        String s1 = uri0.getQueryParameter("sz");
        String s2 = PeopleGalChimeraProvider.g(uri0);
        baqr baqr0 = peopleGalChimeraProvider0.b(this.c);
        egke egke0 = peopleGalChimeraProvider0.a;
        long v = s1 == null ? hxdy.a.f().c() : hxdy.d();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gssy.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gsts.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gstr.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        gstr.b(((gstr)hftp3.b_message));
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gsts gsts0 = (gsts)hftp2.b_message;
        gstr gstr0 = (gstr)hftp3.N_build();
        gstr0.getClass();
        gsts0.d = gstr0;
        gsts0.b |= 2;
        ProtoLiteBuilder hftp4 = egkx.a(s2);
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gsts gsts1 = (gsts)hftp2.b_message;
        gsru gsru0 = (gsru)hftp4.N_build();
        gsru0.getClass();
        gsts1.c = gsru0;
        gsts1.b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gssy gssy0 = (gssy)hftp1.b_message;
        gsts gsts2 = (gsts)hftp2.N_build();
        gsts2.getClass();
        gssy0.f = gsts2;
        gssy0.b |= 2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gssy)hftv0).c = 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gssy)hftv1).d = s;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gssy.b(((gssy)hftp1.b_message));
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gstx.a).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp5.b_message;
        ((gstx)hftv2).c = (int)v;
        if(!hftv2.isImmutable()) {
            hftp5.ensureMutable();
        }
        ((gstx)hftp5.b_message).b = (int)v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gssy gssy1 = (gssy)hftp1.b_message;
        gstx gstx0 = (gstx)hftp5.N_build();
        gstx0.getClass();
        gssy1.e = gstx0;
        gssy1.b |= 1;
        gssy gssy2 = (gssy)hftp1.N_build();
        try {
            arr_b = egke0.c(baqr0, gssy2).c.toByteArray();
            goto label_95;
        }
        catch(acse acse0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gipi)hftp0.b_message).d = 3;
            ((gipi)hftp0.b_message).b |= 2;
            PeopleGalChimeraProvider.f(hftp0, acse0);
            egig.b("PeopleGalProvider", "Error getPersonPhotoEncodedResponse grpc response: " + acse0.toString());
        }
        catch(iapl iapl0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gipi)hftp0.b_message).d = 14;
            ((gipi)hftp0.b_message).b |= 2;
            int v1 = iapl0.a.t.r;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gipi gipi0 = (gipi)hftp0.b_message;
            gipi0.b |= 16;
            gipi0.f = v1;
            PeopleGalChimeraProvider.f(hftp0, iapl0);
            egig.b("PeopleGalProvider", "Error getPersonPhotoEncodedResponse grpc response: " + iapl0.toString());
        }
        arr_b = null;
    label_95:
        if(arr_b == null) {
            egig.b("PeopleGalProvider", "Can\'t get GetPersonPhotoEncoded grpc response");
            return null;
        }
        try {
            egig.e("PeopleGalProvider", "Photo bytes received, writing bytes to pipe.");
            return peopleGalChimeraProvider0.openPipeHelper(uri0, null, null, new ByteArrayInputStream(arr_b), new egle(hftp0));
        }
        catch(FileNotFoundException fileNotFoundException0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gipi)hftp0.b_message).d = 11;
            ((gipi)hftp0.b_message).b |= 2;
            PeopleGalChimeraProvider.f(hftp0, fileNotFoundException0);
            egig.b("PeopleGalProvider", "Cannot find file for the photo.");
            return null;
        }
    }
}

