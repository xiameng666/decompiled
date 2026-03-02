import android.accounts.Account;
import android.database.MatrixCursor;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import j..util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class eglb implements Callable {
    public final PeopleGalChimeraProvider a;
    public final String[] b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final ProtoLiteBuilder g;

    public eglb(PeopleGalChimeraProvider peopleGalChimeraProvider0, String[] arr_s, String s, String s1, boolean z, ProtoLiteBuilder hftp0, String s2) {
        this.a = peopleGalChimeraProvider0;
        this.b = arr_s;
        this.c = s;
        this.d = s1;
        this.e = z;
        this.g = hftp0;
        this.f = s2;
    }

    @Override
    public final Object call() {
        gstn gstn0;
        eglb eglb0 = this;
        String s = eglb0.c;
        Object object0 = null;
        if(s != null && s.length() >= 2) {
            ProtoLiteBuilder hftp0 = eglb0.g;
            String s1 = eglb0.d;
            PeopleGalChimeraProvider peopleGalChimeraProvider0 = eglb0.a;
            Account account0 = peopleGalChimeraProvider0.d(s1, hftp0);
            if(account0 == null) {
                egig.b("PeopleGalProvider", "Account not found: " + s1);
                return null;
            }
            baqr baqr0 = peopleGalChimeraProvider0.b(account0);
            gstk gstk0 = gstk.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gstk0).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gstk)hftp1.b_message).e = 2;
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
            ProtoLiteBuilder hftp4 = egkx.a(eglb0.f);
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
            gstk gstk1 = (gstk)hftp1.b_message;
            gsts gsts2 = (gsts)hftp2.N_build();
            gsts2.getClass();
            gstk1.f = gsts2;
            gstk1.b |= 2;
            gsua gsua0 = (gsua)((ProtoLiteMessage)gsub.b).v_newBuilder();
            gsua0.a(gsuc.b);
            gsua0.a(gsuc.c);
            hftf hftf0 = (hftf)((ProtoLiteMessage)hftg.a).v_newBuilder();
            hftf0.k("person.metadata");
            hftf0.k("person.address");
            hftf0.k("person.name");
            hftf0.k("person.photo");
            hftf0.k("person.phone");
            if(!gsua0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gsua0).ensureMutable();
            }
            gsub gsub0 = (gsub)gsua0.b_message;
            hftg hftg0 = (hftg)((ProtoLiteBuilder)hftf0).N_build();
            hftg0.getClass();
            gsub0.d = hftg0;
            gsub0.c |= 1;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gstk gstk2 = (gstk)hftp1.b_message;
            gsub gsub1 = (gsub)((ProtoLiteBuilder)gsua0).N_build();
            gsub1.getClass();
            gstk2.g = gsub1;
            gstk2.b |= 4;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gstk)hftv0).d = 3;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gstk gstk3 = (gstk)hftp1.b_message;
            hfuo hfuo0 = gstk3.c;
            if(!hfuo0.c()) {
                gstk3.c = ProtoLiteMessage.E(hfuo0);
            }
            gstk3.c.add(s);
            gstp gstp0 = (gstp)((ProtoLiteMessage)gstq.a).v_newBuilder();
            gsrx gsrx0 = (gsrx)((ProtoLiteMessage)gsry.a).v_newBuilder();
            gsrx0.a();
            if(!gstp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gstp0).ensureMutable();
            }
            gstq gstq0 = (gstq)gstp0.b_message;
            gsry gsry0 = (gsry)((ProtoLiteBuilder)gsrx0).N_build();
            gsry0.getClass();
            gstq0.d = gsry0;
            gstq0.b |= 4;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gstk gstk4 = (gstk)hftp1.b_message;
            gstq gstq1 = (gstq)((ProtoLiteBuilder)gstp0).N_build();
            gstq1.getClass();
            gstk4.h = gstq1;
            gstk4.b |= 0x20;
            gstk gstk5 = (gstk)hftp1.N_build();
            try {
                egkd egkd0 = new egkd(peopleGalChimeraProvider0.a.b, cmlp.a, cksv.b);
                long v = TimeUnit.SECONDS.toMillis(hxdy.c());
                if(egkd.a == null) {
                    ibjh ibjh0 = new ibjh(((MessageLite)gstk0));
                    ibjh ibjh1 = new ibjh(((MessageLite)gstn.a));
                    egkd.a = new gRPCMethodDescriptor(gRPCMethodType.a, "google.internal.people.v2.InternalPeopleService/ListPeopleByKnownId", ((gRPCMarshaller)ibjh0), ((gRPCMarshaller)ibjh1), false);
                }
                gstn0 = (gstn)egkd0.o.callUnaryWithAuth(egkd.a, baqr0, gstk5, v, TimeUnit.MILLISECONDS, egkd0.p);
            }
            catch(acse | iapl exception0) {
                try {
                    egig.c("InternalPeopleServiceGrpcClient", "Error making Grpc request.", exception0);
                    throw exception0;
                }
                catch(acse acse0) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gipi)hftp0.b_message).d = 3;
                    ((gipi)hftp0.b_message).b |= 2;
                    PeopleGalChimeraProvider.f(hftp0, acse0);
                    egig.b("PeopleGalProvider", "Error listPeopleByKnownId grpc response: " + acse0.toString());
                    return null;
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
                    egig.b("PeopleGalProvider", "Error listPeopleByKnownId grpc response: " + iapl0.toString());
                    return null;
                }
            }
            if(gstn0.b.size() > 0) {
                String[] arr_s = eglb0.b;
                gstl gstl0 = (gstl)gstn0.b.get(0);
                int v2 = gstl0.b.size();
                MatrixCursor matrixCursor0 = new MatrixCursor(arr_s, v2);
                Map map0 = DesugarCollections.unmodifiableMap(gstn0.c);
                int v3 = 0;
                while(v3 < v2) {
                    gdmq gdmq0 = (gdmq)map0.get(((String)gstl0.b.get(v3)));
                    if(gdmq0 == null) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gipi)hftp0.b_message).d = 9;
                        ((gipi)hftp0.b_message).b |= 2;
                        egig.b("PeopleGalProvider", "Person not found on phone lookup.");
                        return object0;
                    }
                    ++v3;
                    Object object1 = gdmq0.i.isEmpty() ? object0 : ((gdmy)gdmq0.i.get(0));
                    Object[] arr_object = new Object[arr_s.length];
                    int v4 = 0;
                    while(v4 < arr_s.length) {
                        String s2 = arr_s[v4];
                        if(s2.equals("_id")) {
                            arr_object[v4] = v3;
                        }
                        else if(s2.equals("display_name") && !gdmq0.f.isEmpty()) {
                            arr_object[v4] = ((gdmg)gdmq0.f.get(0)).d;
                        }
                        else if(s2.equals("photo_uri") && PeopleGalChimeraProvider.c(gdmq0)) {
                            arr_object[v4] = PeopleGalChimeraProvider.a(s1, false, gdmq0.c, eglb0.e);
                        }
                        else if(s2.equals("has_phone_number")) {
                            arr_object[v4] = (int)(gdmq0.i.size() == 0 ? 0 : 1);
                        }
                        else if(s2.equals("lookup")) {
                            arr_object[v4] = "people-v2:" + gdmq0.c;
                        }
                        else if(object1 != null) {
                            if(s2.equals("number")) {
                                arr_object[v4] = object1.d;
                            }
                            else if(s2.equals("type")) {
                                arr_object[v4] = object1.e;
                            }
                            else if(s2.equals("label")) {
                                arr_object[v4] = object1.f;
                            }
                            else if(s2.equals("normalized_number")) {
                                arr_object[v4] = object1.g;
                            }
                        }
                        ++v4;
                        eglb0 = this;
                    }
                    matrixCursor0.addRow(arr_object);
                    object0 = object0;
                    eglb0 = this;
                }
                int v5 = matrixCursor0.getCount();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gipi gipi1 = (gipi)hftp0.b_message;
                gipi1.b |= 0x20;
                gipi1.g = v5;
                object0 = matrixCursor0;
            }
            egig.e("PeopleGalProvider", "Phone lookup method completed.");
            return object0;
        }
        egig.b("PeopleGalProvider", "Invalid phone number format.");
        return null;
    }
}

