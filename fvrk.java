import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

final class fvrk implements Runnable {
    final fvrl a;
    private final long b;

    public fvrk(fvrl fvrl0, long v) {
        Objects.requireNonNull(fvrl0);
        this.a = fvrl0;
        super();
        this.b = v;
    }

    @Override
    public final void run() {
        byte[] arr_b;
        FileOutputStream fileOutputStream0;
        Closeable closeable0 = null;
        File file0 = huqs.c() ? new File(ccsb.a.b(this.a.e.a(), "cp_state")) : new File(this.a.e.a(), "cp_state");
        try {
            if(!file0.exists()) {
                file0.createNewFile();
            }
            fileOutputStream0 = new FileOutputStream(file0);
            goto label_8;
        }
        catch(FileNotFoundException throwable0) {
            fvrl.c(closeable0);
            throw throwable0;
            try {
            label_8:
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                fvrl fvrl0 = this.a;
                long v = this.b;
                DataOutputStream dataOutputStream0 = new DataOutputStream(byteArrayOutputStream0);
                dataOutputStream0.writeShort(1);
                synchronized(fvrl0) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwvo.a).v_newBuilder();
                    long v2 = fvrl0.a;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gwvo)hftv0).b |= 1;
                    ((gwvo)hftv0).c = v2;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvo gwvo0 = (gwvo)hftp0.b_message;
                    gwvo0.b |= 2;
                    gwvo0.d = v;
                    gwwd gwwd0 = fvrl0.b.c();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvo gwvo1 = (gwvo)hftp0.b_message;
                    gwwd0.getClass();
                    gwvo1.e = gwwd0;
                    gwvo1.b |= 4;
                    gwwd gwwd1 = fvrl0.c.c();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvo gwvo2 = (gwvo)hftp0.b_message;
                    gwwd1.getClass();
                    gwvo2.f = gwwd1;
                    gwvo2.b |= 16;
                    gwwd gwwd2 = fvrl0.d.c();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gwvo gwvo3 = (gwvo)hftp0.b_message;
                    gwwd2.getClass();
                    gwvo3.g = gwwd2;
                    gwvo3.b |= 0x20;
                    arr_b = ((gwvo)hftp0.N_build()).toBytesArray();
                }
                dataOutputStream0.write(arr_b);
                dataOutputStream0.close();
                byteArrayOutputStream0.close();
                fileOutputStream0.write(byteArrayOutputStream0.toByteArray());
                fileOutputStream0.flush();
                goto label_71;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(SecurityException unused_ex) {
                closeable0 = fileOutputStream0;
                fvrl.c(closeable0);
                return;
            }
            catch(IOException unused_ex) {
                closeable0 = fileOutputStream0;
                fvrl.c(closeable0);
                return;
            }
            catch(Throwable throwable0) {
                closeable0 = fileOutputStream0;
                fvrl.c(closeable0);
                throw throwable0;
            }
            closeable0 = fileOutputStream0;
            fvrl.c(closeable0);
            return;
        }
        catch(SecurityException unused_ex) {
            fvrl.c(closeable0);
            return;
        }
        catch(IOException unused_ex) {
            fvrl.c(closeable0);
            return;
        }
        catch(Throwable unused_ex) {
        }
        fvrl.c(closeable0);
        return;
    label_71:
        fvrl.c(fileOutputStream0);
    }
}

