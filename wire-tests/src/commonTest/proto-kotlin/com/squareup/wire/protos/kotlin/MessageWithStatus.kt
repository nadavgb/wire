// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.MessageWithStatus in same_name_enum.proto
@file:Suppress("DEPRECATION")

package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import okio.ByteString

public class MessageWithStatus(
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<MessageWithStatus, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageWithStatus) return false
    if (unknownFields != other.unknownFields) return false
    return true
  }

  override fun hashCode(): Int = unknownFields.hashCode()

  override fun toString(): String = "MessageWithStatus{}"

  public fun copy(unknownFields: ByteString = this.unknownFields): MessageWithStatus =
      MessageWithStatus(unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<MessageWithStatus> = object : ProtoAdapter<MessageWithStatus>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageWithStatus::class, 
      "type.googleapis.com/squareup.protos.kotlin.MessageWithStatus", 
      PROTO_2, 
      null, 
      "same_name_enum.proto"
    ) {
      override fun encodedSize(`value`: MessageWithStatus): Int {
        var size = value.unknownFields.size
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: MessageWithStatus) {
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: MessageWithStatus) {
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageWithStatus {
        val unknownFields = reader.forEachTag(reader::readUnknownField)
        return MessageWithStatus(
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: MessageWithStatus): MessageWithStatus = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  public enum class Status(
    override val `value`: Int,
  ) : WireEnum {
    A(1),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<Status> = object : EnumAdapter<Status>(
        Status::class, 
        PROTO_2, 
        null
      ) {
        override fun fromValue(`value`: Int): Status? = Status.fromValue(value)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): Status? = when (value) {
        1 -> A
        else -> null
      }
    }
  }
}
