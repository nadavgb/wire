// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.geology.Period in squareup/geology/period.proto
@file:Suppress("DEPRECATION")

package com.squareup.geology

import com.squareup.wire.EnumAdapter
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireEnum
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import kotlin.Int
import kotlin.Suppress

public enum class Period(
  override val `value`: Int,
) : WireEnum {
  /**
   * 145.5 million years ago — 66.0 million years ago.
   */
  CRETACEOUS(1),
  /**
   * 201.3 million years ago — 145.0 million years ago.
   */
  JURASSIC(2),
  /**
   * 252.17 million years ago — 201.3 million years ago.
   */
  TRIASSIC(3),
  ;

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Period> = object : EnumAdapter<Period>(
      Period::class, 
      PROTO_2, 
      null
    ) {
      override fun fromValue(`value`: Int): Period? = Period.fromValue(value)
    }

    @JvmStatic
    public fun fromValue(`value`: Int): Period? = when (value) {
      1 -> CRETACEOUS
      2 -> JURASSIC
      3 -> TRIASSIC
      else -> null
    }
  }
}
