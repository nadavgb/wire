// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.DeprecatedEnum in deprecated_enum.proto
@file:Suppress("DEPRECATION")

package com.squareup.wire.protos.kotlin

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Deprecated
import kotlin.Int
import kotlin.Suppress

public enum class DeprecatedEnum(
  override val `value`: Int,
) : WireEnum {
  @Deprecated(message = "DISABLED is deprecated")
  DISABLED(1),
  @Deprecated(message = "ENABLED is deprecated")
  ENABLED(2),
  ON(3),
  OFF(4),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<DeprecatedEnum> = object : EnumAdapter<DeprecatedEnum>(
      DeprecatedEnum::class, 
      PROTO_2, 
      null
    ) {
      override fun fromValue(`value`: Int): DeprecatedEnum? = DeprecatedEnum.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): DeprecatedEnum? = when (value) {
      1 -> @Suppress("DEPRECATION") DISABLED
      2 -> @Suppress("DEPRECATION") ENABLED
      3 -> ON
      4 -> OFF
      else -> null
    }
  }
}
