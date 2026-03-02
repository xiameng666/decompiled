package com.google.android.gms.home.core.swig;

import ProtoLiteMessage;
import com.google.protos.home.internal.generic_channel.Payload;
import com.google.protos.home.internal.interaction_api.ClientMetadata;
import com.google.protos.home.internal.interaction_api.Request;
import com.google.protos.home.internal.interaction_api.Response;
import hftc;
import hfur;

public class InteractionApiJniJNI {
    static {
        InteractionApiJniJNI.swig_module_init();
    }

    public static final native long CoreBackendJni_CreateCoreSession(long arg0, CoreBackendJni arg1, byte[] arg2) {
    }

    public static final native long CoreBackendJni_SWIGUpcast(long arg0) {
    }

    public static final native void CoreBackendJni_director_connect(CoreBackendJni arg0, long arg1, boolean arg2, boolean arg3) {
    }

    public static final native void InteractionSessionCallbackJni_Call(long arg0, InteractionSessionCallbackJni arg1, byte[] arg2) {
    }

    public static final native long InteractionSessionCallbackJni_SWIGUpcast(long arg0) {
    }

    public static final native void InteractionSessionCallbackJni_director_connect(InteractionSessionCallbackJni arg0, long arg1, boolean arg2, boolean arg3) {
    }

    public static final native void InteractionSessionJni_HandleRequest(long arg0, InteractionSessionJni arg1, byte[] arg2, long arg3, InteractionSessionCallbackJniSwigPtr arg4, long arg5, InteractionSessionCallbackJniSwigPtr arg6) {
    }

    public static final native long InteractionSessionJni_SWIGUpcast(long arg0) {
    }

    public static final native void InteractionSessionJni_director_connect(InteractionSessionJni arg0, long arg1, boolean arg2, boolean arg3) {
    }

    public static final native void RequestChannelCallbackJni_Call(long arg0, RequestChannelCallbackJni arg1, byte[] arg2) {
    }

    public static final native long RequestChannelCallbackJni_SWIGUpcast(long arg0) {
    }

    public static final native void RequestChannelCallbackJni_director_connect(RequestChannelCallbackJni arg0, long arg1, boolean arg2, boolean arg3) {
    }

    public static final native void RequestChannelJni_HandleRequest(long arg0, RequestChannelJni arg1, byte[] arg2, long arg3, RequestChannelCallbackJniSwigPtr arg4, long arg5, RequestChannelCallbackJniSwigPtr arg6) {
    }

    public static final native long RequestChannelJni_SWIGUpcast(long arg0) {
    }

    public static final native void RequestChannelJni_director_connect(RequestChannelJni arg0, long arg1, boolean arg2, boolean arg3) {
    }

    public static final native void SwigApiRefcounted_SwigSetOwnership(long arg0, SwigApiRefcounted arg1, boolean arg2) {
    }

    public static long SwigDirector_CoreBackendJni_CreateCoreSession(CoreBackendJni coreBackendJni0, byte[] arr_b) {
        if(arr_b == null) {
            return coreBackendJni0.CreateCoreSession(null).a;
        }
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ClientMetadata.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return coreBackendJni0.CreateCoreSession(((ClientMetadata)hftv0)).a;
        }
        catch(hfur hfur0) {
            throw new RuntimeException("Unable to parse com.google.protos.home.internal.interaction_api.ClientMetadata protocol message.", hfur0);
        }
    }

    public static void SwigDirector_CoreBackendJni_SwigSetOwnership(CoreBackendJni coreBackendJni0, boolean z) {
        coreBackendJni0.SwigSetOwnership(z);
    }

    public static void SwigDirector_InteractionSessionCallbackJni_Call(InteractionSessionCallbackJni interactionSessionCallbackJni0, byte[] arr_b) {
        Response response0;
        if(arr_b == null) {
            response0 = null;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)Response.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                response0 = (Response)hftv0;
            }
            catch(hfur hfur0) {
                throw new RuntimeException("Unable to parse com.google.protos.home.internal.interaction_api.Response protocol message.", hfur0);
            }
        }
        interactionSessionCallbackJni0.Call(response0);
    }

    public static void SwigDirector_InteractionSessionCallbackJni_SwigSetOwnership(InteractionSessionCallbackJni interactionSessionCallbackJni0, boolean z) {
        interactionSessionCallbackJni0.SwigSetOwnership(z);
    }

    public static void SwigDirector_InteractionSessionJni_HandleRequest(InteractionSessionJni interactionSessionJni0, byte[] arr_b, long v, long v1) {
        Request request0;
        if(arr_b == null) {
            request0 = null;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)Request.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                request0 = (Request)hftv0;
            }
            catch(hfur hfur0) {
                throw new RuntimeException("Unable to parse com.google.protos.home.internal.interaction_api.Request protocol message.", hfur0);
            }
        }
        interactionSessionJni0.HandleRequest(request0, new InteractionSessionCallbackJniSwigPtr(new InteractionSessionCallbackJniSwigPtr(v, false)), new InteractionSessionCallbackJniSwigPtr(new InteractionSessionCallbackJniSwigPtr(v1, false)));
    }

    public static void SwigDirector_InteractionSessionJni_SwigSetOwnership(InteractionSessionJni interactionSessionJni0, boolean z) {
        interactionSessionJni0.SwigSetOwnership(z);
    }

    public static void SwigDirector_RequestChannelCallbackJni_Call(RequestChannelCallbackJni requestChannelCallbackJni0, byte[] arr_b) {
        Payload payload0;
        if(arr_b == null) {
            payload0 = null;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)Payload.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                payload0 = (Payload)hftv0;
            }
            catch(hfur hfur0) {
                throw new RuntimeException("Unable to parse com.google.protos.home.internal.generic_channel.Payload protocol message.", hfur0);
            }
        }
        requestChannelCallbackJni0.Call(payload0);
    }

    public static void SwigDirector_RequestChannelCallbackJni_SwigSetOwnership(RequestChannelCallbackJni requestChannelCallbackJni0, boolean z) {
        requestChannelCallbackJni0.SwigSetOwnership(z);
    }

    public static void SwigDirector_RequestChannelJni_HandleRequest(RequestChannelJni requestChannelJni0, byte[] arr_b, long v, long v1) {
        Payload payload0;
        if(arr_b == null) {
            payload0 = null;
        }
        else {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)Payload.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                payload0 = (Payload)hftv0;
            }
            catch(hfur hfur0) {
                throw new RuntimeException("Unable to parse com.google.protos.home.internal.generic_channel.Payload protocol message.", hfur0);
            }
        }
        requestChannelJni0.HandleRequest(payload0, new RequestChannelCallbackJniSwigPtr(new RequestChannelCallbackJniSwigPtr(v, false)), new RequestChannelCallbackJniSwigPtr(new RequestChannelCallbackJniSwigPtr(v1, false)));
    }

    public static void SwigDirector_RequestChannelJni_SwigSetOwnership(RequestChannelJni requestChannelJni0, boolean z) {
        requestChannelJni0.SwigSetOwnership(z);
    }

    public static final native void delete_CoreBackendJni(long arg0) {
    }

    public static final native void delete_InteractionSessionCallbackJni(long arg0) {
    }

    public static final native void delete_InteractionSessionCallbackJniSwigPtr(long arg0) {
    }

    public static final native void delete_InteractionSessionJni(long arg0) {
    }

    public static final native void delete_InteractionSessionJniSwigPtr(long arg0) {
    }

    public static final native void delete_RequestChannelCallbackJni(long arg0) {
    }

    public static final native void delete_RequestChannelCallbackJniSwigPtr(long arg0) {
    }

    public static final native void delete_RequestChannelJni(long arg0) {
    }

    public static final native void delete_SwigApiRefcounted(long arg0) {
    }

    public static final native long new_CoreBackendJni() {
    }

    public static final native long new_InteractionSessionCallbackJni() {
    }

    public static final native long new_InteractionSessionCallbackJniSwigPtr__SWIG_0() {
    }

    public static final native long new_InteractionSessionCallbackJniSwigPtr__SWIG_2(long arg0, InteractionSessionCallbackJniSwigPtr arg1) {
    }

    public static final native long new_InteractionSessionJni() {
    }

    public static final native long new_InteractionSessionJniSwigPtr__SWIG_0() {
    }

    public static final native long new_RequestChannelCallbackJni() {
    }

    public static final native long new_RequestChannelCallbackJniSwigPtr__SWIG_0() {
    }

    public static final native long new_RequestChannelCallbackJniSwigPtr__SWIG_2(long arg0, RequestChannelCallbackJniSwigPtr arg1) {
    }

    public static final native long new_RequestChannelJni() {
    }

    private static final native void swig_module_init() {
    }
}

