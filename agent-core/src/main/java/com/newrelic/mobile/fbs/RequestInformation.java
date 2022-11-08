// automatically generated by the FlatBuffers compiler, do not modify

package com.newrelic.mobile.fbs;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class RequestInformation extends Table {
  public static RequestInformation getRootAsRequestInformation(ByteBuffer _bb) { return getRootAsRequestInformation(_bb, new RequestInformation()); }
  public static RequestInformation getRootAsRequestInformation(ByteBuffer _bb, RequestInformation obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public RequestInformation __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long requestTimestampMs() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateRequestTimestampMs(long requestTimestampMs) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, requestTimestampMs); return true; } else { return false; } }
  public long requestAddress() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0L; }
  public boolean mutateRequestAddress(long requestAddress) { int o = __offset(6); if (o != 0) { bb.putInt(o + bb_pos, (int)requestAddress); return true; } else { return false; } }

  public static int createRequestInformation(FlatBufferBuilder builder,
      long requestTimestampMs,
      long requestAddress) {
    builder.startObject(2);
    RequestInformation.addRequestTimestampMs(builder, requestTimestampMs);
    RequestInformation.addRequestAddress(builder, requestAddress);
    return RequestInformation.endRequestInformation(builder);
  }

  public static void startRequestInformation(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addRequestTimestampMs(FlatBufferBuilder builder, long requestTimestampMs) { builder.addLong(0, requestTimestampMs, 0L); }
  public static void addRequestAddress(FlatBufferBuilder builder, long requestAddress) { builder.addInt(1, (int)requestAddress, (int)0L); }
  public static int endRequestInformation(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
