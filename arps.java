import android.os.ParcelFileDescriptor;
import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class arps extends arqo {
    public static final int a;
    private static final baun b;
    private final arjs c;

    static {
        arps.b = aqql.a("AndroidMessagesFlavorHandler");
    }

    public arps(arjs arjs0) {
        gftb.check(arjs0);
        this.c = arjs0;
    }

    @Override  // arqo
    public final File a(asby asby0) {
        throw new IOException("Android Messages flavor should use file payload.");
    }

    @Override  // arqo
    public final InputStream b(asby asby0) {
        if(asby0.c == 105) {
            try {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbd.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)araz.a).v_newBuilder();
                String s = asby0.e;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                araz araz0 = (araz)hftp1.b_message;
                s.getClass();
                araz0.b |= 1;
                araz0.e = s;
                arbj arbj0 = asby0.c == 105 ? ((arbj)asby0.d) : arbj.a;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                araz araz1 = (araz)hftp1.b_message;
                arbj0.getClass();
                araz1.d = arbj0;
                araz1.c = 3;
                araz araz2 = (araz)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arbd arbd0 = (arbd)hftp0.b_message;
                araz2.getClass();
                arbd0.c = araz2;
                arbd0.b |= 1;
                arbd arbd1 = (arbd)hftp0.N_build();
                hfrh hfrh0 = (hfrh)((glyq)hfrh.a(this.c.a(), new arjp(), arbd1)).v(hqhq.g(), TimeUnit.SECONDS);
                iapk iapk0 = hfrh0.a;
                if(iapk0.equals(iapk.b)) {
                    arbe arbe0 = (arbe)Objects.requireNonNull(((arbe)hfrh0.b));
                    ParcelFileDescriptor parcelFileDescriptor0 = (arbe0.b & 1) == 0 || !arbe0.c ? null : ((ParcelFileDescriptor)gpmt.a(hfrh0, aray.a));
                    if(parcelFileDescriptor0 != null) {
                        return new arrh(new arpp(parcelFileDescriptor0));
                    }
                    arps.b.f("Android Messages API returned null for: " + asby0.e, new Object[0]);
                    return new arrh(new arpq(asby0));
                }
                arjs.a.m("Messages Custom D2D API getCustomD2DItem failed with status: " + iapk0, new Object[0]);
                throw new iapn(iapk0);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                arps.b.g("D2D item preparation failed for: %s", exception0, new Object[]{asby0.e});
                return new arrh(new arpr(asby0, exception0));
            }
        }
        return new arrh(new arpo(asby0));
    }

    @Override  // arqo
    public final List c() {
        iapk iapk0;
        try {
            arjs arjs0 = this.c;
            ArrayList arrayList0 = new ArrayList();
            for(long v = 0x8000000000000000L; true; v = v1) {
                arbb arbb0 = arjs0.a();
                arjr arjr0 = new arjr();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)arbf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                arbf arbf0 = (arbf)hftp0.b_message;
                arbf0.b |= 1;
                arbf0.c = v;
                hfrh hfrh0 = (hfrh)((glyq)hfrh.a(arbb0, arjr0, ((arbf)hftp0.N_build()))).v(hqhq.g(), TimeUnit.SECONDS);
                iapk0 = hfrh0.a;
                if(!iapk0.equals(iapk.b)) {
                    break;
                }
                arbg arbg0 = (arbg)Objects.requireNonNull(((arbg)hfrh0.b));
                long v1 = arbg0.b;
                arrayList0.addAll(arbg0.c);
                if(arbg0.c.isEmpty()) {
                    gged_interceptors gged0 = gged_interceptors.i(arrayList0);
                    List list0 = new ArrayList();
                    ggqk ggqk0 = gged0.E();
                    while(ggqk0.hasNext()) {
                        Object object0 = ggqk0.next();
                        araz araz0 = (araz)object0;
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asby.a).v_newBuilder();
                        String s = araz0.e;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        s.getClass();
                        ((asby)hftv0).b |= 1;
                        ((asby)hftv0).e = s;
                        long v2 = (long)araz0.f;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp1.b_message;
                        ((asby)hftv1).b |= 2;
                        ((asby)hftv1).f = v2;
                        if(araz0.c == 3) {
                            arbj arbj0 = (arbj)araz0.d;
                            if(!hftv1.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            asby asby0 = (asby)hftp1.b_message;
                            arbj0.getClass();
                            asby0.d = arbj0;
                            asby0.c = 105;
                        }
                        ((ArrayList)list0).add(((asby)hftp1.N_build()));
                    }
                    arps.b.j("Number of items: %d", new Object[]{((ArrayList)list0).size()});
                    return list0;
                }
            }
            arjs.a.m("Messages Custom D2D API getMetadata failed with status: " + iapk0, new Object[0]);
            throw new iapn(iapk0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            arps.b.g("Error during generating metadata.", exception0, new Object[0]);
            return new ArrayList();
        }
    }

    @Override  // arqo
    public final void d(asby asby0, InputStream inputStream0) {
        arps.b.j("Closing stream for: " + asby0.e, new Object[0]);
        bbpb.b(inputStream0);
    }
}

