@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package bytes

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface BytesOptions {
    var decimalPlaces: Number? get() = definedExternally; set(value) = definedExternally
    var thousandsSeparator: String? get() = definedExternally; set(value) = definedExternally
    var unitSeparator: String? get() = definedExternally; set(value) = definedExternally
    var fixedDecimals: Boolean? get() = definedExternally; set(value) = definedExternally
    var unit: String? get() = definedExternally; set(value) = definedExternally
}
external interface `T$0` {
    var thousandsSeparator: String
}
external fun bytes(value: Number, options: `T$0`? = definedExternally /* null */): String = definedExternally
external fun bytes(value: String): Number = definedExternally
