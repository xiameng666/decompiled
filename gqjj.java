import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import jeb.synthetic.FIN;

public final class gqjj {
    private final gqij a;
    private final gqjp b;
    private final Set c;

    public gqjj(gqij gqij0, gqjp gqjp0) {
        this.a = gqij0;
        this.b = gqjp0;
        this.c = ggog.l();
    }

    public final gqjp a(String s) {
        if(!this.c.contains(s)) {
            this.b(s);
        }
        return this.b;
    }

    private final void b(String s) {
        hfuo hfuo0;
        int v1;
        List list0;
        InputStream inputStream0;
        synchronized(this) {
            if(!this.c.contains(s)) {
                try {
                    try {
                        inputStream0 = ((gqjg)this.a).b.open(s, 3);
                    }
                    catch(FileNotFoundException unused_ex) {
                        gqjg.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.AndroidAssetMetadataLoader", "loadMetadata", String.format("File %s not found", s));
                        inputStream0 = null;
                    }
                    catch(IOException iOException0) {
                        throw new gqjh(String.format("Error while opening %s: ", s), iOException0);
                    }
                    if(inputStream0 == null) {
                        list0 = Collections.EMPTY_LIST;
                    }
                    else {
                        try {
                            v1 = FIN.finallyOpen$NT();
                            hftc hftc0 = hftc.a();
                            hfsl hfsl0 = hfsl.N(inputStream0);
                            ProtoLiteMessage hftv0 = ((ProtoLiteMessage)gqis.a).x_newMutableInstance();
                            try {
                                hfwc hfwc0 = hfvu.a.c(hftv0);
                                hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                                hfwc0.g(hftv0);
                            }
                            catch(hfur hfur0) {
                                if(hfur0.b) {
                                    hfur0 = new hfur(hfur0);
                                }
                                hfur0.a = hftv0;
                                throw hfur0;
                            }
                            catch(hfwr hfwr0) {
                                hfur hfur1 = hfwr0.a();
                                hfur1.a = hftv0;
                                throw hfur1;
                            }
                            catch(IOException iOException2) {
                                if((iOException2.getCause() instanceof hfur)) {
                                    throw (hfur)iOException2.getCause();
                                }
                                hfur hfur2 = new hfur(iOException2);
                                hfur2.a = hftv0;
                                throw hfur2;
                            }
                            catch(RuntimeException runtimeException0) {
                                if((runtimeException0.getCause() instanceof hfur)) {
                                    throw (hfur)runtimeException0.getCause();
                                }
                                throw runtimeException0;
                            }
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            hfuo0 = ((gqis)hftv0).b;
                            gftb.b(((boolean)(hfuo0.isEmpty() ^ 1)), "Empty metadata");
                        }
                        catch(IOException iOException1) {
                            throw new IllegalStateException("Unable to parse metadata file", iOException1);
                        }
                        try {
                            FIN.finallyCodeBegin$NT(v1);
                            inputStream0.close();
                        }
                        catch(IOException iOException3) {
                            gqji.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.metadata.init.MetadataParser", "parse", "Error closing input stream (ignored)", iOException3);
                        }
                        goto label_54;
                    }
                    goto label_56;
                }
                catch(IllegalArgumentException | IllegalStateException exception0) {
                    throw new IllegalStateException("Failed to read file " + s, exception0);
                }
            label_54:
                FIN.finallyCodeEnd$NT(v1);
                list0 = hfuo0;
            label_56:
                for(Object object0: list0) {
                    this.b.a(((gqir)object0));
                }
                this.c.add(s);
            }
        }
    }
}

