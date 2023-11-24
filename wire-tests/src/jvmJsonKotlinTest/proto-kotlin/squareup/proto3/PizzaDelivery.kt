// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.PizzaDelivery in pizza.proto
@file:Suppress("DEPRECATION")

package squareup.proto3

import com.squareup.wire.AnyMessage
import com.squareup.wire.Duration
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Instant
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmSynthetic
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.immutableCopyOfStruct
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import okio.ByteString

public class PizzaDelivery(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "phoneNumber",
    schemaIndex = 0,
  )
  @JvmField
  public val phone_number: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  @JvmField
  public val address: String = "",
  pizzas: List<Pizza> = emptyList(),
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.AnyMessage#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  @JvmField
  public val promotion: AnyMessage? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#DURATION",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "deliveredWithinOrFree",
    schemaIndex = 4,
  )
  @JvmField
  public val delivered_within_or_free: Duration? = null,
  loyalty: Map<String, *>? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INSTANT",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "orderedAt",
    schemaIndex = 6,
  )
  @JvmField
  public val ordered_at: Instant? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<PizzaDelivery, PizzaDelivery.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 3,
    adapter = "squareup.proto3.Pizza#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 2,
  )
  @JvmField
  public val pizzas: List<Pizza> = immutableCopyOf("pizzas", pizzas)

  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 5,
  )
  @JvmField
  public val loyalty: Map<String, *>? = immutableCopyOfStruct("loyalty", loyalty)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.phone_number = phone_number
    builder.address = address
    builder.pizzas = pizzas
    builder.promotion = promotion
    builder.delivered_within_or_free = delivered_within_or_free
    builder.loyalty = loyalty
    builder.ordered_at = ordered_at
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is PizzaDelivery) return false
    if (unknownFields != other.unknownFields) return false
    if (phone_number != other.phone_number) return false
    if (address != other.address) return false
    if (pizzas != other.pizzas) return false
    if (promotion != other.promotion) return false
    if (delivered_within_or_free != other.delivered_within_or_free) return false
    if (loyalty != other.loyalty) return false
    if (ordered_at != other.ordered_at) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + phone_number.hashCode()
      result = result * 37 + address.hashCode()
      result = result * 37 + pizzas.hashCode()
      result = result * 37 + (promotion?.hashCode() ?: 0)
      result = result * 37 + (delivered_within_or_free?.hashCode() ?: 0)
      result = result * 37 + (loyalty?.hashCode() ?: 0)
      result = result * 37 + (ordered_at?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """phone_number=${sanitize(phone_number)}"""
    result += """address=${sanitize(address)}"""
    if (pizzas.isNotEmpty()) result += """pizzas=$pizzas"""
    if (promotion != null) result += """promotion=$promotion"""
    if (delivered_within_or_free != null) result +=
        """delivered_within_or_free=$delivered_within_or_free"""
    if (loyalty != null) result += """loyalty=$loyalty"""
    if (ordered_at != null) result += """ordered_at=$ordered_at"""
    return result.joinToString(prefix = "PizzaDelivery{", separator = ", ", postfix = "}")
  }

  public fun copy(
    phone_number: String = this.phone_number,
    address: String = this.address,
    pizzas: List<Pizza> = this.pizzas,
    promotion: AnyMessage? = this.promotion,
    delivered_within_or_free: Duration? = this.delivered_within_or_free,
    loyalty: Map<String, *>? = this.loyalty,
    ordered_at: Instant? = this.ordered_at,
    unknownFields: ByteString = this.unknownFields,
  ): PizzaDelivery = PizzaDelivery(phone_number, address, pizzas, promotion,
      delivered_within_or_free, loyalty, ordered_at, unknownFields)

  public class Builder : Message.Builder<PizzaDelivery, Builder>() {
    @JvmField
    public var phone_number: String = ""

    @JvmField
    public var address: String = ""

    @JvmField
    public var pizzas: List<Pizza> = emptyList()

    @JvmField
    public var promotion: AnyMessage? = null

    @JvmField
    public var delivered_within_or_free: Duration? = null

    @JvmField
    public var loyalty: Map<String, *>? = null

    @JvmField
    public var ordered_at: Instant? = null

    public fun phone_number(phone_number: String): Builder {
      this.phone_number = phone_number
      return this
    }

    public fun address(address: String): Builder {
      this.address = address
      return this
    }

    public fun pizzas(pizzas: List<Pizza>): Builder {
      checkElementsNotNull(pizzas)
      this.pizzas = pizzas
      return this
    }

    public fun promotion(promotion: AnyMessage?): Builder {
      this.promotion = promotion
      return this
    }

    public fun delivered_within_or_free(delivered_within_or_free: Duration?): Builder {
      this.delivered_within_or_free = delivered_within_or_free
      return this
    }

    public fun loyalty(loyalty: Map<String, *>?): Builder {
      this.loyalty = loyalty
      return this
    }

    public fun ordered_at(ordered_at: Instant?): Builder {
      this.ordered_at = ordered_at
      return this
    }

    override fun build(): PizzaDelivery = PizzaDelivery(
      phone_number = phone_number,
      address = address,
      pizzas = pizzas,
      promotion = promotion,
      delivered_within_or_free = delivered_within_or_free,
      loyalty = loyalty,
      ordered_at = ordered_at,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<PizzaDelivery> = object : ProtoAdapter<PizzaDelivery>(
      FieldEncoding.LENGTH_DELIMITED, 
      PizzaDelivery::class, 
      "type.googleapis.com/squareup.proto3.PizzaDelivery", 
      PROTO_3, 
      null, 
      "pizza.proto"
    ) {
      override fun encodedSize(`value`: PizzaDelivery): Int {
        var size = value.unknownFields.size
        if (value.phone_number != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.phone_number)
        if (value.address != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.address)
        size += Pizza.ADAPTER.asRepeated().encodedSizeWithTag(3, value.pizzas)
        if (value.promotion != null) size += AnyMessage.ADAPTER.encodedSizeWithTag(4,
            value.promotion)
        if (value.delivered_within_or_free != null) size +=
            ProtoAdapter.DURATION.encodedSizeWithTag(5, value.delivered_within_or_free)
        if (value.loyalty != null) size += ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(6,
            value.loyalty)
        if (value.ordered_at != null) size += ProtoAdapter.INSTANT.encodedSizeWithTag(7,
            value.ordered_at)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: PizzaDelivery) {
        if (value.phone_number != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.phone_number)
        if (value.address != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.address)
        Pizza.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.pizzas)
        if (value.promotion != null) AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.promotion)
        if (value.delivered_within_or_free != null) ProtoAdapter.DURATION.encodeWithTag(writer, 5,
            value.delivered_within_or_free)
        if (value.loyalty != null) ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, value.loyalty)
        if (value.ordered_at != null) ProtoAdapter.INSTANT.encodeWithTag(writer, 7,
            value.ordered_at)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: PizzaDelivery) {
        writer.writeBytes(value.unknownFields)
        if (value.ordered_at != null) ProtoAdapter.INSTANT.encodeWithTag(writer, 7,
            value.ordered_at)
        if (value.loyalty != null) ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 6, value.loyalty)
        if (value.delivered_within_or_free != null) ProtoAdapter.DURATION.encodeWithTag(writer, 5,
            value.delivered_within_or_free)
        if (value.promotion != null) AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.promotion)
        Pizza.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.pizzas)
        if (value.address != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.address)
        if (value.phone_number != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.phone_number)
      }

      override fun decode(reader: ProtoReader): PizzaDelivery {
        var phone_number: String = ""
        var address: String = ""
        val pizzas = mutableListOf<Pizza>()
        var promotion: AnyMessage? = null
        var delivered_within_or_free: Duration? = null
        var loyalty: Map<String, *>? = null
        var ordered_at: Instant? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> phone_number = ProtoAdapter.STRING.decode(reader)
            2 -> address = ProtoAdapter.STRING.decode(reader)
            3 -> pizzas.add(Pizza.ADAPTER.decode(reader))
            4 -> promotion = AnyMessage.ADAPTER.decode(reader)
            5 -> delivered_within_or_free = ProtoAdapter.DURATION.decode(reader)
            6 -> loyalty = ProtoAdapter.STRUCT_MAP.decode(reader)
            7 -> ordered_at = ProtoAdapter.INSTANT.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return PizzaDelivery(
          phone_number = phone_number,
          address = address,
          pizzas = pizzas,
          promotion = promotion,
          delivered_within_or_free = delivered_within_or_free,
          loyalty = loyalty,
          ordered_at = ordered_at,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: PizzaDelivery): PizzaDelivery = value.copy(
        pizzas = value.pizzas.redactElements(Pizza.ADAPTER),
        promotion = value.promotion?.let(AnyMessage.ADAPTER::redact),
        delivered_within_or_free =
            value.delivered_within_or_free?.let(ProtoAdapter.DURATION::redact),
        loyalty = value.loyalty?.let(ProtoAdapter.STRUCT_MAP::redact),
        ordered_at = value.ordered_at?.let(ProtoAdapter.INSTANT::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): PizzaDelivery = Builder().apply(body).build()
  }
}
