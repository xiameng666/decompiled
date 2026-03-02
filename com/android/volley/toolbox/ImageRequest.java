package com.android.volley.toolbox;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.widget.ImageView.ScaleType;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request.Priority;
import com.android.volley.Request;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

public class ImageRequest extends Request {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object b;
    private final Object c;
    private Response.Listener d;
    private final Bitmap.Config e;
    private final int f;
    private final int g;
    private final ImageView.ScaleType h;

    static {
        ImageRequest.b = new Object();
    }

    @Deprecated
    public ImageRequest(String s, Response.Listener response$Listener0, int v, int v1, Bitmap.Config bitmap$Config0, Response.ErrorListener response$ErrorListener0) {
        this(s, response$Listener0, v, v1, ImageView.ScaleType.CENTER_INSIDE, bitmap$Config0, response$ErrorListener0);
    }

    public ImageRequest(String s, Response.Listener response$Listener0, int v, int v1, ImageView.ScaleType imageView$ScaleType0, Bitmap.Config bitmap$Config0, Response.ErrorListener response$ErrorListener0) {
        super(0, s, response$ErrorListener0);
        this.c = new Object();
        this.setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.d = response$Listener0;
        this.e = bitmap$Config0;
        this.f = v;
        this.g = v1;
        this.h = imageView$ScaleType0;
    }

    @Override  // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized(this.c) {
            this.d = null;
        }
    }

    protected void deliverResponse(Bitmap bitmap0) {
        Response.Listener response$Listener0;
        synchronized(this.c) {
            response$Listener0 = this.d;
        }
        if(response$Listener0 != null) {
            response$Listener0.onResponse(bitmap0);
        }
    }

    @Override  // com.android.volley.Request
    public void deliverResponse(Object object0) {
        this.deliverResponse(((Bitmap)object0));
    }

    private static int f(int v, int v1, int v2, int v3, ImageView.ScaleType imageView$ScaleType0) {
        if(v == 0) {
            if(v1 != 0) {
                v = 0;
                goto label_5;
            }
            return v2;
        }
    label_5:
        if(imageView$ScaleType0 == ImageView.ScaleType.FIT_XY) {
            return v == 0 ? v2 : v;
        }
        if(v == 0) {
            return (int)(((double)v2) * (((double)v1) / ((double)v3)));
        }
        if(v1 != 0) {
            double f = ((double)v3) / ((double)v2);
            double f1 = ((double)v) * f;
            if(imageView$ScaleType0 == ImageView.ScaleType.CENTER_CROP) {
                return f1 < ((double)v1) ? ((int)(((double)v1) / f)) : v;
            }
            return f1 > ((double)v1) ? ((int)(((double)v1) / f)) : v;
        }
        return v;
    }

    @Override  // com.android.volley.Request
    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    @Override  // com.android.volley.Request
    public Response parseNetworkResponse(NetworkResponse networkResponse0) {
        Response response0;
        Bitmap bitmap0;
        synchronized(ImageRequest.b) {
            try {
                byte[] arr_b = networkResponse0.data;
                BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
                int v1 = this.f;
                if(v1 != 0) {
                label_9:
                    bitmapFactory$Options0.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                    int v2 = ImageRequest.f(v1, this.g, bitmapFactory$Options0.outWidth, bitmapFactory$Options0.outHeight, this.h);
                    int v3 = ImageRequest.f(this.g, v1, bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth, this.h);
                    bitmapFactory$Options0.inJustDecodeBounds = false;
                    double f = Math.min(((double)bitmapFactory$Options0.outWidth) / ((double)v2), ((double)bitmapFactory$Options0.outHeight) / ((double)v3));
                    float f1;
                    for(f1 = 1.0f; true; f1 = f2) {
                        float f2 = f1 + f1;
                        if(!(((double)f2) <= f)) {
                            break;
                        }
                    }
                    bitmapFactory$Options0.inSampleSize = (int)f1;
                    bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                    if(bitmap0 != null && (bitmap0.getWidth() > v2 || bitmap0.getHeight() > v3)) {
                        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v2, v3, true);
                        bitmap0.recycle();
                        bitmap0 = bitmap1;
                        return bitmap0 == null ? Response.error(new ParseError(networkResponse0)) : Response.success(bitmap0, HttpHeaderParser.parseCacheHeaders(networkResponse0));
                    }
                }
                else if(this.g != 0) {
                    v1 = 0;
                    goto label_9;
                }
                else {
                    bitmapFactory$Options0.inPreferredConfig = this.e;
                    bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length, bitmapFactory$Options0);
                    return bitmap0 == null ? Response.error(new ParseError(networkResponse0)) : Response.success(bitmap0, HttpHeaderParser.parseCacheHeaders(networkResponse0));
                }
                response0 = bitmap0 == null ? Response.error(new ParseError(networkResponse0)) : Response.success(bitmap0, HttpHeaderParser.parseCacheHeaders(networkResponse0));
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                VolleyLog.e("Caught OOM for %d byte image, url=%s", new Object[]{((int)networkResponse0.data.length), this.getUrl()});
                return Response.error(new ParseError(outOfMemoryError0));
            }
        }
        return response0;
    }
}

