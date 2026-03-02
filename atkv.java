import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import jeb.synthetic.TWR;

public final class atkv extends atke {
    final atju a;
    private atju b;
    private final athv c;
    private boolean d;

    public atkv(atku atku0) {
        atju atju0 = atku0.b;
        gftb.r(((boolean)(atju0.g ^ 1)), "already closed");
        if(!"r".equals(atju0.f)) {
            atju0 = new atju(atju0.a, atju0.b, atju0.c, atju0.d, "r", atju0.e);
        }
        this.a = atju0;
        this.c = atku0.a;
    }

    @Override  // atke
    public final atkq a(int v) {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        return new atkw(this.c(v), this.c);
    }

    @Override  // atke
    public final atkq b() {
        gftb.r(((boolean)(this.d ^ 1)), "already closed");
        return new atks(this.c(1));
    }

    private final atju c(int v) {
        if(v - 1 != 0) {
            if(this.b == null) {
                atju atju0 = this.a;
                if(!atju0.e) {
                    File file0 = atju0.a.getParentFile();
                    File file1 = hrnt.i() ? new File(ccsb.a.b(file0, "sorted_metadata")) : new File(file0, "sorted_metadata");
                    File file2 = atju.a(file1, "all_chunk_hashes");
                    File file3 = atju.a(file1, "chunk_data_presence");
                    atju atju1 = new atju(file2, atju0.b, file3, atju0.d, "rw", true);
                    ArrayList arrayList0 = new ArrayList();
                    atky atky0 = new atky(atju0);
                    try(atkz atkz0 = atky0.b()) {
                        while(true) {
                            if(!atkz0.c()) {
                                break;
                            }
                            arrayList0.add(atkz0.a());
                        }
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(atky0, throwable0);
                        throw throwable0;
                    }
                    atky0.close();
                    Collections.sort(arrayList0);
                    try(atki atki0 = atki.a(atju1)) {
                        Iterator iterator0 = arrayList0.iterator();
                        while(true) {
                            if(!iterator0.hasNext()) {
                                break;
                            }
                            Object object0 = iterator0.next();
                            atki0.b(((atkc)object0));
                        }
                    }
                    atju1.f = "r";
                    atju0 = atju1;
                }
                this.b = atju0;
                return this.b;
            }
            return this.b;
        }
        return this.a;
    }

    @Override
    public final void close() {
        if(this.d) {
            return;
        }
        this.d = true;
        this.a.close();
    }
}

