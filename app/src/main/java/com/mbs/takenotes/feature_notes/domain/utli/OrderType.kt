package com.mbs.takenotes.feature_notes.domain.utli

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
