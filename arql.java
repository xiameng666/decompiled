import android.os.Environment;
import android.os.ParcelFileDescriptor;
import j..util.Collection.-EL;
import j..util.Objects;
import j..util.Optional;
import j..util.stream.Collectors;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class arql extends arqo {
    public static final baun a;
    private final arjm b;
    private final String c;
    private final File d;
    private Optional e;

    static {
        arql.a = aqql.a("CommonDirectoryFlavorHandler");
    }

    public arql(String s, arjm arjm0) {
        this.e = Optional.empty();
        this.d = hqhq.n() && !Objects.equals(s, Environment.DIRECTORY_DOWNLOADS) ? Environment.getExternalStorageDirectory() : Environment.getExternalStoragePublicDirectory(s);
        this.c = s;
        this.b = arjm0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("Common directory flavor should not use file payload");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        String s2;
        if(!this.h()) {
            if(hqhq.z()) {
                String s = (asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).c;
                File file0 = hrnt.i() ? new File(ccsb.a.b(this.d, s)) : new File(this.d, s);
                try {
                    String s1 = file0.getCanonicalPath();
                    s2 = this.d.getCanonicalPath();
                }
                catch(IOException iOException0) {
                    arql.a.n("Unable to open file for writing; skipping restoring: %s", iOException0, new Object[]{s});
                    throw new arra("Unable to open file: " + s, iOException0);
                }
                if(!s2.endsWith("/")) {
                    s2 = s2 + "/";
                }
                if(s1.startsWith(s2)) {
                    try {
                        return new FileInputStream(file0);
                    }
                    catch(FileNotFoundException fileNotFoundException0) {
                        arql.a.n("Unable to open file for reading; skipping backup: %s", fileNotFoundException0, new Object[]{s});
                        throw new arra("Unable to open for reading: " + s, fileNotFoundException0);
                    }
                }
                arql.a.m("Possible security issue; unable to transfer item: %s", new Object[]{s});
                throw new arra("Unable to transfer item: " + s);
            }
            return new ByteArrayInputStream(new byte[0]);
        }
        return this.f(asby0);
    }

    @Override  // arqo
    public final List c() {
        iapk iapk0;
        if(!this.h()) {
            if(!hqhq.z()) {
                return new ArrayList();
            }
            baun baun0 = arql.a;
            baun0.d("Starting directory crawl...", new Object[0]);
            File file0 = this.d;
            arqk arqk0 = new arqk(file0);
            if(file0.exists() && file0.isDirectory()) {
                this.i(file0, 0, arqk0);
            }
            baun0.d("Directory crawl finished. Files count: %d", new Object[]{arqk0.a.size()});
            return arqk0.a;
        }
        try {
            arjm arjm0 = this.b;
            ArrayList arrayList0 = new ArrayList();
            for(long v = 0x8000000000000000L; true; v = v1) {
                arbb arbb0 = arjm0.a();
                arjj arjj0 = new arjj();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arbf arbf0 = (arbf)hftp0.b_message;
                arbf0.b |= 1;
                arbf0.c = v;
                hfrh hfrh0 = (hfrh)((glyq)hfrh.a(arbb0, arjj0, ((arbf)hftp0.N_build()))).v(hqhq.f(), TimeUnit.SECONDS);
                iapk0 = hfrh0.a;
                if(!iapk0.equals(iapk.b)) {
                    break;
                }
                arbg arbg0 = (arbg)Objects.requireNonNull(((arbg)hfrh0.b));
                long v1 = arbg0.b;
                arrayList0.addAll(arbg0.c);
                if(arbg0.c.isEmpty()) {
                    List list0 = (List)Collection.-EL.stream(gged_interceptors.i(arrayList0)).map(new arqe()).filter(new arqf()).map(new arqg()).distinct().collect(Collectors.toCollection(new arqh()));
                    arql.a.h("%s External storage items count: %d", new Object[]{"External Storage Custom D2D API", list0.size()});
                    return list0;
                }
            }
            arjm.a.m("External Storage Custom D2D API getMetadata failed with status: " + iapk0, new Object[0]);
            throw new iapn(iapk0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException | iapn exception0) {
            arql.a.f("%s Error during generating external storage metadata.", new Object[]{"External Storage Custom D2D API", exception0});
            return new ArrayList();
        }
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        arql.a.d("Closing stream to file: %s", new Object[]{(asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).c});
        bbpb.b(inputStream0);
    }

    @Override  // arqo
    public final long e(asby asby0) {
        return ghgc.a.d("common_directory_" + asby0.e).c();
    }

    private final InputStream f(asby asby0) {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbd.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)araz.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fpxo.a).v_newBuilder();
            String s = (asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            s.getClass();
            ((fpxo)hftv0).b |= 1;
            ((fpxo)hftv0).c = s;
            long v = ((asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).b & 2) == 0 ? 0L : (asby0.c == 100 ? ((asbs)asby0.d) : asbs.a).d;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((fpxo)hftv1).b |= 4;
            ((fpxo)hftv1).e = v;
            long v1 = asby0.f;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            fpxo fpxo0 = (fpxo)hftp2.b_message;
            fpxo0.b |= 2;
            fpxo0.d = v1;
            fpxo fpxo1 = (fpxo)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            araz araz0 = (araz)hftp1.b_message;
            fpxo1.getClass();
            araz0.d = fpxo1;
            araz0.c = 4;
            araz araz1 = (araz)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arbd arbd0 = (arbd)hftp0.b_message;
            araz1.getClass();
            arbd0.c = araz1;
            arbd0.b |= 1;
            arbd arbd1 = (arbd)hftp0.N_build();
            hfrh hfrh0 = (hfrh)((glyq)hfrh.a(this.b.a(), new arjk(), arbd1)).v(hqhq.f(), TimeUnit.SECONDS);
            iapk iapk0 = hfrh0.a;
            if(iapk0.equals(iapk.b)) {
                arbe arbe0 = (arbe)Objects.requireNonNull(((arbe)hfrh0.b));
                ParcelFileDescriptor parcelFileDescriptor0 = (arbe0.b & 1) == 0 || !arbe0.c ? null : ((ParcelFileDescriptor)gpmt.a(hfrh0, aray.a));
                if(parcelFileDescriptor0 != null) {
                    return new arrh(new arqi(parcelFileDescriptor0));
                }
                arql.a.f("%s did not return stream for: %s", new Object[]{"External Storage Custom D2D API", asby0.e});
                return new arrh(new arqj(asby0));
            }
            arjm.a.m("External Storage Custom D2D API getCustomD2DItem failed with status: " + iapk0, new Object[0]);
            throw new iapn(iapk0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException | iapn exception0) {
            arql.a.f("%s Unable to open file for reading; skipping backup: %s", new Object[]{"External Storage Custom D2D API", asby0.e, exception0});
            throw new arra("Unable to open for reading: " + asby0.e, exception0);
        }
    }

    private final boolean g() {
        try {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbh.a).v_newBuilder();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fpxp.a).v_newBuilder();
            String s = this.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fpxp fpxp0 = (fpxp)hftp1.b_message;
            s.getClass();
            fpxp0.b |= 1;
            fpxp0.c = s;
            boolean z = hqhq.n() && Objects.equals(s, Environment.DIRECTORY_DOCUMENTS);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fpxp fpxp1 = (fpxp)hftp1.b_message;
            fpxp1.b |= 2;
            fpxp1.d = z;
            fpxp fpxp2 = (fpxp)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            arbh arbh0 = (arbh)hftp0.b_message;
            fpxp2.getClass();
            arbh0.c = fpxp2;
            arbh0.b = 2;
            arbh arbh1 = (arbh)hftp0.N_build();
            hfrh hfrh0 = (hfrh)((glyq)hfrh.a(this.b.a(), new arjl(), arbh1)).v(hqhq.f(), TimeUnit.SECONDS);
            iapk iapk0 = hfrh0.a;
            if(!iapk0.equals(iapk.b)) {
                arjm.a.m("External Storage Custom D2D API handshake failed with status: " + iapk0, new Object[0]);
            }
            arbi arbi0 = (arbi)hfrh0.b;
            if(arbi0 != null && (arbi0.b & 1) != 0 && arbi0.c) {
                arql.a.j("%s connected.", new Object[]{"External Storage Custom D2D API"});
                return true;
            }
            arql.a.j("%s is not supported in the server side.", new Object[]{"External Storage Custom D2D API", arbi0});
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            arql.a.f("Error on %s handshake request", new Object[]{"External Storage Custom D2D API", exception0});
        }
        return false;
    }

    private final boolean h() {
        boolean z = false;
        if(!this.e.isPresent()) {
            if(!hqhq.n()) {
                arql.a.j("PH flags are disabled, not using %s.", new Object[]{"External Storage Custom D2D API"});
            }
            else if(this.g()) {
                z = true;
            }
            else {
                arql.a.m("Failed connecting to the server, not using %s.", new Object[]{"External Storage Custom D2D API"});
            }
            Optional optional0 = Optional.of(Boolean.valueOf(z));
            this.e = optional0;
            return ((Boolean)optional0.get()).booleanValue();
        }
        return ((Boolean)this.e.get()).booleanValue();
    }

    private final void i(File file0, int v, arqk arqk0) {
        if(v < 8) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null) {
                for(int v1 = 0; v1 < arr_file.length; ++v1) {
                    File file1 = arr_file[v1];
                    if(file1.isDirectory()) {
                        this.i(file1, v + 1, arqk0);
                    }
                    else if(file1.isFile()) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbs.a).v_newBuilder();
                        URI uRI0 = file1.toURI();
                        String s = arqk0.b.relativize(uRI0).getPath();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        asbs asbs0 = (asbs)hftp0.b_message;
                        s.getClass();
                        asbs0.b |= 1;
                        asbs0.c = s;
                        long v2 = file1.lastModified();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        asbs asbs1 = (asbs)hftp0.b_message;
                        asbs1.b |= 2;
                        asbs1.d = v2;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asby.a).v_newBuilder();
                        int v3 = arqk0.c;
                        arqk0.c = v3 + 1;
                        String s1 = Integer.toString(v3);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        asby asby0 = (asby)hftp1.b_message;
                        s1.getClass();
                        asby0.b |= 1;
                        asby0.e = s1;
                        long v4 = file1.length();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((asby)hftv0).b |= 2;
                        ((asby)hftv0).f = v4;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        asby asby1 = (asby)hftp1.b_message;
                        asbs asbs2 = (asbs)hftp0.N_build();
                        asbs2.getClass();
                        asby1.d = asbs2;
                        asby1.c = 100;
                        asby asby2 = (asby)hftp1.N_build();
                        arqk0.a.add(asby2);
                    }
                }
            }
        }
    }
}

