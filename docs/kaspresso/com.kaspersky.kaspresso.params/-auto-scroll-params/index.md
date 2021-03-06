[kaspresso](../../index.md) / [com.kaspersky.kaspresso.params](../index.md) / [AutoScrollParams](./index.md)

# AutoScrollParams

`class AutoScrollParams`

The class that holds all the necessary for [com.kaspersky.kaspresso.autoscroll.AutoScrollProviderImpl](../../com.kaspersky.kaspresso.autoscroll/-auto-scroll-provider-impl/index.md) and
[com.kaspersky.kaspresso.autoscroll.WebAutoScrollProviderImpl](../../com.kaspersky.kaspresso.autoscroll/-web-auto-scroll-provider-impl/index.md) parameters.

### Properties

| Name | Summary |
|---|---|
| [allowedExceptions](allowed-exceptions.md) | The set of exceptions, if caught, the [com.kaspersky.kaspresso.autoscroll.AutoScrollProviderImpl](../../com.kaspersky.kaspresso.autoscroll/-auto-scroll-provider-impl/index.md) or [com.kaspersky.kaspresso.autoscroll.WebAutoScrollProviderImpl](../../com.kaspersky.kaspresso.autoscroll/-web-auto-scroll-provider-impl/index.md) will autoscroll.`val allowedExceptions: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Class`](https://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<out `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>>` |

### Companion Object Functions

| Name | Summary |
|---|---|
| [default](default.md) | `fun default(): `[`AutoScrollParams`](./index.md) |
