import android.net.Uri;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.PutDataResponse;
import j..util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.FutureTask;

public final class fdgq extends fdfe {
    final PutDataRequest a;

    public fdgq(fdgx fdgx0, aztw aztw0, PutDataRequest putDataRequest0) {
        this.a = putDataRequest0;
        Objects.requireNonNull(fdgx0);
        super(aztw0);
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final azuj g(Status status0) {
        return new fdgu(status0, null);
    }

    @Override  // azvc
    protected final void h(azsr azsr0) {
        ParcelFileDescriptor[] arr_parcelFileDescriptor;
        FileOutputStream fileOutputStream0;
        File file2;
        ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0;
        File file1;
        PutDataRequest putDataRequest0 = this.a;
        fdmm fdmm0 = (fdmm)azsr0;
        for(Object object0: putDataRequest0.c().entrySet()) {
            Asset asset0 = (Asset)((Map.Entry)object0).getValue();
            if(asset0.a == null && asset0.b == null && asset0.c == null && asset0.d == null) {
                throw new IllegalArgumentException("Put for " + putDataRequest0.a + " contains invalid asset: " + asset0);
            }
        }
        PutDataRequest putDataRequest1 = PutDataRequest.b(putDataRequest0.a);
        putDataRequest1.c = putDataRequest0.c;
        if(putDataRequest0.d == 0L) {
            putDataRequest1.e();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: putDataRequest0.c().entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Asset asset1 = (Asset)map$Entry0.getValue();
            byte[] arr_b = asset1.a;
            if(arr_b == null) {
                Uri uri0 = asset1.d;
                File file0 = null;
                if(uri0 == null) {
                    ParcelFileDescriptor parcelFileDescriptor0 = asset1.c;
                    if(parcelFileDescriptor0 == null) {
                        putDataRequest1.d(((String)map$Entry0.getKey()), asset1);
                    }
                    else {
                        try {
                            file1 = (File)fdmm0.h.mr();
                            parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0);
                        }
                        catch(IOException iOException1) {
                            file2 = null;
                            goto label_79;
                        }
                        catch(Throwable throwable0) {
                            goto label_87;
                        }
                        try {
                            file1.mkdirs();
                            file2 = File.createTempFile("asset", ".tmp", file1);
                        }
                        catch(Throwable throwable1) {
                            goto label_65;
                        }
                        try {
                            try {
                                fileOutputStream0 = null;
                                fileOutputStream0 = new FileOutputStream(file2);
                                byte[] arr_b1 = new byte[0x2800];
                                while(true) {
                                    int v = parcelFileDescriptor$AutoCloseInputStream0.read(arr_b1);
                                    if(v < 0) {
                                        goto label_61;
                                    }
                                    fileOutputStream0.write(arr_b1, 0, v);
                                }
                            }
                            catch(IOException iOException2) {
                                throw new RuntimeException(iOException2);
                            }
                        }
                        catch(Throwable throwable2) {
                            try {
                                ffmc.a(parcelFileDescriptor$AutoCloseInputStream0);
                                ffmc.a(fileOutputStream0);
                                file2.delete();
                                throw throwable2;
                            label_61:
                                ffmc.a(parcelFileDescriptor$AutoCloseInputStream0);
                                ffmc.a(fileOutputStream0);
                                goto label_67;
                            }
                            catch(Throwable throwable1) {
                            }
                        }
                        try {
                        label_65:
                            ffmc.a(parcelFileDescriptor$AutoCloseInputStream0);
                            throw throwable1;
                        label_67:
                            ffmc.a(parcelFileDescriptor$AutoCloseInputStream0);
                        }
                        catch(IOException iOException1) {
                            file2 = null;
                            goto label_79;
                        }
                        catch(Throwable throwable0) {
                            goto label_87;
                        }
                        try {
                            Asset asset3 = Asset.a(ParcelFileDescriptor.open(file2, 0x10000000));
                            putDataRequest1.d(((String)map$Entry0.getKey()), asset3);
                            if(file2 == null) {
                                continue;
                            }
                            goto label_90;
                        }
                        catch(IOException iOException1) {
                            try {
                            label_79:
                                Log.w("WearableClient", "DataItem asset copy failed", iOException1);
                                new fdmf(this, arrayList0).P(new PutDataResponse(4005, null));
                                Log.w("WearableClient", "Couldn\'t asset from a file descriptor: " + asset1.c);
                                if(file2 != null) {
                                    goto label_83;
                                }
                                return;
                            }
                            catch(Throwable throwable0) {
                                goto label_86;
                            }
                        label_83:
                            file2.delete();
                            return;
                        }
                        catch(Throwable throwable0) {
                        label_86:
                            file0 = file2;
                        }
                    label_87:
                        if(file0 != null) {
                            file0.delete();
                        }
                        throw throwable0;
                    label_90:
                        file2.delete();
                    }
                    continue;
                }
                else {
                    try {
                        Asset asset2 = Asset.a(fdmm0.r.getContentResolver().openFileDescriptor(uri0, "r"));
                        putDataRequest1.d(((String)map$Entry0.getKey()), asset2);
                        continue;
                    }
                    catch(FileNotFoundException unused_ex) {
                        new fdmf(this, arrayList0).P(new PutDataResponse(4005, null));
                        Log.w("WearableClient", "Couldn\'t resolve asset URI: " + asset1.d);
                        return;
                    }
                }
                break;
            }
            try {
                arr_parcelFileDescriptor = ParcelFileDescriptor.createPipe();
            }
            catch(IOException iOException0) {
                throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + putDataRequest0, iOException0);
            }
            if(Log.isLoggable("WearableClient", 3)) {
                Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + asset1 + " read:" + arr_parcelFileDescriptor[0] + " write:" + arr_parcelFileDescriptor[1]);
            }
            putDataRequest1.d(((String)map$Entry0.getKey()), Asset.a(arr_parcelFileDescriptor[0]));
            FutureTask futureTask0 = new FutureTask(new fdml(fdmm0, arr_parcelFileDescriptor[1], arr_b));
            arrayList0.add(futureTask0);
            fdmm0.a.submit(futureTask0);
        }
        ((fdje)fdmm0.H()).av(new fdmf(this, arrayList0), putDataRequest1);
    }
}

