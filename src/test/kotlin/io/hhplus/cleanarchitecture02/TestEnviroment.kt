package io.hhplus.cleanarchitecture02

import org.mockito.Mockito

fun <T> any(type: Class<T>): T = Mockito.any(type)