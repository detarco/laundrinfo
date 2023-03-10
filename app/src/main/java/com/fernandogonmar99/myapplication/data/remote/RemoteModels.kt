package com.fernandogonmar99.myapplication.data.remote

import com.fernandogonmar99.myapplication.domain.ItemModel

class RemoteCustomerModel(
    var customer_id: Int = 0,
    var customer_name: String = "",
    var customer_surname: String = "",
    var customer_items: List<RemoteItemModel> = mutableListOf()
)

class RemoteItemModel(
    var item_id: Int = 0,
    var item_name: String = ""
) {
    companion object {
        fun toModel(dbRemoteModel: RemoteItemModel) =
            ItemModel(
                dbRemoteModel.item_id,
                dbRemoteModel.item_name
            )
    }
}