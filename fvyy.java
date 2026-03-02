import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;

public final class fvyy implements Runnable {
    public final fvzk a;

    public fvyy(fvzk fvzk0) {
        this.a = fvzk0;
    }

    @Override
    public final void run() {
        icvk icvk0;
        fvzk fvzk0 = this.a;
        fvzn fvzn0 = fvzk0.b;
        fvzn0.g();
        if(fvzn0.f != null) {
            fvzn0.e(fvzn.b, fvzn0.e);
            fvzn0.e(fvzn.c, 5);
        }
        if(!fvzn0.h()) {
            return;
        }
        gftb.check(fvzn0.f);
        try {
            LevelDb levelDb0 = fvzn0.f;
            gftb.check(levelDb0);
            byte[] arr_b = levelDb0.get(fvzn.a);
            if(arr_b == null) {
                goto label_30;
            }
            else {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)icvk.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                icvk0 = (icvk)hftv0;
            }
            goto label_31;
        }
        catch(hfur hfur0) {
            ggrv ggrv0 = fvzn0.d;
            if(ggrv0 != null) {
                ggrv0.i().s(hfur0).ar(19105).x("Device bias parsing failed, clearing db.");
            }
            fvzn0.f();
        }
        catch(LevelDbException levelDbException0) {
            ggrv ggrv1 = fvzn0.d;
            if(ggrv1 != null) {
                ggrv1.i().s(levelDbException0).ar(19106).x("Reading device bias failed.");
            }
        }
        icvk0 = null;
        goto label_31;
    label_30:
        icvk0 = null;
    label_31:
        synchronized(fvzk0) {
            fvzk0.a = new fvzh(icvk0, null, null);
        }
        fvzk0.d(fvzk0.b.c());
    }
}

