// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.flags.SomeService in service_kotlin_with_all_flags.proto
@file:Suppress("DEPRECATION")

package com.squareup.wire.protos.kotlin.services.all_flags_on

import com.squareup.wire.Service
import com.squareup.wire.WireRpc
import kotlin.Suppress

public interface SomeServiceSomeMethodSomeSuffix : Service {
  @WireRpc(
    path = "/squareup.protos.kotlin.flags.SomeService/SomeMethod",
    requestAdapter = "com.squareup.wire.protos.kotlin.services.all_flags_on.SomeRequest#ADAPTER",
    responseAdapter = "com.squareup.wire.protos.kotlin.services.all_flags_on.SomeResponse#ADAPTER",
    sourceFile = "service_kotlin_with_all_flags.proto",
  )
  public fun SomeMethod(request: SomeRequest): SomeResponse
}
