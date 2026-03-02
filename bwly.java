import android.util.Log;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

public final class bwly implements Runnable {
    public final bwmx a;

    public bwly(bwmx bwmx0) {
        this.a = bwmx0;
    }

    @Override
    public final void run() {
        bxgp bxgp0;
        bwmx bwmx0 = this.a;
        bwmx0.c.c(2);
        if(bwmx0.F()) {
            NativeIndex nativeIndex0 = bwmx0.m;
            if(nativeIndex0 != null) {
                NativeIndex.nativeOnSleep(nativeIndex0.b);
            }
            bwur bwur0 = bwmx0.e();
            synchronized(bwur0.p()) {
                if(bwur0.g) {
                    bwvn bwvn0 = bwur0.h;
                    Collection collection0 = bwur0.f.values();
                    ArrayList arrayList0 = new ArrayList(collection0.size());
                    for(Object object1: collection0) {
                        bwnr bwnr0 = (bwnr)object1;
                        if(bwnr0 != null) {
                            bwny bwny0 = bwnr0.d;
                            if(bwny0 == null) {
                                bwny0 = bwny.a;
                            }
                            if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwns.a).v_newBuilder();
                                bwnq bwnq0 = bwnr0.c;
                                if(bwnq0 == null) {
                                    bwnq0 = bwnq.a;
                                }
                                int v = bwnq0.c;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                ((bwns)hftv0).b |= 1;
                                ((bwns)hftv0).c = v;
                                bwny bwny1 = bwnr0.d;
                                if(bwny1 == null) {
                                    bwny1 = bwny.a;
                                }
                                hfuo hfuo0 = bwny1.c;
                                if(!hftv0.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                bwns bwns0 = (bwns)hftp0.b_message;
                                hfuo hfuo1 = bwns0.e;
                                if(!hfuo1.c()) {
                                    bwns0.e = ProtoLiteMessage.E(hfuo1);
                                }
                                hfrj.E(hfuo0, bwns0.e);
                                bwny bwny2 = bwnr0.d;
                                if(bwny2 == null) {
                                    bwny2 = bwny.a;
                                }
                                int v1 = bwny2.f;
                                if(!hftp0.b_message.isImmutable()) {
                                    hftp0.ensureMutable();
                                }
                                bwns bwns1 = (bwns)hftp0.b_message;
                                bwns1.b |= 2;
                                bwns1.d = v1;
                                arrayList0.add(((bwns)hftp0.N_build()));
                            }
                        }
                    }
                    bxgp0 = bwvn0.b;
                    ByteBuffer byteBuffer0 = bbqf.b(arrayList0, true);
                    if(byteBuffer0 != null) {
                        if(byteBuffer0.limit() != 0 && byteBuffer0.remaining() != 0) {
                            if(Log.isLoggable("Icing", 2)) {
                                bwne.r("Writing out (up to) %s for file %s", bwwh.f(byteBuffer0.remaining()), bxgp0.c);
                            }
                            else {
                                bwne.b("Writing out file %s", bxgp0.c);
                            }
                            goto label_70;
                        }
                        else if(bxgp0.b()) {
                            String s = bxgp0.c;
                            bwne.b("Asked to write no data, deleting file %s", s);
                            if(bxgp0.d.delete()) {
                                goto label_99;
                            }
                            else {
                                bwne.g("Failed to delete file %s", s);
                            }
                        }
                        else {
                            bwne.p("Skipping write out of would be empty file %s", bxgp0.c);
                            goto label_99;
                        }
                    }
                }
                goto label_104;
            }
        label_70:
            FileOutputStream fileOutputStream0 = null;
            try {
                try {
                    fileOutputStream0 = new FileOutputStream(bxgp0.d);
                    if(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream0.getChannel()).write(byteBuffer0) == 0) {
                        bwne.t("No bytes actually written out for file %s", bxgp0.c);
                        goto label_90;
                    }
                    else {
                        goto label_95;
                    }
                    goto label_104;
                }
                catch(IOException iOException0) {
                }
                bwne.j(iOException0, "Error while writing to %s", new Object[]{bxgp0.c});
            }
            catch(Throwable throwable1) {
                goto label_84;
            }
            if(fileOutputStream0 != null) {
                try {
                    fileOutputStream0.close();
                }
                catch(IOException iOException1) {
                    bwne.j(iOException1, "Error while closing stream to %s", new Object[]{bxgp0.c});
                }
                goto label_104;
            label_84:
                if(fileOutputStream0 != null) {
                    try {
                        fileOutputStream0.close();
                    }
                    catch(IOException iOException2) {
                        bwne.j(iOException2, "Error while closing stream to %s", new Object[]{bxgp0.c});
                    }
                }
                throw throwable1;
                try {
                label_90:
                    fileOutputStream0.close();
                }
                catch(IOException iOException3) {
                    bwne.j(iOException3, "Error while closing stream to %s", new Object[]{bxgp0.c});
                }
                goto label_104;
                try {
                label_95:
                    fileOutputStream0.close();
                }
                catch(IOException iOException4) {
                    bwne.j(iOException4, "Error while closing stream to %s", new Object[]{bxgp0.c});
                }
            label_99:
                bwur0.g = false;
            }
        label_104:
            bxgu bxgu0 = bwmx0.j;
            if(bxgu0 != null) {
                bxgu0.d();
            }
        }
    }
}

